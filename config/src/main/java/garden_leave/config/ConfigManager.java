package garden_leave.config;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import garden_leave.config.loaders.Loader;
import garden_leave.config.proto.ConfigKey;
import garden_leave.grpc.ConfigResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Class that manages config loaders and access to their data
 */

public class ConfigManager {
  private final Map<ConfigKey, Message> configMap = new HashMap<>();

  @SuppressWarnings({"rawtypes", "unchecked"})
  public void addConfig(final Loader loader) throws Exception {
    loader.addConfig(loader.getDefaultConfigProvider(), configMap);
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  public void addConfigFromString(final Loader loader, final String data) throws Exception {
    loader.addConfig(loader.fromString(data), configMap);
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  public void addConfigFromFile(final Loader loader, final String path) throws Exception {
    loader.addConfig(loader.fromFile(path), configMap);
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  public void addConfigFromResource(final Loader loader, final String path) throws Exception {
    loader.addConfig(loader.fromResource(path), configMap);
  }

  public boolean hasConfig(final String configKeyString) {
    return hasConfig(getConfigKey(configKeyString));
  }

  public boolean hasConfig(final ConfigKey configKey) {
    return configMap.containsKey(configKey);
  }

  public Message getConfig(final String configKeyString) {
    return getConfig(getConfigKey(configKeyString));
  }

  public Message getConfig(final ConfigKey configKey) {
    return configMap.getOrDefault(configKey, Empty.getDefaultInstance());
  }

  public <T extends Message> T getConfig(final String configKey, final Class<T> clazz) {
    return castTo(getConfig(configKey), clazz);
  }

  private <T> T castTo(final Object o, final Class<T> clazz) {
    return clazz.cast(o);
  }

  public Map<ConfigKey, Message> getConfigMap() {
    return Collections.unmodifiableMap(configMap);
  }

  protected ConfigResponse getConfigResponse(final String configKey) {
    return getConfigResponse(ConfigManager.getConfigKey(configKey));
  }

  protected ConfigResponse getConfigResponse(final ConfigKey configKey) {
    return ConfigResponse.newBuilder()
        .setConfigKey(configKey)
        .setConfig(Any.pack(getConfig(configKey)))
        .build();
  }

  public static ConfigKey getConfigKey(final String configKeyString) {
    int pos = 0;
    final ConfigKey.Builder builder = ConfigKey.newBuilder();
    final StringTokenizer tokenizer = new StringTokenizer(configKeyString, ".");

    while (tokenizer.hasMoreElements()) {
      if (pos == 0) {
        builder.setEnvironment(tokenizer.nextToken());
      } else if (pos == 1) {
        builder.setService(tokenizer.nextToken());
      } else if (pos == 2) {
        builder.setInstance(tokenizer.nextToken());
      } else if (pos == 3) {
        builder.setCategory(tokenizer.nextToken());
      }

      pos += 1;
    }

    return builder.build();
  }

  public static String getConfigKeyString(final ConfigKey key) {
    final StringBuilder sb = new StringBuilder();
    if (!key.getEnvironment().isEmpty()) {
      sb.append(key.getEnvironment());
    }
    if (!key.getService().isEmpty()) {
      sb.append(".").append(key.getService());
    }
    if (!key.getInstance().isEmpty()) {
      sb.append(".").append(key.getInstance());
    }
    if (!key.getCategory().isEmpty()) {
      sb.append(".").append(key.getCategory());
    }

    return sb.toString();
  }
}
