package garden_leave.gateway.transform.fixt11;

import garden_leave.gateway.transform.TransformMessageFactory;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.420748200
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
    // Logon
    addMessageSupplier(garden_leave.gateway.transform.fixt11.Logon.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.Logon(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logon.constructor")));
    addMessageGroupSupplier(garden_leave.gateway.transform.fixt11.Logon.MSGTYPE,
        Integer.valueOf(384), () -> new garden_leave.gateway.transform.fixt11.Logon.NoMsgTypes());

    // Reject
    addMessageSupplier(garden_leave.gateway.transform.fixt11.Reject.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.Reject(
                garden_leave.utils.Telemetry.startSpan(tracer, "Reject.constructor")));

    // SequenceReset
    addMessageSupplier(garden_leave.gateway.transform.fixt11.SequenceReset.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.SequenceReset(
                garden_leave.utils.Telemetry.startSpan(tracer, "SequenceReset.constructor")));

    // Heartbeat
    addMessageSupplier(garden_leave.gateway.transform.fixt11.Heartbeat.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.Heartbeat(
                garden_leave.utils.Telemetry.startSpan(tracer, "Heartbeat.constructor")));

    // Logout
    addMessageSupplier(garden_leave.gateway.transform.fixt11.Logout.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.Logout(
                garden_leave.utils.Telemetry.startSpan(tracer, "Logout.constructor")));

    // ResendRequest
    addMessageSupplier(garden_leave.gateway.transform.fixt11.ResendRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.ResendRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "ResendRequest.constructor")));

    // TestRequest
    addMessageSupplier(garden_leave.gateway.transform.fixt11.TestRequest.MSGTYPE,
        ()
            -> new garden_leave.gateway.transform.fixt11.TestRequest(
                garden_leave.utils.Telemetry.startSpan(tracer, "TestRequest.constructor")));
  }
}
