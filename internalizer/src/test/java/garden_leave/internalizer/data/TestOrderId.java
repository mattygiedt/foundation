package garden_leave.internalizer.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOrderId {
  @Test
  public void testOrderIdGen() {
    OrderId.reset();
    assertTrue("000000000001".equals(OrderId.newOrderId().getOrderId()));
    assertTrue("000000000002".equals(OrderId.newOrderId().getOrderId()));
  }

  @Test
  public void testEquals() {
    final OrderId a = OrderId.newOrderId();
    final OrderId b = OrderId.from(a.getOrderId());
    assertEquals(a, b);
  }

  @Test
  public void testNotEquals() {
    final OrderId a = OrderId.newOrderId();
    final OrderId b = OrderId.newOrderId();
    assertNotEquals(a, b);
  }
}
