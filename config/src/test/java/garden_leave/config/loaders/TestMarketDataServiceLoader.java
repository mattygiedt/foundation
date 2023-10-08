package garden_leave.config.loaders;

import static org.junit.Assert.*;

import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.marketdata.MarketDataServiceLoader;
import garden_leave.config.proto.MarketDataService;
import java.net.InetSocketAddress;
import java.util.Map;
import org.junit.Test;

public class TestMarketDataServiceLoader {
  public static final String CONFIG_KEY = "dev.marketdata.publisher.v1";

  @Test
  public void testMarketDataLoader() throws Exception {
    ConfigManager manager = new ConfigManager();
    MarketDataServiceLoader loader = new MarketDataServiceLoader();
    manager.addConfigFromResource(loader, "TestMarketDataServiceLoader.txt");

    assertTrue(manager.getConfigMap().size() == 1);
    assertTrue(manager.hasConfig(CONFIG_KEY));

    MarketDataService.Instance instance =
        manager.getConfig(CONFIG_KEY, MarketDataService.Instance.class);

    assertTrue(instance.getService().getName().equals(CONFIG_KEY));
    assertTrue(instance.getReceiver().getNetworkInterface().equals("eth0"));
    assertTrue(instance.getPublisher().getNetworkInterface().equals("eth0"));

    Map<String, InetSocketAddress> receiverGroupMap =
        MarketDataServiceLoader.getGroupAddressMap(instance.getReceiver().getGroupAddressList());
    Map<String, InetSocketAddress> publisherGroupMap =
        MarketDataServiceLoader.getGroupAddressMap(instance.getPublisher().getGroupAddressList());

    assertTrue(receiverGroupMap.size() == 2);
    assertTrue(publisherGroupMap.size() == 1);
    assertTrue(receiverGroupMap.get("A").getPort() == receiverGroupMap.get("B").getPort());
    assertTrue(publisherGroupMap.get("default").getHostName().equals("239.255.29.1"));
  }
}
