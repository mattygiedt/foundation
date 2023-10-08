package garden_leave.config.loaders.gateway;

import com.google.protobuf.Message;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.GatewayService;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class GatewayServiceLoader
    extends GenericLoader<GatewayService, GatewayService.Builder, GatewayService.Instance> {
  @Override
  public Supplier<GatewayService.Builder> getMessageBuilder() {
    return () -> GatewayService.newBuilder();
  }

  @Override
  public Function<GatewayService.Builder, GatewayService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.GatewayClientService.txt";
  }

  @Override
  public void addConfig(final Supplier<GatewayService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final GatewayService proto = configSupplier.get();
    for (GatewayService.Instance instance : proto.getInstanceList()) {
      if (!isValidService(instance.getService())) {
        throw new Exception("Invalid service configuration" + instance.getService());
      }

      final ConfigKey configKey = instance.getService().getConfigKey();

      if (map.containsKey(configKey)) {
        throw new Exception("Invalid duplicate configuration key: " + configKey);
      }

      map.put(configKey, instance);
    }
  }
}
