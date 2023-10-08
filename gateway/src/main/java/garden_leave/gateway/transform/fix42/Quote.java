package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.508803700
//

public final class Quote extends quickfix.Message {
  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Quote.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(Quote.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public Quote setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "S";

  public final String UUID = java.util.UUID.randomUUID().toString();

  private final quickfix.StringField quoteReqIdField = FieldFactory.newStringField(131);
  public boolean hasQuoteReqId() throws quickfix.FieldNotFound {
    return isSetField(131);
  }
  public String getQuoteReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteReqIdField));
  }
  public Quote setQuoteReqId(final String value) {
    setField(FieldValue.to(quoteReqIdField, value));
    return this;
  }
  public Quote setQuoteReqId(final quickfix.field.QuoteReqID value) {
    setField(FieldValue.to(quoteReqIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField quoteIdField = FieldFactory.newStringField(117);
  public boolean hasQuoteId() throws quickfix.FieldNotFound {
    return isSetField(117);
  }
  public String getQuoteId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteIdField));
  }
  public Quote setQuoteId(final String value) {
    setField(FieldValue.to(quoteIdField, value));
    return this;
  }
  public Quote setQuoteId(final quickfix.field.QuoteID value) {
    setField(FieldValue.to(quoteIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField quoteResponseLevelField = FieldFactory.newIntField(301);
  public boolean hasQuoteResponseLevel() throws quickfix.FieldNotFound {
    return isSetField(301);
  }
  public int getQuoteResponseLevel() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteResponseLevelField));
  }
  public Quote setQuoteResponseLevel(final int value) {
    setField(FieldValue.to(quoteResponseLevelField, value));
    return this;
  }
  public Quote setQuoteResponseLevel(final quickfix.field.QuoteResponseLevel value) {
    setField(FieldValue.to(quoteResponseLevelField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
  public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
    return isSetField(336);
  }
  public String getTradingSessionId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradingSessionIdField));
  }
  public Quote setTradingSessionId(final String value) {
    setField(FieldValue.to(tradingSessionIdField, value));
    return this;
  }
  public Quote setTradingSessionId(final quickfix.field.TradingSessionID value) {
    setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public Quote setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public Quote setSymbol(final quickfix.field.Symbol value) {
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
  public Quote setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public Quote setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public Quote setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public Quote setSecurityId(final quickfix.field.SecurityID value) {
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
  public Quote setIdSource(final String value) {
    setField(FieldValue.to(idSourceField, value));
    return this;
  }
  public Quote setIdSource(final quickfix.field.IDSource value) {
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
  public Quote setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public Quote setSecurityType(final quickfix.field.SecurityType value) {
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
  public Quote setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public Quote setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public Quote setMaturityDay(final int value) {
    setField(FieldValue.to(maturityDayField, value));
    return this;
  }
  public Quote setMaturityDay(final quickfix.field.MaturityDay value) {
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
  public Quote setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public Quote setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public Quote setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public Quote setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public Quote setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public Quote setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public Quote setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public Quote setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public Quote setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public Quote setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public Quote setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public Quote setCouponRate(final quickfix.field.CouponRate value) {
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
  public Quote setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public Quote setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public Quote setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public Quote setIssuer(final quickfix.field.Issuer value) {
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
  public Quote setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public Quote setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public Quote setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public Quote setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public Quote setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public Quote setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public Quote setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public Quote setEncodedSecurityDescLen(final quickfix.field.EncodedSecurityDescLen value) {
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
  public Quote setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public Quote setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
    setField(FieldValue.to(encodedSecurityDescField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField bidPxField = FieldFactory.newDoubleField(132);
  public boolean hasBidPx() throws quickfix.FieldNotFound {
    return isSetField(132);
  }
  public double getBidPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bidPxField));
  }
  public Quote setBidPx(final double value) {
    setField(FieldValue.to(bidPxField, value));
    return this;
  }
  public Quote setBidPx(final quickfix.field.BidPx value) {
    setField(FieldValue.to(bidPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField offerPxField = FieldFactory.newDoubleField(133);
  public boolean hasOfferPx() throws quickfix.FieldNotFound {
    return isSetField(133);
  }
  public double getOfferPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(offerPxField));
  }
  public Quote setOfferPx(final double value) {
    setField(FieldValue.to(offerPxField, value));
    return this;
  }
  public Quote setOfferPx(final quickfix.field.OfferPx value) {
    setField(FieldValue.to(offerPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField bidSizeField = FieldFactory.newDoubleField(134);
  public boolean hasBidSize() throws quickfix.FieldNotFound {
    return isSetField(134);
  }
  public double getBidSize() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bidSizeField));
  }
  public Quote setBidSize(final double value) {
    setField(FieldValue.to(bidSizeField, value));
    return this;
  }
  public Quote setBidSize(final quickfix.field.BidSize value) {
    setField(FieldValue.to(bidSizeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField offerSizeField = FieldFactory.newDoubleField(135);
  public boolean hasOfferSize() throws quickfix.FieldNotFound {
    return isSetField(135);
  }
  public double getOfferSize() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(offerSizeField));
  }
  public Quote setOfferSize(final double value) {
    setField(FieldValue.to(offerSizeField, value));
    return this;
  }
  public Quote setOfferSize(final quickfix.field.OfferSize value) {
    setField(FieldValue.to(offerSizeField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField validUntilTimeField =
      FieldFactory.newTimeStampField(62);
  public boolean hasValidUntilTime() throws quickfix.FieldNotFound {
    return isSetField(62);
  }
  public long getValidUntilTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(validUntilTimeField));
  }
  public Quote setValidUntilTime(final long value) {
    setField(FieldValue.to(validUntilTimeField, value));
    return this;
  }
  public Quote setValidUntilTime(final quickfix.field.ValidUntilTime value) {
    setField(FieldValue.to(validUntilTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField bidSpotRateField = FieldFactory.newDoubleField(188);
  public boolean hasBidSpotRate() throws quickfix.FieldNotFound {
    return isSetField(188);
  }
  public double getBidSpotRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bidSpotRateField));
  }
  public Quote setBidSpotRate(final double value) {
    setField(FieldValue.to(bidSpotRateField, value));
    return this;
  }
  public Quote setBidSpotRate(final quickfix.field.BidSpotRate value) {
    setField(FieldValue.to(bidSpotRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField offerSpotRateField = FieldFactory.newDoubleField(190);
  public boolean hasOfferSpotRate() throws quickfix.FieldNotFound {
    return isSetField(190);
  }
  public double getOfferSpotRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(offerSpotRateField));
  }
  public Quote setOfferSpotRate(final double value) {
    setField(FieldValue.to(offerSpotRateField, value));
    return this;
  }
  public Quote setOfferSpotRate(final quickfix.field.OfferSpotRate value) {
    setField(FieldValue.to(offerSpotRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField bidForwardPointsField = FieldFactory.newDoubleField(189);
  public boolean hasBidForwardPoints() throws quickfix.FieldNotFound {
    return isSetField(189);
  }
  public double getBidForwardPoints() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bidForwardPointsField));
  }
  public Quote setBidForwardPoints(final double value) {
    setField(FieldValue.to(bidForwardPointsField, value));
    return this;
  }
  public Quote setBidForwardPoints(final quickfix.field.BidForwardPoints value) {
    setField(FieldValue.to(bidForwardPointsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField offerForwardPointsField = FieldFactory.newDoubleField(191);
  public boolean hasOfferForwardPoints() throws quickfix.FieldNotFound {
    return isSetField(191);
  }
  public double getOfferForwardPoints() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(offerForwardPointsField));
  }
  public Quote setOfferForwardPoints(final double value) {
    setField(FieldValue.to(offerForwardPointsField, value));
    return this;
  }
  public Quote setOfferForwardPoints(final quickfix.field.OfferForwardPoints value) {
    setField(FieldValue.to(offerForwardPointsField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public Quote setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public Quote setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField futSettDateField = FieldFactory.newStringField(64);
  public boolean hasFutSettDate() throws quickfix.FieldNotFound {
    return isSetField(64);
  }
  public String getFutSettDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(futSettDateField));
  }
  public Quote setFutSettDate(final String value) {
    setField(FieldValue.to(futSettDateField, value));
    return this;
  }
  public Quote setFutSettDate(final quickfix.field.FutSettDate value) {
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
  public Quote setOrdType(final int value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public Quote setOrdType(final char value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public Quote setOrdType(final String value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public Quote setOrdType(final quickfix.field.OrdType value) {
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
  public Quote setFutSettDate2(final String value) {
    setField(FieldValue.to(futSettDate2Field, value));
    return this;
  }
  public Quote setFutSettDate2(final quickfix.field.FutSettDate2 value) {
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
  public Quote setOrderQty2(final double value) {
    setField(FieldValue.to(orderQty2Field, value));
    return this;
  }
  public Quote setOrderQty2(final quickfix.field.OrderQty2 value) {
    setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public Quote setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public Quote setCurrency(final quickfix.field.Currency value) {
    setField(FieldValue.to(currencyField, FieldValue.of(value)));
    return this;
  }

  public Quote() {
    super(new int[] {131, 117, 301, 336, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223,
        207, 106, 348, 349, 107, 350, 351, 132, 133, 134, 135, 62, 188, 190, 189, 191, 60, 64, 40,
        193, 192, 15, 0});
  }

  public Quote(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {131, 117, 301, 336, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223,
        207, 106, 348, 349, 107, 350, 351, 132, 133, 134, 135, 62, 188, 190, 189, 191, 60, 64, 40,
        193, 192, 15, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.Quote,
      garden_leave.fix42.proto.FIX42Protos.Quote> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.Quote.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.Quote.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.Quote.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.Quote.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.Quote.FieldPresence.newBuilder();

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
      if (fix.hasQuoteId()) {
        builder.setQuoteId(fix.getQuoteId());
        presenceBuilder.setQuoteId(true);
      }
      if (fix.hasQuoteResponseLevel()) {
        builder.setQuoteResponseLevel(fix.getQuoteResponseLevel());
        presenceBuilder.setQuoteResponseLevel(true);
      }
      if (fix.hasTradingSessionId()) {
        builder.setTradingSessionId(fix.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
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
      if (fix.hasBidPx()) {
        builder.setBidPx(fix.getBidPx());
        presenceBuilder.setBidPx(true);
      }
      if (fix.hasOfferPx()) {
        builder.setOfferPx(fix.getOfferPx());
        presenceBuilder.setOfferPx(true);
      }
      if (fix.hasBidSize()) {
        builder.setBidSize(fix.getBidSize());
        presenceBuilder.setBidSize(true);
      }
      if (fix.hasOfferSize()) {
        builder.setOfferSize(fix.getOfferSize());
        presenceBuilder.setOfferSize(true);
      }
      if (fix.hasValidUntilTime()) {
        builder.setValidUntilTime(fix.getValidUntilTime());
        presenceBuilder.setValidUntilTime(true);
      }
      if (fix.hasBidSpotRate()) {
        builder.setBidSpotRate(fix.getBidSpotRate());
        presenceBuilder.setBidSpotRate(true);
      }
      if (fix.hasOfferSpotRate()) {
        builder.setOfferSpotRate(fix.getOfferSpotRate());
        presenceBuilder.setOfferSpotRate(true);
      }
      if (fix.hasBidForwardPoints()) {
        builder.setBidForwardPoints(fix.getBidForwardPoints());
        presenceBuilder.setBidForwardPoints(true);
      }
      if (fix.hasOfferForwardPoints()) {
        builder.setOfferForwardPoints(fix.getOfferForwardPoints());
        presenceBuilder.setOfferForwardPoints(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasFutSettDate()) {
        builder.setFutSettDate(fix.getFutSettDate());
        presenceBuilder.setFutSettDate(true);
      }
      if (fix.hasOrdType()) {
        builder.setOrdType(fix.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (fix.hasFutSettDate2()) {
        builder.setFutSettDate2(fix.getFutSettDate2());
        presenceBuilder.setFutSettDate2(true);
      }
      if (fix.hasOrderQty2()) {
        builder.setOrderQty2(fix.getOrderQty2());
        presenceBuilder.setOrderQty2(true);
      }
      if (fix.hasCurrency()) {
        builder.setCurrency(fix.getCurrency());
        presenceBuilder.setCurrency(true);
      }
    } catch (final Throwable t) {
      logger.error("quote error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.Quote,
      garden_leave.gateway.transform.fix42.Quote> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.Quote.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.Quote fix =
          new garden_leave.gateway.transform.fix42.Quote();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.Quote.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getQuoteReqId()) {
        fix.setQuoteReqId(proto.getQuoteReqId());
      }
      if (fieldPresence.getQuoteId()) {
        fix.setQuoteId(proto.getQuoteId());
      }
      if (fieldPresence.getQuoteResponseLevel()) {
        fix.setQuoteResponseLevel(proto.getQuoteResponseLevel());
      }
      if (fieldPresence.getTradingSessionId()) {
        fix.setTradingSessionId(proto.getTradingSessionId());
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
      if (fieldPresence.getBidPx()) {
        fix.setBidPx(proto.getBidPx());
      }
      if (fieldPresence.getOfferPx()) {
        fix.setOfferPx(proto.getOfferPx());
      }
      if (fieldPresence.getBidSize()) {
        fix.setBidSize(proto.getBidSize());
      }
      if (fieldPresence.getOfferSize()) {
        fix.setOfferSize(proto.getOfferSize());
      }
      if (fieldPresence.getValidUntilTime()) {
        fix.setValidUntilTime(proto.getValidUntilTime());
      }
      if (fieldPresence.getBidSpotRate()) {
        fix.setBidSpotRate(proto.getBidSpotRate());
      }
      if (fieldPresence.getOfferSpotRate()) {
        fix.setOfferSpotRate(proto.getOfferSpotRate());
      }
      if (fieldPresence.getBidForwardPoints()) {
        fix.setBidForwardPoints(proto.getBidForwardPoints());
      }
      if (fieldPresence.getOfferForwardPoints()) {
        fix.setOfferForwardPoints(proto.getOfferForwardPoints());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getFutSettDate()) {
        fix.setFutSettDate(proto.getFutSettDate());
      }
      if (fieldPresence.getOrdType()) {
        fix.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getFutSettDate2()) {
        fix.setFutSettDate2(proto.getFutSettDate2());
      }
      if (fieldPresence.getOrderQty2()) {
        fix.setOrderQty2(proto.getOrderQty2());
      }
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
