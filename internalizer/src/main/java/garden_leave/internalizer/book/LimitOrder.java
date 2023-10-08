package garden_leave.internalizer.book;

import garden_leave.internalizer.data.ExecutionTypeCode;
import garden_leave.internalizer.data.FixTypeCode;
import garden_leave.internalizer.data.OrderId;
import garden_leave.internalizer.data.OrderStatusCode;
import garden_leave.internalizer.data.OrderTypeCode;
import garden_leave.internalizer.data.Price;
import garden_leave.internalizer.data.SideCode;

public class LimitOrder {
  public static class LimitOrderBuilder {
    private int securityId = 0;
    private String symbol = null;
    private String senderId = null;
    private String clientOrderId = null;
    private String origClientOrderId = null;
    private Price limitPrice = null;
    private Price averagePrice = null;
    private OrderId orderId = null;
    private long originalQuantity = 0;
    private long executedQuantity = 0;
    private FixTypeCode fixType = FixTypeCode.UNKNOWN;
    private SideCode side = SideCode.UNKNOWN;
    private OrderStatusCode orderStatus = OrderStatusCode.UNKNOWN;

    public LimitOrderBuilder setSecurityId(final int securityId) {
      this.securityId = securityId;
      return this;
    }

    public LimitOrderBuilder setSecurityId(final String securityId) {
      this.securityId = Integer.parseInt(securityId);
      return this;
    }

    public LimitOrderBuilder setSymbol(final String symbol) {
      this.symbol = symbol;
      return this;
    }

    public LimitOrderBuilder setSenderId(final String senderId) {
      this.senderId = senderId;
      return this;
    }

    public LimitOrderBuilder setClientOrderId(final String clientOrderId) {
      this.clientOrderId = clientOrderId;
      return this;
    }

    public LimitOrderBuilder setOrderId(final OrderId orderId) {
      this.orderId = orderId;
      return this;
    }

    public LimitOrderBuilder setOrigClientOrderId(final String origClientOrderId) {
      this.origClientOrderId = origClientOrderId;
      return this;
    }

    public LimitOrderBuilder setLimitPrice(final Price price) {
      this.limitPrice = price;
      return this;
    }

    public LimitOrderBuilder setAveragePrice(final Price price) {
      this.averagePrice = price;
      return this;
    }

    public LimitOrderBuilder setOriginalQuantity(final double quantity) {
      this.originalQuantity = Double.valueOf(quantity).longValue();
      return this;
    }

    public LimitOrderBuilder setExecutedQuantity(final double quantity) {
      this.executedQuantity = Double.valueOf(quantity).longValue();
      return this;
    }

    public LimitOrderBuilder setOrderStatus(final OrderStatusCode orderStatus) {
      this.orderStatus = orderStatus;
      return this;
    }

    public LimitOrderBuilder setFixType(final FixTypeCode fixType) {
      this.fixType = fixType;
      return this;
    }

    public LimitOrderBuilder setSide(final SideCode side) {
      this.side = side;
      return this;
    }

    public void clear() {
      securityId = 0;
      limitPrice = null;
      averagePrice = null;
      senderId = null;
      clientOrderId = null;
      orderId = null;
      origClientOrderId = null;
      originalQuantity = 0;
      executedQuantity = 0;
      fixType = FixTypeCode.UNKNOWN;
      side = SideCode.UNKNOWN;
      orderStatus = OrderStatusCode.UNKNOWN;
    }

    public LimitOrderBuilder copy(final LimitOrder order) {
      securityId = order.getSecurityId();
      limitPrice = order.getLimitPrice();
      averagePrice = order.getAveragePrice();
      senderId = order.getSenderId();
      clientOrderId = order.getClientOrderId();
      orderId = order.getOrderId();
      origClientOrderId = order.getOrigClientOrderId();
      originalQuantity = order.getOriginalQuantity();
      executedQuantity = order.getExecutedQuantity();
      fixType = order.getFixType();
      side = order.getSide();
      orderStatus = order.getOrderStatus();
      return this;
    }

    public LimitOrder build() {
      if (limitPrice == null) {
        throw new IllegalArgumentException("invalid LimitOrder: price cannot be null");
      }

      if (senderId == null) {
        throw new IllegalArgumentException("invalid LimitOrder: senderId cannot be null");
      }

      if (clientOrderId == null) {
        throw new IllegalArgumentException("invalid LimitOrder: clientOrderId cannot be null");
      }

      if (securityId == 0) {
        throw new IllegalArgumentException("invalid LimitOrder: securityId is 0");
      }

      if (side == SideCode.UNKNOWN) {
        throw new IllegalArgumentException("invalid LimitOrder: side is UNKNOWN");
      }

      if (averagePrice == null) {
        averagePrice = Price.ZERO;
      }

      if (orderId == null) {
        orderId = OrderId.newOrderId();
        orderStatus = OrderStatusCode.PENDING_NEW;
      }

      if (origClientOrderId == null) {
        origClientOrderId = clientOrderId;
      }

      return new LimitOrder(senderId, clientOrderId, origClientOrderId, orderId, securityId, symbol,
          limitPrice, averagePrice, fixType, side, originalQuantity, executedQuantity, orderStatus);
    }
  }

  private final int securityId;
  private final Price limitPrice;
  private final FixTypeCode fixType;
  private final SideCode side;
  private final String senderId;
  private final String symbol;
  private final String clientOrderId;
  private final String origClientOrderId;
  private final OrderId orderId;
  private final long originalQuantity;
  private final OrderTypeCode orderType = OrderTypeCode.LIMIT;

  private long executedQuantity;
  private Price averagePrice;
  private OrderStatusCode orderStatus = OrderStatusCode.UNKNOWN;

  private LimitOrder(final String senderId, final String clientOrderId,
      final String origClientOrderId, final OrderId orderId, final int securityId,
      final String symbol, final Price limitPrice, final Price averagePrice,
      final FixTypeCode fixType, final SideCode side, final long originalQuantity,
      final long executedQuantity, final OrderStatusCode orderStatus) {
    this.senderId = senderId;
    this.clientOrderId = clientOrderId;
    this.orderId = orderId;
    this.origClientOrderId = origClientOrderId;
    this.securityId = securityId;
    this.symbol = symbol;
    this.limitPrice = limitPrice;
    this.averagePrice = averagePrice;
    this.fixType = fixType;
    this.side = side;
    this.orderStatus = orderStatus;
    this.originalQuantity = originalQuantity;
    this.executedQuantity = executedQuantity;
  }

  public int getSecurityId() {
    return securityId;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getSenderId() {
    return senderId;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public OrderId getOrderId() {
    return orderId;
  }

  public OrderTypeCode getOrderType() {
    return orderType;
  }

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public Price getLimitPrice() {
    return limitPrice;
  }

  public Price getAveragePrice() {
    return averagePrice;
  }

  public FixTypeCode getFixType() {
    return fixType;
  }

  public SideCode getSide() {
    return side;
  }

  public long getOriginalQuantity() {
    return originalQuantity;
  }

  public long getExecutedQuantity() {
    return executedQuantity;
  }

  public long getRemainingQuantity() {
    return originalQuantity - executedQuantity;
  }

  public OrderStatusCode getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(final OrderStatusCode orderStatus) {
    this.orderStatus = orderStatus;
  }

  public boolean isPendingStatus() {
    return this.orderStatus == OrderStatusCode.PENDING_NEW
        || this.orderStatus == OrderStatusCode.PENDING_MODIFY
        || this.orderStatus == OrderStatusCode.PENDING_CANCEL;
  }

  public boolean isOpenStatus() {
    return this.orderStatus == OrderStatusCode.NEW
        || this.orderStatus == OrderStatusCode.PARTIALLY_FILLED;
  }

  public boolean isExecutableAgainst(final LimitOrder other) {
    if (!isOpenStatus()) {
      return false;
    }

    if (getSide() == SideCode.BUY && other.getSide() == SideCode.SELL) {
      return limitPrice.getPrice() >= other.getLimitPrice().getPrice();
    } else if (getSide() == SideCode.SELL && other.getSide() == SideCode.BUY) {
      return limitPrice.getPrice() <= other.getLimitPrice().getPrice();
    }

    return false;
  }

  public OrderExecution close() {
    setOrderStatus(OrderStatusCode.COMPLETED);
    final int execQty = 0;
    return new OrderExecution(securityId, symbol, senderId, clientOrderId, origClientOrderId,
        orderId, limitPrice, Price.ZERO, averagePrice, execQty, originalQuantity, execQty, fixType,
        side, ExecutionTypeCode.NEW, orderStatus);
  }

  public OrderExecution cancel() {
    setOrderStatus(OrderStatusCode.CANCELLED);
    final int execQty = 0;
    return new OrderExecution(securityId, symbol, senderId, clientOrderId, origClientOrderId,
        orderId, limitPrice, Price.ZERO, averagePrice, execQty, originalQuantity, execQty, fixType,
        side, ExecutionTypeCode.NEW, orderStatus);
  }

  public OrderExecution execute(final long fillQuantity, final Price fillPrice) {
    if (executedQuantity + fillQuantity > originalQuantity) {
      throw new IllegalArgumentException("executed quantity exceeds remaining order size");
    }

    if (!isOpenStatus()) {
      final int execQty = 0;
      return new OrderExecution(securityId, symbol, senderId, clientOrderId, origClientOrderId,
          orderId, limitPrice, Price.ZERO, averagePrice, execQty, originalQuantity, execQty,
          fixType, side, ExecutionTypeCode.NEW, orderStatus);
    }

    double executedValue = averagePrice.toDouble() * executedQuantity;
    executedQuantity += fillQuantity;
    executedValue += fillPrice.toDouble() * fillQuantity;

    if (executedQuantity == 0) {
      setOrderStatus(OrderStatusCode.NEW);
    } else if (executedQuantity == originalQuantity) {
      averagePrice = new Price(executedValue / executedQuantity);
      setOrderStatus(OrderStatusCode.FILLED);
    } else {
      averagePrice = new Price(executedValue / executedQuantity);
      setOrderStatus(OrderStatusCode.PARTIALLY_FILLED);
    }

    return new OrderExecution(securityId, symbol, senderId, clientOrderId, origClientOrderId,
        orderId, limitPrice, fillPrice, averagePrice, fillQuantity, originalQuantity,
        getRemainingQuantity(), fixType, side, ExecutionTypeCode.NEW, getOrderStatus());
  }

  @Override
  public String toString() {
    return new StringBuilder("LimitOrder [")
        .append(fixType)
        .append(", senderId: ")
        .append(senderId)
        .append(" orderId: ")
        .append(orderId.getOrderId())
        .append(", clientOrderId: ")
        .append(clientOrderId)
        .append(", origClientOrderId: ")
        .append(origClientOrderId)
        .append(", securityId: ")
        .append(securityId)
        .append(", symbol: ")
        .append(symbol)
        .append("] limitPrice: ")
        .append(limitPrice)
        .append(", avePrice: ")
        .append(averagePrice)
        .append(", side: ")
        .append(side.toString())
        .append(", origQty: ")
        .append(originalQuantity)
        .append(", execQty: ")
        .append(executedQuantity)
        .append(", orderStatus: ")
        .append(orderStatus)
        .toString();
  }
}
