package garden_leave.internalizer.book;

import garden_leave.internalizer.data.OrderStatusCode;
import garden_leave.internalizer.data.Price;
import garden_leave.internalizer.data.PriceComparators;
import garden_leave.internalizer.data.SideCode;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.RuntimeError;

public class LimitOrderBook {
  private static final Logger logger = LoggerFactory.getLogger(LimitOrderBook.class);
  private final int securityId;
  private final LimitOrderContainer bid;
  private final LimitOrderContainer ask;

  public LimitOrderBook(
      final int securityId, final Function<Comparator<Price>, LimitOrderContainer> provider) {
    this.securityId = securityId;
    this.bid = provider.apply(PriceComparators.BID_COMPARATOR);
    this.ask = provider.apply(PriceComparators.ASK_COMPARATOR);
  }

  public void addOrder(final LimitOrder order, final List<OrderExecution> executions) {
    if (order == null) {
      throw new IllegalArgumentException("LimitOrder is null");
    }

    if (order.getSecurityId() != securityId) {
      throw new IllegalArgumentException("invalid security_id: " + securityId);
    }

    if (!order.isPendingStatus()) {
      throw new IllegalArgumentException(
          "invalid order status: " + order.getOrderId() + ":" + order.getOrderStatus());
    }

    if (logger.isDebugEnabled()) {
      logger.debug("setting {} order status to NEW for order_id {}", order.getOrderStatus(),
          order.getOrderId());
    }

    // Add the order to the resting container
    if (!getContainerFor(order.getSide()).add(order)) {
      throw new RuntimeException("could not add order to book: " + order);
    }

    order.setOrderStatus(OrderStatusCode.NEW);
    executions.add(order.execute(0, Price.ZERO));

    // Is our book now crossed?
    pairOff(order.getSide(), executions);

    int count = 0;
    logger.info("addOrder -----------");
    for (final OrderExecution exec : executions) {
      logger.info(" exec[{}]: {}", count++, exec);
    }
    logger.info(
        " book isEmpty: {}, bid size: {}, ask size: {}\n", isEmpty(), bid.count(), ask.count());
  }

  public boolean modifyOrder(final LimitOrder order, final List<OrderExecution> executions) {
    throw new RuntimeError("not yet implemented");
  }

  public OrderExecution cancelOrder(final SideCode side, final String clientOrderId) {
    logger.info("cancelOrder -----------");
    logger.info(" side {}, clOrdId {}", side, clientOrderId);

    final LimitOrder order = getContainerFor(side).remove(clientOrderId);
    if (null != order) {
      logger.info(" order cancelled!");
      final OrderExecution exec = order.cancel();
      logger.info(" exec {}", exec);
      logger.info(
          " book isEmpty: {}, bid size: {}, ask size: {}\n", isEmpty(), bid.count(), ask.count());
      return exec;
    }

    logger.info(" ORDER NOT FOUND!");
    logger.info(
        " book isEmpty: {}, bid size: {}, ask size: {}\n", isEmpty(), bid.count(), ask.count());

    return null;
  }

  public boolean isEmpty() {
    return bid.isEmpty() && ask.isEmpty();
  }

  private void pairOff(final SideCode aggressor, final List<OrderExecution> executions) {
    if (logger.isDebugEnabled()) {
      logger.debug("aggressor: {}", aggressor);
      logger.debug("bid.isEmpty(): {}", bid.isEmpty());
      logger.debug("ask.isEmpty(): {}", ask.isEmpty());
      logger.debug("isCrossed: {}", isCrossed());
    }

    final LimitOrderContainer container = getContainerFor(aggressor);
    final LimitOrderContainer crossingContainer = getContainerFor(aggressor.opposite());

    while (isCrossed()) {
      final LimitOrder order = container.front();
      final LimitOrder crossingOrder = crossingContainer.front();

      final Price fillPrice = order.getLimitPrice();
      final long quantity = getFillQuantity(order, crossingOrder);

      if (logger.isDebugEnabled()) {
        logger.debug("executing order: {} against crossing order: {}, price: {}, quantity: {}",
            order.getOrderId(), crossingOrder.getOrderId(), fillPrice, quantity);
      }

      executions.add(order.execute(quantity, fillPrice));
      executions.add(crossingOrder.execute(quantity, fillPrice));

      if (order.getOrderStatus() == OrderStatusCode.FILLED) {
        container.remove(order.getClientOrderId());
        executions.add(order.close());
      }

      if (crossingOrder.getOrderStatus() == OrderStatusCode.FILLED) {
        crossingContainer.remove(crossingOrder.getClientOrderId());
        executions.add(crossingOrder.close());
      }
    }
  }

  private LimitOrderContainer getContainerFor(final SideCode side) {
    switch (side) {
      case BUY:
      case BUY_COVER:
        return bid;
      case SELL:
      case SELL_SHORT:
        return ask;
      default:
        throw new IllegalArgumentException("invalid side: " + side);
    }
  }

  private long getFillQuantity(final LimitOrder a, final LimitOrder b) {
    return Math.min(a.getRemainingQuantity(), b.getRemainingQuantity());
  }

  private boolean isCrossed() {
    if (bid.isEmpty() || ask.isEmpty()) {
      return false;
    }

    if (bid.front().isExecutableAgainst(ask.front())) {
      return true;
    }

    return false;
  }
}
