package garden_leave.gateway.transform.fixt11;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.420980900
//

public abstract class MessageEventConsumer implements java.util.function.Consumer<MessageEvent> {
  @Override
  public void accept(final MessageEvent event) {
    final io.opentelemetry.api.trace.Span span = event.getSpan();
    try (final io.opentelemetry.context.Scope scope = span.makeCurrent()) {
      switch (event.getEventType()) {
        case LOGON:
          span.addEvent("Logon.handleEvent:" + event.getSequence());
          handleLogon(event);
          break;
        case REJECT:
          span.addEvent("Reject.handleEvent:" + event.getSequence());
          handleReject(event);
          break;
        case SEQUENCERESET:
          span.addEvent("SequenceReset.handleEvent:" + event.getSequence());
          handleSequenceReset(event);
          break;
        case HEARTBEAT:
          span.addEvent("Heartbeat.handleEvent:" + event.getSequence());
          handleHeartbeat(event);
          break;
        case LOGOUT:
          span.addEvent("Logout.handleEvent:" + event.getSequence());
          handleLogout(event);
          break;
        case RESENDREQUEST:
          span.addEvent("ResendRequest.handleEvent:" + event.getSequence());
          handleResendRequest(event);
          break;
        case TESTREQUEST:
          span.addEvent("TestRequest.handleEvent:" + event.getSequence());
          handleTestRequest(event);
          break;
        default:
          throw new UnsupportedOperationException("Unhandled event type: " + event.getEventType());
      }
    } catch (final Throwable t) {
      throw new RuntimeException(t);
    } finally {
      span.end();
    }
  }

  public abstract void handleLogon(final MessageEvent event) throws Exception;
  public abstract void handleReject(final MessageEvent event) throws Exception;
  public abstract void handleSequenceReset(final MessageEvent event) throws Exception;
  public abstract void handleHeartbeat(final MessageEvent event) throws Exception;
  public abstract void handleLogout(final MessageEvent event) throws Exception;
  public abstract void handleResendRequest(final MessageEvent event) throws Exception;
  public abstract void handleTestRequest(final MessageEvent event) throws Exception;

  /**
  -- Copy into your event handler class...
  @Override
  public void handleLogon(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.Logon logon = event.getLogon();
    logger.info("handleLogon: seq {}, msg {}", event.getSequence(), logon.toString());
  }

  @Override
  public void handleReject(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.Reject reject = event.getReject();
    logger.info("handleReject: seq {}, msg {}", event.getSequence(), reject.toString());
  }

  @Override
  public void handleSequenceReset(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.SequenceReset sequenceReset =
  event.getSequenceReset(); logger.info("handleSequenceReset: seq {}, msg {}", event.getSequence(),
  sequenceReset.toString());
  }

  @Override
  public void handleHeartbeat(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.Heartbeat heartbeat = event.getHeartbeat();
    logger.info("handleHeartbeat: seq {}, msg {}", event.getSequence(), heartbeat.toString());
  }

  @Override
  public void handleLogout(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.Logout logout = event.getLogout();
    logger.info("handleLogout: seq {}, msg {}", event.getSequence(), logout.toString());
  }

  @Override
  public void handleResendRequest(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.ResendRequest resendRequest =
  event.getResendRequest(); logger.info("handleResendRequest: seq {}, msg {}", event.getSequence(),
  resendRequest.toString());
  }

  @Override
  public void handleTestRequest(final MessageEvent event) throws Exception {
    final garden_leave.fixt11.proto.FIXT11Protos.TestRequest testRequest = event.getTestRequest();
    logger.info("handleTestRequest: seq {}, msg {}", event.getSequence(), testRequest.toString());
  }

  *
*/
}
