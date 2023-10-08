package garden_leave.scheduler.wisp;

import garden_leave.scheduler.wisp.schedule.Schedule;
import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * A {@code Job} is the association of a {@link Runnable} process
 * and its running {@link Schedule}.<br/>
 * <br/>
 * A {@code Job} also contains information about its status and its running
 * statistics.
 */
public class Job {
  private JobStatus status;
  private volatile long nextExecutionTimeInMillis;
  private volatile int executionsCount;
  private final int maxExecutionsCount;
  private Long lastExecutionStartedTimeInMillis;
  private Long lastExecutionEndedTimeInMillis;
  private Thread threadRunningJob;
  private final String name;
  private Schedule schedule;
  private Scheduler scheduler;
  private final Runnable runnable;
  private Runnable runningJob;

  private final CountDownLatch doneLatch = new CountDownLatch(1);

  // public API

  public JobStatus status() {
    return status;
  }

  public JobStatus waitForDone() {
    return waitForDone(365, TimeUnit.DAYS);
  }

  public JobStatus waitForDone(final long timeout, final TimeUnit timeUnit) {
    try {
      doneLatch.await(timeout, timeUnit);
    } catch (final Throwable t) {
    }

    return status();
  }

  public long nextExecutionTimeInMillis() {
    return nextExecutionTimeInMillis;
  }

  public int executionsCount() {
    return executionsCount;
  }

  public int maxExecutionsCount() {
    return maxExecutionsCount;
  }

  /**
   * The timestamp of when the job has last been started.
   */
  public Long lastExecutionStartedTimeInMillis() {
    return lastExecutionStartedTimeInMillis;
  }

  /**
   * The timestamp of when the job has last been started.
   *
   * @deprecated Use {@link #lastExecutionStartedTimeInMillis()}.
   * This method will be deleted in version 3.0.0.
   */
  @Deprecated
  public Long timeInMillisSinceJobRunning() {
    return lastExecutionStartedTimeInMillis;
  }

  /**
   * The timestamp of when the job has last finished executing.
   */
  public Long lastExecutionEndedTimeInMillis() {
    return lastExecutionEndedTimeInMillis;
  }

  /**
   * The timestamp of when the job has last finished executing.
   * @deprecated Use {@link #lastExecutionEndedTimeInMillis()}.
   * This method will be deleted in version 3.0.0.
   */
  @Deprecated
  public Long lastExecutionTimeInMillis() {
    return lastExecutionEndedTimeInMillis;
  }

  public Thread threadRunningJob() {
    return threadRunningJob;
  }

  public String name() {
    return name;
  }

  public Schedule schedule() {
    return schedule;
  }

  public Scheduler scheduler() {
    return scheduler;
  }

  public Runnable runnable() {
    return runnable;
  }

  // package API

  Job(JobStatus status, long nextExecutionTimeInMillis, int executionsCount, int maxExecutionsCount,
      Long lastExecutionStartedTimeInMillis, Long lastExecutionEndedTimeInMillis, String name,
      Schedule schedule, Runnable runnable) {
    this.status = status;
    this.nextExecutionTimeInMillis = nextExecutionTimeInMillis;
    this.executionsCount = executionsCount;
    this.maxExecutionsCount = maxExecutionsCount;
    this.lastExecutionStartedTimeInMillis = lastExecutionStartedTimeInMillis;
    this.lastExecutionEndedTimeInMillis = lastExecutionEndedTimeInMillis;
    this.name = name;
    this.schedule = schedule;
    this.runnable = runnable;
  }

  void status(JobStatus status) {
    this.status = status;

    if (this.status == JobStatus.DONE) {
      doneLatch.countDown();
    }
  }

  void nextExecutionTimeInMillis(long nextExecutionTimeInMillis) {
    this.nextExecutionTimeInMillis = nextExecutionTimeInMillis;
  }

  void executionsCount(int executionsCount) {
    this.executionsCount = executionsCount;
  }

  void lastExecutionStartedTimeInMillis(Long lastExecutionStartedTimeInMillis) {
    this.lastExecutionStartedTimeInMillis = lastExecutionStartedTimeInMillis;
  }

  void lastExecutionEndedTimeInMillis(Long lastExecutionEndedTimeInMillis) {
    this.lastExecutionEndedTimeInMillis = lastExecutionEndedTimeInMillis;
  }

  void threadRunningJob(Thread threadRunningJob) {
    this.threadRunningJob = threadRunningJob;
  }

  void schedule(Schedule schedule) {
    this.schedule = schedule;
  }

  void scheduler(Scheduler scheduler) {
    this.scheduler = scheduler;
  }

  void runningJob(Runnable runningJob) {
    this.runningJob = runningJob;
  }

  Runnable runningJob() {
    return runningJob;
  }

  // toString

  @Override
  public String toString() {
    return "Job " + name + " [" + status + "] - will run " + schedule + " - next execution at "
        + Instant.ofEpochMilli(nextExecutionTimeInMillis);
  }
}
