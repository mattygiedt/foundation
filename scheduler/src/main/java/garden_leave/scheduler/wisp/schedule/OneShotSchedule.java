package garden_leave.scheduler.wisp.schedule;

public class OneShotSchedule implements Schedule {
  private final long initialDelay;

  public OneShotSchedule() {
    this(0);
  }

  public OneShotSchedule(final long initialDelay) {
    this.initialDelay = initialDelay;
  }

  @Override
  public long nextExecutionInMillis(
      long currentTimeInMillis, int executionsCount, Long lastExecutionTimeInMillis) {
    return System.currentTimeMillis() + initialDelay;
  }

  @Override
  public String toString() {
    return "one shot";
  }
}
