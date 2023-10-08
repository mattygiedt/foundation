package garden_leave.config.loaders.marketdata;

import com.google.protobuf.Message;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.MarketDataService;
import garden_leave.config.proto.SocketAddress;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class MarketDataServiceLoader extends GenericLoader<MarketDataService,
    MarketDataService.Builder, MarketDataService.Instance> {
  public static Map<String, InetSocketAddress> getGroupAddressMap(
      final List<SocketAddress> addressList) {
    final Map<String, InetSocketAddress> map = new HashMap<>();
    addressList.forEach(
        (socketAddress)
            -> map.put(socketAddress.getName(),
                new InetSocketAddress(socketAddress.getAddress(), socketAddress.getPort())));
    return map;
  }

  @Override
  public Supplier<MarketDataService.Builder> getMessageBuilder() {
    return () -> MarketDataService.newBuilder();
  }

  @Override
  public Function<MarketDataService.Builder, MarketDataService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.MarketDataService.txt";
  }

  @Override
  public void addConfig(final Supplier<MarketDataService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final MarketDataService proto = configSupplier.get();
    for (MarketDataService.Instance instance : proto.getInstanceList()) {
      if (!isValidService(instance.getService())) {
        throw new Exception("Invalid service configuration" + instance.getService());
      }

      final ConfigKey configKey = instance.getService().getConfigKey();

      if (!map.containsKey(configKey)) {
        map.put(configKey, instance);
      } else {
        throw new Exception("Invalid duplicate configuration key: " + configKey);
      }
    }
  }
}
