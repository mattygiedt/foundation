package garden_leave.app;

import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  private App() {}

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {}

  @Override
  protected void start() throws Exception {}

  @Override
  protected void shutdown() {
    logger.warn("App::shutdown ...");
  }

  public static void main(final String[] args) {
    BaseService.runService(new App());
  }
}
