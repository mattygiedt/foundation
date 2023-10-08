package garden_leave.internalizer.book;

public interface LimitOrderContainer {
  boolean add(LimitOrder order);
  boolean modify(LimitOrder order);
  LimitOrder remove(String clientOrderId);
  int cancelAll(String senderId);
  LimitOrder front();
  boolean isEmpty();
  int count();
  void clear();
}
