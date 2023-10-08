package garden_leave.event;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.ExceptionHandler;
import com.lmax.disruptor.FatalExceptionHandler;
import com.lmax.disruptor.WaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

public final class EventUtils {
  public static <T> Disruptor<T> createDisruptor(int ringBufferSize, EventFactory<T> eventFactory,
      EventConsumer<T> eventConsumer, WaitStrategy waitStrategy) {
    return createDisruptor(
        ringBufferSize, eventFactory, eventConsumer, waitStrategy, new FatalExceptionHandler());
  }

  public static <T> Disruptor<T> createDisruptor(int ringBufferSize, EventFactory<T> eventFactory,
      EventConsumer<T> eventConsumer, WaitStrategy waitStrategy,
      ExceptionHandler<Object> exceptionHandler) {
    final Disruptor<T> disruptor = new Disruptor<>(eventFactory, ringBufferSize,
        DaemonThreadFactory.INSTANCE, ProducerType.SINGLE, waitStrategy);

    disruptor.handleEventsWith(eventConsumer.getEventHandler());
    disruptor.setDefaultExceptionHandler(exceptionHandler);

    return disruptor;
  }
}
