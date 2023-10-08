package garden_leave.service;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import garden_leave.config.ConfigServiceClient;
import garden_leave.grpc.ConfigResponse;
import garden_leave.utils.Telemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import org.slf4j.LoggerFactory;

public abstract class BaseService {
  private static final Tracer tracer = Telemetry.getInstance().getTracer(BaseService.class);

  private static final CountDownLatch shutdownLatch = new CountDownLatch(1);
  protected final ConfigServiceClient configServiceClient = new ConfigServiceClient();

  protected abstract void configure(final Optional<ConfigResponse> config) throws Exception;
  protected abstract void start() throws Exception;
  protected abstract void shutdown();

  protected void configureService() throws Exception {
    final Span span = Telemetry.startSpan(tracer);

    try (Scope ignored = span.makeCurrent()) {
      Optional<ConfigResponse> config = Optional.empty();

      final String serviceKey = System.getProperty("SERVICE_KEY");

      if (serviceKey == null) {
        throw new Exception(
            "FATAL: System.getProperty(\"SERVICE_KEY\") is null: use -DCONFIG_SVC=<service config key>");
      }

      String configService = System.getProperty("CONFIG_SVC");

      if (configService == null) {
        System.out.println("WARNING: System.getProperty(\"CONFIG_SVC\") is null: "
            + "use -DCONFIG_SVC=HOST:PORT or -DCONFIG_SVC=LOCAL");
        System.out.println("WARNING: setting CONFIG_SVC=LOCAL");
        configService = "LOCAL";
      }

      System.out.println("configureService::SERVICE_KEY: " + serviceKey);
      System.out.println("configureService::CONFIG_SVC: " + configService);

      configServiceClient.initialize(configService);
      config = configServiceClient.getConfig(serviceKey);

      if (config.isEmpty()) {
        throw new Exception("Configuration error for service key: " + serviceKey);
      }

      if (config.get().getConfig().is(com.google.protobuf.Empty.class)) {
        throw new Exception("Unknown or invalid service key: " + serviceKey);
      }

      this.configure(config);
    } finally {
      span.end();
    }
  }

  protected void startService() throws Exception {
    final Span span = Telemetry.startSpan(tracer);
    try (Scope ignored = span.makeCurrent()) {
      this.start();
    } finally {
      span.end();
    }
  }

  protected void awaitShutdown() throws Exception {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      final Span span = Telemetry.startSpan(tracer);
      try (Scope ignored = span.makeCurrent()) {
        this.shutdown();
        shutdownLatch.countDown();
      } finally {
        span.end();
      }
    }));

    shutdownLatch.await();

    final LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
    context.stop();
  }

  protected void configureLogback(final garden_leave.config.proto.Logback config) throws Exception {
    final Span span = Telemetry.startSpan(tracer);
    try (Scope ignored = span.makeCurrent()) {
      final LogType logType = LogType.valueOf(config.getLogType());
      final Level logLevel = Level.valueOf(config.getLogLevel());

      System.out.println("BaseService::configureLogback logType: " + logType.name()
          + ", logLevel: " + logLevel.toString());

      Logback.configureLogback(logType, logLevel, config.getLogDir(), config.getLogFile());
    } finally {
      span.end();
    }
  }

  protected static void bootstrapLogback() throws Exception {
    final Span span = Telemetry.startSpan(tracer);
    try (Scope ignored = span.makeCurrent()) {
      final LogType logType = LogType.valueOf(System.getProperty("LOG_TYPE", "STDOUT"));
      final Level logLevel = Level.valueOf(System.getProperty("LOG_LEVEL", "INFO"));

      System.out.println("BaseService::bootstrapLogback logType: " + logType.name()
          + ", logLevel: " + logLevel.toString());

      Logback.configureLogback(
          logType, logLevel, System.getProperty("LOG_DIR"), System.getProperty("LOG_FILE"));
    } finally {
      span.end();
    }
  }

  public void waitForShutdown() throws Exception {
    shutdownLatch.await();
  }

  public static void runService(final BaseService service) {
    try {
      bootstrapLogback();
      service.configureService();
      service.startService();
      service.awaitShutdown();
    } catch (final Throwable t) {
      t.printStackTrace();
    }
  }
}
