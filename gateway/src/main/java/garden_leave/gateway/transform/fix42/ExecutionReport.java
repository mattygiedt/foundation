package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.482030
//

public final class ExecutionReport extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(ExecutionReport.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(ExecutionReport.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public ExecutionReport setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "8";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoContraBrokers extends quickfix.Group {
    private final quickfix.StringField contraBrokerField = FieldFactory.newStringField(375);
    public boolean hasContraBroker() throws quickfix.FieldNotFound {
      return isSetField(375);
    }
    public String getContraBroker() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraBrokerField));
    }
    public NoContraBrokers setContraBroker(final String value) {
      setField(FieldValue.to(contraBrokerField, value));
      return this;
    }
    public NoContraBrokers setContraBroker(final quickfix.field.ContraBroker value) {
      setField(FieldValue.to(contraBrokerField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField contraTraderField = FieldFactory.newStringField(337);
    public boolean hasContraTrader() throws quickfix.FieldNotFound {
      return isSetField(337);
    }
    public String getContraTrader() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTraderField));
    }
    public NoContraBrokers setContraTrader(final String value) {
      setField(FieldValue.to(contraTraderField, value));
      return this;
    }
    public NoContraBrokers setContraTrader(final quickfix.field.ContraTrader value) {
      setField(FieldValue.to(contraTraderField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField contraTradeQtyField = FieldFactory.newDoubleField(437);
    public boolean hasContraTradeQty() throws quickfix.FieldNotFound {
      return isSetField(437);
    }
    public double getContraTradeQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTradeQtyField));
    }
    public NoContraBrokers setContraTradeQty(final double value) {
      setField(FieldValue.to(contraTradeQtyField, value));
      return this;
    }
    public NoContraBrokers setContraTradeQty(final quickfix.field.ContraTradeQty value) {
      setField(FieldValue.to(contraTradeQtyField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeStampField contraTradeTimeField =
        FieldFactory.newTimeStampField(438);
    public boolean hasContraTradeTime() throws quickfix.FieldNotFound {
      return isSetField(438);
    }
    public long getContraTradeTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTradeTimeField));
    }
    public NoContraBrokers setContraTradeTime(final long value) {
      setField(FieldValue.to(contraTradeTimeField, value));
      return this;
    }
    public NoContraBrokers setContraTradeTime(final quickfix.field.ContraTradeTime value) {
      setField(FieldValue.to(contraTradeTimeField, FieldValue.of(value)));
      return this;
    }

    public NoContraBrokers() {
      super(382, 375, new int[] {375, 337, 437, 438, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers proto) {
      final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getContraBroker()) {
        this.setContraBroker(proto.getContraBroker());
      }
      if (fieldPresence.getContraTrader()) {
        this.setContraTrader(proto.getContraTrader());
      }
      if (fieldPresence.getContraTradeQty()) {
        this.setContraTradeQty(proto.getContraTradeQty());
      }
      if (fieldPresence.getContraTradeTime()) {
        this.setContraTradeTime(proto.getContraTradeTime());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers.Builder builder =
          garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.NoContraBrokers.FieldPresence
          .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.ExecutionReport
                                         .NoContraBrokers.FieldPresence.newBuilder();

      if (this.hasContraBroker()) {
        builder.setContraBroker(this.getContraBroker());
        presenceBuilder.setContraBroker(true);
      }
      if (this.hasContraTrader()) {
        builder.setContraTrader(this.getContraTrader());
        presenceBuilder.setContraTrader(true);
      }
      if (this.hasContraTradeQty()) {
        builder.setContraTradeQty(this.getContraTradeQty());
        presenceBuilder.setContraTradeQty(true);
      }
      if (this.hasContraTradeTime()) {
        builder.setContraTradeTime(this.getContraTradeTime());
        presenceBuilder.setContraTradeTime(true);
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
  public ExecutionReport setOrderId(final String value) {
    setField(FieldValue.to(orderIdField, value));
    return this;
  }
  public ExecutionReport setOrderId(final quickfix.field.OrderID value) {
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
  public ExecutionReport setSecondaryOrderId(final String value) {
    setField(FieldValue.to(secondaryOrderIdField, value));
    return this;
  }
  public ExecutionReport setSecondaryOrderId(final quickfix.field.SecondaryOrderID value) {
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
  public ExecutionReport setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public ExecutionReport setClOrdId(final quickfix.field.ClOrdID value) {
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
  public ExecutionReport setOrigClOrdId(final String value) {
    setField(FieldValue.to(origClOrdIdField, value));
    return this;
  }
  public ExecutionReport setOrigClOrdId(final quickfix.field.OrigClOrdID value) {
    setField(FieldValue.to(origClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clientIdField = FieldFactory.newStringField(109);
  public boolean hasClientId() throws quickfix.FieldNotFound {
    return isSetField(109);
  }
  public String getClientId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clientIdField));
  }
  public ExecutionReport setClientId(final String value) {
    setField(FieldValue.to(clientIdField, value));
    return this;
  }
  public ExecutionReport setClientId(final quickfix.field.ClientID value) {
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
  public ExecutionReport setExecBroker(final String value) {
    setField(FieldValue.to(execBrokerField, value));
    return this;
  }
  public ExecutionReport setExecBroker(final quickfix.field.ExecBroker value) {
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
  public ExecutionReport setListId(final String value) {
    setField(FieldValue.to(listIdField, value));
    return this;
  }
  public ExecutionReport setListId(final quickfix.field.ListID value) {
    setField(FieldValue.to(listIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execIdField = FieldFactory.newStringField(17);
  public boolean hasExecId() throws quickfix.FieldNotFound {
    return isSetField(17);
  }
  public String getExecId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execIdField));
  }
  public ExecutionReport setExecId(final String value) {
    setField(FieldValue.to(execIdField, value));
    return this;
  }
  public ExecutionReport setExecId(final quickfix.field.ExecID value) {
    setField(FieldValue.to(execIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField execTransTypeField = FieldFactory.newCharField(20);
  public boolean hasExecTransType() throws quickfix.FieldNotFound {
    return isSetField(20);
  }
  public int getExecTransType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execTransTypeField));
  }
  public ExecutionReport setExecTransType(final int value) {
    setField(FieldValue.to(execTransTypeField, value));
    return this;
  }
  public ExecutionReport setExecTransType(final char value) {
    setField(FieldValue.to(execTransTypeField, value));
    return this;
  }
  public ExecutionReport setExecTransType(final String value) {
    setField(FieldValue.to(execTransTypeField, value));
    return this;
  }
  public ExecutionReport setExecTransType(final quickfix.field.ExecTransType value) {
    setField(FieldValue.to(execTransTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execRefIdField = FieldFactory.newStringField(19);
  public boolean hasExecRefId() throws quickfix.FieldNotFound {
    return isSetField(19);
  }
  public String getExecRefId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execRefIdField));
  }
  public ExecutionReport setExecRefId(final String value) {
    setField(FieldValue.to(execRefIdField, value));
    return this;
  }
  public ExecutionReport setExecRefId(final quickfix.field.ExecRefID value) {
    setField(FieldValue.to(execRefIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField execTypeField = FieldFactory.newCharField(150);
  public boolean hasExecType() throws quickfix.FieldNotFound {
    return isSetField(150);
  }
  public int getExecType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execTypeField));
  }
  public ExecutionReport setExecType(final int value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final char value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final String value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final quickfix.field.ExecType value) {
    setField(FieldValue.to(execTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordStatusField = FieldFactory.newCharField(39);
  public boolean hasOrdStatus() throws quickfix.FieldNotFound {
    return isSetField(39);
  }
  public int getOrdStatus() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordStatusField));
  }
  public ExecutionReport setOrdStatus(final int value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final char value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final String value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final quickfix.field.OrdStatus value) {
    setField(FieldValue.to(ordStatusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField ordRejReasonField = FieldFactory.newIntField(103);
  public boolean hasOrdRejReason() throws quickfix.FieldNotFound {
    return isSetField(103);
  }
  public int getOrdRejReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordRejReasonField));
  }
  public ExecutionReport setOrdRejReason(final int value) {
    setField(FieldValue.to(ordRejReasonField, value));
    return this;
  }
  public ExecutionReport setOrdRejReason(final quickfix.field.OrdRejReason value) {
    setField(FieldValue.to(ordRejReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField execRestatementReasonField = FieldFactory.newIntField(378);
  public boolean hasExecRestatementReason() throws quickfix.FieldNotFound {
    return isSetField(378);
  }
  public int getExecRestatementReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execRestatementReasonField));
  }
  public ExecutionReport setExecRestatementReason(final int value) {
    setField(FieldValue.to(execRestatementReasonField, value));
    return this;
  }
  public ExecutionReport setExecRestatementReason(
      final quickfix.field.ExecRestatementReason value) {
    setField(FieldValue.to(execRestatementReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField accountField = FieldFactory.newStringField(1);
  public boolean hasAccount() throws quickfix.FieldNotFound {
    return isSetField(1);
  }
  public String getAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountField));
  }
  public ExecutionReport setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public ExecutionReport setAccount(final quickfix.field.Account value) {
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
  public ExecutionReport setSettlmntTyp(final int value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public ExecutionReport setSettlmntTyp(final char value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public ExecutionReport setSettlmntTyp(final String value) {
    setField(FieldValue.to(settlmntTypField, value));
    return this;
  }
  public ExecutionReport setSettlmntTyp(final quickfix.field.SettlmntTyp value) {
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
  public ExecutionReport setFutSettDate(final String value) {
    setField(FieldValue.to(futSettDateField, value));
    return this;
  }
  public ExecutionReport setFutSettDate(final quickfix.field.FutSettDate value) {
    setField(FieldValue.to(futSettDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public ExecutionReport setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public ExecutionReport setSymbol(final quickfix.field.Symbol value) {
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
  public ExecutionReport setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public ExecutionReport setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public ExecutionReport setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public ExecutionReport setSecurityId(final quickfix.field.SecurityID value) {
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
  public ExecutionReport setIdSource(final String value) {
    setField(FieldValue.to(idSourceField, value));
    return this;
  }
  public ExecutionReport setIdSource(final quickfix.field.IDSource value) {
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
  public ExecutionReport setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public ExecutionReport setSecurityType(final quickfix.field.SecurityType value) {
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
  public ExecutionReport setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public ExecutionReport setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public ExecutionReport setMaturityDay(final int value) {
    setField(FieldValue.to(maturityDayField, value));
    return this;
  }
  public ExecutionReport setMaturityDay(final quickfix.field.MaturityDay value) {
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
  public ExecutionReport setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public ExecutionReport setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public ExecutionReport setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public ExecutionReport setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public ExecutionReport setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public ExecutionReport setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public ExecutionReport setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public ExecutionReport setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public ExecutionReport setCouponRate(final quickfix.field.CouponRate value) {
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
  public ExecutionReport setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public ExecutionReport setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public ExecutionReport setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public ExecutionReport setIssuer(final quickfix.field.Issuer value) {
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
  public ExecutionReport setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public ExecutionReport setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public ExecutionReport setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public ExecutionReport setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public ExecutionReport setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public ExecutionReport setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public ExecutionReport setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public ExecutionReport setEncodedSecurityDescLen(
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
  public ExecutionReport setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public ExecutionReport setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
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
  public ExecutionReport setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final quickfix.field.Side value) {
    setField(FieldValue.to(sideField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField orderQtyField = FieldFactory.newDoubleField(38);
  public boolean hasOrderQty() throws quickfix.FieldNotFound {
    return isSetField(38);
  }
  public double getOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderQtyField));
  }
  public ExecutionReport setOrderQty(final double value) {
    setField(FieldValue.to(orderQtyField, value));
    return this;
  }
  public ExecutionReport setOrderQty(final quickfix.field.OrderQty value) {
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
  public ExecutionReport setCashOrderQty(final double value) {
    setField(FieldValue.to(cashOrderQtyField, value));
    return this;
  }
  public ExecutionReport setCashOrderQty(final quickfix.field.CashOrderQty value) {
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
  public ExecutionReport setOrdType(final int value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final char value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final String value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final quickfix.field.OrdType value) {
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
  public ExecutionReport setPrice(final double value) {
    setField(FieldValue.to(priceField, value));
    return this;
  }
  public ExecutionReport setPrice(final quickfix.field.Price value) {
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
  public ExecutionReport setStopPx(final double value) {
    setField(FieldValue.to(stopPxField, value));
    return this;
  }
  public ExecutionReport setStopPx(final quickfix.field.StopPx value) {
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
  public ExecutionReport setPegDifference(final double value) {
    setField(FieldValue.to(pegDifferenceField, value));
    return this;
  }
  public ExecutionReport setPegDifference(final quickfix.field.PegDifference value) {
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
  public ExecutionReport setDiscretionInst(final int value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final char value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final String value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final quickfix.field.DiscretionInst value) {
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
  public ExecutionReport setDiscretionOffset(final double value) {
    setField(FieldValue.to(discretionOffsetField, value));
    return this;
  }
  public ExecutionReport setDiscretionOffset(final quickfix.field.DiscretionOffset value) {
    setField(FieldValue.to(discretionOffsetField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public ExecutionReport setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public ExecutionReport setCurrency(final quickfix.field.Currency value) {
    setField(FieldValue.to(currencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField complianceIdField = FieldFactory.newStringField(376);
  public boolean hasComplianceId() throws quickfix.FieldNotFound {
    return isSetField(376);
  }
  public String getComplianceId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(complianceIdField));
  }
  public ExecutionReport setComplianceId(final String value) {
    setField(FieldValue.to(complianceIdField, value));
    return this;
  }
  public ExecutionReport setComplianceId(final quickfix.field.ComplianceID value) {
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
  public ExecutionReport setSolicitedFlag(final boolean value) {
    setField(FieldValue.to(solicitedFlagField, value));
    return this;
  }
  public ExecutionReport setSolicitedFlag(final quickfix.field.SolicitedFlag value) {
    setField(FieldValue.to(solicitedFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField timeInForceField = FieldFactory.newCharField(59);
  public boolean hasTimeInForce() throws quickfix.FieldNotFound {
    return isSetField(59);
  }
  public int getTimeInForce() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeInForceField));
  }
  public ExecutionReport setTimeInForce(final int value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final char value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final String value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final quickfix.field.TimeInForce value) {
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
  public ExecutionReport setEffectiveTime(final long value) {
    setField(FieldValue.to(effectiveTimeField, value));
    return this;
  }
  public ExecutionReport setEffectiveTime(final quickfix.field.EffectiveTime value) {
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
  public ExecutionReport setExpireDate(final String value) {
    setField(FieldValue.to(expireDateField, value));
    return this;
  }
  public ExecutionReport setExpireDate(final quickfix.field.ExpireDate value) {
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
  public ExecutionReport setExpireTime(final long value) {
    setField(FieldValue.to(expireTimeField, value));
    return this;
  }
  public ExecutionReport setExpireTime(final quickfix.field.ExpireTime value) {
    setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execInstField = FieldFactory.newStringField(18);
  public boolean hasExecInst() throws quickfix.FieldNotFound {
    return isSetField(18);
  }
  public String getExecInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execInstField));
  }
  public ExecutionReport setExecInst(final String value) {
    setField(FieldValue.to(execInstField, value));
    return this;
  }
  public ExecutionReport setExecInst(final quickfix.field.ExecInst value) {
    setField(FieldValue.to(execInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField rule80AField = FieldFactory.newCharField(47);
  public boolean hasRule80A() throws quickfix.FieldNotFound {
    return isSetField(47);
  }
  public int getRule80A() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(rule80AField));
  }
  public ExecutionReport setRule80A(final int value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public ExecutionReport setRule80A(final char value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public ExecutionReport setRule80A(final String value) {
    setField(FieldValue.to(rule80AField, value));
    return this;
  }
  public ExecutionReport setRule80A(final quickfix.field.Rule80A value) {
    setField(FieldValue.to(rule80AField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastSharesField = FieldFactory.newDoubleField(32);
  public boolean hasLastShares() throws quickfix.FieldNotFound {
    return isSetField(32);
  }
  public double getLastShares() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastSharesField));
  }
  public ExecutionReport setLastShares(final double value) {
    setField(FieldValue.to(lastSharesField, value));
    return this;
  }
  public ExecutionReport setLastShares(final quickfix.field.LastShares value) {
    setField(FieldValue.to(lastSharesField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastPxField = FieldFactory.newDoubleField(31);
  public boolean hasLastPx() throws quickfix.FieldNotFound {
    return isSetField(31);
  }
  public double getLastPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastPxField));
  }
  public ExecutionReport setLastPx(final double value) {
    setField(FieldValue.to(lastPxField, value));
    return this;
  }
  public ExecutionReport setLastPx(final quickfix.field.LastPx value) {
    setField(FieldValue.to(lastPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastSpotRateField = FieldFactory.newDoubleField(194);
  public boolean hasLastSpotRate() throws quickfix.FieldNotFound {
    return isSetField(194);
  }
  public double getLastSpotRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastSpotRateField));
  }
  public ExecutionReport setLastSpotRate(final double value) {
    setField(FieldValue.to(lastSpotRateField, value));
    return this;
  }
  public ExecutionReport setLastSpotRate(final quickfix.field.LastSpotRate value) {
    setField(FieldValue.to(lastSpotRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastForwardPointsField = FieldFactory.newDoubleField(195);
  public boolean hasLastForwardPoints() throws quickfix.FieldNotFound {
    return isSetField(195);
  }
  public double getLastForwardPoints() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastForwardPointsField));
  }
  public ExecutionReport setLastForwardPoints(final double value) {
    setField(FieldValue.to(lastForwardPointsField, value));
    return this;
  }
  public ExecutionReport setLastForwardPoints(final quickfix.field.LastForwardPoints value) {
    setField(FieldValue.to(lastForwardPointsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField lastMktField = FieldFactory.newStringField(30);
  public boolean hasLastMkt() throws quickfix.FieldNotFound {
    return isSetField(30);
  }
  public String getLastMkt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastMktField));
  }
  public ExecutionReport setLastMkt(final String value) {
    setField(FieldValue.to(lastMktField, value));
    return this;
  }
  public ExecutionReport setLastMkt(final quickfix.field.LastMkt value) {
    setField(FieldValue.to(lastMktField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
  public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
    return isSetField(336);
  }
  public String getTradingSessionId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradingSessionIdField));
  }
  public ExecutionReport setTradingSessionId(final String value) {
    setField(FieldValue.to(tradingSessionIdField, value));
    return this;
  }
  public ExecutionReport setTradingSessionId(final quickfix.field.TradingSessionID value) {
    setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField lastCapacityField = FieldFactory.newCharField(29);
  public boolean hasLastCapacity() throws quickfix.FieldNotFound {
    return isSetField(29);
  }
  public int getLastCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastCapacityField));
  }
  public ExecutionReport setLastCapacity(final int value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final char value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final String value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final quickfix.field.LastCapacity value) {
    setField(FieldValue.to(lastCapacityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField leavesQtyField = FieldFactory.newDoubleField(151);
  public boolean hasLeavesQty() throws quickfix.FieldNotFound {
    return isSetField(151);
  }
  public double getLeavesQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(leavesQtyField));
  }
  public ExecutionReport setLeavesQty(final double value) {
    setField(FieldValue.to(leavesQtyField, value));
    return this;
  }
  public ExecutionReport setLeavesQty(final quickfix.field.LeavesQty value) {
    setField(FieldValue.to(leavesQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField cumQtyField = FieldFactory.newDoubleField(14);
  public boolean hasCumQty() throws quickfix.FieldNotFound {
    return isSetField(14);
  }
  public double getCumQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cumQtyField));
  }
  public ExecutionReport setCumQty(final double value) {
    setField(FieldValue.to(cumQtyField, value));
    return this;
  }
  public ExecutionReport setCumQty(final quickfix.field.CumQty value) {
    setField(FieldValue.to(cumQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField avgPxField = FieldFactory.newDoubleField(6);
  public boolean hasAvgPx() throws quickfix.FieldNotFound {
    return isSetField(6);
  }
  public double getAvgPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(avgPxField));
  }
  public ExecutionReport setAvgPx(final double value) {
    setField(FieldValue.to(avgPxField, value));
    return this;
  }
  public ExecutionReport setAvgPx(final quickfix.field.AvgPx value) {
    setField(FieldValue.to(avgPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayOrderQtyField = FieldFactory.newDoubleField(424);
  public boolean hasDayOrderQty() throws quickfix.FieldNotFound {
    return isSetField(424);
  }
  public double getDayOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayOrderQtyField));
  }
  public ExecutionReport setDayOrderQty(final double value) {
    setField(FieldValue.to(dayOrderQtyField, value));
    return this;
  }
  public ExecutionReport setDayOrderQty(final quickfix.field.DayOrderQty value) {
    setField(FieldValue.to(dayOrderQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayCumQtyField = FieldFactory.newDoubleField(425);
  public boolean hasDayCumQty() throws quickfix.FieldNotFound {
    return isSetField(425);
  }
  public double getDayCumQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayCumQtyField));
  }
  public ExecutionReport setDayCumQty(final double value) {
    setField(FieldValue.to(dayCumQtyField, value));
    return this;
  }
  public ExecutionReport setDayCumQty(final quickfix.field.DayCumQty value) {
    setField(FieldValue.to(dayCumQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayAvgPxField = FieldFactory.newDoubleField(426);
  public boolean hasDayAvgPx() throws quickfix.FieldNotFound {
    return isSetField(426);
  }
  public double getDayAvgPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayAvgPxField));
  }
  public ExecutionReport setDayAvgPx(final double value) {
    setField(FieldValue.to(dayAvgPxField, value));
    return this;
  }
  public ExecutionReport setDayAvgPx(final quickfix.field.DayAvgPx value) {
    setField(FieldValue.to(dayAvgPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField gtBookingInstField = FieldFactory.newIntField(427);
  public boolean hasGtBookingInst() throws quickfix.FieldNotFound {
    return isSetField(427);
  }
  public int getGtBookingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(gtBookingInstField));
  }
  public ExecutionReport setGtBookingInst(final int value) {
    setField(FieldValue.to(gtBookingInstField, value));
    return this;
  }
  public ExecutionReport setGtBookingInst(final quickfix.field.GTBookingInst value) {
    setField(FieldValue.to(gtBookingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeDateField = FieldFactory.newStringField(75);
  public boolean hasTradeDate() throws quickfix.FieldNotFound {
    return isSetField(75);
  }
  public String getTradeDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeDateField));
  }
  public ExecutionReport setTradeDate(final String value) {
    setField(FieldValue.to(tradeDateField, value));
    return this;
  }
  public ExecutionReport setTradeDate(final quickfix.field.TradeDate value) {
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
  public ExecutionReport setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public ExecutionReport setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField reportToExchField = FieldFactory.newBooleanField(113);
  public boolean hasReportToExch() throws quickfix.FieldNotFound {
    return isSetField(113);
  }
  public boolean getReportToExch() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(reportToExchField));
  }
  public ExecutionReport setReportToExch(final boolean value) {
    setField(FieldValue.to(reportToExchField, value));
    return this;
  }
  public ExecutionReport setReportToExch(final quickfix.field.ReportToExch value) {
    setField(FieldValue.to(reportToExchField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField commissionField = FieldFactory.newDoubleField(12);
  public boolean hasCommission() throws quickfix.FieldNotFound {
    return isSetField(12);
  }
  public double getCommission() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commissionField));
  }
  public ExecutionReport setCommission(final double value) {
    setField(FieldValue.to(commissionField, value));
    return this;
  }
  public ExecutionReport setCommission(final quickfix.field.Commission value) {
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
  public ExecutionReport setCommType(final int value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final char value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final String value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final quickfix.field.CommType value) {
    setField(FieldValue.to(commTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField grossTradeAmtField = FieldFactory.newDoubleField(381);
  public boolean hasGrossTradeAmt() throws quickfix.FieldNotFound {
    return isSetField(381);
  }
  public double getGrossTradeAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(grossTradeAmtField));
  }
  public ExecutionReport setGrossTradeAmt(final double value) {
    setField(FieldValue.to(grossTradeAmtField, value));
    return this;
  }
  public ExecutionReport setGrossTradeAmt(final quickfix.field.GrossTradeAmt value) {
    setField(FieldValue.to(grossTradeAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField settlCurrAmtField = FieldFactory.newDoubleField(119);
  public boolean hasSettlCurrAmt() throws quickfix.FieldNotFound {
    return isSetField(119);
  }
  public double getSettlCurrAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrAmtField));
  }
  public ExecutionReport setSettlCurrAmt(final double value) {
    setField(FieldValue.to(settlCurrAmtField, value));
    return this;
  }
  public ExecutionReport setSettlCurrAmt(final quickfix.field.SettlCurrAmt value) {
    setField(FieldValue.to(settlCurrAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
  public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
    return isSetField(120);
  }
  public String getSettlCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrencyField));
  }
  public ExecutionReport setSettlCurrency(final String value) {
    setField(FieldValue.to(settlCurrencyField, value));
    return this;
  }
  public ExecutionReport setSettlCurrency(final quickfix.field.SettlCurrency value) {
    setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField settlCurrFxRateField = FieldFactory.newDoubleField(155);
  public boolean hasSettlCurrFxRate() throws quickfix.FieldNotFound {
    return isSetField(155);
  }
  public double getSettlCurrFxRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrFxRateField));
  }
  public ExecutionReport setSettlCurrFxRate(final double value) {
    setField(FieldValue.to(settlCurrFxRateField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRate(final quickfix.field.SettlCurrFxRate value) {
    setField(FieldValue.to(settlCurrFxRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField settlCurrFxRateCalcField = FieldFactory.newCharField(156);
  public boolean hasSettlCurrFxRateCalc() throws quickfix.FieldNotFound {
    return isSetField(156);
  }
  public int getSettlCurrFxRateCalc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrFxRateCalcField));
  }
  public ExecutionReport setSettlCurrFxRateCalc(final int value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final char value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final String value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final quickfix.field.SettlCurrFxRateCalc value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField handlInstField = FieldFactory.newCharField(21);
  public boolean hasHandlInst() throws quickfix.FieldNotFound {
    return isSetField(21);
  }
  public int getHandlInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(handlInstField));
  }
  public ExecutionReport setHandlInst(final int value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final char value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final String value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final quickfix.field.HandlInst value) {
    setField(FieldValue.to(handlInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
  public boolean hasMinQty() throws quickfix.FieldNotFound {
    return isSetField(110);
  }
  public double getMinQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(minQtyField));
  }
  public ExecutionReport setMinQty(final double value) {
    setField(FieldValue.to(minQtyField, value));
    return this;
  }
  public ExecutionReport setMinQty(final quickfix.field.MinQty value) {
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
  public ExecutionReport setMaxFloor(final double value) {
    setField(FieldValue.to(maxFloorField, value));
    return this;
  }
  public ExecutionReport setMaxFloor(final quickfix.field.MaxFloor value) {
    setField(FieldValue.to(maxFloorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField openCloseField = FieldFactory.newCharField(77);
  public boolean hasOpenClose() throws quickfix.FieldNotFound {
    return isSetField(77);
  }
  public int getOpenClose() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(openCloseField));
  }
  public ExecutionReport setOpenClose(final int value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public ExecutionReport setOpenClose(final char value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public ExecutionReport setOpenClose(final String value) {
    setField(FieldValue.to(openCloseField, value));
    return this;
  }
  public ExecutionReport setOpenClose(final quickfix.field.OpenClose value) {
    setField(FieldValue.to(openCloseField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxShowField = FieldFactory.newDoubleField(210);
  public boolean hasMaxShow() throws quickfix.FieldNotFound {
    return isSetField(210);
  }
  public double getMaxShow() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxShowField));
  }
  public ExecutionReport setMaxShow(final double value) {
    setField(FieldValue.to(maxShowField, value));
    return this;
  }
  public ExecutionReport setMaxShow(final quickfix.field.MaxShow value) {
    setField(FieldValue.to(maxShowField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public ExecutionReport setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public ExecutionReport setText(final quickfix.field.Text value) {
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
  public ExecutionReport setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public ExecutionReport setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public ExecutionReport setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public ExecutionReport setEncodedText(final quickfix.field.EncodedText value) {
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
  public ExecutionReport setFutSettDate2(final String value) {
    setField(FieldValue.to(futSettDate2Field, value));
    return this;
  }
  public ExecutionReport setFutSettDate2(final quickfix.field.FutSettDate2 value) {
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
  public ExecutionReport setOrderQty2(final double value) {
    setField(FieldValue.to(orderQty2Field, value));
    return this;
  }
  public ExecutionReport setOrderQty2(final quickfix.field.OrderQty2 value) {
    setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clearingFirmField = FieldFactory.newStringField(439);
  public boolean hasClearingFirm() throws quickfix.FieldNotFound {
    return isSetField(439);
  }
  public String getClearingFirm() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clearingFirmField));
  }
  public ExecutionReport setClearingFirm(final String value) {
    setField(FieldValue.to(clearingFirmField, value));
    return this;
  }
  public ExecutionReport setClearingFirm(final quickfix.field.ClearingFirm value) {
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
  public ExecutionReport setClearingAccount(final String value) {
    setField(FieldValue.to(clearingAccountField, value));
    return this;
  }
  public ExecutionReport setClearingAccount(final quickfix.field.ClearingAccount value) {
    setField(FieldValue.to(clearingAccountField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField multiLegReportingTypeField = FieldFactory.newCharField(442);
  public boolean hasMultiLegReportingType() throws quickfix.FieldNotFound {
    return isSetField(442);
  }
  public int getMultiLegReportingType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(multiLegReportingTypeField));
  }
  public ExecutionReport setMultiLegReportingType(final int value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(final char value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(final String value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(
      final quickfix.field.MultiLegReportingType value) {
    setField(FieldValue.to(multiLegReportingTypeField, FieldValue.of(value)));
    return this;
  }

  public ExecutionReport() {
    super(new int[] {37, 198, 11, 41, 109, 76, 66, 17, 20, 19, 150, 39, 103, 378, 1, 63, 64, 55, 65,
        48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 54, 38,
        152, 40, 44, 99, 211, 388, 389, 15, 376, 377, 59, 168, 432, 126, 18, 47, 32, 31, 194, 195,
        30, 336, 29, 151, 14, 6, 424, 425, 426, 427, 75, 60, 113, 12, 13, 381, 119, 120, 155, 156,
        21, 110, 111, 77, 210, 58, 354, 355, 193, 192, 439, 440, 442, 0});
  }

  public ExecutionReport(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {37, 198, 11, 41, 109, 76, 66, 17, 20, 19, 150, 39, 103, 378, 1, 63, 64, 55, 65,
        48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 54, 38,
        152, 40, 44, 99, 211, 388, 389, 15, 376, 377, 59, 168, 432, 126, 18, 47, 32, 31, 194, 195,
        30, 336, 29, 151, 14, 6, 424, 425, 426, 427, 75, 60, 113, 12, 13, 381, 119, 120, 155, 156,
        21, 110, 111, 77, 210, 58, 354, 355, 193, 192, 439, 440, 442, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.ExecutionReport,
      garden_leave.fix42.proto.FIX42Protos.ExecutionReport> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.ExecutionReport.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.ExecutionReport.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.ExecutionReport.FieldPresence.newBuilder();

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
      if (fix.hasExecId()) {
        builder.setExecId(fix.getExecId());
        presenceBuilder.setExecId(true);
      }
      if (fix.hasExecTransType()) {
        builder.setExecTransType(fix.getExecTransType());
        presenceBuilder.setExecTransType(true);
      }
      if (fix.hasExecRefId()) {
        builder.setExecRefId(fix.getExecRefId());
        presenceBuilder.setExecRefId(true);
      }
      if (fix.hasExecType()) {
        builder.setExecType(fix.getExecType());
        presenceBuilder.setExecType(true);
      }
      if (fix.hasOrdStatus()) {
        builder.setOrdStatus(fix.getOrdStatus());
        presenceBuilder.setOrdStatus(true);
      }
      if (fix.hasOrdRejReason()) {
        builder.setOrdRejReason(fix.getOrdRejReason());
        presenceBuilder.setOrdRejReason(true);
      }
      if (fix.hasExecRestatementReason()) {
        builder.setExecRestatementReason(fix.getExecRestatementReason());
        presenceBuilder.setExecRestatementReason(true);
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
      if (fix.hasCurrency()) {
        builder.setCurrency(fix.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (fix.hasComplianceId()) {
        builder.setComplianceId(fix.getComplianceId());
        presenceBuilder.setComplianceId(true);
      }
      if (fix.hasSolicitedFlag()) {
        builder.setSolicitedFlag(fix.getSolicitedFlag());
        presenceBuilder.setSolicitedFlag(true);
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
      if (fix.hasExecInst()) {
        builder.setExecInst(fix.getExecInst());
        presenceBuilder.setExecInst(true);
      }
      if (fix.hasRule80A()) {
        builder.setRule80A(fix.getRule80A());
        presenceBuilder.setRule80A(true);
      }
      if (fix.hasLastShares()) {
        builder.setLastShares(fix.getLastShares());
        presenceBuilder.setLastShares(true);
      }
      if (fix.hasLastPx()) {
        builder.setLastPx(fix.getLastPx());
        presenceBuilder.setLastPx(true);
      }
      if (fix.hasLastSpotRate()) {
        builder.setLastSpotRate(fix.getLastSpotRate());
        presenceBuilder.setLastSpotRate(true);
      }
      if (fix.hasLastForwardPoints()) {
        builder.setLastForwardPoints(fix.getLastForwardPoints());
        presenceBuilder.setLastForwardPoints(true);
      }
      if (fix.hasLastMkt()) {
        builder.setLastMkt(fix.getLastMkt());
        presenceBuilder.setLastMkt(true);
      }
      if (fix.hasTradingSessionId()) {
        builder.setTradingSessionId(fix.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (fix.hasLastCapacity()) {
        builder.setLastCapacity(fix.getLastCapacity());
        presenceBuilder.setLastCapacity(true);
      }
      if (fix.hasLeavesQty()) {
        builder.setLeavesQty(fix.getLeavesQty());
        presenceBuilder.setLeavesQty(true);
      }
      if (fix.hasCumQty()) {
        builder.setCumQty(fix.getCumQty());
        presenceBuilder.setCumQty(true);
      }
      if (fix.hasAvgPx()) {
        builder.setAvgPx(fix.getAvgPx());
        presenceBuilder.setAvgPx(true);
      }
      if (fix.hasDayOrderQty()) {
        builder.setDayOrderQty(fix.getDayOrderQty());
        presenceBuilder.setDayOrderQty(true);
      }
      if (fix.hasDayCumQty()) {
        builder.setDayCumQty(fix.getDayCumQty());
        presenceBuilder.setDayCumQty(true);
      }
      if (fix.hasDayAvgPx()) {
        builder.setDayAvgPx(fix.getDayAvgPx());
        presenceBuilder.setDayAvgPx(true);
      }
      if (fix.hasGtBookingInst()) {
        builder.setGtBookingInst(fix.getGtBookingInst());
        presenceBuilder.setGtBookingInst(true);
      }
      if (fix.hasTradeDate()) {
        builder.setTradeDate(fix.getTradeDate());
        presenceBuilder.setTradeDate(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasReportToExch()) {
        builder.setReportToExch(fix.getReportToExch());
        presenceBuilder.setReportToExch(true);
      }
      if (fix.hasCommission()) {
        builder.setCommission(fix.getCommission());
        presenceBuilder.setCommission(true);
      }
      if (fix.hasCommType()) {
        builder.setCommType(fix.getCommType());
        presenceBuilder.setCommType(true);
      }
      if (fix.hasGrossTradeAmt()) {
        builder.setGrossTradeAmt(fix.getGrossTradeAmt());
        presenceBuilder.setGrossTradeAmt(true);
      }
      if (fix.hasSettlCurrAmt()) {
        builder.setSettlCurrAmt(fix.getSettlCurrAmt());
        presenceBuilder.setSettlCurrAmt(true);
      }
      if (fix.hasSettlCurrency()) {
        builder.setSettlCurrency(fix.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
      }
      if (fix.hasSettlCurrFxRate()) {
        builder.setSettlCurrFxRate(fix.getSettlCurrFxRate());
        presenceBuilder.setSettlCurrFxRate(true);
      }
      if (fix.hasSettlCurrFxRateCalc()) {
        builder.setSettlCurrFxRateCalc(fix.getSettlCurrFxRateCalc());
        presenceBuilder.setSettlCurrFxRateCalc(true);
      }
      if (fix.hasHandlInst()) {
        builder.setHandlInst(fix.getHandlInst());
        presenceBuilder.setHandlInst(true);
      }
      if (fix.hasMinQty()) {
        builder.setMinQty(fix.getMinQty());
        presenceBuilder.setMinQty(true);
      }
      if (fix.hasMaxFloor()) {
        builder.setMaxFloor(fix.getMaxFloor());
        presenceBuilder.setMaxFloor(true);
      }
      if (fix.hasOpenClose()) {
        builder.setOpenClose(fix.getOpenClose());
        presenceBuilder.setOpenClose(true);
      }
      if (fix.hasMaxShow()) {
        builder.setMaxShow(fix.getMaxShow());
        presenceBuilder.setMaxShow(true);
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
      if (fix.hasClearingFirm()) {
        builder.setClearingFirm(fix.getClearingFirm());
        presenceBuilder.setClearingFirm(true);
      }
      if (fix.hasClearingAccount()) {
        builder.setClearingAccount(fix.getClearingAccount());
        presenceBuilder.setClearingAccount(true);
      }
      if (fix.hasMultiLegReportingType()) {
        builder.setMultiLegReportingType(fix.getMultiLegReportingType());
        presenceBuilder.setMultiLegReportingType(true);
      }
      final int noContraBrokersGroupCount = fix.getGroupCount(382);
      for (int i = 1; i <= noContraBrokersGroupCount; i++) {
        final ExecutionReport.NoContraBrokers group = new ExecutionReport.NoContraBrokers();
        fix.getGroup(i, group);
        builder.addNoContraBrokers(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("executionReport error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.ExecutionReport,
      garden_leave.gateway.transform.fix42.ExecutionReport> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.ExecutionReport.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.ExecutionReport fix =
          new garden_leave.gateway.transform.fix42.ExecutionReport();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.ExecutionReport.FieldPresence fieldPresence =
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
      if (fieldPresence.getClientId()) {
        fix.setClientId(proto.getClientId());
      }
      if (fieldPresence.getExecBroker()) {
        fix.setExecBroker(proto.getExecBroker());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getExecId()) {
        fix.setExecId(proto.getExecId());
      }
      if (fieldPresence.getExecTransType()) {
        fix.setExecTransType(proto.getExecTransType());
      }
      if (fieldPresence.getExecRefId()) {
        fix.setExecRefId(proto.getExecRefId());
      }
      if (fieldPresence.getExecType()) {
        fix.setExecType(proto.getExecType());
      }
      if (fieldPresence.getOrdStatus()) {
        fix.setOrdStatus(proto.getOrdStatus());
      }
      if (fieldPresence.getOrdRejReason()) {
        fix.setOrdRejReason(proto.getOrdRejReason());
      }
      if (fieldPresence.getExecRestatementReason()) {
        fix.setExecRestatementReason(proto.getExecRestatementReason());
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
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getComplianceId()) {
        fix.setComplianceId(proto.getComplianceId());
      }
      if (fieldPresence.getSolicitedFlag()) {
        fix.setSolicitedFlag(proto.getSolicitedFlag());
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
      if (fieldPresence.getExecInst()) {
        fix.setExecInst(proto.getExecInst());
      }
      if (fieldPresence.getRule80A()) {
        fix.setRule80A(proto.getRule80A());
      }
      if (fieldPresence.getLastShares()) {
        fix.setLastShares(proto.getLastShares());
      }
      if (fieldPresence.getLastPx()) {
        fix.setLastPx(proto.getLastPx());
      }
      if (fieldPresence.getLastSpotRate()) {
        fix.setLastSpotRate(proto.getLastSpotRate());
      }
      if (fieldPresence.getLastForwardPoints()) {
        fix.setLastForwardPoints(proto.getLastForwardPoints());
      }
      if (fieldPresence.getLastMkt()) {
        fix.setLastMkt(proto.getLastMkt());
      }
      if (fieldPresence.getTradingSessionId()) {
        fix.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getLastCapacity()) {
        fix.setLastCapacity(proto.getLastCapacity());
      }
      if (fieldPresence.getLeavesQty()) {
        fix.setLeavesQty(proto.getLeavesQty());
      }
      if (fieldPresence.getCumQty()) {
        fix.setCumQty(proto.getCumQty());
      }
      if (fieldPresence.getAvgPx()) {
        fix.setAvgPx(proto.getAvgPx());
      }
      if (fieldPresence.getDayOrderQty()) {
        fix.setDayOrderQty(proto.getDayOrderQty());
      }
      if (fieldPresence.getDayCumQty()) {
        fix.setDayCumQty(proto.getDayCumQty());
      }
      if (fieldPresence.getDayAvgPx()) {
        fix.setDayAvgPx(proto.getDayAvgPx());
      }
      if (fieldPresence.getGtBookingInst()) {
        fix.setGtBookingInst(proto.getGtBookingInst());
      }
      if (fieldPresence.getTradeDate()) {
        fix.setTradeDate(proto.getTradeDate());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getReportToExch()) {
        fix.setReportToExch(proto.getReportToExch());
      }
      if (fieldPresence.getCommission()) {
        fix.setCommission(proto.getCommission());
      }
      if (fieldPresence.getCommType()) {
        fix.setCommType(proto.getCommType());
      }
      if (fieldPresence.getGrossTradeAmt()) {
        fix.setGrossTradeAmt(proto.getGrossTradeAmt());
      }
      if (fieldPresence.getSettlCurrAmt()) {
        fix.setSettlCurrAmt(proto.getSettlCurrAmt());
      }
      if (fieldPresence.getSettlCurrency()) {
        fix.setSettlCurrency(proto.getSettlCurrency());
      }
      if (fieldPresence.getSettlCurrFxRate()) {
        fix.setSettlCurrFxRate(proto.getSettlCurrFxRate());
      }
      if (fieldPresence.getSettlCurrFxRateCalc()) {
        fix.setSettlCurrFxRateCalc(proto.getSettlCurrFxRateCalc());
      }
      if (fieldPresence.getHandlInst()) {
        fix.setHandlInst(proto.getHandlInst());
      }
      if (fieldPresence.getMinQty()) {
        fix.setMinQty(proto.getMinQty());
      }
      if (fieldPresence.getMaxFloor()) {
        fix.setMaxFloor(proto.getMaxFloor());
      }
      if (fieldPresence.getOpenClose()) {
        fix.setOpenClose(proto.getOpenClose());
      }
      if (fieldPresence.getMaxShow()) {
        fix.setMaxShow(proto.getMaxShow());
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
      if (fieldPresence.getClearingFirm()) {
        fix.setClearingFirm(proto.getClearingFirm());
      }
      if (fieldPresence.getClearingAccount()) {
        fix.setClearingAccount(proto.getClearingAccount());
      }
      if (fieldPresence.getMultiLegReportingType()) {
        fix.setMultiLegReportingType(proto.getMultiLegReportingType());
      }
      for (int i = 0; i < proto.getNoContraBrokersCount(); i++) {
        final ExecutionReport.NoContraBrokers group = new ExecutionReport.NoContraBrokers();
        group.fromProto(proto.getNoContraBrokers(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
