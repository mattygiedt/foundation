package garden_leave.scheduler.wisp.schedule;

import garden_leave.scheduler.wisp.schedule.cron.CronExpressionSchedule;
import java.time.Duration;
import java.time.ZoneId;

/**
 * Static helpers to build {@link Schedule}
 */
public class Schedules {
  /**
   * Execute a job once, upon being scheduled (with an optional initial delay)
   */
  public static Schedule oneShot(long initialDelayMillis) {
    return Schedules.executeOnce(new OneShotSchedule(initialDelayMillis));
  }

  /**
   * Execute a job at a fixed delay after each execution
   */
  public static Schedule fixedDelaySchedule(Duration duration) {
    return new FixedDelaySchedule(duration);
  }

  /**
   * Execute a job at the same time once a day.
   * The time format must be "hh:mm" or "hh:mm:ss"
   */
  public static Schedule executeAt(String time, String timezone) {
    final ZoneId zoneId;

    if (timezone == null || timezone.isEmpty()) {
      zoneId = ZoneId.systemDefault();
    } else {
      zoneId = ZoneId.of(timezone);
    }

    return new FixedTimeSchedule(time, zoneId);
  }

  /**
   * Create a Schedule from the supplied cron expression
   */
  public static Schedule crontab(String cronExpression) {
    return crontab(cronExpression, false);
  }

  public static Schedule crontab(String cronExpression, boolean parseWithSeconds) {
    if (parseWithSeconds) {
      return CronExpressionSchedule.parseWithSeconds(cronExpression);
    } else {
      return CronExpressionSchedule.parse(cronExpression);
    }
  }

  // composition schedules
  public static Schedule executeOnce(Schedule schedule) {
    if (schedule instanceof OnceSchedule) {
      return schedule;
    }

    return new OnceSchedule(schedule);
  }

  public static Schedule limit(Schedule schedule, final int maxExecutionCount) {
    if (schedule instanceof ExecutionLimitSchedule) {
      return schedule;
    }

    return new ExecutionLimitSchedule(schedule, maxExecutionCount);
  }

  public static Schedule afterInitialDelay(Schedule schedule, Duration initialDelay) {
    return new AfterInitialDelaySchedule(schedule, initialDelay);
  }
}
