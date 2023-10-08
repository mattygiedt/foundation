package garden_leave.utils;

import com.google.protobuf.Timestamp;
import garden_leave.config.proto.WaitFor;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public final class Protobuf {
  public static Timestamp getTimestamp() {
    final Instant now = Instant.now();
    return Timestamp.newBuilder().setSeconds(now.getEpochSecond()).setNanos(now.getNano()).build();
  }

  public static WaitFor getWaitFor(final long duration, final String chronoUnit) {
    return WaitFor.newBuilder().setDuration(duration).setChronoUnit(chronoUnit).build();
  }

  public static Duration getDuration(final WaitFor waitFor) {
    return Duration.of(waitFor.getDuration(), ChronoUnit.valueOf(waitFor.getChronoUnit()));
  }
}
