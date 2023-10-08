package garden_leave.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelemetryTest {
  @Test
  public void getSpanNameTest() {
    String str1 = Telemetry.getSpanName();
    String str2 = Telemetry.getSpanName();

    assertNotSame(str1, str2);
    assertTrue(str1.contains("getSpanNameTest"));
    assertTrue(str2.contains("getSpanNameTest"));
  }

  @Test
  public void getEmptySpanNameTest() {
    String str1 = Telemetry.getSpanName(1024);
    assertTrue(str1.contains("EmptyStackFrame"));
  }

  @Test
  public void isDisabledTest() {
    System.setProperty("DISABLE_TELEMETRY", "true");
    Telemetry telemetry = Telemetry.getInstance();
    assertTrue(telemetry.isDisabled());
  }
}
