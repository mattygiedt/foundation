package garden_leave.internalizer.data;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderId {
  private static final AtomicInteger seqNum = new AtomicInteger(1);
  public static final OrderId ORIGINAL_ORDER_ID = new OrderId("<null>");

  public static OrderId newOrderId() {
    return new OrderId(String.format("%012d", seqNum.getAndAdd(1)));
  }

  public static OrderId from(final String id) {
    return new OrderId(id);
  }

  public static void reset() {
    seqNum.set(1);
  }

  private final String orderId;
  private OrderId(final String orderId) {
    this.orderId = orderId;
  }

  public String getOrderId() {
    return orderId;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    OrderId that = (OrderId) o;
    return orderId.equals(that.getOrderId());
  }

  @Override
  public int hashCode() {
    return orderId.hashCode();
  }

  @Override
  public String toString() {
    return orderId;
  }
}
