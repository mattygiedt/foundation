package garden_leave.gateway.transform.fix42;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.522077500
//

public abstract class MessageEventConsumer implements java.util.function.Consumer<MessageEvent> {
  @Override
  public void accept(final MessageEvent event) {
    final io.opentelemetry.api.trace.Span span = event.getSpan();
    try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
      switch (event.getEventType()) {
        case NEWORDERSINGLE:
          span.addEvent("NewOrderSingle.handleEvent:" + event.getSequence());
          handleNewOrderSingle(event);
          break;
        case SEQUENCERESET:
          span.addEvent("SequenceReset.handleEvent:" + event.getSequence());
          handleSequenceReset(event);
          break;
        case ORDERCANCELREJECT:
          span.addEvent("OrderCancelReject.handleEvent:" + event.getSequence());
          handleOrderCancelReject(event);
          break;
        case REJECT:
          span.addEvent("Reject.handleEvent:" + event.getSequence());
          handleReject(event);
          break;
        case INDICATIONOFINTEREST:
          span.addEvent("IndicationofInterest.handleEvent:" + event.getSequence());
          handleIndicationofInterest(event);
          break;
        case EXECUTIONREPORT:
          span.addEvent("ExecutionReport.handleEvent:" + event.getSequence());
          handleExecutionReport(event);
          break;
        case LOGOUT:
          span.addEvent("Logout.handleEvent:" + event.getSequence());
          handleLogout(event);
          break;
        case MARKETDATAINCREMENTALREFRESH:
          span.addEvent("MarketDataIncrementalRefresh.handleEvent:" + event.getSequence());
          handleMarketDataIncrementalRefresh(event);
          break;
        case RESENDREQUEST:
          span.addEvent("ResendRequest.handleEvent:" + event.getSequence());
          handleResendRequest(event);
          break;
        case LOGON:
          span.addEvent("Logon.handleEvent:" + event.getSequence());
          handleLogon(event);
          break;
        case QUOTEREQUEST:
          span.addEvent("QuoteRequest.handleEvent:" + event.getSequence());
          handleQuoteRequest(event);
          break;
        case QUOTECANCEL:
          span.addEvent("QuoteCancel.handleEvent:" + event.getSequence());
          handleQuoteCancel(event);
          break;
        case ORDERCANCELREQUEST:
          span.addEvent("OrderCancelRequest.handleEvent:" + event.getSequence());
          handleOrderCancelRequest(event);
          break;
        case TESTREQUEST:
          span.addEvent("TestRequest.handleEvent:" + event.getSequence());
          handleTestRequest(event);
          break;
        case QUOTE:
          span.addEvent("Quote.handleEvent:" + event.getSequence());
          handleQuote(event);
          break;
        case HEARTBEAT:
          span.addEvent("Heartbeat.handleEvent:" + event.getSequence());
          handleHeartbeat(event);
          break;
        case ORDERCANCELREPLACEREQUEST:
          span.addEvent("OrderCancelReplaceRequest.handleEvent:" + event.getSequence());
          handleOrderCancelReplaceRequest(event);
          break;
        case MARKETDATASNAPSHOTFULLREFRESH:
          span.addEvent("MarketDataSnapshotFullRefresh.handleEvent:" + event.getSequence());
          handleMarketDataSnapshotFullRefresh(event);
          break;
        default:
          throw new UnsupportedOperationException("Unhandled event type: " + event.getEventType());
      }
    } catch (final Throwable t) {
      throw new RuntimeException(t);
    } finally {
      span.end();
    }
  }

  public abstract void handleNewOrderSingle(final MessageEvent event) throws Exception;
  public abstract void handleSequenceReset(final MessageEvent event) throws Exception;
  public abstract void handleOrderCancelReject(final MessageEvent event) throws Exception;
  public abstract void handleReject(final MessageEvent event) throws Exception;
  public abstract void handleIndicationofInterest(final MessageEvent event) throws Exception;
  public abstract void handleExecutionReport(final MessageEvent event) throws Exception;
  public abstract void handleLogout(final MessageEvent event) throws Exception;
  public abstract void handleMarketDataIncrementalRefresh(final MessageEvent event)
      throws Exception;
  public abstract void handleResendRequest(final MessageEvent event) throws Exception;
  public abstract void handleLogon(final MessageEvent event) throws Exception;
  public abstract void handleQuoteRequest(final MessageEvent event) throws Exception;
  public abstract void handleQuoteCancel(final MessageEvent event) throws Exception;
  public abstract void handleOrderCancelRequest(final MessageEvent event) throws Exception;
  public abstract void handleTestRequest(final MessageEvent event) throws Exception;
  public abstract void handleQuote(final MessageEvent event) throws Exception;
  public abstract void handleHeartbeat(final MessageEvent event) throws Exception;
  public abstract void handleOrderCancelReplaceRequest(final MessageEvent event) throws Exception;
  public abstract void handleMarketDataSnapshotFullRefresh(final MessageEvent event)
      throws Exception;

  /**
  -- Copy into your event handler class...
  @Override
  public void handleNewOrderSingle(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.NewOrderSingle newOrderSingle =
  event.getNewOrderSingle(); logger.info("handleNewOrderSingle: seq {}, msg {}",
  event.getSequence(), newOrderSingle.toString());
  }

  @Override
  public void handleSequenceReset(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.SequenceReset sequenceReset =
  event.getSequenceReset(); logger.info("handleSequenceReset: seq {}, msg {}", event.getSequence(),
  sequenceReset.toString());
  }

  @Override
  public void handleOrderCancelReject(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject orderCancelReject =
  event.getOrderCancelReject(); logger.info("handleOrderCancelReject: seq {}, msg {}",
  event.getSequence(), orderCancelReject.toString());
  }

  @Override
  public void handleReject(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Reject reject = event.getReject();
    logger.info("handleReject: seq {}, msg {}", event.getSequence(), reject.toString());
  }

  @Override
  public void handleIndicationofInterest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest indicationofInterest =
  event.getIndicationofInterest(); logger.info("handleIndicationofInterest: seq {}, msg {}",
  event.getSequence(), indicationofInterest.toString());
  }

  @Override
  public void handleExecutionReport(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.ExecutionReport executionReport =
  event.getExecutionReport(); logger.info("handleExecutionReport: seq {}, msg {}",
  event.getSequence(), executionReport.toString());
  }

  @Override
  public void handleLogout(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Logout logout = event.getLogout();
    logger.info("handleLogout: seq {}, msg {}", event.getSequence(), logout.toString());
  }

  @Override
  public void handleMarketDataIncrementalRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
  marketDataIncrementalRefresh = event.getMarketDataIncrementalRefresh();
    logger.info("handleMarketDataIncrementalRefresh: seq {}, msg {}", event.getSequence(),
  marketDataIncrementalRefresh.toString());
  }

  @Override
  public void handleResendRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.ResendRequest resendRequest =
  event.getResendRequest(); logger.info("handleResendRequest: seq {}, msg {}", event.getSequence(),
  resendRequest.toString());
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
  event.getOrderCancelRequest(); logger.info("handleOrderCancelRequest: seq {}, msg {}",
  event.getSequence(), orderCancelRequest.toString());
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
  event.getOrderCancelReplaceRequest(); logger.info("handleOrderCancelReplaceRequest: seq {}, msg
  {}", event.getSequence(), orderCancelReplaceRequest.toString());
  }

  @Override
  public void handleMarketDataSnapshotFullRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh
  marketDataSnapshotFullRefresh = event.getMarketDataSnapshotFullRefresh();
    logger.info("handleMarketDataSnapshotFullRefresh: seq {}, msg {}", event.getSequence(),
  marketDataSnapshotFullRefresh.toString());
  }

  *
*/
}
