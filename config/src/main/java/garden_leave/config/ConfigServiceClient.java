package garden_leave.config;

import garden_leave.config.loaders.config.ConfigServiceLoader;
import garden_leave.config.proto.ConfigService;
import garden_leave.config.proto.ServiceConfiguration;
import garden_leave.grpc.ConfigRequest;
import garden_leave.grpc.ConfigResponse;
import garden_leave.grpc.ConfigServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigServiceClient {
  private static final Logger logger = LoggerFactory.getLogger(ConfigServiceClient.class);

  class ConfigResponseCallback implements StreamObserver<ConfigResponse> {
    private final CountDownLatch latch = new CountDownLatch(1);
    private final List<ConfigResponse> responseList = new ArrayList<>();

    public List<ConfigResponse> getConfigResponseList() {
      try {
        if (!latch.await(5, TimeUnit.SECONDS)) {
          logger.warn("ConfigResponseCallback::getConfigResponseList timeout");
        }
      } catch (final InterruptedException ignore) {
      }

      return responseList;
    }

    @Override
    public void onNext(final ConfigResponse response) {
      responseList.add(response);
    }

    @Override
    public void onCompleted() {
      latch.countDown();
    }

    @Override
    public void onError(final Throwable t) {
      logger.error("ConfigResponseCallback error: {}", Status.fromThrowable(t));
      latch.countDown();
    }
  }

  private boolean initialized = false;
  private ManagedChannel channel = null;

  public void initialize(final String target) throws Exception {
    logger.info("ConfigServiceClient::initialize target: {}", target);

    shutdown();

    if (!"LOCAL".equals(target)) {
      channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
    }

    this.initialized = true;
  }

  public Optional<ConfigResponse> getConfig(final String configKey) {
    if (!initialized) {
      logger.warn("config client has not been intitialized for service: {}", configKey);
      return Optional.empty();
    }

    if (channel == null) {
      return getLocalConfig(configKey);
    } else {
      return getRemoteConfig(configKey);
    }
  }

  private Optional<ConfigResponse> getLocalConfig(final String configKey) {
    ConfigResponse response = null;
    try {
      ConfigManager manager = new ConfigManager();
      ConfigServiceLoader loader = new ConfigServiceLoader();
      manager.addConfig(loader);

      if (manager.hasConfig(configKey)) {
        response = manager.getConfigResponse(configKey);
      } else {
        ConfigService.Instance instance =
            manager.getConfig("local.config", ConfigService.Instance.class);

        for (final ServiceConfiguration config : instance.getServiceConfigList()) {
          loader.loadConfig(manager, config);
        }

        if (!manager.hasConfig(configKey)) {
          throw new Exception("unknown configuration for key " + configKey);
        }

        response = manager.getConfigResponse(configKey);
      }
    } catch (Throwable t) {
      logger.error("getLocalConfig error for key: " + configKey, t);
    }

    return Optional.of(response);
  }

  private Optional<ConfigResponse> getRemoteConfig(final String configKey) {
    final ConfigRequest request = getConfigRequest(configKey);
    final ConfigServiceGrpc.ConfigServiceStub stub = ConfigServiceGrpc.newStub(channel);
    final ConfigResponseCallback callback = new ConfigResponseCallback();
    stub.getConfig(request, callback);

    final List<ConfigResponse> responseList = callback.getConfigResponseList();

    if (responseList.size() == 0) {
      logger.warn("ConfigServiceClient::getConfig responseList.size() == 0 for key: {}", configKey);
      return Optional.empty();
    }

    return Optional.of(responseList.get(0));
  }

  public List<ConfigResponse> listConfig(final String configKey) {
    if (!initialized) {
      return Collections.emptyList();
    }

    final ConfigRequest request = getConfigRequest(configKey);
    final ConfigServiceGrpc.ConfigServiceStub stub = ConfigServiceGrpc.newStub(channel);
    final ConfigResponseCallback callback = new ConfigResponseCallback();
    stub.getConfig(request, callback);

    return callback.getConfigResponseList();
  }

  private ConfigRequest getConfigRequest(final String key) {
    logger.info("ConfigServiceClient::getConfigRequest: {}", key);
    return ConfigRequest.newBuilder().setConfigKey(ConfigManager.getConfigKey(key)).build();
  }

  public void shutdown() throws InterruptedException {
    if (!initialized) {
      return;
    }

    channel.shutdownNow().awaitTermination(100, TimeUnit.MILLISECONDS);
  }
}
