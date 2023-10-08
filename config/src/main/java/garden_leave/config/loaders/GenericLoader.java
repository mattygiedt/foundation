package garden_leave.config.loaders;

import com.google.protobuf.Message;
import com.google.protobuf.TextFormat;
import garden_leave.config.ConfigManager;
import garden_leave.config.proto.ConfigKey;
import garden_leave.config.proto.Service;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class GenericLoader<M extends Message, B extends Message.Builder, I extends Message>
    implements Loader<M> {
  protected final Supplier<B> messageBuilder;
  protected final Function<B, M> messageGenerator;

  public GenericLoader() {
    this.messageBuilder = this.getMessageBuilder();
    this.messageGenerator = this.getMessageGenerator();
  }

  public GenericLoader(final Supplier<B> supplier, final Function<B, M> transformer) {
    this.messageBuilder = supplier;
    this.messageGenerator = transformer;
  }

  @Override
  public Supplier<M> fromString(final String data) {
    return () -> {
      try {
        B builder = messageBuilder.get();
        TextFormat.merge(data, builder);
        return messageGenerator.apply(builder);
      } catch (final Exception ex) {
        throw new RuntimeException(ex);
      }
    };
  }

  @Override
  public Supplier<M> fromFile(final String path) throws Exception {
    return fromString(new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path)),
        java.nio.charset.Charset.defaultCharset()));
  }

  @Override
  public Supplier<M> fromResource(final String path) throws Exception {
    return fromString(
        new String(GenericLoader.class.getClassLoader().getResourceAsStream(path).readAllBytes(),
            java.nio.charset.Charset.defaultCharset()));
  }

  @Override
  public Supplier<M> getDefaultConfigProvider() throws Exception {
    return fromResource(getDefaultResourcePath());
  }

  public boolean isValidService(final Service service) {
    if (!service.getName().equals(ConfigManager.getConfigKeyString(service.getConfigKey()))) {
      return false;
    }

    return true;
  }

  public abstract Supplier<B> getMessageBuilder();
  public abstract Function<B, M> getMessageGenerator();
  public abstract String getDefaultResourcePath();
  public abstract void addConfig(Supplier<M> configProvider, Map<ConfigKey, Message> map)
      throws Exception;
}
