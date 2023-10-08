package garden_leave.scheduler.wisp;

import static garden_leave.scheduler.wisp.Utils.waitOn;
import static org.junit.Assert.*;

import garden_leave.scheduler.wisp.Utils.SingleJob;
import garden_leave.scheduler.wisp.schedule.Schedules;
import java.time.Duration;
import org.junit.Test;

public class SchedulerTest {
  @Test
  public void check_that_two_job_cannot_be_scheduled_with_the_same_name() {
    Scheduler scheduler = new Scheduler();

    scheduler.schedule(
        "job", Utils.doNothing(), Schedules.fixedDelaySchedule(Duration.ofMillis(1)));
    try {
      scheduler.schedule(
          "job", Utils.doNothing(), Schedules.fixedDelaySchedule(Duration.ofMillis(1)));
      fail();
    } catch (IllegalArgumentException e) {
      // as expected
    }

    scheduler.gracefullyShutdown();
  }

  @Test
  public void should_run_a_single_job() throws InterruptedException {
    Scheduler scheduler = new Scheduler();
    SingleJob singleJob = new SingleJob();
    scheduler.schedule("test", singleJob,
        Schedules.executeOnce(Schedules.fixedDelaySchedule(Duration.ofMillis(1))));

    waitOn(singleJob, () -> singleJob.countExecuted.get() > 0, 10000);

    scheduler.gracefullyShutdown();

    assertTrue(singleJob.countExecuted.get() == 1);
  }

  @Test
  public void should_run_each_job_once() throws InterruptedException {
    Scheduler scheduler = new Scheduler(1);
    SingleJob job1 = new SingleJob();
    SingleJob job2 = new SingleJob();
    SingleJob job3 = new SingleJob();
    scheduler.schedule(
        "job1", job1, Schedules.executeOnce(Schedules.fixedDelaySchedule(Duration.ofMillis(1))));
    scheduler.schedule(
        "job2", job2, Schedules.executeOnce(Schedules.fixedDelaySchedule(Duration.ofMillis(1))));
    scheduler.schedule(
        "job3", job3, Schedules.executeOnce(Schedules.fixedDelaySchedule(Duration.ofMillis(1))));
    Thread thread1 = new Thread(() -> { waitOn(job1, () -> job1.countExecuted.get() > 0, 10000); });
    thread1.start();
    Thread thread2 = new Thread(() -> { waitOn(job2, () -> job2.countExecuted.get() > 0, 10000); });
    thread2.start();
    Thread thread3 = new Thread(() -> { waitOn(job3, () -> job3.countExecuted.get() > 0, 10000); });
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();

    scheduler.gracefullyShutdown();

    assertTrue(job1.countExecuted.get() == 1);
    assertTrue(job2.countExecuted.get() == 1);
    assertTrue(job3.countExecuted.get() == 1);
  }

  @Test
  public void check_that_a_scheduled_job_has_the_right_status() {
    Scheduler scheduler = new Scheduler();

    Job job =
        scheduler.schedule(Utils.doNothing(), Schedules.fixedDelaySchedule(Duration.ofSeconds(1)));

    assertTrue(job.status() == JobStatus.SCHEDULED);

    scheduler.gracefullyShutdown();
    assertTrue(job.status() == JobStatus.DONE);
  }

  @Test
  public void check_that_a_running_job_has_the_right_status() throws InterruptedException {
    Scheduler scheduler = new Scheduler();

    Job job = scheduler.schedule(
        Utils.TASK_THAT_SLEEPS_FOR_200MS, Schedules.fixedDelaySchedule(Duration.ofMillis(1)));
    Thread.sleep(40L);
    assertTrue(job.status() == JobStatus.RUNNING);
    scheduler.gracefullyShutdown();
    assertTrue(job.status() == JobStatus.DONE);
  }
}
