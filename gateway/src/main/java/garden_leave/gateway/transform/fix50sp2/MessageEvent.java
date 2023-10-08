package garden_leave.gateway.transform.fix50sp2;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.369948600
//

public final class MessageEvent {
  private MessageEvent() {}

  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public MessageEvent setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public final static com.lmax.disruptor.EventFactory<MessageEvent> EVENT_FACTORY =
      () -> new MessageEvent();

  private long sequence = 0L;
  public MessageEvent setSequence(final long sequence) {
    this.sequence = sequence;
    return this;
  }
  public long getSequence() {
    return this.sequence;
  }

  // QuoteResponse
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse quoteResponse = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse
      .Builder quoteResponseBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse getQuoteResponse() {
    return quoteResponse;
  }
  public MessageEvent setQuoteResponse(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse other) {
    setMessageEventType(MessageEventType.QUOTERESPONSE);
    quoteResponse = quoteResponseBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // MarketDataIncrementalRefresh
  private garden_leave.fix50sp2.proto.FIX50SP2Protos
      .MarketDataIncrementalRefresh marketDataIncrementalRefresh = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh
      .Builder marketDataIncrementalRefreshBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh
  getMarketDataIncrementalRefresh() {
    return marketDataIncrementalRefresh;
  }
  public MessageEvent setMarketDataIncrementalRefresh(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh other) {
    setMessageEventType(MessageEventType.MARKETDATAINCREMENTALREFRESH);
    marketDataIncrementalRefresh =
        marketDataIncrementalRefreshBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // NewOrderSingle
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle newOrderSingle = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle
      .Builder newOrderSingleBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle getNewOrderSingle() {
    return newOrderSingle;
  }
  public MessageEvent setNewOrderSingle(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle other) {
    setMessageEventType(MessageEventType.NEWORDERSINGLE);
    newOrderSingle = newOrderSingleBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // QuoteRequest
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest quoteRequest = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
      .Builder quoteRequestBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest getQuoteRequest() {
    return quoteRequest;
  }
  public MessageEvent setQuoteRequest(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest other) {
    setMessageEventType(MessageEventType.QUOTEREQUEST);
    quoteRequest = quoteRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelReplaceRequest
  private garden_leave.fix50sp2.proto.FIX50SP2Protos
      .OrderCancelReplaceRequest orderCancelReplaceRequest = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest
      .Builder orderCancelReplaceRequestBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest
  getOrderCancelReplaceRequest() {
    return orderCancelReplaceRequest;
  }
  public MessageEvent setOrderCancelReplaceRequest(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest other) {
    setMessageEventType(MessageEventType.ORDERCANCELREPLACEREQUEST);
    orderCancelReplaceRequest = orderCancelReplaceRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // QuoteCancel
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel quoteCancel = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel.Builder quoteCancelBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel getQuoteCancel() {
    return quoteCancel;
  }
  public MessageEvent setQuoteCancel(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel other) {
    setMessageEventType(MessageEventType.QUOTECANCEL);
    quoteCancel = quoteCancelBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // QuoteRequestReject
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject quoteRequestReject = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject
      .Builder quoteRequestRejectBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject getQuoteRequestReject() {
    return quoteRequestReject;
  }
  public MessageEvent setQuoteRequestReject(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject other) {
    setMessageEventType(MessageEventType.QUOTEREQUESTREJECT);
    quoteRequestReject = quoteRequestRejectBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // MarketDataSnapshotFullRefresh
  private garden_leave.fix50sp2.proto.FIX50SP2Protos
      .MarketDataSnapshotFullRefresh marketDataSnapshotFullRefresh = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
      .Builder marketDataSnapshotFullRefreshBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
  getMarketDataSnapshotFullRefresh() {
    return marketDataSnapshotFullRefresh;
  }
  public MessageEvent setMarketDataSnapshotFullRefresh(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh other) {
    setMessageEventType(MessageEventType.MARKETDATASNAPSHOTFULLREFRESH);
    marketDataSnapshotFullRefresh =
        marketDataSnapshotFullRefreshBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelReject
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject orderCancelReject = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject
      .Builder orderCancelRejectBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject getOrderCancelReject() {
    return orderCancelReject;
  }
  public MessageEvent setOrderCancelReject(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject other) {
    setMessageEventType(MessageEventType.ORDERCANCELREJECT);
    orderCancelReject = orderCancelRejectBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // ExecutionReport
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport executionReport = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
      .Builder executionReportBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport getExecutionReport() {
    return executionReport;
  }
  public MessageEvent setExecutionReport(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport other) {
    setMessageEventType(MessageEventType.EXECUTIONREPORT);
    executionReport = executionReportBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Ioi
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi ioi = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi.Builder ioiBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi getIoi() {
    return ioi;
  }
  public MessageEvent setIoi(final garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi other) {
    setMessageEventType(MessageEventType.IOI);
    ioi = ioiBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelRequest
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest orderCancelRequest = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
      .Builder orderCancelRequestBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest getOrderCancelRequest() {
    return orderCancelRequest;
  }
  public MessageEvent setOrderCancelRequest(
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest other) {
    setMessageEventType(MessageEventType.ORDERCANCELREQUEST);
    orderCancelRequest = orderCancelRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Quote
  private garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote quote = null;
  private final garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote.Builder quoteBuilder =
      garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote.newBuilder();
  public garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote getQuote() {
    return quote;
  }
  public MessageEvent setQuote(final garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote other) {
    setMessageEventType(MessageEventType.QUOTE);
    quote = quoteBuilder.clear().mergeFrom(other).build();
    return this;
  }

  public enum MessageEventType {
    UNKNOWN,
    MARKETDATAINCREMENTALREFRESH,
    ORDERCANCELREQUEST,
    ORDERCANCELREPLACEREQUEST,
    NEWORDERSINGLE,
    IOI,
    ORDERCANCELREJECT,
    QUOTERESPONSE,
    QUOTEREQUESTREJECT,
    MARKETDATASNAPSHOTFULLREFRESH,
    EXECUTIONREPORT,
    QUOTECANCEL,
    QUOTEREQUEST,
    QUOTE;
  }

  private MessageEventType eventType = MessageEventType.UNKNOWN;
  public MessageEventType getEventType() {
    return eventType;
  }
  private MessageEvent setMessageEventType(final MessageEventType eventType) {
    this.eventType = eventType;
    return this;
  }
}
