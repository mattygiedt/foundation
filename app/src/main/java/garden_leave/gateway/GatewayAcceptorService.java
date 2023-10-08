package garden_leave.gateway;

import garden_leave.config.proto.GatewayService.Instance;
import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayAcceptorService extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(GatewayAcceptorService.class);

  private final GatewayAcceptor acceptor;

  protected GatewayAcceptorService(final GatewayAcceptor acceptor) {
    this.acceptor = acceptor;
  }

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {
    if (!config.get().getConfig().is(Instance.class)) {
      throw new Exception("Configuration error: unknown config instance type");
    }

    final Instance instance = config.get().getConfig().unpack(Instance.class);
    configureLogback(instance.getService().getLogback());

    logger.info("instance.service.name: {}", instance.getService().getName());

    acceptor.createFixAcceptor(acceptor.sessionSettings(instance.getSessionSettingsFilePath()));
    acceptor.registerMessageHandlers();
  }

  @Override
  protected void start() throws Exception {
    logger.info("GatewayAcceptor::start ...");
    acceptor.start();
  }

  @Override
  protected void shutdown() {
    logger.warn("GatewayAcceptor::shutdown ...");
    acceptor.shutdown();
  }
}
