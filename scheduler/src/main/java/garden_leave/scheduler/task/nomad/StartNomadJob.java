package garden_leave.scheduler.task.nomad;

import java.util.List;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartNomadJob extends NomadJob {
  private static final Logger logger = LoggerFactory.getLogger(StartNomadJob.class);
  public StartNomadJob(
      final String name, final List<String> args, final Integer maxExecutionCount) {
    super(name, args, maxExecutionCount);
  }

  public void execute() {
    try {
      // Get the HCL file from the argument list
      String hcl = null;

      for (final String row : args) {
        if (row.startsWith("hcl_file=")) {
          final String filename = row.split("=")[1];
          logger.info("Reading HCL file: {}", filename);
          hcl = fileAsString(filename);
        } else if (row.startsWith("hcl_resource=")) {
          final String filename = row.split("=")[1];
          logger.info("Reading HCL resource file: {}", filename);
          hcl = resourceAsString(filename);
        }
      }

      if (hcl == null) {
        throw new RuntimeException(
            "invalid job config: args has no row with [hcl_file|hcl_resource]");
      }

      logger.info("HCL: {}", hcl);
      final Response parseResponse = parseNomadJob(parseUrl(), new ParseNomadJobRequest(hcl));
      final String jobSpec = parseResponse.body().string();
      logger.info("PARSE RESPONSE: {}", jobSpec);

      final Response createResponse =
          createNomadJob(jobsUrl(), new CreateNomadJobRequest(toJsonObject(jobSpec)));
      final String createJob = createResponse.body().string();
      logger.info("CREATE RESPONSE: {}", createJob);
    } catch (final Throwable t) {
      logger.error("StartNomadJob error:", t);
    }
  }
}
