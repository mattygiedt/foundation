package garden_leave.internalizer.data;

import java.util.concurrent.atomic.AtomicInteger;

public class ExecutionId {
  private static final AtomicInteger seqNum = new AtomicInteger(1);

  public static ExecutionId newExecutionId() {
    return new ExecutionId(String.format("%012d", seqNum.getAndAdd(1)));
  }

  public static ExecutionId from(final String id) {
    return new ExecutionId(id);
  }

  public static void reset() {
    seqNum.set(1);
  }

  private final String executionId;
  private ExecutionId(final String executionId) {
    this.executionId = executionId;
  }

  public String getExecutionId() {
    return executionId;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ExecutionId that = (ExecutionId) o;
    return executionId.equals(that.getExecutionId());
  }

  @Override
  public int hashCode() {
    return executionId.hashCode();
  }

  @Override
  public String toString() {
    return executionId;
  }
}
