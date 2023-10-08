package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.314228700
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

  public static final String BEGINSTR = "FIX.5.0";
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

  private final quickfix.StringField secondaryClOrdIdField = FieldFactory.newStringField(526);
  public boolean hasSecondaryClOrdId() throws quickfix.FieldNotFound {
    return isSetField(526);
  }
  public String getSecondaryClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryClOrdIdField));
  }
  public OrderCancelReject setSecondaryClOrdId(final String value) {
    setField(FieldValue.to(secondaryClOrdIdField, value));
    return this;
  }
  public OrderCancelReject setSecondaryClOrdId(final quickfix.field.SecondaryClOrdID value) {
    setField(FieldValue.to(secondaryClOrdIdField, FieldValue.of(value)));
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

  private final quickfix.StringField clOrdLinkIdField = FieldFactory.newStringField(583);
  public boolean hasClOrdLinkId() throws quickfix.FieldNotFound {
    return isSetField(583);
  }
  public String getClOrdLinkId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdLinkIdField));
  }
  public OrderCancelReject setClOrdLinkId(final String value) {
    setField(FieldValue.to(clOrdLinkIdField, value));
    return this;
  }
  public OrderCancelReject setClOrdLinkId(final quickfix.field.ClOrdLinkID value) {
    setField(FieldValue.to(clOrdLinkIdField, FieldValue.of(value)));
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

  private final quickfix.BooleanField workingIndicatorField = FieldFactory.newBooleanField(636);
  public boolean hasWorkingIndicator() throws quickfix.FieldNotFound {
    return isSetField(636);
  }
  public boolean getWorkingIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(workingIndicatorField));
  }
  public OrderCancelReject setWorkingIndicator(final boolean value) {
    setField(FieldValue.to(workingIndicatorField, value));
    return this;
  }
  public OrderCancelReject setWorkingIndicator(final quickfix.field.WorkingIndicator value) {
    setField(FieldValue.to(workingIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField origOrdModTimeField =
      FieldFactory.newTimeStampField(586);
  public boolean hasOrigOrdModTime() throws quickfix.FieldNotFound {
    return isSetField(586);
  }
  public long getOrigOrdModTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origOrdModTimeField));
  }
  public OrderCancelReject setOrigOrdModTime(final long value) {
    setField(FieldValue.to(origOrdModTimeField, value));
    return this;
  }
  public OrderCancelReject setOrigOrdModTime(final quickfix.field.OrigOrdModTime value) {
    setField(FieldValue.to(origOrdModTimeField, FieldValue.of(value)));
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

  private final quickfix.IntField acctIdSourceField = FieldFactory.newIntField(660);
  public boolean hasAcctIdSource() throws quickfix.FieldNotFound {
    return isSetField(660);
  }
  public int getAcctIdSource() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(acctIdSourceField));
  }
  public OrderCancelReject setAcctIdSource(final int value) {
    setField(FieldValue.to(acctIdSourceField, value));
    return this;
  }
  public OrderCancelReject setAcctIdSource(final quickfix.field.AcctIDSource value) {
    setField(FieldValue.to(acctIdSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField accountTypeField = FieldFactory.newIntField(581);
  public boolean hasAccountType() throws quickfix.FieldNotFound {
    return isSetField(581);
  }
  public int getAccountType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountTypeField));
  }
  public OrderCancelReject setAccountType(final int value) {
    setField(FieldValue.to(accountTypeField, value));
    return this;
  }
  public OrderCancelReject setAccountType(final quickfix.field.AccountType value) {
    setField(FieldValue.to(accountTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeOriginationDateField = FieldFactory.newStringField(229);
  public boolean hasTradeOriginationDate() throws quickfix.FieldNotFound {
    return isSetField(229);
  }
  public String getTradeOriginationDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeOriginationDateField));
  }
  public OrderCancelReject setTradeOriginationDate(final String value) {
    setField(FieldValue.to(tradeOriginationDateField, value));
    return this;
  }
  public OrderCancelReject setTradeOriginationDate(
      final quickfix.field.TradeOriginationDate value) {
    setField(FieldValue.to(tradeOriginationDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeDateField = FieldFactory.newStringField(75);
  public boolean hasTradeDate() throws quickfix.FieldNotFound {
    return isSetField(75);
  }
  public String getTradeDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeDateField));
  }
  public OrderCancelReject setTradeDate(final String value) {
    setField(FieldValue.to(tradeDateField, value));
    return this;
  }
  public OrderCancelReject setTradeDate(final quickfix.field.TradeDate value) {
    setField(FieldValue.to(tradeDateField, FieldValue.of(value)));
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
    super(new int[] {37, 198, 526, 11, 583, 41, 39, 636, 586, 66, 1, 660, 581, 229, 75, 60, 434,
        102, 58, 354, 355, 0});
  }

  public OrderCancelReject(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {37, 198, 526, 11, 583, 41, 39, 636, 586, 66, 1, 660, 581, 229, 75, 60, 434,
        102, 58, 354, 355, 0});
    this.span = span;
  }

  @Override
  protected quickfix.Message.Header newHeader() {
    return new garden_leave.gateway.transform.fix50sp2.Header(this, BEGINSTR, MSGTYPE);
  }

  @Override
  public void addGroup(final quickfix.Group group) {
    addGroupRef(group);
  }

  public static Function<garden_leave.gateway.transform.fix50sp2.OrderCancelReject,
      garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.getDefaultInstance();
    }

    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.Builder builder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.newBuilder();
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix50sp2.Header header =
        (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
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
      if (fix.hasSecondaryClOrdId()) {
        builder.setSecondaryClOrdId(fix.getSecondaryClOrdId());
        presenceBuilder.setSecondaryClOrdId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasClOrdLinkId()) {
        builder.setClOrdLinkId(fix.getClOrdLinkId());
        presenceBuilder.setClOrdLinkId(true);
      }
      if (fix.hasOrigClOrdId()) {
        builder.setOrigClOrdId(fix.getOrigClOrdId());
        presenceBuilder.setOrigClOrdId(true);
      }
      if (fix.hasOrdStatus()) {
        builder.setOrdStatus(fix.getOrdStatus());
        presenceBuilder.setOrdStatus(true);
      }
      if (fix.hasWorkingIndicator()) {
        builder.setWorkingIndicator(fix.getWorkingIndicator());
        presenceBuilder.setWorkingIndicator(true);
      }
      if (fix.hasOrigOrdModTime()) {
        builder.setOrigOrdModTime(fix.getOrigOrdModTime());
        presenceBuilder.setOrigOrdModTime(true);
      }
      if (fix.hasListId()) {
        builder.setListId(fix.getListId());
        presenceBuilder.setListId(true);
      }
      if (fix.hasAccount()) {
        builder.setAccount(fix.getAccount());
        presenceBuilder.setAccount(true);
      }
      if (fix.hasAcctIdSource()) {
        builder.setAcctIdSource(fix.getAcctIdSource());
        presenceBuilder.setAcctIdSource(true);
      }
      if (fix.hasAccountType()) {
        builder.setAccountType(fix.getAccountType());
        presenceBuilder.setAccountType(true);
      }
      if (fix.hasTradeOriginationDate()) {
        builder.setTradeOriginationDate(fix.getTradeOriginationDate());
        presenceBuilder.setTradeOriginationDate(true);
      }
      if (fix.hasTradeDate()) {
        builder.setTradeDate(fix.getTradeDate());
        presenceBuilder.setTradeDate(true);
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

  public static Function<garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject,
      garden_leave.gateway.transform.fix50sp2.OrderCancelReject> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix50sp2.OrderCancelReject.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix50sp2.OrderCancelReject fix =
          new garden_leave.gateway.transform.fix50sp2.OrderCancelReject();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix50sp2.Header header =
          (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelReject
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getOrderId()) {
        fix.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getSecondaryOrderId()) {
        fix.setSecondaryOrderId(proto.getSecondaryOrderId());
      }
      if (fieldPresence.getSecondaryClOrdId()) {
        fix.setSecondaryClOrdId(proto.getSecondaryClOrdId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getClOrdLinkId()) {
        fix.setClOrdLinkId(proto.getClOrdLinkId());
      }
      if (fieldPresence.getOrigClOrdId()) {
        fix.setOrigClOrdId(proto.getOrigClOrdId());
      }
      if (fieldPresence.getOrdStatus()) {
        fix.setOrdStatus(proto.getOrdStatus());
      }
      if (fieldPresence.getWorkingIndicator()) {
        fix.setWorkingIndicator(proto.getWorkingIndicator());
      }
      if (fieldPresence.getOrigOrdModTime()) {
        fix.setOrigOrdModTime(proto.getOrigOrdModTime());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getAccount()) {
        fix.setAccount(proto.getAccount());
      }
      if (fieldPresence.getAcctIdSource()) {
        fix.setAcctIdSource(proto.getAcctIdSource());
      }
      if (fieldPresence.getAccountType()) {
        fix.setAccountType(proto.getAccountType());
      }
      if (fieldPresence.getTradeOriginationDate()) {
        fix.setTradeOriginationDate(proto.getTradeOriginationDate());
      }
      if (fieldPresence.getTradeDate()) {
        fix.setTradeDate(proto.getTradeDate());
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
