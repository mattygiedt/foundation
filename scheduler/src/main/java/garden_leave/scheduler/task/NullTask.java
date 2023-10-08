package garden_leave.scheduler.task;

import java.util.List;

/**
 * A Task that does nothing.
 */
public class NullTask extends BaseTask {
  public NullTask(final String name, final List<String> args, final Integer maxExecutionCount) {
    super(name, args, maxExecutionCount);
  }

  @Override
  public void execute() {}
}
