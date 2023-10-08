package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.501613600
//

public final class ResendRequest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(ResendRequest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(ResendRequest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public ResendRequest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "2";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.IntField beginSeqNoField = FieldFactory.newIntField(7);
  public boolean hasBeginSeqNo() throws quickfix.FieldNotFound {
    return isSetField(7);
  }
  public int getBeginSeqNo() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(beginSeqNoField));
  }
  public ResendRequest setBeginSeqNo(final int value) {
    setField(FieldValue.to(beginSeqNoField, value));
    return this;
  }
  public ResendRequest setBeginSeqNo(final quickfix.field.BeginSeqNo value) {
    setField(FieldValue.to(beginSeqNoField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField endSeqNoField = FieldFactory.newIntField(16);
  public boolean hasEndSeqNo() throws quickfix.FieldNotFound {
    return isSetField(16);
  }
  public int getEndSeqNo() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(endSeqNoField));
  }
  public ResendRequest setEndSeqNo(final int value) {
    setField(FieldValue.to(endSeqNoField, value));
    return this;
  }
  public ResendRequest setEndSeqNo(final quickfix.field.EndSeqNo value) {
    setField(FieldValue.to(endSeqNoField, FieldValue.of(value)));
    return this;
  }

  public ResendRequest() {
    super(new int[] {7, 16, 0});
  }

  public ResendRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {7, 16, 0});
    this.span = span;
  }

  @Override
  protected quickfix.Message.Header newHeader() {
    return new garden_leave.gateway.transform.fix42.Header(this, BEGINSTR, MSGTYPE);
  }

  @Override
  public void addGroup(final quickfix.Group group) {
    addGroupRef(group);
  }

  public static Function<garden_leave.gateway.transform.fix42.ResendRequest,
      garden_leave.fix42.proto.FIX42Protos.ResendRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.ResendRequest.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.ResendRequest.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.ResendRequest.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.ResendRequest.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.ResendRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasBeginSeqNo()) {
        builder.setBeginSeqNo(fix.getBeginSeqNo());
        presenceBuilder.setBeginSeqNo(true);
      }
      if (fix.hasEndSeqNo()) {
        builder.setEndSeqNo(fix.getEndSeqNo());
        presenceBuilder.setEndSeqNo(true);
      }
    } catch (final Throwable t) {
      logger.error("resendRequest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.ResendRequest,
      garden_leave.gateway.transform.fix42.ResendRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.ResendRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.ResendRequest fix =
          new garden_leave.gateway.transform.fix42.ResendRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.ResendRequest.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getBeginSeqNo()) {
        fix.setBeginSeqNo(proto.getBeginSeqNo());
      }
      if (fieldPresence.getEndSeqNo()) {
        fix.setEndSeqNo(proto.getEndSeqNo());
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
