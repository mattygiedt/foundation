package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.TransformMessageFactory;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.369465700
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
    // QuoteResponse
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteResponse.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(735),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoQuoteQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteResponse.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteResponse.NoLegs());

    // MarketDataIncrementalRefresh
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataIncrementalRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE,
        Integer.valueOf(268),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh
                   .NoMdEntries());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE,
        Integer.valueOf(215),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh
                   .NoRoutingIds());

    // NewOrderSingle
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle(
                garden_leave.utils.Telemetry.startSpan(tracer, "NewOrderSingle.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(386),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoTradingSessions());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(957),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoStrategyParameters());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.MSGTYPE,
        Integer.valueOf(768),
        () -> new garden_leave.gateway.transform.fix50sp2.NewOrderSingle.NoTrdRegTimestamps());

    // QuoteRequest
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.QuoteRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequest.MSGTYPE,
        Integer.valueOf(1116),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteRequest.NoRootPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequest.MSGTYPE,
        Integer.valueOf(146),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteRequest.NoRelatedSym());

    // OrderCancelReplaceRequest
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "OrderCancelReplaceRequest.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.NoPartyIds());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.NoAllocs());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(386),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoTradingSessions());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(454),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoSecurityAltId());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.NoEvents());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(1018),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoInstrumentParties());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(1483),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoComplexEvents());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(711),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoUnderlyings());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(957),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoStrategyParameters());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(768),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest
                   .NoTrdRegTimestamps());

    // QuoteCancel
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.QuoteCancel.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.QuoteCancel(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteCancel.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteCancel.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteCancel.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteCancel.MSGTYPE,
        Integer.valueOf(1461),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteCancel.NoTargetPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteCancel.MSGTYPE,
        Integer.valueOf(295),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteCancel.NoQuoteEntries());

    // QuoteRequestReject
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.QuoteRequestReject(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteRequestReject.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.MSGTYPE,
        Integer.valueOf(1116),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.NoRootPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.MSGTYPE,
        Integer.valueOf(146),
        () -> new garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.NoRelatedSym());

    // MarketDataSnapshotFullRefresh
    addMessageSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataSnapshotFullRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(454),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoSecurityAltId());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.NoEvents());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(1018),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoInstrumentParties());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(1483),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoComplexEvents());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(711),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoUnderlyings());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.NoLegs());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(268),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoMdEntries());
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(215),
        ()
            -> new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh
                   .NoRoutingIds());

    // OrderCancelReject
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelReject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelReject(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelReject.constructor")));

    // ExecutionReport
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport(
                garden_leave.utils.Telemetry.startSpan(tracer, "ExecutionReport.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(382),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoContraBrokers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(957),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoStrategyParameters());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(1362),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoFills());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(1445),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoRateSources());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(518),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoContAmts());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(555),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoLegs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(136),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoMiscFees());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.ExecutionReport.MSGTYPE,
        Integer.valueOf(768),
        () -> new garden_leave.gateway.transform.fix50sp2.ExecutionReport.NoTrdRegTimestamps());

    // Ioi
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.Ioi(
                garden_leave.utils.Telemetry.startSpan(tracer, "Ioi.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(864), () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(453), () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(555), () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoLegs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(199),
        () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoIoiQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Ioi.MSGTYPE,
        Integer.valueOf(215), () -> new garden_leave.gateway.transform.fix50sp2.Ioi.NoRoutingIds());

    // OrderCancelRequest
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(453),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(864),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.NoUnderlyings());

    // Quote
    addMessageSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix50sp2.Quote(
                garden_leave.utils.Telemetry.startSpan(tracer, "Quote.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(735),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoQuoteQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(453), () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoPartyIds());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(454),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoSecurityAltId());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(864), () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(1018),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoInstrumentParties());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(1483),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoComplexEvents());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(711),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoUnderlyings());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(1445),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoRateSources());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(232),
        () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoStipulations());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix50sp2.Quote.MSGTYPE,
        Integer.valueOf(555), () -> new garden_leave.gateway.transform.fix50sp2.Quote.NoLegs());
  }
}
