package garden_leave.gateway.transform.fix44;

import com.lmax.disruptor.RingBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationFunctionalAdapter;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.878829900
//

public final class MessageHandlers {
  private static final Logger logger = LoggerFactory.getLogger(MessageHandlers.class);

  private MessageHandlers() {}

  public static void addFromAdminListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAdminListener(garden_leave.gateway.transform.fix44.SequenceReset.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.SequenceReset>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.SequenceReset message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("SequenceReset.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.SequenceReset proto =
                  garden_leave.gateway.transform.fix44.SequenceReset.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.Reject.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.Reject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.Reject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Reject.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.Reject proto =
                  garden_leave.gateway.transform.fix44.Reject.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.ResendRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.ResendRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.ResendRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ResendRequest.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.ResendRequest proto =
                  garden_leave.gateway.transform.fix44.ResendRequest.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.TestRequest.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.TestRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.TestRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("TestRequest.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.TestRequest proto =
                  garden_leave.gateway.transform.fix44.TestRequest.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.Heartbeat.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.Heartbeat>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.Heartbeat message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Heartbeat.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.Heartbeat proto =
                  garden_leave.gateway.transform.fix44.Heartbeat.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.Logout.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.Logout>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.Logout message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logout.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.Logout proto =
                  garden_leave.gateway.transform.fix44.Logout.fixToProto.apply(message);
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

    application.addFromAdminListener(garden_leave.gateway.transform.fix44.Logon.class,
        new quickfix.FromAdminListener<garden_leave.gateway.transform.fix44.Logon>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.Logon message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Logon.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.Logon proto =
                  garden_leave.gateway.transform.fix44.Logon.fixToProto.apply(message);
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
  }

  public static void addFromAppListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAppListener(garden_leave.gateway.transform.fix44.QuoteResponse.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.QuoteResponse>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.QuoteResponse message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteResponse.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.QuoteResponse proto =
                  garden_leave.gateway.transform.fix44.QuoteResponse.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("QuoteResponse.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setQuoteResponse(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(
        garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataIncrementalRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh proto =
                  garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.fixToProto
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.QuoteCancel.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.QuoteCancel>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.QuoteCancel message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteCancel.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.QuoteCancel proto =
                  garden_leave.gateway.transform.fix44.QuoteCancel.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.QuoteRequestReject.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.QuoteRequestReject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.QuoteRequestReject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteRequestReject.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.QuoteRequestReject proto =
                  garden_leave.gateway.transform.fix44.QuoteRequestReject.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("QuoteRequestReject.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setQuoteRequestReject(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(
        garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataSnapshotFullRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.MarketDataSnapshotFullRefresh proto =
                  garden_leave.gateway.transform.fix44.MarketDataSnapshotFullRefresh.fixToProto
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.NewOrderSingle.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.NewOrderSingle>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.NewOrderSingle message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("NewOrderSingle.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle proto =
                  garden_leave.gateway.transform.fix44.NewOrderSingle.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.OrderCancelReject.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.OrderCancelReject>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.OrderCancelReject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelReject.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.OrderCancelReject proto =
                  garden_leave.gateway.transform.fix44.OrderCancelReject.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.ExecutionReport.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.ExecutionReport>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.ExecutionReport message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ExecutionReport.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.ExecutionReport proto =
                  garden_leave.gateway.transform.fix44.ExecutionReport.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.IndicationOfInterest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.IndicationOfInterest>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix44.IndicationOfInterest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("IndicationOfInterest.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.IndicationOfInterest proto =
                  garden_leave.gateway.transform.fix44.IndicationOfInterest.fixToProto.apply(
                      message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("IndicationOfInterest.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setIndicationOfInterest(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix44.QuoteRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.QuoteRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.QuoteRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteRequest.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.QuoteRequest proto =
                  garden_leave.gateway.transform.fix44.QuoteRequest.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.OrderCancelRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.OrderCancelRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.OrderCancelRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelRequest.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.OrderCancelRequest proto =
                  garden_leave.gateway.transform.fix44.OrderCancelRequest.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix44.Quote.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix44.Quote>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix44.Quote message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Quote.fixToProto:" + message.UUID);
              final garden_leave.fix44.proto.FIX44Protos.Quote proto =
                  garden_leave.gateway.transform.fix44.Quote.fixToProto.apply(message);
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
        garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.class,
        new quickfix
            .FromAppListener<garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest>() {
              @Override
              public void accept(
                  final garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest message,
                  final quickfix.SessionID sessionId) {
                final io.opentelemetry.api.trace.Span span = message.getSpan();
                try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
                  span.addEvent("OrderCancelReplaceRequest.fixToProto:" + message.UUID);
                  final garden_leave.fix44.proto.FIX44Protos.OrderCancelReplaceRequest proto =
                      garden_leave.gateway.transform.fix44.OrderCancelReplaceRequest.fixToProto
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
  }
}
