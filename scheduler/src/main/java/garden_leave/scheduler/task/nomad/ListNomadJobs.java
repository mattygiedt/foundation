package garden_leave.scheduler.task.nomad;

import java.util.List;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListNomadJobs extends NomadJob {
  private static final Logger logger = LoggerFactory.getLogger(NomadJob.class);

  public ListNomadJobs(
      final String name, final List<String> args, final Integer maxExecutionCount) {
    super(name, args, maxExecutionCount);
  }

  public void execute() {
    final String nomadEndpoint = nomadEndpoint();
    final String url = nomadEndpoint + "/v1/jobs";

    logger.info("NOMAD_ENDPOINT: {}", nomadEndpoint);
    logger.info("GET: {}", url);

    try {
      final Response response = getRequest(url);
      logger.info("RESPONSE: {}", response.body().string());
    } catch (final Throwable t) {
      logger.error("ListNomadJobs error:", t);
    }
  }
}
