package garden_leave.scheduler.task.nomad;

import java.util.List;

public class StopNomadJob extends NomadJob {
  public StopNomadJob(final String name, final List<String> args, final Integer maxExecutionCount) {
    super(name, args, maxExecutionCount);
  }

  public void execute() {}
}
