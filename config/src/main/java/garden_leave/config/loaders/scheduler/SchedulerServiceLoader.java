package garden_leave.config.loaders.scheduler;

import com.google.protobuf.Message;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.SchedulerService;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class SchedulerServiceLoader
    extends GenericLoader<SchedulerService, SchedulerService.Builder, SchedulerService.Instance> {
  @Override
  public Supplier<SchedulerService.Builder> getMessageBuilder() {
    return () -> SchedulerService.newBuilder();
  }

  @Override
  public Function<SchedulerService.Builder, SchedulerService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.SchedulerService.txt";
  }

  @Override
  public void addConfig(final Supplier<SchedulerService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final SchedulerService proto = configSupplier.get();
    for (SchedulerService.Instance instance : proto.getInstanceList()) {
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
