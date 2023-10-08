package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.455794500
//

public final class SequenceReset extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(SequenceReset.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(SequenceReset.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public SequenceReset setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "4";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.BooleanField gapFillFlagField = FieldFactory.newBooleanField(123);
  public boolean hasGapFillFlag() throws quickfix.FieldNotFound {
    return isSetField(123);
  }
  public boolean getGapFillFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(gapFillFlagField));
  }
  public SequenceReset setGapFillFlag(final boolean value) {
    setField(FieldValue.to(gapFillFlagField, value));
    return this;
  }
  public SequenceReset setGapFillFlag(final quickfix.field.GapFillFlag value) {
    setField(FieldValue.to(gapFillFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField newSeqNoField = FieldFactory.newIntField(36);
  public boolean hasNewSeqNo() throws quickfix.FieldNotFound {
    return isSetField(36);
  }
  public int getNewSeqNo() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(newSeqNoField));
  }
  public SequenceReset setNewSeqNo(final int value) {
    setField(FieldValue.to(newSeqNoField, value));
    return this;
  }
  public SequenceReset setNewSeqNo(final quickfix.field.NewSeqNo value) {
    setField(FieldValue.to(newSeqNoField, FieldValue.of(value)));
    return this;
  }

  public SequenceReset() {
    super(new int[] {123, 36, 0});
  }

  public SequenceReset(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {123, 36, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.SequenceReset,
      garden_leave.fix42.proto.FIX42Protos.SequenceReset> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.SequenceReset.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.SequenceReset.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.SequenceReset.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.SequenceReset.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.SequenceReset.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasGapFillFlag()) {
        builder.setGapFillFlag(fix.getGapFillFlag());
        presenceBuilder.setGapFillFlag(true);
      }
      if (fix.hasNewSeqNo()) {
        builder.setNewSeqNo(fix.getNewSeqNo());
        presenceBuilder.setNewSeqNo(true);
      }
    } catch (final Throwable t) {
      logger.error("sequenceReset error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.SequenceReset,
      garden_leave.gateway.transform.fix42.SequenceReset> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.SequenceReset.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.SequenceReset fix =
          new garden_leave.gateway.transform.fix42.SequenceReset();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.SequenceReset.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getGapFillFlag()) {
        fix.setGapFillFlag(proto.getGapFillFlag());
      }
      if (fieldPresence.getNewSeqNo()) {
        fix.setNewSeqNo(proto.getNewSeqNo());
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
