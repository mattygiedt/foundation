package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.773192600
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

  public static final String BEGINSTR = "FIX.4.4";
  public static final String MSGTYPE = "X";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoMdEntries extends quickfix.Group {
    public static class NoSecurityAltId extends quickfix.Group {
      private final quickfix.StringField securityAltIdField = FieldFactory.newStringField(455);
      public boolean hasSecurityAltId() throws quickfix.FieldNotFound {
        return isSetField(455);
      }
      public String getSecurityAltId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(securityAltIdField));
      }
      public NoSecurityAltId setSecurityAltId(final String value) {
        setField(FieldValue.to(securityAltIdField, value));
        return this;
      }
      public NoSecurityAltId setSecurityAltId(final quickfix.field.SecurityAltID value) {
        setField(FieldValue.to(securityAltIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField securityAltIdSourceField =
          FieldFactory.newStringField(456);
      public boolean hasSecurityAltIdSource() throws quickfix.FieldNotFound {
        return isSetField(456);
      }
      public String getSecurityAltIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(securityAltIdSourceField));
      }
      public NoSecurityAltId setSecurityAltIdSource(final String value) {
        setField(FieldValue.to(securityAltIdSourceField, value));
        return this;
      }
      public NoSecurityAltId setSecurityAltIdSource(
          final quickfix.field.SecurityAltIDSource value) {
        setField(FieldValue.to(securityAltIdSourceField, FieldValue.of(value)));
        return this;
      }

      public NoSecurityAltId() {
        super(454, 455, new int[] {455, 456, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                .NoMdEntries.NoSecurityAltId proto) {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getSecurityAltId()) {
          this.setSecurityAltId(proto.getSecurityAltId());
        }
        if (fieldPresence.getSecurityAltIdSource()) {
          this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
          .NoSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoSecurityAltId.Builder builder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoSecurityAltId.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoSecurityAltId.FieldPresence.newBuilder();

        if (this.hasSecurityAltId()) {
          builder.setSecurityAltId(this.getSecurityAltId());
          presenceBuilder.setSecurityAltId(true);
        }
        if (this.hasSecurityAltIdSource()) {
          builder.setSecurityAltIdSource(this.getSecurityAltIdSource());
          presenceBuilder.setSecurityAltIdSource(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoEvents extends quickfix.Group {
      private final quickfix.IntField eventTypeField = FieldFactory.newIntField(865);
      public boolean hasEventType() throws quickfix.FieldNotFound {
        return isSetField(865);
      }
      public int getEventType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(eventTypeField));
      }
      public NoEvents setEventType(final int value) {
        setField(FieldValue.to(eventTypeField, value));
        return this;
      }
      public NoEvents setEventType(final quickfix.field.EventType value) {
        setField(FieldValue.to(eventTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField eventDateField = FieldFactory.newStringField(866);
      public boolean hasEventDate() throws quickfix.FieldNotFound {
        return isSetField(866);
      }
      public String getEventDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(eventDateField));
      }
      public NoEvents setEventDate(final String value) {
        setField(FieldValue.to(eventDateField, value));
        return this;
      }
      public NoEvents setEventDate(final quickfix.field.EventDate value) {
        setField(FieldValue.to(eventDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField eventPxField = FieldFactory.newDoubleField(867);
      public boolean hasEventPx() throws quickfix.FieldNotFound {
        return isSetField(867);
      }
      public double getEventPx() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(eventPxField));
      }
      public NoEvents setEventPx(final double value) {
        setField(FieldValue.to(eventPxField, value));
        return this;
      }
      public NoEvents setEventPx(final quickfix.field.EventPx value) {
        setField(FieldValue.to(eventPxField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField eventTextField = FieldFactory.newStringField(868);
      public boolean hasEventText() throws quickfix.FieldNotFound {
        return isSetField(868);
      }
      public String getEventText() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(eventTextField));
      }
      public NoEvents setEventText(final String value) {
        setField(FieldValue.to(eventTextField, value));
        return this;
      }
      public NoEvents setEventText(final quickfix.field.EventText value) {
        setField(FieldValue.to(eventTextField, FieldValue.of(value)));
        return this;
      }

      public NoEvents() {
        super(864, 865, new int[] {865, 866, 867, 868, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                .NoMdEntries.NoEvents proto) {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoEvents
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getEventType()) {
          this.setEventType(proto.getEventType());
        }
        if (fieldPresence.getEventDate()) {
          this.setEventDate(proto.getEventDate());
        }
        if (fieldPresence.getEventPx()) {
          this.setEventPx(proto.getEventPx());
        }
        if (fieldPresence.getEventText()) {
          this.setEventText(proto.getEventText());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoEvents
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoEvents
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                   .NoMdEntries.NoEvents.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoEvents
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoEvents
                .FieldPresence.newBuilder();

        if (this.hasEventType()) {
          builder.setEventType(this.getEventType());
          presenceBuilder.setEventType(true);
        }
        if (this.hasEventDate()) {
          builder.setEventDate(this.getEventDate());
          presenceBuilder.setEventDate(true);
        }
        if (this.hasEventPx()) {
          builder.setEventPx(this.getEventPx());
          presenceBuilder.setEventPx(true);
        }
        if (this.hasEventText()) {
          builder.setEventText(this.getEventText());
          presenceBuilder.setEventText(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoUnderlyings extends quickfix.Group {
      public static class NoUnderlyingSecurityAltId extends quickfix.Group {
        private final quickfix.StringField underlyingSecurityAltIdField =
            FieldFactory.newStringField(458);
        public boolean hasUnderlyingSecurityAltId() throws quickfix.FieldNotFound {
          return isSetField(458);
        }
        public String getUnderlyingSecurityAltId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingSecurityAltIdField));
        }
        public NoUnderlyingSecurityAltId setUnderlyingSecurityAltId(final String value) {
          setField(FieldValue.to(underlyingSecurityAltIdField, value));
          return this;
        }
        public NoUnderlyingSecurityAltId setUnderlyingSecurityAltId(
            final quickfix.field.UnderlyingSecurityAltID value) {
          setField(FieldValue.to(underlyingSecurityAltIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.StringField underlyingSecurityAltIdSourceField =
            FieldFactory.newStringField(459);
        public boolean hasUnderlyingSecurityAltIdSource() throws quickfix.FieldNotFound {
          return isSetField(459);
        }
        public String getUnderlyingSecurityAltIdSource() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingSecurityAltIdSourceField));
        }
        public NoUnderlyingSecurityAltId setUnderlyingSecurityAltIdSource(final String value) {
          setField(FieldValue.to(underlyingSecurityAltIdSourceField, value));
          return this;
        }
        public NoUnderlyingSecurityAltId setUnderlyingSecurityAltIdSource(
            final quickfix.field.UnderlyingSecurityAltIDSource value) {
          setField(FieldValue.to(underlyingSecurityAltIdSourceField, FieldValue.of(value)));
          return this;
        }

        public NoUnderlyingSecurityAltId() {
          super(457, 458, new int[] {458, 459, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(
            final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoUnderlyings.NoUnderlyingSecurityAltId proto) {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingSecurityAltId.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getUnderlyingSecurityAltId()) {
            this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
          }
          if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
            this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoUnderlyings.NoUnderlyingSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingSecurityAltId.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                  .NoUnderlyings.NoUnderlyingSecurityAltId.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                  .NoUnderlyings.NoUnderlyingSecurityAltId.FieldPresence.newBuilder();

          if (this.hasUnderlyingSecurityAltId()) {
            builder.setUnderlyingSecurityAltId(this.getUnderlyingSecurityAltId());
            presenceBuilder.setUnderlyingSecurityAltId(true);
          }
          if (this.hasUnderlyingSecurityAltIdSource()) {
            builder.setUnderlyingSecurityAltIdSource(this.getUnderlyingSecurityAltIdSource());
            presenceBuilder.setUnderlyingSecurityAltIdSource(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      public static class NoUnderlyingStips extends quickfix.Group {
        private final quickfix.StringField underlyingStipTypeField =
            FieldFactory.newStringField(888);
        public boolean hasUnderlyingStipType() throws quickfix.FieldNotFound {
          return isSetField(888);
        }
        public String getUnderlyingStipType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingStipTypeField));
        }
        public NoUnderlyingStips setUnderlyingStipType(final String value) {
          setField(FieldValue.to(underlyingStipTypeField, value));
          return this;
        }
        public NoUnderlyingStips setUnderlyingStipType(
            final quickfix.field.UnderlyingStipType value) {
          setField(FieldValue.to(underlyingStipTypeField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.StringField underlyingStipValueField =
            FieldFactory.newStringField(889);
        public boolean hasUnderlyingStipValue() throws quickfix.FieldNotFound {
          return isSetField(889);
        }
        public String getUnderlyingStipValue() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingStipValueField));
        }
        public NoUnderlyingStips setUnderlyingStipValue(final String value) {
          setField(FieldValue.to(underlyingStipValueField, value));
          return this;
        }
        public NoUnderlyingStips setUnderlyingStipValue(
            final quickfix.field.UnderlyingStipValue value) {
          setField(FieldValue.to(underlyingStipValueField, FieldValue.of(value)));
          return this;
        }

        public NoUnderlyingStips() {
          super(887, 888, new int[] {888, 889, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(
            final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoUnderlyings.NoUnderlyingStips proto) {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingStips.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getUnderlyingStipType()) {
            this.setUnderlyingStipType(proto.getUnderlyingStipType());
          }
          if (fieldPresence.getUnderlyingStipValue()) {
            this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoUnderlyings.NoUnderlyingStips.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingStips.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                  .NoUnderlyings.NoUnderlyingStips.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .NoUnderlyings.NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                  .NoUnderlyings.NoUnderlyingStips.FieldPresence.newBuilder();

          if (this.hasUnderlyingStipType()) {
            builder.setUnderlyingStipType(this.getUnderlyingStipType());
            presenceBuilder.setUnderlyingStipType(true);
          }
          if (this.hasUnderlyingStipValue()) {
            builder.setUnderlyingStipValue(this.getUnderlyingStipValue());
            presenceBuilder.setUnderlyingStipValue(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField underlyingSymbolField = FieldFactory.newStringField(311);
      public boolean hasUnderlyingSymbol() throws quickfix.FieldNotFound {
        return isSetField(311);
      }
      public String getUnderlyingSymbol() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSymbolField));
      }
      public NoUnderlyings setUnderlyingSymbol(final String value) {
        setField(FieldValue.to(underlyingSymbolField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSymbol(final quickfix.field.UnderlyingSymbol value) {
        setField(FieldValue.to(underlyingSymbolField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSymbolSfxField =
          FieldFactory.newStringField(312);
      public boolean hasUnderlyingSymbolSfx() throws quickfix.FieldNotFound {
        return isSetField(312);
      }
      public String getUnderlyingSymbolSfx() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSymbolSfxField));
      }
      public NoUnderlyings setUnderlyingSymbolSfx(final String value) {
        setField(FieldValue.to(underlyingSymbolSfxField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSymbolSfx(final quickfix.field.UnderlyingSymbolSfx value) {
        setField(FieldValue.to(underlyingSymbolSfxField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecurityIdField =
          FieldFactory.newStringField(309);
      public boolean hasUnderlyingSecurityId() throws quickfix.FieldNotFound {
        return isSetField(309);
      }
      public String getUnderlyingSecurityId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecurityIdField));
      }
      public NoUnderlyings setUnderlyingSecurityId(final String value) {
        setField(FieldValue.to(underlyingSecurityIdField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecurityId(
          final quickfix.field.UnderlyingSecurityID value) {
        setField(FieldValue.to(underlyingSecurityIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecurityIdSourceField =
          FieldFactory.newStringField(305);
      public boolean hasUnderlyingSecurityIdSource() throws quickfix.FieldNotFound {
        return isSetField(305);
      }
      public String getUnderlyingSecurityIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecurityIdSourceField));
      }
      public NoUnderlyings setUnderlyingSecurityIdSource(final String value) {
        setField(FieldValue.to(underlyingSecurityIdSourceField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecurityIdSource(
          final quickfix.field.UnderlyingSecurityIDSource value) {
        setField(FieldValue.to(underlyingSecurityIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField underlyingProductField = FieldFactory.newIntField(462);
      public boolean hasUnderlyingProduct() throws quickfix.FieldNotFound {
        return isSetField(462);
      }
      public int getUnderlyingProduct() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingProductField));
      }
      public NoUnderlyings setUnderlyingProduct(final int value) {
        setField(FieldValue.to(underlyingProductField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingProduct(final quickfix.field.UnderlyingProduct value) {
        setField(FieldValue.to(underlyingProductField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCfiCodeField = FieldFactory.newStringField(463);
      public boolean hasUnderlyingCfiCode() throws quickfix.FieldNotFound {
        return isSetField(463);
      }
      public String getUnderlyingCfiCode() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCfiCodeField));
      }
      public NoUnderlyings setUnderlyingCfiCode(final String value) {
        setField(FieldValue.to(underlyingCfiCodeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCfiCode(final quickfix.field.UnderlyingCFICode value) {
        setField(FieldValue.to(underlyingCfiCodeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecurityTypeField =
          FieldFactory.newStringField(310);
      public boolean hasUnderlyingSecurityType() throws quickfix.FieldNotFound {
        return isSetField(310);
      }
      public String getUnderlyingSecurityType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecurityTypeField));
      }
      public NoUnderlyings setUnderlyingSecurityType(final String value) {
        setField(FieldValue.to(underlyingSecurityTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecurityType(
          final quickfix.field.UnderlyingSecurityType value) {
        setField(FieldValue.to(underlyingSecurityTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecuritySubTypeField =
          FieldFactory.newStringField(763);
      public boolean hasUnderlyingSecuritySubType() throws quickfix.FieldNotFound {
        return isSetField(763);
      }
      public String getUnderlyingSecuritySubType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecuritySubTypeField));
      }
      public NoUnderlyings setUnderlyingSecuritySubType(final String value) {
        setField(FieldValue.to(underlyingSecuritySubTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecuritySubType(
          final quickfix.field.UnderlyingSecuritySubType value) {
        setField(FieldValue.to(underlyingSecuritySubTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingMaturityMonthYearField =
          FieldFactory.newStringField(313);
      public boolean hasUnderlyingMaturityMonthYear() throws quickfix.FieldNotFound {
        return isSetField(313);
      }
      public String getUnderlyingMaturityMonthYear() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingMaturityMonthYearField));
      }
      public NoUnderlyings setUnderlyingMaturityMonthYear(final String value) {
        setField(FieldValue.to(underlyingMaturityMonthYearField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingMaturityMonthYear(
          final quickfix.field.UnderlyingMaturityMonthYear value) {
        setField(FieldValue.to(underlyingMaturityMonthYearField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingMaturityDateField =
          FieldFactory.newStringField(542);
      public boolean hasUnderlyingMaturityDate() throws quickfix.FieldNotFound {
        return isSetField(542);
      }
      public String getUnderlyingMaturityDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingMaturityDateField));
      }
      public NoUnderlyings setUnderlyingMaturityDate(final String value) {
        setField(FieldValue.to(underlyingMaturityDateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingMaturityDate(
          final quickfix.field.UnderlyingMaturityDate value) {
        setField(FieldValue.to(underlyingMaturityDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField underlyingPutOrCallField = FieldFactory.newIntField(315);
      public boolean hasUnderlyingPutOrCall() throws quickfix.FieldNotFound {
        return isSetField(315);
      }
      public int getUnderlyingPutOrCall() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingPutOrCallField));
      }
      public NoUnderlyings setUnderlyingPutOrCall(final int value) {
        setField(FieldValue.to(underlyingPutOrCallField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingPutOrCall(final quickfix.field.UnderlyingPutOrCall value) {
        setField(FieldValue.to(underlyingPutOrCallField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCouponPaymentDateField =
          FieldFactory.newStringField(241);
      public boolean hasUnderlyingCouponPaymentDate() throws quickfix.FieldNotFound {
        return isSetField(241);
      }
      public String getUnderlyingCouponPaymentDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCouponPaymentDateField));
      }
      public NoUnderlyings setUnderlyingCouponPaymentDate(final String value) {
        setField(FieldValue.to(underlyingCouponPaymentDateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCouponPaymentDate(
          final quickfix.field.UnderlyingCouponPaymentDate value) {
        setField(FieldValue.to(underlyingCouponPaymentDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingIssueDateField =
          FieldFactory.newStringField(242);
      public boolean hasUnderlyingIssueDate() throws quickfix.FieldNotFound {
        return isSetField(242);
      }
      public String getUnderlyingIssueDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingIssueDateField));
      }
      public NoUnderlyings setUnderlyingIssueDate(final String value) {
        setField(FieldValue.to(underlyingIssueDateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingIssueDate(final quickfix.field.UnderlyingIssueDate value) {
        setField(FieldValue.to(underlyingIssueDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingRepoCollateralSecurityTypeField =
          FieldFactory.newStringField(243);
      public boolean hasUnderlyingRepoCollateralSecurityType() throws quickfix.FieldNotFound {
        return isSetField(243);
      }
      public String getUnderlyingRepoCollateralSecurityType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingRepoCollateralSecurityTypeField));
      }
      public NoUnderlyings setUnderlyingRepoCollateralSecurityType(final String value) {
        setField(FieldValue.to(underlyingRepoCollateralSecurityTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingRepoCollateralSecurityType(
          final quickfix.field.UnderlyingRepoCollateralSecurityType value) {
        setField(FieldValue.to(underlyingRepoCollateralSecurityTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField underlyingRepurchaseTermField = FieldFactory.newIntField(244);
      public boolean hasUnderlyingRepurchaseTerm() throws quickfix.FieldNotFound {
        return isSetField(244);
      }
      public int getUnderlyingRepurchaseTerm() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingRepurchaseTermField));
      }
      public NoUnderlyings setUnderlyingRepurchaseTerm(final int value) {
        setField(FieldValue.to(underlyingRepurchaseTermField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingRepurchaseTerm(
          final quickfix.field.UnderlyingRepurchaseTerm value) {
        setField(FieldValue.to(underlyingRepurchaseTermField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingRepurchaseRateField =
          FieldFactory.newDoubleField(245);
      public boolean hasUnderlyingRepurchaseRate() throws quickfix.FieldNotFound {
        return isSetField(245);
      }
      public double getUnderlyingRepurchaseRate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingRepurchaseRateField));
      }
      public NoUnderlyings setUnderlyingRepurchaseRate(final double value) {
        setField(FieldValue.to(underlyingRepurchaseRateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingRepurchaseRate(
          final quickfix.field.UnderlyingRepurchaseRate value) {
        setField(FieldValue.to(underlyingRepurchaseRateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingFactorField = FieldFactory.newDoubleField(246);
      public boolean hasUnderlyingFactor() throws quickfix.FieldNotFound {
        return isSetField(246);
      }
      public double getUnderlyingFactor() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingFactorField));
      }
      public NoUnderlyings setUnderlyingFactor(final double value) {
        setField(FieldValue.to(underlyingFactorField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFactor(final quickfix.field.UnderlyingFactor value) {
        setField(FieldValue.to(underlyingFactorField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCreditRatingField =
          FieldFactory.newStringField(256);
      public boolean hasUnderlyingCreditRating() throws quickfix.FieldNotFound {
        return isSetField(256);
      }
      public String getUnderlyingCreditRating() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCreditRatingField));
      }
      public NoUnderlyings setUnderlyingCreditRating(final String value) {
        setField(FieldValue.to(underlyingCreditRatingField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCreditRating(
          final quickfix.field.UnderlyingCreditRating value) {
        setField(FieldValue.to(underlyingCreditRatingField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingInstrRegistryField =
          FieldFactory.newStringField(595);
      public boolean hasUnderlyingInstrRegistry() throws quickfix.FieldNotFound {
        return isSetField(595);
      }
      public String getUnderlyingInstrRegistry() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingInstrRegistryField));
      }
      public NoUnderlyings setUnderlyingInstrRegistry(final String value) {
        setField(FieldValue.to(underlyingInstrRegistryField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingInstrRegistry(
          final quickfix.field.UnderlyingInstrRegistry value) {
        setField(FieldValue.to(underlyingInstrRegistryField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCountryOfIssueField =
          FieldFactory.newStringField(592);
      public boolean hasUnderlyingCountryOfIssue() throws quickfix.FieldNotFound {
        return isSetField(592);
      }
      public String getUnderlyingCountryOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCountryOfIssueField));
      }
      public NoUnderlyings setUnderlyingCountryOfIssue(final String value) {
        setField(FieldValue.to(underlyingCountryOfIssueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCountryOfIssue(
          final quickfix.field.UnderlyingCountryOfIssue value) {
        setField(FieldValue.to(underlyingCountryOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingStateOrProvinceOfIssueField =
          FieldFactory.newStringField(593);
      public boolean hasUnderlyingStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
        return isSetField(593);
      }
      public String getUnderlyingStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingStateOrProvinceOfIssueField));
      }
      public NoUnderlyings setUnderlyingStateOrProvinceOfIssue(final String value) {
        setField(FieldValue.to(underlyingStateOrProvinceOfIssueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingStateOrProvinceOfIssue(
          final quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
        setField(FieldValue.to(underlyingStateOrProvinceOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingLocaleOfIssueField =
          FieldFactory.newStringField(594);
      public boolean hasUnderlyingLocaleOfIssue() throws quickfix.FieldNotFound {
        return isSetField(594);
      }
      public String getUnderlyingLocaleOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingLocaleOfIssueField));
      }
      public NoUnderlyings setUnderlyingLocaleOfIssue(final String value) {
        setField(FieldValue.to(underlyingLocaleOfIssueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingLocaleOfIssue(
          final quickfix.field.UnderlyingLocaleOfIssue value) {
        setField(FieldValue.to(underlyingLocaleOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingRedemptionDateField =
          FieldFactory.newStringField(247);
      public boolean hasUnderlyingRedemptionDate() throws quickfix.FieldNotFound {
        return isSetField(247);
      }
      public String getUnderlyingRedemptionDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingRedemptionDateField));
      }
      public NoUnderlyings setUnderlyingRedemptionDate(final String value) {
        setField(FieldValue.to(underlyingRedemptionDateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingRedemptionDate(
          final quickfix.field.UnderlyingRedemptionDate value) {
        setField(FieldValue.to(underlyingRedemptionDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingStrikePriceField =
          FieldFactory.newDoubleField(316);
      public boolean hasUnderlyingStrikePrice() throws quickfix.FieldNotFound {
        return isSetField(316);
      }
      public double getUnderlyingStrikePrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingStrikePriceField));
      }
      public NoUnderlyings setUnderlyingStrikePrice(final double value) {
        setField(FieldValue.to(underlyingStrikePriceField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingStrikePrice(
          final quickfix.field.UnderlyingStrikePrice value) {
        setField(FieldValue.to(underlyingStrikePriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingStrikeCurrencyField =
          FieldFactory.newStringField(941);
      public boolean hasUnderlyingStrikeCurrency() throws quickfix.FieldNotFound {
        return isSetField(941);
      }
      public String getUnderlyingStrikeCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingStrikeCurrencyField));
      }
      public NoUnderlyings setUnderlyingStrikeCurrency(final String value) {
        setField(FieldValue.to(underlyingStrikeCurrencyField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingStrikeCurrency(
          final quickfix.field.UnderlyingStrikeCurrency value) {
        setField(FieldValue.to(underlyingStrikeCurrencyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField underlyingOptAttributeField = FieldFactory.newCharField(317);
      public boolean hasUnderlyingOptAttribute() throws quickfix.FieldNotFound {
        return isSetField(317);
      }
      public int getUnderlyingOptAttribute() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingOptAttributeField));
      }
      public NoUnderlyings setUnderlyingOptAttribute(final int value) {
        setField(FieldValue.to(underlyingOptAttributeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingOptAttribute(final char value) {
        setField(FieldValue.to(underlyingOptAttributeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingOptAttribute(final String value) {
        setField(FieldValue.to(underlyingOptAttributeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingOptAttribute(
          final quickfix.field.UnderlyingOptAttribute value) {
        setField(FieldValue.to(underlyingOptAttributeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingContractMultiplierField =
          FieldFactory.newDoubleField(436);
      public boolean hasUnderlyingContractMultiplier() throws quickfix.FieldNotFound {
        return isSetField(436);
      }
      public double getUnderlyingContractMultiplier() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingContractMultiplierField));
      }
      public NoUnderlyings setUnderlyingContractMultiplier(final double value) {
        setField(FieldValue.to(underlyingContractMultiplierField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingContractMultiplier(
          final quickfix.field.UnderlyingContractMultiplier value) {
        setField(FieldValue.to(underlyingContractMultiplierField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingCouponRateField =
          FieldFactory.newDoubleField(435);
      public boolean hasUnderlyingCouponRate() throws quickfix.FieldNotFound {
        return isSetField(435);
      }
      public double getUnderlyingCouponRate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCouponRateField));
      }
      public NoUnderlyings setUnderlyingCouponRate(final double value) {
        setField(FieldValue.to(underlyingCouponRateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCouponRate(
          final quickfix.field.UnderlyingCouponRate value) {
        setField(FieldValue.to(underlyingCouponRateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecurityExchangeField =
          FieldFactory.newStringField(308);
      public boolean hasUnderlyingSecurityExchange() throws quickfix.FieldNotFound {
        return isSetField(308);
      }
      public String getUnderlyingSecurityExchange() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecurityExchangeField));
      }
      public NoUnderlyings setUnderlyingSecurityExchange(final String value) {
        setField(FieldValue.to(underlyingSecurityExchangeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecurityExchange(
          final quickfix.field.UnderlyingSecurityExchange value) {
        setField(FieldValue.to(underlyingSecurityExchangeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingIssuerField = FieldFactory.newStringField(306);
      public boolean hasUnderlyingIssuer() throws quickfix.FieldNotFound {
        return isSetField(306);
      }
      public String getUnderlyingIssuer() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingIssuerField));
      }
      public NoUnderlyings setUnderlyingIssuer(final String value) {
        setField(FieldValue.to(underlyingIssuerField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingIssuer(final quickfix.field.UnderlyingIssuer value) {
        setField(FieldValue.to(underlyingIssuerField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField encodedUnderlyingIssuerLenField =
          FieldFactory.newIntField(362);
      public boolean hasEncodedUnderlyingIssuerLen() throws quickfix.FieldNotFound {
        return isSetField(362);
      }
      public int getEncodedUnderlyingIssuerLen() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedUnderlyingIssuerLenField));
      }
      public NoUnderlyings setEncodedUnderlyingIssuerLen(final int value) {
        setField(FieldValue.to(encodedUnderlyingIssuerLenField, value));
        return this;
      }
      public NoUnderlyings setEncodedUnderlyingIssuerLen(
          final quickfix.field.EncodedUnderlyingIssuerLen value) {
        setField(FieldValue.to(encodedUnderlyingIssuerLenField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField encodedUnderlyingIssuerField =
          FieldFactory.newStringField(363);
      public boolean hasEncodedUnderlyingIssuer() throws quickfix.FieldNotFound {
        return isSetField(363);
      }
      public String getEncodedUnderlyingIssuer() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedUnderlyingIssuerField));
      }
      public NoUnderlyings setEncodedUnderlyingIssuer(final String value) {
        setField(FieldValue.to(encodedUnderlyingIssuerField, value));
        return this;
      }
      public NoUnderlyings setEncodedUnderlyingIssuer(
          final quickfix.field.EncodedUnderlyingIssuer value) {
        setField(FieldValue.to(encodedUnderlyingIssuerField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSecurityDescField =
          FieldFactory.newStringField(307);
      public boolean hasUnderlyingSecurityDesc() throws quickfix.FieldNotFound {
        return isSetField(307);
      }
      public String getUnderlyingSecurityDesc() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSecurityDescField));
      }
      public NoUnderlyings setUnderlyingSecurityDesc(final String value) {
        setField(FieldValue.to(underlyingSecurityDescField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSecurityDesc(
          final quickfix.field.UnderlyingSecurityDesc value) {
        setField(FieldValue.to(underlyingSecurityDescField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField encodedUnderlyingSecurityDescLenField =
          FieldFactory.newIntField(364);
      public boolean hasEncodedUnderlyingSecurityDescLen() throws quickfix.FieldNotFound {
        return isSetField(364);
      }
      public int getEncodedUnderlyingSecurityDescLen() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedUnderlyingSecurityDescLenField));
      }
      public NoUnderlyings setEncodedUnderlyingSecurityDescLen(final int value) {
        setField(FieldValue.to(encodedUnderlyingSecurityDescLenField, value));
        return this;
      }
      public NoUnderlyings setEncodedUnderlyingSecurityDescLen(
          final quickfix.field.EncodedUnderlyingSecurityDescLen value) {
        setField(FieldValue.to(encodedUnderlyingSecurityDescLenField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField encodedUnderlyingSecurityDescField =
          FieldFactory.newStringField(365);
      public boolean hasEncodedUnderlyingSecurityDesc() throws quickfix.FieldNotFound {
        return isSetField(365);
      }
      public String getEncodedUnderlyingSecurityDesc() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedUnderlyingSecurityDescField));
      }
      public NoUnderlyings setEncodedUnderlyingSecurityDesc(final String value) {
        setField(FieldValue.to(encodedUnderlyingSecurityDescField, value));
        return this;
      }
      public NoUnderlyings setEncodedUnderlyingSecurityDesc(
          final quickfix.field.EncodedUnderlyingSecurityDesc value) {
        setField(FieldValue.to(encodedUnderlyingSecurityDescField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCpProgramField =
          FieldFactory.newStringField(877);
      public boolean hasUnderlyingCpProgram() throws quickfix.FieldNotFound {
        return isSetField(877);
      }
      public String getUnderlyingCpProgram() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCpProgramField));
      }
      public NoUnderlyings setUnderlyingCpProgram(final String value) {
        setField(FieldValue.to(underlyingCpProgramField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCpProgram(final quickfix.field.UnderlyingCPProgram value) {
        setField(FieldValue.to(underlyingCpProgramField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCpRegTypeField =
          FieldFactory.newStringField(878);
      public boolean hasUnderlyingCpRegType() throws quickfix.FieldNotFound {
        return isSetField(878);
      }
      public String getUnderlyingCpRegType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCpRegTypeField));
      }
      public NoUnderlyings setUnderlyingCpRegType(final String value) {
        setField(FieldValue.to(underlyingCpRegTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCpRegType(final quickfix.field.UnderlyingCPRegType value) {
        setField(FieldValue.to(underlyingCpRegTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCurrencyField = FieldFactory.newStringField(318);
      public boolean hasUnderlyingCurrency() throws quickfix.FieldNotFound {
        return isSetField(318);
      }
      public String getUnderlyingCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCurrencyField));
      }
      public NoUnderlyings setUnderlyingCurrency(final String value) {
        setField(FieldValue.to(underlyingCurrencyField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCurrency(final quickfix.field.UnderlyingCurrency value) {
        setField(FieldValue.to(underlyingCurrencyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingQtyField = FieldFactory.newDoubleField(879);
      public boolean hasUnderlyingQty() throws quickfix.FieldNotFound {
        return isSetField(879);
      }
      public double getUnderlyingQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingQtyField));
      }
      public NoUnderlyings setUnderlyingQty(final double value) {
        setField(FieldValue.to(underlyingQtyField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingQty(final quickfix.field.UnderlyingQty value) {
        setField(FieldValue.to(underlyingQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingPxField = FieldFactory.newDoubleField(810);
      public boolean hasUnderlyingPx() throws quickfix.FieldNotFound {
        return isSetField(810);
      }
      public double getUnderlyingPx() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingPxField));
      }
      public NoUnderlyings setUnderlyingPx(final double value) {
        setField(FieldValue.to(underlyingPxField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingPx(final quickfix.field.UnderlyingPx value) {
        setField(FieldValue.to(underlyingPxField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingDirtyPriceField =
          FieldFactory.newDoubleField(882);
      public boolean hasUnderlyingDirtyPrice() throws quickfix.FieldNotFound {
        return isSetField(882);
      }
      public double getUnderlyingDirtyPrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingDirtyPriceField));
      }
      public NoUnderlyings setUnderlyingDirtyPrice(final double value) {
        setField(FieldValue.to(underlyingDirtyPriceField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingDirtyPrice(
          final quickfix.field.UnderlyingDirtyPrice value) {
        setField(FieldValue.to(underlyingDirtyPriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingEndPriceField = FieldFactory.newDoubleField(883);
      public boolean hasUnderlyingEndPrice() throws quickfix.FieldNotFound {
        return isSetField(883);
      }
      public double getUnderlyingEndPrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingEndPriceField));
      }
      public NoUnderlyings setUnderlyingEndPrice(final double value) {
        setField(FieldValue.to(underlyingEndPriceField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingEndPrice(final quickfix.field.UnderlyingEndPrice value) {
        setField(FieldValue.to(underlyingEndPriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingStartValueField =
          FieldFactory.newDoubleField(884);
      public boolean hasUnderlyingStartValue() throws quickfix.FieldNotFound {
        return isSetField(884);
      }
      public double getUnderlyingStartValue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingStartValueField));
      }
      public NoUnderlyings setUnderlyingStartValue(final double value) {
        setField(FieldValue.to(underlyingStartValueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingStartValue(
          final quickfix.field.UnderlyingStartValue value) {
        setField(FieldValue.to(underlyingStartValueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingCurrentValueField =
          FieldFactory.newDoubleField(885);
      public boolean hasUnderlyingCurrentValue() throws quickfix.FieldNotFound {
        return isSetField(885);
      }
      public double getUnderlyingCurrentValue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCurrentValueField));
      }
      public NoUnderlyings setUnderlyingCurrentValue(final double value) {
        setField(FieldValue.to(underlyingCurrentValueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCurrentValue(
          final quickfix.field.UnderlyingCurrentValue value) {
        setField(FieldValue.to(underlyingCurrentValueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingEndValueField = FieldFactory.newDoubleField(886);
      public boolean hasUnderlyingEndValue() throws quickfix.FieldNotFound {
        return isSetField(886);
      }
      public double getUnderlyingEndValue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingEndValueField));
      }
      public NoUnderlyings setUnderlyingEndValue(final double value) {
        setField(FieldValue.to(underlyingEndValueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingEndValue(final quickfix.field.UnderlyingEndValue value) {
        setField(FieldValue.to(underlyingEndValueField, FieldValue.of(value)));
        return this;
      }

      public NoUnderlyings() {
        super(711, 311,
            new int[] {311, 312, 309, 305, 462, 463, 310, 763, 313, 542, 315, 241, 242, 243, 244,
                245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363,
                307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                .NoMdEntries.NoUnderlyings proto) {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoUnderlyings.FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoUnderlyingSecurityAltIdCount(); i++) {
          final NoUnderlyings.NoUnderlyingSecurityAltId group =
              new NoUnderlyings.NoUnderlyingSecurityAltId();
          group.fromProto(proto.getNoUnderlyingSecurityAltId(i));
          this.addGroupRef(group);
        }
        for (int i = 0; i < proto.getNoUnderlyingStipsCount(); i++) {
          final NoUnderlyings.NoUnderlyingStips group = new NoUnderlyings.NoUnderlyingStips();
          group.fromProto(proto.getNoUnderlyingStips(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getUnderlyingSymbol()) {
          this.setUnderlyingSymbol(proto.getUnderlyingSymbol());
        }
        if (fieldPresence.getUnderlyingSymbolSfx()) {
          this.setUnderlyingSymbolSfx(proto.getUnderlyingSymbolSfx());
        }
        if (fieldPresence.getUnderlyingSecurityId()) {
          this.setUnderlyingSecurityId(proto.getUnderlyingSecurityId());
        }
        if (fieldPresence.getUnderlyingSecurityIdSource()) {
          this.setUnderlyingSecurityIdSource(proto.getUnderlyingSecurityIdSource());
        }
        if (fieldPresence.getUnderlyingProduct()) {
          this.setUnderlyingProduct(proto.getUnderlyingProduct());
        }
        if (fieldPresence.getUnderlyingCfiCode()) {
          this.setUnderlyingCfiCode(proto.getUnderlyingCfiCode());
        }
        if (fieldPresence.getUnderlyingSecurityType()) {
          this.setUnderlyingSecurityType(proto.getUnderlyingSecurityType());
        }
        if (fieldPresence.getUnderlyingSecuritySubType()) {
          this.setUnderlyingSecuritySubType(proto.getUnderlyingSecuritySubType());
        }
        if (fieldPresence.getUnderlyingMaturityMonthYear()) {
          this.setUnderlyingMaturityMonthYear(proto.getUnderlyingMaturityMonthYear());
        }
        if (fieldPresence.getUnderlyingMaturityDate()) {
          this.setUnderlyingMaturityDate(proto.getUnderlyingMaturityDate());
        }
        if (fieldPresence.getUnderlyingPutOrCall()) {
          this.setUnderlyingPutOrCall(proto.getUnderlyingPutOrCall());
        }
        if (fieldPresence.getUnderlyingCouponPaymentDate()) {
          this.setUnderlyingCouponPaymentDate(proto.getUnderlyingCouponPaymentDate());
        }
        if (fieldPresence.getUnderlyingIssueDate()) {
          this.setUnderlyingIssueDate(proto.getUnderlyingIssueDate());
        }
        if (fieldPresence.getUnderlyingRepoCollateralSecurityType()) {
          this.setUnderlyingRepoCollateralSecurityType(
              proto.getUnderlyingRepoCollateralSecurityType());
        }
        if (fieldPresence.getUnderlyingRepurchaseTerm()) {
          this.setUnderlyingRepurchaseTerm(proto.getUnderlyingRepurchaseTerm());
        }
        if (fieldPresence.getUnderlyingRepurchaseRate()) {
          this.setUnderlyingRepurchaseRate(proto.getUnderlyingRepurchaseRate());
        }
        if (fieldPresence.getUnderlyingFactor()) {
          this.setUnderlyingFactor(proto.getUnderlyingFactor());
        }
        if (fieldPresence.getUnderlyingCreditRating()) {
          this.setUnderlyingCreditRating(proto.getUnderlyingCreditRating());
        }
        if (fieldPresence.getUnderlyingInstrRegistry()) {
          this.setUnderlyingInstrRegistry(proto.getUnderlyingInstrRegistry());
        }
        if (fieldPresence.getUnderlyingCountryOfIssue()) {
          this.setUnderlyingCountryOfIssue(proto.getUnderlyingCountryOfIssue());
        }
        if (fieldPresence.getUnderlyingStateOrProvinceOfIssue()) {
          this.setUnderlyingStateOrProvinceOfIssue(proto.getUnderlyingStateOrProvinceOfIssue());
        }
        if (fieldPresence.getUnderlyingLocaleOfIssue()) {
          this.setUnderlyingLocaleOfIssue(proto.getUnderlyingLocaleOfIssue());
        }
        if (fieldPresence.getUnderlyingRedemptionDate()) {
          this.setUnderlyingRedemptionDate(proto.getUnderlyingRedemptionDate());
        }
        if (fieldPresence.getUnderlyingStrikePrice()) {
          this.setUnderlyingStrikePrice(proto.getUnderlyingStrikePrice());
        }
        if (fieldPresence.getUnderlyingStrikeCurrency()) {
          this.setUnderlyingStrikeCurrency(proto.getUnderlyingStrikeCurrency());
        }
        if (fieldPresence.getUnderlyingOptAttribute()) {
          this.setUnderlyingOptAttribute(proto.getUnderlyingOptAttribute());
        }
        if (fieldPresence.getUnderlyingContractMultiplier()) {
          this.setUnderlyingContractMultiplier(proto.getUnderlyingContractMultiplier());
        }
        if (fieldPresence.getUnderlyingCouponRate()) {
          this.setUnderlyingCouponRate(proto.getUnderlyingCouponRate());
        }
        if (fieldPresence.getUnderlyingSecurityExchange()) {
          this.setUnderlyingSecurityExchange(proto.getUnderlyingSecurityExchange());
        }
        if (fieldPresence.getUnderlyingIssuer()) {
          this.setUnderlyingIssuer(proto.getUnderlyingIssuer());
        }
        if (fieldPresence.getEncodedUnderlyingIssuerLen()) {
          this.setEncodedUnderlyingIssuerLen(proto.getEncodedUnderlyingIssuerLen());
        }
        if (fieldPresence.getEncodedUnderlyingIssuer()) {
          this.setEncodedUnderlyingIssuer(proto.getEncodedUnderlyingIssuer());
        }
        if (fieldPresence.getUnderlyingSecurityDesc()) {
          this.setUnderlyingSecurityDesc(proto.getUnderlyingSecurityDesc());
        }
        if (fieldPresence.getEncodedUnderlyingSecurityDescLen()) {
          this.setEncodedUnderlyingSecurityDescLen(proto.getEncodedUnderlyingSecurityDescLen());
        }
        if (fieldPresence.getEncodedUnderlyingSecurityDesc()) {
          this.setEncodedUnderlyingSecurityDesc(proto.getEncodedUnderlyingSecurityDesc());
        }
        if (fieldPresence.getUnderlyingCpProgram()) {
          this.setUnderlyingCpProgram(proto.getUnderlyingCpProgram());
        }
        if (fieldPresence.getUnderlyingCpRegType()) {
          this.setUnderlyingCpRegType(proto.getUnderlyingCpRegType());
        }
        if (fieldPresence.getUnderlyingCurrency()) {
          this.setUnderlyingCurrency(proto.getUnderlyingCurrency());
        }
        if (fieldPresence.getUnderlyingQty()) {
          this.setUnderlyingQty(proto.getUnderlyingQty());
        }
        if (fieldPresence.getUnderlyingPx()) {
          this.setUnderlyingPx(proto.getUnderlyingPx());
        }
        if (fieldPresence.getUnderlyingDirtyPrice()) {
          this.setUnderlyingDirtyPrice(proto.getUnderlyingDirtyPrice());
        }
        if (fieldPresence.getUnderlyingEndPrice()) {
          this.setUnderlyingEndPrice(proto.getUnderlyingEndPrice());
        }
        if (fieldPresence.getUnderlyingStartValue()) {
          this.setUnderlyingStartValue(proto.getUnderlyingStartValue());
        }
        if (fieldPresence.getUnderlyingCurrentValue()) {
          this.setUnderlyingCurrentValue(proto.getUnderlyingCurrentValue());
        }
        if (fieldPresence.getUnderlyingEndValue()) {
          this.setUnderlyingEndValue(proto.getUnderlyingEndValue());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
          .NoUnderlyings.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoUnderlyings.Builder builder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoUnderlyings.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
            .NoUnderlyings.FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoUnderlyings.FieldPresence.newBuilder();

        final int noUnderlyingSecurityAltIdGroupCount = this.getGroupCount(457);
        for (int i = 1; i <= noUnderlyingSecurityAltIdGroupCount; i++) {
          final NoUnderlyings.NoUnderlyingSecurityAltId group =
              new NoUnderlyings.NoUnderlyingSecurityAltId();
          this.getGroup(i, group);
          builder.addNoUnderlyingSecurityAltId(group.toBuilder().build());
        }

        final int noUnderlyingStipsGroupCount = this.getGroupCount(887);
        for (int i = 1; i <= noUnderlyingStipsGroupCount; i++) {
          final NoUnderlyings.NoUnderlyingStips group = new NoUnderlyings.NoUnderlyingStips();
          this.getGroup(i, group);
          builder.addNoUnderlyingStips(group.toBuilder().build());
        }

        if (this.hasUnderlyingSymbol()) {
          builder.setUnderlyingSymbol(this.getUnderlyingSymbol());
          presenceBuilder.setUnderlyingSymbol(true);
        }
        if (this.hasUnderlyingSymbolSfx()) {
          builder.setUnderlyingSymbolSfx(this.getUnderlyingSymbolSfx());
          presenceBuilder.setUnderlyingSymbolSfx(true);
        }
        if (this.hasUnderlyingSecurityId()) {
          builder.setUnderlyingSecurityId(this.getUnderlyingSecurityId());
          presenceBuilder.setUnderlyingSecurityId(true);
        }
        if (this.hasUnderlyingSecurityIdSource()) {
          builder.setUnderlyingSecurityIdSource(this.getUnderlyingSecurityIdSource());
          presenceBuilder.setUnderlyingSecurityIdSource(true);
        }
        if (this.hasUnderlyingProduct()) {
          builder.setUnderlyingProduct(this.getUnderlyingProduct());
          presenceBuilder.setUnderlyingProduct(true);
        }
        if (this.hasUnderlyingCfiCode()) {
          builder.setUnderlyingCfiCode(this.getUnderlyingCfiCode());
          presenceBuilder.setUnderlyingCfiCode(true);
        }
        if (this.hasUnderlyingSecurityType()) {
          builder.setUnderlyingSecurityType(this.getUnderlyingSecurityType());
          presenceBuilder.setUnderlyingSecurityType(true);
        }
        if (this.hasUnderlyingSecuritySubType()) {
          builder.setUnderlyingSecuritySubType(this.getUnderlyingSecuritySubType());
          presenceBuilder.setUnderlyingSecuritySubType(true);
        }
        if (this.hasUnderlyingMaturityMonthYear()) {
          builder.setUnderlyingMaturityMonthYear(this.getUnderlyingMaturityMonthYear());
          presenceBuilder.setUnderlyingMaturityMonthYear(true);
        }
        if (this.hasUnderlyingMaturityDate()) {
          builder.setUnderlyingMaturityDate(this.getUnderlyingMaturityDate());
          presenceBuilder.setUnderlyingMaturityDate(true);
        }
        if (this.hasUnderlyingPutOrCall()) {
          builder.setUnderlyingPutOrCall(this.getUnderlyingPutOrCall());
          presenceBuilder.setUnderlyingPutOrCall(true);
        }
        if (this.hasUnderlyingCouponPaymentDate()) {
          builder.setUnderlyingCouponPaymentDate(this.getUnderlyingCouponPaymentDate());
          presenceBuilder.setUnderlyingCouponPaymentDate(true);
        }
        if (this.hasUnderlyingIssueDate()) {
          builder.setUnderlyingIssueDate(this.getUnderlyingIssueDate());
          presenceBuilder.setUnderlyingIssueDate(true);
        }
        if (this.hasUnderlyingRepoCollateralSecurityType()) {
          builder.setUnderlyingRepoCollateralSecurityType(
              this.getUnderlyingRepoCollateralSecurityType());
          presenceBuilder.setUnderlyingRepoCollateralSecurityType(true);
        }
        if (this.hasUnderlyingRepurchaseTerm()) {
          builder.setUnderlyingRepurchaseTerm(this.getUnderlyingRepurchaseTerm());
          presenceBuilder.setUnderlyingRepurchaseTerm(true);
        }
        if (this.hasUnderlyingRepurchaseRate()) {
          builder.setUnderlyingRepurchaseRate(this.getUnderlyingRepurchaseRate());
          presenceBuilder.setUnderlyingRepurchaseRate(true);
        }
        if (this.hasUnderlyingFactor()) {
          builder.setUnderlyingFactor(this.getUnderlyingFactor());
          presenceBuilder.setUnderlyingFactor(true);
        }
        if (this.hasUnderlyingCreditRating()) {
          builder.setUnderlyingCreditRating(this.getUnderlyingCreditRating());
          presenceBuilder.setUnderlyingCreditRating(true);
        }
        if (this.hasUnderlyingInstrRegistry()) {
          builder.setUnderlyingInstrRegistry(this.getUnderlyingInstrRegistry());
          presenceBuilder.setUnderlyingInstrRegistry(true);
        }
        if (this.hasUnderlyingCountryOfIssue()) {
          builder.setUnderlyingCountryOfIssue(this.getUnderlyingCountryOfIssue());
          presenceBuilder.setUnderlyingCountryOfIssue(true);
        }
        if (this.hasUnderlyingStateOrProvinceOfIssue()) {
          builder.setUnderlyingStateOrProvinceOfIssue(this.getUnderlyingStateOrProvinceOfIssue());
          presenceBuilder.setUnderlyingStateOrProvinceOfIssue(true);
        }
        if (this.hasUnderlyingLocaleOfIssue()) {
          builder.setUnderlyingLocaleOfIssue(this.getUnderlyingLocaleOfIssue());
          presenceBuilder.setUnderlyingLocaleOfIssue(true);
        }
        if (this.hasUnderlyingRedemptionDate()) {
          builder.setUnderlyingRedemptionDate(this.getUnderlyingRedemptionDate());
          presenceBuilder.setUnderlyingRedemptionDate(true);
        }
        if (this.hasUnderlyingStrikePrice()) {
          builder.setUnderlyingStrikePrice(this.getUnderlyingStrikePrice());
          presenceBuilder.setUnderlyingStrikePrice(true);
        }
        if (this.hasUnderlyingStrikeCurrency()) {
          builder.setUnderlyingStrikeCurrency(this.getUnderlyingStrikeCurrency());
          presenceBuilder.setUnderlyingStrikeCurrency(true);
        }
        if (this.hasUnderlyingOptAttribute()) {
          builder.setUnderlyingOptAttribute(this.getUnderlyingOptAttribute());
          presenceBuilder.setUnderlyingOptAttribute(true);
        }
        if (this.hasUnderlyingContractMultiplier()) {
          builder.setUnderlyingContractMultiplier(this.getUnderlyingContractMultiplier());
          presenceBuilder.setUnderlyingContractMultiplier(true);
        }
        if (this.hasUnderlyingCouponRate()) {
          builder.setUnderlyingCouponRate(this.getUnderlyingCouponRate());
          presenceBuilder.setUnderlyingCouponRate(true);
        }
        if (this.hasUnderlyingSecurityExchange()) {
          builder.setUnderlyingSecurityExchange(this.getUnderlyingSecurityExchange());
          presenceBuilder.setUnderlyingSecurityExchange(true);
        }
        if (this.hasUnderlyingIssuer()) {
          builder.setUnderlyingIssuer(this.getUnderlyingIssuer());
          presenceBuilder.setUnderlyingIssuer(true);
        }
        if (this.hasEncodedUnderlyingIssuerLen()) {
          builder.setEncodedUnderlyingIssuerLen(this.getEncodedUnderlyingIssuerLen());
          presenceBuilder.setEncodedUnderlyingIssuerLen(true);
        }
        if (this.hasEncodedUnderlyingIssuer()) {
          builder.setEncodedUnderlyingIssuer(this.getEncodedUnderlyingIssuer());
          presenceBuilder.setEncodedUnderlyingIssuer(true);
        }
        if (this.hasUnderlyingSecurityDesc()) {
          builder.setUnderlyingSecurityDesc(this.getUnderlyingSecurityDesc());
          presenceBuilder.setUnderlyingSecurityDesc(true);
        }
        if (this.hasEncodedUnderlyingSecurityDescLen()) {
          builder.setEncodedUnderlyingSecurityDescLen(this.getEncodedUnderlyingSecurityDescLen());
          presenceBuilder.setEncodedUnderlyingSecurityDescLen(true);
        }
        if (this.hasEncodedUnderlyingSecurityDesc()) {
          builder.setEncodedUnderlyingSecurityDesc(this.getEncodedUnderlyingSecurityDesc());
          presenceBuilder.setEncodedUnderlyingSecurityDesc(true);
        }
        if (this.hasUnderlyingCpProgram()) {
          builder.setUnderlyingCpProgram(this.getUnderlyingCpProgram());
          presenceBuilder.setUnderlyingCpProgram(true);
        }
        if (this.hasUnderlyingCpRegType()) {
          builder.setUnderlyingCpRegType(this.getUnderlyingCpRegType());
          presenceBuilder.setUnderlyingCpRegType(true);
        }
        if (this.hasUnderlyingCurrency()) {
          builder.setUnderlyingCurrency(this.getUnderlyingCurrency());
          presenceBuilder.setUnderlyingCurrency(true);
        }
        if (this.hasUnderlyingQty()) {
          builder.setUnderlyingQty(this.getUnderlyingQty());
          presenceBuilder.setUnderlyingQty(true);
        }
        if (this.hasUnderlyingPx()) {
          builder.setUnderlyingPx(this.getUnderlyingPx());
          presenceBuilder.setUnderlyingPx(true);
        }
        if (this.hasUnderlyingDirtyPrice()) {
          builder.setUnderlyingDirtyPrice(this.getUnderlyingDirtyPrice());
          presenceBuilder.setUnderlyingDirtyPrice(true);
        }
        if (this.hasUnderlyingEndPrice()) {
          builder.setUnderlyingEndPrice(this.getUnderlyingEndPrice());
          presenceBuilder.setUnderlyingEndPrice(true);
        }
        if (this.hasUnderlyingStartValue()) {
          builder.setUnderlyingStartValue(this.getUnderlyingStartValue());
          presenceBuilder.setUnderlyingStartValue(true);
        }
        if (this.hasUnderlyingCurrentValue()) {
          builder.setUnderlyingCurrentValue(this.getUnderlyingCurrentValue());
          presenceBuilder.setUnderlyingCurrentValue(true);
        }
        if (this.hasUnderlyingEndValue()) {
          builder.setUnderlyingEndValue(this.getUnderlyingEndValue());
          presenceBuilder.setUnderlyingEndValue(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoLegs extends quickfix.Group {
      public static class NoLegSecurityAltId extends quickfix.Group {
        private final quickfix.StringField legSecurityAltIdField = FieldFactory.newStringField(605);
        public boolean hasLegSecurityAltId() throws quickfix.FieldNotFound {
          return isSetField(605);
        }
        public String getLegSecurityAltId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(legSecurityAltIdField));
        }
        public NoLegSecurityAltId setLegSecurityAltId(final String value) {
          setField(FieldValue.to(legSecurityAltIdField, value));
          return this;
        }
        public NoLegSecurityAltId setLegSecurityAltId(final quickfix.field.LegSecurityAltID value) {
          setField(FieldValue.to(legSecurityAltIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.StringField legSecurityAltIdSourceField =
            FieldFactory.newStringField(606);
        public boolean hasLegSecurityAltIdSource() throws quickfix.FieldNotFound {
          return isSetField(606);
        }
        public String getLegSecurityAltIdSource() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(legSecurityAltIdSourceField));
        }
        public NoLegSecurityAltId setLegSecurityAltIdSource(final String value) {
          setField(FieldValue.to(legSecurityAltIdSourceField, value));
          return this;
        }
        public NoLegSecurityAltId setLegSecurityAltIdSource(
            final quickfix.field.LegSecurityAltIDSource value) {
          setField(FieldValue.to(legSecurityAltIdSourceField, FieldValue.of(value)));
          return this;
        }

        public NoLegSecurityAltId() {
          super(604, 605, new int[] {605, 606, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(
            final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
                .NoLegs.NoLegSecurityAltId proto) {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
              .NoLegSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getLegSecurityAltId()) {
            this.setLegSecurityAltId(proto.getLegSecurityAltId());
          }
          if (fieldPresence.getLegSecurityAltIdSource()) {
            this.setLegSecurityAltIdSource(proto.getLegSecurityAltIdSource());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
            .NoLegSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
              .NoLegSecurityAltId.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
                  .NoLegSecurityAltId.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
              .NoLegSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
                  .NoLegSecurityAltId.FieldPresence.newBuilder();

          if (this.hasLegSecurityAltId()) {
            builder.setLegSecurityAltId(this.getLegSecurityAltId());
            presenceBuilder.setLegSecurityAltId(true);
          }
          if (this.hasLegSecurityAltIdSource()) {
            builder.setLegSecurityAltIdSource(this.getLegSecurityAltIdSource());
            presenceBuilder.setLegSecurityAltIdSource(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField legSymbolField = FieldFactory.newStringField(600);
      public boolean hasLegSymbol() throws quickfix.FieldNotFound {
        return isSetField(600);
      }
      public String getLegSymbol() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSymbolField));
      }
      public NoLegs setLegSymbol(final String value) {
        setField(FieldValue.to(legSymbolField, value));
        return this;
      }
      public NoLegs setLegSymbol(final quickfix.field.LegSymbol value) {
        setField(FieldValue.to(legSymbolField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSymbolSfxField = FieldFactory.newStringField(601);
      public boolean hasLegSymbolSfx() throws quickfix.FieldNotFound {
        return isSetField(601);
      }
      public String getLegSymbolSfx() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSymbolSfxField));
      }
      public NoLegs setLegSymbolSfx(final String value) {
        setField(FieldValue.to(legSymbolSfxField, value));
        return this;
      }
      public NoLegs setLegSymbolSfx(final quickfix.field.LegSymbolSfx value) {
        setField(FieldValue.to(legSymbolSfxField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecurityIdField = FieldFactory.newStringField(602);
      public boolean hasLegSecurityId() throws quickfix.FieldNotFound {
        return isSetField(602);
      }
      public String getLegSecurityId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecurityIdField));
      }
      public NoLegs setLegSecurityId(final String value) {
        setField(FieldValue.to(legSecurityIdField, value));
        return this;
      }
      public NoLegs setLegSecurityId(final quickfix.field.LegSecurityID value) {
        setField(FieldValue.to(legSecurityIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecurityIdSourceField =
          FieldFactory.newStringField(603);
      public boolean hasLegSecurityIdSource() throws quickfix.FieldNotFound {
        return isSetField(603);
      }
      public String getLegSecurityIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecurityIdSourceField));
      }
      public NoLegs setLegSecurityIdSource(final String value) {
        setField(FieldValue.to(legSecurityIdSourceField, value));
        return this;
      }
      public NoLegs setLegSecurityIdSource(final quickfix.field.LegSecurityIDSource value) {
        setField(FieldValue.to(legSecurityIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legProductField = FieldFactory.newIntField(607);
      public boolean hasLegProduct() throws quickfix.FieldNotFound {
        return isSetField(607);
      }
      public int getLegProduct() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legProductField));
      }
      public NoLegs setLegProduct(final int value) {
        setField(FieldValue.to(legProductField, value));
        return this;
      }
      public NoLegs setLegProduct(final quickfix.field.LegProduct value) {
        setField(FieldValue.to(legProductField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legCfiCodeField = FieldFactory.newStringField(608);
      public boolean hasLegCfiCode() throws quickfix.FieldNotFound {
        return isSetField(608);
      }
      public String getLegCfiCode() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCfiCodeField));
      }
      public NoLegs setLegCfiCode(final String value) {
        setField(FieldValue.to(legCfiCodeField, value));
        return this;
      }
      public NoLegs setLegCfiCode(final quickfix.field.LegCFICode value) {
        setField(FieldValue.to(legCfiCodeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecurityTypeField = FieldFactory.newStringField(609);
      public boolean hasLegSecurityType() throws quickfix.FieldNotFound {
        return isSetField(609);
      }
      public String getLegSecurityType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecurityTypeField));
      }
      public NoLegs setLegSecurityType(final String value) {
        setField(FieldValue.to(legSecurityTypeField, value));
        return this;
      }
      public NoLegs setLegSecurityType(final quickfix.field.LegSecurityType value) {
        setField(FieldValue.to(legSecurityTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecuritySubTypeField = FieldFactory.newStringField(764);
      public boolean hasLegSecuritySubType() throws quickfix.FieldNotFound {
        return isSetField(764);
      }
      public String getLegSecuritySubType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecuritySubTypeField));
      }
      public NoLegs setLegSecuritySubType(final String value) {
        setField(FieldValue.to(legSecuritySubTypeField, value));
        return this;
      }
      public NoLegs setLegSecuritySubType(final quickfix.field.LegSecuritySubType value) {
        setField(FieldValue.to(legSecuritySubTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legMaturityMonthYearField =
          FieldFactory.newStringField(610);
      public boolean hasLegMaturityMonthYear() throws quickfix.FieldNotFound {
        return isSetField(610);
      }
      public String getLegMaturityMonthYear() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legMaturityMonthYearField));
      }
      public NoLegs setLegMaturityMonthYear(final String value) {
        setField(FieldValue.to(legMaturityMonthYearField, value));
        return this;
      }
      public NoLegs setLegMaturityMonthYear(final quickfix.field.LegMaturityMonthYear value) {
        setField(FieldValue.to(legMaturityMonthYearField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legMaturityDateField = FieldFactory.newStringField(611);
      public boolean hasLegMaturityDate() throws quickfix.FieldNotFound {
        return isSetField(611);
      }
      public String getLegMaturityDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legMaturityDateField));
      }
      public NoLegs setLegMaturityDate(final String value) {
        setField(FieldValue.to(legMaturityDateField, value));
        return this;
      }
      public NoLegs setLegMaturityDate(final quickfix.field.LegMaturityDate value) {
        setField(FieldValue.to(legMaturityDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legCouponPaymentDateField =
          FieldFactory.newStringField(248);
      public boolean hasLegCouponPaymentDate() throws quickfix.FieldNotFound {
        return isSetField(248);
      }
      public String getLegCouponPaymentDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCouponPaymentDateField));
      }
      public NoLegs setLegCouponPaymentDate(final String value) {
        setField(FieldValue.to(legCouponPaymentDateField, value));
        return this;
      }
      public NoLegs setLegCouponPaymentDate(final quickfix.field.LegCouponPaymentDate value) {
        setField(FieldValue.to(legCouponPaymentDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legIssueDateField = FieldFactory.newStringField(249);
      public boolean hasLegIssueDate() throws quickfix.FieldNotFound {
        return isSetField(249);
      }
      public String getLegIssueDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legIssueDateField));
      }
      public NoLegs setLegIssueDate(final String value) {
        setField(FieldValue.to(legIssueDateField, value));
        return this;
      }
      public NoLegs setLegIssueDate(final quickfix.field.LegIssueDate value) {
        setField(FieldValue.to(legIssueDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legRepoCollateralSecurityTypeField =
          FieldFactory.newStringField(250);
      public boolean hasLegRepoCollateralSecurityType() throws quickfix.FieldNotFound {
        return isSetField(250);
      }
      public String getLegRepoCollateralSecurityType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRepoCollateralSecurityTypeField));
      }
      public NoLegs setLegRepoCollateralSecurityType(final String value) {
        setField(FieldValue.to(legRepoCollateralSecurityTypeField, value));
        return this;
      }
      public NoLegs setLegRepoCollateralSecurityType(
          final quickfix.field.LegRepoCollateralSecurityType value) {
        setField(FieldValue.to(legRepoCollateralSecurityTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legRepurchaseTermField = FieldFactory.newIntField(251);
      public boolean hasLegRepurchaseTerm() throws quickfix.FieldNotFound {
        return isSetField(251);
      }
      public int getLegRepurchaseTerm() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRepurchaseTermField));
      }
      public NoLegs setLegRepurchaseTerm(final int value) {
        setField(FieldValue.to(legRepurchaseTermField, value));
        return this;
      }
      public NoLegs setLegRepurchaseTerm(final quickfix.field.LegRepurchaseTerm value) {
        setField(FieldValue.to(legRepurchaseTermField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legRepurchaseRateField = FieldFactory.newDoubleField(252);
      public boolean hasLegRepurchaseRate() throws quickfix.FieldNotFound {
        return isSetField(252);
      }
      public double getLegRepurchaseRate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRepurchaseRateField));
      }
      public NoLegs setLegRepurchaseRate(final double value) {
        setField(FieldValue.to(legRepurchaseRateField, value));
        return this;
      }
      public NoLegs setLegRepurchaseRate(final quickfix.field.LegRepurchaseRate value) {
        setField(FieldValue.to(legRepurchaseRateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legFactorField = FieldFactory.newDoubleField(253);
      public boolean hasLegFactor() throws quickfix.FieldNotFound {
        return isSetField(253);
      }
      public double getLegFactor() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legFactorField));
      }
      public NoLegs setLegFactor(final double value) {
        setField(FieldValue.to(legFactorField, value));
        return this;
      }
      public NoLegs setLegFactor(final quickfix.field.LegFactor value) {
        setField(FieldValue.to(legFactorField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legCreditRatingField = FieldFactory.newStringField(257);
      public boolean hasLegCreditRating() throws quickfix.FieldNotFound {
        return isSetField(257);
      }
      public String getLegCreditRating() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCreditRatingField));
      }
      public NoLegs setLegCreditRating(final String value) {
        setField(FieldValue.to(legCreditRatingField, value));
        return this;
      }
      public NoLegs setLegCreditRating(final quickfix.field.LegCreditRating value) {
        setField(FieldValue.to(legCreditRatingField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legInstrRegistryField = FieldFactory.newStringField(599);
      public boolean hasLegInstrRegistry() throws quickfix.FieldNotFound {
        return isSetField(599);
      }
      public String getLegInstrRegistry() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legInstrRegistryField));
      }
      public NoLegs setLegInstrRegistry(final String value) {
        setField(FieldValue.to(legInstrRegistryField, value));
        return this;
      }
      public NoLegs setLegInstrRegistry(final quickfix.field.LegInstrRegistry value) {
        setField(FieldValue.to(legInstrRegistryField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legCountryOfIssueField = FieldFactory.newStringField(596);
      public boolean hasLegCountryOfIssue() throws quickfix.FieldNotFound {
        return isSetField(596);
      }
      public String getLegCountryOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCountryOfIssueField));
      }
      public NoLegs setLegCountryOfIssue(final String value) {
        setField(FieldValue.to(legCountryOfIssueField, value));
        return this;
      }
      public NoLegs setLegCountryOfIssue(final quickfix.field.LegCountryOfIssue value) {
        setField(FieldValue.to(legCountryOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legStateOrProvinceOfIssueField =
          FieldFactory.newStringField(597);
      public boolean hasLegStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
        return isSetField(597);
      }
      public String getLegStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legStateOrProvinceOfIssueField));
      }
      public NoLegs setLegStateOrProvinceOfIssue(final String value) {
        setField(FieldValue.to(legStateOrProvinceOfIssueField, value));
        return this;
      }
      public NoLegs setLegStateOrProvinceOfIssue(
          final quickfix.field.LegStateOrProvinceOfIssue value) {
        setField(FieldValue.to(legStateOrProvinceOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legLocaleOfIssueField = FieldFactory.newStringField(598);
      public boolean hasLegLocaleOfIssue() throws quickfix.FieldNotFound {
        return isSetField(598);
      }
      public String getLegLocaleOfIssue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legLocaleOfIssueField));
      }
      public NoLegs setLegLocaleOfIssue(final String value) {
        setField(FieldValue.to(legLocaleOfIssueField, value));
        return this;
      }
      public NoLegs setLegLocaleOfIssue(final quickfix.field.LegLocaleOfIssue value) {
        setField(FieldValue.to(legLocaleOfIssueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legRedemptionDateField = FieldFactory.newStringField(254);
      public boolean hasLegRedemptionDate() throws quickfix.FieldNotFound {
        return isSetField(254);
      }
      public String getLegRedemptionDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRedemptionDateField));
      }
      public NoLegs setLegRedemptionDate(final String value) {
        setField(FieldValue.to(legRedemptionDateField, value));
        return this;
      }
      public NoLegs setLegRedemptionDate(final quickfix.field.LegRedemptionDate value) {
        setField(FieldValue.to(legRedemptionDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legStrikePriceField = FieldFactory.newDoubleField(612);
      public boolean hasLegStrikePrice() throws quickfix.FieldNotFound {
        return isSetField(612);
      }
      public double getLegStrikePrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legStrikePriceField));
      }
      public NoLegs setLegStrikePrice(final double value) {
        setField(FieldValue.to(legStrikePriceField, value));
        return this;
      }
      public NoLegs setLegStrikePrice(final quickfix.field.LegStrikePrice value) {
        setField(FieldValue.to(legStrikePriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legStrikeCurrencyField = FieldFactory.newStringField(942);
      public boolean hasLegStrikeCurrency() throws quickfix.FieldNotFound {
        return isSetField(942);
      }
      public String getLegStrikeCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legStrikeCurrencyField));
      }
      public NoLegs setLegStrikeCurrency(final String value) {
        setField(FieldValue.to(legStrikeCurrencyField, value));
        return this;
      }
      public NoLegs setLegStrikeCurrency(final quickfix.field.LegStrikeCurrency value) {
        setField(FieldValue.to(legStrikeCurrencyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField legOptAttributeField = FieldFactory.newCharField(613);
      public boolean hasLegOptAttribute() throws quickfix.FieldNotFound {
        return isSetField(613);
      }
      public int getLegOptAttribute() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legOptAttributeField));
      }
      public NoLegs setLegOptAttribute(final int value) {
        setField(FieldValue.to(legOptAttributeField, value));
        return this;
      }
      public NoLegs setLegOptAttribute(final char value) {
        setField(FieldValue.to(legOptAttributeField, value));
        return this;
      }
      public NoLegs setLegOptAttribute(final String value) {
        setField(FieldValue.to(legOptAttributeField, value));
        return this;
      }
      public NoLegs setLegOptAttribute(final quickfix.field.LegOptAttribute value) {
        setField(FieldValue.to(legOptAttributeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legContractMultiplierField =
          FieldFactory.newDoubleField(614);
      public boolean hasLegContractMultiplier() throws quickfix.FieldNotFound {
        return isSetField(614);
      }
      public double getLegContractMultiplier() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legContractMultiplierField));
      }
      public NoLegs setLegContractMultiplier(final double value) {
        setField(FieldValue.to(legContractMultiplierField, value));
        return this;
      }
      public NoLegs setLegContractMultiplier(final quickfix.field.LegContractMultiplier value) {
        setField(FieldValue.to(legContractMultiplierField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legCouponRateField = FieldFactory.newDoubleField(615);
      public boolean hasLegCouponRate() throws quickfix.FieldNotFound {
        return isSetField(615);
      }
      public double getLegCouponRate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCouponRateField));
      }
      public NoLegs setLegCouponRate(final double value) {
        setField(FieldValue.to(legCouponRateField, value));
        return this;
      }
      public NoLegs setLegCouponRate(final quickfix.field.LegCouponRate value) {
        setField(FieldValue.to(legCouponRateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecurityExchangeField =
          FieldFactory.newStringField(616);
      public boolean hasLegSecurityExchange() throws quickfix.FieldNotFound {
        return isSetField(616);
      }
      public String getLegSecurityExchange() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecurityExchangeField));
      }
      public NoLegs setLegSecurityExchange(final String value) {
        setField(FieldValue.to(legSecurityExchangeField, value));
        return this;
      }
      public NoLegs setLegSecurityExchange(final quickfix.field.LegSecurityExchange value) {
        setField(FieldValue.to(legSecurityExchangeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legIssuerField = FieldFactory.newStringField(617);
      public boolean hasLegIssuer() throws quickfix.FieldNotFound {
        return isSetField(617);
      }
      public String getLegIssuer() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legIssuerField));
      }
      public NoLegs setLegIssuer(final String value) {
        setField(FieldValue.to(legIssuerField, value));
        return this;
      }
      public NoLegs setLegIssuer(final quickfix.field.LegIssuer value) {
        setField(FieldValue.to(legIssuerField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField encodedLegIssuerLenField = FieldFactory.newIntField(618);
      public boolean hasEncodedLegIssuerLen() throws quickfix.FieldNotFound {
        return isSetField(618);
      }
      public int getEncodedLegIssuerLen() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedLegIssuerLenField));
      }
      public NoLegs setEncodedLegIssuerLen(final int value) {
        setField(FieldValue.to(encodedLegIssuerLenField, value));
        return this;
      }
      public NoLegs setEncodedLegIssuerLen(final quickfix.field.EncodedLegIssuerLen value) {
        setField(FieldValue.to(encodedLegIssuerLenField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField encodedLegIssuerField = FieldFactory.newStringField(619);
      public boolean hasEncodedLegIssuer() throws quickfix.FieldNotFound {
        return isSetField(619);
      }
      public String getEncodedLegIssuer() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedLegIssuerField));
      }
      public NoLegs setEncodedLegIssuer(final String value) {
        setField(FieldValue.to(encodedLegIssuerField, value));
        return this;
      }
      public NoLegs setEncodedLegIssuer(final quickfix.field.EncodedLegIssuer value) {
        setField(FieldValue.to(encodedLegIssuerField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSecurityDescField = FieldFactory.newStringField(620);
      public boolean hasLegSecurityDesc() throws quickfix.FieldNotFound {
        return isSetField(620);
      }
      public String getLegSecurityDesc() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSecurityDescField));
      }
      public NoLegs setLegSecurityDesc(final String value) {
        setField(FieldValue.to(legSecurityDescField, value));
        return this;
      }
      public NoLegs setLegSecurityDesc(final quickfix.field.LegSecurityDesc value) {
        setField(FieldValue.to(legSecurityDescField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField encodedLegSecurityDescLenField =
          FieldFactory.newIntField(621);
      public boolean hasEncodedLegSecurityDescLen() throws quickfix.FieldNotFound {
        return isSetField(621);
      }
      public int getEncodedLegSecurityDescLen() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedLegSecurityDescLenField));
      }
      public NoLegs setEncodedLegSecurityDescLen(final int value) {
        setField(FieldValue.to(encodedLegSecurityDescLenField, value));
        return this;
      }
      public NoLegs setEncodedLegSecurityDescLen(
          final quickfix.field.EncodedLegSecurityDescLen value) {
        setField(FieldValue.to(encodedLegSecurityDescLenField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField encodedLegSecurityDescField =
          FieldFactory.newStringField(622);
      public boolean hasEncodedLegSecurityDesc() throws quickfix.FieldNotFound {
        return isSetField(622);
      }
      public String getEncodedLegSecurityDesc() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(encodedLegSecurityDescField));
      }
      public NoLegs setEncodedLegSecurityDesc(final String value) {
        setField(FieldValue.to(encodedLegSecurityDescField, value));
        return this;
      }
      public NoLegs setEncodedLegSecurityDesc(final quickfix.field.EncodedLegSecurityDesc value) {
        setField(FieldValue.to(encodedLegSecurityDescField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legRatioQtyField = FieldFactory.newDoubleField(623);
      public boolean hasLegRatioQty() throws quickfix.FieldNotFound {
        return isSetField(623);
      }
      public double getLegRatioQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRatioQtyField));
      }
      public NoLegs setLegRatioQty(final double value) {
        setField(FieldValue.to(legRatioQtyField, value));
        return this;
      }
      public NoLegs setLegRatioQty(final quickfix.field.LegRatioQty value) {
        setField(FieldValue.to(legRatioQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField legSideField = FieldFactory.newCharField(624);
      public boolean hasLegSide() throws quickfix.FieldNotFound {
        return isSetField(624);
      }
      public int getLegSide() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSideField));
      }
      public NoLegs setLegSide(final int value) {
        setField(FieldValue.to(legSideField, value));
        return this;
      }
      public NoLegs setLegSide(final char value) {
        setField(FieldValue.to(legSideField, value));
        return this;
      }
      public NoLegs setLegSide(final String value) {
        setField(FieldValue.to(legSideField, value));
        return this;
      }
      public NoLegs setLegSide(final quickfix.field.LegSide value) {
        setField(FieldValue.to(legSideField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legCurrencyField = FieldFactory.newStringField(556);
      public boolean hasLegCurrency() throws quickfix.FieldNotFound {
        return isSetField(556);
      }
      public String getLegCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legCurrencyField));
      }
      public NoLegs setLegCurrency(final String value) {
        setField(FieldValue.to(legCurrencyField, value));
        return this;
      }
      public NoLegs setLegCurrency(final quickfix.field.LegCurrency value) {
        setField(FieldValue.to(legCurrencyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legPoolField = FieldFactory.newStringField(740);
      public boolean hasLegPool() throws quickfix.FieldNotFound {
        return isSetField(740);
      }
      public String getLegPool() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legPoolField));
      }
      public NoLegs setLegPool(final String value) {
        setField(FieldValue.to(legPoolField, value));
        return this;
      }
      public NoLegs setLegPool(final quickfix.field.LegPool value) {
        setField(FieldValue.to(legPoolField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legDatedDateField = FieldFactory.newStringField(739);
      public boolean hasLegDatedDate() throws quickfix.FieldNotFound {
        return isSetField(739);
      }
      public String getLegDatedDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legDatedDateField));
      }
      public NoLegs setLegDatedDate(final String value) {
        setField(FieldValue.to(legDatedDateField, value));
        return this;
      }
      public NoLegs setLegDatedDate(final quickfix.field.LegDatedDate value) {
        setField(FieldValue.to(legDatedDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legContractSettlMonthField =
          FieldFactory.newStringField(955);
      public boolean hasLegContractSettlMonth() throws quickfix.FieldNotFound {
        return isSetField(955);
      }
      public String getLegContractSettlMonth() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legContractSettlMonthField));
      }
      public NoLegs setLegContractSettlMonth(final String value) {
        setField(FieldValue.to(legContractSettlMonthField, value));
        return this;
      }
      public NoLegs setLegContractSettlMonth(final quickfix.field.LegContractSettlMonth value) {
        setField(FieldValue.to(legContractSettlMonthField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legInterestAccrualDateField =
          FieldFactory.newStringField(956);
      public boolean hasLegInterestAccrualDate() throws quickfix.FieldNotFound {
        return isSetField(956);
      }
      public String getLegInterestAccrualDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legInterestAccrualDateField));
      }
      public NoLegs setLegInterestAccrualDate(final String value) {
        setField(FieldValue.to(legInterestAccrualDateField, value));
        return this;
      }
      public NoLegs setLegInterestAccrualDate(final quickfix.field.LegInterestAccrualDate value) {
        setField(FieldValue.to(legInterestAccrualDateField, FieldValue.of(value)));
        return this;
      }

      public NoLegs() {
        super(555, 600,
            new int[] {600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252,
                253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620,
                621, 622, 623, 624, 556, 740, 739, 955, 956, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                .NoMdEntries.NoLegs proto) {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoLegSecurityAltIdCount(); i++) {
          final NoLegs.NoLegSecurityAltId group = new NoLegs.NoLegSecurityAltId();
          group.fromProto(proto.getNoLegSecurityAltId(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getLegSymbol()) {
          this.setLegSymbol(proto.getLegSymbol());
        }
        if (fieldPresence.getLegSymbolSfx()) {
          this.setLegSymbolSfx(proto.getLegSymbolSfx());
        }
        if (fieldPresence.getLegSecurityId()) {
          this.setLegSecurityId(proto.getLegSecurityId());
        }
        if (fieldPresence.getLegSecurityIdSource()) {
          this.setLegSecurityIdSource(proto.getLegSecurityIdSource());
        }
        if (fieldPresence.getLegProduct()) {
          this.setLegProduct(proto.getLegProduct());
        }
        if (fieldPresence.getLegCfiCode()) {
          this.setLegCfiCode(proto.getLegCfiCode());
        }
        if (fieldPresence.getLegSecurityType()) {
          this.setLegSecurityType(proto.getLegSecurityType());
        }
        if (fieldPresence.getLegSecuritySubType()) {
          this.setLegSecuritySubType(proto.getLegSecuritySubType());
        }
        if (fieldPresence.getLegMaturityMonthYear()) {
          this.setLegMaturityMonthYear(proto.getLegMaturityMonthYear());
        }
        if (fieldPresence.getLegMaturityDate()) {
          this.setLegMaturityDate(proto.getLegMaturityDate());
        }
        if (fieldPresence.getLegCouponPaymentDate()) {
          this.setLegCouponPaymentDate(proto.getLegCouponPaymentDate());
        }
        if (fieldPresence.getLegIssueDate()) {
          this.setLegIssueDate(proto.getLegIssueDate());
        }
        if (fieldPresence.getLegRepoCollateralSecurityType()) {
          this.setLegRepoCollateralSecurityType(proto.getLegRepoCollateralSecurityType());
        }
        if (fieldPresence.getLegRepurchaseTerm()) {
          this.setLegRepurchaseTerm(proto.getLegRepurchaseTerm());
        }
        if (fieldPresence.getLegRepurchaseRate()) {
          this.setLegRepurchaseRate(proto.getLegRepurchaseRate());
        }
        if (fieldPresence.getLegFactor()) {
          this.setLegFactor(proto.getLegFactor());
        }
        if (fieldPresence.getLegCreditRating()) {
          this.setLegCreditRating(proto.getLegCreditRating());
        }
        if (fieldPresence.getLegInstrRegistry()) {
          this.setLegInstrRegistry(proto.getLegInstrRegistry());
        }
        if (fieldPresence.getLegCountryOfIssue()) {
          this.setLegCountryOfIssue(proto.getLegCountryOfIssue());
        }
        if (fieldPresence.getLegStateOrProvinceOfIssue()) {
          this.setLegStateOrProvinceOfIssue(proto.getLegStateOrProvinceOfIssue());
        }
        if (fieldPresence.getLegLocaleOfIssue()) {
          this.setLegLocaleOfIssue(proto.getLegLocaleOfIssue());
        }
        if (fieldPresence.getLegRedemptionDate()) {
          this.setLegRedemptionDate(proto.getLegRedemptionDate());
        }
        if (fieldPresence.getLegStrikePrice()) {
          this.setLegStrikePrice(proto.getLegStrikePrice());
        }
        if (fieldPresence.getLegStrikeCurrency()) {
          this.setLegStrikeCurrency(proto.getLegStrikeCurrency());
        }
        if (fieldPresence.getLegOptAttribute()) {
          this.setLegOptAttribute(proto.getLegOptAttribute());
        }
        if (fieldPresence.getLegContractMultiplier()) {
          this.setLegContractMultiplier(proto.getLegContractMultiplier());
        }
        if (fieldPresence.getLegCouponRate()) {
          this.setLegCouponRate(proto.getLegCouponRate());
        }
        if (fieldPresence.getLegSecurityExchange()) {
          this.setLegSecurityExchange(proto.getLegSecurityExchange());
        }
        if (fieldPresence.getLegIssuer()) {
          this.setLegIssuer(proto.getLegIssuer());
        }
        if (fieldPresence.getEncodedLegIssuerLen()) {
          this.setEncodedLegIssuerLen(proto.getEncodedLegIssuerLen());
        }
        if (fieldPresence.getEncodedLegIssuer()) {
          this.setEncodedLegIssuer(proto.getEncodedLegIssuer());
        }
        if (fieldPresence.getLegSecurityDesc()) {
          this.setLegSecurityDesc(proto.getLegSecurityDesc());
        }
        if (fieldPresence.getEncodedLegSecurityDescLen()) {
          this.setEncodedLegSecurityDescLen(proto.getEncodedLegSecurityDescLen());
        }
        if (fieldPresence.getEncodedLegSecurityDesc()) {
          this.setEncodedLegSecurityDesc(proto.getEncodedLegSecurityDesc());
        }
        if (fieldPresence.getLegRatioQty()) {
          this.setLegRatioQty(proto.getLegRatioQty());
        }
        if (fieldPresence.getLegSide()) {
          this.setLegSide(proto.getLegSide());
        }
        if (fieldPresence.getLegCurrency()) {
          this.setLegCurrency(proto.getLegCurrency());
        }
        if (fieldPresence.getLegPool()) {
          this.setLegPool(proto.getLegPool());
        }
        if (fieldPresence.getLegDatedDate()) {
          this.setLegDatedDate(proto.getLegDatedDate());
        }
        if (fieldPresence.getLegContractSettlMonth()) {
          this.setLegContractSettlMonth(proto.getLegContractSettlMonth());
        }
        if (fieldPresence.getLegInterestAccrualDate()) {
          this.setLegInterestAccrualDate(proto.getLegInterestAccrualDate());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                   .NoMdEntries.NoLegs.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.NoLegs
                .FieldPresence.newBuilder();

        final int noLegSecurityAltIdGroupCount = this.getGroupCount(604);
        for (int i = 1; i <= noLegSecurityAltIdGroupCount; i++) {
          final NoLegs.NoLegSecurityAltId group = new NoLegs.NoLegSecurityAltId();
          this.getGroup(i, group);
          builder.addNoLegSecurityAltId(group.toBuilder().build());
        }

        if (this.hasLegSymbol()) {
          builder.setLegSymbol(this.getLegSymbol());
          presenceBuilder.setLegSymbol(true);
        }
        if (this.hasLegSymbolSfx()) {
          builder.setLegSymbolSfx(this.getLegSymbolSfx());
          presenceBuilder.setLegSymbolSfx(true);
        }
        if (this.hasLegSecurityId()) {
          builder.setLegSecurityId(this.getLegSecurityId());
          presenceBuilder.setLegSecurityId(true);
        }
        if (this.hasLegSecurityIdSource()) {
          builder.setLegSecurityIdSource(this.getLegSecurityIdSource());
          presenceBuilder.setLegSecurityIdSource(true);
        }
        if (this.hasLegProduct()) {
          builder.setLegProduct(this.getLegProduct());
          presenceBuilder.setLegProduct(true);
        }
        if (this.hasLegCfiCode()) {
          builder.setLegCfiCode(this.getLegCfiCode());
          presenceBuilder.setLegCfiCode(true);
        }
        if (this.hasLegSecurityType()) {
          builder.setLegSecurityType(this.getLegSecurityType());
          presenceBuilder.setLegSecurityType(true);
        }
        if (this.hasLegSecuritySubType()) {
          builder.setLegSecuritySubType(this.getLegSecuritySubType());
          presenceBuilder.setLegSecuritySubType(true);
        }
        if (this.hasLegMaturityMonthYear()) {
          builder.setLegMaturityMonthYear(this.getLegMaturityMonthYear());
          presenceBuilder.setLegMaturityMonthYear(true);
        }
        if (this.hasLegMaturityDate()) {
          builder.setLegMaturityDate(this.getLegMaturityDate());
          presenceBuilder.setLegMaturityDate(true);
        }
        if (this.hasLegCouponPaymentDate()) {
          builder.setLegCouponPaymentDate(this.getLegCouponPaymentDate());
          presenceBuilder.setLegCouponPaymentDate(true);
        }
        if (this.hasLegIssueDate()) {
          builder.setLegIssueDate(this.getLegIssueDate());
          presenceBuilder.setLegIssueDate(true);
        }
        if (this.hasLegRepoCollateralSecurityType()) {
          builder.setLegRepoCollateralSecurityType(this.getLegRepoCollateralSecurityType());
          presenceBuilder.setLegRepoCollateralSecurityType(true);
        }
        if (this.hasLegRepurchaseTerm()) {
          builder.setLegRepurchaseTerm(this.getLegRepurchaseTerm());
          presenceBuilder.setLegRepurchaseTerm(true);
        }
        if (this.hasLegRepurchaseRate()) {
          builder.setLegRepurchaseRate(this.getLegRepurchaseRate());
          presenceBuilder.setLegRepurchaseRate(true);
        }
        if (this.hasLegFactor()) {
          builder.setLegFactor(this.getLegFactor());
          presenceBuilder.setLegFactor(true);
        }
        if (this.hasLegCreditRating()) {
          builder.setLegCreditRating(this.getLegCreditRating());
          presenceBuilder.setLegCreditRating(true);
        }
        if (this.hasLegInstrRegistry()) {
          builder.setLegInstrRegistry(this.getLegInstrRegistry());
          presenceBuilder.setLegInstrRegistry(true);
        }
        if (this.hasLegCountryOfIssue()) {
          builder.setLegCountryOfIssue(this.getLegCountryOfIssue());
          presenceBuilder.setLegCountryOfIssue(true);
        }
        if (this.hasLegStateOrProvinceOfIssue()) {
          builder.setLegStateOrProvinceOfIssue(this.getLegStateOrProvinceOfIssue());
          presenceBuilder.setLegStateOrProvinceOfIssue(true);
        }
        if (this.hasLegLocaleOfIssue()) {
          builder.setLegLocaleOfIssue(this.getLegLocaleOfIssue());
          presenceBuilder.setLegLocaleOfIssue(true);
        }
        if (this.hasLegRedemptionDate()) {
          builder.setLegRedemptionDate(this.getLegRedemptionDate());
          presenceBuilder.setLegRedemptionDate(true);
        }
        if (this.hasLegStrikePrice()) {
          builder.setLegStrikePrice(this.getLegStrikePrice());
          presenceBuilder.setLegStrikePrice(true);
        }
        if (this.hasLegStrikeCurrency()) {
          builder.setLegStrikeCurrency(this.getLegStrikeCurrency());
          presenceBuilder.setLegStrikeCurrency(true);
        }
        if (this.hasLegOptAttribute()) {
          builder.setLegOptAttribute(this.getLegOptAttribute());
          presenceBuilder.setLegOptAttribute(true);
        }
        if (this.hasLegContractMultiplier()) {
          builder.setLegContractMultiplier(this.getLegContractMultiplier());
          presenceBuilder.setLegContractMultiplier(true);
        }
        if (this.hasLegCouponRate()) {
          builder.setLegCouponRate(this.getLegCouponRate());
          presenceBuilder.setLegCouponRate(true);
        }
        if (this.hasLegSecurityExchange()) {
          builder.setLegSecurityExchange(this.getLegSecurityExchange());
          presenceBuilder.setLegSecurityExchange(true);
        }
        if (this.hasLegIssuer()) {
          builder.setLegIssuer(this.getLegIssuer());
          presenceBuilder.setLegIssuer(true);
        }
        if (this.hasEncodedLegIssuerLen()) {
          builder.setEncodedLegIssuerLen(this.getEncodedLegIssuerLen());
          presenceBuilder.setEncodedLegIssuerLen(true);
        }
        if (this.hasEncodedLegIssuer()) {
          builder.setEncodedLegIssuer(this.getEncodedLegIssuer());
          presenceBuilder.setEncodedLegIssuer(true);
        }
        if (this.hasLegSecurityDesc()) {
          builder.setLegSecurityDesc(this.getLegSecurityDesc());
          presenceBuilder.setLegSecurityDesc(true);
        }
        if (this.hasEncodedLegSecurityDescLen()) {
          builder.setEncodedLegSecurityDescLen(this.getEncodedLegSecurityDescLen());
          presenceBuilder.setEncodedLegSecurityDescLen(true);
        }
        if (this.hasEncodedLegSecurityDesc()) {
          builder.setEncodedLegSecurityDesc(this.getEncodedLegSecurityDesc());
          presenceBuilder.setEncodedLegSecurityDesc(true);
        }
        if (this.hasLegRatioQty()) {
          builder.setLegRatioQty(this.getLegRatioQty());
          presenceBuilder.setLegRatioQty(true);
        }
        if (this.hasLegSide()) {
          builder.setLegSide(this.getLegSide());
          presenceBuilder.setLegSide(true);
        }
        if (this.hasLegCurrency()) {
          builder.setLegCurrency(this.getLegCurrency());
          presenceBuilder.setLegCurrency(true);
        }
        if (this.hasLegPool()) {
          builder.setLegPool(this.getLegPool());
          presenceBuilder.setLegPool(true);
        }
        if (this.hasLegDatedDate()) {
          builder.setLegDatedDate(this.getLegDatedDate());
          presenceBuilder.setLegDatedDate(true);
        }
        if (this.hasLegContractSettlMonth()) {
          builder.setLegContractSettlMonth(this.getLegContractSettlMonth());
          presenceBuilder.setLegContractSettlMonth(true);
        }
        if (this.hasLegInterestAccrualDate()) {
          builder.setLegInterestAccrualDate(this.getLegInterestAccrualDate());
          presenceBuilder.setLegInterestAccrualDate(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

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

    private final quickfix.StringField securityIdSourceField = FieldFactory.newStringField(22);
    public boolean hasSecurityIdSource() throws quickfix.FieldNotFound {
      return isSetField(22);
    }
    public String getSecurityIdSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityIdSourceField));
    }
    public NoMdEntries setSecurityIdSource(final String value) {
      setField(FieldValue.to(securityIdSourceField, value));
      return this;
    }
    public NoMdEntries setSecurityIdSource(final quickfix.field.SecurityIDSource value) {
      setField(FieldValue.to(securityIdSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField productField = FieldFactory.newIntField(460);
    public boolean hasProduct() throws quickfix.FieldNotFound {
      return isSetField(460);
    }
    public int getProduct() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(productField));
    }
    public NoMdEntries setProduct(final int value) {
      setField(FieldValue.to(productField, value));
      return this;
    }
    public NoMdEntries setProduct(final quickfix.field.Product value) {
      setField(FieldValue.to(productField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField cfiCodeField = FieldFactory.newStringField(461);
    public boolean hasCfiCode() throws quickfix.FieldNotFound {
      return isSetField(461);
    }
    public String getCfiCode() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(cfiCodeField));
    }
    public NoMdEntries setCfiCode(final String value) {
      setField(FieldValue.to(cfiCodeField, value));
      return this;
    }
    public NoMdEntries setCfiCode(final quickfix.field.CFICode value) {
      setField(FieldValue.to(cfiCodeField, FieldValue.of(value)));
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

    private final quickfix.StringField securitySubTypeField = FieldFactory.newStringField(762);
    public boolean hasSecuritySubType() throws quickfix.FieldNotFound {
      return isSetField(762);
    }
    public String getSecuritySubType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securitySubTypeField));
    }
    public NoMdEntries setSecuritySubType(final String value) {
      setField(FieldValue.to(securitySubTypeField, value));
      return this;
    }
    public NoMdEntries setSecuritySubType(final quickfix.field.SecuritySubType value) {
      setField(FieldValue.to(securitySubTypeField, FieldValue.of(value)));
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

    private final quickfix.StringField maturityDateField = FieldFactory.newStringField(541);
    public boolean hasMaturityDate() throws quickfix.FieldNotFound {
      return isSetField(541);
    }
    public String getMaturityDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(maturityDateField));
    }
    public NoMdEntries setMaturityDate(final String value) {
      setField(FieldValue.to(maturityDateField, value));
      return this;
    }
    public NoMdEntries setMaturityDate(final quickfix.field.MaturityDate value) {
      setField(FieldValue.to(maturityDateField, FieldValue.of(value)));
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

    private final quickfix.StringField couponPaymentDateField = FieldFactory.newStringField(224);
    public boolean hasCouponPaymentDate() throws quickfix.FieldNotFound {
      return isSetField(224);
    }
    public String getCouponPaymentDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(couponPaymentDateField));
    }
    public NoMdEntries setCouponPaymentDate(final String value) {
      setField(FieldValue.to(couponPaymentDateField, value));
      return this;
    }
    public NoMdEntries setCouponPaymentDate(final quickfix.field.CouponPaymentDate value) {
      setField(FieldValue.to(couponPaymentDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField issueDateField = FieldFactory.newStringField(225);
    public boolean hasIssueDate() throws quickfix.FieldNotFound {
      return isSetField(225);
    }
    public String getIssueDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(issueDateField));
    }
    public NoMdEntries setIssueDate(final String value) {
      setField(FieldValue.to(issueDateField, value));
      return this;
    }
    public NoMdEntries setIssueDate(final quickfix.field.IssueDate value) {
      setField(FieldValue.to(issueDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField repoCollateralSecurityTypeField =
        FieldFactory.newStringField(239);
    public boolean hasRepoCollateralSecurityType() throws quickfix.FieldNotFound {
      return isSetField(239);
    }
    public String getRepoCollateralSecurityType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(repoCollateralSecurityTypeField));
    }
    public NoMdEntries setRepoCollateralSecurityType(final String value) {
      setField(FieldValue.to(repoCollateralSecurityTypeField, value));
      return this;
    }
    public NoMdEntries setRepoCollateralSecurityType(
        final quickfix.field.RepoCollateralSecurityType value) {
      setField(FieldValue.to(repoCollateralSecurityTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField repurchaseTermField = FieldFactory.newIntField(226);
    public boolean hasRepurchaseTerm() throws quickfix.FieldNotFound {
      return isSetField(226);
    }
    public int getRepurchaseTerm() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(repurchaseTermField));
    }
    public NoMdEntries setRepurchaseTerm(final int value) {
      setField(FieldValue.to(repurchaseTermField, value));
      return this;
    }
    public NoMdEntries setRepurchaseTerm(final quickfix.field.RepurchaseTerm value) {
      setField(FieldValue.to(repurchaseTermField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField repurchaseRateField = FieldFactory.newDoubleField(227);
    public boolean hasRepurchaseRate() throws quickfix.FieldNotFound {
      return isSetField(227);
    }
    public double getRepurchaseRate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(repurchaseRateField));
    }
    public NoMdEntries setRepurchaseRate(final double value) {
      setField(FieldValue.to(repurchaseRateField, value));
      return this;
    }
    public NoMdEntries setRepurchaseRate(final quickfix.field.RepurchaseRate value) {
      setField(FieldValue.to(repurchaseRateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField factorField = FieldFactory.newDoubleField(228);
    public boolean hasFactor() throws quickfix.FieldNotFound {
      return isSetField(228);
    }
    public double getFactor() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(factorField));
    }
    public NoMdEntries setFactor(final double value) {
      setField(FieldValue.to(factorField, value));
      return this;
    }
    public NoMdEntries setFactor(final quickfix.field.Factor value) {
      setField(FieldValue.to(factorField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField creditRatingField = FieldFactory.newStringField(255);
    public boolean hasCreditRating() throws quickfix.FieldNotFound {
      return isSetField(255);
    }
    public String getCreditRating() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(creditRatingField));
    }
    public NoMdEntries setCreditRating(final String value) {
      setField(FieldValue.to(creditRatingField, value));
      return this;
    }
    public NoMdEntries setCreditRating(final quickfix.field.CreditRating value) {
      setField(FieldValue.to(creditRatingField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField instrRegistryField = FieldFactory.newStringField(543);
    public boolean hasInstrRegistry() throws quickfix.FieldNotFound {
      return isSetField(543);
    }
    public String getInstrRegistry() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(instrRegistryField));
    }
    public NoMdEntries setInstrRegistry(final String value) {
      setField(FieldValue.to(instrRegistryField, value));
      return this;
    }
    public NoMdEntries setInstrRegistry(final quickfix.field.InstrRegistry value) {
      setField(FieldValue.to(instrRegistryField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField countryOfIssueField = FieldFactory.newStringField(470);
    public boolean hasCountryOfIssue() throws quickfix.FieldNotFound {
      return isSetField(470);
    }
    public String getCountryOfIssue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(countryOfIssueField));
    }
    public NoMdEntries setCountryOfIssue(final String value) {
      setField(FieldValue.to(countryOfIssueField, value));
      return this;
    }
    public NoMdEntries setCountryOfIssue(final quickfix.field.CountryOfIssue value) {
      setField(FieldValue.to(countryOfIssueField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField stateOrProvinceOfIssueField =
        FieldFactory.newStringField(471);
    public boolean hasStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
      return isSetField(471);
    }
    public String getStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(stateOrProvinceOfIssueField));
    }
    public NoMdEntries setStateOrProvinceOfIssue(final String value) {
      setField(FieldValue.to(stateOrProvinceOfIssueField, value));
      return this;
    }
    public NoMdEntries setStateOrProvinceOfIssue(
        final quickfix.field.StateOrProvinceOfIssue value) {
      setField(FieldValue.to(stateOrProvinceOfIssueField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField localeOfIssueField = FieldFactory.newStringField(472);
    public boolean hasLocaleOfIssue() throws quickfix.FieldNotFound {
      return isSetField(472);
    }
    public String getLocaleOfIssue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(localeOfIssueField));
    }
    public NoMdEntries setLocaleOfIssue(final String value) {
      setField(FieldValue.to(localeOfIssueField, value));
      return this;
    }
    public NoMdEntries setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
      setField(FieldValue.to(localeOfIssueField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField redemptionDateField = FieldFactory.newStringField(240);
    public boolean hasRedemptionDate() throws quickfix.FieldNotFound {
      return isSetField(240);
    }
    public String getRedemptionDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(redemptionDateField));
    }
    public NoMdEntries setRedemptionDate(final String value) {
      setField(FieldValue.to(redemptionDateField, value));
      return this;
    }
    public NoMdEntries setRedemptionDate(final quickfix.field.RedemptionDate value) {
      setField(FieldValue.to(redemptionDateField, FieldValue.of(value)));
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

    private final quickfix.StringField strikeCurrencyField = FieldFactory.newStringField(947);
    public boolean hasStrikeCurrency() throws quickfix.FieldNotFound {
      return isSetField(947);
    }
    public String getStrikeCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikeCurrencyField));
    }
    public NoMdEntries setStrikeCurrency(final String value) {
      setField(FieldValue.to(strikeCurrencyField, value));
      return this;
    }
    public NoMdEntries setStrikeCurrency(final quickfix.field.StrikeCurrency value) {
      setField(FieldValue.to(strikeCurrencyField, FieldValue.of(value)));
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

    private final quickfix.StringField poolField = FieldFactory.newStringField(691);
    public boolean hasPool() throws quickfix.FieldNotFound {
      return isSetField(691);
    }
    public String getPool() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(poolField));
    }
    public NoMdEntries setPool(final String value) {
      setField(FieldValue.to(poolField, value));
      return this;
    }
    public NoMdEntries setPool(final quickfix.field.Pool value) {
      setField(FieldValue.to(poolField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField contractSettlMonthField = FieldFactory.newStringField(667);
    public boolean hasContractSettlMonth() throws quickfix.FieldNotFound {
      return isSetField(667);
    }
    public String getContractSettlMonth() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contractSettlMonthField));
    }
    public NoMdEntries setContractSettlMonth(final String value) {
      setField(FieldValue.to(contractSettlMonthField, value));
      return this;
    }
    public NoMdEntries setContractSettlMonth(final quickfix.field.ContractSettlMonth value) {
      setField(FieldValue.to(contractSettlMonthField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField cpProgramField = FieldFactory.newIntField(875);
    public boolean hasCpProgram() throws quickfix.FieldNotFound {
      return isSetField(875);
    }
    public int getCpProgram() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(cpProgramField));
    }
    public NoMdEntries setCpProgram(final int value) {
      setField(FieldValue.to(cpProgramField, value));
      return this;
    }
    public NoMdEntries setCpProgram(final quickfix.field.CPProgram value) {
      setField(FieldValue.to(cpProgramField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField cpRegTypeField = FieldFactory.newStringField(876);
    public boolean hasCpRegType() throws quickfix.FieldNotFound {
      return isSetField(876);
    }
    public String getCpRegType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(cpRegTypeField));
    }
    public NoMdEntries setCpRegType(final String value) {
      setField(FieldValue.to(cpRegTypeField, value));
      return this;
    }
    public NoMdEntries setCpRegType(final quickfix.field.CPRegType value) {
      setField(FieldValue.to(cpRegTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField datedDateField = FieldFactory.newStringField(873);
    public boolean hasDatedDate() throws quickfix.FieldNotFound {
      return isSetField(873);
    }
    public String getDatedDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(datedDateField));
    }
    public NoMdEntries setDatedDate(final String value) {
      setField(FieldValue.to(datedDateField, value));
      return this;
    }
    public NoMdEntries setDatedDate(final quickfix.field.DatedDate value) {
      setField(FieldValue.to(datedDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField interestAccrualDateField = FieldFactory.newStringField(874);
    public boolean hasInterestAccrualDate() throws quickfix.FieldNotFound {
      return isSetField(874);
    }
    public String getInterestAccrualDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(interestAccrualDateField));
    }
    public NoMdEntries setInterestAccrualDate(final String value) {
      setField(FieldValue.to(interestAccrualDateField, value));
      return this;
    }
    public NoMdEntries setInterestAccrualDate(final quickfix.field.InterestAccrualDate value) {
      setField(FieldValue.to(interestAccrualDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField financialStatusField = FieldFactory.newStringField(291);
    public boolean hasFinancialStatus() throws quickfix.FieldNotFound {
      return isSetField(291);
    }
    public String getFinancialStatus() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(financialStatusField));
    }
    public NoMdEntries setFinancialStatus(final String value) {
      setField(FieldValue.to(financialStatusField, value));
      return this;
    }
    public NoMdEntries setFinancialStatus(final quickfix.field.FinancialStatus value) {
      setField(FieldValue.to(financialStatusField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField corporateActionField = FieldFactory.newStringField(292);
    public boolean hasCorporateAction() throws quickfix.FieldNotFound {
      return isSetField(292);
    }
    public String getCorporateAction() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(corporateActionField));
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

    private final quickfix.StringField tradingSessionSubIdField = FieldFactory.newStringField(625);
    public boolean hasTradingSessionSubId() throws quickfix.FieldNotFound {
      return isSetField(625);
    }
    public String getTradingSessionSubId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionSubIdField));
    }
    public NoMdEntries setTradingSessionSubId(final String value) {
      setField(FieldValue.to(tradingSessionSubIdField, value));
      return this;
    }
    public NoMdEntries setTradingSessionSubId(final quickfix.field.TradingSessionSubID value) {
      setField(FieldValue.to(tradingSessionSubIdField, FieldValue.of(value)));
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

    private final quickfix.StringField openCloseSettlFlagField = FieldFactory.newStringField(286);
    public boolean hasOpenCloseSettlFlag() throws quickfix.FieldNotFound {
      return isSetField(286);
    }
    public String getOpenCloseSettlFlag() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(openCloseSettlFlagField));
    }
    public NoMdEntries setOpenCloseSettlFlag(final String value) {
      setField(FieldValue.to(openCloseSettlFlagField, value));
      return this;
    }
    public NoMdEntries setOpenCloseSettlFlag(final quickfix.field.OpenCloseSettlFlag value) {
      setField(FieldValue.to(openCloseSettlFlagField, FieldValue.of(value)));
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

    private final quickfix.StringField scopeField = FieldFactory.newStringField(546);
    public boolean hasScope() throws quickfix.FieldNotFound {
      return isSetField(546);
    }
    public String getScope() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(scopeField));
    }
    public NoMdEntries setScope(final String value) {
      setField(FieldValue.to(scopeField, value));
      return this;
    }
    public NoMdEntries setScope(final quickfix.field.Scope value) {
      setField(FieldValue.to(scopeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField priceDeltaField = FieldFactory.newDoubleField(811);
    public boolean hasPriceDelta() throws quickfix.FieldNotFound {
      return isSetField(811);
    }
    public double getPriceDelta() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceDeltaField));
    }
    public NoMdEntries setPriceDelta(final double value) {
      setField(FieldValue.to(priceDeltaField, value));
      return this;
    }
    public NoMdEntries setPriceDelta(final quickfix.field.PriceDelta value) {
      setField(FieldValue.to(priceDeltaField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField netChgPrevDayField = FieldFactory.newDoubleField(451);
    public boolean hasNetChgPrevDay() throws quickfix.FieldNotFound {
      return isSetField(451);
    }
    public double getNetChgPrevDay() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(netChgPrevDayField));
    }
    public NoMdEntries setNetChgPrevDay(final double value) {
      setField(FieldValue.to(netChgPrevDayField, value));
      return this;
    }
    public NoMdEntries setNetChgPrevDay(final quickfix.field.NetChgPrevDay value) {
      setField(FieldValue.to(netChgPrevDayField, FieldValue.of(value)));
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
          new int[] {279, 285, 269, 278, 280, 55, 65, 48, 22, 460, 461, 167, 762, 200, 541, 201,
              224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223,
              207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 873, 874, 291, 292, 270, 15,
              271, 272, 273, 274, 275, 336, 625, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110,
              18, 287, 37, 299, 288, 289, 346, 290, 546, 811, 451, 58, 354, 355, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries proto) {
      final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final NoMdEntries.NoSecurityAltId group = new NoMdEntries.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final NoMdEntries.NoEvents group = new NoMdEntries.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final NoMdEntries.NoUnderlyings group = new NoMdEntries.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoLegsCount(); i++) {
        final NoMdEntries.NoLegs group = new NoMdEntries.NoLegs();
        group.fromProto(proto.getNoLegs(i));
        this.addGroupRef(group);
      }
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
      if (fieldPresence.getSecurityIdSource()) {
        this.setSecurityIdSource(proto.getSecurityIdSource());
      }
      if (fieldPresence.getProduct()) {
        this.setProduct(proto.getProduct());
      }
      if (fieldPresence.getCfiCode()) {
        this.setCfiCode(proto.getCfiCode());
      }
      if (fieldPresence.getSecurityType()) {
        this.setSecurityType(proto.getSecurityType());
      }
      if (fieldPresence.getSecuritySubType()) {
        this.setSecuritySubType(proto.getSecuritySubType());
      }
      if (fieldPresence.getMaturityMonthYear()) {
        this.setMaturityMonthYear(proto.getMaturityMonthYear());
      }
      if (fieldPresence.getMaturityDate()) {
        this.setMaturityDate(proto.getMaturityDate());
      }
      if (fieldPresence.getPutOrCall()) {
        this.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getCouponPaymentDate()) {
        this.setCouponPaymentDate(proto.getCouponPaymentDate());
      }
      if (fieldPresence.getIssueDate()) {
        this.setIssueDate(proto.getIssueDate());
      }
      if (fieldPresence.getRepoCollateralSecurityType()) {
        this.setRepoCollateralSecurityType(proto.getRepoCollateralSecurityType());
      }
      if (fieldPresence.getRepurchaseTerm()) {
        this.setRepurchaseTerm(proto.getRepurchaseTerm());
      }
      if (fieldPresence.getRepurchaseRate()) {
        this.setRepurchaseRate(proto.getRepurchaseRate());
      }
      if (fieldPresence.getFactor()) {
        this.setFactor(proto.getFactor());
      }
      if (fieldPresence.getCreditRating()) {
        this.setCreditRating(proto.getCreditRating());
      }
      if (fieldPresence.getInstrRegistry()) {
        this.setInstrRegistry(proto.getInstrRegistry());
      }
      if (fieldPresence.getCountryOfIssue()) {
        this.setCountryOfIssue(proto.getCountryOfIssue());
      }
      if (fieldPresence.getStateOrProvinceOfIssue()) {
        this.setStateOrProvinceOfIssue(proto.getStateOrProvinceOfIssue());
      }
      if (fieldPresence.getLocaleOfIssue()) {
        this.setLocaleOfIssue(proto.getLocaleOfIssue());
      }
      if (fieldPresence.getRedemptionDate()) {
        this.setRedemptionDate(proto.getRedemptionDate());
      }
      if (fieldPresence.getStrikePrice()) {
        this.setStrikePrice(proto.getStrikePrice());
      }
      if (fieldPresence.getStrikeCurrency()) {
        this.setStrikeCurrency(proto.getStrikeCurrency());
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
      if (fieldPresence.getPool()) {
        this.setPool(proto.getPool());
      }
      if (fieldPresence.getContractSettlMonth()) {
        this.setContractSettlMonth(proto.getContractSettlMonth());
      }
      if (fieldPresence.getCpProgram()) {
        this.setCpProgram(proto.getCpProgram());
      }
      if (fieldPresence.getCpRegType()) {
        this.setCpRegType(proto.getCpRegType());
      }
      if (fieldPresence.getDatedDate()) {
        this.setDatedDate(proto.getDatedDate());
      }
      if (fieldPresence.getInterestAccrualDate()) {
        this.setInterestAccrualDate(proto.getInterestAccrualDate());
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
      if (fieldPresence.getTradingSessionSubId()) {
        this.setTradingSessionSubId(proto.getTradingSessionSubId());
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
      if (fieldPresence.getOpenCloseSettlFlag()) {
        this.setOpenCloseSettlFlag(proto.getOpenCloseSettlFlag());
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
      if (fieldPresence.getScope()) {
        this.setScope(proto.getScope());
      }
      if (fieldPresence.getPriceDelta()) {
        this.setPriceDelta(proto.getPriceDelta());
      }
      if (fieldPresence.getNetChgPrevDay()) {
        this.setNetChgPrevDay(proto.getNetChgPrevDay());
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

    public garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
          .Builder builder = garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                 .NoMdEntries.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.NoMdEntries
              .FieldPresence.newBuilder();

      final int noSecurityAltIdGroupCount = this.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final NoMdEntries.NoSecurityAltId group = new NoMdEntries.NoSecurityAltId();
        this.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = this.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final NoMdEntries.NoEvents group = new NoMdEntries.NoEvents();
        this.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = this.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final NoMdEntries.NoUnderlyings group = new NoMdEntries.NoUnderlyings();
        this.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noLegsGroupCount = this.getGroupCount(555);
      for (int i = 1; i <= noLegsGroupCount; i++) {
        final NoMdEntries.NoLegs group = new NoMdEntries.NoLegs();
        this.getGroup(i, group);
        builder.addNoLegs(group.toBuilder().build());
      }

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
      if (this.hasSecurityIdSource()) {
        builder.setSecurityIdSource(this.getSecurityIdSource());
        presenceBuilder.setSecurityIdSource(true);
      }
      if (this.hasProduct()) {
        builder.setProduct(this.getProduct());
        presenceBuilder.setProduct(true);
      }
      if (this.hasCfiCode()) {
        builder.setCfiCode(this.getCfiCode());
        presenceBuilder.setCfiCode(true);
      }
      if (this.hasSecurityType()) {
        builder.setSecurityType(this.getSecurityType());
        presenceBuilder.setSecurityType(true);
      }
      if (this.hasSecuritySubType()) {
        builder.setSecuritySubType(this.getSecuritySubType());
        presenceBuilder.setSecuritySubType(true);
      }
      if (this.hasMaturityMonthYear()) {
        builder.setMaturityMonthYear(this.getMaturityMonthYear());
        presenceBuilder.setMaturityMonthYear(true);
      }
      if (this.hasMaturityDate()) {
        builder.setMaturityDate(this.getMaturityDate());
        presenceBuilder.setMaturityDate(true);
      }
      if (this.hasPutOrCall()) {
        builder.setPutOrCall(this.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (this.hasCouponPaymentDate()) {
        builder.setCouponPaymentDate(this.getCouponPaymentDate());
        presenceBuilder.setCouponPaymentDate(true);
      }
      if (this.hasIssueDate()) {
        builder.setIssueDate(this.getIssueDate());
        presenceBuilder.setIssueDate(true);
      }
      if (this.hasRepoCollateralSecurityType()) {
        builder.setRepoCollateralSecurityType(this.getRepoCollateralSecurityType());
        presenceBuilder.setRepoCollateralSecurityType(true);
      }
      if (this.hasRepurchaseTerm()) {
        builder.setRepurchaseTerm(this.getRepurchaseTerm());
        presenceBuilder.setRepurchaseTerm(true);
      }
      if (this.hasRepurchaseRate()) {
        builder.setRepurchaseRate(this.getRepurchaseRate());
        presenceBuilder.setRepurchaseRate(true);
      }
      if (this.hasFactor()) {
        builder.setFactor(this.getFactor());
        presenceBuilder.setFactor(true);
      }
      if (this.hasCreditRating()) {
        builder.setCreditRating(this.getCreditRating());
        presenceBuilder.setCreditRating(true);
      }
      if (this.hasInstrRegistry()) {
        builder.setInstrRegistry(this.getInstrRegistry());
        presenceBuilder.setInstrRegistry(true);
      }
      if (this.hasCountryOfIssue()) {
        builder.setCountryOfIssue(this.getCountryOfIssue());
        presenceBuilder.setCountryOfIssue(true);
      }
      if (this.hasStateOrProvinceOfIssue()) {
        builder.setStateOrProvinceOfIssue(this.getStateOrProvinceOfIssue());
        presenceBuilder.setStateOrProvinceOfIssue(true);
      }
      if (this.hasLocaleOfIssue()) {
        builder.setLocaleOfIssue(this.getLocaleOfIssue());
        presenceBuilder.setLocaleOfIssue(true);
      }
      if (this.hasRedemptionDate()) {
        builder.setRedemptionDate(this.getRedemptionDate());
        presenceBuilder.setRedemptionDate(true);
      }
      if (this.hasStrikePrice()) {
        builder.setStrikePrice(this.getStrikePrice());
        presenceBuilder.setStrikePrice(true);
      }
      if (this.hasStrikeCurrency()) {
        builder.setStrikeCurrency(this.getStrikeCurrency());
        presenceBuilder.setStrikeCurrency(true);
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
      if (this.hasPool()) {
        builder.setPool(this.getPool());
        presenceBuilder.setPool(true);
      }
      if (this.hasContractSettlMonth()) {
        builder.setContractSettlMonth(this.getContractSettlMonth());
        presenceBuilder.setContractSettlMonth(true);
      }
      if (this.hasCpProgram()) {
        builder.setCpProgram(this.getCpProgram());
        presenceBuilder.setCpProgram(true);
      }
      if (this.hasCpRegType()) {
        builder.setCpRegType(this.getCpRegType());
        presenceBuilder.setCpRegType(true);
      }
      if (this.hasDatedDate()) {
        builder.setDatedDate(this.getDatedDate());
        presenceBuilder.setDatedDate(true);
      }
      if (this.hasInterestAccrualDate()) {
        builder.setInterestAccrualDate(this.getInterestAccrualDate());
        presenceBuilder.setInterestAccrualDate(true);
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
      if (this.hasTradingSessionSubId()) {
        builder.setTradingSessionSubId(this.getTradingSessionSubId());
        presenceBuilder.setTradingSessionSubId(true);
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
      if (this.hasOpenCloseSettlFlag()) {
        builder.setOpenCloseSettlFlag(this.getOpenCloseSettlFlag());
        presenceBuilder.setOpenCloseSettlFlag(true);
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
      if (this.hasScope()) {
        builder.setScope(this.getScope());
        presenceBuilder.setScope(true);
      }
      if (this.hasPriceDelta()) {
        builder.setPriceDelta(this.getPriceDelta());
        presenceBuilder.setPriceDelta(true);
      }
      if (this.hasNetChgPrevDay()) {
        builder.setNetChgPrevDay(this.getNetChgPrevDay());
        presenceBuilder.setNetChgPrevDay(true);
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

  private final quickfix.IntField applQueueDepthField = FieldFactory.newIntField(813);
  public boolean hasApplQueueDepth() throws quickfix.FieldNotFound {
    return isSetField(813);
  }
  public int getApplQueueDepth() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applQueueDepthField));
  }
  public MarketDataIncrementalRefresh setApplQueueDepth(final int value) {
    setField(FieldValue.to(applQueueDepthField, value));
    return this;
  }
  public MarketDataIncrementalRefresh setApplQueueDepth(final quickfix.field.ApplQueueDepth value) {
    setField(FieldValue.to(applQueueDepthField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField applQueueResolutionField = FieldFactory.newIntField(814);
  public boolean hasApplQueueResolution() throws quickfix.FieldNotFound {
    return isSetField(814);
  }
  public int getApplQueueResolution() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applQueueResolutionField));
  }
  public MarketDataIncrementalRefresh setApplQueueResolution(final int value) {
    setField(FieldValue.to(applQueueResolutionField, value));
    return this;
  }
  public MarketDataIncrementalRefresh setApplQueueResolution(
      final quickfix.field.ApplQueueResolution value) {
    setField(FieldValue.to(applQueueResolutionField, FieldValue.of(value)));
    return this;
  }

  public MarketDataIncrementalRefresh() {
    super(new int[] {262, 813, 814, 0});
  }

  public MarketDataIncrementalRefresh(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {262, 813, 814, 0});
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

  public static Function<garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh,
      garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.getDefaultInstance();
    }

    final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.Builder builder =
        garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.newBuilder();
    final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh.FieldPresence
        .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
                                       .FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix44.Header header =
        (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasMdReqId()) {
        builder.setMdReqId(fix.getMdReqId());
        presenceBuilder.setMdReqId(true);
      }
      if (fix.hasApplQueueDepth()) {
        builder.setApplQueueDepth(fix.getApplQueueDepth());
        presenceBuilder.setApplQueueDepth(true);
      }
      if (fix.hasApplQueueResolution()) {
        builder.setApplQueueResolution(fix.getApplQueueResolution());
        presenceBuilder.setApplQueueResolution(true);
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

  public static Function<garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh,
      garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh fix =
          new garden_leave.gateway.transform.fix44.MarketDataIncrementalRefresh();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix44.Header header =
          (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix44.proto.FIX44Protos.MarketDataIncrementalRefresh
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getMdReqId()) {
        fix.setMdReqId(proto.getMdReqId());
      }
      if (fieldPresence.getApplQueueDepth()) {
        fix.setApplQueueDepth(proto.getApplQueueDepth());
      }
      if (fieldPresence.getApplQueueResolution()) {
        fix.setApplQueueResolution(proto.getApplQueueResolution());
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
