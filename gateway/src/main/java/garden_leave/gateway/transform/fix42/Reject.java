package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.465229700
//

public final class Reject extends quickfix.Message {
  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Reject.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(Reject.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public Reject setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "3";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.IntField refSeqNumField = FieldFactory.newIntField(45);
  public boolean hasRefSeqNum() throws quickfix.FieldNotFound {
    return isSetField(45);
  }
  public int getRefSeqNum() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(refSeqNumField));
  }
  public Reject setRefSeqNum(final int value) {
    setField(FieldValue.to(refSeqNumField, value));
    return this;
  }
  public Reject setRefSeqNum(final quickfix.field.RefSeqNum value) {
    setField(FieldValue.to(refSeqNumField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField refTagIdField = FieldFactory.newIntField(371);
  public boolean hasRefTagId() throws quickfix.FieldNotFound {
    return isSetField(371);
  }
  public int getRefTagId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(refTagIdField));
  }
  public Reject setRefTagId(final int value) {
    setField(FieldValue.to(refTagIdField, value));
    return this;
  }
  public Reject setRefTagId(final quickfix.field.RefTagID value) {
    setField(FieldValue.to(refTagIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField refMsgTypeField = FieldFactory.newStringField(372);
  public boolean hasRefMsgType() throws quickfix.FieldNotFound {
    return isSetField(372);
  }
  public String getRefMsgType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(refMsgTypeField));
  }
  public Reject setRefMsgType(final String value) {
    setField(FieldValue.to(refMsgTypeField, value));
    return this;
  }
  public Reject setRefMsgType(final quickfix.field.RefMsgType value) {
    setField(FieldValue.to(refMsgTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField sessionRejectReasonField = FieldFactory.newIntField(373);
  public boolean hasSessionRejectReason() throws quickfix.FieldNotFound {
    return isSetField(373);
  }
  public int getSessionRejectReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sessionRejectReasonField));
  }
  public Reject setSessionRejectReason(final int value) {
    setField(FieldValue.to(sessionRejectReasonField, value));
    return this;
  }
  public Reject setSessionRejectReason(final quickfix.field.SessionRejectReason value) {
    setField(FieldValue.to(sessionRejectReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public Reject setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public Reject setText(final quickfix.field.Text value) {
    setField(FieldValue.to(textField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encodedTextLenField = FieldFactory.newIntField(354);
  public boolean hasEncodedTextLen() throws quickfix.FieldNotFound {
    return isSetField(354);
  }
  public int getEncodedTextLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedTextLenField));
  }
  public Reject setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public Reject setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
    setField(FieldValue.to(encodedTextLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField encodedTextField = FieldFactory.newStringField(355);
  public boolean hasEncodedText() throws quickfix.FieldNotFound {
    return isSetField(355);
  }
  public String getEncodedText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedTextField));
  }
  public Reject setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public Reject setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public Reject() {
    super(new int[] {45, 371, 372, 373, 58, 354, 355, 0});
  }

  public Reject(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {45, 371, 372, 373, 58, 354, 355, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.Reject,
      garden_leave.fix42.proto.FIX42Protos.Reject> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.Reject.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.Reject.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.Reject.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.Reject.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.Reject.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasRefSeqNum()) {
        builder.setRefSeqNum(fix.getRefSeqNum());
        presenceBuilder.setRefSeqNum(true);
      }
      if (fix.hasRefTagId()) {
        builder.setRefTagId(fix.getRefTagId());
        presenceBuilder.setRefTagId(true);
      }
      if (fix.hasRefMsgType()) {
        builder.setRefMsgType(fix.getRefMsgType());
        presenceBuilder.setRefMsgType(true);
      }
      if (fix.hasSessionRejectReason()) {
        builder.setSessionRejectReason(fix.getSessionRejectReason());
        presenceBuilder.setSessionRejectReason(true);
      }
      if (fix.hasText()) {
        builder.setText(fix.getText());
        presenceBuilder.setText(true);
      }
      if (fix.hasEncodedTextLen()) {
        builder.setEncodedTextLen(fix.getEncodedTextLen());
        presenceBuilder.setEncodedTextLen(true);
      }
      if (fix.hasEncodedText()) {
        builder.setEncodedText(fix.getEncodedText());
        presenceBuilder.setEncodedText(true);
      }
    } catch (final Throwable t) {
      logger.error("reject error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.Reject,
      garden_leave.gateway.transform.fix42.Reject> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.Reject.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.Reject fix =
          new garden_leave.gateway.transform.fix42.Reject();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.Reject.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getRefSeqNum()) {
        fix.setRefSeqNum(proto.getRefSeqNum());
      }
      if (fieldPresence.getRefTagId()) {
        fix.setRefTagId(proto.getRefTagId());
      }
      if (fieldPresence.getRefMsgType()) {
        fix.setRefMsgType(proto.getRefMsgType());
      }
      if (fieldPresence.getSessionRejectReason()) {
        fix.setSessionRejectReason(proto.getSessionRejectReason());
      }
      if (fieldPresence.getText()) {
        fix.setText(proto.getText());
      }
      if (fieldPresence.getEncodedTextLen()) {
        fix.setEncodedTextLen(proto.getEncodedTextLen());
      }
      if (fieldPresence.getEncodedText()) {
        fix.setEncodedText(proto.getEncodedText());
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
