package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.TransformMessageFactory;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.878159400
//

public final class MessageFactoryProvider extends TransformMessageFactory {
  private static class SingletonHolder {
    public static final MessageFactoryProvider PROVIDER = new MessageFactoryProvider();
  }

  public static quickfix.MessageFactory newMessageFactory() {
    return SingletonHolder.PROVIDER.createMessageFactory();
  }

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(MessageFactoryProvider.class);

  private MessageFactoryProvider() {
    // SequenceReset
    addMessageSupplier(garden_leave.gateway.transform.fix44.SequenceReset.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.SequenceReset(
                garden_leave.utils.Telemetry.startSpan(tracer, "SequenceReset.constructor")));

    // Reject
    addMessageSupplier(garden_leave.gateway.transform.fix44.Reject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.Reject(
                garden_leave.utils.Telemetry.startSpan(tracer, "Reject.constructor")));

    // QuoteResponse
    addMessageSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.QuoteResponse(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteResponse.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(735),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoQuoteQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteResponse.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix44.QuoteResponse.NoLegs());

    // MarketDataIncrementalRefresh
    addMessageSupplier(garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataIncrementalRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.MSGTYPE,
        Integer.valueOf(268),
        () -> new garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.NoMdEntries());

    // ResendRequest
    addMessageSupplier(garden_leave.gateway.transform.fix44.ResendRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.ResendRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "ResendRequest.constructor")));

    // QuoteCancel
    addMessageSupplier(garden_leave.gateway.transform.fix44.QuoteCancel.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.QuoteCancel(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteCancel.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteCancel.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.QuoteCancel.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteCancel.MSGTYPE,
        Integer.valueOf(295),
        () -> new garden_leave.gateway.transform.fix44.QuoteCancel.NoQuoteEntries());

    // QuoteRequestReject
    addMessageSupplier(garden_leave.gateway.transform.fix44.QuoteRequestReject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.QuoteRequestReject(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteRequestReject.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteRequestReject.MSGTYPE,
        Integer.valueOf(146),
        () -> new garden_leave.gateway.transform.fix44.QuoteRequestReject.NoRelatedSym());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteRequestReject.MSGTYPE,
        Integer.valueOf(735),
        () -> new garden_leave.gateway.transform.fix44.QuoteRequestReject.NoQuoteQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteRequestReject.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.QuoteRequestReject.NoPartyIds());

    // TestRequest
    addMessageSupplier(garden_leave.gateway.transform.fix44.TestRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.TestRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "TestRequest.constructor")));

    // Heartbeat
    addMessageSupplier(garden_leave.gateway.transform.fix44.Heartbeat.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.Heartbeat(
                garden_leave.utils.Telemetry.startSpan(tracer, "Heartbeat.constructor")));

    // MarketDataSnapshotFullRefresh
    addMessageSupplier(garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataSnapshotFullRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(454),
        ()
            -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh
                   .NoSecurityAltId());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.NoEvents());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(711),
        ()
            -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh
                   .NoUnderlyings());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.NoLegs());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(268),
        () -> new garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.NoMdEntries());

    // NewOrderSingle
    addMessageSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.NewOrderSingle(
                garden_leave.utils.Telemetry.startSpan(tracer, "NewOrderSingle.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(386),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoTradingSessions());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.NewOrderSingle.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix44.NewOrderSingle.NoStipulations());

    // OrderCancelReject
    addMessageSupplier(garden_leave.gateway.transform.fix44.OrderCancelReject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.OrderCancelReject(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelReject.constructor")));

    // ExecutionReport
    addMessageSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.ExecutionReport(
                garden_leave.utils.Telemetry.startSpan(tracer, "ExecutionReport.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(382),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoContraBrokers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(518),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoContAmts());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoLegs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.ExecutionReport.MSGTYPE,
        Integer.valueOf(136),
        () -> new garden_leave.gateway.transform.fix44.ExecutionReport.NoMiscFees());

    // Logout
    addMessageSupplier(garden_leave.gateway.transform.fix44.Logout.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.Logout(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logout.constructor")));

    // IndicationOfInterest
    addMessageSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.IndicationOfInterest(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "IndicationOfInterest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoLegs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(199),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoIoiQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.IndicationOfInterest.MSGTYPE,
        Integer.valueOf(215),
        () -> new garden_leave.gateway.transform.fix44.IndicationOfInterest.NoRoutingIds());

    // Logon
    addMessageSupplier(garden_leave.gateway.transform.fix44.Logon.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.Logon(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logon.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Logon.MSGTYPE,
        Integer.valueOf(384), () -> new garden_leave.gateway.transform.fix44.Logon.NoMsgTypes());

    // QuoteRequest
    addMessageSupplier(garden_leave.gateway.transform.fix44.QuoteRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.QuoteRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.QuoteRequest.MSGTYPE,
        Integer.valueOf(146),
        () -> new garden_leave.gateway.transform.fix44.QuoteRequest.NoRelatedSym());

    // OrderCancelRequest
    addMessageSupplier(garden_leave.gateway.transform.fix44.OrderCancelRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.OrderCancelRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelRequest.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelRequest.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelRequest.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelRequest.NoUnderlyings());

    // Quote
    addMessageSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.Quote(
                garden_leave.utils.Telemetry.startSpan(tracer, "Quote.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(735),
        () -> new garden_leave.gateway.transform.fix44.Quote.NoQuoteQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(453), () -> new garden_leave.gateway.transform.fix44.Quote.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.Quote.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(864), () -> new garden_leave.gateway.transform.fix44.Quote.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(711), () -> new garden_leave.gateway.transform.fix44.Quote.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix44.Quote.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.Quote.MSGTYPE,
        Integer.valueOf(555), () -> new garden_leave.gateway.transform.fix44.Quote.NoLegs());

    // OrderCancelReplaceRequest
    addMessageSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "OrderCancelReplaceRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(386),
        ()
            -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest
                   .NoTradingSessions());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.NoUnderlyings());
  }
}
