package garden_leave.internalizer;

import garden_leave.config.proto.InternalizerService.Instance;
import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalizerService extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(InternalizerService.class);

  private InternalizerServiceServer server;
  private InternalizerService() {}

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {
    if (!config.get().getConfig().is(Instance.class)) {
      throw new Exception("Configuration error: unknown config instance type");
    }

    final Instance instance = config.get().getConfig().unpack(Instance.class);
    configureLogback(instance.getService().getLogback());

    logger.info("instance.service.name: {}", instance.getService().getName());

    server = new InternalizerServiceServer();
    server.configure(instance);
  }

  @Override
  protected void start() throws Exception {
    server.start();
  }

  @Override
  protected void shutdown() {
    logger.warn("InternalizerService::shutdown ...");
    server.shutdown();
  }

  public static void main(final String[] args) {
    BaseService.runService(new InternalizerService());
  }
}
