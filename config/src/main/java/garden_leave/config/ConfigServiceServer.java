package garden_leave.config;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import garden_leave.config.loaders.config.ConfigServiceLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.ConfigService;
import garden_leave.config.proto.ServiceConfiguration;
import garden_leave.grpc.ConfigRequest;
import garden_leave.grpc.ConfigResponse;
import garden_leave.grpc.ConfigServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigServiceServer extends ConfigServiceGrpc.ConfigServiceImplBase {
  private static final Logger logger = LoggerFactory.getLogger(ConfigServiceServer.class);

  private int port;
  private Server server;

  private final ConfigManager configManager;
  private final Function<ConfigKey, String> getConfigKeyString = ConfigManager::getConfigKeyString;

  public ConfigServiceServer() {
    configManager = new ConfigManager();
  }

  // public void configure(final String serviceKey) throws Exception {
  //   logger.info("ConfigServiceServer configure service: {}", serviceKey);
  //
  //   final ConfigServiceLoader loader = new ConfigServiceLoader();
  //
  //   configManager.addConfig(loader);
  //
  //   final ConfigService.Instance instance =
  //       configManager.getConfig(serviceKey, ConfigService.Instance.class);
  //
  //   for (final ServiceConfiguration serviceConfiguration : instance.getServiceConfigList()) {
  //     loader.loadConfig(configManager, serviceConfiguration);
  //   }
  //
  //   port = instance.getPort();
  // }

  public void configure(final ConfigService.Instance instance) throws Exception {
    final ConfigServiceLoader loader = new ConfigServiceLoader();
    configManager.addConfig(loader);

    for (final ServiceConfiguration serviceConfiguration : instance.getServiceConfigList()) {
      loader.loadConfig(configManager, serviceConfiguration);
    }

    port = instance.getPort();
  }

  public void start() throws IOException {
    logger.info("ConfigServiceServer starting on grpc_port: {}", port);
    server = ServerBuilder.forPort(port).addService(this).build();
    server.start();
  }

  public void shutdown() {
    logger.warn("ConfigServiceServer::shutdown ...");
    try {
      server.shutdown().awaitTermination(1, TimeUnit.SECONDS);
    } catch (final InterruptedException ex) {
      logger.error("ConfigServiceServer::shutdown", ex);
    }
  }

  protected ConfigResponse getConfigResponse(final ConfigKey configKey) {
    return configManager.getConfigResponse(configKey);
  }

  @Override
  public void getConfig(
      final ConfigRequest request, final StreamObserver<ConfigResponse> responseObserver) {
    logger.info("ConfigServiceServer::getConfig for key: {}",
        getConfigKeyString.apply(request.getConfigKey()));

    responseObserver.onNext(getConfigResponse(request.getConfigKey()));
    responseObserver.onCompleted();
  }

  @Override
  public void listConfig(
      final ConfigRequest request, final StreamObserver<ConfigResponse> responseObserver) {
    final String searchKey = getConfigKeyString.apply(request.getConfigKey());
    logger.info("ConfigServiceServer::listConfig for search key: {}", searchKey);

    for (final Map.Entry<ConfigKey, Message> entry : configManager.getConfigMap().entrySet()) {
      if (getConfigKeyString.apply(entry.getKey()).startsWith(searchKey, 0)) {
        final ConfigResponse response = ConfigResponse.newBuilder()
                                            .setConfigKey(entry.getKey())
                                            .setConfig(Any.pack(entry.getValue()))
                                            .build();
        responseObserver.onNext(response);
      }
    }

    responseObserver.onCompleted();
  }
}
