package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.854532700
//

public final class Logout extends quickfix.Message {
  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Logout.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(Logout.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public Logout setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.4";
  public static final String MSGTYPE = "5";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public Logout setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public Logout setText(final quickfix.field.Text value) {
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
  public Logout setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public Logout setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public Logout setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public Logout setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public Logout() {
    super(new int[] {58, 354, 355, 0});
  }

  public Logout(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {58, 354, 355, 0});
    this.span = span;
  }

  @Override
  protected quickfix.Message.Header newHeader() {
    return new garden_leave.gateway.transform.fix44.Header(this, BEGINSTR, MSGTYPE);
  }

  @Override
  public void addGroup(final quickfix.Group group) {
    addGroupRef(group);
  }

  public static Function<garden_leave.gateway.transform.fix44.Logout,
      garden_leave.fix44.proto.FIX44Protos.Logout> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix44.proto.FIX44Protos.Logout.getDefaultInstance();
    }

    final garden_leave.fix44.proto.FIX44Protos.Logout.Builder builder =
        garden_leave.fix44.proto.FIX44Protos.Logout.newBuilder();
    final garden_leave.fix44.proto.FIX44Protos.Logout.FieldPresence.Builder presenceBuilder =
        garden_leave.fix44.proto.FIX44Protos.Logout.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix44.Header header =
        (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

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
      logger.error("logout error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix44.proto.FIX44Protos.Logout,
      garden_leave.gateway.transform.fix44.Logout> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix44.Logout.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix44.Logout fix =
          new garden_leave.gateway.transform.fix44.Logout();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix44.Header header =
          (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix44.proto.FIX44Protos.Logout.FieldPresence fieldPresence =
          proto.getFieldPresence();

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
