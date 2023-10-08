package garden_leave.marketdata;

import garden_leave.marketdata.handler.NullMulticastHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFactory;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollDatagramChannel;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.channel.socket.nio.NioDatagramChannel;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Heavily influenced from:
//  https://gist.github.com/mfilippov/10009192
//  https://github.com/netty/netty/issues/10995

public class MulticastServer extends Thread {
  private static final Logger logger = LoggerFactory.getLogger(MulticastServer.class);
  public static final int DEFAULT_SOCKET_BUFFER_SIZE = 16777216;
  public static final boolean DEFAULT_USE_EPOLL = false;
  public static final String DEFAULT_CHANNEL_NAME = "DEFAULT_CHANNEL";
  public static final ChannelHandler NULL_CHANNEL_HANDLER = new NullMulticastHandler();

  private final int socketBufferSize;
  private final InetAddress localAddress;
  private final NetworkInterface networkInterface;
  private final EventLoopGroup group;
  private final Bootstrap bootstrap;
  private final ChannelHandler handler;
  private final Map<String, InetSocketAddress> groupAddressMap;
  private final Map<String, DatagramChannel> channelMap;
  private final ChannelSocketBuffer[] channelSocketBufferArray;

  private final Consumer<byte[]> messagePublisher;

  public int getSocketBufferSize() {
    return this.socketBufferSize;
  }

  public InetAddress getLocalAddress() {
    return this.localAddress;
  }

  public InetSocketAddress getGroupAddress(final String key) {
    return this.groupAddressMap.get(key);
  }

  public Map<String, InetSocketAddress> getGroupAddressMap() {
    return this.groupAddressMap;
  }

  public NetworkInterface getNetworkInterface() {
    return this.networkInterface;
  }

  public ChannelHandler getChannelHandler() {
    return this.handler;
  }

  private static final class ChannelSocketBuffer {
    public final DatagramChannel channel;
    public final InetSocketAddress remoteAddress;
    public final InetSocketAddress localAddress;

    public ChannelSocketBuffer(final DatagramChannel channel, final InetSocketAddress remoteAddress,
        final InetSocketAddress localAddress) {
      this.channel = channel;
      this.remoteAddress = remoteAddress;
      this.localAddress = localAddress;
    }

    public ChannelFuture writeAndFlush(final byte[] payload) {
      return this.channel.writeAndFlush(new DatagramPacket(
          Unpooled.wrappedBuffer(payload), this.remoteAddress, this.localAddress));
    }
  }

  //
  //  Use this constructor if you are a server publishing data on single socket address
  //    ex: new MulticastServer("eth0", new InetSocketAddress("239.255.27.1", 1234))
  //
  public MulticastServer(final String interfaceName, final InetSocketAddress groupAddress)
      throws SocketException, InterruptedException {
    this(interfaceName, Collections.singletonMap(DEFAULT_CHANNEL_NAME, groupAddress),
        NULL_CHANNEL_HANDLER);
  }

  //
  //  Use this constructor if you are a client and consuming data on a single socket address
  //
  public MulticastServer(final String interfaceName, final InetSocketAddress groupAddress,
      final ChannelHandler handler) throws SocketException, InterruptedException {
    this(interfaceName, Collections.singletonMap(DEFAULT_CHANNEL_NAME, groupAddress), handler);
  }

  //
  //  Use this constructor if you are publishing data on multiple socket addresses
  //
  public MulticastServer(
      final String interfaceName, final Map<String, InetSocketAddress> groupAddressMap)
      throws SocketException, InterruptedException {
    this(interfaceName, groupAddressMap, NULL_CHANNEL_HANDLER, DEFAULT_SOCKET_BUFFER_SIZE,
        DEFAULT_USE_EPOLL);
  }

  //
  //  Use this constructor if you are a client and consuming data on multiple socket addresses
  //
  public MulticastServer(final String interfaceName,
      final Map<String, InetSocketAddress> groupAddressMap, final ChannelHandler handler)
      throws SocketException, InterruptedException {
    this(interfaceName, groupAddressMap, handler, DEFAULT_SOCKET_BUFFER_SIZE, DEFAULT_USE_EPOLL);
  }

  //
  //  Use this constructor if you know what you are doing
  //
  public MulticastServer(final String interfaceName,
      final Map<String, InetSocketAddress> groupAddressMap, final ChannelHandler handler,
      final int socketBufferSize, final boolean useEpoll)
      throws SocketException, InterruptedException {
    this.socketBufferSize = socketBufferSize;
    this.groupAddressMap = groupAddressMap;
    this.handler = handler;
    this.networkInterface = getNetworkInterface(interfaceName);
    this.localAddress = getLocalAddress(this.networkInterface);

    if (useEpoll) {
      this.group = new EpollEventLoopGroup(1);
      this.bootstrap = makeBootstrap(() -> new EpollDatagramChannel(InternetProtocolFamily.IPv4));
    } else {
      this.group = new NioEventLoopGroup(1);
      this.bootstrap = makeBootstrap(() -> new NioDatagramChannel(InternetProtocolFamily.IPv4));
    }

    this.channelMap = new HashMap<>();
    this.channelSocketBufferArray = new ChannelSocketBuffer[this.groupAddressMap.size()];

    logger.info("socketBufferSize: {}", socketBufferSize);
    logger.info("networkInterface: {}", networkInterface);
    logger.info("localAddress: {}", localAddress);
    logger.info("groupAddressMap: {}", groupAddressMap);

    int pos = 0;
    for (final Map.Entry<String, InetSocketAddress> entry : groupAddressMap.entrySet()) {
      final InetSocketAddress remoteAddress = entry.getValue();
      final InetSocketAddress localAddress =
          new InetSocketAddress(getLocalAddress(), remoteAddress.getPort());
      final DatagramChannel channel =
          (DatagramChannel) this.bootstrap.bind(localAddress.getPort()).sync().channel();

      this.channelMap.put(entry.getKey(), channel);
      this.channelSocketBufferArray[pos++] =
          new ChannelSocketBuffer(channel, remoteAddress, localAddress);
    }

    // Optimize writing if there's only one channel
    if (groupAddressMap.size() == 1) {
      messagePublisher = (bytes) -> this.channelSocketBufferArray[0].writeAndFlush(bytes);
    } else {
      messagePublisher = (bytes) -> {
        for (int i = 0; i < this.channelSocketBufferArray.length; i++) {
          this.channelSocketBufferArray[i].writeAndFlush(bytes);
        }
      };
    }
  }

  @Override
  public void run() {
    for (int i = 0; i < this.channelSocketBufferArray.length; i++) {
      final ChannelSocketBuffer channelSocketBuffer = this.channelSocketBufferArray[i];
      final DatagramChannel channel = channelSocketBuffer.channel;
      final InetSocketAddress remoteAddress = channelSocketBuffer.remoteAddress;

      logger.info("channel {} joinGroup, remoteAddress: {}", channel, remoteAddress);
      channel.joinGroup(remoteAddress, this.networkInterface);
    }
  }

  public void write(final byte[] bytes) {
    messagePublisher.accept(bytes);
  }

  public void shutdown() throws Exception {
    this.channelMap.values().forEach((channel) -> channel.close());
    this.group.shutdownGracefully();
  }

  private NetworkInterface getNetworkInterface(final String interfaceName) throws SocketException {
    return NetworkInterface.getByName(interfaceName);
  }

  private InetAddress getLocalAddress(final NetworkInterface networkInterface) {
    final Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
    while (addresses.hasMoreElements()) {
      InetAddress address = addresses.nextElement();
      if (address instanceof Inet4Address) {
        return address;
      }
    }

    throw new RuntimeException(
        "No Inet4Address for network interface: " + networkInterface.getName());
  }

  private Bootstrap makeBootstrap(final Supplier<DatagramChannel> channelSupplier) {
    final Bootstrap bootstrap = new Bootstrap()
                                    .group(this.group)
                                    .channelFactory(new ChannelFactory<DatagramChannel>() {
                                      @Override
                                      public DatagramChannel newChannel() {
                                        return channelSupplier.get();
                                      }
                                    })
                                    .option(ChannelOption.IP_MULTICAST_IF, this.networkInterface)
                                    .option(ChannelOption.SO_REUSEADDR, true)
                                    .option(ChannelOption.SO_RCVBUF, this.socketBufferSize)
                                    .handler(new ChannelInitializer<DatagramChannel>() {
                                      @Override
                                      public void initChannel(DatagramChannel ch) throws Exception {
                                        ch.pipeline().addLast(getChannelHandler());
                                      }
                                    });

    return bootstrap;
  }
}
