package garden_leave.scheduler.task.nomad;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import garden_leave.scheduler.task.BaseTask;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ServiceLoader;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class NomadJob extends BaseTask {
  private static final Logger logger = LoggerFactory.getLogger(NomadJob.class);
  private static final String JSON_MEDIA_TYPE = "application/json";
  private static final String CONTENT_TYPE = "content-type";

  private final Gson gson;
  private final OkHttpClient client = new OkHttpClient();
  private final MediaType jsonMediaType = MediaType.parse(JSON_MEDIA_TYPE);

  public NomadJob(final String name, final List<String> args, final Integer maxExecutionCount) {
    super(name, args, maxExecutionCount);

    final GsonBuilder gsonBuilder = new GsonBuilder();
    for (final TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
      logger.info("loading type adapter factory: {}", factory);
      gsonBuilder.registerTypeAdapterFactory(factory);
    }

    gson = gsonBuilder.serializeSpecialFloatingPointValues().create();
  }

  protected JsonObject toJsonObject(final String json) {
    return gson.fromJson(json, JsonObject.class);
  }

  protected Response getRequest(final String url) throws IOException {
    final Request request = new Request.Builder().url(url).build();
    final Response response = client.newCall(request).execute();

    return response;
  }

  protected Response parseNomadJob(final String url, final ParseNomadJobRequest parseRequest)
      throws IOException {
    final String json = gson.toJson(parseRequest);
    logger.info("parseNomadJob request: {}", json);

    final Response response = postJsonRequest(url, gson.toJson(parseRequest));

    return response;
  }

  protected Response createNomadJob(final String url, final CreateNomadJobRequest createRequest)
      throws IOException {
    final String json = gson.toJson(createRequest);
    logger.info("createNomadJob request: {}", json);

    final Response response = postJsonRequest(url, json);

    return response;
  }

  private Response postJsonRequest(final String url, final String json) throws IOException {
    final RequestBody body = RequestBody.create(json, jsonMediaType);

    final Request request =
        new Request.Builder().url(url).post(body).addHeader(CONTENT_TYPE, JSON_MEDIA_TYPE).build();
    final Response response = client.newCall(request).execute();

    return response;
  }

  protected String nomadEndpoint() {
    return System.getProperty("NOMAD_ENDPOINT");
  }

  protected String parseUrl() {
    return nomadEndpoint() + "/v1/jobs/parse";
  }

  protected String jobsUrl() {
    return nomadEndpoint() + "/v1/jobs";
  }

  protected String fileAsString(final String filename) throws IOException {
    return Files.readString(Path.of(filename));
  }

  protected String resourceAsString(final String resource) throws IOException {
    return new String(NomadJob.class.getClassLoader().getResourceAsStream(resource).readAllBytes(),
        java.nio.charset.Charset.defaultCharset());
  }

  @Override public abstract void execute();
}
