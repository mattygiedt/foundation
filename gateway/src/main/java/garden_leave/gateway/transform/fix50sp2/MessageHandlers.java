package garden_leave.gateway.transform.fix50sp2;

import com.lmax.disruptor.RingBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationFunctionalAdapter;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.369786800
//

public final class MessageHandlers {
  private static final Logger logger = LoggerFactory.getLogger(MessageHandlers.class);

  private MessageHandlers() {}

  public static void addFromAdminListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {}

  public static void addFromAppListeners(
      final ApplicationFunctionalAdapter application, final RingBuffer<MessageEvent> ringBuffer) {
    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.QuoteResponse.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.QuoteResponse>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.QuoteResponse message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteResponse.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteResponse proto =
                  garden_leave.gateway.transform.fix50sp2.QuoteResponse.fixToProto.apply(message);
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
        garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataIncrementalRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataIncrementalRefresh proto =
                  garden_leave.gateway.transform.fix50sp2.MarketDataIncrementalRefresh.fixToProto
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.NewOrderSingle.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.NewOrderSingle>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.NewOrderSingle message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("NewOrderSingle.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.NewOrderSingle proto =
                  garden_leave.gateway.transform.fix50sp2.NewOrderSingle.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.QuoteRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.QuoteRequest>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.QuoteRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteRequest.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest proto =
                  garden_leave.gateway.transform.fix50sp2.QuoteRequest.fixToProto.apply(message);
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

    application.addFromAppListener(
        garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.class,
        new quickfix
            .FromAppListener<garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest>() {
              @Override
              public void accept(
                  final garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest message,
                  final quickfix.SessionID sessionId) {
                final io.opentelemetry.api.trace.Span span = message.getSpan();
                try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
                  span.addEvent("OrderCancelReplaceRequest.fixToProto:" + message.UUID);
                  final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReplaceRequest proto =
                      garden_leave.gateway.transform.fix50sp2.OrderCancelReplaceRequest.fixToProto
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.QuoteCancel.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.QuoteCancel>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.QuoteCancel message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteCancel.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteCancel proto =
                  garden_leave.gateway.transform.fix50sp2.QuoteCancel.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.QuoteRequestReject>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix50sp2.QuoteRequestReject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("QuoteRequestReject.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequestReject proto =
                  garden_leave.gateway.transform.fix50sp2.QuoteRequestReject.fixToProto.apply(
                      message);
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
        garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.class,
        new quickfix.FromAppListener<
            garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("MarketDataSnapshotFullRefresh.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh proto =
                  garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.fixToProto
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.OrderCancelReject.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.OrderCancelReject>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix50sp2.OrderCancelReject message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelReject.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject proto =
                  garden_leave.gateway.transform.fix50sp2.OrderCancelReject.fixToProto.apply(
                      message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.ExecutionReport.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.ExecutionReport>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.ExecutionReport message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("ExecutionReport.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport proto =
                  garden_leave.gateway.transform.fix50sp2.ExecutionReport.fixToProto.apply(message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.Ioi.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.Ioi>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.Ioi message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Ioi.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.Ioi proto =
                  garden_leave.gateway.transform.fix50sp2.Ioi.fixToProto.apply(message);
              final long seq = ringBuffer.next();
              if (logger.isDebugEnabled()) {
                logger.debug("seq: {}, proto: {}", seq, proto.toString());
              }
              span.addEvent("Ioi.ringBuffer.publish:" + seq);
              ringBuffer.get(seq).setSequence(seq).setIoi(proto).setSpan(span);
              ringBuffer.publish(seq);
            }
          }
        });

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.OrderCancelRequest>() {
          @Override
          public void accept(
              final garden_leave.gateway.transform.fix50sp2.OrderCancelRequest message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("OrderCancelRequest.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest proto =
                  garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.fixToProto.apply(
                      message);
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

    application.addFromAppListener(garden_leave.gateway.transform.fix50sp2.Quote.class,
        new quickfix.FromAppListener<garden_leave.gateway.transform.fix50sp2.Quote>() {
          @Override
          public void accept(final garden_leave.gateway.transform.fix50sp2.Quote message,
              final quickfix.SessionID sessionId) {
            final io.opentelemetry.api.trace.Span span = message.getSpan();
            try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
              span.addEvent("Quote.fixToProto:" + message.UUID);
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.Quote proto =
                  garden_leave.gateway.transform.fix50sp2.Quote.fixToProto.apply(message);
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
  }
}
