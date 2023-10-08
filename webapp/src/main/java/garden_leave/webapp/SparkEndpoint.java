package garden_leave.webapp;

import static spark.Spark.*; //  http://sparkjava.com/documentation

public abstract class SparkEndpoint {
  protected final int port;
  protected final String staticFilePath;
  protected final WebSocketHandler webSocket;
  protected final JsonTransformer transformer;

  public SparkEndpoint(final Integer port, final String staticFilePath) throws Exception {
    this.port = port;
    this.staticFilePath = staticFilePath;
    this.webSocket = new WebSocketHandler();
    this.transformer = new JsonTransformer();
  }

  public int getPort() {
    return port;
  }

  public String getStaticFilePath() {
    return staticFilePath;
  }

  public void configure() throws Exception {
    //
    //  Set the Spark port
    //

    port(port);

    //
    //  root is 'src/main/resources', so put files in 'src/main/resources/public/...'
    //  and configure staticFilePath = "/public/..."
    //

    staticFiles.location(staticFilePath);

    //
    //  http://sparkjava.com/documentation#embedded-web-server
    //  https://github.com/perwendel/spark/blob/master/src/main/java/spark/Spark.java
    //

    webSocket("/websocket", webSocket);

    //
    //  Start the spark Jetty webserver
    //

    init();
  }

  //
  //  https://sparkjava.com/documentation#routes
  //
  public abstract void setEndpoints() throws Exception;

  public void shutdown() throws Exception {
    //
    //  https://sparkjava.com/documentation#stopping-the-server
    //

    stop();
  }
}
