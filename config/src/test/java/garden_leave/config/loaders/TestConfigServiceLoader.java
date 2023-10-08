package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.config.ConfigServiceLoader;
import garden_leave.config.proto.ConfigService;
import garden_leave.config.proto.ServiceConfiguration;
import org.junit.Test;

public class TestConfigServiceLoader {
  public static final String CONFIG_KEY = "dev.config";

  @Test
  public void testConfigLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    ConfigServiceLoader loader = new ConfigServiceLoader();
    manager.addConfigFromResource(loader, "TestConfigServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 1);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    ConfigService.Instance instance = manager.getConfig(CONFIG_KEY, ConfigService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
    assertTrue(instance.getServiceConfigCount() == 5);
    assertTrue(instance.getPort() == 8080);

    for (final ServiceConfiguration config : instance.getServiceConfigList()) {
      loader.loadConfig(manager, config);
    }

    assertTrue(manager.hasConfig(TestMarketDataServiceLoader.CONFIG_KEY));
    assertTrue(manager.hasConfig(TestWebappServiceLoader.CONFIG_KEY));
    assertTrue(manager.hasConfig(TestSchedulerServiceLoader.CONFIG_KEY));
    assertTrue(manager.hasConfig(TestGatewayServiceLoader.CONFIG_KEY));
    assertTrue(manager.hasConfig(TestInternalizerServiceLoader.CONFIG_KEY));
  }
}
