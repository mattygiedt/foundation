package garden_leave.config.loaders;

import com.google.protobuf.Message;
import garden_leave.config.proto.ConfigKey;
import java.util.Map;
import java.util.function.Supplier;

public interface Loader<M extends Message> {
  Supplier<M> fromString(final String data);
  Supplier<M> fromFile(final String path) throws Exception;
  Supplier<M> fromResource(final String path) throws Exception;
  Supplier<M> getDefaultConfigProvider() throws Exception;
  void addConfig(Supplier<M> supplier, Map<ConfigKey, Message> map) throws Exception;
}
