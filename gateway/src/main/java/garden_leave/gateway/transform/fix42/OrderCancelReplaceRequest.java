package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.512434
//

public final class OrderCancelReplaceRequest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(OrderCancelReplaceRequest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(OrderCancelReplaceRequest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public OrderCancelReplaceRequest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "G";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoAllocs extends quickfix.Group {
    private final quickfix.StringField allocAccountField = FieldFactory.newStringField(79);
    public boolean hasAllocAccount() throws quickfix.FieldNotFound {
      return isSetField(79);
    }
    public String getAllocAccount() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocAccountField));
    }
    public NoAllocs setAllocAccount(final String value) {
      setField(FieldValue.to(allocAccountField, value));
      return this;
    }
    public NoAllocs setAllocAccount(final quickfix.field.AllocAccount value) {
      setField(FieldValue.to(allocAccountField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField allocSharesField = FieldFactory.newDoubleField(80);
    public boolean hasAllocShares() throws quickfix.FieldNotFound {
      return isSetField(80);
    }
    public double getAllocShares() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocSharesField));
    }
    public NoAllocs setAllocShares(final double value) {
      setField(FieldValue.to(allocSharesField, value));
      return this;
    }
    public NoAllocs setAllocShares(final quickfix.field.AllocShares value) {
      setField(FieldValue.to(allocSharesField, FieldValue.of(value)));
      return this;
    }

    public NoAllocs() {
      super(78, 79, new int[] {79, 80, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs proto) {
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getAllocAccount()) {
        this.setAllocAccount(proto.getAllocAccount());
      }
      if (fieldPresence.getAllocShares()) {
        this.setAllocShares(proto.getAllocShares());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs
          .Builder builder =
          garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoAllocs.FieldPresence
          .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
                                         .NoAllocs.FieldPresence.newBuilder();

      if (this.hasAllocAccount()) {
        builder.setAllocAccount(this.getAllocAccount());
        presenceBuilder.setAllocAccount(true);
      }
      if (this.hasAllocShares()) {
        builder.setAllocShares(this.getAllocShares());
        presenceBuilder.setAllocShares(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoTradingSessions extends quickfix.Group {
    private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
    public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
      return isSetField(336);
    }
    public String getTradingSessionId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionIdField));
    }
    public NoTradingSessions setTradingSessionId(final String value) {
      setField(FieldValue.to(tradingSessionIdField, value));
      return this;
    }
    public NoTradingSessions setTradingSessionId(final quickfix.field.TradingSessionID value) {
      setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
      return this;
    }

    public NoTradingSessions() {
      super(386, 336, new int[] {336, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
                              .NoTradingSessions proto) {
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoTradingSessions
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getTradingSessionId()) {
        this.setTradingSessionId(proto.getTradingSessionId());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoTradingSessions.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoTradingSessions
          .Builder builder = garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
                                 .NoTradingSessions.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoTradingSessions
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.NoTradingSessions
              .FieldPresence.newBuilder();

      if (this.hasTradingSessionId()) {
        builder.setTradingSessionId(this.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  private final quickfix.StringField orderIdField = FieldFactory.newStringField(37);
  public boolean hasOrderId() throws quickfix.FieldNotFound {
    return isSetField(37);
  }
  public String getOrderId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderIdField));
  }
  public OrderCancelReplaceRequest setOrderId(final String value) {
    setField(FieldValue.to(orderIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrderId(final quickfix.field.OrderID value) {
    setField(FieldValue.to(orderIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clientIdField = FieldFactory.newStringField(109);
  public boolean hasClientId() throws quickfix.FieldNotFound {
    return isSetField(109);
  }
  public String getClientId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clientIdField));
  }
  public OrderCancelReplaceRequest setClientId(final String value) {
    setField(FieldValue.to(clientIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setClientId(final quickfix.field.ClientID value) {
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
  public OrderCancelReplaceRequest setExecBroker(final String value) {
    setField(FieldValue.to(execBrokerField, value));
    return this;
  }
  public OrderCancelReplaceRequest setExecBroker(final quickfix.field.ExecBroker value) {
    setField(FieldValue.to(execBrokerField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField origClOrdIdField = FieldFactory.newStringField(41);
  public boolean hasOrigClOrdId() throws quickfix.FieldNotFound {
    return isSetField(41);
  }
  public String getOrigClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origClOrdIdField));
  }
  public OrderCancelReplaceRequest setOrigClOrdId(final String value) {
    setField(FieldValue.to(origClOrdIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrigClOrdId(final quickfix.field.OrigClOrdID value) {
    setField(FieldValue.to(origClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public OrderCancelReplaceRequest setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setClOrdId(final quickfix.field.ClOrdID value) {
    setField(FieldValue.to(clOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField listIdField = FieldFactory.newStringField(66);
  public boolean hasListId() throws quickfix.FieldNotFound {
    return isSetField(66);
  }
  public String getListId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(listIdField));
  }
  public OrderCancelReplaceRequest setListId(final String value) {
    setField(FieldValue.to(listIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setListId(final quickfix.field.ListID value) {
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
  public OrderCancelReplaceRequest setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public OrderCancelReplaceRequest setAccount(final quickfix.field.Account value) {
    setField(FieldValue.to(accountField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField settlmntTypField = FieldFactory.newCharField(63);
  public boolean hasSettlmntTyp() throws quickfix.FieldNotFound {
    return isSetField(63);
  }
  public int getSettlmntTyp() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlmntTypField));
  }
  public OrderCancelReplaceRequest setSettlmntTyp(final int value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSettlmntTyp(final char value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSettlmntTyp(final String value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSettlmntTyp(final quickfix.field.SettlmntTyp value) {
    setField(FieldValue.to(settlmntTypField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField futSettDateField = FieldFactory.newStringField(64);
  public boolean hasFutSettDate() throws quickfix.FieldNotFound {
    return isSetField(64);
  }
  public String getFutSettDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(futSettDateField));
  }
  public OrderCancelReplaceRequest setFutSettDate(final String value) {
    setField(FieldValue.to(futSettDateField, value));
    return this;
  }
  public OrderCancelReplaceRequest setFutSettDate(final quickfix.field.FutSettDate value) {
    setField(FieldValue.to(futSettDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField handlInstField = FieldFactory.newCharField(21);
  public boolean hasHandlInst() throws quickfix.FieldNotFound {
    return isSetField(21);
  }
  public int getHandlInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(handlInstField));
  }
  public OrderCancelReplaceRequest setHandlInst(final int value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setHandlInst(final char value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setHandlInst(final String value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setHandlInst(final quickfix.field.HandlInst value) {
    setField(FieldValue.to(handlInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execInstField = FieldFactory.newStringField(18);
  public boolean hasExecInst() throws quickfix.FieldNotFound {
    return isSetField(18);
  }
  public String getExecInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execInstField));
  }
  public OrderCancelReplaceRequest setExecInst(final String value) {
    setField(FieldValue.to(execInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setExecInst(final quickfix.field.ExecInst value) {
    setField(FieldValue.to(execInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
  public boolean hasMinQty() throws quickfix.FieldNotFound {
    return isSetField(110);
  }
  public double getMinQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(minQtyField));
  }
  public OrderCancelReplaceRequest setMinQty(final double value) {
    setField(FieldValue.to(minQtyField, value));
    return this;
  }
  public OrderCancelReplaceRequest setMinQty(final quickfix.field.MinQty value) {
    setField(FieldValue.to(minQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxFloorField = FieldFactory.newDoubleField(111);
  public boolean hasMaxFloor() throws quickfix.FieldNotFound {
    return isSetField(111);
  }
  public double getMaxFloor() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxFloorField));
  }
  public OrderCancelReplaceRequest setMaxFloor(final double value) {
    setField(FieldValue.to(maxFloorField, value));
    return this;
  }
  public OrderCancelReplaceRequest setMaxFloor(final quickfix.field.MaxFloor value) {
    setField(FieldValue.to(maxFloorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField exDestinationField = FieldFactory.newStringField(100);
  public boolean hasExDestination() throws quickfix.FieldNotFound {
    return isSetField(100);
  }
  public String getExDestination() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(exDestinationField));
  }
  public OrderCancelReplaceRequest setExDestination(final String value) {
    setField(FieldValue.to(exDestinationField, value));
    return this;
  }
  public OrderCancelReplaceRequest setExDestination(final quickfix.field.ExDestination value) {
    setField(FieldValue.to(exDestinationField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public OrderCancelReplaceRequest setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSymbol(final quickfix.field.Symbol value) {
    setField(FieldValue.to(symbolField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolSfxField = FieldFactory.newStringField(65);
  public boolean hasSymbolSfx() throws quickfix.FieldNotFound {
    return isSetField(65);
  }
  public String getSymbolSfx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolSfxField));
  }
  public OrderCancelReplaceRequest setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSymbolSfx(final quickfix.field.SymbolSfx value) {
    setField(FieldValue.to(symbolSfxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField securityIdField = FieldFactory.newStringField(48);
  public boolean hasSecurityId() throws quickfix.FieldNotFound {
    return isSetField(48);
  }
  public String getSecurityId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(securityIdField));
  }
  public OrderCancelReplaceRequest setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSecurityId(final quickfix.field.SecurityID value) {
    setField(FieldValue.to(securityIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField idSourceField = FieldFactory.newStringField(22);
  public boolean hasIdSource() throws quickfix.FieldNotFound {
    return isSetField(22);
  }
  public String getIdSource() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(idSourceField));
  }
  public OrderCancelReplaceRequest setIdSource(final String value) {
    setField(FieldValue.to(idSourceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setIdSource(final quickfix.field.IDSource value) {
    setField(FieldValue.to(idSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField securityTypeField = FieldFactory.newStringField(167);
  public boolean hasSecurityType() throws quickfix.FieldNotFound {
    return isSetField(167);
  }
  public String getSecurityType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(securityTypeField));
  }
  public OrderCancelReplaceRequest setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSecurityType(final quickfix.field.SecurityType value) {
    setField(FieldValue.to(securityTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField maturityMonthYearField = FieldFactory.newStringField(200);
  public boolean hasMaturityMonthYear() throws quickfix.FieldNotFound {
    return isSetField(200);
  }
  public String getMaturityMonthYear() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maturityMonthYearField));
  }
  public OrderCancelReplaceRequest setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public OrderCancelReplaceRequest setMaturityMonthYear(
      final quickfix.field.MaturityMonthYear value) {
    setField(FieldValue.to(maturityMonthYearField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField maturityDayField = FieldFactory.newIntField(205);
  public boolean hasMaturityDay() throws quickfix.FieldNotFound {
    return isSetField(205);
  }
  public int getMaturityDay() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maturityDayField));
  }
  public OrderCancelReplaceRequest setMaturityDay(final int value) {
    setField(FieldValue.to(maturityDayField, value));
    return this;
  }
  public OrderCancelReplaceRequest setMaturityDay(final quickfix.field.MaturityDay value) {
    setField(FieldValue.to(maturityDayField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField putOrCallField = FieldFactory.newIntField(201);
  public boolean hasPutOrCall() throws quickfix.FieldNotFound {
    return isSetField(201);
  }
  public int getPutOrCall() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(putOrCallField));
  }
  public OrderCancelReplaceRequest setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public OrderCancelReplaceRequest setPutOrCall(final quickfix.field.PutOrCall value) {
    setField(FieldValue.to(putOrCallField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField strikePriceField = FieldFactory.newDoubleField(202);
  public boolean hasStrikePrice() throws quickfix.FieldNotFound {
    return isSetField(202);
  }
  public double getStrikePrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(strikePriceField));
  }
  public OrderCancelReplaceRequest setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setStrikePrice(final quickfix.field.StrikePrice value) {
    setField(FieldValue.to(strikePriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField optAttributeField = FieldFactory.newCharField(206);
  public boolean hasOptAttribute() throws quickfix.FieldNotFound {
    return isSetField(206);
  }
  public int getOptAttribute() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(optAttributeField));
  }
  public OrderCancelReplaceRequest setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOptAttribute(final quickfix.field.OptAttribute value) {
    setField(FieldValue.to(optAttributeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField contractMultiplierField = FieldFactory.newDoubleField(231);
  public boolean hasContractMultiplier() throws quickfix.FieldNotFound {
    return isSetField(231);
  }
  public double getContractMultiplier() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(contractMultiplierField));
  }
  public OrderCancelReplaceRequest setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public OrderCancelReplaceRequest setContractMultiplier(
      final quickfix.field.ContractMultiplier value) {
    setField(FieldValue.to(contractMultiplierField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField couponRateField = FieldFactory.newDoubleField(223);
  public boolean hasCouponRate() throws quickfix.FieldNotFound {
    return isSetField(223);
  }
  public double getCouponRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(couponRateField));
  }
  public OrderCancelReplaceRequest setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCouponRate(final quickfix.field.CouponRate value) {
    setField(FieldValue.to(couponRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField securityExchangeField = FieldFactory.newStringField(207);
  public boolean hasSecurityExchange() throws quickfix.FieldNotFound {
    return isSetField(207);
  }
  public String getSecurityExchange() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(securityExchangeField));
  }
  public OrderCancelReplaceRequest setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSecurityExchange(
      final quickfix.field.SecurityExchange value) {
    setField(FieldValue.to(securityExchangeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField issuerField = FieldFactory.newStringField(106);
  public boolean hasIssuer() throws quickfix.FieldNotFound {
    return isSetField(106);
  }
  public String getIssuer() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(issuerField));
  }
  public OrderCancelReplaceRequest setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public OrderCancelReplaceRequest setIssuer(final quickfix.field.Issuer value) {
    setField(FieldValue.to(issuerField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encodedIssuerLenField = FieldFactory.newIntField(348);
  public boolean hasEncodedIssuerLen() throws quickfix.FieldNotFound {
    return isSetField(348);
  }
  public int getEncodedIssuerLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedIssuerLenField));
  }
  public OrderCancelReplaceRequest setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedIssuerLen(
      final quickfix.field.EncodedIssuerLen value) {
    setField(FieldValue.to(encodedIssuerLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField encodedIssuerField = FieldFactory.newStringField(349);
  public boolean hasEncodedIssuer() throws quickfix.FieldNotFound {
    return isSetField(349);
  }
  public String getEncodedIssuer() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedIssuerField));
  }
  public OrderCancelReplaceRequest setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
    setField(FieldValue.to(encodedIssuerField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField securityDescField = FieldFactory.newStringField(107);
  public boolean hasSecurityDesc() throws quickfix.FieldNotFound {
    return isSetField(107);
  }
  public String getSecurityDesc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(securityDescField));
  }
  public OrderCancelReplaceRequest setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSecurityDesc(final quickfix.field.SecurityDesc value) {
    setField(FieldValue.to(securityDescField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encodedSecurityDescLenField = FieldFactory.newIntField(350);
  public boolean hasEncodedSecurityDescLen() throws quickfix.FieldNotFound {
    return isSetField(350);
  }
  public int getEncodedSecurityDescLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedSecurityDescLenField));
  }
  public OrderCancelReplaceRequest setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedSecurityDescLen(
      final quickfix.field.EncodedSecurityDescLen value) {
    setField(FieldValue.to(encodedSecurityDescLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField encodedSecurityDescField = FieldFactory.newStringField(351);
  public boolean hasEncodedSecurityDesc() throws quickfix.FieldNotFound {
    return isSetField(351);
  }
  public String getEncodedSecurityDesc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encodedSecurityDescField));
  }
  public OrderCancelReplaceRequest setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedSecurityDesc(
      final quickfix.field.EncodedSecurityDesc value) {
    setField(FieldValue.to(encodedSecurityDescField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField sideField = FieldFactory.newCharField(54);
  public boolean hasSide() throws quickfix.FieldNotFound {
    return isSetField(54);
  }
  public int getSide() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sideField));
  }
  public OrderCancelReplaceRequest setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSide(final quickfix.field.Side value) {
    setField(FieldValue.to(sideField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public OrderCancelReplaceRequest setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField orderQtyField = FieldFactory.newDoubleField(38);
  public boolean hasOrderQty() throws quickfix.FieldNotFound {
    return isSetField(38);
  }
  public double getOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderQtyField));
  }
  public OrderCancelReplaceRequest setOrderQty(final double value) {
    setField(FieldValue.to(orderQtyField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrderQty(final quickfix.field.OrderQty value) {
    setField(FieldValue.to(orderQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField cashOrderQtyField = FieldFactory.newDoubleField(152);
  public boolean hasCashOrderQty() throws quickfix.FieldNotFound {
    return isSetField(152);
  }
  public double getCashOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cashOrderQtyField));
  }
  public OrderCancelReplaceRequest setCashOrderQty(final double value) {
    setField(FieldValue.to(cashOrderQtyField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCashOrderQty(final quickfix.field.CashOrderQty value) {
    setField(FieldValue.to(cashOrderQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordTypeField = FieldFactory.newCharField(40);
  public boolean hasOrdType() throws quickfix.FieldNotFound {
    return isSetField(40);
  }
  public int getOrdType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordTypeField));
  }
  public OrderCancelReplaceRequest setOrdType(final int value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrdType(final char value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrdType(final String value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrdType(final quickfix.field.OrdType value) {
    setField(FieldValue.to(ordTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField priceField = FieldFactory.newDoubleField(44);
  public boolean hasPrice() throws quickfix.FieldNotFound {
    return isSetField(44);
  }
  public double getPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceField));
  }
  public OrderCancelReplaceRequest setPrice(final double value) {
    setField(FieldValue.to(priceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setPrice(final quickfix.field.Price value) {
    setField(FieldValue.to(priceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField stopPxField = FieldFactory.newDoubleField(99);
  public boolean hasStopPx() throws quickfix.FieldNotFound {
    return isSetField(99);
  }
  public double getStopPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(stopPxField));
  }
  public OrderCancelReplaceRequest setStopPx(final double value) {
    setField(FieldValue.to(stopPxField, value));
    return this;
  }
  public OrderCancelReplaceRequest setStopPx(final quickfix.field.StopPx value) {
    setField(FieldValue.to(stopPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField pegDifferenceField = FieldFactory.newDoubleField(211);
  public boolean hasPegDifference() throws quickfix.FieldNotFound {
    return isSetField(211);
  }
  public double getPegDifference() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegDifferenceField));
  }
  public OrderCancelReplaceRequest setPegDifference(final double value) {
    setField(FieldValue.to(pegDifferenceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setPegDifference(final quickfix.field.PegDifference value) {
    setField(FieldValue.to(pegDifferenceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField discretionInstField = FieldFactory.newCharField(388);
  public boolean hasDiscretionInst() throws quickfix.FieldNotFound {
    return isSetField(388);
  }
  public int getDiscretionInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionInstField));
  }
  public OrderCancelReplaceRequest setDiscretionInst(final int value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setDiscretionInst(final char value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setDiscretionInst(final String value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setDiscretionInst(final quickfix.field.DiscretionInst value) {
    setField(FieldValue.to(discretionInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField discretionOffsetField = FieldFactory.newDoubleField(389);
  public boolean hasDiscretionOffset() throws quickfix.FieldNotFound {
    return isSetField(389);
  }
  public double getDiscretionOffset() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionOffsetField));
  }
  public OrderCancelReplaceRequest setDiscretionOffset(final double value) {
    setField(FieldValue.to(discretionOffsetField, value));
    return this;
  }
  public OrderCancelReplaceRequest setDiscretionOffset(
      final quickfix.field.DiscretionOffset value) {
    setField(FieldValue.to(discretionOffsetField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField complianceIdField = FieldFactory.newStringField(376);
  public boolean hasComplianceId() throws quickfix.FieldNotFound {
    return isSetField(376);
  }
  public String getComplianceId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(complianceIdField));
  }
  public OrderCancelReplaceRequest setComplianceId(final String value) {
    setField(FieldValue.to(complianceIdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setComplianceId(final quickfix.field.ComplianceID value) {
    setField(FieldValue.to(complianceIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField solicitedFlagField = FieldFactory.newBooleanField(377);
  public boolean hasSolicitedFlag() throws quickfix.FieldNotFound {
    return isSetField(377);
  }
  public boolean getSolicitedFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(solicitedFlagField));
  }
  public OrderCancelReplaceRequest setSolicitedFlag(final boolean value) {
    setField(FieldValue.to(solicitedFlagField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSolicitedFlag(final quickfix.field.SolicitedFlag value) {
    setField(FieldValue.to(solicitedFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public OrderCancelReplaceRequest setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCurrency(final quickfix.field.Currency value) {
    setField(FieldValue.to(currencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField timeInForceField = FieldFactory.newCharField(59);
  public boolean hasTimeInForce() throws quickfix.FieldNotFound {
    return isSetField(59);
  }
  public int getTimeInForce() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeInForceField));
  }
  public OrderCancelReplaceRequest setTimeInForce(final int value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setTimeInForce(final char value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setTimeInForce(final String value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public OrderCancelReplaceRequest setTimeInForce(final quickfix.field.TimeInForce value) {
    setField(FieldValue.to(timeInForceField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField effectiveTimeField =
      FieldFactory.newTimeStampField(168);
  public boolean hasEffectiveTime() throws quickfix.FieldNotFound {
    return isSetField(168);
  }
  public long getEffectiveTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(effectiveTimeField));
  }
  public OrderCancelReplaceRequest setEffectiveTime(final long value) {
    setField(FieldValue.to(effectiveTimeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEffectiveTime(final quickfix.field.EffectiveTime value) {
    setField(FieldValue.to(effectiveTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField expireDateField = FieldFactory.newStringField(432);
  public boolean hasExpireDate() throws quickfix.FieldNotFound {
    return isSetField(432);
  }
  public String getExpireDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(expireDateField));
  }
  public OrderCancelReplaceRequest setExpireDate(final String value) {
    setField(FieldValue.to(expireDateField, value));
    return this;
  }
  public OrderCancelReplaceRequest setExpireDate(final quickfix.field.ExpireDate value) {
    setField(FieldValue.to(expireDateField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField expireTimeField = FieldFactory.newTimeStampField(126);
  public boolean hasExpireTime() throws quickfix.FieldNotFound {
    return isSetField(126);
  }
  public long getExpireTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(expireTimeField));
  }
  public OrderCancelReplaceRequest setExpireTime(final long value) {
    setField(FieldValue.to(expireTimeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setExpireTime(final quickfix.field.ExpireTime value) {
    setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField gtBookingInstField = FieldFactory.newIntField(427);
  public boolean hasGtBookingInst() throws quickfix.FieldNotFound {
    return isSetField(427);
  }
  public int getGtBookingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(gtBookingInstField));
  }
  public OrderCancelReplaceRequest setGtBookingInst(final int value) {
    setField(FieldValue.to(gtBookingInstField, value));
    return this;
  }
  public OrderCancelReplaceRequest setGtBookingInst(final quickfix.field.GTBookingInst value) {
    setField(FieldValue.to(gtBookingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField commissionField = FieldFactory.newDoubleField(12);
  public boolean hasCommission() throws quickfix.FieldNotFound {
    return isSetField(12);
  }
  public double getCommission() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commissionField));
  }
  public OrderCancelReplaceRequest setCommission(final double value) {
    setField(FieldValue.to(commissionField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCommission(final quickfix.field.Commission value) {
    setField(FieldValue.to(commissionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField commTypeField = FieldFactory.newCharField(13);
  public boolean hasCommType() throws quickfix.FieldNotFound {
    return isSetField(13);
  }
  public int getCommType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commTypeField));
  }
  public OrderCancelReplaceRequest setCommType(final int value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCommType(final char value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCommType(final String value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCommType(final quickfix.field.CommType value) {
    setField(FieldValue.to(commTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField rule80AField = FieldFactory.newCharField(47);
  public boolean hasRule80A() throws quickfix.FieldNotFound {
    return isSetField(47);
  }
  public int getRule80A() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(rule80AField));
  }
  public OrderCancelReplaceRequest setRule80A(final int value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public OrderCancelReplaceRequest setRule80A(final char value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public OrderCancelReplaceRequest setRule80A(final String value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public OrderCancelReplaceRequest setRule80A(final quickfix.field.Rule80A value) {
    setField(FieldValue.to(rule80AField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField forexReqField = FieldFactory.newBooleanField(121);
  public boolean hasForexReq() throws quickfix.FieldNotFound {
    return isSetField(121);
  }
  public boolean getForexReq() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(forexReqField));
  }
  public OrderCancelReplaceRequest setForexReq(final boolean value) {
    setField(FieldValue.to(forexReqField, value));
    return this;
  }
  public OrderCancelReplaceRequest setForexReq(final quickfix.field.ForexReq value) {
    setField(FieldValue.to(forexReqField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
  public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
    return isSetField(120);
  }
  public String getSettlCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrencyField));
  }
  public OrderCancelReplaceRequest setSettlCurrency(final String value) {
    setField(FieldValue.to(settlCurrencyField, value));
    return this;
  }
  public OrderCancelReplaceRequest setSettlCurrency(final quickfix.field.SettlCurrency value) {
    setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public OrderCancelReplaceRequest setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public OrderCancelReplaceRequest setText(final quickfix.field.Text value) {
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
  public OrderCancelReplaceRequest setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public OrderCancelReplaceRequest setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public OrderCancelReplaceRequest setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField futSettDate2Field = FieldFactory.newStringField(193);
  public boolean hasFutSettDate2() throws quickfix.FieldNotFound {
    return isSetField(193);
  }
  public String getFutSettDate2() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(futSettDate2Field));
  }
  public OrderCancelReplaceRequest setFutSettDate2(final String value) {
    setField(FieldValue.to(futSettDate2Field, value));
    return this;
  }
  public OrderCancelReplaceRequest setFutSettDate2(final quickfix.field.FutSettDate2 value) {
    setField(FieldValue.to(futSettDate2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField orderQty2Field = FieldFactory.newDoubleField(192);
  public boolean hasOrderQty2() throws quickfix.FieldNotFound {
    return isSetField(192);
  }
  public double getOrderQty2() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderQty2Field));
  }
  public OrderCancelReplaceRequest setOrderQty2(final double value) {
    setField(FieldValue.to(orderQty2Field, value));
    return this;
  }
  public OrderCancelReplaceRequest setOrderQty2(final quickfix.field.OrderQty2 value) {
    setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField openCloseField = FieldFactory.newCharField(77);
  public boolean hasOpenClose() throws quickfix.FieldNotFound {
    return isSetField(77);
  }
  public int getOpenClose() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(openCloseField));
  }
  public OrderCancelReplaceRequest setOpenClose(final int value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOpenClose(final char value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOpenClose(final String value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public OrderCancelReplaceRequest setOpenClose(final quickfix.field.OpenClose value) {
    setField(FieldValue.to(openCloseField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField coveredOrUncoveredField = FieldFactory.newIntField(203);
  public boolean hasCoveredOrUncovered() throws quickfix.FieldNotFound {
    return isSetField(203);
  }
  public int getCoveredOrUncovered() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(coveredOrUncoveredField));
  }
  public OrderCancelReplaceRequest setCoveredOrUncovered(final int value) {
    setField(FieldValue.to(coveredOrUncoveredField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCoveredOrUncovered(
      final quickfix.field.CoveredOrUncovered value) {
    setField(FieldValue.to(coveredOrUncoveredField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField customerOrFirmField = FieldFactory.newIntField(204);
  public boolean hasCustomerOrFirm() throws quickfix.FieldNotFound {
    return isSetField(204);
  }
  public int getCustomerOrFirm() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(customerOrFirmField));
  }
  public OrderCancelReplaceRequest setCustomerOrFirm(final int value) {
    setField(FieldValue.to(customerOrFirmField, value));
    return this;
  }
  public OrderCancelReplaceRequest setCustomerOrFirm(final quickfix.field.CustomerOrFirm value) {
    setField(FieldValue.to(customerOrFirmField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxShowField = FieldFactory.newDoubleField(210);
  public boolean hasMaxShow() throws quickfix.FieldNotFound {
    return isSetField(210);
  }
  public double getMaxShow() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxShowField));
  }
  public OrderCancelReplaceRequest setMaxShow(final double value) {
    setField(FieldValue.to(maxShowField, value));
    return this;
  }
  public OrderCancelReplaceRequest setMaxShow(final quickfix.field.MaxShow value) {
    setField(FieldValue.to(maxShowField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField locateReqdField = FieldFactory.newBooleanField(114);
  public boolean hasLocateReqd() throws quickfix.FieldNotFound {
    return isSetField(114);
  }
  public boolean getLocateReqd() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(locateReqdField));
  }
  public OrderCancelReplaceRequest setLocateReqd(final boolean value) {
    setField(FieldValue.to(locateReqdField, value));
    return this;
  }
  public OrderCancelReplaceRequest setLocateReqd(final quickfix.field.LocateReqd value) {
    setField(FieldValue.to(locateReqdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clearingFirmField = FieldFactory.newStringField(439);
  public boolean hasClearingFirm() throws quickfix.FieldNotFound {
    return isSetField(439);
  }
  public String getClearingFirm() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clearingFirmField));
  }
  public OrderCancelReplaceRequest setClearingFirm(final String value) {
    setField(FieldValue.to(clearingFirmField, value));
    return this;
  }
  public OrderCancelReplaceRequest setClearingFirm(final quickfix.field.ClearingFirm value) {
    setField(FieldValue.to(clearingFirmField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clearingAccountField = FieldFactory.newStringField(440);
  public boolean hasClearingAccount() throws quickfix.FieldNotFound {
    return isSetField(440);
  }
  public String getClearingAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clearingAccountField));
  }
  public OrderCancelReplaceRequest setClearingAccount(final String value) {
    setField(FieldValue.to(clearingAccountField, value));
    return this;
  }
  public OrderCancelReplaceRequest setClearingAccount(final quickfix.field.ClearingAccount value) {
    setField(FieldValue.to(clearingAccountField, FieldValue.of(value)));
    return this;
  }

  public OrderCancelReplaceRequest() {
    super(new int[] {37, 109, 76, 41, 11, 66, 1, 63, 64, 21, 18, 110, 111, 100, 55, 65, 48, 22, 167,
        200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 54, 60, 38, 152, 40,
        44, 99, 211, 388, 389, 376, 377, 15, 59, 168, 432, 126, 427, 12, 13, 47, 121, 120, 58, 354,
        355, 193, 192, 77, 203, 204, 210, 114, 439, 440, 0});
  }

  public OrderCancelReplaceRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {37, 109, 76, 41, 11, 66, 1, 63, 64, 21, 18, 110, 111, 100, 55, 65, 48, 22, 167,
        200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 54, 60, 38, 152, 40,
        44, 99, 211, 388, 389, 376, 377, 15, 59, 168, 432, 126, 427, 12, 13, 47, 121, 120, 58, 354,
        355, 193, 192, 77, 203, 204, 210, 114, 439, 440, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest,
      garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest.FieldPresence.newBuilder();

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
      if (fix.hasClientId()) {
        builder.setClientId(fix.getClientId());
        presenceBuilder.setClientId(true);
      }
      if (fix.hasExecBroker()) {
        builder.setExecBroker(fix.getExecBroker());
        presenceBuilder.setExecBroker(true);
      }
      if (fix.hasOrigClOrdId()) {
        builder.setOrigClOrdId(fix.getOrigClOrdId());
        presenceBuilder.setOrigClOrdId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasListId()) {
        builder.setListId(fix.getListId());
        presenceBuilder.setListId(true);
      }
      if (fix.hasAccount()) {
        builder.setAccount(fix.getAccount());
        presenceBuilder.setAccount(true);
      }
      if (fix.hasSettlmntTyp()) {
        builder.setSettlmntTyp(fix.getSettlmntTyp());
        presenceBuilder.setSettlmntTyp(true);
      }
      if (fix.hasFutSettDate()) {
        builder.setFutSettDate(fix.getFutSettDate());
        presenceBuilder.setFutSettDate(true);
      }
      if (fix.hasHandlInst()) {
        builder.setHandlInst(fix.getHandlInst());
        presenceBuilder.setHandlInst(true);
      }
      if (fix.hasExecInst()) {
        builder.setExecInst(fix.getExecInst());
        presenceBuilder.setExecInst(true);
      }
      if (fix.hasMinQty()) {
        builder.setMinQty(fix.getMinQty());
        presenceBuilder.setMinQty(true);
      }
      if (fix.hasMaxFloor()) {
        builder.setMaxFloor(fix.getMaxFloor());
        presenceBuilder.setMaxFloor(true);
      }
      if (fix.hasExDestination()) {
        builder.setExDestination(fix.getExDestination());
        presenceBuilder.setExDestination(true);
      }
      if (fix.hasSymbol()) {
        builder.setSymbol(fix.getSymbol());
        presenceBuilder.setSymbol(true);
      }
      if (fix.hasSymbolSfx()) {
        builder.setSymbolSfx(fix.getSymbolSfx());
        presenceBuilder.setSymbolSfx(true);
      }
      if (fix.hasSecurityId()) {
        builder.setSecurityId(fix.getSecurityId());
        presenceBuilder.setSecurityId(true);
      }
      if (fix.hasIdSource()) {
        builder.setIdSource(fix.getIdSource());
        presenceBuilder.setIdSource(true);
      }
      if (fix.hasSecurityType()) {
        builder.setSecurityType(fix.getSecurityType());
        presenceBuilder.setSecurityType(true);
      }
      if (fix.hasMaturityMonthYear()) {
        builder.setMaturityMonthYear(fix.getMaturityMonthYear());
        presenceBuilder.setMaturityMonthYear(true);
      }
      if (fix.hasMaturityDay()) {
        builder.setMaturityDay(fix.getMaturityDay());
        presenceBuilder.setMaturityDay(true);
      }
      if (fix.hasPutOrCall()) {
        builder.setPutOrCall(fix.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (fix.hasStrikePrice()) {
        builder.setStrikePrice(fix.getStrikePrice());
        presenceBuilder.setStrikePrice(true);
      }
      if (fix.hasOptAttribute()) {
        builder.setOptAttribute(fix.getOptAttribute());
        presenceBuilder.setOptAttribute(true);
      }
      if (fix.hasContractMultiplier()) {
        builder.setContractMultiplier(fix.getContractMultiplier());
        presenceBuilder.setContractMultiplier(true);
      }
      if (fix.hasCouponRate()) {
        builder.setCouponRate(fix.getCouponRate());
        presenceBuilder.setCouponRate(true);
      }
      if (fix.hasSecurityExchange()) {
        builder.setSecurityExchange(fix.getSecurityExchange());
        presenceBuilder.setSecurityExchange(true);
      }
      if (fix.hasIssuer()) {
        builder.setIssuer(fix.getIssuer());
        presenceBuilder.setIssuer(true);
      }
      if (fix.hasEncodedIssuerLen()) {
        builder.setEncodedIssuerLen(fix.getEncodedIssuerLen());
        presenceBuilder.setEncodedIssuerLen(true);
      }
      if (fix.hasEncodedIssuer()) {
        builder.setEncodedIssuer(fix.getEncodedIssuer());
        presenceBuilder.setEncodedIssuer(true);
      }
      if (fix.hasSecurityDesc()) {
        builder.setSecurityDesc(fix.getSecurityDesc());
        presenceBuilder.setSecurityDesc(true);
      }
      if (fix.hasEncodedSecurityDescLen()) {
        builder.setEncodedSecurityDescLen(fix.getEncodedSecurityDescLen());
        presenceBuilder.setEncodedSecurityDescLen(true);
      }
      if (fix.hasEncodedSecurityDesc()) {
        builder.setEncodedSecurityDesc(fix.getEncodedSecurityDesc());
        presenceBuilder.setEncodedSecurityDesc(true);
      }
      if (fix.hasSide()) {
        builder.setSide(fix.getSide());
        presenceBuilder.setSide(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasOrderQty()) {
        builder.setOrderQty(fix.getOrderQty());
        presenceBuilder.setOrderQty(true);
      }
      if (fix.hasCashOrderQty()) {
        builder.setCashOrderQty(fix.getCashOrderQty());
        presenceBuilder.setCashOrderQty(true);
      }
      if (fix.hasOrdType()) {
        builder.setOrdType(fix.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (fix.hasPrice()) {
        builder.setPrice(fix.getPrice());
        presenceBuilder.setPrice(true);
      }
      if (fix.hasStopPx()) {
        builder.setStopPx(fix.getStopPx());
        presenceBuilder.setStopPx(true);
      }
      if (fix.hasPegDifference()) {
        builder.setPegDifference(fix.getPegDifference());
        presenceBuilder.setPegDifference(true);
      }
      if (fix.hasDiscretionInst()) {
        builder.setDiscretionInst(fix.getDiscretionInst());
        presenceBuilder.setDiscretionInst(true);
      }
      if (fix.hasDiscretionOffset()) {
        builder.setDiscretionOffset(fix.getDiscretionOffset());
        presenceBuilder.setDiscretionOffset(true);
      }
      if (fix.hasComplianceId()) {
        builder.setComplianceId(fix.getComplianceId());
        presenceBuilder.setComplianceId(true);
      }
      if (fix.hasSolicitedFlag()) {
        builder.setSolicitedFlag(fix.getSolicitedFlag());
        presenceBuilder.setSolicitedFlag(true);
      }
      if (fix.hasCurrency()) {
        builder.setCurrency(fix.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (fix.hasTimeInForce()) {
        builder.setTimeInForce(fix.getTimeInForce());
        presenceBuilder.setTimeInForce(true);
      }
      if (fix.hasEffectiveTime()) {
        builder.setEffectiveTime(fix.getEffectiveTime());
        presenceBuilder.setEffectiveTime(true);
      }
      if (fix.hasExpireDate()) {
        builder.setExpireDate(fix.getExpireDate());
        presenceBuilder.setExpireDate(true);
      }
      if (fix.hasExpireTime()) {
        builder.setExpireTime(fix.getExpireTime());
        presenceBuilder.setExpireTime(true);
      }
      if (fix.hasGtBookingInst()) {
        builder.setGtBookingInst(fix.getGtBookingInst());
        presenceBuilder.setGtBookingInst(true);
      }
      if (fix.hasCommission()) {
        builder.setCommission(fix.getCommission());
        presenceBuilder.setCommission(true);
      }
      if (fix.hasCommType()) {
        builder.setCommType(fix.getCommType());
        presenceBuilder.setCommType(true);
      }
      if (fix.hasRule80A()) {
        builder.setRule80A(fix.getRule80A());
        presenceBuilder.setRule80A(true);
      }
      if (fix.hasForexReq()) {
        builder.setForexReq(fix.getForexReq());
        presenceBuilder.setForexReq(true);
      }
      if (fix.hasSettlCurrency()) {
        builder.setSettlCurrency(fix.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
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
      if (fix.hasFutSettDate2()) {
        builder.setFutSettDate2(fix.getFutSettDate2());
        presenceBuilder.setFutSettDate2(true);
      }
      if (fix.hasOrderQty2()) {
        builder.setOrderQty2(fix.getOrderQty2());
        presenceBuilder.setOrderQty2(true);
      }
      if (fix.hasOpenClose()) {
        builder.setOpenClose(fix.getOpenClose());
        presenceBuilder.setOpenClose(true);
      }
      if (fix.hasCoveredOrUncovered()) {
        builder.setCoveredOrUncovered(fix.getCoveredOrUncovered());
        presenceBuilder.setCoveredOrUncovered(true);
      }
      if (fix.hasCustomerOrFirm()) {
        builder.setCustomerOrFirm(fix.getCustomerOrFirm());
        presenceBuilder.setCustomerOrFirm(true);
      }
      if (fix.hasMaxShow()) {
        builder.setMaxShow(fix.getMaxShow());
        presenceBuilder.setMaxShow(true);
      }
      if (fix.hasLocateReqd()) {
        builder.setLocateReqd(fix.getLocateReqd());
        presenceBuilder.setLocateReqd(true);
      }
      if (fix.hasClearingFirm()) {
        builder.setClearingFirm(fix.getClearingFirm());
        presenceBuilder.setClearingFirm(true);
      }
      if (fix.hasClearingAccount()) {
        builder.setClearingAccount(fix.getClearingAccount());
        presenceBuilder.setClearingAccount(true);
      }
      final int noAllocsGroupCount = fix.getGroupCount(78);
      for (int i = 1; i <= noAllocsGroupCount; i++) {
        final OrderCancelReplaceRequest.NoAllocs group = new OrderCancelReplaceRequest.NoAllocs();
        fix.getGroup(i, group);
        builder.addNoAllocs(group.toBuilder().build());
      }

      final int noTradingSessionsGroupCount = fix.getGroupCount(386);
      for (int i = 1; i <= noTradingSessionsGroupCount; i++) {
        final OrderCancelReplaceRequest.NoTradingSessions group =
            new OrderCancelReplaceRequest.NoTradingSessions();
        fix.getGroup(i, group);
        builder.addNoTradingSessions(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("orderCancelReplaceRequest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest,
      garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest fix =
          new garden_leave.gateway.transform.fix42.OrderCancelReplaceRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.OrderCancelReplaceRequest
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getOrderId()) {
        fix.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getClientId()) {
        fix.setClientId(proto.getClientId());
      }
      if (fieldPresence.getExecBroker()) {
        fix.setExecBroker(proto.getExecBroker());
      }
      if (fieldPresence.getOrigClOrdId()) {
        fix.setOrigClOrdId(proto.getOrigClOrdId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getAccount()) {
        fix.setAccount(proto.getAccount());
      }
      if (fieldPresence.getSettlmntTyp()) {
        fix.setSettlmntTyp(proto.getSettlmntTyp());
      }
      if (fieldPresence.getFutSettDate()) {
        fix.setFutSettDate(proto.getFutSettDate());
      }
      if (fieldPresence.getHandlInst()) {
        fix.setHandlInst(proto.getHandlInst());
      }
      if (fieldPresence.getExecInst()) {
        fix.setExecInst(proto.getExecInst());
      }
      if (fieldPresence.getMinQty()) {
        fix.setMinQty(proto.getMinQty());
      }
      if (fieldPresence.getMaxFloor()) {
        fix.setMaxFloor(proto.getMaxFloor());
      }
      if (fieldPresence.getExDestination()) {
        fix.setExDestination(proto.getExDestination());
      }
      if (fieldPresence.getSymbol()) {
        fix.setSymbol(proto.getSymbol());
      }
      if (fieldPresence.getSymbolSfx()) {
        fix.setSymbolSfx(proto.getSymbolSfx());
      }
      if (fieldPresence.getSecurityId()) {
        fix.setSecurityId(proto.getSecurityId());
      }
      if (fieldPresence.getIdSource()) {
        fix.setIdSource(proto.getIdSource());
      }
      if (fieldPresence.getSecurityType()) {
        fix.setSecurityType(proto.getSecurityType());
      }
      if (fieldPresence.getMaturityMonthYear()) {
        fix.setMaturityMonthYear(proto.getMaturityMonthYear());
      }
      if (fieldPresence.getMaturityDay()) {
        fix.setMaturityDay(proto.getMaturityDay());
      }
      if (fieldPresence.getPutOrCall()) {
        fix.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getStrikePrice()) {
        fix.setStrikePrice(proto.getStrikePrice());
      }
      if (fieldPresence.getOptAttribute()) {
        fix.setOptAttribute(proto.getOptAttribute());
      }
      if (fieldPresence.getContractMultiplier()) {
        fix.setContractMultiplier(proto.getContractMultiplier());
      }
      if (fieldPresence.getCouponRate()) {
        fix.setCouponRate(proto.getCouponRate());
      }
      if (fieldPresence.getSecurityExchange()) {
        fix.setSecurityExchange(proto.getSecurityExchange());
      }
      if (fieldPresence.getIssuer()) {
        fix.setIssuer(proto.getIssuer());
      }
      if (fieldPresence.getEncodedIssuerLen()) {
        fix.setEncodedIssuerLen(proto.getEncodedIssuerLen());
      }
      if (fieldPresence.getEncodedIssuer()) {
        fix.setEncodedIssuer(proto.getEncodedIssuer());
      }
      if (fieldPresence.getSecurityDesc()) {
        fix.setSecurityDesc(proto.getSecurityDesc());
      }
      if (fieldPresence.getEncodedSecurityDescLen()) {
        fix.setEncodedSecurityDescLen(proto.getEncodedSecurityDescLen());
      }
      if (fieldPresence.getEncodedSecurityDesc()) {
        fix.setEncodedSecurityDesc(proto.getEncodedSecurityDesc());
      }
      if (fieldPresence.getSide()) {
        fix.setSide(proto.getSide());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getOrderQty()) {
        fix.setOrderQty(proto.getOrderQty());
      }
      if (fieldPresence.getCashOrderQty()) {
        fix.setCashOrderQty(proto.getCashOrderQty());
      }
      if (fieldPresence.getOrdType()) {
        fix.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getPrice()) {
        fix.setPrice(proto.getPrice());
      }
      if (fieldPresence.getStopPx()) {
        fix.setStopPx(proto.getStopPx());
      }
      if (fieldPresence.getPegDifference()) {
        fix.setPegDifference(proto.getPegDifference());
      }
      if (fieldPresence.getDiscretionInst()) {
        fix.setDiscretionInst(proto.getDiscretionInst());
      }
      if (fieldPresence.getDiscretionOffset()) {
        fix.setDiscretionOffset(proto.getDiscretionOffset());
      }
      if (fieldPresence.getComplianceId()) {
        fix.setComplianceId(proto.getComplianceId());
      }
      if (fieldPresence.getSolicitedFlag()) {
        fix.setSolicitedFlag(proto.getSolicitedFlag());
      }
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getTimeInForce()) {
        fix.setTimeInForce(proto.getTimeInForce());
      }
      if (fieldPresence.getEffectiveTime()) {
        fix.setEffectiveTime(proto.getEffectiveTime());
      }
      if (fieldPresence.getExpireDate()) {
        fix.setExpireDate(proto.getExpireDate());
      }
      if (fieldPresence.getExpireTime()) {
        fix.setExpireTime(proto.getExpireTime());
      }
      if (fieldPresence.getGtBookingInst()) {
        fix.setGtBookingInst(proto.getGtBookingInst());
      }
      if (fieldPresence.getCommission()) {
        fix.setCommission(proto.getCommission());
      }
      if (fieldPresence.getCommType()) {
        fix.setCommType(proto.getCommType());
      }
      if (fieldPresence.getRule80A()) {
        fix.setRule80A(proto.getRule80A());
      }
      if (fieldPresence.getForexReq()) {
        fix.setForexReq(proto.getForexReq());
      }
      if (fieldPresence.getSettlCurrency()) {
        fix.setSettlCurrency(proto.getSettlCurrency());
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
      if (fieldPresence.getFutSettDate2()) {
        fix.setFutSettDate2(proto.getFutSettDate2());
      }
      if (fieldPresence.getOrderQty2()) {
        fix.setOrderQty2(proto.getOrderQty2());
      }
      if (fieldPresence.getOpenClose()) {
        fix.setOpenClose(proto.getOpenClose());
      }
      if (fieldPresence.getCoveredOrUncovered()) {
        fix.setCoveredOrUncovered(proto.getCoveredOrUncovered());
      }
      if (fieldPresence.getCustomerOrFirm()) {
        fix.setCustomerOrFirm(proto.getCustomerOrFirm());
      }
      if (fieldPresence.getMaxShow()) {
        fix.setMaxShow(proto.getMaxShow());
      }
      if (fieldPresence.getLocateReqd()) {
        fix.setLocateReqd(proto.getLocateReqd());
      }
      if (fieldPresence.getClearingFirm()) {
        fix.setClearingFirm(proto.getClearingFirm());
      }
      if (fieldPresence.getClearingAccount()) {
        fix.setClearingAccount(proto.getClearingAccount());
      }
      for (int i = 0; i < proto.getNoAllocsCount(); i++) {
        final OrderCancelReplaceRequest.NoAllocs group = new OrderCancelReplaceRequest.NoAllocs();
        group.fromProto(proto.getNoAllocs(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoTradingSessionsCount(); i++) {
        final OrderCancelReplaceRequest.NoTradingSessions group =
            new OrderCancelReplaceRequest.NoTradingSessions();
        group.fromProto(proto.getNoTradingSessions(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
