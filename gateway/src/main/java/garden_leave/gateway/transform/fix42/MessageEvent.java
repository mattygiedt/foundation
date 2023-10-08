package garden_leave.gateway.transform.fix42;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.519260800
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

  // SequenceReset
  private garden_leave.fix42.proto.FIX42Protos.SequenceReset sequenceReset = null;
  private final garden_leave.fix42.proto.FIX42Protos.SequenceReset.Builder sequenceResetBuilder =
      garden_leave.fix42.proto.FIX42Protos.SequenceReset.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.SequenceReset getSequenceReset() {
    return sequenceReset;
  }
  public MessageEvent setSequenceReset(
      final garden_leave.fix42.proto.FIX42Protos.SequenceReset other) {
    setMessageEventType(MessageEventType.SEQUENCERESET);
    sequenceReset = sequenceResetBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Reject
  private garden_leave.fix42.proto.FIX42Protos.Reject reject = null;
  private final garden_leave.fix42.proto.FIX42Protos.Reject.Builder rejectBuilder =
      garden_leave.fix42.proto.FIX42Protos.Reject.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.Reject getReject() {
    return reject;
  }
  public MessageEvent setReject(final garden_leave.fix42.proto.FIX42Protos.Reject other) {
    setMessageEventType(MessageEventType.REJECT);
    reject = rejectBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Logout
  private garden_leave.fix42.proto.FIX42Protos.Logout logout = null;
  private final garden_leave.fix42.proto.FIX42Protos.Logout.Builder logoutBuilder =
      garden_leave.fix42.proto.FIX42Protos.Logout.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.Logout getLogout() {
    return logout;
  }
  public MessageEvent setLogout(final garden_leave.fix42.proto.FIX42Protos.Logout other) {
    setMessageEventType(MessageEventType.LOGOUT);
    logout = logoutBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // ResendRequest
  private garden_leave.fix42.proto.FIX42Protos.ResendRequest resendRequest = null;
  private final garden_leave.fix42.proto.FIX42Protos.ResendRequest.Builder resendRequestBuilder =
      garden_leave.fix42.proto.FIX42Protos.ResendRequest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.ResendRequest getResendRequest() {
    return resendRequest;
  }
  public MessageEvent setResendRequest(
      final garden_leave.fix42.proto.FIX42Protos.ResendRequest other) {
    setMessageEventType(MessageEventType.RESENDREQUEST);
    resendRequest = resendRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Logon
  private garden_leave.fix42.proto.FIX42Protos.Logon logon = null;
  private final garden_leave.fix42.proto.FIX42Protos.Logon.Builder logonBuilder =
      garden_leave.fix42.proto.FIX42Protos.Logon.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.Logon getLogon() {
    return logon;
  }
  public MessageEvent setLogon(final garden_leave.fix42.proto.FIX42Protos.Logon other) {
    setMessageEventType(MessageEventType.LOGON);
    logon = logonBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // TestRequest
  private garden_leave.fix42.proto.FIX42Protos.TestRequest testRequest = null;
  private final garden_leave.fix42.proto.FIX42Protos.TestRequest.Builder testRequestBuilder =
      garden_leave.fix42.proto.FIX42Protos.TestRequest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.TestRequest getTestRequest() {
    return testRequest;
  }
  public MessageEvent setTestRequest(final garden_leave.fix42.proto.FIX42Protos.TestRequest other) {
    setMessageEventType(MessageEventType.TESTREQUEST);
    testRequest = testRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Heartbeat
  private garden_leave.fix42.proto.FIX42Protos.Heartbeat heartbeat = null;
  private final garden_leave.fix42.proto.FIX42Protos.Heartbeat.Builder heartbeatBuilder =
      garden_leave.fix42.proto.FIX42Protos.Heartbeat.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.Heartbeat getHeartbeat() {
    return heartbeat;
  }
  public MessageEvent setHeartbeat(final garden_leave.fix42.proto.FIX42Protos.Heartbeat other) {
    setMessageEventType(MessageEventType.HEARTBEAT);
    heartbeat = heartbeatBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // NewOrderSingle
  private garden_leave.fix42.proto.FIX42Protos.NewOrderSingle newOrderSingle = null;
  private final garden_leave.fix42.proto.FIX42Protos.NewOrderSingle.Builder newOrderSingleBuilder =
      garden_leave.fix42.proto.FIX42Protos.NewOrderSingle.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.NewOrderSingle getNewOrderSingle() {
    return newOrderSingle;
  }
  public MessageEvent setNewOrderSingle(
      final garden_leave.fix42.proto.FIX42Protos.NewOrderSingle other) {
    setMessageEventType(MessageEventType.NEWORDERSINGLE);
    newOrderSingle = newOrderSingleBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelReject
  private garden_leave.fix42.proto.FIX42Protos.OrderCancelReject orderCancelReject = null;
  private final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject
      .Builder orderCancelRejectBuilder =
      garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.OrderCancelReject getOrderCancelReject() {
    return orderCancelReject;
  }
  public MessageEvent setOrderCancelReject(
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject other) {
    setMessageEventType(MessageEventType.ORDERCANCELREJECT);
    orderCancelReject = orderCancelRejectBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // IndicationofInterest
  private garden_leave.fix42.proto.FIX42Protos.IndicationofInterest indicationofInterest = null;
  private final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest
      .Builder indicationofInterestBuilder =
      garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.IndicationofInterest getIndicationofInterest() {
    return indicationofInterest;
  }
  public MessageEvent setIndicationofInterest(
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest other) {
    setMessageEventType(MessageEventType.INDICATIONOFINTEREST);
    indicationofInterest = indicationofInterestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // ExecutionReport
  private garden_leave.fix42.proto.FIX42Protos.ExecutionReport executionReport = null;
  private final garden_leave.fix42.proto.FIX42Protos.ExecutionReport
      .Builder executionReportBuilder =
      garden_leave.fix42.proto.FIX42Protos.ExecutionReport.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.ExecutionReport getExecutionReport() {
    return executionReport;
  }
  public MessageEvent setExecutionReport(
      final garden_leave.fix42.proto.FIX42Protos.ExecutionReport other) {
    setMessageEventType(MessageEventType.EXECUTIONREPORT);
    executionReport = executionReportBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // MarketDataIncrementalRefresh
  private garden_leave.fix42.proto.FIX42Protos
      .MarketDataIncrementalRefresh marketDataIncrementalRefresh = null;
  private final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
      .Builder marketDataIncrementalRefreshBuilder =
      garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
  getMarketDataIncrementalRefresh() {
    return marketDataIncrementalRefresh;
  }
  public MessageEvent setMarketDataIncrementalRefresh(
      final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh other) {
    setMessageEventType(MessageEventType.MARKETDATAINCREMENTALREFRESH);
    marketDataIncrementalRefresh =
        marketDataIncrementalRefreshBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // QuoteRequest
  private garden_leave.fix42.proto.FIX42Protos.QuoteRequest quoteRequest = null;
  private final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.Builder quoteRequestBuilder =
      garden_leave.fix42.proto.FIX42Protos.QuoteRequest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.QuoteRequest getQuoteRequest() {
    return quoteRequest;
  }
  public MessageEvent setQuoteRequest(
      final garden_leave.fix42.proto.FIX42Protos.QuoteRequest other) {
    setMessageEventType(MessageEventType.QUOTEREQUEST);
    quoteRequest = quoteRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // QuoteCancel
  private garden_leave.fix42.proto.FIX42Protos.QuoteCancel quoteCancel = null;
  private final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.Builder quoteCancelBuilder =
      garden_leave.fix42.proto.FIX42Protos.QuoteCancel.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.QuoteCancel getQuoteCancel() {
    return quoteCancel;
  }
  public MessageEvent setQuoteCancel(final garden_leave.fix42.proto.FIX42Protos.QuoteCancel other) {
    setMessageEventType(MessageEventType.QUOTECANCEL);
    quoteCancel = quoteCancelBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelRequest
  private garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest orderCancelRequest = null;
  private final garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest
      .Builder orderCancelRequestBuilder =
      garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest getOrderCancelRequest() {
    return orderCancelRequest;
  }
  public MessageEvent setOrderCancelRequest(
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest other) {
    setMessageEventType(MessageEventType.ORDERCANCELREQUEST);
    orderCancelRequest = orderCancelRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Quote
  private garden_leave.fix42.proto.FIX42Protos.Quote quote = null;
  private final garden_leave.fix42.proto.FIX42Protos.Quote.Builder quoteBuilder =
      garden_leave.fix42.proto.FIX42Protos.Quote.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.Quote getQuote() {
    return quote;
  }
  public MessageEvent setQuote(final garden_leave.fix42.proto.FIX42Protos.Quote other) {
    setMessageEventType(MessageEventType.QUOTE);
    quote = quoteBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // OrderCancelReplaceRequest
  private garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest orderCancelReplaceRequest =
      null;
  private final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
      .Builder orderCancelReplaceRequestBuilder =
      garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
  getOrderCancelReplaceRequest() {
    return orderCancelReplaceRequest;
  }
  public MessageEvent setOrderCancelReplaceRequest(
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest other) {
    setMessageEventType(MessageEventType.ORDERCANCELREPLACEREQUEST);
    orderCancelReplaceRequest = orderCancelReplaceRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // MarketDataSnapshotFullRefresh
  private garden_leave.fix42.proto.FIX42Protos
      .MarketDataSnapshotFullRefresh marketDataSnapshotFullRefresh = null;
  private final garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh
      .Builder marketDataSnapshotFullRefreshBuilder =
      garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh.newBuilder();
  public garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh
  getMarketDataSnapshotFullRefresh() {
    return marketDataSnapshotFullRefresh;
  }
  public MessageEvent setMarketDataSnapshotFullRefresh(
      final garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh other) {
    setMessageEventType(MessageEventType.MARKETDATASNAPSHOTFULLREFRESH);
    marketDataSnapshotFullRefresh =
        marketDataSnapshotFullRefreshBuilder.clear().mergeFrom(other).build();
    return this;
  }

  public enum MessageEventType {
    UNKNOWN,
    EXECUTIONREPORT,
    NEWORDERSINGLE,
    MARKETDATASNAPSHOTFULLREFRESH,
    LOGON,
    SEQUENCERESET,
    ORDERCANCELREQUEST,
    RESENDREQUEST,
    HEARTBEAT,
    ORDERCANCELREPLACEREQUEST,
    INDICATIONOFINTEREST,
    LOGOUT,
    QUOTEREQUEST,
    QUOTECANCEL,
    TESTREQUEST,
    MARKETDATAINCREMENTALREFRESH,
    REJECT,
    ORDERCANCELREJECT,
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
