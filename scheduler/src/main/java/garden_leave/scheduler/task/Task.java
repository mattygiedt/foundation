package garden_leave.scheduler.task;

import garden_leave.config.proto.TaskConstraint;
import garden_leave.scheduler.wisp.Job;
import garden_leave.scheduler.wisp.Scheduler;
import garden_leave.scheduler.wisp.schedule.Schedule;
import java.util.List;

public interface Task extends Runnable {
  Job getJob();
  String getName();
  int getMaxExecutionCount();
  List<String> getArgs();
  Schedule getSchedule();
  void cancel();
  void setSchedule(Schedule schedule);
  void addConstraint(TaskConstraint constraint);
  void register(Scheduler scheduler) throws Exception;
  void register(Scheduler scheduler, Schedule schedule) throws Exception;
}
