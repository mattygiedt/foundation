package garden_leave.event;

import com.lmax.disruptor.EventHandler;

public interface EventConsumer<T> {
  /**
   * One or more event handler to handle event from ring buffer.
   */
  public EventHandler<T>[] getEventHandler();
}
