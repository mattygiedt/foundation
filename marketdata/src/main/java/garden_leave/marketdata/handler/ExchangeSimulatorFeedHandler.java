package garden_leave.marketdata.handler;

import com.google.protobuf.InvalidProtocolBufferException;
import com.lmax.disruptor.RingBuffer;
import garden_leave.event.MarketDataRecordEvent;
import garden_leave.marketdata.proto.MarketDataRecord;
import garden_leave.marketdata.proto.Quote;
import garden_leave.marketdata.proto.Trade;
import garden_leave.utils.Protobuf;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Sharable
public class ExchangeSimulatorFeedHandler extends SimpleChannelInboundHandler<DatagramPacket> {
  public static final int QUOTE_MSG = 1;
  public static final int TRADE_MSG = 2;

  private static final Logger logger = LoggerFactory.getLogger(ExchangeSimulatorFeedHandler.class);
  private static final int initialSequenceNumber = -1;
  private static final AtomicInteger lastSequenceNumber = new AtomicInteger(initialSequenceNumber);

  private final MarketDataRecord.Builder recordBuilder = MarketDataRecord.newBuilder();
  private final Quote.Builder quoteBuilder = Quote.newBuilder();
  private final Trade.Builder tradeBuilder = Trade.newBuilder();

  private final Consumer<ByteBuf> tradeConsumer;
  private final Consumer<ByteBuf> quoteConsumer;

  public ExchangeSimulatorFeedHandler(final RingBuffer<MarketDataRecordEvent> ringBuffer) {
    this.tradeConsumer = (buf) -> {
      final long seq = ringBuffer.next();
      final MarketDataRecordEvent record = ringBuffer.get(seq);
      try {
        record.setRecord(recordBuilder.setTimestamp(Protobuf.getTimestamp())
                             .setTrade(tradeBuilder.setTimestamp(Protobuf.getTimestamp())
                                           .setInstrumentId(buf.readLong())
                                           .setTradeSize(buf.readInt())
                                           .setTradePrice(buf.readDouble()))
                             .build());
      } catch (final InvalidProtocolBufferException ex) {
        logger.error("tradeConsumer error", ex);
      }
      ringBuffer.publish(seq);
    };

    this.quoteConsumer = (buf) -> {
      final long seq = ringBuffer.next();
      final MarketDataRecordEvent record = ringBuffer.get(seq);
      try {
        record.setRecord(recordBuilder.setTimestamp(Protobuf.getTimestamp())
                             .setQuote(quoteBuilder.setTimestamp(Protobuf.getTimestamp())
                                           .setInstrumentId(buf.readLong())
                                           .setBidSize(buf.readInt())
                                           .setAskSize(buf.readInt())
                                           .setBidPrice(buf.readDouble())
                                           .setAskPrice(buf.readDouble()))
                             .build());
      } catch (final InvalidProtocolBufferException ex) {
        logger.error("quoteConsumer error", ex);
      }
      ringBuffer.publish(seq);
    };
  }

  @Override
  protected void channelRead0(final ChannelHandlerContext ctx, final DatagramPacket msg)
      throws Exception {
    final ByteBuf buf = msg.content();
    final int packetSequenceNumber = buf.readInt();

    if (packetSequenceNumber <= lastSequenceNumber.get()) {
      if (logger.isDebugEnabled()) {
        logger.debug(
            "channelRead0: {} already handled seq_num: {}", ctx.channel(), packetSequenceNumber);
      }
      return;
    }

    final int messageType = buf.readInt();

    if (logger.isDebugEnabled()) {
      logger.debug("channelRead0: {} {}: {} ({})", ctx.channel(), messageType, packetSequenceNumber,
          lastSequenceNumber.get());
    }

    if (lastSequenceNumber.compareAndSet(initialSequenceNumber, packetSequenceNumber)) {
      // logger.info("channelRead0: {} handling first message", ctx.channel());
      handleMessage(messageType, buf);
    }

    while (packetSequenceNumber > lastSequenceNumber.get()) {
      if (lastSequenceNumber.compareAndSet(packetSequenceNumber - 1, packetSequenceNumber)) {
        handleMessage(messageType, buf);
      }
    }

    if (logger.isDebugEnabled()) {
      logger.debug("channelRead0: {} seq_num: {} complete", ctx.channel(), packetSequenceNumber);
    }
  }

  private final void handleMessage(final int messageType, final ByteBuf buf) {
    if (messageType == QUOTE_MSG) {
      this.quoteConsumer.accept(buf);
    } else if (messageType == TRADE_MSG) {
      this.tradeConsumer.accept(buf);
    } else {
      throw new RuntimeException("Unknown messageType [" + messageType + "]");
    }
  }
}
