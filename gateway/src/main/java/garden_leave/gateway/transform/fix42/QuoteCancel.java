package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.505594600
//

public final class QuoteCancel extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(QuoteCancel.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(QuoteCancel.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public QuoteCancel setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "Z";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoQuoteEntries extends quickfix.Group {
    private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
    public boolean hasSymbol() throws quickfix.FieldNotFound {
      return isSetField(55);
    }
    public String getSymbol() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(symbolField));
    }
    public NoQuoteEntries setSymbol(final String value) {
      setField(FieldValue.to(symbolField, value));
      return this;
    }
    public NoQuoteEntries setSymbol(final quickfix.field.Symbol value) {
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
    public NoQuoteEntries setSymbolSfx(final String value) {
      setField(FieldValue.to(symbolSfxField, value));
      return this;
    }
    public NoQuoteEntries setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
    public NoQuoteEntries setSecurityId(final String value) {
      setField(FieldValue.to(securityIdField, value));
      return this;
    }
    public NoQuoteEntries setSecurityId(final quickfix.field.SecurityID value) {
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
    public NoQuoteEntries setIdSource(final String value) {
      setField(FieldValue.to(idSourceField, value));
      return this;
    }
    public NoQuoteEntries setIdSource(final quickfix.field.IDSource value) {
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
    public NoQuoteEntries setSecurityType(final String value) {
      setField(FieldValue.to(securityTypeField, value));
      return this;
    }
    public NoQuoteEntries setSecurityType(final quickfix.field.SecurityType value) {
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
    public NoQuoteEntries setMaturityMonthYear(final String value) {
      setField(FieldValue.to(maturityMonthYearField, value));
      return this;
    }
    public NoQuoteEntries setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
    public NoQuoteEntries setMaturityDay(final int value) {
      setField(FieldValue.to(maturityDayField, value));
      return this;
    }
    public NoQuoteEntries setMaturityDay(final quickfix.field.MaturityDay value) {
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
    public NoQuoteEntries setPutOrCall(final int value) {
      setField(FieldValue.to(putOrCallField, value));
      return this;
    }
    public NoQuoteEntries setPutOrCall(final quickfix.field.PutOrCall value) {
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
    public NoQuoteEntries setStrikePrice(final double value) {
      setField(FieldValue.to(strikePriceField, value));
      return this;
    }
    public NoQuoteEntries setStrikePrice(final quickfix.field.StrikePrice value) {
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
    public NoQuoteEntries setOptAttribute(final int value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoQuoteEntries setOptAttribute(final char value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoQuoteEntries setOptAttribute(final String value) {
      setField(FieldValue.to(optAttributeField, value));
      return this;
    }
    public NoQuoteEntries setOptAttribute(final quickfix.field.OptAttribute value) {
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
    public NoQuoteEntries setContractMultiplier(final double value) {
      setField(FieldValue.to(contractMultiplierField, value));
      return this;
    }
    public NoQuoteEntries setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
    public NoQuoteEntries setCouponRate(final double value) {
      setField(FieldValue.to(couponRateField, value));
      return this;
    }
    public NoQuoteEntries setCouponRate(final quickfix.field.CouponRate value) {
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
    public NoQuoteEntries setSecurityExchange(final String value) {
      setField(FieldValue.to(securityExchangeField, value));
      return this;
    }
    public NoQuoteEntries setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
    public NoQuoteEntries setIssuer(final String value) {
      setField(FieldValue.to(issuerField, value));
      return this;
    }
    public NoQuoteEntries setIssuer(final quickfix.field.Issuer value) {
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
    public NoQuoteEntries setEncodedIssuerLen(final int value) {
      setField(FieldValue.to(encodedIssuerLenField, value));
      return this;
    }
    public NoQuoteEntries setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
    public NoQuoteEntries setEncodedIssuer(final String value) {
      setField(FieldValue.to(encodedIssuerField, value));
      return this;
    }
    public NoQuoteEntries setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
    public NoQuoteEntries setSecurityDesc(final String value) {
      setField(FieldValue.to(securityDescField, value));
      return this;
    }
    public NoQuoteEntries setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
    public NoQuoteEntries setEncodedSecurityDescLen(final int value) {
      setField(FieldValue.to(encodedSecurityDescLenField, value));
      return this;
    }
    public NoQuoteEntries setEncodedSecurityDescLen(
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
    public NoQuoteEntries setEncodedSecurityDesc(final String value) {
      setField(FieldValue.to(encodedSecurityDescField, value));
      return this;
    }
    public NoQuoteEntries setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
      setField(FieldValue.to(encodedSecurityDescField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField underlyingSymbolField = FieldFactory.newStringField(311);
    public boolean hasUnderlyingSymbol() throws quickfix.FieldNotFound {
      return isSetField(311);
    }
    public String getUnderlyingSymbol() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(underlyingSymbolField));
    }
    public NoQuoteEntries setUnderlyingSymbol(final String value) {
      setField(FieldValue.to(underlyingSymbolField, value));
      return this;
    }
    public NoQuoteEntries setUnderlyingSymbol(final quickfix.field.UnderlyingSymbol value) {
      setField(FieldValue.to(underlyingSymbolField, FieldValue.of(value)));
      return this;
    }

    public NoQuoteEntries() {
      super(295, 55,
          new int[] {55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349,
              107, 350, 351, 311, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries proto) {
      final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries
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
      if (fieldPresence.getUnderlyingSymbol()) {
        this.setUnderlyingSymbol(proto.getUnderlyingSymbol());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries.Builder builder =
          garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries.FieldPresence
          .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.QuoteCancel.NoQuoteEntries
                                         .FieldPresence.newBuilder();

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
      if (this.hasUnderlyingSymbol()) {
        builder.setUnderlyingSymbol(this.getUnderlyingSymbol());
        presenceBuilder.setUnderlyingSymbol(true);
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
  public QuoteCancel setQuoteReqId(final String value) {
    setField(FieldValue.to(quoteReqIdField, value));
    return this;
  }
  public QuoteCancel setQuoteReqId(final quickfix.field.QuoteReqID value) {
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
  public QuoteCancel setQuoteId(final String value) {
    setField(FieldValue.to(quoteIdField, value));
    return this;
  }
  public QuoteCancel setQuoteId(final quickfix.field.QuoteID value) {
    setField(FieldValue.to(quoteIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField quoteCancelTypeField = FieldFactory.newIntField(298);
  public boolean hasQuoteCancelType() throws quickfix.FieldNotFound {
    return isSetField(298);
  }
  public int getQuoteCancelType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteCancelTypeField));
  }
  public QuoteCancel setQuoteCancelType(final int value) {
    setField(FieldValue.to(quoteCancelTypeField, value));
    return this;
  }
  public QuoteCancel setQuoteCancelType(final quickfix.field.QuoteCancelType value) {
    setField(FieldValue.to(quoteCancelTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField quoteResponseLevelField = FieldFactory.newIntField(301);
  public boolean hasQuoteResponseLevel() throws quickfix.FieldNotFound {
    return isSetField(301);
  }
  public int getQuoteResponseLevel() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteResponseLevelField));
  }
  public QuoteCancel setQuoteResponseLevel(final int value) {
    setField(FieldValue.to(quoteResponseLevelField, value));
    return this;
  }
  public QuoteCancel setQuoteResponseLevel(final quickfix.field.QuoteResponseLevel value) {
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
  public QuoteCancel setTradingSessionId(final String value) {
    setField(FieldValue.to(tradingSessionIdField, value));
    return this;
  }
  public QuoteCancel setTradingSessionId(final quickfix.field.TradingSessionID value) {
    setField(FieldValue.to(tradingSessionIdField, FieldValue.of(value)));
    return this;
  }

  public QuoteCancel() {
    super(new int[] {131, 117, 298, 301, 336, 0});
  }

  public QuoteCancel(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {131, 117, 298, 301, 336, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.QuoteCancel,
      garden_leave.fix42.proto.FIX42Protos.QuoteCancel> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.QuoteCancel.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.QuoteCancel.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.QuoteCancel.FieldPresence.newBuilder();

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
      if (fix.hasQuoteCancelType()) {
        builder.setQuoteCancelType(fix.getQuoteCancelType());
        presenceBuilder.setQuoteCancelType(true);
      }
      if (fix.hasQuoteResponseLevel()) {
        builder.setQuoteResponseLevel(fix.getQuoteResponseLevel());
        presenceBuilder.setQuoteResponseLevel(true);
      }
      if (fix.hasTradingSessionId()) {
        builder.setTradingSessionId(fix.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      final int noQuoteEntriesGroupCount = fix.getGroupCount(295);
      for (int i = 1; i <= noQuoteEntriesGroupCount; i++) {
        final QuoteCancel.NoQuoteEntries group = new QuoteCancel.NoQuoteEntries();
        fix.getGroup(i, group);
        builder.addNoQuoteEntries(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("quoteCancel error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.QuoteCancel,
      garden_leave.gateway.transform.fix42.QuoteCancel> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.QuoteCancel.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.QuoteCancel fix =
          new garden_leave.gateway.transform.fix42.QuoteCancel();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.QuoteCancel.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getQuoteReqId()) {
        fix.setQuoteReqId(proto.getQuoteReqId());
      }
      if (fieldPresence.getQuoteId()) {
        fix.setQuoteId(proto.getQuoteId());
      }
      if (fieldPresence.getQuoteCancelType()) {
        fix.setQuoteCancelType(proto.getQuoteCancelType());
      }
      if (fieldPresence.getQuoteResponseLevel()) {
        fix.setQuoteResponseLevel(proto.getQuoteResponseLevel());
      }
      if (fieldPresence.getTradingSessionId()) {
        fix.setTradingSessionId(proto.getTradingSessionId());
      }
      for (int i = 0; i < proto.getNoQuoteEntriesCount(); i++) {
        final QuoteCancel.NoQuoteEntries group = new QuoteCancel.NoQuoteEntries();
        group.fromProto(proto.getNoQuoteEntries(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
