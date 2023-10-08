package garden_leave.scheduler;

import garden_leave.config.proto.ScheduledTask;
import garden_leave.config.proto.TaskConstraint;
import garden_leave.scheduler.task.Task;
import garden_leave.scheduler.task.Tasks;
import garden_leave.scheduler.wisp.Scheduler;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskScheduler {
  private static final Logger logger = LoggerFactory.getLogger(TaskScheduler.class);

  private final Scheduler scheduler = new Scheduler();
  private final Map<String, Task> taskMap = new HashMap<>();

  public Optional<Task> findTask(final String name) {
    return Optional.ofNullable(taskMap.get(name));
  }

  public void schedule(final ScheduledTask scheduledTask) throws Exception {
    logger.info("scheduling task: {}", scheduledTask.getName());

    final Task task = Tasks.from(scheduledTask);

    // Try to add each constraint to the task
    for (final TaskConstraint constraint : scheduledTask.getConstraintList()) {
      // Prevent setting yourself as a task constraint
      if (scheduledTask.getName().equals(constraint.getName())) {
        throw new Exception("task '" + scheduledTask.getName()
            + "' constraint error: task constraint cannot refer to itself.");
      }

      // Ensure the scheduler has this constraint as a registered job
      if (scheduler.findJob(constraint.getName()).isEmpty()) {
        throw new Exception("task '" + scheduledTask.getName()
            + "' constraint error: no constraint named " + constraint.getName());
      }

      task.addConstraint(constraint);
    }

    // Register the task with the scheduler and add to the task map
    task.register(scheduler);
    taskMap.put(task.getName(), task);
  }

  public void shutdown() {
    logger.warn("TaskScheduler::shutdown ...");
    taskMap.values().forEach((task) -> task.cancel());
    taskMap.clear();
    scheduler.gracefullyShutdown(Duration.ofSeconds(1));
  }
}
