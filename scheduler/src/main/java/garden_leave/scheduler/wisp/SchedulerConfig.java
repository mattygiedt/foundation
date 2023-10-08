package garden_leave.scheduler.wisp;

import garden_leave.scheduler.wisp.time.SystemTimeProvider;
import garden_leave.scheduler.wisp.time.TimeProvider;
import java.time.Duration;
import lombok.Builder;
import lombok.Getter;

/**
 * The configuration used by the scheduler
 */
@Getter
@Builder
public class SchedulerConfig {
  public static final TimeProvider DEFAULT_TIME_PROVIDER = new SystemTimeProvider();
  private static final Duration NON_EXPIRABLE_THREADS = Duration.ofMillis(Long.MAX_VALUE);

  /**
   * The minimum number of threads that will live in the jobs threads pool.
   */
  @Builder.Default private final int minThreads = 0;
  /**
   * The maximum number of threads that will live in the jobs threads pool.
   */
  @Builder.Default private final int maxThreads = 50;
  /**
   * The time after which idle threads will be removed from the threads pool.
   * By default the thread pool does not scale down (duration = infinity ~ {@link Long#MAX_VALUE}ms)
   */
  @Builder.Default private final Duration threadsKeepAliveTime = NON_EXPIRABLE_THREADS;
  /**
   * The time provider that will be used by the scheduler
   */
  @Builder.Default private final TimeProvider timeProvider = DEFAULT_TIME_PROVIDER;
}
