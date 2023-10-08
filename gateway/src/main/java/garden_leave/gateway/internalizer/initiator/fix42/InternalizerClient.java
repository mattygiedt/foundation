package garden_leave.gateway.internalizer.initiator.fix42;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import garden_leave.event.EventConsumer;
import garden_leave.event.EventUtils;
import garden_leave.gateway.GatewayInitiator;
import garden_leave.gateway.transform.fix42.MessageEvent;
import garden_leave.gateway.transform.fix42.MessageFactoryProvider;
import garden_leave.gateway.transform.fix42.MessageHandlers;
import garden_leave.gateway.transform.fix42.NewOrderSingle;
import garden_leave.gateway.transform.fix42.OrderCancelRequest;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ConfigError;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.SLF4JLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;

public final class InternalizerClient extends GatewayInitiator {
  private static final Logger logger = LoggerFactory.getLogger(InternalizerClient.class);

  private final Disruptor<MessageEvent> disruptor;
  private final RingBuffer<MessageEvent> ringBuffer;
  private final Consumer<MessageEvent> messageConsumer;
  private quickfix.SessionID sessionId = null;

  public InternalizerClient() {
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

    final Consumer<Runnable> threadStarter = (runnable) -> {
      final Thread thread = new Thread(runnable);
      thread.setDaemon(true);
      thread.start();
    };

    final int maxDelay = 500;
    // threadStarter.accept(sendTwo(maxDelay));
    threadStarter.accept(sendThenCancel(maxDelay));
    threadStarter.accept(sendContinuous(maxDelay));
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

  public Runnable sendThenCancel(final int maxDelay) {
    return new Runnable() {
      @Override
      public void run() {
        final int min = 2000;
        final int max = 5000;

        try {
          while (true) {
            randSleep(maxDelay);

            if (null != sessionId) {
              final NewOrderSingle order = makeNewOrderSingle(min, max);

              quickfix.Session.sendToTarget(order, sessionId);

              randSleep(maxDelay);

              quickfix.Session.sendToTarget(makeOrderCancelRequest(order), sessionId);
            }
          }
        } catch (final Throwable t) {
          logger.error("sendTwo() error:", t);
        }
      }
    };
  }

  public Runnable sendTwo(final int maxDelay) {
    return new Runnable() {
      @Override
      public void run() {
        final int min = 2000;
        final int max = 5000;

        try {
          randSleep(maxDelay);

          if (null != sessionId) {
            quickfix.Session.sendToTarget(
                makeNewOrderSingle(min, max, quickfix.field.Side.BUY), sessionId);

            randSleep(maxDelay);

            quickfix.Session.sendToTarget(
                makeNewOrderSingle(min, max, quickfix.field.Side.SELL), sessionId);

            randSleep(maxDelay);

            return;
          }
        } catch (final Throwable t) {
          logger.error("sendTwo() error:", t);
        }
      }
    };
  }

  public Runnable sendContinuous(final int maxDelay) {
    return new Runnable() {
      @Override
      public void run() {
        try {
          final int min = 2000;
          final int max = 5000;

          while (true) {
            randSleep(maxDelay);

            final NewOrderSingle newOrderSingle = makeNewOrderSingle(min, max);

            newOrderSingle.addGroup(new NewOrderSingle.NoAllocs()
                                        .setAllocAccount("account_A")
                                        .setAllocShares(newOrderSingle.getOrderQty() / 2));

            newOrderSingle.addGroup(new NewOrderSingle.NoAllocs()
                                        .setAllocAccount("account_B")
                                        .setAllocShares(newOrderSingle.getOrderQty()
                                            - (newOrderSingle.getOrderQty() / 2)));

            if (null != sessionId) {
              quickfix.Session.sendToTarget(newOrderSingle, sessionId);
            }
          }
        } catch (final Throwable t) {
          logger.error("runnable error:", t);
        }
      }
    };
  }

  private void randSleep(final int max) throws InterruptedException {
    sleep(ThreadLocalRandom.current().nextInt(0, max));
  }

  private void sleep(final int units) throws InterruptedException {
    TimeUnit.MILLISECONDS.sleep(units);
  }

  private OrderCancelRequest makeOrderCancelRequest(final NewOrderSingle order)
      throws FieldNotFound {
    return new OrderCancelRequest()
        .setOrigClOrdId(order.getClOrdId())
        .setClOrdId(java.util.UUID.randomUUID().toString())
        .setSymbol(order.getSymbol())
        .setSecurityId(order.getSecurityId())
        .setSide(order.getSide())
        .setTransactTime(System.currentTimeMillis());
  }

  private NewOrderSingle makeNewOrderSingle(final int min, final int max) {
    return makeNewOrderSingle(min, max,
        ThreadLocalRandom.current().nextBoolean() ? quickfix.field.Side.BUY
                                                  : quickfix.field.Side.SELL);
  }

  private NewOrderSingle makeNewOrderSingle(final int min, final int max, final char side) {
    final int orderQty = ThreadLocalRandom.current().nextInt(min, max);
    final double price = ThreadLocalRandom.current().nextDouble(min, max);

    return new NewOrderSingle()
        .setClOrdId(java.util.UUID.randomUUID().toString())
        .setSymbol("SPX")
        .setSecurityId("12345")
        .setSide(side)
        .setHandlInst(quickfix.field.HandlInst.MANUAL_ORDER_BEST_EXECUTION)
        .setTransactTime(System.currentTimeMillis())
        .setOrdType(quickfix.field.OrdType.LIMIT)
        .setOrderQty(orderQty)
        .setPrice(price);
  }
}
