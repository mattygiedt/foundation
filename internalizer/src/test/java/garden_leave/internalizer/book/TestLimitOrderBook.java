package garden_leave.internalizer.book;

import static org.junit.Assert.*;

import garden_leave.internalizer.container.MapListContainer;
import garden_leave.internalizer.data.OrderStatusCode;
import garden_leave.internalizer.data.SideCode;
import garden_leave.internalizer.data.TestLimitOrder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestLimitOrderBook {
  private final int securityId = 12345;
  private final String sender_A = "SENDER_A";
  private final String sender_B = "SENDER_B";

  @Test
  public void testCreateLimitOrderBook() {
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);

    assertTrue(book.isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddOrderWrongSecurityId() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId + 1, sender_A, SideCode.BUY, 100, 100D);

    book.addOrder(buy, executions);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddOrderTwice() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 100, 100D);

    book.addOrder(buy, executions);
    book.addOrder(buy, executions);
  }

  @Test
  public void testAddBidLimitOrder() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 100, 100D);

    book.addOrder(buy, executions);

    assertEquals(executions.size(), 1);
    assertTrue(buy.getOrderStatus() == OrderStatusCode.NEW);
    assertTrue(executions.get(0).getOrderStatus() == OrderStatusCode.NEW);
  }

  @Test
  public void testAddAskLimitOrder() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 100, 100D);

    book.addOrder(sell, executions);

    assertEquals(executions.size(), 1);
    assertTrue(sell.getOrderStatus() == OrderStatusCode.NEW);
    assertTrue(executions.get(0).getOrderStatus() == OrderStatusCode.NEW);
  }

  @Test
  public void testCancelBuyLimitOrder() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);

    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 100D);

    book.addOrder(buy, executions);

    assertFalse(book.isEmpty());

    final OrderExecution exec = book.cancelOrder(buy.getSide(), buy.getClientOrderId());

    assertEquals(exec.getOrderStatus(), OrderStatusCode.CANCELLED);
    assertNull(book.cancelOrder(buy.getSide(), buy.getClientOrderId()));
    assertTrue(book.isEmpty());
    assertEquals(buy.getOrderStatus(), OrderStatusCode.CANCELLED);
  }

  @Test
  public void testCancelSellLimitOrder() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);

    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 100, 100D);

    book.addOrder(sell, executions);

    assertFalse(book.isEmpty());

    final OrderExecution exec = book.cancelOrder(sell.getSide(), sell.getClientOrderId());

    assertEquals(exec.getOrderStatus(), OrderStatusCode.CANCELLED);
    assertNull(book.cancelOrder(sell.getSide(), sell.getClientOrderId()));
    assertTrue(book.isEmpty());
    assertEquals(sell.getOrderStatus(), OrderStatusCode.CANCELLED);
  }

  @Test
  public void testCancelMultipleLimitOrders() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);

    final LimitOrder buy_1 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 100D);
    final LimitOrder buy_2 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 101D);
    final LimitOrder buy_3 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 102D);

    final LimitOrder sell_1 =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 150, 103D);

    book.addOrder(sell_1, executions);
    book.addOrder(buy_3, executions);
    book.addOrder(buy_2, executions);
    book.addOrder(buy_1, executions);

    assertFalse(book.isEmpty());

    book.cancelOrder(buy_2.getSide(), buy_2.getClientOrderId());
    assertFalse(book.isEmpty());
    assertEquals(buy_2.getOrderStatus(), OrderStatusCode.CANCELLED);

    book.cancelOrder(buy_3.getSide(), buy_3.getClientOrderId());
    assertFalse(book.isEmpty());
    assertEquals(buy_3.getOrderStatus(), OrderStatusCode.CANCELLED);

    book.cancelOrder(sell_1.getSide(), sell_1.getClientOrderId());
    assertFalse(book.isEmpty());
    assertEquals(sell_1.getOrderStatus(), OrderStatusCode.CANCELLED);

    book.cancelOrder(buy_1.getSide(), buy_1.getClientOrderId());
    assertTrue(book.isEmpty());
    assertEquals(buy_1.getOrderStatus(), OrderStatusCode.CANCELLED);
  }

  @Test
  public void testExecuteLimitOrderSimple() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 100, 100D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 100, 100D);

    book.addOrder(buy, executions);
    book.addOrder(sell, executions);

    assertTrue(book.isEmpty());
    assertEquals(6, executions.size());
    assertEquals(buy.getOrderStatus(), OrderStatusCode.COMPLETED);
    assertEquals(sell.getOrderStatus(), OrderStatusCode.COMPLETED);
  }

  @Test
  public void testExecuteLimitOrderBidRests() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 150, 100D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 50, 90D);

    book.addOrder(sell, executions);
    book.addOrder(buy, executions);

    assertFalse(book.isEmpty());
    assertEquals(5, executions.size());
    assertEquals(buy.getOrderStatus(), OrderStatusCode.PARTIALLY_FILLED);
    assertEquals(sell.getOrderStatus(), OrderStatusCode.COMPLETED);
  }

  @Test
  public void testExecuteLimitOrderOfferRests() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);
    final LimitOrder buy =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 100D);
    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 150, 90D);

    book.addOrder(sell, executions);
    book.addOrder(buy, executions);

    assertFalse(book.isEmpty());
    assertEquals(5, executions.size());
    assertEquals(buy.getOrderStatus(), OrderStatusCode.COMPLETED);
    assertEquals(sell.getOrderStatus(), OrderStatusCode.PARTIALLY_FILLED);
  }

  @Test
  public void testExecuteMultipleLimitOrders() {
    final List<OrderExecution> executions = new ArrayList<>();
    final LimitOrderBook book = new LimitOrderBook(securityId, MapListContainer.provider);

    final LimitOrder buy_1 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 100D);
    final LimitOrder buy_2 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 101D);
    final LimitOrder buy_3 =
        TestLimitOrder.makeLimitOrder(securityId, sender_A, SideCode.BUY, 50, 102D);

    final LimitOrder sell =
        TestLimitOrder.makeLimitOrder(securityId, sender_B, SideCode.SELL, 150, 100D);

    book.addOrder(sell, executions);
    book.addOrder(buy_1, executions);
    book.addOrder(buy_2, executions);
    book.addOrder(buy_3, executions);

    assertTrue(book.isEmpty());
    assertEquals(buy_1.getOrderStatus(), OrderStatusCode.COMPLETED);
    assertEquals(buy_2.getOrderStatus(), OrderStatusCode.COMPLETED);
    assertEquals(buy_3.getOrderStatus(), OrderStatusCode.COMPLETED);
    assertEquals(sell.getOrderStatus(), OrderStatusCode.COMPLETED);
  }
}
