package garden_leave.marketdata;

import garden_leave.config.loaders.marketdata.MarketDataServiceLoader;
import garden_leave.config.proto.MarketDataService.Instance;
import garden_leave.grpc.ConfigResponse;
import garden_leave.service.BaseService;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ExchangeSimulator -- publishes a mock [A|B] feed to multiple UDP addresses
 */

public class ExchangeSimulator extends BaseService {
  private static final Logger logger = LoggerFactory.getLogger(ExchangeSimulator.class);
  public static final int QUOTE_MSG = 1;
  public static final int TRADE_MSG = 2;

  private final int MIN_SLEEP_MILLIS = 100;
  private final int MAX_SLEEP_MILLIS = 1000;
  private final boolean USE_SINGLE_SERVER = false;

  private final AtomicBoolean flag = new AtomicBoolean(true);
  private final AtomicInteger sequenceNumber = new AtomicInteger(0);
  private final Random random = new Random();
  private final int byteArraySize = 1024;

  private MulticastServer server = null;
  private MulticastServer server1 = null;
  private MulticastServer server2 = null;

  private Thread broadcastThread1 = null;
  private Thread broadcastThread2 = null;
  private Thread messageGeneratorThread = null;

  final Supplier<byte[]> tradeSupplier = () -> {
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byteArraySize);
    final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(sequenceNumber.addAndGet(1));
      dataOutputStream.writeInt(TRADE_MSG);
      dataOutputStream.writeLong(random.nextLong(1, 100)); // InstrumentId
      dataOutputStream.writeInt(random.nextInt(1, 2500)); // TradeSize
      dataOutputStream.writeDouble(random.nextDouble(50, 120)); // TradePrice
    } catch (final IOException ex) {
      logger.error("ExchangeSimulator::tradeSupplier", ex);
    }

    return byteArrayOutputStream.toByteArray();
  };

  final Supplier<byte[]> quoteSupplier = () -> {
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byteArraySize);
    final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(sequenceNumber.addAndGet(1));
      dataOutputStream.writeInt(QUOTE_MSG);
      dataOutputStream.writeLong(random.nextLong(1, 100)); // InstrumentId
      dataOutputStream.writeInt(random.nextInt(1, 2500)); // BidSize
      dataOutputStream.writeInt(random.nextInt(1, 2500)); // AskSize
      dataOutputStream.writeDouble(random.nextDouble(50, 120)); // BidPrice
      dataOutputStream.writeDouble(random.nextDouble(50, 120)); // AskPrice
    } catch (final IOException ex) {
      logger.error("ExchangeSimulator::quoteSupplier", ex);
    }

    return byteArrayOutputStream.toByteArray();
  };

  private final class MessageGenerator implements Runnable {
    private final List<BlockingQueue<byte[]>> blockingQueueList;
    private final List<BlockingQueue<byte[]>> reversedBlockingQueueList;

    public MessageGenerator(final List<BlockingQueue<byte[]>> blockingQueueList) {
      this.blockingQueueList = blockingQueueList;
      this.reversedBlockingQueueList = new ArrayList<>(blockingQueueList);
      Collections.reverse(reversedBlockingQueueList);
    }

    private final BiConsumer<BlockingQueue<byte[]>, byte[]> consumer = (queue, bytes) -> {
      try {
        queue.put(bytes);
      } catch (final InterruptedException ex) {
        logger.error("MessageGenerator queue.put error", ex);
      }
    };

    @Override
    public void run() {
      while (flag.get()) {
        final byte[] bytes;
        final boolean coinFlip = random.nextBoolean();

        if (coinFlip) {
          bytes = quoteSupplier.get();
          blockingQueueList.forEach((queue) -> consumer.accept(queue, bytes));
        } else {
          bytes = tradeSupplier.get();
          reversedBlockingQueueList.forEach((queue) -> consumer.accept(queue, bytes));
        }

        try {
          Thread.sleep(random.nextInt(MIN_SLEEP_MILLIS, MAX_SLEEP_MILLIS));
        } catch (final InterruptedException ex) {
          logger.error("MessageGenerator Thread.sleep error", ex);
          return;
        }
      }
    }
  }

  private final class MessagePublisher implements Runnable {
    private final MulticastServer server;
    private final BlockingQueue<byte[]> queue;

    public MessagePublisher(final BlockingQueue<byte[]> queue, final MulticastServer server) {
      this.queue = queue;
      this.server = server;
    }

    @Override
    public void run() {
      while (flag.get()) {
        try {
          final byte[] bytes = this.queue.poll(50, TimeUnit.MILLISECONDS);
          if (bytes != null) {
            if (random.nextBoolean()) {
              // introduce some jitter...
              try {
                Thread.sleep(5);
              } catch (final InterruptedException ex) {
                logger.error("MessagePublisher Thread.sleep error", ex);
                return;
              }
            }
            server.write(bytes);
            logger.info("published {} bytes", bytes.length);
          }
        } catch (final InterruptedException ex) {
          logger.error("MessagePublisher queue.poll error", ex);
          return;
        }
      }
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

    final List<BlockingQueue<byte[]>> queueList = new ArrayList<>();
    queueList.add(new LinkedBlockingDeque<>());
    queueList.add(new LinkedBlockingDeque<>());

    messageGeneratorThread = new Thread(new MessageGenerator(queueList), "MessageGenerator");

    if (USE_SINGLE_SERVER) {
      server = new MulticastServer(instance.getPublisher().getNetworkInterface(),
          MarketDataServiceLoader.getGroupAddressMap(instance.getPublisher().getGroupAddressList()),
          MulticastServer.NULL_CHANNEL_HANDLER);

      broadcastThread1 =
          new Thread(new MessagePublisher(queueList.get(0), server), "MessagePublisher_1");
      broadcastThread2 =
          new Thread(new MessagePublisher(queueList.get(1), server), "MessagePublisher_2");

    } else {
      final Map<String, InetSocketAddress> addressMap =
          MarketDataServiceLoader.getGroupAddressMap(instance.getPublisher().getGroupAddressList());

      server1 = new MulticastServer(instance.getPublisher().getNetworkInterface(),
          addressMap.get("A"), MulticastServer.NULL_CHANNEL_HANDLER);
      server2 = new MulticastServer(instance.getPublisher().getNetworkInterface(),
          addressMap.get("B"), MulticastServer.NULL_CHANNEL_HANDLER);

      broadcastThread1 =
          new Thread(new MessagePublisher(queueList.get(0), server1), "MessagePublisher_1");
      broadcastThread2 =
          new Thread(new MessagePublisher(queueList.get(1), server2), "MessagePublisher_2");
    }
  }

  @Override
  protected void start() throws Exception {
    if (USE_SINGLE_SERVER) {
      server.run();
    } else {
      server1.run();
      server2.run();
    }

    broadcastThread1.start();
    broadcastThread2.start();
    messageGeneratorThread.start();
  }

  @Override
  protected void shutdown() {
    logger.warn("ExchangeSimulator::shutdown ...");
    flag.set(false);
    try {
      messageGeneratorThread.join();
      broadcastThread1.join();
      broadcastThread2.join();
      if (USE_SINGLE_SERVER) {
        server.shutdown();
      } else {
        server1.shutdown();
        server2.shutdown();
      }
    } catch (final Exception ex) {
      logger.error("ExchangeSimulator::shutdown", ex);
    }
  }

  public static void main(final String[] args) {
    BaseService.runService(new ExchangeSimulator());
  }
}
