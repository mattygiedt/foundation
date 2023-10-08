package garden_leave.internalizer.container;

import garden_leave.internalizer.book.LimitOrder;
import garden_leave.internalizer.book.LimitOrderContainer;
import garden_leave.internalizer.data.OrderId;
import garden_leave.internalizer.data.Price;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapListContainer implements LimitOrderContainer {
  private static final Logger logger = LoggerFactory.getLogger(MapListContainer.class);

  private final HashMap<String, OrderId> clientMap;
  private final HashMap<OrderId, LimitOrder> orderMap;
  private final TreeMap<Price, List<LimitOrder>> priceMap;

  public static Function<Comparator<Price>, LimitOrderContainer> provider = (comparator) -> {
    return new MapListContainer(comparator);
  };

  private MapListContainer(final Comparator<Price> comparator) {
    this.clientMap = new HashMap<String, OrderId>();
    this.orderMap = new HashMap<OrderId, LimitOrder>();
    this.priceMap = new TreeMap<Price, List<LimitOrder>>(comparator);
  }

  public boolean add(final LimitOrder order) {
    if (null == order) {
      return false;
    }

    if (orderMap.containsKey(order.getOrderId())) {
      logger.error("order_id already in book: {}", order.getOrderId());
      return false;
    }

    clientMap.put(order.getClientOrderId(), order.getOrderId());
    orderMap.put(order.getOrderId(), order);
    priceMap.computeIfAbsent(order.getLimitPrice(), p -> new ArrayList<LimitOrder>(16)).add(order);

    if (logger.isDebugEnabled()) {
      logger.debug("added order: {}", order.toString());
    }

    return true;
  }

  public boolean modify(final LimitOrder order) {
    if (null == order) {
      logger.error("modify order: order is null");
      return false;
    }

    if (!orderMap.containsKey(order.getOrderId())) {
      logger.warn("modify order: unknown order {}", order.toString());
      return false;
    }

    // Cancel (remove) the original order and replace (add) it with this one
    if (null == remove(order.getOrigClientOrderId())) {
      logger.error("modify order: could not remove original client order id {}",
          order.getOrigClientOrderId());
      return false;
    }

    return add(order);
  }

  public LimitOrder remove(final String clientOrderId) {
    if (null == clientOrderId) {
      logger.error("remove order: client order id is null");
      return null;
    }

    // Remove client order id from clientMap
    final OrderId orderId = clientMap.remove(clientOrderId);

    if (orderId == null) {
      logger.warn("remove order: unknown client order id {}", clientOrderId);
      return null;
    }

    // Remove order from order map
    final LimitOrder order = orderMap.remove(orderId);

    if (order == null) {
      logger.warn("remove order: cannot find order id for client order id {}", clientOrderId);
      return null;
    }

    // Get the price level for this order
    final List<LimitOrder> priceLevel = priceMap.get(order.getLimitPrice());

    if (logger.isDebugEnabled()) {
      logger.debug("remove order: {}", orderId);
    }

    // Remove order from priceMap
    priceLevel.remove(order);

    // Remove price level if this is the last order
    if (priceLevel.isEmpty()) {
      if (logger.isDebugEnabled()) {
        logger.debug("remove price_level: {}", order.getLimitPrice());
      }

      priceMap.remove(order.getLimitPrice());
    }

    return order;
  }

  public int cancelAll(final String senderId) {
    if (isEmpty()) {
      return 0;
    }

    // Returns the total number of removed orders
    int count = 0;

    // We need to iterate over every order in the priceMap
    final Iterator<Map.Entry<Price, List<LimitOrder>>> iterator = priceMap.entrySet().iterator();
    while (iterator.hasNext()) {
      // Get a list iterator for the price level
      final Map.Entry<Price, List<LimitOrder>> entry = iterator.next();
      final List<LimitOrder> priceLevel = entry.getValue();
      final ListIterator<LimitOrder> priceLevelIterator = priceLevel.listIterator();

      while (priceLevelIterator.hasNext()) {
        final LimitOrder order = priceLevelIterator.next();

        // Delete the order from the price level and order map if it belongs to this sender
        if (order.getSenderId().equals(senderId)) {
          count += 1;
          priceLevelIterator.remove();
          orderMap.remove(order.getOrderId());
          clientMap.remove(order.getClientOrderId());
        }
      }

      // Did we delete all orders from this price level?
      if (priceLevel.isEmpty()) {
        iterator.remove();
      }
    }

    return count;
  }

  public LimitOrder front() {
    if (priceMap.isEmpty()) {
      return null;
    }

    return priceMap.firstEntry().getValue().get(0);
  }

  public boolean isEmpty() {
    if (priceMap.isEmpty() && orderMap.isEmpty() && clientMap.isEmpty()) {
      return true;
    }

    if (!priceMap.isEmpty() && !orderMap.isEmpty() && !clientMap.isEmpty()) {
      return false;
    }

    throw new RuntimeException("Invalid book state: priceMap.isEmpty() " + priceMap.isEmpty()
        + ", orderMap.isEmpty() " + orderMap.isEmpty() + ", clientMap.isEmpty() "
        + clientMap.isEmpty());
  }

  public int count() {
    assert (orderMap.size() == clientMap.size());
    return orderMap.size();
  }

  public void clear() {
    priceMap.forEach((k, v) -> v.clear());
    priceMap.clear();
    orderMap.clear();
    clientMap.clear();
  }
}
