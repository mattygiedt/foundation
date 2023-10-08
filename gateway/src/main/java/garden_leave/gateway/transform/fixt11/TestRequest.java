package garden_leave.gateway.transform.fixt11;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.420584800
//

public final class TestRequest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(TestRequest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(TestRequest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public TestRequest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIXT.1.1";
  public static final String MSGTYPE = "1";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.StringField testReqIdField = FieldFactory.newStringField(112);
  public boolean hasTestReqId() throws quickfix.FieldNotFound {
    return isSetField(112);
  }
  public String getTestReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(testReqIdField));
  }
  public TestRequest setTestReqId(final String value) {
    setField(FieldValue.to(testReqIdField, value));
    return this;
  }
  public TestRequest setTestReqId(final quickfix.field.TestReqID value) {
    setField(FieldValue.to(testReqIdField, FieldValue.of(value)));
    return this;
  }

  public TestRequest() {
    super(new int[] {112, 0});
  }

  public TestRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {112, 0});
    this.span = span;
  }

  @Override
  protected quickfix.Message.Header newHeader() {
    return new garden_leave.gateway.transform.fixt11.Header(this, BEGINSTR, MSGTYPE);
  }

  @Override
  public void addGroup(final quickfix.Group group) {
    addGroupRef(group);
  }

  public static Function<garden_leave.gateway.transform.fixt11.TestRequest,
      garden_leave.fixt11.proto.FIXT11Protos.TestRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fixt11.proto.FIXT11Protos.TestRequest.getDefaultInstance();
    }

    final garden_leave.fixt11.proto.FIXT11Protos.TestRequest.Builder builder =
        garden_leave.fixt11.proto.FIXT11Protos.TestRequest.newBuilder();
    final garden_leave.fixt11.proto.FIXT11Protos.TestRequest.FieldPresence.Builder presenceBuilder =
        garden_leave.fixt11.proto.FIXT11Protos.TestRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fixt11.Header header =
        (garden_leave.gateway.transform.fixt11.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasTestReqId()) {
        builder.setTestReqId(fix.getTestReqId());
        presenceBuilder.setTestReqId(true);
      }
    } catch (final Throwable t) {
      logger.error("testRequest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fixt11.proto.FIXT11Protos.TestRequest,
      garden_leave.gateway.transform.fixt11.TestRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fixt11.TestRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fixt11.TestRequest fix =
          new garden_leave.gateway.transform.fixt11.TestRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fixt11.Header header =
          (garden_leave.gateway.transform.fixt11.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fixt11.proto.FIXT11Protos.TestRequest.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getTestReqId()) {
        fix.setTestReqId(proto.getTestReqId());
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
