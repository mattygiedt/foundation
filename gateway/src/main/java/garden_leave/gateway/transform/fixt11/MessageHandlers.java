package garden_leave.gateway.transform.fixt11;

import com.lmax.disruptor.RingBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationFunctionalAdapter;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.420821
//

public final class MessageHandlers {
  private static final Logger logger = LoggerFactory.getLogger(MessageHandlers.class);

  private MessageHandlers() {}

  public static void addFromAdminListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.Logon.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.Logon>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.Logon message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logon.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.Logon proto =
                  garden_leave.gateway.transform.fixt11.Logon.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Logon.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setLogon(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.Reject.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.Reject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.Reject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Reject.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.Reject proto =
                  garden_leave.gateway.transform.fixt11.Reject.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Reject.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setReject(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.SequenceReset.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.SequenceReset>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.SequenceReset message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("SequenceReset.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.SequenceReset proto =
                  garden_leave.gateway.transform.fixt11.SequenceReset.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("SequenceReset.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setSequenceReset(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.Heartbeat.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.Heartbeat>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.Heartbeat message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Heartbeat.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.Heartbeat proto =
                  garden_leave.gateway.transform.fixt11.Heartbeat.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Heartbeat.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setHeartbeat(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.Logout.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.Logout>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.Logout message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logout.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.Logout proto =
                  garden_leave.gateway.transform.fixt11.Logout.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Logout.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setLogout(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.ResendRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.ResendRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.ResendRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ResendRequest.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.ResendRequest proto =
                  garden_leave.gateway.transform.fixt11.ResendRequest.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("ResendRequest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setResendRequest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAdminListener(garden_leave.gateway.transform.fixt11.TestRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fixt11.TestRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fixt11.TestRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("TestRequest.fixToProto:" + message.UUID);
              final garden_leave.fixt11.proto.FIXT11Protos.TestRequest proto =
                  garden_leave.gateway.transform.fixt11.TestRequest.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("TestRequest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setTestRequest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });
  }

  public static void addFromAppListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {}
}
