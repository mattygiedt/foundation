package garden_leave.marketdata;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import garden_leave.config.loaders.marketdata.MarketDataServiceLoader;
import garden_leave.config.proto.MarketDataService.Instance;
import garden_leave.event.EventConsumer;
import garden_leave.event.EventUtils;
import garden_leave.event.MarketDataRecordEvent;
import garden_leave.grpc.ConfigResponse;
import garden_leave.marketdata.handler.ExchangeSimulatorFeedHandler;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarketDataPublisher -- receives ExchangeSimulator multicast messages and publishes market data
 * record events. IPC between the multicast receiver and publisher is accomplished via the disruptor
 * ring buffer.
 */

public class MarketDataPublisher extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(MarketDataPublisher.class);

  private MulticastServer receiver = null;
  private MulticastServer publisher = null;
  private Disruptor<MarketDataRecordEvent> disruptor = null;
  private RingBuffer<MarketDataRecordEvent> ringBuffer = null;

  private final class MarketDataRecordEventConsumer
      implements EventConsumer<MarketDataRecordEvent> {
    @Override
    @SuppressWarnings("unchecked")
    public EventHandler<MarketDataRecordEvent>[] getEventHandler() {
      final EventHandler<MarketDataRecordEvent> eventHandler = (event, sequence, endOfBatch) -> {
        publisher.write(event.getRecord().toByteArray());
      };
      return new EventHandler[] {eventHandler};
    }
  }

  @Override
  protected void configure(final Optional<ConfigResponse> config) throws Exception {
    if (!config.get().getConfig().is(Instance.class)) {
      throw new Exception("Configuration error: unknown config instance type");
    }

    final Instance instance = config.get().getConfig().unpack(Instance.class);
    configureLogback(instance.getService().getLogback());

    logger.info("instance.service.name: {}", instance.getService().getName());
    logger.info("instance.receiver: {}", instance.getReceiver());
    logger.info("instance.publisher: {}", instance.getPublisher());

    disruptor = EventUtils.createDisruptor(8, MarketDataRecordEvent.EVENT_FACTORY,
        new MarketDataRecordEventConsumer(), new BlockingWaitStrategy());

    ringBuffer = disruptor.start();

    receiver = new MulticastServer(instance.getReceiver().getNetworkInterface(),
        MarketDataServiceLoader.getGroupAddressMap(instance.getReceiver().getGroupAddressList()),
        new ExchangeSimulatorFeedHandler(ringBuffer));

    publisher = new MulticastServer(instance.getPublisher().getNetworkInterface(),
        MarketDataServiceLoader.getGroupAddressMap(instance.getPublisher().getGroupAddressList()));
  }

  @Override
  protected void start() throws Exception {
    receiver.run();
    publisher.run();
  }

  @Override
  protected void shutdown() {
    logger.warn("MarketDataPublisher::shutdown ...");
    try {
      receiver.shutdown();
      publisher.shutdown();
      disruptor.halt();
      disruptor.shutdown();
    } catch (final Exception ex) {
      logger.error("MarketDataPublisher::shutdown", ex);
    }
  }

  public static void main(final String[] args) {
    BaseService.runService(new MarketDataPublisher());
  }
}
