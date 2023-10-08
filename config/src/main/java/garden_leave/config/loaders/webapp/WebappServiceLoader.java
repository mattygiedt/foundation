package garden_leave.config.loaders.webapp;

import com.google.protobuf.Message;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.WebappService;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class WebappServiceLoader
    extends GenericLoader<WebappService, WebappService.Builder, WebappService.Instance> {
  @Override
  public Supplier<WebappService.Builder> getMessageBuilder() {
    return () -> WebappService.newBuilder();
  }

  @Override
  public Function<WebappService.Builder, WebappService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.WebappService.txt";
  }

  @Override
  public void addConfig(final Supplier<WebappService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final WebappService proto = configSupplier.get();
    for (WebappService.Instance instance : proto.getInstanceList()) {
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
