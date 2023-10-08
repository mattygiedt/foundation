package garden_leave.internalizer.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExecutionId {
  @Test
  public void testExecutionIdGen() {
    ExecutionId.reset();
    assertTrue("000000000001".equals(ExecutionId.newExecutionId().getExecutionId()));
    assertTrue("000000000002".equals(ExecutionId.newExecutionId().getExecutionId()));
  }

  @Test
  public void testEquals() {
    final ExecutionId a = ExecutionId.newExecutionId();
    final ExecutionId b = ExecutionId.from(a.getExecutionId());
    assertEquals(a, b);
  }

  @Test
  public void testNotEquals() {
    final ExecutionId a = ExecutionId.newExecutionId();
    final ExecutionId b = ExecutionId.newExecutionId();
    assertNotEquals(a, b);
  }
}
