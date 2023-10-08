package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.491534
//

public final class MarketDataIncrementalRefresh extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(MarketDataIncrementalRefresh.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(MarketDataIncrementalRefresh.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public MarketDataIncrementalRefresh setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "X";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoMdEntries extends quickfix.Group {
    private final quickfix.CharField mdUpdateActionField = FieldFactory.newCharField(279);
    public boolean hasMdUpdateAction() throws quickfix.FieldNotFound {
      return isSetField(279);
    }
    public int getMdUpdateAction() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdUpdateActionField));
    }
    public NoMdEntries setMdUpdateAction(final int value) {
      setField(FieldValue.to(mdUpdateActionField, value));
      return this;
    }
    public NoMdEntries setMdUpdateAction(final char value) {
      setField(FieldValue.to(mdUpdateActionField, value));
      return this;
    }
    public NoMdEntries setMdUpdateAction(final String value) {
      setField(FieldValue.to(mdUpdateActionField, value));
      return this;
    }
    public NoMdEntries setMdUpdateAction(final quickfix.field.MDUpdateAction value) {
      setField(FieldValue.to(mdUpdateActionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField deleteReasonField = FieldFactory.newCharField(285);
    public boolean hasDeleteReason() throws quickfix.FieldNotFound {
      return isSetField(285);
    }
    public int getDeleteReason() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deleteReasonField));
    }
    public NoMdEntries setDeleteReason(final int value) {
      setField(FieldValue.to(deleteReasonField, value));
      return this;
    }
    public NoMdEntries setDeleteReason(final char value) {
      setField(FieldValue.to(deleteReasonField, value));
      return this;
    }
    public NoMdEntries setDeleteReason(final String value) {
      setField(FieldValue.to(deleteReasonField, value));
      return this;
    }
    public NoMdEntries setDeleteReason(final quickfix.field.DeleteReason value) {
      setField(FieldValue.to(deleteReasonField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField mdEntryTypeField = FieldFactory.newCharField(269);
    public boolean hasMdEntryType() throws quickfix.FieldNotFound {
      return isSetField(269);
    }
    public int getMdEntryType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryTypeField));
    }
    public NoMdEntries setMdEntryType(final int value) {
      setField(FieldValue.to(mdEntryTypeField, value));
      return this;
    }
    public NoMdEntries setMdEntryType(final char value) {
      setField(FieldValue.to(mdEntryTypeField, value));
      return this;
    }
    public NoMdEntries setMdEntryType(final String value) {
      setField(FieldValue.to(mdEntryTypeField, value));
      return this;
    }
    public NoMdEntries setMdEntryType(final quickfix.field.MDEntryType value) {
      setField(FieldValue.to(mdEntryTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdEntryIdField = FieldFactory.newStringField(278);
    public boolean hasMdEntryId() throws quickfix.FieldNotFound {
      return isSetField(278);
    }
    public String getMdEntryId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryIdField));
    }
    public NoMdEntries setMdEntryId(final String value) {
      setField(FieldValue.to(mdEntryIdField, value));
      return this;
    }
    public NoMdEntries setMdEntryId(final quickfix.field.MDEntryID value) {
      setField(FieldValue.to(mdEntryIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdEntryRefIdField = FieldFactory.newStringField(280);
    public boolean hasMdEntryRefId() throws quickfix.FieldNotFound {
      return isSetField(280);
    }
    public String getMdEntryRefId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryRefIdField));
    }
    public NoMdEntries setMdEntryRefId(final String value) {
      setField(FieldValue.to(mdEntryRefIdField, value));
      return this;
    }
    public NoMdEntries setMdEntryRefId(final quickfix.field.MDEntryRefID value) {
      setField(FieldValue.to(mdEntryRefIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
    public boolean hasSymbol() throws quickfix.FieldNotFound {
      return isSetField(55);
    }
    public String getSymbol() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(symbolField));
    }
    public NoMdEntries setSymbol(final String value) {
      setField(FieldValue.to(symbolField, value));
      return this;
    }
    public NoMdEntries setSymbol(final quickfix.field.Symbol value) {
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
    public NoMdEntries setSymbolSfx(final String value) {
      setField(FieldValue.to(symbolSfxField, value));
      return this;
    }
    public NoMdEntries setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
    public NoMdEntries setSecurityId(final String value) {
      setField(FieldValue.to(securityIdField, value));
      return this;
    }
    public NoMdEntries setSecurityId(final quickfix.field.SecurityID value) {
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
    public NoMdEntries setIdSource(final String value) {
      setField(FieldValue.to(idSourceField, value));
      return this;
    }
    public NoMdEntries setIdSource(final quickfix.field.IDSource value) {
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
    public NoMdEntries setSecurityType(final String value) {
      setField(FieldValue.to(securityTypeField, value));
      return this;
    }
    public NoMdEntries setSecurityType(final quickfix.field.SecurityType value) {
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
    public NoMdEntries setMaturityMonthYear(final String value) {
      setField(FieldValue.to(maturityMonthYearField, value));
      return this;
    }
    public NoMdEntries setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
    public NoMdEntries setMaturityDay(final int value) {
      setField(FieldValue.to(maturityDayField, value));
      return this;
    }
    public NoMdEntries setMaturityDay(final quickfix.field.MaturityDay value) {
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
    public NoMdEntries setPutOrCall(final int value) {
      setField(FieldValue.to(putOrCallField, value));
      return this;
    }
    public NoMdEntries setPutOrCall(final quickfix.field.PutOrCall value) {
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
    public NoMdEntries setStrikePrice(final double value) {
      setField(FieldValue.to(strikePriceField, value));
      return this;
    }
    public NoMdEntries setStrikePrice(final quickfix.field.StrikePrice value) {
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
    public NoMdEntries setOptAttribute(final int value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoMdEntries setOptAttribute(final char value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoMdEntries setOptAttribute(final String value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoMdEntries setOptAttribute(final quickfix.field.OptAttribute value) {
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
    public NoMdEntries setContractMultiplier(final double value) {
      setField(FieldValue.to(contractMultiplierField, value));
      return this;
    }
    public NoMdEntries setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
    public NoMdEntries setCouponRate(final double value) {
      setField(FieldValue.to(couponRateField, value));
      return this;
    }
    public NoMdEntries setCouponRate(final quickfix.field.CouponRate value) {
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
    public NoMdEntries setSecurityExchange(final String value) {
      setField(FieldValue.to(securityExchangeField, value));
      return this;
    }
    public NoMdEntries setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
    public NoMdEntries setIssuer(final String value) {
      setField(FieldValue.to(issuerField, value));
      return this;
    }
    public NoMdEntries setIssuer(final quickfix.field.Issuer value) {
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
    public NoMdEntries setEncodedIssuerLen(final int value) {
      setField(FieldValue.to(encodedIssuerLenField, value));
      return this;
    }
    public NoMdEntries setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
    public NoMdEntries setEncodedIssuer(final String value) {
      setField(FieldValue.to(encodedIssuerField, value));
      return this;
    }
    public NoMdEntries setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
    public NoMdEntries setSecurityDesc(final String value) {
      setField(FieldValue.to(securityDescField, value));
      return this;
    }
    public NoMdEntries setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
    public NoMdEntries setEncodedSecurityDescLen(final int value) {
      setField(FieldValue.to(encodedSecurityDescLenField, value));
      return this;
    }
    public NoMdEntries setEncodedSecurityDescLen(
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
    public NoMdEntries setEncodedSecurityDesc(final String value) {
      setField(FieldValue.to(encodedSecurityDescField, value));
      return this;
    }
    public NoMdEntries setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
      setField(FieldValue.to(encodedSecurityDescField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField financialStatusField = FieldFactory.newCharField(291);
    public boolean hasFinancialStatus() throws quickfix.FieldNotFound {
      return isSetField(291);
    }
    public int getFinancialStatus() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(financialStatusField));
    }
    public NoMdEntries setFinancialStatus(final int value) {
      setField(FieldValue.to(financialStatusField, value));
      return this;
    }
    public NoMdEntries setFinancialStatus(final char value) {
      setField(FieldValue.to(financialStatusField, value));
      return this;
    }
    public NoMdEntries setFinancialStatus(final String value) {
      setField(FieldValue.to(financialStatusField, value));
      return this;
    }
    public NoMdEntries setFinancialStatus(final quickfix.field.FinancialStatus value) {
      setField(FieldValue.to(financialStatusField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField corporateActionField = FieldFactory.newCharField(292);
    public boolean hasCorporateAction() throws quickfix.FieldNotFound {
      return isSetField(292);
    }
    public int getCorporateAction() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(corporateActionField));
    }
    public NoMdEntries setCorporateAction(final int value) {
      setField(FieldValue.to(corporateActionField, value));
      return this;
    }
    public NoMdEntries setCorporateAction(final char value) {
      setField(FieldValue.to(corporateActionField, value));
      return this;
    }
    public NoMdEntries setCorporateAction(final String value) {
      setField(FieldValue.to(corporateActionField, value));
      return this;
    }
    public NoMdEntries setCorporateAction(final quickfix.field.CorporateAction value) {
      setField(FieldValue.to(corporateActionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField mdEntryPxField = FieldFactory.newDoubleField(270);
    public boolean hasMdEntryPx() throws quickfix.FieldNotFound {
      return isSetField(270);
    }
    public double getMdEntryPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryPxField));
    }
    public NoMdEntries setMdEntryPx(final double value) {
      setField(FieldValue.to(mdEntryPxField, value));
      return this;
    }
    public NoMdEntries setMdEntryPx(final quickfix.field.MDEntryPx value) {
      setField(FieldValue.to(mdEntryPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
    public boolean hasCurrency() throws quickfix.FieldNotFound {
      return isSetField(15);
    }
    public String getCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(currencyField));
    }
    public NoMdEntries setCurrency(final String value) {
      setField(FieldValue.to(currencyField, value));
      return this;
    }
    public NoMdEntries setCurrency(final quickfix.field.Currency value) {
      setField(FieldValue.to(currencyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField mdEntrySizeField = FieldFactory.newDoubleField(271);
    public boolean hasMdEntrySize() throws quickfix.FieldNotFound {
      return isSetField(271);
    }
    public double getMdEntrySize() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntrySizeField));
    }
    public NoMdEntries setMdEntrySize(final double value) {
      setField(FieldValue.to(mdEntrySizeField, value));
      return this;
    }
    public NoMdEntries setMdEntrySize(final quickfix.field.MDEntrySize value) {
      setField(FieldValue.to(mdEntrySizeField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.DateField mdEntryDateField = FieldFactory.newDateField(272);
    public boolean hasMdEntryDate() throws quickfix.FieldNotFound {
      return isSetField(272);
    }
    public long getMdEntryDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryDateField));
    }
    public NoMdEntries setMdEntryDate(final long value) {
      setField(FieldValue.to(mdEntryDateField, value));
      return this;
    }
    public NoMdEntries setMdEntryDate(final quickfix.field.MDEntryDate value) {
      setField(FieldValue.to(mdEntryDateField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeField mdEntryTimeField = FieldFactory.newTimeField(273);
    public boolean hasMdEntryTime() throws quickfix.FieldNotFound {
      return isSetField(273);
    }
    public long getMdEntryTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryTimeField));
    }
    public NoMdEntries setMdEntryTime(final long value) {
      setField(FieldValue.to(mdEntryTimeField, value));
      return this;
    }
    public NoMdEntries setMdEntryTime(final quickfix.field.MDEntryTime value) {
      setField(FieldValue.to(mdEntryTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField tickDirectionField = FieldFactory.newCharField(274);
    public boolean hasTickDirection() throws quickfix.FieldNotFound {
      return isSetField(274);
    }
    public int getTickDirection() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tickDirectionField));
    }
    public NoMdEntries setTickDirection(final int value) {
      setField(FieldValue.to(tickDirectionField, value));
      return this;
    }
    public NoMdEntries setTickDirection(final char value) {
      setField(FieldValue.to(tickDirectionField, value));
      return this;
    }
    public NoMdEntries setTickDirection(final String value) {
      setField(FieldValue.to(tickDirectionField, value));
      return this;
    }
    public NoMdEntries setTickDirection(final quickfix.field.TickDirection value) {
      setField(FieldValue.to(tickDirectionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdMktField = FieldFactory.newStringField(275);
    public boolean hasMdMkt() throws quickfix.FieldNotFound {
      return isSetField(275);
    }
    public String getMdMkt() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdMktField));
    }
    public NoMdEntries setMdMkt(final String value) {
      setField(FieldValue.to(mdMktField, value));
      return this;
    }
    public NoMdEntries setMdMkt(final quickfix.field.MDMkt value) {
      setField(FieldValue.to(mdMktField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
    public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
      return isSetField(336);
    }
    public String getTradingSessionId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionIdField));
    }
    public NoMdEntries setTradingSessionId(final String value) {
      setField(FieldValue.to(tradingSessionIdField, value));
      return this;
    }
    public NoMdEntries setTradingSessionId(final quickfix.field.TradingSessionID value) {
      setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField quoteConditionField = FieldFactory.newStringField(276);
    public boolean hasQuoteCondition() throws quickfix.FieldNotFound {
      return isSetField(276);
    }
    public String getQuoteCondition() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(quoteConditionField));
    }
    public NoMdEntries setQuoteCondition(final String value) {
      setField(FieldValue.to(quoteConditionField, value));
      return this;
    }
    public NoMdEntries setQuoteCondition(final quickfix.field.QuoteCondition value) {
      setField(FieldValue.to(quoteConditionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField tradeConditionField = FieldFactory.newStringField(277);
    public boolean hasTradeCondition() throws quickfix.FieldNotFound {
      return isSetField(277);
    }
    public String getTradeCondition() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradeConditionField));
    }
    public NoMdEntries setTradeCondition(final String value) {
      setField(FieldValue.to(tradeConditionField, value));
      return this;
    }
    public NoMdEntries setTradeCondition(final quickfix.field.TradeCondition value) {
      setField(FieldValue.to(tradeConditionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdEntryOriginatorField = FieldFactory.newStringField(282);
    public boolean hasMdEntryOriginator() throws quickfix.FieldNotFound {
      return isSetField(282);
    }
    public String getMdEntryOriginator() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryOriginatorField));
    }
    public NoMdEntries setMdEntryOriginator(final String value) {
      setField(FieldValue.to(mdEntryOriginatorField, value));
      return this;
    }
    public NoMdEntries setMdEntryOriginator(final quickfix.field.MDEntryOriginator value) {
      setField(FieldValue.to(mdEntryOriginatorField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField locationIdField = FieldFactory.newStringField(283);
    public boolean hasLocationId() throws quickfix.FieldNotFound {
      return isSetField(283);
    }
    public String getLocationId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(locationIdField));
    }
    public NoMdEntries setLocationId(final String value) {
      setField(FieldValue.to(locationIdField, value));
      return this;
    }
    public NoMdEntries setLocationId(final quickfix.field.LocationID value) {
      setField(FieldValue.to(locationIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField deskIdField = FieldFactory.newStringField(284);
    public boolean hasDeskId() throws quickfix.FieldNotFound {
      return isSetField(284);
    }
    public String getDeskId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deskIdField));
    }
    public NoMdEntries setDeskId(final String value) {
      setField(FieldValue.to(deskIdField, value));
      return this;
    }
    public NoMdEntries setDeskId(final quickfix.field.DeskID value) {
      setField(FieldValue.to(deskIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField openCloseSettleFlagField = FieldFactory.newCharField(286);
    public boolean hasOpenCloseSettleFlag() throws quickfix.FieldNotFound {
      return isSetField(286);
    }
    public int getOpenCloseSettleFlag() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(openCloseSettleFlagField));
    }
    public NoMdEntries setOpenCloseSettleFlag(final int value) {
      setField(FieldValue.to(openCloseSettleFlagField, value));
      return this;
    }
    public NoMdEntries setOpenCloseSettleFlag(final char value) {
      setField(FieldValue.to(openCloseSettleFlagField, value));
      return this;
    }
    public NoMdEntries setOpenCloseSettleFlag(final String value) {
      setField(FieldValue.to(openCloseSettleFlagField, value));
      return this;
    }
    public NoMdEntries setOpenCloseSettleFlag(final quickfix.field.OpenCloseSettleFlag value) {
      setField(FieldValue.to(openCloseSettleFlagField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField timeInForceField = FieldFactory.newCharField(59);
    public boolean hasTimeInForce() throws quickfix.FieldNotFound {
      return isSetField(59);
    }
    public int getTimeInForce() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(timeInForceField));
    }
    public NoMdEntries setTimeInForce(final int value) {
      setField(FieldValue.to(timeInForceField, value));
      return this;
    }
    public NoMdEntries setTimeInForce(final char value) {
      setField(FieldValue.to(timeInForceField, value));
      return this;
    }
    public NoMdEntries setTimeInForce(final String value) {
      setField(FieldValue.to(timeInForceField, value));
      return this;
    }
    public NoMdEntries setTimeInForce(final quickfix.field.TimeInForce value) {
      setField(FieldValue.to(timeInForceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField expireDateField = FieldFactory.newStringField(432);
    public boolean hasExpireDate() throws quickfix.FieldNotFound {
      return isSetField(432);
    }
    public String getExpireDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(expireDateField));
    }
    public NoMdEntries setExpireDate(final String value) {
      setField(FieldValue.to(expireDateField, value));
      return this;
    }
    public NoMdEntries setExpireDate(final quickfix.field.ExpireDate value) {
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
    public NoMdEntries setExpireTime(final long value) {
      setField(FieldValue.to(expireTimeField, value));
      return this;
    }
    public NoMdEntries setExpireTime(final quickfix.field.ExpireTime value) {
      setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
    public boolean hasMinQty() throws quickfix.FieldNotFound {
      return isSetField(110);
    }
    public double getMinQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(minQtyField));
    }
    public NoMdEntries setMinQty(final double value) {
      setField(FieldValue.to(minQtyField, value));
      return this;
    }
    public NoMdEntries setMinQty(final quickfix.field.MinQty value) {
      setField(FieldValue.to(minQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField execInstField = FieldFactory.newStringField(18);
    public boolean hasExecInst() throws quickfix.FieldNotFound {
      return isSetField(18);
    }
    public String getExecInst() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(execInstField));
    }
    public NoMdEntries setExecInst(final String value) {
      setField(FieldValue.to(execInstField, value));
      return this;
    }
    public NoMdEntries setExecInst(final quickfix.field.ExecInst value) {
      setField(FieldValue.to(execInstField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField sellerDaysField = FieldFactory.newIntField(287);
    public boolean hasSellerDays() throws quickfix.FieldNotFound {
      return isSetField(287);
    }
    public int getSellerDays() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(sellerDaysField));
    }
    public NoMdEntries setSellerDays(final int value) {
      setField(FieldValue.to(sellerDaysField, value));
      return this;
    }
    public NoMdEntries setSellerDays(final quickfix.field.SellerDays value) {
      setField(FieldValue.to(sellerDaysField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField orderIdField = FieldFactory.newStringField(37);
    public boolean hasOrderId() throws quickfix.FieldNotFound {
      return isSetField(37);
    }
    public String getOrderId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(orderIdField));
    }
    public NoMdEntries setOrderId(final String value) {
      setField(FieldValue.to(orderIdField, value));
      return this;
    }
    public NoMdEntries setOrderId(final quickfix.field.OrderID value) {
      setField(FieldValue.to(orderIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField quoteEntryIdField = FieldFactory.newStringField(299);
    public boolean hasQuoteEntryId() throws quickfix.FieldNotFound {
      return isSetField(299);
    }
    public String getQuoteEntryId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(quoteEntryIdField));
    }
    public NoMdEntries setQuoteEntryId(final String value) {
      setField(FieldValue.to(quoteEntryIdField, value));
      return this;
    }
    public NoMdEntries setQuoteEntryId(final quickfix.field.QuoteEntryID value) {
      setField(FieldValue.to(quoteEntryIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdEntryBuyerField = FieldFactory.newStringField(288);
    public boolean hasMdEntryBuyer() throws quickfix.FieldNotFound {
      return isSetField(288);
    }
    public String getMdEntryBuyer() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryBuyerField));
    }
    public NoMdEntries setMdEntryBuyer(final String value) {
      setField(FieldValue.to(mdEntryBuyerField, value));
      return this;
    }
    public NoMdEntries setMdEntryBuyer(final quickfix.field.MDEntryBuyer value) {
      setField(FieldValue.to(mdEntryBuyerField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField mdEntrySellerField = FieldFactory.newStringField(289);
    public boolean hasMdEntrySeller() throws quickfix.FieldNotFound {
      return isSetField(289);
    }
    public String getMdEntrySeller() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntrySellerField));
    }
    public NoMdEntries setMdEntrySeller(final String value) {
      setField(FieldValue.to(mdEntrySellerField, value));
      return this;
    }
    public NoMdEntries setMdEntrySeller(final quickfix.field.MDEntrySeller value) {
      setField(FieldValue.to(mdEntrySellerField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField numberOfOrdersField = FieldFactory.newIntField(346);
    public boolean hasNumberOfOrders() throws quickfix.FieldNotFound {
      return isSetField(346);
    }
    public int getNumberOfOrders() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(numberOfOrdersField));
    }
    public NoMdEntries setNumberOfOrders(final int value) {
      setField(FieldValue.to(numberOfOrdersField, value));
      return this;
    }
    public NoMdEntries setNumberOfOrders(final quickfix.field.NumberOfOrders value) {
      setField(FieldValue.to(numberOfOrdersField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField mdEntryPositionNoField = FieldFactory.newIntField(290);
    public boolean hasMdEntryPositionNo() throws quickfix.FieldNotFound {
      return isSetField(290);
    }
    public int getMdEntryPositionNo() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryPositionNoField));
    }
    public NoMdEntries setMdEntryPositionNo(final int value) {
      setField(FieldValue.to(mdEntryPositionNoField, value));
      return this;
    }
    public NoMdEntries setMdEntryPositionNo(final quickfix.field.MDEntryPositionNo value) {
      setField(FieldValue.to(mdEntryPositionNoField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField totalVolumeTradedField = FieldFactory.newDoubleField(387);
    public boolean hasTotalVolumeTraded() throws quickfix.FieldNotFound {
      return isSetField(387);
    }
    public double getTotalVolumeTraded() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(totalVolumeTradedField));
    }
    public NoMdEntries setTotalVolumeTraded(final double value) {
      setField(FieldValue.to(totalVolumeTradedField, value));
      return this;
    }
    public NoMdEntries setTotalVolumeTraded(final quickfix.field.TotalVolumeTraded value) {
      setField(FieldValue.to(totalVolumeTradedField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField textField = FieldFactory.newStringField(58);
    public boolean hasText() throws quickfix.FieldNotFound {
      return isSetField(58);
    }
    public String getText() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(textField));
    }
    public NoMdEntries setText(final String value) {
      setField(FieldValue.to(textField, value));
      return this;
    }
    public NoMdEntries setText(final quickfix.field.Text value) {
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
    public NoMdEntries setEncodedTextLen(final int value) {
      setField(FieldValue.to(encodedTextLenField, value));
      return this;
    }
    public NoMdEntries setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
    public NoMdEntries setEncodedText(final String value) {
      setField(FieldValue.to(encodedTextField, value));
      return this;
    }
    public NoMdEntries setEncodedText(final quickfix.field.EncodedText value) {
      setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
      return this;
    }

    public NoMdEntries() {
      super(268, 279,
          new int[] {279, 285, 269, 278, 280, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231,
              223, 207, 106, 348, 349, 107, 350, 351, 291, 292, 270, 15, 271, 272, 273, 274, 275,
              336, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 299, 288, 289, 346,
              290, 387, 58, 354, 355, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries proto) {
      final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getMdUpdateAction()) {
        this.setMdUpdateAction(proto.getMdUpdateAction());
      }
      if (fieldPresence.getDeleteReason()) {
        this.setDeleteReason(proto.getDeleteReason());
      }
      if (fieldPresence.getMdEntryType()) {
        this.setMdEntryType(proto.getMdEntryType());
      }
      if (fieldPresence.getMdEntryId()) {
        this.setMdEntryId(proto.getMdEntryId());
      }
      if (fieldPresence.getMdEntryRefId()) {
        this.setMdEntryRefId(proto.getMdEntryRefId());
      }
      if (fieldPresence.getSymbol()) {
        this.setSymbol(proto.getSymbol());
      }
      if (fieldPresence.getSymbolSfx()) {
        this.setSymbolSfx(proto.getSymbolSfx());
      }
      if (fieldPresence.getSecurityId()) {
        this.setSecurityId(proto.getSecurityId());
      }
      if (fieldPresence.getIdSource()) {
        this.setIdSource(proto.getIdSource());
      }
      if (fieldPresence.getSecurityType()) {
        this.setSecurityType(proto.getSecurityType());
      }
      if (fieldPresence.getMaturityMonthYear()) {
        this.setMaturityMonthYear(proto.getMaturityMonthYear());
      }
      if (fieldPresence.getMaturityDay()) {
        this.setMaturityDay(proto.getMaturityDay());
      }
      if (fieldPresence.getPutOrCall()) {
        this.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getStrikePrice()) {
        this.setStrikePrice(proto.getStrikePrice());
      }
      if (fieldPresence.getOptAttribute()) {
        this.setOptAttribute(proto.getOptAttribute());
      }
      if (fieldPresence.getContractMultiplier()) {
        this.setContractMultiplier(proto.getContractMultiplier());
      }
      if (fieldPresence.getCouponRate()) {
        this.setCouponRate(proto.getCouponRate());
      }
      if (fieldPresence.getSecurityExchange()) {
        this.setSecurityExchange(proto.getSecurityExchange());
      }
      if (fieldPresence.getIssuer()) {
        this.setIssuer(proto.getIssuer());
      }
      if (fieldPresence.getEncodedIssuerLen()) {
        this.setEncodedIssuerLen(proto.getEncodedIssuerLen());
      }
      if (fieldPresence.getEncodedIssuer()) {
        this.setEncodedIssuer(proto.getEncodedIssuer());
      }
      if (fieldPresence.getSecurityDesc()) {
        this.setSecurityDesc(proto.getSecurityDesc());
      }
      if (fieldPresence.getEncodedSecurityDescLen()) {
        this.setEncodedSecurityDescLen(proto.getEncodedSecurityDescLen());
      }
      if (fieldPresence.getEncodedSecurityDesc()) {
        this.setEncodedSecurityDesc(proto.getEncodedSecurityDesc());
      }
      if (fieldPresence.getFinancialStatus()) {
        this.setFinancialStatus(proto.getFinancialStatus());
      }
      if (fieldPresence.getCorporateAction()) {
        this.setCorporateAction(proto.getCorporateAction());
      }
      if (fieldPresence.getMdEntryPx()) {
        this.setMdEntryPx(proto.getMdEntryPx());
      }
      if (fieldPresence.getCurrency()) {
        this.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getMdEntrySize()) {
        this.setMdEntrySize(proto.getMdEntrySize());
      }
      if (fieldPresence.getMdEntryDate()) {
        this.setMdEntryDate(proto.getMdEntryDate());
      }
      if (fieldPresence.getMdEntryTime()) {
        this.setMdEntryTime(proto.getMdEntryTime());
      }
      if (fieldPresence.getTickDirection()) {
        this.setTickDirection(proto.getTickDirection());
      }
      if (fieldPresence.getMdMkt()) {
        this.setMdMkt(proto.getMdMkt());
      }
      if (fieldPresence.getTradingSessionId()) {
        this.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getQuoteCondition()) {
        this.setQuoteCondition(proto.getQuoteCondition());
      }
      if (fieldPresence.getTradeCondition()) {
        this.setTradeCondition(proto.getTradeCondition());
      }
      if (fieldPresence.getMdEntryOriginator()) {
        this.setMdEntryOriginator(proto.getMdEntryOriginator());
      }
      if (fieldPresence.getLocationId()) {
        this.setLocationId(proto.getLocationId());
      }
      if (fieldPresence.getDeskId()) {
        this.setDeskId(proto.getDeskId());
      }
      if (fieldPresence.getOpenCloseSettleFlag()) {
        this.setOpenCloseSettleFlag(proto.getOpenCloseSettleFlag());
      }
      if (fieldPresence.getTimeInForce()) {
        this.setTimeInForce(proto.getTimeInForce());
      }
      if (fieldPresence.getExpireDate()) {
        this.setExpireDate(proto.getExpireDate());
      }
      if (fieldPresence.getExpireTime()) {
        this.setExpireTime(proto.getExpireTime());
      }
      if (fieldPresence.getMinQty()) {
        this.setMinQty(proto.getMinQty());
      }
      if (fieldPresence.getExecInst()) {
        this.setExecInst(proto.getExecInst());
      }
      if (fieldPresence.getSellerDays()) {
        this.setSellerDays(proto.getSellerDays());
      }
      if (fieldPresence.getOrderId()) {
        this.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getQuoteEntryId()) {
        this.setQuoteEntryId(proto.getQuoteEntryId());
      }
      if (fieldPresence.getMdEntryBuyer()) {
        this.setMdEntryBuyer(proto.getMdEntryBuyer());
      }
      if (fieldPresence.getMdEntrySeller()) {
        this.setMdEntrySeller(proto.getMdEntrySeller());
      }
      if (fieldPresence.getNumberOfOrders()) {
        this.setNumberOfOrders(proto.getNumberOfOrders());
      }
      if (fieldPresence.getMdEntryPositionNo()) {
        this.setMdEntryPositionNo(proto.getMdEntryPositionNo());
      }
      if (fieldPresence.getTotalVolumeTraded()) {
        this.setTotalVolumeTraded(proto.getTotalVolumeTraded());
      }
      if (fieldPresence.getText()) {
        this.setText(proto.getText());
      }
      if (fieldPresence.getEncodedTextLen()) {
        this.setEncodedTextLen(proto.getEncodedTextLen());
      }
      if (fieldPresence.getEncodedText()) {
        this.setEncodedText(proto.getEncodedText());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries
          .Builder builder = garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
                                 .NoMdEntries.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.NoMdEntries
              .FieldPresence.newBuilder();

      if (this.hasMdUpdateAction()) {
        builder.setMdUpdateAction(this.getMdUpdateAction());
        presenceBuilder.setMdUpdateAction(true);
      }
      if (this.hasDeleteReason()) {
        builder.setDeleteReason(this.getDeleteReason());
        presenceBuilder.setDeleteReason(true);
      }
      if (this.hasMdEntryType()) {
        builder.setMdEntryType(this.getMdEntryType());
        presenceBuilder.setMdEntryType(true);
      }
      if (this.hasMdEntryId()) {
        builder.setMdEntryId(this.getMdEntryId());
        presenceBuilder.setMdEntryId(true);
      }
      if (this.hasMdEntryRefId()) {
        builder.setMdEntryRefId(this.getMdEntryRefId());
        presenceBuilder.setMdEntryRefId(true);
      }
      if (this.hasSymbol()) {
        builder.setSymbol(this.getSymbol());
        presenceBuilder.setSymbol(true);
      }
      if (this.hasSymbolSfx()) {
        builder.setSymbolSfx(this.getSymbolSfx());
        presenceBuilder.setSymbolSfx(true);
      }
      if (this.hasSecurityId()) {
        builder.setSecurityId(this.getSecurityId());
        presenceBuilder.setSecurityId(true);
      }
      if (this.hasIdSource()) {
        builder.setIdSource(this.getIdSource());
        presenceBuilder.setIdSource(true);
      }
      if (this.hasSecurityType()) {
        builder.setSecurityType(this.getSecurityType());
        presenceBuilder.setSecurityType(true);
      }
      if (this.hasMaturityMonthYear()) {
        builder.setMaturityMonthYear(this.getMaturityMonthYear());
        presenceBuilder.setMaturityMonthYear(true);
      }
      if (this.hasMaturityDay()) {
        builder.setMaturityDay(this.getMaturityDay());
        presenceBuilder.setMaturityDay(true);
      }
      if (this.hasPutOrCall()) {
        builder.setPutOrCall(this.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (this.hasStrikePrice()) {
        builder.setStrikePrice(this.getStrikePrice());
        presenceBuilder.setStrikePrice(true);
      }
      if (this.hasOptAttribute()) {
        builder.setOptAttribute(this.getOptAttribute());
        presenceBuilder.setOptAttribute(true);
      }
      if (this.hasContractMultiplier()) {
        builder.setContractMultiplier(this.getContractMultiplier());
        presenceBuilder.setContractMultiplier(true);
      }
      if (this.hasCouponRate()) {
        builder.setCouponRate(this.getCouponRate());
        presenceBuilder.setCouponRate(true);
      }
      if (this.hasSecurityExchange()) {
        builder.setSecurityExchange(this.getSecurityExchange());
        presenceBuilder.setSecurityExchange(true);
      }
      if (this.hasIssuer()) {
        builder.setIssuer(this.getIssuer());
        presenceBuilder.setIssuer(true);
      }
      if (this.hasEncodedIssuerLen()) {
        builder.setEncodedIssuerLen(this.getEncodedIssuerLen());
        presenceBuilder.setEncodedIssuerLen(true);
      }
      if (this.hasEncodedIssuer()) {
        builder.setEncodedIssuer(this.getEncodedIssuer());
        presenceBuilder.setEncodedIssuer(true);
      }
      if (this.hasSecurityDesc()) {
        builder.setSecurityDesc(this.getSecurityDesc());
        presenceBuilder.setSecurityDesc(true);
      }
      if (this.hasEncodedSecurityDescLen()) {
        builder.setEncodedSecurityDescLen(this.getEncodedSecurityDescLen());
        presenceBuilder.setEncodedSecurityDescLen(true);
      }
      if (this.hasEncodedSecurityDesc()) {
        builder.setEncodedSecurityDesc(this.getEncodedSecurityDesc());
        presenceBuilder.setEncodedSecurityDesc(true);
      }
      if (this.hasFinancialStatus()) {
        builder.setFinancialStatus(this.getFinancialStatus());
        presenceBuilder.setFinancialStatus(true);
      }
      if (this.hasCorporateAction()) {
        builder.setCorporateAction(this.getCorporateAction());
        presenceBuilder.setCorporateAction(true);
      }
      if (this.hasMdEntryPx()) {
        builder.setMdEntryPx(this.getMdEntryPx());
        presenceBuilder.setMdEntryPx(true);
      }
      if (this.hasCurrency()) {
        builder.setCurrency(this.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (this.hasMdEntrySize()) {
        builder.setMdEntrySize(this.getMdEntrySize());
        presenceBuilder.setMdEntrySize(true);
      }
      if (this.hasMdEntryDate()) {
        builder.setMdEntryDate(this.getMdEntryDate());
        presenceBuilder.setMdEntryDate(true);
      }
      if (this.hasMdEntryTime()) {
        builder.setMdEntryTime(this.getMdEntryTime());
        presenceBuilder.setMdEntryTime(true);
      }
      if (this.hasTickDirection()) {
        builder.setTickDirection(this.getTickDirection());
        presenceBuilder.setTickDirection(true);
      }
      if (this.hasMdMkt()) {
        builder.setMdMkt(this.getMdMkt());
        presenceBuilder.setMdMkt(true);
      }
      if (this.hasTradingSessionId()) {
        builder.setTradingSessionId(this.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (this.hasQuoteCondition()) {
        builder.setQuoteCondition(this.getQuoteCondition());
        presenceBuilder.setQuoteCondition(true);
      }
      if (this.hasTradeCondition()) {
        builder.setTradeCondition(this.getTradeCondition());
        presenceBuilder.setTradeCondition(true);
      }
      if (this.hasMdEntryOriginator()) {
        builder.setMdEntryOriginator(this.getMdEntryOriginator());
        presenceBuilder.setMdEntryOriginator(true);
      }
      if (this.hasLocationId()) {
        builder.setLocationId(this.getLocationId());
        presenceBuilder.setLocationId(true);
      }
      if (this.hasDeskId()) {
        builder.setDeskId(this.getDeskId());
        presenceBuilder.setDeskId(true);
      }
      if (this.hasOpenCloseSettleFlag()) {
        builder.setOpenCloseSettleFlag(this.getOpenCloseSettleFlag());
        presenceBuilder.setOpenCloseSettleFlag(true);
      }
      if (this.hasTimeInForce()) {
        builder.setTimeInForce(this.getTimeInForce());
        presenceBuilder.setTimeInForce(true);
      }
      if (this.hasExpireDate()) {
        builder.setExpireDate(this.getExpireDate());
        presenceBuilder.setExpireDate(true);
      }
      if (this.hasExpireTime()) {
        builder.setExpireTime(this.getExpireTime());
        presenceBuilder.setExpireTime(true);
      }
      if (this.hasMinQty()) {
        builder.setMinQty(this.getMinQty());
        presenceBuilder.setMinQty(true);
      }
      if (this.hasExecInst()) {
        builder.setExecInst(this.getExecInst());
        presenceBuilder.setExecInst(true);
      }
      if (this.hasSellerDays()) {
        builder.setSellerDays(this.getSellerDays());
        presenceBuilder.setSellerDays(true);
      }
      if (this.hasOrderId()) {
        builder.setOrderId(this.getOrderId());
        presenceBuilder.setOrderId(true);
      }
      if (this.hasQuoteEntryId()) {
        builder.setQuoteEntryId(this.getQuoteEntryId());
        presenceBuilder.setQuoteEntryId(true);
      }
      if (this.hasMdEntryBuyer()) {
        builder.setMdEntryBuyer(this.getMdEntryBuyer());
        presenceBuilder.setMdEntryBuyer(true);
      }
      if (this.hasMdEntrySeller()) {
        builder.setMdEntrySeller(this.getMdEntrySeller());
        presenceBuilder.setMdEntrySeller(true);
      }
      if (this.hasNumberOfOrders()) {
        builder.setNumberOfOrders(this.getNumberOfOrders());
        presenceBuilder.setNumberOfOrders(true);
      }
      if (this.hasMdEntryPositionNo()) {
        builder.setMdEntryPositionNo(this.getMdEntryPositionNo());
        presenceBuilder.setMdEntryPositionNo(true);
      }
      if (this.hasTotalVolumeTraded()) {
        builder.setTotalVolumeTraded(this.getTotalVolumeTraded());
        presenceBuilder.setTotalVolumeTraded(true);
      }
      if (this.hasText()) {
        builder.setText(this.getText());
        presenceBuilder.setText(true);
      }
      if (this.hasEncodedTextLen()) {
        builder.setEncodedTextLen(this.getEncodedTextLen());
        presenceBuilder.setEncodedTextLen(true);
      }
      if (this.hasEncodedText()) {
        builder.setEncodedText(this.getEncodedText());
        presenceBuilder.setEncodedText(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  private final quickfix.StringField mdReqIdField = FieldFactory.newStringField(262);
  public boolean hasMdReqId() throws quickfix.FieldNotFound {
    return isSetField(262);
  }
  public String getMdReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdReqIdField));
  }
  public MarketDataIncrementalRefresh setMdReqId(final String value) {
    setField(FieldValue.to(mdReqIdField, value));
    return this;
  }
  public MarketDataIncrementalRefresh setMdReqId(final quickfix.field.MDReqID value) {
    setField(FieldValue.to(mdReqIdField, FieldValue.of(value)));
    return this;
  }

  public MarketDataIncrementalRefresh() {
    super(new int[] {262, 0});
  }

  public MarketDataIncrementalRefresh(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {262, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh,
      garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh.FieldPresence
        .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
                                       .FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasMdReqId()) {
        builder.setMdReqId(fix.getMdReqId());
        presenceBuilder.setMdReqId(true);
      }
      final int noMdEntriesGroupCount = fix.getGroupCount(268);
      for (int i = 1; i <= noMdEntriesGroupCount; i++) {
        final MarketDataIncrementalRefresh.NoMdEntries group =
            new MarketDataIncrementalRefresh.NoMdEntries();
        fix.getGroup(i, group);
        builder.addNoMdEntries(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("marketDataIncrementalRefresh error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh,
      garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh fix =
          new garden_leave.gateway.transform.fix42.MarketDataIncrementalRefresh();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.MarketDataIncrementalRefresh
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getMdReqId()) {
        fix.setMdReqId(proto.getMdReqId());
      }
      for (int i = 0; i < proto.getNoMdEntriesCount(); i++) {
        final MarketDataIncrementalRefresh.NoMdEntries group =
            new MarketDataIncrementalRefresh.NoMdEntries();
        group.fromProto(proto.getNoMdEntries(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
