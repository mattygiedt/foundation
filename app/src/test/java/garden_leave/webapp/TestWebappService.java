package garden_leave.webapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWebappService {
  @Test
  public void sweeperEndpointTest() throws Exception {
    final Class<?> clazz = Class.forName("garden_leave.webapp.sweeper.SweeperEndpoint");
    SparkEndpoint endpoint = (SparkEndpoint) clazz.getConstructor(Integer.class, String.class)
                                 .newInstance(9099, "/dummy/path");

    assertEquals(endpoint.getPort(), 9099);
    assertEquals(endpoint.getStaticFilePath(), "/dummy/path");
  }

  @Test
  public void tapeEndpointTest() throws Exception {
    final Class<?> clazz = Class.forName("garden_leave.webapp.tape.TapeEndpoint");
    SparkEndpoint endpoint = (SparkEndpoint) clazz.getConstructor(Integer.class, String.class)
                                 .newInstance(9099, "/dummy/path");

    assertEquals(endpoint.getPort(), 9099);
    assertEquals(endpoint.getStaticFilePath(), "/dummy/path");
  }
}
