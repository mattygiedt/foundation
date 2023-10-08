package garden_leave.event;

import com.lmax.disruptor.EventFactory;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class ValueEvent {
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public final static EventFactory<ValueEvent> EVENT_FACTORY = () -> new ValueEvent();

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
