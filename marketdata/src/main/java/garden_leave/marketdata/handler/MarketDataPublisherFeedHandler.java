package garden_leave.marketdata.handler;

import com.google.protobuf.InvalidProtocolBufferException;
import com.lmax.disruptor.RingBuffer;
import garden_leave.event.MarketDataRecordEvent;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarketDataPublisherFeedHandler extends SimpleChannelInboundHandler<DatagramPacket> {
  private static final Logger logger =
      LoggerFactory.getLogger(MarketDataPublisherFeedHandler.class);

  private final Consumer<ByteBuf> packetConsumer;
  private final byte[] byteArray = new byte[2048];

  public MarketDataPublisherFeedHandler(final RingBuffer<MarketDataRecordEvent> ringBuffer) {
    this.packetConsumer = (buf) -> {
      final long seq = ringBuffer.next();
      final MarketDataRecordEvent record = ringBuffer.get(seq);
      final int readableBytes = buf.readableBytes();
      buf.getBytes(0, byteArray, 0, readableBytes);
      try {
        record.setRecord(byteArray, 0, readableBytes);
      } catch (final InvalidProtocolBufferException ex) {
        logger.error("tradeConsumer error", ex);
      }
      ringBuffer.publish(seq);
    };
  }

  @Override
  protected void channelRead0(final ChannelHandlerContext ctx, final DatagramPacket msg)
      throws Exception {
    this.packetConsumer.accept(msg.content());
  }
}
