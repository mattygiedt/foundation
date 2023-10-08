package garden_leave.internalizer.container;

import static org.junit.Assert.*;

import garden_leave.internalizer.book.LimitOrder;
import garden_leave.internalizer.book.LimitOrderContainer;
import garden_leave.internalizer.data.PriceComparators;
import garden_leave.internalizer.data.SideCode;
import garden_leave.internalizer.data.TestLimitOrder;
import org.junit.Test;

public class TestMapListContainer {
  @Test
  public void testAddLimitOrder() {
    final LimitOrderContainer container =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);
    assertTrue(container.isEmpty());

    final LimitOrder order = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    container.add(order);

    assertFalse(container.isEmpty());
    assertEquals(container.count(), 1);
    assertEquals(order.getOrderId(), container.front().getOrderId());
  }

  @Test
  public void testAddMultipleLimitOrdersSamePrice() {
    final LimitOrderContainer container =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);

    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);

    container.add(order_a);
    container.add(order_b);
    container.add(order_c);

    assertFalse(container.isEmpty());
    assertEquals(container.count(), 3);
    assertEquals(container.front().getOrderId(), order_a.getOrderId());
  }

  @Test
  public void testAddMultipleBuyLimitOrdersDifferentPrice() {
    final LimitOrderContainer bids =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);

    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 200D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 50D);

    bids.add(order_a);
    bids.add(order_b);
    bids.add(order_c);

    assertFalse(bids.isEmpty());
    assertEquals(bids.count(), 3);
    assertEquals(order_b.getOrderId(), bids.front().getOrderId());
  }

  @Test
  public void testAddMultipleSellLimitOrdersDifferentPrice() {
    final LimitOrderContainer asks =
        MapListContainer.provider.apply(PriceComparators.ASK_COMPARATOR);

    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 10D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 20D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 5D);

    asks.add(order_a);
    asks.add(order_b);
    asks.add(order_c);

    assertFalse(asks.isEmpty());
    assertEquals(asks.count(), 3);
    assertEquals(order_c.getOrderId(), asks.front().getOrderId());
  }

  @Test
  public void testRemoveLimitOrder() {
    final LimitOrderContainer container =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);
    final LimitOrder order = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    container.add(order);

    assertEquals(container.count(), 1);
    assertEquals(container.remove(order.getClientOrderId()).getOrderId(), order.getOrderId());
    assertNull(container.remove(order.getClientOrderId()));

    assertTrue(container.isEmpty());
    assertEquals(container.count(), 0);
    assertNull(container.front());
  }

  @Test
  public void testRemoveMultipleLimitOrdersSamePrice() {
    final LimitOrderContainer container =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);
    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);

    container.add(order_a);
    container.add(order_b);
    container.add(order_c);

    assertFalse(container.isEmpty());
    assertEquals(container.count(), 3);

    // Remove order_b
    assertEquals(container.front().getOrderId(), order_a.getOrderId());
    assertEquals(container.remove(order_b.getClientOrderId()).getOrderId(), order_b.getOrderId());
    assertNull(container.remove(order_b.getClientOrderId()));

    assertFalse(container.isEmpty());
    assertEquals(container.count(), 2);

    // Remove order_a
    assertEquals(container.front().getOrderId(), order_a.getOrderId());
    assertEquals(container.remove(order_a.getClientOrderId()).getOrderId(), order_a.getOrderId());
    assertNull(container.remove(order_a.getClientOrderId()));

    assertFalse(container.isEmpty());
    assertEquals(container.count(), 1);

    // Remove order_c
    assertEquals(container.front().getOrderId(), order_c.getOrderId());
    assertEquals(container.remove(order_c.getClientOrderId()).getOrderId(), order_c.getOrderId());
    assertNull(container.remove(order_c.getClientOrderId()));

    assertTrue(container.isEmpty());
    assertEquals(container.count(), 0);
    assertNull(container.front());
  }

  @Test
  public void testRemoveMultipleBuyLimitOrdersDifferentPrice() {
    final LimitOrderContainer bids =
        MapListContainer.provider.apply(PriceComparators.BID_COMPARATOR);

    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 200D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 50D);

    bids.add(order_a);
    bids.add(order_b);
    bids.add(order_c);

    // Remove order_c (worst)
    assertEquals(bids.front().getOrderId(), order_b.getOrderId());
    assertEquals(bids.remove(order_c.getClientOrderId()).getOrderId(), order_c.getOrderId());
    assertNull(bids.remove(order_c.getClientOrderId()));

    assertFalse(bids.isEmpty());
    assertEquals(bids.count(), 2);

    // Remove order_b (best)
    assertEquals(bids.front().getOrderId(), order_b.getOrderId());
    assertEquals(bids.remove(order_b.getClientOrderId()).getOrderId(), order_b.getOrderId());
    assertNull(bids.remove(order_b.getClientOrderId()));

    assertFalse(bids.isEmpty());
    assertEquals(bids.count(), 1);

    // Remove order_a (best)
    assertEquals(bids.front().getOrderId(), order_a.getOrderId());
    assertEquals(bids.remove(order_a.getClientOrderId()).getOrderId(), order_a.getOrderId());
    assertNull(bids.remove(order_a.getClientOrderId()));

    assertTrue(bids.isEmpty());
    assertEquals(bids.count(), 0);
    assertNull(bids.front());
  }

  @Test
  public void testRemoveMultipleSellLimitOrdersDifferentPrice() {
    final LimitOrderContainer asks =
        MapListContainer.provider.apply(PriceComparators.ASK_COMPARATOR);

    final LimitOrder order_a = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 10D);
    final LimitOrder order_b = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 20D);
    final LimitOrder order_c = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 50, 5D);

    asks.add(order_a);
    asks.add(order_b);
    asks.add(order_c);

    // Remove order_b (worst)
    assertEquals(asks.front().getOrderId(), order_c.getOrderId());
    assertEquals(asks.remove(order_b.getClientOrderId()).getOrderId(), order_b.getOrderId());
    assertNull(asks.remove(order_b.getClientOrderId()));

    assertFalse(asks.isEmpty());
    assertEquals(asks.count(), 2);

    // Remove order_c (best)
    assertEquals(asks.front().getOrderId(), order_c.getOrderId());
    assertEquals(asks.remove(order_c.getClientOrderId()).getOrderId(), order_c.getOrderId());
    assertNull(asks.remove(order_c.getClientOrderId()));

    assertFalse(asks.isEmpty());
    assertEquals(asks.count(), 1);

    // Remove order_a (best)
    assertEquals(asks.front().getOrderId(), order_a.getOrderId());
    assertEquals(asks.remove(order_a.getClientOrderId()).getOrderId(), order_a.getOrderId());
    assertNull(asks.remove(order_a.getClientOrderId()));

    assertTrue(asks.isEmpty());
    assertEquals(asks.count(), 0);
    assertNull(asks.front());
  }

  @Test
  public void testCancelAll() {
    final LimitOrderContainer asks =
        MapListContainer.provider.apply(PriceComparators.ASK_COMPARATOR);

    final LimitOrder order_a =
        TestLimitOrder.makeLimitOrder(123, "SENDER_A", SideCode.SELL, 50, 10D);
    final LimitOrder order_b =
        TestLimitOrder.makeLimitOrder(123, "SENDER_B", SideCode.SELL, 50, 20D);
    final LimitOrder order_c =
        TestLimitOrder.makeLimitOrder(123, "SENDER_A", SideCode.SELL, 50, 5D);
    final LimitOrder order_d =
        TestLimitOrder.makeLimitOrder(123, "SENDER_B", SideCode.SELL, 50, 5D);

    asks.add(order_a);
    asks.add(order_b);
    asks.add(order_c);
    asks.add(order_d);

    assertEquals(asks.cancelAll("SENDER_C"), 0);

    assertEquals(asks.front().getOrderId(), order_c.getOrderId());

    assertEquals(asks.cancelAll("SENDER_A"), 2);

    assertEquals(asks.front().getOrderId(), order_d.getOrderId());
    assertFalse(asks.isEmpty());
    assertEquals(asks.count(), 2);

    assertEquals(asks.cancelAll("SENDER_B"), 2);

    assertTrue(asks.isEmpty());
    assertEquals(asks.count(), 0);
    assertNull(asks.front());
    assertEquals(asks.cancelAll("SENDER_C"), 0);
  }

  @Test
  public void testClear() {
    final LimitOrderContainer asks =
        MapListContainer.provider.apply(PriceComparators.ASK_COMPARATOR);

    final LimitOrder order_a =
        TestLimitOrder.makeLimitOrder(123, "SENDER_A", SideCode.SELL, 50, 10D);
    final LimitOrder order_b =
        TestLimitOrder.makeLimitOrder(123, "SENDER_B", SideCode.SELL, 50, 20D);
    final LimitOrder order_c =
        TestLimitOrder.makeLimitOrder(123, "SENDER_A", SideCode.SELL, 50, 5D);
    final LimitOrder order_d =
        TestLimitOrder.makeLimitOrder(123, "SENDER_B", SideCode.SELL, 50, 5D);

    asks.add(order_a);
    asks.add(order_b);
    asks.add(order_c);
    asks.add(order_d);
    asks.clear();

    assertTrue(asks.isEmpty());
    assertEquals(asks.count(), 0);
    assertNull(asks.front());
  }
}
