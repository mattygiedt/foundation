package garden_leave.webapp;

import garden_leave.utils.Telemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.StampedLock;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebSocket
public class WebSocketHandler {
  private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class);
  private static final Tracer tracer = Telemetry.getInstance().getTracer(WebSocketHandler.class);

  public interface WebSocketHandlerCallback {
    void onOpenConnection(final Session session);
    void onCloseConnection(final Session session);
    void onMessage(final Session session, final String message);
  }

  private final List<WebSocketHandlerCallback> callbackList;
  private final Queue<Session> sessions;
  private final StampedLock lock;

  public WebSocketHandler() {
    callbackList = new ArrayList<>();
    sessions = new ConcurrentLinkedQueue<>();
    lock = new StampedLock();
  }

  private void sendString(final String msg, final Session session) {
    try {
      session.getRemote().sendString(msg);
    } catch (IOException ioe) {
      logger.error("send error:", ioe);
    }
  }

  @OnWebSocketConnect
  public void connected(final Session session) {
    logger.info("websocket session connect: {}", session);
    final Span span = Telemetry.startSpan(tracer);
    final long stamp = lock.writeLock();

    try (Scope ignored = span.makeCurrent()) {
      sessions.add(session);
      callbackList.forEach(c -> c.onOpenConnection(session));
    } finally {
      lock.unlockWrite(stamp);
      span.end();
    }
  }

  @OnWebSocketClose
  public void closed(final Session session, final int statusCode, final String reason) {
    logger.info("websocket session disconnect: {} {} {}", session, statusCode, reason);

    final Span span = Telemetry.startSpan(tracer);
    final long stamp = lock.writeLock();

    try (Scope ignored = span.makeCurrent()) {
      sessions.remove(session);
      callbackList.forEach(c -> c.onCloseConnection(session));
    } finally {
      lock.unlockWrite(stamp);
      span.end();
    }
  }

  //
  //  TODO: This needs to be flushed out.
  //

  @OnWebSocketMessage
  public void message(final Session session, final String message) throws IOException {
    logger.info("OnWebSocketMessage: {}", message); // Print message
    sendString(message, session); // and send it back
  }

  @OnWebSocketError
  public void onError(final Session session, final Throwable error) {
    logger.error("OnWebSocketError:Throwable:", error);
  }

  public void registerCallback(final WebSocketHandlerCallback callback) {
    final long stamp = lock.writeLock();
    try {
      callbackList.add(callback);
    } finally {
      lock.unlockWrite(stamp);
    }
  }

  public void deregisterCallback(final WebSocketHandlerCallback callback) {
    final long stamp = lock.writeLock();
    try {
      callbackList.remove(callback);
    } finally {
      lock.unlockWrite(stamp);
    }
  }
}
