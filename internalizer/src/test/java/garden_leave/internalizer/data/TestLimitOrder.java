package garden_leave.internalizer.data;

import static org.junit.Assert.*;

import garden_leave.internalizer.book.LimitOrder;
import garden_leave.internalizer.book.LimitOrder.LimitOrderBuilder;
import java.util.Arrays;
import org.junit.Test;

public class TestLimitOrder {
  public static LimitOrder makeLimitOrder(final int security, final String sender,
      final SideCode side, final long quantity, final double price) {
    return new LimitOrderBuilder()
        .setClientOrderId(java.util.UUID.randomUUID().toString())
        .setSecurityId(security)
        .setSenderId(sender)
        .setSide(side)
        .setLimitPrice(new Price(price))
        .setOriginalQuantity(quantity)
        .build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBuildEmptyLimitOrderFails() {
    LimitOrderBuilder builder = new LimitOrderBuilder();
    builder.build();
  }

  @Test
  public void testLimitOrder() {
    final LimitOrder buy = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100D);
    final LimitOrder sell = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100D);

    assertEquals(SideCode.BUY, buy.getSide());
    assertEquals(SideCode.SELL, sell.getSide());
    assertNotEquals(buy.getOrderId().getOrderId(), sell.getOrderId().getOrderId());

    for (final LimitOrder order : Arrays.asList(buy, sell)) {
      assertEquals(123, order.getSecurityId());
      assertEquals("SENDER", order.getSenderId());
      assertEquals(100, order.getOriginalQuantity());
      assertEquals(0, order.getExecutedQuantity());
      assertEquals(100, order.getRemainingQuantity());
      assertEquals(100D, order.getLimitPrice().toDouble(), 0.000001);
      assertEquals(0D, order.getAveragePrice().toDouble(), 0.000001);
      assertEquals(OrderStatusCode.PENDING_NEW, order.getOrderStatus());
      assertTrue(order.isPendingStatus());
      assertFalse(order.isOpenStatus());
    }
  }

  @Test
  public void testIsExecutableAgainstSameSide() {
    final LimitOrder buy = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100D);
    final LimitOrder another_buy =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    another_buy.setOrderStatus(OrderStatusCode.NEW);

    assertFalse(buy.isExecutableAgainst(another_buy));
  }

  @Test
  public void testIsExecutableAgainstBidAskSpread() {
    final LimitOrder buy = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100.001D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    sell.setOrderStatus(OrderStatusCode.NEW);

    assertFalse(buy.isExecutableAgainst(sell));
  }

  @Test
  public void testIsExecutableAgainstBidAskCrossed() {
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100.002D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100.001D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    sell.setOrderStatus(OrderStatusCode.NEW);

    assertTrue(buy.isExecutableAgainst(sell));
  }

  @Test
  public void testIsExecutableAgainstBidAskSamePrice() {
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100.002D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100.002D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    sell.setOrderStatus(OrderStatusCode.NEW);

    assertTrue(buy.isExecutableAgainst(sell));
  }
}
