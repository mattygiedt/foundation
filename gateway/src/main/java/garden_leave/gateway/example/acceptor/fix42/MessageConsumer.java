package garden_leave.gateway.example.acceptor.fix42;

import garden_leave.gateway.GatewayUtils;
import garden_leave.gateway.transform.fix42.ExecutionReport;
import garden_leave.gateway.transform.fix42.MessageEvent;
import garden_leave.gateway.transform.fix42.MessageEventConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageConsumer extends MessageEventConsumer {
  private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

  @Override
  public void handleNewOrderSingle(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.NewOrderSingle newOrderSingle =
        event.getNewOrderSingle();
    logger.info(
        "handleNewOrderSingle: seq {}, msg {}", event.getSequence(), newOrderSingle.toString());

    final quickfix.SessionID sessionId = GatewayUtils.createSessionIdForSendToTarget(
        ExecutionReport.BEGINSTR, newOrderSingle.getHeader().getSenderCompId(),
        newOrderSingle.getHeader().getTargetCompId());

    final String orderId = java.util.UUID.randomUUID().toString();

    // New
    quickfix.Session.sendToTarget(new ExecutionReport()
                                      .setOrderId(orderId)
                                      .setClOrdId(newOrderSingle.getClOrdId())
                                      .setExecId(java.util.UUID.randomUUID().toString())
                                      .setExecTransType(quickfix.field.ExecTransType.NEW)
                                      .setExecType(quickfix.field.ExecType.FILL)
                                      .setOrdStatus(quickfix.field.OrdStatus.NEW)
                                      .setSymbol(newOrderSingle.getSymbol())
                                      .setSide(newOrderSingle.getSide())
                                      .setLastShares(0)
                                      .setLeavesQty(newOrderSingle.getOrderQty())
                                      .setCumQty(0)
                                      .setAvgPx(0),
        sessionId);

    // Filled with a contra broker group
    ExecutionReport execRpt = new ExecutionReport()
                                  .setOrderId(orderId)
                                  .setClOrdId(newOrderSingle.getClOrdId())
                                  .setExecId(java.util.UUID.randomUUID().toString())
                                  .setExecTransType(quickfix.field.ExecTransType.NEW)
                                  .setExecType(quickfix.field.ExecType.FILL)
                                  .setOrdStatus(quickfix.field.OrdStatus.FILLED)
                                  .setSymbol(newOrderSingle.getSymbol())
                                  .setSide(newOrderSingle.getSide())
                                  .setLastShares(newOrderSingle.getOrderQty())
                                  .setLastPx(newOrderSingle.getPrice())
                                  .setLeavesQty(0)
                                  .setCumQty(newOrderSingle.getOrderQty())
                                  .setAvgPx(newOrderSingle.getPrice());
    execRpt.addGroup(new ExecutionReport.NoContraBrokers()
                         .setContraTradeTime(System.currentTimeMillis())
                         .setContraTradeQty(newOrderSingle.getOrderQty())
                         .setContraBroker("JPM")
                         .setContraTrader("JDibacco"));

    quickfix.Session.sendToTarget(execRpt, sessionId);
  }

  @Override
  public void handleSequenceReset(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.SequenceReset sequenceReset =
        event.getSequenceReset();
    logger.info(
        "handleSequenceReset: seq {}, msg {}", event.getSequence(), sequenceReset.toString());
  }

  @Override
  public void handleOrderCancelReject(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject orderCancelReject =
        event.getOrderCancelReject();
    logger.info("handleOrderCancelReject: seq {}, msg {}", event.getSequence(),
        orderCancelReject.toString());
  }

  @Override
  public void handleReject(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Reject reject = event.getReject();
    logger.info("handleReject: seq {}, msg {}", event.getSequence(), reject.toString());
  }

  @Override
  public void handleIndicationofInterest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest indicationofInterest =
        event.getIndicationofInterest();
    logger.info("handleIndicationofInterest: seq {}, msg {}", event.getSequence(),
        indicationofInterest.toString());
  }

  @Override
  public void handleExecutionReport(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.ExecutionReport executionReport =
        event.getExecutionReport();
    logger.info(
        "handleExecutionReport: seq {}, msg {}", event.getSequence(), executionReport.toString());
  }

  @Override
  public void handleLogout(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Logout logout = event.getLogout();
    logger.info("handleLogout: seq {}, msg {}", event.getSequence(), logout.toString());
  }

  @Override
  public void handleMarketDataIncrementalRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos
        .MarketDataIncrementalRefresh marketDataIncrementalRefresh =
        event.getMarketDataIncrementalRefresh();
    logger.info("handleMarketDataIncrementalRefresh: seq {}, msg {}", event.getSequence(),
        marketDataIncrementalRefresh.toString());
  }

  @Override
  public void handleResendRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.ResendRequest resendRequest =
        event.getResendRequest();
    logger.info(
        "handleResendRequest: seq {}, msg {}", event.getSequence(), resendRequest.toString());
  }

  @Override
  public void handleLogon(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Logon logon = event.getLogon();
    logger.info("handleLogon: seq {}, msg {}", event.getSequence(), logon.toString());
  }

  @Override
  public void handleQuoteRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.QuoteRequest quoteRequest = event.getQuoteRequest();
    logger.info("handleQuoteRequest: seq {}, msg {}", event.getSequence(), quoteRequest.toString());
  }

  @Override
  public void handleQuoteCancel(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.QuoteCancel quoteCancel = event.getQuoteCancel();
    logger.info("handleQuoteCancel: seq {}, msg {}", event.getSequence(), quoteCancel.toString());
  }

  @Override
  public void handleOrderCancelRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest orderCancelRequest =
        event.getOrderCancelRequest();
    logger.info("handleOrderCancelRequest: seq {}, msg {}", event.getSequence(),
        orderCancelRequest.toString());
  }

  @Override
  public void handleTestRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.TestRequest testRequest = event.getTestRequest();
    logger.info("handleTestRequest: seq {}, msg {}", event.getSequence(), testRequest.toString());
  }

  @Override
  public void handleQuote(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Quote quote = event.getQuote();
    logger.info("handleQuote: seq {}, msg {}", event.getSequence(), quote.toString());
  }

  @Override
  public void handleHeartbeat(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Heartbeat heartbeat = event.getHeartbeat();
    logger.info("handleHeartbeat: seq {}, msg {}", event.getSequence(), heartbeat.toString());
  }

  @Override
  public void handleOrderCancelReplaceRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest orderCancelReplaceRequest =
        event.getOrderCancelReplaceRequest();
    logger.info("handleOrderCancelReplaceRequest: seq {}, msg {}", event.getSequence(),
        orderCancelReplaceRequest.toString());
  }

  @Override
  public void handleMarketDataSnapshotFullRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos
        .MarketDataSnapshotFullRefresh marketDataSnapshotFullRefresh =
        event.getMarketDataSnapshotFullRefresh();
    logger.info("handleMarketDataSnapshotFullRefresh: seq {}, msg {}", event.getSequence(),
        marketDataSnapshotFullRefresh.toString());
  }
}
