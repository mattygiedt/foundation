package garden_leave.gateway.transform;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import quickfix.Group;
import quickfix.Message;

public abstract class TransformMessageFactory {
  private final Map<String, Supplier<Message>> messageMap = new HashMap<>();
  private final Map<String, Map<Integer, Supplier<Group>>> groupMap = new HashMap<>();

  protected void addMessageSupplier(final String msgType, final Supplier<Message> supplier) {
    messageMap.put(msgType, supplier);
  }

  protected void addMessageGroupSupplier(
      final String msgType, final Integer groupFieldId, final Supplier<Group> supplier) {
    groupMap.computeIfAbsent(msgType, k -> new HashMap<Integer, Supplier<Group>>())
        .put(groupFieldId, supplier);
  }

  public quickfix.MessageFactory createMessageFactory() {
    return new quickfix.MessageFactory() {
      @Override
      public Message create(final String beginString, final String msgType) {
        return messageMap.get(msgType).get();
      }

      @Override
      public Group create(final String beginString, final String msgType, final int groupFieldId) {
        return groupMap.get(msgType).get(Integer.valueOf(groupFieldId)).get();
      }
    };
  }
}
