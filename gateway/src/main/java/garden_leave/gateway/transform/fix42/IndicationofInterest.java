package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.473009200
//

public final class IndicationofInterest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(IndicationofInterest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(IndicationofInterest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public IndicationofInterest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "6";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoIoiQualifiers extends quickfix.Group {
    private final quickfix.CharField ioiQualifierField = FieldFactory.newCharField(104);
    public boolean hasIoiQualifier() throws quickfix.FieldNotFound {
      return isSetField(104);
    }
    public int getIoiQualifier() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(ioiQualifierField));
    }
    public NoIoiQualifiers setIoiQualifier(final int value) {
      setField(FieldValue.to(ioiQualifierField, value));
      return this;
    }
    public NoIoiQualifiers setIoiQualifier(final char value) {
      setField(FieldValue.to(ioiQualifierField, value));
      return this;
    }
    public NoIoiQualifiers setIoiQualifier(final String value) {
      setField(FieldValue.to(ioiQualifierField, value));
      return this;
    }
    public NoIoiQualifiers setIoiQualifier(final quickfix.field.IOIQualifier value) {
      setField(FieldValue.to(ioiQualifierField, FieldValue.of(value)));
      return this;
    }

    public NoIoiQualifiers() {
      super(199, 104, new int[] {104, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers proto) {
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getIoiQualifier()) {
        this.setIoiQualifier(proto.getIoiQualifier());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers
          .Builder builder =
          garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoIoiQualifiers.FieldPresence
          .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.IndicationofInterest
                                         .NoIoiQualifiers.FieldPresence.newBuilder();

      if (this.hasIoiQualifier()) {
        builder.setIoiQualifier(this.getIoiQualifier());
        presenceBuilder.setIoiQualifier(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoRoutingIds extends quickfix.Group {
    private final quickfix.IntField routingTypeField = FieldFactory.newIntField(216);
    public boolean hasRoutingType() throws quickfix.FieldNotFound {
      return isSetField(216);
    }
    public int getRoutingType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(routingTypeField));
    }
    public NoRoutingIds setRoutingType(final int value) {
      setField(FieldValue.to(routingTypeField, value));
      return this;
    }
    public NoRoutingIds setRoutingType(final quickfix.field.RoutingType value) {
      setField(FieldValue.to(routingTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField routingIdField = FieldFactory.newStringField(217);
    public boolean hasRoutingId() throws quickfix.FieldNotFound {
      return isSetField(217);
    }
    public String getRoutingId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(routingIdField));
    }
    public NoRoutingIds setRoutingId(final String value) {
      setField(FieldValue.to(routingIdField, value));
      return this;
    }
    public NoRoutingIds setRoutingId(final quickfix.field.RoutingID value) {
      setField(FieldValue.to(routingIdField, FieldValue.of(value)));
      return this;
    }

    public NoRoutingIds() {
      super(215, 216, new int[] {216, 217, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds proto) {
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getRoutingType()) {
        this.setRoutingType(proto.getRoutingType());
      }
      if (fieldPresence.getRoutingId()) {
        this.setRoutingId(proto.getRoutingId());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds.Builder builder =
          garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.NoRoutingIds.FieldPresence
          .Builder presenceBuilder = garden_leave.fix42.proto.FIX42Protos.IndicationofInterest
                                         .NoRoutingIds.FieldPresence.newBuilder();

      if (this.hasRoutingType()) {
        builder.setRoutingType(this.getRoutingType());
        presenceBuilder.setRoutingType(true);
      }
      if (this.hasRoutingId()) {
        builder.setRoutingId(this.getRoutingId());
        presenceBuilder.setRoutingId(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  private final quickfix.StringField ioiIdField = FieldFactory.newStringField(23);
  public boolean hasIoiId() throws quickfix.FieldNotFound {
    return isSetField(23);
  }
  public String getIoiId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiIdField));
  }
  public IndicationofInterest setIoiId(final String value) {
    setField(FieldValue.to(ioiIdField, value));
    return this;
  }
  public IndicationofInterest setIoiId(final quickfix.field.IOIID value) {
    setField(FieldValue.to(ioiIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ioiTransTypeField = FieldFactory.newCharField(28);
  public boolean hasIoiTransType() throws quickfix.FieldNotFound {
    return isSetField(28);
  }
  public int getIoiTransType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiTransTypeField));
  }
  public IndicationofInterest setIoiTransType(final int value) {
    setField(FieldValue.to(ioiTransTypeField, value));
    return this;
  }
  public IndicationofInterest setIoiTransType(final char value) {
    setField(FieldValue.to(ioiTransTypeField, value));
    return this;
  }
  public IndicationofInterest setIoiTransType(final String value) {
    setField(FieldValue.to(ioiTransTypeField, value));
    return this;
  }
  public IndicationofInterest setIoiTransType(final quickfix.field.IOITransType value) {
    setField(FieldValue.to(ioiTransTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField ioiRefIdField = FieldFactory.newStringField(26);
  public boolean hasIoiRefId() throws quickfix.FieldNotFound {
    return isSetField(26);
  }
  public String getIoiRefId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiRefIdField));
  }
  public IndicationofInterest setIoiRefId(final String value) {
    setField(FieldValue.to(ioiRefIdField, value));
    return this;
  }
  public IndicationofInterest setIoiRefId(final quickfix.field.IOIRefID value) {
    setField(FieldValue.to(ioiRefIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public IndicationofInterest setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public IndicationofInterest setSymbol(final quickfix.field.Symbol value) {
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
  public IndicationofInterest setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public IndicationofInterest setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public IndicationofInterest setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public IndicationofInterest setSecurityId(final quickfix.field.SecurityID value) {
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
  public IndicationofInterest setIdSource(final String value) {
    setField(FieldValue.to(idSourceField, value));
    return this;
  }
  public IndicationofInterest setIdSource(final quickfix.field.IDSource value) {
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
  public IndicationofInterest setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public IndicationofInterest setSecurityType(final quickfix.field.SecurityType value) {
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
  public IndicationofInterest setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public IndicationofInterest setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public IndicationofInterest setMaturityDay(final int value) {
    setField(FieldValue.to(maturityDayField, value));
    return this;
  }
  public IndicationofInterest setMaturityDay(final quickfix.field.MaturityDay value) {
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
  public IndicationofInterest setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public IndicationofInterest setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public IndicationofInterest setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public IndicationofInterest setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public IndicationofInterest setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public IndicationofInterest setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public IndicationofInterest setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public IndicationofInterest setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public IndicationofInterest setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public IndicationofInterest setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public IndicationofInterest setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public IndicationofInterest setCouponRate(final quickfix.field.CouponRate value) {
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
  public IndicationofInterest setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public IndicationofInterest setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public IndicationofInterest setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public IndicationofInterest setIssuer(final quickfix.field.Issuer value) {
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
  public IndicationofInterest setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public IndicationofInterest setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public IndicationofInterest setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public IndicationofInterest setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public IndicationofInterest setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public IndicationofInterest setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public IndicationofInterest setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public IndicationofInterest setEncodedSecurityDescLen(
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
  public IndicationofInterest setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public IndicationofInterest setEncodedSecurityDesc(
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
  public IndicationofInterest setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public IndicationofInterest setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public IndicationofInterest setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public IndicationofInterest setSide(final quickfix.field.Side value) {
    setField(FieldValue.to(sideField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField ioiSharesField = FieldFactory.newStringField(27);
  public boolean hasIoiShares() throws quickfix.FieldNotFound {
    return isSetField(27);
  }
  public String getIoiShares() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiSharesField));
  }
  public IndicationofInterest setIoiShares(final String value) {
    setField(FieldValue.to(ioiSharesField, value));
    return this;
  }
  public IndicationofInterest setIoiShares(final quickfix.field.IOIShares value) {
    setField(FieldValue.to(ioiSharesField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField priceField = FieldFactory.newDoubleField(44);
  public boolean hasPrice() throws quickfix.FieldNotFound {
    return isSetField(44);
  }
  public double getPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceField));
  }
  public IndicationofInterest setPrice(final double value) {
    setField(FieldValue.to(priceField, value));
    return this;
  }
  public IndicationofInterest setPrice(final quickfix.field.Price value) {
    setField(FieldValue.to(priceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public IndicationofInterest setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public IndicationofInterest setCurrency(final quickfix.field.Currency value) {
    setField(FieldValue.to(currencyField, FieldValue.of(value)));
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
  public IndicationofInterest setValidUntilTime(final long value) {
    setField(FieldValue.to(validUntilTimeField, value));
    return this;
  }
  public IndicationofInterest setValidUntilTime(final quickfix.field.ValidUntilTime value) {
    setField(FieldValue.to(validUntilTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ioiQltyIndField = FieldFactory.newCharField(25);
  public boolean hasIoiQltyInd() throws quickfix.FieldNotFound {
    return isSetField(25);
  }
  public int getIoiQltyInd() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiQltyIndField));
  }
  public IndicationofInterest setIoiQltyInd(final int value) {
    setField(FieldValue.to(ioiQltyIndField, value));
    return this;
  }
  public IndicationofInterest setIoiQltyInd(final char value) {
    setField(FieldValue.to(ioiQltyIndField, value));
    return this;
  }
  public IndicationofInterest setIoiQltyInd(final String value) {
    setField(FieldValue.to(ioiQltyIndField, value));
    return this;
  }
  public IndicationofInterest setIoiQltyInd(final quickfix.field.IOIQltyInd value) {
    setField(FieldValue.to(ioiQltyIndField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField ioiNaturalFlagField = FieldFactory.newBooleanField(130);
  public boolean hasIoiNaturalFlag() throws quickfix.FieldNotFound {
    return isSetField(130);
  }
  public boolean getIoiNaturalFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiNaturalFlagField));
  }
  public IndicationofInterest setIoiNaturalFlag(final boolean value) {
    setField(FieldValue.to(ioiNaturalFlagField, value));
    return this;
  }
  public IndicationofInterest setIoiNaturalFlag(final quickfix.field.IOINaturalFlag value) {
    setField(FieldValue.to(ioiNaturalFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public IndicationofInterest setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public IndicationofInterest setText(final quickfix.field.Text value) {
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
  public IndicationofInterest setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public IndicationofInterest setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public IndicationofInterest setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public IndicationofInterest setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public IndicationofInterest setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public IndicationofInterest setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField urlLinkField = FieldFactory.newStringField(149);
  public boolean hasUrlLink() throws quickfix.FieldNotFound {
    return isSetField(149);
  }
  public String getUrlLink() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(urlLinkField));
  }
  public IndicationofInterest setUrlLink(final String value) {
    setField(FieldValue.to(urlLinkField, value));
    return this;
  }
  public IndicationofInterest setUrlLink(final quickfix.field.URLLink value) {
    setField(FieldValue.to(urlLinkField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField spreadToBenchmarkField = FieldFactory.newDoubleField(218);
  public boolean hasSpreadToBenchmark() throws quickfix.FieldNotFound {
    return isSetField(218);
  }
  public double getSpreadToBenchmark() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(spreadToBenchmarkField));
  }
  public IndicationofInterest setSpreadToBenchmark(final double value) {
    setField(FieldValue.to(spreadToBenchmarkField, value));
    return this;
  }
  public IndicationofInterest setSpreadToBenchmark(final quickfix.field.SpreadToBenchmark value) {
    setField(FieldValue.to(spreadToBenchmarkField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField benchmarkField = FieldFactory.newCharField(219);
  public boolean hasBenchmark() throws quickfix.FieldNotFound {
    return isSetField(219);
  }
  public int getBenchmark() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(benchmarkField));
  }
  public IndicationofInterest setBenchmark(final int value) {
    setField(FieldValue.to(benchmarkField, value));
    return this;
  }
  public IndicationofInterest setBenchmark(final char value) {
    setField(FieldValue.to(benchmarkField, value));
    return this;
  }
  public IndicationofInterest setBenchmark(final String value) {
    setField(FieldValue.to(benchmarkField, value));
    return this;
  }
  public IndicationofInterest setBenchmark(final quickfix.field.Benchmark value) {
    setField(FieldValue.to(benchmarkField, FieldValue.of(value)));
    return this;
  }

  public IndicationofInterest() {
    super(new int[] {23, 28, 26, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106,
        348, 349, 107, 350, 351, 54, 27, 44, 15, 62, 25, 130, 58, 354, 355, 60, 149, 218, 219, 0});
  }

  public IndicationofInterest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {23, 28, 26, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106,
        348, 349, 107, 350, 351, 54, 27, 44, 15, 62, 25, 130, 58, 354, 355, 60, 149, 218, 219, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.IndicationofInterest,
      garden_leave.fix42.proto.FIX42Protos.IndicationofInterest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasIoiId()) {
        builder.setIoiId(fix.getIoiId());
        presenceBuilder.setIoiId(true);
      }
      if (fix.hasIoiTransType()) {
        builder.setIoiTransType(fix.getIoiTransType());
        presenceBuilder.setIoiTransType(true);
      }
      if (fix.hasIoiRefId()) {
        builder.setIoiRefId(fix.getIoiRefId());
        presenceBuilder.setIoiRefId(true);
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
      if (fix.hasIoiShares()) {
        builder.setIoiShares(fix.getIoiShares());
        presenceBuilder.setIoiShares(true);
      }
      if (fix.hasPrice()) {
        builder.setPrice(fix.getPrice());
        presenceBuilder.setPrice(true);
      }
      if (fix.hasCurrency()) {
        builder.setCurrency(fix.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (fix.hasValidUntilTime()) {
        builder.setValidUntilTime(fix.getValidUntilTime());
        presenceBuilder.setValidUntilTime(true);
      }
      if (fix.hasIoiQltyInd()) {
        builder.setIoiQltyInd(fix.getIoiQltyInd());
        presenceBuilder.setIoiQltyInd(true);
      }
      if (fix.hasIoiNaturalFlag()) {
        builder.setIoiNaturalFlag(fix.getIoiNaturalFlag());
        presenceBuilder.setIoiNaturalFlag(true);
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
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasUrlLink()) {
        builder.setUrlLink(fix.getUrlLink());
        presenceBuilder.setUrlLink(true);
      }
      if (fix.hasSpreadToBenchmark()) {
        builder.setSpreadToBenchmark(fix.getSpreadToBenchmark());
        presenceBuilder.setSpreadToBenchmark(true);
      }
      if (fix.hasBenchmark()) {
        builder.setBenchmark(fix.getBenchmark());
        presenceBuilder.setBenchmark(true);
      }
      final int noIoiQualifiersGroupCount = fix.getGroupCount(199);
      for (int i = 1; i <= noIoiQualifiersGroupCount; i++) {
        final IndicationofInterest.NoIoiQualifiers group =
            new IndicationofInterest.NoIoiQualifiers();
        fix.getGroup(i, group);
        builder.addNoIoiQualifiers(group.toBuilder().build());
      }

      final int noRoutingIdsGroupCount = fix.getGroupCount(215);
      for (int i = 1; i <= noRoutingIdsGroupCount; i++) {
        final IndicationofInterest.NoRoutingIds group = new IndicationofInterest.NoRoutingIds();
        fix.getGroup(i, group);
        builder.addNoRoutingIds(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("indicationofInterest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.IndicationofInterest,
      garden_leave.gateway.transform.fix42.IndicationofInterest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.IndicationofInterest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.IndicationofInterest fix =
          new garden_leave.gateway.transform.fix42.IndicationofInterest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.IndicationofInterest.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getIoiId()) {
        fix.setIoiId(proto.getIoiId());
      }
      if (fieldPresence.getIoiTransType()) {
        fix.setIoiTransType(proto.getIoiTransType());
      }
      if (fieldPresence.getIoiRefId()) {
        fix.setIoiRefId(proto.getIoiRefId());
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
      if (fieldPresence.getIoiShares()) {
        fix.setIoiShares(proto.getIoiShares());
      }
      if (fieldPresence.getPrice()) {
        fix.setPrice(proto.getPrice());
      }
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getValidUntilTime()) {
        fix.setValidUntilTime(proto.getValidUntilTime());
      }
      if (fieldPresence.getIoiQltyInd()) {
        fix.setIoiQltyInd(proto.getIoiQltyInd());
      }
      if (fieldPresence.getIoiNaturalFlag()) {
        fix.setIoiNaturalFlag(proto.getIoiNaturalFlag());
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
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getUrlLink()) {
        fix.setUrlLink(proto.getUrlLink());
      }
      if (fieldPresence.getSpreadToBenchmark()) {
        fix.setSpreadToBenchmark(proto.getSpreadToBenchmark());
      }
      if (fieldPresence.getBenchmark()) {
        fix.setBenchmark(proto.getBenchmark());
      }
      for (int i = 0; i < proto.getNoIoiQualifiersCount(); i++) {
        final IndicationofInterest.NoIoiQualifiers group =
            new IndicationofInterest.NoIoiQualifiers();
        group.fromProto(proto.getNoIoiQualifiers(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoRoutingIdsCount(); i++) {
        final IndicationofInterest.NoRoutingIds group = new IndicationofInterest.NoRoutingIds();
        group.fromProto(proto.getNoRoutingIds(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
