package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.TransformMessageFactory;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.515737700
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
    // NewOrderSingle
    addMessageSupplier(garden_leave.gateway.transform.fix42.NewOrderSingle.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.NewOrderSingle(
                garden_leave.utils.Telemetry.startSpan(tracer, "NewOrderSingle.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.NewOrderSingle.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix42.NewOrderSingle.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.NewOrderSingle.MSGTYPE,
        Integer.valueOf(386),
        () -> new garden_leave.gateway.transform.fix42.NewOrderSingle.NoTradingSessions());

    // SequenceReset
    addMessageSupplier(garden_leave.gateway.transform.fix42.SequenceReset.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.SequenceReset(
                garden_leave.utils.Telemetry.startSpan(tracer, "SequenceReset.constructor")));

    // OrderCancelReject
    addMessageSupplier(garden_leave.gateway.transform.fix42.OrderCancelReject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.OrderCancelReject(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelReject.constructor")));

    // Reject
    addMessageSupplier(garden_leave.gateway.transform.fix42.Reject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.Reject(
                garden_leave.utils.Telemetry.startSpan(tracer, "Reject.constructor")));

    // IndicationofInterest
    addMessageSupplier(garden_leave.gateway.transform.fix42.IndicationofInterest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.IndicationofInterest(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "IndicationofInterest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.IndicationofInterest.MSGTYPE,
        Integer.valueOf(199),
        () -> new garden_leave.gateway.transform.fix42.IndicationofInterest.NoIoiQualifiers());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.IndicationofInterest.MSGTYPE,
        Integer.valueOf(215),
        () -> new garden_leave.gateway.transform.fix42.IndicationofInterest.NoRoutingIds());

    // ExecutionReport
    addMessageSupplier(garden_leave.gateway.transform.fix42.ExecutionReport.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.ExecutionReport(
                garden_leave.utils.Telemetry.startSpan(tracer, "ExecutionReport.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.ExecutionReport.MSGTYPE,
        Integer.valueOf(382),
        () -> new garden_leave.gateway.transform.fix42.ExecutionReport.NoContraBrokers());

    // Logout
    addMessageSupplier(garden_leave.gateway.transform.fix42.Logout.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.Logout(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logout.constructor")));

    // MarketDataIncrementalRefresh
    addMessageSupplier(garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataIncrementalRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.MSGTYPE,
        Integer.valueOf(268),
        () -> new garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.NoMdEntries());

    // ResendRequest
    addMessageSupplier(garden_leave.gateway.transform.fix42.ResendRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.ResendRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "ResendRequest.constructor")));

    // Logon
    addMessageSupplier(garden_leave.gateway.transform.fix42.Logon.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.Logon(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logon.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.Logon.MSGTYPE,
        Integer.valueOf(384), () -> new garden_leave.gateway.transform.fix42.Logon.NoMsgTypes());

    // QuoteRequest
    addMessageSupplier(garden_leave.gateway.transform.fix42.QuoteRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.QuoteRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.QuoteRequest.MSGTYPE,
        Integer.valueOf(146),
        () -> new garden_leave.gateway.transform.fix42.QuoteRequest.NoRelatedSym());

    // QuoteCancel
    addMessageSupplier(garden_leave.gateway.transform.fix42.QuoteCancel.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.QuoteCancel(
                garden_leave.utils.Telemetry.startSpan(tracer, "QuoteCancel.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.QuoteCancel.MSGTYPE,
        Integer.valueOf(295),
        () -> new garden_leave.gateway.transform.fix42.QuoteCancel.NoQuoteEntries());

    // OrderCancelRequest
    addMessageSupplier(garden_leave.gateway.transform.fix42.OrderCancelRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.OrderCancelRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "OrderCancelRequest.constructor")));

    // TestRequest
    addMessageSupplier(garden_leave.gateway.transform.fix42.TestRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.TestRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "TestRequest.constructor")));

    // Quote
    addMessageSupplier(garden_leave.gateway.transform.fix42.Quote.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.Quote(
                garden_leave.utils.Telemetry.startSpan(tracer, "Quote.constructor")));

    // Heartbeat
    addMessageSupplier(garden_leave.gateway.transform.fix42.Heartbeat.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.Heartbeat(
                garden_leave.utils.Telemetry.startSpan(tracer, "Heartbeat.constructor")));

    // OrderCancelReplaceRequest
    addMessageSupplier(garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "OrderCancelReplaceRequest.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(78),
        () -> new garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.NoAllocs());
    addMessageGroupSupplier(garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.MSGTYPE,
        Integer.valueOf(386),
        ()
            -> new garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest
                   .NoTradingSessions());

    // MarketDataSnapshotFullRefresh
    addMessageSupplier(garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh(
                garden_leave.utils.Telemetry.startSpan(
                    tracer, "MarketDataSnapshotFullRefresh.constructor")));
    addMessageGroupSupplier(
        garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh.MSGTYPE,
        Integer.valueOf(268),
        () -> new garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh.NoMdEntries());
  }
}
