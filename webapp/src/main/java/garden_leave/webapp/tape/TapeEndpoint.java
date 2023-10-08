package garden_leave.webapp.tape;

import static spark.Spark.*; //  http://sparkjava.com/documentation

import garden_leave.utils.Telemetry;
import garden_leave.webapp.SparkEndpoint;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TapeEndpoint extends SparkEndpoint {
  private static final Logger logger = LoggerFactory.getLogger(TapeEndpoint.class);
  private static final Tracer tracer = Telemetry.getInstance().getTracer(TapeEndpoint.class);

  public TapeEndpoint(final Integer port, final String staticFilePath) throws Exception {
    super(port, staticFilePath);
  }

  @Override
  public void setEndpoints() throws Exception {
    get("/position", (request, response) -> {
      final Span span = Telemetry.startSpan(tracer, "getPosition");

      try (Scope ignored = span.makeCurrent()) {
        logger.info("TapeEndpoint::position ...");
        return "";
      } finally {
        span.end();
      }
    }, transformer);
  }
}
