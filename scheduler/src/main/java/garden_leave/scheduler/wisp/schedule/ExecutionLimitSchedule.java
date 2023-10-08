package garden_leave.scheduler.wisp.schedule;

public class ExecutionLimitSchedule implements Schedule {
  private final Schedule baseSchedule;
  private final int maxExecutionCount;

  public int getMaxExecutionCount() {
    return maxExecutionCount;
  }

  public ExecutionLimitSchedule(Schedule baseSchedule, final int maxExecutionCount) {
    this.baseSchedule = baseSchedule;
    this.maxExecutionCount = maxExecutionCount;
  }

  @Override
  public long nextExecutionInMillis(
      long currentTimeInMillis, int executionsCount, Long lastExecutionTimeInMillis) {
    if (maxExecutionCount < executionsCount) {
      return WILL_NOT_BE_EXECUTED_AGAIN;
    }
    return baseSchedule.nextExecutionInMillis(
        currentTimeInMillis, executionsCount, lastExecutionTimeInMillis);
  }

  public Schedule baseSchedule() {
    return baseSchedule;
  }

  @Override
  public String toString() {
    return " up to " + maxExecutionCount + " times, " + baseSchedule;
  }
}
