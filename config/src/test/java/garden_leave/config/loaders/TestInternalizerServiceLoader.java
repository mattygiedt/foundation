package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.internalizer.InternalizerServiceLoader;
import garden_leave.config.proto.InternalizerService;
import org.junit.Test;

public class TestInternalizerServiceLoader {
  public static final String CONFIG_KEY = "dev.internalizer.lob.v1";

  @Test
  public void testLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    InternalizerServiceLoader loader = new InternalizerServiceLoader();
    manager.addConfigFromResource(loader, "TestInternalizerServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 1);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    InternalizerService.Instance instance =
        manager.getConfig(CONFIG_KEY, InternalizerService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
    assertTrue(instance.getPort() == 9999);
  }
}
