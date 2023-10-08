package garden_leave.gateway.example.acceptor.fix44;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import garden_leave.event.EventConsumer;
import garden_leave.event.EventUtils;
import garden_leave.gateway.GatewayAcceptor;
import garden_leave.gateway.transform.fix44.MessageEvent;
import garden_leave.gateway.transform.fix44.MessageFactoryProvider;
import garden_leave.gateway.transform.fix44.MessageHandlers;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ConfigError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public class ExampleVenue extends GatewayAcceptor {
  private static final Logger logger = LoggerFactory.getLogger(ExampleVenue.class);

  private final Disruptor<MessageEvent> disruptor;
  private final RingBuffer<MessageEvent> ringBuffer;
  private final Consumer<MessageEvent> messageConsumer;

  public ExampleVenue() {
    this.application = application();
    this.messageConsumer = new MessageConsumer();

    this.disruptor = EventUtils.createDisruptor(
        8, MessageEvent.EVENT_FACTORY, new EventConsumer<MessageEvent>() {
          @Override
          @SuppressWarnings("unchecked")
          public EventHandler<MessageEvent>[] getEventHandler() {
            final EventHandler<MessageEvent> eventHandler = (event, sequence, endOfBatch) -> {
              messageConsumer.accept(event);
            };
            return new EventHandler[] {eventHandler};
          }
        }, new BlockingWaitStrategy());

    this.ringBuffer = disruptor.start();
  }

  @Override
  public void createFixAcceptor(final SessionSettings sessionSettings) throws ConfigError {
    this.acceptor =
        new SocketAcceptor(this.application, new FileStoreFactory(sessionSettings), sessionSettings,
            new FileLogFactory(sessionSettings), MessageFactoryProvider.newMessageFactory());
  }

  @Override
  public void start() throws Exception {
    this.acceptor.start();
  }

  @Override
  public void shutdown() {
    this.acceptor.stop();
  }

  @Override
  public void registerMessageHandlers() {
    this.application.addOnCreateListener((sessionId) -> logger.info("onCreate: {}", sessionId));
    MessageHandlers.addFromAdminListeners(this.application, this.ringBuffer);
    MessageHandlers.addFromAppListeners(this.application, this.ringBuffer);
  }
}
