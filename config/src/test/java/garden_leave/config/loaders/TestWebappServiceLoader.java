package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.webapp.WebappServiceLoader;
import garden_leave.config.proto.WebappService;
import org.junit.Test;

public class TestWebappServiceLoader {
  public static final String CONFIG_KEY = "dev.webapp.tape.v1";

  @Test
  public void testWebappLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    WebappServiceLoader loader = new WebappServiceLoader();
    manager.addConfigFromResource(loader, "TestWebappServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 1);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    WebappService.Instance instance = manager.getConfig(CONFIG_KEY, WebappService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
    assertTrue(instance.getPort() == 9098);
    assertTrue(instance.getStaticFilePath().equals("/public/tape"));
    assertTrue(instance.getEndpointClass().equals("garden_leave.webapp.tape.TapeEndpoint"));
  }
}
