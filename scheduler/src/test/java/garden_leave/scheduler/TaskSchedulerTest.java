package garden_leave.scheduler;

import static org.junit.Assert.*;

import garden_leave.config.proto.ScheduledTask;
import garden_leave.config.proto.ScheduledTask.Cron;
import garden_leave.config.proto.ScheduledTask.FixedDelay;
import garden_leave.config.proto.ScheduledTask.FixedTime;
import garden_leave.config.proto.ScheduledTask.OneShot;
import garden_leave.config.proto.TaskConstraint;
import garden_leave.config.proto.WaitFor;
import garden_leave.scheduler.task.Task;
import garden_leave.scheduler.wisp.JobStatus;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskSchedulerTest {
  private static final Logger logger = LoggerFactory.getLogger(TaskSchedulerTest.class);

  private final WaitFor oneSecond =
      WaitFor.newBuilder().setDuration(1).setChronoUnit("SECONDS").build();

  private ScheduledTask buildConstraint(final String constraintName) {
    return buildConstraint(constraintName, 0);
  }
  private ScheduledTask buildConstraint(final String constraintName, final int initialDelayMs) {
    return ScheduledTask.newBuilder()
        .setName(constraintName)
        .setTaskClass("garden_leave.scheduler.task.NullTask")
        .setOneShot(OneShot.newBuilder().setInitialDelay(
            WaitFor.newBuilder().setDuration(initialDelayMs).setChronoUnit("MILLIS").build()))
        .build();
  }

  private ScheduledTask.Builder buildTask(final String taskName) {
    return buildTask(taskName, 0);
  }
  private ScheduledTask.Builder buildTask(final String taskName, final int executionLimit) {
    final String taskConstraintName = taskName + ".constraint";
    return ScheduledTask.newBuilder()
        .setName(taskName)
        .setTaskClass("garden_leave.scheduler.task.NullTask")
        .setExecutionLimit(executionLimit)
        .addArg("message=\"This is a message\"")
        .addArg("count=1")
        .addConstraint(TaskConstraint.newBuilder()
                           .setName(taskConstraintName)
                           .setLimit(1)
                           .setWaitFor(oneSecond)
                           .build());
  }

  @Test
  public void cronScheduleTest() throws Exception {
    final String taskName = "cron_task";
    final String taskConstraintName = taskName + ".constraint";
    final TaskScheduler scheduler = new TaskScheduler();

    scheduler.schedule(buildConstraint(taskConstraintName));

    final ScheduledTask task =
        buildTask(taskName)
            .setCron(Cron.newBuilder().setCrontab("15 * * * *").setParseWithSeconds(false).build())
            .build();

    scheduler.schedule(task);

    Optional<Task> scheduledTask = scheduler.findTask(taskName);
    Optional<Task> taskConstraint = scheduler.findTask(taskConstraintName);

    assertTrue(scheduledTask.isPresent());
    assertTrue(taskConstraint.isPresent());

    logger.debug(scheduledTask.get().getJob().status().toString());
    logger.debug(taskConstraint.get().getJob().status().toString());

    final JobStatus constraintStatus =
        taskConstraint.get().getJob().waitForDone(100, TimeUnit.MILLISECONDS);

    assertTrue(scheduledTask.get().getJob().status() == JobStatus.SCHEDULED);
    assertTrue(constraintStatus == JobStatus.DONE);

    scheduler.shutdown();
  }

  @Test
  public void fixedTimeScheduleTest() throws Exception {
    final String taskName = "fixed_time_task";
    final String taskConstraintName = taskName + ".constraint";
    final TaskScheduler scheduler = new TaskScheduler();

    scheduler.schedule(buildConstraint(taskConstraintName));

    final ScheduledTask task =
        buildTask(taskName)
            .setFixedTime(FixedTime.newBuilder().setTime("00:00:00").setTimeZone("UTC").build())
            .build();

    scheduler.schedule(task);

    Optional<Task> scheduledTask = scheduler.findTask(taskName);
    Optional<Task> taskConstraint = scheduler.findTask(taskConstraintName);

    assertTrue(scheduledTask.isPresent());
    assertTrue(taskConstraint.isPresent());

    final JobStatus constraintStatus =
        taskConstraint.get().getJob().waitForDone(100, TimeUnit.MILLISECONDS);

    assertTrue(scheduledTask.get().getJob().status() == JobStatus.SCHEDULED);
    assertTrue(scheduledTask.get().getJob().executionsCount() == 0);
    assertTrue(constraintStatus == JobStatus.DONE);

    scheduler.shutdown();
  }

  @Test
  public void fixedDelayScheduleTest() throws Exception {
    final String taskName = "fixed_delay_task";
    final String taskConstraintName = taskName + ".constraint";
    final TaskScheduler scheduler = new TaskScheduler();

    // Build a task constraint with a 100 ms initial delay
    scheduler.schedule(buildConstraint(taskConstraintName, 100));

    // Create a new fixed delay task to run at most three times
    final ScheduledTask task =
        buildTask(taskName, 3)
            .setFixedDelay(
                FixedDelay.newBuilder()
                    .setInitialDelay(
                        WaitFor.newBuilder().setDuration(50).setChronoUnit("MILLIS").build())
                    .setPeriod(WaitFor.newBuilder().setDuration(50).setChronoUnit("MILLIS").build())
                    .build())
            .build();

    scheduler.schedule(task);

    // Get a handle to each (scheduled, constraint) task
    Optional<Task> scheduledTask = scheduler.findTask(taskName);
    Optional<Task> taskConstraint = scheduler.findTask(taskConstraintName);

    assertTrue(scheduledTask.isPresent());
    assertTrue(taskConstraint.isPresent());

    // Both tasks should be scheduled, as task constraint is blocking
    assertTrue(scheduledTask.get().getJob().status() == JobStatus.SCHEDULED);
    assertTrue(taskConstraint.get().getJob().status() == JobStatus.SCHEDULED);
    assertTrue(scheduledTask.get().getJob().maxExecutionsCount() == 3);

    // Wait up to 500ms for the constraint to run and the task to reach a DONE status after
    // executing 3 times
    final JobStatus taskStatus =
        scheduledTask.get().getJob().waitForDone(500, TimeUnit.MILLISECONDS);

    assertTrue(taskStatus == JobStatus.DONE);
    assertTrue(scheduledTask.get().getJob().executionsCount() == 3);
    assertTrue(taskConstraint.get().getJob().status() == JobStatus.DONE);

    scheduler.shutdown();
  }

  @Test
  public void oneShotScheduleTest() throws Exception {
    final String taskName = "one_shot_task";
    final String taskConstraintName = taskName + ".constraint";
    final TaskScheduler scheduler = new TaskScheduler();

    // Build a task constraint with a 100 ms initial delay
    scheduler.schedule(buildConstraint(taskConstraintName, 100));

    // Create a one shot task that tries to execute immediately
    final ScheduledTask task = buildTask(taskName).setOneShot(OneShot.newBuilder().build()).build();
    scheduler.schedule(task);

    // Get a handle to each (scheduled, constraint) task
    Optional<Task> scheduledTask = scheduler.findTask(taskName);
    Optional<Task> taskConstraint = scheduler.findTask(taskConstraintName);

    assertTrue(scheduledTask.isPresent());
    assertTrue(taskConstraint.isPresent());

    // Both tasks should be scheduled, but not run, as task constraint is blocking
    assertTrue(scheduledTask.get().getJob().status() == JobStatus.SCHEDULED);
    assertTrue(taskConstraint.get().getJob().status() == JobStatus.SCHEDULED);

    // Wait up to 200ms for the constraint to run and the task to reach a DONE status
    final JobStatus taskStatus =
        scheduledTask.get().getJob().waitForDone(200, TimeUnit.MILLISECONDS);

    assertTrue(taskStatus == JobStatus.DONE);
    assertTrue(scheduledTask.get().getJob().executionsCount() == 1);
    assertTrue(taskConstraint.get().getJob().status() == JobStatus.DONE);

    scheduler.shutdown();
  }
}
