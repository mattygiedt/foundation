package garden_leave.gateway.transform.fix50sp2;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.374423900
//

public abstract class MessageEventConsumer implements java.util.function.Consumer<MessageEvent> {
  @Override
  public void accept(final MessageEvent event) {
    final io.opentelemetry.api.trace.Span span = event.getSpan();
    try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
      switch (event.getEventType()) {
        case QUOTERESPONSE:
          span.addEvent("QuoteResponse.handleEvent:" + event.getSequence());
          handleQuoteResponse(event);
          break;
        case MARKETDATAINCREMENTALREFRESH:
          span.addEvent("MarketDataIncrementalRefresh.handleEvent:" + event.getSequence());
          handleMarketDataIncrementalRefresh(event);
          break;
        case NEWORDERSINGLE:
          span.addEvent("NewOrderSingle.handleEvent:" + event.getSequence());
          handleNewOrderSingle(event);
          break;
        case QUOTEREQUEST:
          span.addEvent("QuoteRequest.handleEvent:" + event.getSequence());
          handleQuoteRequest(event);
          break;
        case ORDERCANCELREPLACEREQUEST:
          span.addEvent("OrderCancelReplaceRequest.handleEvent:" + event.getSequence());
          handleOrderCancelReplaceRequest(event);
          break;
        case QUOTECANCEL:
          span.addEvent("QuoteCancel.handleEvent:" + event.getSequence());
          handleQuoteCancel(event);
          break;
        case QUOTEREQUESTREJECT:
          span.addEvent("QuoteRequestReject.handleEvent:" + event.getSequence());
          handleQuoteRequestReject(event);
          break;
        case MARKETDATASNAPSHOTFULLREFRESH:
          span.addEvent("MarketDataSnapshotFullRefresh.handleEvent:" + event.getSequence());
          handleMarketDataSnapshotFullRefresh(event);
          break;
        case ORDERCANCELREJECT:
          span.addEvent("OrderCancelReject.handleEvent:" + event.getSequence());
          handleOrderCancelReject(event);
          break;
        case EXECUTIONREPORT:
          span.addEvent("ExecutionReport.handleEvent:" + event.getSequence());
          handleExecutionReport(event);
          break;
        case IOI:
          span.addEvent("Ioi.handleEvent:" + event.getSequence());
          handleIoi(event);
          break;
        case ORDERCANCELREQUEST:
          span.addEvent("OrderCancelRequest.handleEvent:" + event.getSequence());
          handleOrderCancelRequest(event);
          break;
        case QUOTE:
          span.addEvent("Quote.handleEvent:" + event.getSequence());
          handleQuote(event);
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

  public abstract void handleQuoteResponse(final MessageEvent event) throws Exception;
  public abstract void handleMarketDataIncrementalRefresh(final MessageEvent event)
      throws Exception;
  public abstract void handleNewOrderSingle(final MessageEvent event) throws Exception;
  public abstract void handleQuoteRequest(final MessageEvent event) throws Exception;
  public abstract void handleOrderCancelReplaceRequest(final MessageEvent event) throws Exception;
  public abstract void handleQuoteCancel(final MessageEvent event) throws Exception;
  public abstract void handleQuoteRequestReject(final MessageEvent event) throws Exception;
  public abstract void handleMarketDataSnapshotFullRefresh(final MessageEvent event)
      throws Exception;
  public abstract void handleOrderCancelReject(final MessageEvent event) throws Exception;
  public abstract void handleExecutionReport(final MessageEvent event) throws Exception;
  public abstract void handleIoi(final MessageEvent event) throws Exception;
  public abstract void handleOrderCancelRequest(final MessageEvent event) throws Exception;
  public abstract void handleQuote(final MessageEvent event) throws Exception;

  /**
  -- Copy into your event handler class...
  @Override
  public void handleQuoteResponse(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse quoteResponse =
  event.getQuoteResponse(); logger.info("handleQuoteResponse: seq {}, msg {}", event.getSequence(),
  quoteResponse.toString());
  }

  @Override
  public void handleMarketDataIncrementalRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh
  marketDataIncrementalRefresh = event.getMarketDataIncrementalRefresh();
    logger.info("handleMarketDataIncrementalRefresh: seq {}, msg {}", event.getSequence(),
  marketDataIncrementalRefresh.toString());
  }

  @Override
  public void handleNewOrderSingle(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle newOrderSingle =
  event.getNewOrderSingle(); logger.info("handleNewOrderSingle: seq {}, msg {}",
  event.getSequence(), newOrderSingle.toString());
  }

  @Override
  public void handleQuoteRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest quoteRequest =
  event.getQuoteRequest(); logger.info("handleQuoteRequest: seq {}, msg {}", event.getSequence(),
  quoteRequest.toString());
  }

  @Override
  public void handleOrderCancelReplaceRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest
  orderCancelReplaceRequest = event.getOrderCancelReplaceRequest();
    logger.info("handleOrderCancelReplaceRequest: seq {}, msg {}", event.getSequence(),
  orderCancelReplaceRequest.toString());
  }

  @Override
  public void handleQuoteCancel(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel quoteCancel =
  event.getQuoteCancel(); logger.info("handleQuoteCancel: seq {}, msg {}", event.getSequence(),
  quoteCancel.toString());
  }

  @Override
  public void handleQuoteRequestReject(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject quoteRequestReject =
  event.getQuoteRequestReject(); logger.info("handleQuoteRequestReject: seq {}, msg {}",
  event.getSequence(), quoteRequestReject.toString());
  }

  @Override
  public void handleMarketDataSnapshotFullRefresh(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
  marketDataSnapshotFullRefresh = event.getMarketDataSnapshotFullRefresh();
    logger.info("handleMarketDataSnapshotFullRefresh: seq {}, msg {}", event.getSequence(),
  marketDataSnapshotFullRefresh.toString());
  }

  @Override
  public void handleOrderCancelReject(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject orderCancelReject =
  event.getOrderCancelReject(); logger.info("handleOrderCancelReject: seq {}, msg {}",
  event.getSequence(), orderCancelReject.toString());
  }

  @Override
  public void handleExecutionReport(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport executionReport =
  event.getExecutionReport(); logger.info("handleExecutionReport: seq {}, msg {}",
  event.getSequence(), executionReport.toString());
  }

  @Override
  public void handleIoi(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi ioi = event.getIoi();
    logger.info("handleIoi: seq {}, msg {}", event.getSequence(), ioi.toString());
  }

  @Override
  public void handleOrderCancelRequest(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest orderCancelRequest =
  event.getOrderCancelRequest(); logger.info("handleOrderCancelRequest: seq {}, msg {}",
  event.getSequence(), orderCancelRequest.toString());
  }

  @Override
  public void handleQuote(final MessageEvent event) throws Exception {
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote quote = event.getQuote();
    logger.info("handleQuote: seq {}, msg {}", event.getSequence(), quote.toString());
  }

  *
*/
}
