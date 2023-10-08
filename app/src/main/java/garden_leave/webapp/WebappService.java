package garden_leave.webapp;

import garden_leave.config.proto.WebappService.Instance;
import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebappService extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(WebappService.class);

  private SparkEndpoint endpoint = null;

  private WebappService() {}

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {
    if (!config.get().getConfig().is(Instance.class)) {
      throw new Exception("Configuration error: unknown config instance type");
    }

    final Instance instance = config.get().getConfig().unpack(Instance.class);
    configureLogback(instance.getService().getLogback());

    logger.info("instance.service.name: {}", instance.getService().getName());
    logger.info("instance.port: {}", instance.getPort());
    logger.info("instance.static_file_path: {}", instance.getStaticFilePath());
    logger.info("instance.endpoint_class: {}", instance.getEndpointClass());

    endpoint = (SparkEndpoint) Class.forName(instance.getEndpointClass())
                   .getConstructor(Integer.class, String.class)
                   .newInstance(instance.getPort(), instance.getStaticFilePath());
  }

  @Override
  protected void start() throws Exception {
    endpoint.configure();
    endpoint.setEndpoints();
  }

  @Override
  protected void shutdown() {
    logger.warn("WebappService::shutdown ...");
  }

  public static void main(final String[] args) {
    BaseService.runService(new WebappService());
  }
}
