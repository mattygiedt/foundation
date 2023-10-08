package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.gateway.GatewayServiceLoader;
import garden_leave.config.proto.GatewayService;
import org.junit.Test;

public class TestGatewayServiceLoader {
  public static final String CONFIG_KEY = "dev.gateway.client.gateway";

  @Test
  public void testGatewayClientLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    GatewayServiceLoader loader = new GatewayServiceLoader();
    manager.addConfigFromResource(loader, "TestGatewayServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 2);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    GatewayService.Instance instance = manager.getConfig(CONFIG_KEY, GatewayService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
    assertTrue(instance.getSessionSettingsFilePath().equals("gateway.properties"));
    assertTrue(instance.getDataDictionaryFilePath().equals("FIX42.xml"));
  }
}
