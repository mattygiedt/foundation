package garden_leave.gateway.example.initiator.fix44;

import garden_leave.gateway.transform.fix44.MessageEvent;
import garden_leave.gateway.transform.fix44.MessageEventConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageConsumer extends MessageEventConsumer {
  private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

  @Override
  public void handleSequenceReset(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.SequenceReset sequenceReset =
        event.getSequenceReset();
    logger.info(
        "handleSequenceReset: seq {}, msg {}", event.getSequence(), sequenceReset.toString());
  }

  @Override
  public void handleReject(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.Reject reject = event.getReject();
    logger.info("handleReject: seq {}, msg {}", event.getSequence(), reject.toString());
  }

  @Override
  public void handleQuoteResponse(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.QuoteResponse quoteResponse =
        event.getQuoteResponse();
    logger.info(
        "handleQuoteResponse: seq {}, msg {}", event.getSequence(), quoteResponse.toString());
  }

  @Override
  public void handleMarketDataIncrementalRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos
        .MarketDataIncrementalRefresh marketDataIncrementalRefresh =
        event.getMarketDataIncrementalRefresh();
    logger.info("handleMarketDataIncrementalRefresh: seq {}, msg {}", event.getSequence(),
        marketDataIncrementalRefresh.toString());
  }

  @Override
  public void handleResendRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.ResendRequest resendRequest =
        event.getResendRequest();
    logger.info(
        "handleResendRequest: seq {}, msg {}", event.getSequence(), resendRequest.toString());
  }

  @Override
  public void handleQuoteCancel(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.QuoteCancel quoteCancel = event.getQuoteCancel();
    logger.info("handleQuoteCancel: seq {}, msg {}", event.getSequence(), quoteCancel.toString());
  }

  @Override
  public void handleQuoteRequestReject(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.QuoteRequestReject quoteRequestReject =
        event.getQuoteRequestReject();
    logger.info("handleQuoteRequestReject: seq {}, msg {}", event.getSequence(),
        quoteRequestReject.toString());
  }

  @Override
  public void handleTestRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.TestRequest testRequest = event.getTestRequest();
    logger.info("handleTestRequest: seq {}, msg {}", event.getSequence(), testRequest.toString());
  }

  @Override
  public void handleHeartbeat(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.Heartbeat heartbeat = event.getHeartbeat();
    logger.info("handleHeartbeat: seq {}, msg {}", event.getSequence(), heartbeat.toString());
  }

  @Override
  public void handleMarketDataSnapshotFullRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos
        .MarketDataSnapshotFullRefresh marketDataSnapshotFullRefresh =
        event.getMarketDataSnapshotFullRefresh();
    logger.info("handleMarketDataSnapshotFullRefresh: seq {}, msg {}", event.getSequence(),
        marketDataSnapshotFullRefresh.toString());
  }

  @Override
  public void handleNewOrderSingle(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle newOrderSingle =
        event.getNewOrderSingle();
    logger.info(
        "handleNewOrderSingle: seq {}, msg {}", event.getSequence(), newOrderSingle.toString());
  }

  @Override
  public void handleOrderCancelReject(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.OrderCancelReject orderCancelReject =
        event.getOrderCancelReject();
    logger.info("handleOrderCancelReject: seq {}, msg {}", event.getSequence(),
        orderCancelReject.toString());
  }

  @Override
  public void handleExecutionReport(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.ExecutionReport executionReport =
        event.getExecutionReport();
    logger.info(
        "handleExecutionReport: seq {}, msg {}", event.getSequence(), executionReport.toString());
  }

  @Override
  public void handleLogout(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.Logout logout = event.getLogout();
    logger.info("handleLogout: seq {}, msg {}", event.getSequence(), logout.toString());
  }

  @Override
  public void handleIndicationOfInterest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.IndicationOfInterest indicationOfInterest =
        event.getIndicationOfInterest();
    logger.info("handleIndicationOfInterest: seq {}, msg {}", event.getSequence(),
        indicationOfInterest.toString());
  }

  @Override
  public void handleLogon(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.Logon logon = event.getLogon();
    logger.info("handleLogon: seq {}, msg {}", event.getSequence(), logon.toString());
  }

  @Override
  public void handleQuoteRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.QuoteRequest quoteRequest = event.getQuoteRequest();
    logger.info("handleQuoteRequest: seq {}, msg {}", event.getSequence(), quoteRequest.toString());
  }

  @Override
  public void handleOrderCancelRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.OrderCancelRequest orderCancelRequest =
        event.getOrderCancelRequest();
    logger.info("handleOrderCancelRequest: seq {}, msg {}", event.getSequence(),
        orderCancelRequest.toString());
  }

  @Override
  public void handleQuote(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.Quote quote = event.getQuote();
    logger.info("handleQuote: seq {}, msg {}", event.getSequence(), quote.toString());
  }

  @Override
  public void handleOrderCancelReplaceRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix44.proto.FIX44Protos.OrderCancelReplaceRequest orderCancelReplaceRequest =
        event.getOrderCancelReplaceRequest();
    logger.info("handleOrderCancelReplaceRequest: seq {}, msg {}", event.getSequence(),
        orderCancelReplaceRequest.toString());
  }
}
