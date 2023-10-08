package garden_leave.webapp.sweeper;

import static spark.Spark.*; //  http://sparkjava.com/documentation

import garden_leave.webapp.SparkEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SweeperEndpoint extends SparkEndpoint {
  private static final Logger logger = LoggerFactory.getLogger(SweeperEndpoint.class);

  public SweeperEndpoint(final Integer port, final String staticFilePath) throws Exception {
    super(port, staticFilePath);
  }

  @Override
  public void setEndpoints() throws Exception {
    get("/sweep", (request, response) -> {
      logger.info("SweeperEndpoint::sweep ...");
      return "";
    }, transformer);
  }
}
