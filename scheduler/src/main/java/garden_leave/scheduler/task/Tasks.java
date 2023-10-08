package garden_leave.scheduler.task;

import garden_leave.config.proto.ScheduledTask;
import garden_leave.scheduler.wisp.schedule.Schedule;
import garden_leave.scheduler.wisp.schedule.Schedules;
import garden_leave.utils.Protobuf;
import java.lang.reflect.Constructor;
import java.util.List;

public final class Tasks {
  public static final Task from(final ScheduledTask scheduledTask) throws Exception {
    //
    //  Construct the task
    //

    final Constructor<?> cstr =
        Class.forName(scheduledTask.getTaskClass())
            .getConstructor(new Class[] {String.class, List.class, Integer.class});
    final Task task = Task.class.cast(cstr.newInstance(
        scheduledTask.getName(), scheduledTask.getArgList(), scheduledTask.getExecutionLimit()));

    //
    //  Figure out what type of schedule this task runs on
    //

    Schedule schedule = null;
    switch (scheduledTask.getScheduleCase()) {
      case CRON:
        schedule = Schedules.crontab(
            scheduledTask.getCron().getCrontab(), scheduledTask.getCron().getParseWithSeconds());
        break;

      case FIXED_TIME:
        schedule = Schedules.executeAt(
            scheduledTask.getFixedTime().getTime(), scheduledTask.getFixedTime().getTimeZone());
        break;

      case FIXED_DELAY:
        schedule = Schedules.fixedDelaySchedule(
            Protobuf.getDuration(scheduledTask.getFixedDelay().getPeriod()));

        if (scheduledTask.getFixedDelay().hasInitialDelay()) {
          schedule = Schedules.afterInitialDelay(
              schedule, Protobuf.getDuration(scheduledTask.getFixedDelay().getInitialDelay()));
        }
        break;

      case ONE_SHOT:
        long initialDelayMillis = 0;
        if (scheduledTask.getOneShot().hasInitialDelay()) {
          initialDelayMillis =
              Protobuf.getDuration(scheduledTask.getOneShot().getInitialDelay()).toMillis();
        }

        schedule = Schedules.oneShot(initialDelayMillis);
        break;

      case SCHEDULE_NOT_SET:
        throw new RuntimeException("scheduled task: " + task.getName() + " has no schedule");
    }

    //
    // Set the schedule on the task and return
    //

    task.setSchedule(schedule);
    return task;
  }
}
