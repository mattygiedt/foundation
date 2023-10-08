package garden_leave.gateway.transform.fixt11;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.420889500
//

public final class MessageEvent {
  private MessageEvent() {}

  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public MessageEvent setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public final static com.lmax.disruptor.EventFactory<MessageEvent> EVENT_FACTORY =
      () -> new MessageEvent();

  private long sequence = 0L;
  public MessageEvent setSequence(final long sequence) {
    this.sequence = sequence;
    return this;
  }
  public long getSequence() {
    return this.sequence;
  }

  // Logon
  private garden_leave.fixt11.proto.FIXT11Protos.Logon logon = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.Logon.Builder logonBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.Logon.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.Logon getLogon() {
    return logon;
  }
  public MessageEvent setLogon(final garden_leave.fixt11.proto.FIXT11Protos.Logon other) {
    setMessageEventType(MessageEventType.LOGON);
    logon = logonBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Reject
  private garden_leave.fixt11.proto.FIXT11Protos.Reject reject = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.Reject.Builder rejectBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.Reject.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.Reject getReject() {
    return reject;
  }
  public MessageEvent setReject(final garden_leave.fixt11.proto.FIXT11Protos.Reject other) {
    setMessageEventType(MessageEventType.REJECT);
    reject = rejectBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // SequenceReset
  private garden_leave.fixt11.proto.FIXT11Protos.SequenceReset sequenceReset = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.SequenceReset.Builder sequenceResetBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.SequenceReset.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.SequenceReset getSequenceReset() {
    return sequenceReset;
  }
  public MessageEvent setSequenceReset(
      final garden_leave.fixt11.proto.FIXT11Protos.SequenceReset other) {
    setMessageEventType(MessageEventType.SEQUENCERESET);
    sequenceReset = sequenceResetBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Heartbeat
  private garden_leave.fixt11.proto.FIXT11Protos.Heartbeat heartbeat = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.Heartbeat.Builder heartbeatBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.Heartbeat.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.Heartbeat getHeartbeat() {
    return heartbeat;
  }
  public MessageEvent setHeartbeat(final garden_leave.fixt11.proto.FIXT11Protos.Heartbeat other) {
    setMessageEventType(MessageEventType.HEARTBEAT);
    heartbeat = heartbeatBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // Logout
  private garden_leave.fixt11.proto.FIXT11Protos.Logout logout = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.Logout.Builder logoutBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.Logout.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.Logout getLogout() {
    return logout;
  }
  public MessageEvent setLogout(final garden_leave.fixt11.proto.FIXT11Protos.Logout other) {
    setMessageEventType(MessageEventType.LOGOUT);
    logout = logoutBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // ResendRequest
  private garden_leave.fixt11.proto.FIXT11Protos.ResendRequest resendRequest = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.ResendRequest.Builder resendRequestBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.ResendRequest.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.ResendRequest getResendRequest() {
    return resendRequest;
  }
  public MessageEvent setResendRequest(
      final garden_leave.fixt11.proto.FIXT11Protos.ResendRequest other) {
    setMessageEventType(MessageEventType.RESENDREQUEST);
    resendRequest = resendRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  // TestRequest
  private garden_leave.fixt11.proto.FIXT11Protos.TestRequest testRequest = null;
  private final garden_leave.fixt11.proto.FIXT11Protos.TestRequest.Builder testRequestBuilder =
      garden_leave.fixt11.proto.FIXT11Protos.TestRequest.newBuilder();
  public garden_leave.fixt11.proto.FIXT11Protos.TestRequest getTestRequest() {
    return testRequest;
  }
  public MessageEvent setTestRequest(
      final garden_leave.fixt11.proto.FIXT11Protos.TestRequest other) {
    setMessageEventType(MessageEventType.TESTREQUEST);
    testRequest = testRequestBuilder.clear().mergeFrom(other).build();
    return this;
  }

  public enum MessageEventType {
    UNKNOWN,
    TESTREQUEST,
    REJECT,
    HEARTBEAT,
    LOGOUT,
    RESENDREQUEST,
    LOGON,
    SEQUENCERESET;
  }

  private MessageEventType eventType = MessageEventType.UNKNOWN;
  public MessageEventType getEventType() {
    return eventType;
  }
  private MessageEvent setMessageEventType(final MessageEventType eventType) {
    this.eventType = eventType;
    return this;
  }
}
