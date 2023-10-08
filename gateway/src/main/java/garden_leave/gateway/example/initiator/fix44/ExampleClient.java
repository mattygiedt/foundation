package garden_leave.gateway.example.initiator.fix44;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import garden_leave.event.EventConsumer;
import garden_leave.event.EventUtils;
import garden_leave.gateway.GatewayInitiator;
import garden_leave.gateway.transform.fix44.MessageEvent;
import garden_leave.gateway.transform.fix44.MessageFactoryProvider;
import garden_leave.gateway.transform.fix44.MessageHandlers;
import garden_leave.gateway.transform.fix44.NewOrderSingle;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ConfigError;
import quickfix.FileStoreFactory;
import quickfix.SLF4JLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;

public final class ExampleClient extends GatewayInitiator {
  private static final Logger logger = LoggerFactory.getLogger(ExampleClient.class);

  private final Disruptor<MessageEvent> disruptor;
  private final RingBuffer<MessageEvent> ringBuffer;
  private final Consumer<MessageEvent> messageConsumer;
  private quickfix.SessionID sessionId = null;

  public ExampleClient() {
    this.messageConsumer = new MessageConsumer();
    this.application = application();
    this.disruptor = EventUtils.createDisruptor(
        8, MessageEvent.EVENT_FACTORY, new EventConsumer<MessageEvent>() {
          @Override
          @SuppressWarnings("unchecked")
          public EventHandler<MessageEvent>[] getEventHandler() {
            final EventHandler<MessageEvent> eventHandler = (event, sequence, endOfBatch) -> {
              event.setSequence(sequence);
              messageConsumer.accept(event);
            };
            return new EventHandler[] {eventHandler};
          }
        }, new BlockingWaitStrategy());

    this.ringBuffer = disruptor.start();
  }

  @Override
  public void start() throws Exception {
    this.initiator.start();
    this.newOrderSingleThread.setDaemon(true);
    this.newOrderSingleThread.start();
  }

  @Override
  public void shutdown() {
    this.initiator.stop();
  }

  @Override
  public void createFixInitiator(final SessionSettings sessionSettings) throws ConfigError {
    this.initiator = new SocketInitiator(this.application, new FileStoreFactory(sessionSettings),
        sessionSettings, new SLF4JLogFactory(sessionSettings),
        MessageFactoryProvider.newMessageFactory());
  }

  @Override
  public void registerMessageHandlers() {
    this.application.addOnCreateListener((sessionId) -> {
      logger.info("onCreate: {}", sessionId);
      this.sessionId = sessionId;
    });

    MessageHandlers.addFromAdminListeners(this.application, this.ringBuffer);
    MessageHandlers.addFromAppListeners(this.application, this.ringBuffer);
  }

  private Thread newOrderSingleThread = new Thread(new Runnable() {
    @Override
    public void run() {
      try {
        final int min = 2000;
        final int max = 5000;

        while (true) {
          TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(min, max));
          final int orderQty = ThreadLocalRandom.current().nextInt(min, max);
          final NewOrderSingle newOrderSingle =
              new NewOrderSingle()
                  .setClOrdId(java.util.UUID.randomUUID().toString())
                  .setSymbol("SPX")
                  .setSide(quickfix.field.Side.BUY)
                  .setHandlInst(quickfix.field.HandlInst.MANUAL_ORDER_BEST_EXECUTION)
                  .setTransactTime(System.currentTimeMillis())
                  .setOrdType(quickfix.field.OrdType.LIMIT)
                  .setOrderQty(orderQty)
                  .setPrice(ThreadLocalRandom.current().nextDouble(min, max));

          newOrderSingle.addGroup(new NewOrderSingle.NoAllocs()
                                      .setAllocAccount("account_AA")
                                      .setAllocQty(orderQty / 2));

          newOrderSingle.addGroup(new NewOrderSingle.NoAllocs()
                                      .setAllocAccount("account_BB")
                                      .setAllocQty(orderQty - (orderQty / 2)));

          if (null != sessionId) {
            quickfix.Session.sendToTarget(newOrderSingle, sessionId);
          }
        }
      } catch (final Throwable t) {
        logger.error("runnable error:", t);
      }
    }
  });
}
