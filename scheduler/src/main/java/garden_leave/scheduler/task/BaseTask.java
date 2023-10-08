package garden_leave.scheduler.task;

import garden_leave.config.proto.TaskConstraint;
import garden_leave.scheduler.wisp.Job;
import garden_leave.scheduler.wisp.Scheduler;
import garden_leave.scheduler.wisp.schedule.Schedule;
import garden_leave.utils.Protobuf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTask implements Task {
  private static final Logger logger = LoggerFactory.getLogger(BaseTask.class);

  private static final long SLEEP_MILLIS = 50L;

  protected int maxExecutionCount = 0;
  protected Job job;
  protected String name;
  protected List<String> args;
  protected Schedule schedule;

  protected List<TaskConstraint> constraintList = new ArrayList<>();
  protected final AtomicBoolean active = new AtomicBoolean(true);

  public abstract void execute();

  @Override
  public void cancel() {
    active.set(false);
  }

  @Override
  public int getMaxExecutionCount() {
    return maxExecutionCount;
  }

  @Override
  public Job getJob() {
    return job;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public List<String> getArgs() {
    return args;
  }

  @Override
  public Schedule getSchedule() {
    return schedule;
  }

  @Override
  public void setSchedule(final Schedule schedule) {
    this.schedule = schedule;
  }

  @Override
  public void addConstraint(final TaskConstraint constraint) {
    constraintList.add(constraint);
  }

  @Override
  public void register(final Scheduler scheduler) throws Exception {
    register(scheduler, getSchedule());
  }

  @Override
  public void register(final Scheduler scheduler, final Schedule schedule) throws Exception {
    this.job = scheduler.schedule(this.getName(), this, getSchedule(), getMaxExecutionCount());
  }

  @Override
  public void run() {
    if (checkConstraints()) {
      execute();
    } else {
      throw new RuntimeException("task: " + getName() + " failed checkConstraints()");
    }
  }

  protected BaseTask(final String name, final List<String> args, final Integer maxExecutionCount) {
    this.name = new String(name);
    this.args = new ArrayList<>(args);
    this.maxExecutionCount = maxExecutionCount;
  }

  protected boolean checkConstraints() {
    final AtomicBoolean retval = new AtomicBoolean(true);
    final Supplier<Boolean> shouldContinue = () -> Boolean.valueOf(retval.get() && active.get());

    if (!shouldContinue.get()) {
      return false;
    }

    constraintList.forEach((constraint) -> {
      // Get the job referenced by this constraint
      final Job job = getJob().scheduler().findJob(constraint.getName()).get();

      // How long should we wait for the constraint to be cleared?
      long waitUntil = System.currentTimeMillis();
      if (constraint.hasWaitFor()) {
        waitUntil += Protobuf.getDuration(constraint.getWaitFor()).toMillis();
      }

      if (logger.isDebugEnabled()) {
        logger.debug(
            "checkConstraints({}): constraint name '{}', executionsCount {}, limit {}, wait_for {}ms",
            getName(), job.name(), job.executionsCount(), constraint.getLimit(),
            (waitUntil - System.currentTimeMillis()));
      }

      // Test to see if the constraint is blocking our execution
      while (shouldContinue.get() && job.executionsCount() < constraint.getLimit()) {
        if (System.currentTimeMillis() > waitUntil) {
          if (logger.isDebugEnabled()) {
            logger.debug("checkConstraints({}) failed: job {}, executionsCount {}, limit {}",
                getName(), job.name(), job.executionsCount(), constraint.getLimit());
          }
          retval.set(false);
          return;
        }

        try {
          Thread.sleep(SLEEP_MILLIS);
        } catch (final InterruptedException e) {
        }

        if (logger.isDebugEnabled()) {
          logger.debug(
              "checkConstraints({}): constraint name '{}', executionsCount {}, limit {}, wait_for {}ms",
              getName(), job.name(), job.executionsCount(), constraint.getLimit(),
              (waitUntil - System.currentTimeMillis()));
        }
      }
    });

    return shouldContinue.get();
  }
}
