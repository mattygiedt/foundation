package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.504189700
//

public final class QuoteRequest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(QuoteRequest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(QuoteRequest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public QuoteRequest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "R";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoRelatedSym extends quickfix.Group {
    private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
    public boolean hasSymbol() throws quickfix.FieldNotFound {
      return isSetField(55);
    }
    public String getSymbol() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(symbolField));
    }
    public NoRelatedSym setSymbol(final String value) {
      setField(FieldValue.to(symbolField, value));
      return this;
    }
    public NoRelatedSym setSymbol(final quickfix.field.Symbol value) {
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
    public NoRelatedSym setSymbolSfx(final String value) {
      setField(FieldValue.to(symbolSfxField, value));
      return this;
    }
    public NoRelatedSym setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
    public NoRelatedSym setSecurityId(final String value) {
      setField(FieldValue.to(securityIdField, value));
      return this;
    }
    public NoRelatedSym setSecurityId(final quickfix.field.SecurityID value) {
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
    public NoRelatedSym setIdSource(final String value) {
      setField(FieldValue.to(idSourceField, value));
      return this;
    }
    public NoRelatedSym setIdSource(final quickfix.field.IDSource value) {
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
    public NoRelatedSym setSecurityType(final String value) {
      setField(FieldValue.to(securityTypeField, value));
      return this;
    }
    public NoRelatedSym setSecurityType(final quickfix.field.SecurityType value) {
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
    public NoRelatedSym setMaturityMonthYear(final String value) {
      setField(FieldValue.to(maturityMonthYearField, value));
      return this;
    }
    public NoRelatedSym setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
    public NoRelatedSym setMaturityDay(final int value) {
      setField(FieldValue.to(maturityDayField, value));
      return this;
    }
    public NoRelatedSym setMaturityDay(final quickfix.field.MaturityDay value) {
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
    public NoRelatedSym setPutOrCall(final int value) {
      setField(FieldValue.to(putOrCallField, value));
      return this;
    }
    public NoRelatedSym setPutOrCall(final quickfix.field.PutOrCall value) {
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
    public NoRelatedSym setStrikePrice(final double value) {
      setField(FieldValue.to(strikePriceField, value));
      return this;
    }
    public NoRelatedSym setStrikePrice(final quickfix.field.StrikePrice value) {
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
    public NoRelatedSym setOptAttribute(final int value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoRelatedSym setOptAttribute(final char value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoRelatedSym setOptAttribute(final String value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoRelatedSym setOptAttribute(final quickfix.field.OptAttribute value) {
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
    public NoRelatedSym setContractMultiplier(final double value) {
      setField(FieldValue.to(contractMultiplierField, value));
      return this;
    }
    public NoRelatedSym setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
    public NoRelatedSym setCouponRate(final double value) {
      setField(FieldValue.to(couponRateField, value));
      return this;
    }
    public NoRelatedSym setCouponRate(final quickfix.field.CouponRate value) {
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
    public NoRelatedSym setSecurityExchange(final String value) {
      setField(FieldValue.to(securityExchangeField, value));
      return this;
    }
    public NoRelatedSym setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
    public NoRelatedSym setIssuer(final String value) {
      setField(FieldValue.to(issuerField, value));
      return this;
    }
    public NoRelatedSym setIssuer(final quickfix.field.Issuer value) {
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
    public NoRelatedSym setEncodedIssuerLen(final int value) {
      setField(FieldValue.to(encodedIssuerLenField, value));
      return this;
    }
    public NoRelatedSym setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
    public NoRelatedSym setEncodedIssuer(final String value) {
      setField(FieldValue.to(encodedIssuerField, value));
      return this;
    }
    public NoRelatedSym setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
    public NoRelatedSym setSecurityDesc(final String value) {
      setField(FieldValue.to(securityDescField, value));
      return this;
    }
    public NoRelatedSym setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
    public NoRelatedSym setEncodedSecurityDescLen(final int value) {
      setField(FieldValue.to(encodedSecurityDescLenField, value));
      return this;
    }
    public NoRelatedSym setEncodedSecurityDescLen(
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
    public NoRelatedSym setEncodedSecurityDesc(final String value) {
      setField(FieldValue.to(encodedSecurityDescField, value));
      return this;
    }
    public NoRelatedSym setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
      setField(FieldValue.to(encodedSecurityDescField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField prevClosePxField = FieldFactory.newDoubleField(140);
    public boolean hasPrevClosePx() throws quickfix.FieldNotFound {
      return isSetField(140);
    }
    public double getPrevClosePx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(prevClosePxField));
    }
    public NoRelatedSym setPrevClosePx(final double value) {
      setField(FieldValue.to(prevClosePxField, value));
      return this;
    }
    public NoRelatedSym setPrevClosePx(final quickfix.field.PrevClosePx value) {
      setField(FieldValue.to(prevClosePxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField quoteRequestTypeField = FieldFactory.newIntField(303);
    public boolean hasQuoteRequestType() throws quickfix.FieldNotFound {
      return isSetField(303);
    }
    public int getQuoteRequestType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(quoteRequestTypeField));
    }
    public NoRelatedSym setQuoteRequestType(final int value) {
      setField(FieldValue.to(quoteRequestTypeField, value));
      return this;
    }
    public NoRelatedSym setQuoteRequestType(final quickfix.field.QuoteRequestType value) {
      setField(FieldValue.to(quoteRequestTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
    public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
      return isSetField(336);
    }
    public String getTradingSessionId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionIdField));
    }
    public NoRelatedSym setTradingSessionId(final String value) {
      setField(FieldValue.to(tradingSessionIdField, value));
      return this;
    }
    public NoRelatedSym setTradingSessionId(final quickfix.field.TradingSessionID value) {
      setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField sideField = FieldFactory.newCharField(54);
    public boolean hasSide() throws quickfix.FieldNotFound {
      return isSetField(54);
    }
    public int getSide() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(sideField));
    }
    public NoRelatedSym setSide(final int value) {
      setField(FieldValue.to(sideField, value));
      return this;
    }
    public NoRelatedSym setSide(final char value) {
      setField(FieldValue.to(sideField, value));
      return this;
    }
    public NoRelatedSym setSide(final String value) {
      setField(FieldValue.to(sideField, value));
      return this;
    }
    public NoRelatedSym setSide(final quickfix.field.Side value) {
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
    public NoRelatedSym setOrderQty(final double value) {
      setField(FieldValue.to(orderQtyField, value));
      return this;
    }
    public NoRelatedSym setOrderQty(final quickfix.field.OrderQty value) {
      setField(FieldValue.to(orderQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField futSettDateField = FieldFactory.newStringField(64);
    public boolean hasFutSettDate() throws quickfix.FieldNotFound {
      return isSetField(64);
    }
    public String getFutSettDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(futSettDateField));
    }
    public NoRelatedSym setFutSettDate(final String value) {
      setField(FieldValue.to(futSettDateField, value));
      return this;
    }
    public NoRelatedSym setFutSettDate(final quickfix.field.FutSettDate value) {
      setField(FieldValue.to(futSettDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField ordTypeField = FieldFactory.newCharField(40);
    public boolean hasOrdType() throws quickfix.FieldNotFound {
      return isSetField(40);
    }
    public int getOrdType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(ordTypeField));
    }
    public NoRelatedSym setOrdType(final int value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoRelatedSym setOrdType(final char value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoRelatedSym setOrdType(final String value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoRelatedSym setOrdType(final quickfix.field.OrdType value) {
      setField(FieldValue.to(ordTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField futSettDate2Field = FieldFactory.newStringField(193);
    public boolean hasFutSettDate2() throws quickfix.FieldNotFound {
      return isSetField(193);
    }
    public String getFutSettDate2() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(futSettDate2Field));
    }
    public NoRelatedSym setFutSettDate2(final String value) {
      setField(FieldValue.to(futSettDate2Field, value));
      return this;
    }
    public NoRelatedSym setFutSettDate2(final quickfix.field.FutSettDate2 value) {
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
    public NoRelatedSym setOrderQty2(final double value) {
      setField(FieldValue.to(orderQty2Field, value));
      return this;
    }
    public NoRelatedSym setOrderQty2(final quickfix.field.OrderQty2 value) {
      setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeStampField expireTimeField = FieldFactory.newTimeStampField(126);
    public boolean hasExpireTime() throws quickfix.FieldNotFound {
      return isSetField(126);
    }
    public long getExpireTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(expireTimeField));
    }
    public NoRelatedSym setExpireTime(final long value) {
      setField(FieldValue.to(expireTimeField, value));
      return this;
    }
    public NoRelatedSym setExpireTime(final quickfix.field.ExpireTime value) {
      setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeStampField transactTimeField =
        FieldFactory.newTimeStampField(60);
    public boolean hasTransactTime() throws quickfix.FieldNotFound {
      return isSetField(60);
    }
    public long getTransactTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(transactTimeField));
    }
    public NoRelatedSym setTransactTime(final long value) {
      setField(FieldValue.to(transactTimeField, value));
      return this;
    }
    public NoRelatedSym setTransactTime(final quickfix.field.TransactTime value) {
      setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
    public boolean hasCurrency() throws quickfix.FieldNotFound {
      return isSetField(15);
    }
    public String getCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(currencyField));
    }
    public NoRelatedSym setCurrency(final String value) {
      setField(FieldValue.to(currencyField, value));
      return this;
    }
    public NoRelatedSym setCurrency(final quickfix.field.Currency value) {
      setField(FieldValue.to(currencyField, FieldValue.of(value)));
      return this;
    }

    public NoRelatedSym() {
      super(146, 55,
          new int[] {55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349,
              107, 350, 351, 140, 303, 336, 54, 38, 64, 40, 193, 192, 126, 60, 15, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym proto) {
      final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym
          .FieldPresence fieldPresence = proto.getFieldPresence();

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
      if (fieldPresence.getPrevClosePx()) {
        this.setPrevClosePx(proto.getPrevClosePx());
      }
      if (fieldPresence.getQuoteRequestType()) {
        this.setQuoteRequestType(proto.getQuoteRequestType());
      }
      if (fieldPresence.getTradingSessionId()) {
        this.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getSide()) {
        this.setSide(proto.getSide());
      }
      if (fieldPresence.getOrderQty()) {
        this.setOrderQty(proto.getOrderQty());
      }
      if (fieldPresence.getFutSettDate()) {
        this.setFutSettDate(proto.getFutSettDate());
      }
      if (fieldPresence.getOrdType()) {
        this.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getFutSettDate2()) {
        this.setFutSettDate2(proto.getFutSettDate2());
      }
      if (fieldPresence.getOrderQty2()) {
        this.setOrderQty2(proto.getOrderQty2());
      }
      if (fieldPresence.getExpireTime()) {
        this.setExpireTime(proto.getExpireTime());
      }
      if (fieldPresence.getTransactTime()) {
        this.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getCurrency()) {
        this.setCurrency(proto.getCurrency());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym.Builder builder =
          garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix42.proto.FIX42Protos.QuoteRequest.NoRelatedSym.FieldPresence.newBuilder();

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
      if (this.hasPrevClosePx()) {
        builder.setPrevClosePx(this.getPrevClosePx());
        presenceBuilder.setPrevClosePx(true);
      }
      if (this.hasQuoteRequestType()) {
        builder.setQuoteRequestType(this.getQuoteRequestType());
        presenceBuilder.setQuoteRequestType(true);
      }
      if (this.hasTradingSessionId()) {
        builder.setTradingSessionId(this.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (this.hasSide()) {
        builder.setSide(this.getSide());
        presenceBuilder.setSide(true);
      }
      if (this.hasOrderQty()) {
        builder.setOrderQty(this.getOrderQty());
        presenceBuilder.setOrderQty(true);
      }
      if (this.hasFutSettDate()) {
        builder.setFutSettDate(this.getFutSettDate());
        presenceBuilder.setFutSettDate(true);
      }
      if (this.hasOrdType()) {
        builder.setOrdType(this.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (this.hasFutSettDate2()) {
        builder.setFutSettDate2(this.getFutSettDate2());
        presenceBuilder.setFutSettDate2(true);
      }
      if (this.hasOrderQty2()) {
        builder.setOrderQty2(this.getOrderQty2());
        presenceBuilder.setOrderQty2(true);
      }
      if (this.hasExpireTime()) {
        builder.setExpireTime(this.getExpireTime());
        presenceBuilder.setExpireTime(true);
      }
      if (this.hasTransactTime()) {
        builder.setTransactTime(this.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (this.hasCurrency()) {
        builder.setCurrency(this.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  private final quickfix.StringField quoteReqIdField = FieldFactory.newStringField(131);
  public boolean hasQuoteReqId() throws quickfix.FieldNotFound {
    return isSetField(131);
  }
  public String getQuoteReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteReqIdField));
  }
  public QuoteRequest setQuoteReqId(final String value) {
    setField(FieldValue.to(quoteReqIdField, value));
    return this;
  }
  public QuoteRequest setQuoteReqId(final quickfix.field.QuoteReqID value) {
    setField(FieldValue.to(quoteReqIdField, FieldValue.of(value)));
    return this;
  }

  public QuoteRequest() {
    super(new int[] {131, 0});
  }

  public QuoteRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {131, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.QuoteRequest,
      garden_leave.fix42.proto.FIX42Protos.QuoteRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.QuoteRequest.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.QuoteRequest.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.QuoteRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasQuoteReqId()) {
        builder.setQuoteReqId(fix.getQuoteReqId());
        presenceBuilder.setQuoteReqId(true);
      }
      final int noRelatedSymGroupCount = fix.getGroupCount(146);
      for (int i = 1; i <= noRelatedSymGroupCount; i++) {
        final QuoteRequest.NoRelatedSym group = new QuoteRequest.NoRelatedSym();
        fix.getGroup(i, group);
        builder.addNoRelatedSym(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("quoteRequest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.QuoteRequest,
      garden_leave.gateway.transform.fix42.QuoteRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.QuoteRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.QuoteRequest fix =
          new garden_leave.gateway.transform.fix42.QuoteRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.QuoteRequest.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getQuoteReqId()) {
        fix.setQuoteReqId(proto.getQuoteReqId());
      }
      for (int i = 0; i < proto.getNoRelatedSymCount(); i++) {
        final QuoteRequest.NoRelatedSym group = new QuoteRequest.NoRelatedSym();
        group.fromProto(proto.getNoRelatedSym(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
