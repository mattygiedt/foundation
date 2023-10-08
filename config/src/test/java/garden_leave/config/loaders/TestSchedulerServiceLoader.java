package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.scheduler.SchedulerServiceLoader;
import garden_leave.config.proto.SchedulerService;
import org.junit.Test;

public class TestSchedulerServiceLoader {
  public static final String CONFIG_KEY = "dev.scheduler";

  @Test
  public void testSchedulerServiceLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    SchedulerServiceLoader loader = new SchedulerServiceLoader();
    manager.addConfigFromResource(loader, "TestSchedulerServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 1);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    SchedulerService.Instance instance =
        manager.getConfig(CONFIG_KEY, SchedulerService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
  }
}
