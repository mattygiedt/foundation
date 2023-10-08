package garden_leave.config.loaders.config;

import com.google.protobuf.Message;
import garden_leave.config.ConfigManager;
import garden_leave.config.loaders.GenericLoader;
import garden_leave.config.loaders.Loader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.ConfigService;
import garden_leave.config.proto.ServiceConfiguration;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConfigServiceLoader
    extends GenericLoader<ConfigService, ConfigService.Builder, ConfigService.Instance> {
  @SuppressWarnings("rawtypes")
  public void loadConfig(final ConfigManager manager, final ServiceConfiguration serviceConfig)
      throws Exception {
    final Loader loader = Loader.class.cast(
        Class.forName(serviceConfig.getLoaderClass()).getConstructor().newInstance());

    switch (serviceConfig.getSourceCase()) {
      case FROM_STRING: {
        manager.addConfigFromString(loader, serviceConfig.getFromString());
        break;
      }
      case FROM_FILE: {
        manager.addConfigFromFile(loader, serviceConfig.getFromFile());
        break;
      }
      case FROM_RESOURCE: {
        manager.addConfigFromResource(loader, serviceConfig.getFromResource());
        break;
      }
      case SOURCE_NOT_SET: {
        throw new Exception("loadConfig SOURCE_NOT_SET");
      }
    }
  }

  @Override
  public Supplier<ConfigService.Builder> getMessageBuilder() {
    return () -> ConfigService.newBuilder();
  }

  @Override
  public Function<ConfigService.Builder, ConfigService> getMessageGenerator() {
    return (builder) -> builder.build();
  }

  @Override
  public String getDefaultResourcePath() {
    return "config/garden_leave.config.proto.ConfigService.txt";
  }

  @Override
  public void addConfig(final Supplier<ConfigService> configSupplier,
      final Map<ConfigKey, Message> map) throws Exception {
    final ConfigService proto = configSupplier.get();
    for (ConfigService.Instance instance : proto.getInstanceList()) {
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
