package garden_leave.event;

import static org.junit.Assert.*;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import garden_leave.marketdata.proto.MarketDataRecord;
import garden_leave.marketdata.proto.Quote;
import garden_leave.marketdata.proto.Trade;
import garden_leave.utils.Protobuf;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.junit.Test;

public class TestMarketDataRecordEvent {
  private Disruptor<MarketDataRecordEvent> disruptor = null;
  private RingBuffer<MarketDataRecordEvent> ringBuffer = null;
  private Consumer<MarketDataRecordEvent> eventConsumer;

  private final MarketDataRecord.Builder recordBuilder = MarketDataRecord.newBuilder();
  private final Quote.Builder quoteBuilder = Quote.newBuilder();
  private final Trade.Builder tradeBuilder = Trade.newBuilder();

  private MarketDataRecord makeQuote(
      int instrumentId, int bidSize, int askSize, double bidPrice, double askPrice) {
    return recordBuilder.setTimestamp(Protobuf.getTimestamp())
        .setQuote(quoteBuilder.setTimestamp(Protobuf.getTimestamp())
                      .setInstrumentId(instrumentId)
                      .setBidSize(bidSize)
                      .setAskSize(askSize)
                      .setBidPrice(bidPrice)
                      .setAskPrice(askPrice))
        .build();
  }

  private MarketDataRecord makeTrade(int instrumentId, int size, double price) {
    return recordBuilder.setTimestamp(Protobuf.getTimestamp())
        .setTrade(tradeBuilder.setTimestamp(Protobuf.getTimestamp())
                      .setInstrumentId(instrumentId)
                      .setTradeSize(size)
                      .setTradePrice(price))
        .build();
  }

  @Test
  public void testEvent() throws Exception {
    int instrumentId = 1;
    int bidSize = 50;
    int askSize = 60;
    double bidPrice = 101.123;
    double askPrice = 102.345;

    CountDownLatch countDownLatch = new CountDownLatch(2);

    eventConsumer = (event) -> {
      MarketDataRecord record = event.getRecord();
      MarketDataRecord.DataCase dataCase = record.getDataCase();

      switch (dataCase) {
        case QUOTE: {
          assertTrue(record.getQuote().getAskSize() == askSize);
          assertFalse(record.hasTrade());
          countDownLatch.countDown();
          break;
        }
        case TRADE: {
          assertTrue(record.getTrade().getTradeSize() == bidSize);
          assertFalse(record.hasQuote());
          countDownLatch.countDown();
          break;
        }
        case DATA_NOT_SET: {
          throw new RuntimeException("received DATA_NOT_SET event");
        }
      }
    };

    disruptor = EventUtils.createDisruptor(
        8, MarketDataRecordEvent.EVENT_FACTORY, new EventConsumer<MarketDataRecordEvent>() {
          @Override
          @SuppressWarnings("unchecked")
          public EventHandler<MarketDataRecordEvent>[] getEventHandler() {
            final EventHandler<MarketDataRecordEvent> eventHandler =
                (event, sequence, endOfBatch) -> {
              eventConsumer.accept(event);
            };
            return new EventHandler[] {eventHandler};
          }
        }, new BlockingWaitStrategy());

    ringBuffer = disruptor.start();

    long seq = ringBuffer.next();
    MarketDataRecordEvent record = ringBuffer.get(seq);
    record.setRecord(makeQuote(instrumentId, bidSize, askSize, bidPrice, askPrice));
    ringBuffer.publish(seq);

    seq = ringBuffer.next();
    record = ringBuffer.get(seq);
    record.setRecord(makeTrade(instrumentId, bidSize, bidPrice));
    ringBuffer.publish(seq);

    countDownLatch.await(1000, TimeUnit.SECONDS);
  }
}
