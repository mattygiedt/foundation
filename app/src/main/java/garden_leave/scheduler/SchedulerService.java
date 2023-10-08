package garden_leave.scheduler;

import garden_leave.config.proto.ScheduledTask;
import garden_leave.config.proto.SchedulerService.Instance;
import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchedulerService extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(SchedulerService.class);

  private final TaskScheduler scheduler = new TaskScheduler();

  private SchedulerService() {}

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {
    if (!config.get().getConfig().is(Instance.class)) {
      throw new Exception("Configuration error: unknown config instance type");
    }

    final Instance instance = config.get().getConfig().unpack(Instance.class);
    configureLogback(instance.getService().getLogback());

    logger.info("instance.service.name: {}", instance.getService().getName());

    for (final ScheduledTask task : instance.getTaskList()) {
      scheduler.schedule(task);
    }
  }

  @Override
  protected void start() throws Exception {}

  @Override
  protected void shutdown() {
    logger.warn("SchedulerService::shutdown ...");
    scheduler.shutdown();
  }

  public static void main(final String[] args) {
    BaseService.runService(new SchedulerService());
  }
}
