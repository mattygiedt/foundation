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
import garden_leave.marketdata.handler.MarketDataPublisherFeedHandler;
import garden_leave.service.BaseService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarketDataConsumer -- example service that receives market data record events and logs them.
 */

public class MarketDataConsumer extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(MarketDataConsumer.class);

  private MulticastServer server = null;
  private Disruptor<MarketDataRecordEvent> disruptor = null;
  private RingBuffer<MarketDataRecordEvent> ringBuffer = null;

  private final class MarketDataRecordEventConsumer
      implements EventConsumer<MarketDataRecordEvent> {
    @Override
    @SuppressWarnings("unchecked")
    public EventHandler<MarketDataRecordEvent>[] getEventHandler() {
      final EventHandler<MarketDataRecordEvent> eventHandler = (event, sequence, endOfBatch) -> {
        logger.info(event.getRecord().toString());
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

    disruptor = EventUtils.createDisruptor(8, MarketDataRecordEvent.EVENT_FACTORY,
        new MarketDataRecordEventConsumer(), new BlockingWaitStrategy());

    ringBuffer = disruptor.start();

    server = new MulticastServer(instance.getReceiver().getNetworkInterface(),
        MarketDataServiceLoader.getGroupAddressMap(instance.getReceiver().getGroupAddressList()),
        new MarketDataPublisherFeedHandler(ringBuffer));
  }

  @Override
  protected void start() throws Exception {
    server.run();
  }

  @Override
  protected void shutdown() {
    logger.warn("MarketDataConsumer::shutdown ...");
    try {
      server.shutdown();
      disruptor.halt();
      disruptor.shutdown();
    } catch (final Exception ex) {
      logger.error("MarketDataConsumer::shutdown", ex);
    }
  }

  public static void main(final String[] args) {
    BaseService.runService(new MarketDataConsumer());
  }
}
