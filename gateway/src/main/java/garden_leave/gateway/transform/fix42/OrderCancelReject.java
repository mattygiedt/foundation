package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.456425200
//

public final class OrderCancelReject extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(OrderCancelReject.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(OrderCancelReject.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public OrderCancelReject setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "9";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.StringField orderIdField = FieldFactory.newStringField(37);
  public boolean hasOrderId() throws quickfix.FieldNotFound {
    return isSetField(37);
  }
  public String getOrderId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderIdField));
  }
  public OrderCancelReject setOrderId(final String value) {
    setField(FieldValue.to(orderIdField, value));
    return this;
  }
  public OrderCancelReject setOrderId(final quickfix.field.OrderID value) {
    setField(FieldValue.to(orderIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField secondaryOrderIdField = FieldFactory.newStringField(198);
  public boolean hasSecondaryOrderId() throws quickfix.FieldNotFound {
    return isSetField(198);
  }
  public String getSecondaryOrderId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryOrderIdField));
  }
  public OrderCancelReject setSecondaryOrderId(final String value) {
    setField(FieldValue.to(secondaryOrderIdField, value));
    return this;
  }
  public OrderCancelReject setSecondaryOrderId(final quickfix.field.SecondaryOrderID value) {
    setField(FieldValue.to(secondaryOrderIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public OrderCancelReject setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public OrderCancelReject setClOrdId(final quickfix.field.ClOrdID value) {
    setField(FieldValue.to(clOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField origClOrdIdField = FieldFactory.newStringField(41);
  public boolean hasOrigClOrdId() throws quickfix.FieldNotFound {
    return isSetField(41);
  }
  public String getOrigClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origClOrdIdField));
  }
  public OrderCancelReject setOrigClOrdId(final String value) {
    setField(FieldValue.to(origClOrdIdField, value));
    return this;
  }
  public OrderCancelReject setOrigClOrdId(final quickfix.field.OrigClOrdID value) {
    setField(FieldValue.to(origClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordStatusField = FieldFactory.newCharField(39);
  public boolean hasOrdStatus() throws quickfix.FieldNotFound {
    return isSetField(39);
  }
  public int getOrdStatus() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordStatusField));
  }
  public OrderCancelReject setOrdStatus(final int value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public OrderCancelReject setOrdStatus(final char value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public OrderCancelReject setOrdStatus(final String value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public OrderCancelReject setOrdStatus(final quickfix.field.OrdStatus value) {
    setField(FieldValue.to(ordStatusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clientIdField = FieldFactory.newStringField(109);
  public boolean hasClientId() throws quickfix.FieldNotFound {
    return isSetField(109);
  }
  public String getClientId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clientIdField));
  }
  public OrderCancelReject setClientId(final String value) {
    setField(FieldValue.to(clientIdField, value));
    return this;
  }
  public OrderCancelReject setClientId(final quickfix.field.ClientID value) {
    setField(FieldValue.to(clientIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execBrokerField = FieldFactory.newStringField(76);
  public boolean hasExecBroker() throws quickfix.FieldNotFound {
    return isSetField(76);
  }
  public String getExecBroker() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execBrokerField));
  }
  public OrderCancelReject setExecBroker(final String value) {
    setField(FieldValue.to(execBrokerField, value));
    return this;
  }
  public OrderCancelReject setExecBroker(final quickfix.field.ExecBroker value) {
    setField(FieldValue.to(execBrokerField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField listIdField = FieldFactory.newStringField(66);
  public boolean hasListId() throws quickfix.FieldNotFound {
    return isSetField(66);
  }
  public String getListId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(listIdField));
  }
  public OrderCancelReject setListId(final String value) {
    setField(FieldValue.to(listIdField, value));
    return this;
  }
  public OrderCancelReject setListId(final quickfix.field.ListID value) {
    setField(FieldValue.to(listIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField accountField = FieldFactory.newStringField(1);
  public boolean hasAccount() throws quickfix.FieldNotFound {
    return isSetField(1);
  }
  public String getAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountField));
  }
  public OrderCancelReject setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public OrderCancelReject setAccount(final quickfix.field.Account value) {
    setField(FieldValue.to(accountField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public OrderCancelReject setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public OrderCancelReject setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField cxlRejResponseToField = FieldFactory.newCharField(434);
  public boolean hasCxlRejResponseTo() throws quickfix.FieldNotFound {
    return isSetField(434);
  }
  public int getCxlRejResponseTo() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cxlRejResponseToField));
  }
  public OrderCancelReject setCxlRejResponseTo(final int value) {
    setField(FieldValue.to(cxlRejResponseToField, value));
    return this;
  }
  public OrderCancelReject setCxlRejResponseTo(final char value) {
    setField(FieldValue.to(cxlRejResponseToField, value));
    return this;
  }
  public OrderCancelReject setCxlRejResponseTo(final String value) {
    setField(FieldValue.to(cxlRejResponseToField, value));
    return this;
  }
  public OrderCancelReject setCxlRejResponseTo(final quickfix.field.CxlRejResponseTo value) {
    setField(FieldValue.to(cxlRejResponseToField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField cxlRejReasonField = FieldFactory.newIntField(102);
  public boolean hasCxlRejReason() throws quickfix.FieldNotFound {
    return isSetField(102);
  }
  public int getCxlRejReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cxlRejReasonField));
  }
  public OrderCancelReject setCxlRejReason(final int value) {
    setField(FieldValue.to(cxlRejReasonField, value));
    return this;
  }
  public OrderCancelReject setCxlRejReason(final quickfix.field.CxlRejReason value) {
    setField(FieldValue.to(cxlRejReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public OrderCancelReject setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public OrderCancelReject setText(final quickfix.field.Text value) {
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
  public OrderCancelReject setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public OrderCancelReject setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public OrderCancelReject setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public OrderCancelReject setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public OrderCancelReject() {
    super(new int[] {37, 198, 11, 41, 39, 109, 76, 66, 1, 60, 434, 102, 58, 354, 355, 0});
  }

  public OrderCancelReject(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {37, 198, 11, 41, 39, 109, 76, 66, 1, 60, 434, 102, 58, 354, 355, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.OrderCancelReject,
      garden_leave.fix42.proto.FIX42Protos.OrderCancelReject> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasOrderId()) {
        builder.setOrderId(fix.getOrderId());
        presenceBuilder.setOrderId(true);
      }
      if (fix.hasSecondaryOrderId()) {
        builder.setSecondaryOrderId(fix.getSecondaryOrderId());
        presenceBuilder.setSecondaryOrderId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasOrigClOrdId()) {
        builder.setOrigClOrdId(fix.getOrigClOrdId());
        presenceBuilder.setOrigClOrdId(true);
      }
      if (fix.hasOrdStatus()) {
        builder.setOrdStatus(fix.getOrdStatus());
        presenceBuilder.setOrdStatus(true);
      }
      if (fix.hasClientId()) {
        builder.setClientId(fix.getClientId());
        presenceBuilder.setClientId(true);
      }
      if (fix.hasExecBroker()) {
        builder.setExecBroker(fix.getExecBroker());
        presenceBuilder.setExecBroker(true);
      }
      if (fix.hasListId()) {
        builder.setListId(fix.getListId());
        presenceBuilder.setListId(true);
      }
      if (fix.hasAccount()) {
        builder.setAccount(fix.getAccount());
        presenceBuilder.setAccount(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasCxlRejResponseTo()) {
        builder.setCxlRejResponseTo(fix.getCxlRejResponseTo());
        presenceBuilder.setCxlRejResponseTo(true);
      }
      if (fix.hasCxlRejReason()) {
        builder.setCxlRejReason(fix.getCxlRejReason());
        presenceBuilder.setCxlRejReason(true);
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
      logger.error("orderCancelReject error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.OrderCancelReject,
      garden_leave.gateway.transform.fix42.OrderCancelReject> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.OrderCancelReject.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.OrderCancelReject fix =
          new garden_leave.gateway.transform.fix42.OrderCancelReject();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReject.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getOrderId()) {
        fix.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getSecondaryOrderId()) {
        fix.setSecondaryOrderId(proto.getSecondaryOrderId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getOrigClOrdId()) {
        fix.setOrigClOrdId(proto.getOrigClOrdId());
      }
      if (fieldPresence.getOrdStatus()) {
        fix.setOrdStatus(proto.getOrdStatus());
      }
      if (fieldPresence.getClientId()) {
        fix.setClientId(proto.getClientId());
      }
      if (fieldPresence.getExecBroker()) {
        fix.setExecBroker(proto.getExecBroker());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getAccount()) {
        fix.setAccount(proto.getAccount());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getCxlRejResponseTo()) {
        fix.setCxlRejResponseTo(proto.getCxlRejResponseTo());
      }
      if (fieldPresence.getCxlRejReason()) {
        fix.setCxlRejReason(proto.getCxlRejReason());
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
