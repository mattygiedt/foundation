package garden_leave.config.loaders.internalizer;

import com.google.protobuf.Message;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.InternalizerService;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class InternalizerServiceLoader extends GenericLoader<InternalizerService,
    InternalizerService.Builder, InternalizerService.Instance> {
  @Override
  public Supplier<InternalizerService.Builder> getMessageBuilder() {
    return () -> InternalizerService.newBuilder();
  }

  @Override
  public Function<InternalizerService.Builder, InternalizerService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.GatewayClientService.txt";
  }

  @Override
  public void addConfig(final Supplier<InternalizerService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final InternalizerService proto = configSupplier.get();
    for (InternalizerService.Instance instance : proto.getInstanceList()) {
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
