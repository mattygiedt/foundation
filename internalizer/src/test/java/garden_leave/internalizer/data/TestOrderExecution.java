package garden_leave.internalizer.data;

import static org.junit.Assert.*;

import garden_leave.internalizer.book.LimitOrder;
import garden_leave.internalizer.book.OrderExecution;
import java.util.Arrays;
import org.junit.Test;

public class TestOrderExecution {
  private long getFillQuantity(final LimitOrder a, final LimitOrder b) {
    return Math.min(a.getRemainingQuantity(), b.getRemainingQuantity());
  }

  @Test
  public void testOrderExecutionBothFilled() {
    final LimitOrder buy = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 100, 100D);
    final LimitOrder sell = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    sell.setOrderStatus(OrderStatusCode.NEW);

    assertTrue(buy.isExecutableAgainst(sell));
    assertTrue(sell.isExecutableAgainst(buy));

    final long fillQuantity = getFillQuantity(buy, sell);
    final Price fillPrice = sell.getLimitPrice();

    final OrderExecution buyExec = buy.execute(fillQuantity, fillPrice);
    final OrderExecution sellExec = sell.execute(fillQuantity, fillPrice);

    for (final OrderExecution exec : Arrays.asList(buyExec, sellExec)) {
      assertEquals(exec.getFillQuantity(), fillQuantity);
      assertEquals(exec.getFillPrice(), fillPrice);
      assertEquals(exec.getAveragePrice(), fillPrice);
      assertEquals(exec.getRemainingQuantity(), 0);
      assertEquals(exec.getOrderStatus(), OrderStatusCode.FILLED);
      assertEquals(exec.getExecutionType(), ExecutionTypeCode.NEW);
    }

    assertFalse(buy.isExecutableAgainst(sell));
    assertFalse(sell.isExecutableAgainst(buy));

    for (final LimitOrder order : Arrays.asList(buy, sell)) {
      assertEquals(order.getOrderStatus(), OrderStatusCode.FILLED);
      assertEquals(order.getAveragePrice(), fillPrice);
      assertEquals(order.getRemainingQuantity(), 0);
      assertEquals(order.getExecutedQuantity(), order.getOriginalQuantity());
    }
  }

  @Test
  public void testOrderExecutionPartiallyFilled() {
    final LimitOrder buy = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.BUY, 50, 100D);
    final LimitOrder sell = TestLimitOrder.makeLimitOrder(123, "SENDER", SideCode.SELL, 100, 100D);

    buy.setOrderStatus(OrderStatusCode.NEW);
    sell.setOrderStatus(OrderStatusCode.NEW);

    assertTrue(buy.isExecutableAgainst(sell));
    assertTrue(sell.isExecutableAgainst(buy));

    final long fillQuantity = getFillQuantity(buy, sell);
    final Price fillPrice = sell.getLimitPrice();

    assertEquals(fillQuantity, buy.getRemainingQuantity());

    final OrderExecution buyExec = buy.execute(fillQuantity, fillPrice);
    final OrderExecution sellExec = sell.execute(fillQuantity, fillPrice);

    for (final OrderExecution exec : Arrays.asList(buyExec, sellExec)) {
      assertEquals(exec.getFillQuantity(), fillQuantity);
      assertEquals(exec.getFillPrice(), fillPrice);
      assertEquals(exec.getAveragePrice(), fillPrice);
      assertEquals(exec.getExecutionType(), ExecutionTypeCode.NEW);
    }

    assertEquals(buyExec.getRemainingQuantity(), 0);
    assertEquals(buyExec.getOrderStatus(), OrderStatusCode.FILLED);

    assertEquals(sellExec.getRemainingQuantity(), 50);
    assertEquals(sellExec.getOrderStatus(), OrderStatusCode.PARTIALLY_FILLED);

    // Execute the remaining...
    final OrderExecution remainingExec = sell.execute(fillQuantity, fillPrice);
    assertEquals(remainingExec.getRemainingQuantity(), 0);
    assertEquals(remainingExec.getOrderStatus(), OrderStatusCode.FILLED);

    assertFalse(buy.isExecutableAgainst(sell));
    assertFalse(sell.isExecutableAgainst(buy));

    for (final LimitOrder order : Arrays.asList(buy, sell)) {
      assertEquals(order.getOrderStatus(), OrderStatusCode.FILLED);
      assertEquals(order.getAveragePrice(), fillPrice);
      assertEquals(order.getRemainingQuantity(), 0);
      assertEquals(order.getExecutedQuantity(), order.getOriginalQuantity());
    }
  }
}
