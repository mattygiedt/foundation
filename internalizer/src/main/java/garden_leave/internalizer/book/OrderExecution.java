package garden_leave.internalizer.book;

import garden_leave.fix42.proto.FIX42Protos;
import garden_leave.fix44.proto.FIX44Protos;
import garden_leave.fix50sp2.proto.FIX50SP2Protos;
import garden_leave.internalizer.data.ExecutionId;
import garden_leave.internalizer.data.ExecutionTypeCode;
import garden_leave.internalizer.data.FixTypeCode;
import garden_leave.internalizer.data.OrderId;
import garden_leave.internalizer.data.OrderStatusCode;
import garden_leave.internalizer.data.Price;
import garden_leave.internalizer.data.SideCode;
import garden_leave.internalizer.proto.ExecutionReportWrapper;

public class OrderExecution {
  private final int securityId;
  private final String symbol;
  private final String senderId;
  private final String clientOrderId;
  private final String origClientOrderId;
  private final OrderId orderId;
  private final ExecutionId executionId;
  private final Price limitPrice;
  private final Price fillPrice;
  private final Price averagePrice;
  private final long fillQuantity;
  private final long originalQuantity;
  private final long remainingQuantity;
  private final FixTypeCode fixType;
  private final SideCode side;
  final ExecutionTypeCode executionType;
  private final OrderStatusCode orderStatus;

  public OrderExecution(final int securityId, final String symbol, final String senderId,
      final String clientOrderId, final String origClientOrderId, final OrderId orderId,
      final Price limitPrice, final Price fillPrice, final Price averagePrice,
      final long fillQuantity, final long originalQuantity, final long remainingQuantity,
      final FixTypeCode fixType, final SideCode side, final ExecutionTypeCode executionType,
      final OrderStatusCode orderStatus) {
    this.executionId = ExecutionId.newExecutionId();
    this.securityId = securityId;
    this.symbol = symbol;
    this.senderId = senderId;
    this.clientOrderId = clientOrderId;
    this.origClientOrderId = origClientOrderId;
    this.orderId = orderId;
    this.limitPrice = limitPrice;
    this.fillPrice = fillPrice;
    this.averagePrice = averagePrice;
    this.fillQuantity = fillQuantity;
    this.originalQuantity = originalQuantity;
    this.remainingQuantity = remainingQuantity;
    this.fixType = fixType;
    this.side = side;
    this.executionType = executionType;
    this.orderStatus = orderStatus;
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

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public OrderId getOrderId() {
    return orderId;
  }

  public ExecutionId getExecutionId() {
    return executionId;
  }

  public Price getLimitPrice() {
    return limitPrice;
  }

  public Price getFillPrice() {
    return fillPrice;
  }

  public Price getAveragePrice() {
    return averagePrice;
  }

  public long getFillQuantity() {
    return fillQuantity;
  }

  public long getOriginalQuantity() {
    return originalQuantity;
  }

  public long getRemainingQuantity() {
    return remainingQuantity;
  }

  public long getCumulativeQuantity() {
    return originalQuantity - remainingQuantity;
  }

  public FixTypeCode getFixType() {
    return fixType;
  }

  public SideCode getSide() {
    return side;
  }

  public ExecutionTypeCode getExecutionType() {
    return executionType;
  }

  public OrderStatusCode getOrderStatus() {
    return orderStatus;
  }

  public ExecutionReportWrapper build(final ExecutionReportWrapper.Builder builder) {
    switch (getFixType()) {
      case FIX42:
        return fix42Response(builder);
      case FIX44:
        return fix44Response(builder);
      case FIX50SP2:
        return fix50Response(builder);
      case UNKNOWN:
      default:
        return null;
    }
  }

  private ExecutionReportWrapper fix42Response(final ExecutionReportWrapper.Builder builder) {
    final String beginString = "FIX.4.2";

    return builder
        .setExec42(
            FIX42Protos.ExecutionReport.newBuilder()
                .setHeader(FIX42Protos.Header.newBuilder()
                               .setBeginString(beginString)
                               .setSenderCompId(getSenderId())
                               .setFieldPresence(FIX42Protos.Header.FieldPresence.newBuilder()
                                                     .setBeginString(true)
                                                     .setSenderCompId(true)
                                                     .build())
                               .build())
                .setOrderQty(getOriginalQuantity())
                .setSecurityId(String.valueOf(getSecurityId()))
                .setSymbol(getSymbol())
                .setClOrdId(getClientOrderId())
                .setOrigClOrdId(getOrigClientOrderId())
                .setOrderId(getOrderId().toString())
                .setExecId(getExecutionId().toString())
                .setOrdStatus(getOrderStatus().toFixValue())
                .setSide(getSide().toFixValue())
                .setPrice(getLimitPrice().toDouble())
                .setOrderQty(getOriginalQuantity())
                .setLastShares(getFillQuantity())
                .setLeavesQty(getRemainingQuantity())
                .setCumQty(getCumulativeQuantity())
                .setAvgPx(getAveragePrice().toDouble())
                .setExecTransType(quickfix.field.ExecTransType.NEW)
                .setExecType(quickfix.field.ExecType.FILL)
                .setFieldPresence(FIX42Protos.ExecutionReport.FieldPresence.newBuilder()
                                      .setOrderQty(true)
                                      .setSecurityId(true)
                                      .setSymbol(true)
                                      .setClOrdId(true)
                                      .setOrigClOrdId(true)
                                      .setOrderId(true)
                                      .setExecId(true)
                                      .setOrdStatus(true)
                                      .setSide(true)
                                      .setPrice(true)
                                      .setOrderQty(true)
                                      .setLastShares(true)
                                      .setLeavesQty(true)
                                      .setCumQty(true)
                                      .setAvgPx(true)
                                      .setExecTransType(true)
                                      .setExecType(true)
                                      .build())
                .build())
        .build();
  }

  private ExecutionReportWrapper fix44Response(final ExecutionReportWrapper.Builder builder) {
    final String beginString = "FIX.4.4";

    return builder
        .setExec44(
            FIX44Protos.ExecutionReport.newBuilder()
                .setHeader(FIX44Protos.Header.newBuilder()
                               .setBeginString(beginString)
                               .setSenderCompId(getSenderId())
                               .setFieldPresence(FIX44Protos.Header.FieldPresence.newBuilder()
                                                     .setBeginString(true)
                                                     .setSenderCompId(true)
                                                     .build())
                               .build())
                .setOrderQty(getOriginalQuantity())
                .setSecurityId(String.valueOf(getSecurityId()))
                .setSymbol(getSymbol())
                .setClOrdId(getClientOrderId())
                .setOrigClOrdId(getOrigClientOrderId())
                .setOrderId(getOrderId().toString())
                .setExecId(getExecutionId().toString())
                .setOrdStatus(getOrderStatus().toFixValue())
                .setSide(getSide().toFixValue())
                .setPrice(getLimitPrice().toDouble())
                .setOrderQty(getOriginalQuantity())
                .setLastQty(getFillQuantity())
                .setLeavesQty(getRemainingQuantity())
                .setCumQty(getCumulativeQuantity())
                .setAvgPx(getAveragePrice().toDouble())
                .setExecType(quickfix.field.ExecType.NEW)
                .setFieldPresence(FIX44Protos.ExecutionReport.FieldPresence.newBuilder()
                                      .setOrderQty(true)
                                      .setSecurityId(true)
                                      .setSymbol(true)
                                      .setClOrdId(true)
                                      .setOrigClOrdId(true)
                                      .setOrderId(true)
                                      .setExecId(true)
                                      .setOrdStatus(true)
                                      .setSide(true)
                                      .setPrice(true)
                                      .setOrderQty(true)
                                      .setLastQty(true)
                                      .setLeavesQty(true)
                                      .setCumQty(true)
                                      .setAvgPx(true)
                                      .setExecType(true)
                                      .build())
                .build())
        .build();
  }

  private ExecutionReportWrapper fix50Response(final ExecutionReportWrapper.Builder builder) {
    final String beginString = "FIX.5.0";

    return builder
        .setExec50Sp2(
            FIX50SP2Protos.ExecutionReport.newBuilder()
                .setHeader(FIX50SP2Protos.Header.newBuilder()
                               .setBeginString(beginString)
                               .setSenderCompId(getSenderId())
                               .setFieldPresence(FIX50SP2Protos.Header.FieldPresence.newBuilder()
                                                     .setBeginString(true)
                                                     .setSenderCompId(true)
                                                     .build())
                               .build())
                .setOrderQty(getOriginalQuantity())
                .setSecurityId(String.valueOf(getSecurityId()))
                .setSymbol(getSymbol())
                .setClOrdId(getClientOrderId())
                .setOrderId(getOrderId().toString())
                .setOrigClOrdId(getOrigClientOrderId())
                .setExecId(getExecutionId().toString())
                .setOrdStatus(getOrderStatus().toFixValue())
                .setSide(getSide().toFixValue())
                .setPrice(getLimitPrice().toDouble())
                .setOrderQty(getOriginalQuantity())
                .setLastQty(getFillQuantity())
                .setLeavesQty(getRemainingQuantity())
                .setCumQty(getCumulativeQuantity())
                .setAvgPx(getAveragePrice().toDouble())
                .setExecType(quickfix.field.ExecType.NEW)
                .setFieldPresence(FIX50SP2Protos.ExecutionReport.FieldPresence.newBuilder()
                                      .setOrderQty(true)
                                      .setSecurityId(true)
                                      .setSymbol(true)
                                      .setClOrdId(true)
                                      .setOrigClOrdId(true)
                                      .setOrderId(true)
                                      .setExecId(true)
                                      .setOrdStatus(true)
                                      .setSide(true)
                                      .setPrice(true)
                                      .setOrderQty(true)
                                      .setLastQty(true)
                                      .setLeavesQty(true)
                                      .setCumQty(true)
                                      .setAvgPx(true)
                                      .setExecType(true)
                                      .build())
                .build())
        .build();
  }

  @Override
  public String toString() {
    return new StringBuilder("OrderExecution [")
        .append(fixType)
        .append(" orderId: ")
        .append(orderId.getOrderId())
        .append(", execId: ")
        .append(executionId)
        .append(", senderId: ")
        .append(senderId)
        .append(", clientOrderId: ")
        .append(clientOrderId)
        .append(", securityId: ")
        .append(securityId)
        .append("] limitPrice: ")
        .append(limitPrice)
        .append(", fillPrice: ")
        .append(fillPrice)
        .append(", avePrice: ")
        .append(averagePrice)
        .append(", side: ")
        .append(side.toString())
        .append(", origQty: ")
        .append(originalQuantity)
        .append(", fillQty: ")
        .append(fillQuantity)
        .append(", leavesQty: ")
        .append(remainingQuantity)
        .append(", executionType: ")
        .append(executionType)
        .append(", orderStatus: ")
        .append(orderStatus)
        .toString();
  }
}
