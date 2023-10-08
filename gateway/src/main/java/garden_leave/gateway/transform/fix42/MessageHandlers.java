package garden_leave.gateway.transform.fix42;

import com.lmax.disruptor.RingBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationFunctionalAdapter;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.517428100
//

public final class MessageHandlers {
  private static final Logger logger = LoggerFactory.getLogger(MessageHandlers.class);

  private MessageHandlers() {}

  public static void addFromAdminListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAdminListener(garden_leave.gateway.transform.fix42.SequenceReset.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.SequenceReset>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.SequenceReset message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("SequenceReset.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.SequenceReset proto =
                  garden_leave.gateway.transform.fix42.SequenceReset.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.Reject.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.Reject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.Reject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Reject.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.Reject proto =
                  garden_leave.gateway.transform.fix42.Reject.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.Logout.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.Logout>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.Logout message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logout.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.Logout proto =
                  garden_leave.gateway.transform.fix42.Logout.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.ResendRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.ResendRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.ResendRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ResendRequest.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.ResendRequest proto =
                  garden_leave.gateway.transform.fix42.ResendRequest.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.Logon.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.Logon>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.Logon message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logon.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.Logon proto =
                  garden_leave.gateway.transform.fix42.Logon.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.TestRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.TestRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.TestRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("TestRequest.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.TestRequest proto =
                  garden_leave.gateway.transform.fix42.TestRequest.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix42.Heartbeat.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix42.Heartbeat>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.Heartbeat message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Heartbeat.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.Heartbeat proto =
                  garden_leave.gateway.transform.fix42.Heartbeat.fixToProto.apply(message);
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
  }

  public static void addFromAppListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAppListener(garden_leave.gateway.transform.fix42.NewOrderSingle.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.NewOrderSingle>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.NewOrderSingle message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("NewOrderSingle.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.NewOrderSingle proto =
                  garden_leave.gateway.transform.fix42.NewOrderSingle.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("NewOrderSingle.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setNewOrderSingle(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.OrderCancelReject.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.OrderCancelReject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.OrderCancelReject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelReject.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject proto =
                  garden_leave.gateway.transform.fix42.OrderCancelReject.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("OrderCancelReject.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setOrderCancelReject(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.IndicationofInterest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.IndicationofInterest>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix42.IndicationofInterest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("IndicationofInterest.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest proto =
                  garden_leave.gateway.transform.fix42.IndicationofInterest.fixToProto.apply(
                      message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("IndicationofInterest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setIndicationofInterest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.ExecutionReport.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.ExecutionReport>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.ExecutionReport message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ExecutionReport.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.ExecutionReport proto =
                  garden_leave.gateway.transform.fix42.ExecutionReport.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("ExecutionReport.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setExecutionReport(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(
        garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataIncrementalRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh proto =
                  garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.fixToProto
                      .apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("MarketDataIncrementalRefresh.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setMarketDataIncrementalRefresh(proto).setSpan(
                  span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.QuoteRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.QuoteRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.QuoteRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteRequest.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.QuoteRequest proto =
                  garden_leave.gateway.transform.fix42.QuoteRequest.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("QuoteRequest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setQuoteRequest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.QuoteCancel.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.QuoteCancel>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.QuoteCancel message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteCancel.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.QuoteCancel proto =
                  garden_leave.gateway.transform.fix42.QuoteCancel.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("QuoteCancel.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setQuoteCancel(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.OrderCancelRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.OrderCancelRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.OrderCancelRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelRequest.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.OrderCancelRequest proto =
                  garden_leave.gateway.transform.fix42.OrderCancelRequest.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("OrderCancelRequest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setOrderCancelRequest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix42.Quote.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix42.Quote>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix42.Quote message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Quote.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.Quote proto =
                  garden_leave.gateway.transform.fix42.Quote.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Quote.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setQuote(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(
        garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.class,
        new quickfix
            .FromAppListener<garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest>() {
              @Override
              public void accept(
                  final garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest message,
                  final quickfix.SessionID sessionId) {
                final io.opentelemetry.api.trace.Span span = message.getSpan();
                try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
                  span.addEvent("OrderCancelReplaceRequest.fixToProto:" + message.UUID);
                  final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest proto =
                      garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.fixToProto
                          .apply(message);
                  final long seq = ringBuffer.next();
                  if (logger.isDebugEnabled()) {
                    logger.debug("seq: {}, proto: {}", seq, proto.toString());
                  }
                  span.addEvent("OrderCancelReplaceRequest.ringBuffer.publish:" + seq);
                  ringBuffer.get(seq).setSequence(seq).setOrderCancelReplaceRequest(proto).setSpan(
                      span);
                  ringBuffer.publish(seq);
                }
              }
            });

    application.addFromAppListener(
        garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataSnapshotFullRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix42.proto.FIX42Protos.MarketDataSnapshotFullRefresh proto =
                  garden_leave.gateway.transform.fix42.MarketDataSnapshotFullRefresh.fixToProto
                      .apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("MarketDataSnapshotFullRefresh.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setMarketDataSnapshotFullRefresh(proto).setSpan(
                  span);
              ringBuffer.publish(seq);
            }
          }
        });
  }
}
