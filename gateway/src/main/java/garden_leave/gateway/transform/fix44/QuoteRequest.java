package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.860560500
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

  public static final String BEGINSTR = "FIX.4.4";
  public static final String MSGTYPE = "R";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoRelatedSym extends quickfix.Group {
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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                .NoSecurityAltId proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getSecurityAltId()) {
          this.setSecurityAltId(proto.getSecurityAltId());
        }
        if (fieldPresence.getSecurityAltIdSource()) {
          this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                   .NoSecurityAltId.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
                .FieldPresence.newBuilder();

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

      public void fromProto(
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents
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

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents
            .Builder builder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoEvents.FieldPresence
            .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest
                                           .NoRelatedSym.NoEvents.FieldPresence.newBuilder();

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

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoUnderlyings.NoUnderlyingSecurityAltId proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getUnderlyingSecurityAltId()) {
            this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
          }
          if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
            this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingSecurityAltId.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingSecurityAltId.FieldPresence.newBuilder();

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

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoUnderlyings.NoUnderlyingStips proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getUnderlyingStipType()) {
            this.setUnderlyingStipType(proto.getUnderlyingStipType());
          }
          if (fieldPresence.getUnderlyingStipValue()) {
            this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .NoUnderlyingStips.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingStips.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingStips.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                .NoUnderlyings proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .FieldPresence fieldPresence = proto.getFieldPresence();

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

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                   .NoUnderlyings.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                .FieldPresence.newBuilder();

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

    public static class NoStipulations extends quickfix.Group {
      private final quickfix.StringField stipulationTypeField = FieldFactory.newStringField(233);
      public boolean hasStipulationType() throws quickfix.FieldNotFound {
        return isSetField(233);
      }
      public String getStipulationType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(stipulationTypeField));
      }
      public NoStipulations setStipulationType(final String value) {
        setField(FieldValue.to(stipulationTypeField, value));
        return this;
      }
      public NoStipulations setStipulationType(final quickfix.field.StipulationType value) {
        setField(FieldValue.to(stipulationTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField stipulationValueField = FieldFactory.newStringField(234);
      public boolean hasStipulationValue() throws quickfix.FieldNotFound {
        return isSetField(234);
      }
      public String getStipulationValue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(stipulationValueField));
      }
      public NoStipulations setStipulationValue(final String value) {
        setField(FieldValue.to(stipulationValueField, value));
        return this;
      }
      public NoStipulations setStipulationValue(final quickfix.field.StipulationValue value) {
        setField(FieldValue.to(stipulationValueField, FieldValue.of(value)));
        return this;
      }

      public NoStipulations() {
        super(232, 233, new int[] {233, 234, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                .NoStipulations proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getStipulationType()) {
          this.setStipulationType(proto.getStipulationType());
        }
        if (fieldPresence.getStipulationValue()) {
          this.setStipulationValue(proto.getStipulationValue());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoStipulations.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                   .NoStipulations.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoStipulations
                .FieldPresence.newBuilder();

        if (this.hasStipulationType()) {
          builder.setStipulationType(this.getStipulationType());
          presenceBuilder.setStipulationType(true);
        }
        if (this.hasStipulationValue()) {
          builder.setStipulationValue(this.getStipulationValue());
          presenceBuilder.setStipulationValue(true);
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

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoLegs.NoLegSecurityAltId proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getLegSecurityAltId()) {
            this.setLegSecurityAltId(proto.getLegSecurityAltId());
          }
          if (fieldPresence.getLegSecurityAltIdSource()) {
            this.setLegSecurityAltIdSource(proto.getLegSecurityAltIdSource());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoLegSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoLegSecurityAltId.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
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

      public static class NoLegStipulations extends quickfix.Group {
        private final quickfix.StringField legStipulationTypeField =
            FieldFactory.newStringField(688);
        public boolean hasLegStipulationType() throws quickfix.FieldNotFound {
          return isSetField(688);
        }
        public String getLegStipulationType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(legStipulationTypeField));
        }
        public NoLegStipulations setLegStipulationType(final String value) {
          setField(FieldValue.to(legStipulationTypeField, value));
          return this;
        }
        public NoLegStipulations setLegStipulationType(
            final quickfix.field.LegStipulationType value) {
          setField(FieldValue.to(legStipulationTypeField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.StringField legStipulationValueField =
            FieldFactory.newStringField(689);
        public boolean hasLegStipulationValue() throws quickfix.FieldNotFound {
          return isSetField(689);
        }
        public String getLegStipulationValue() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(legStipulationValueField));
        }
        public NoLegStipulations setLegStipulationValue(final String value) {
          setField(FieldValue.to(legStipulationValueField, value));
          return this;
        }
        public NoLegStipulations setLegStipulationValue(
            final quickfix.field.LegStipulationValue value) {
          setField(FieldValue.to(legStipulationValueField, FieldValue.of(value)));
          return this;
        }

        public NoLegStipulations() {
          super(683, 688, new int[] {688, 689, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoLegs.NoLegStipulations proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getLegStipulationType()) {
            this.setLegStipulationType(proto.getLegStipulationType());
          }
          if (fieldPresence.getLegStipulationValue()) {
            this.setLegStipulationValue(proto.getLegStipulationValue());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoLegStipulations.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoLegStipulations.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoLegStipulations.FieldPresence.newBuilder();

          if (this.hasLegStipulationType()) {
            builder.setLegStipulationType(this.getLegStipulationType());
            presenceBuilder.setLegStipulationType(true);
          }
          if (this.hasLegStipulationValue()) {
            builder.setLegStipulationValue(this.getLegStipulationValue());
            presenceBuilder.setLegStipulationValue(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      public static class NoNestedPartyIds extends quickfix.Group {
        public static class NoNestedPartySubIds extends quickfix.Group {
          private final quickfix.StringField nestedPartySubIdField =
              FieldFactory.newStringField(545);
          public boolean hasNestedPartySubId() throws quickfix.FieldNotFound {
            return isSetField(545);
          }
          public String getNestedPartySubId() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(nestedPartySubIdField));
          }
          public NoNestedPartySubIds setNestedPartySubId(final String value) {
            setField(FieldValue.to(nestedPartySubIdField, value));
            return this;
          }
          public NoNestedPartySubIds setNestedPartySubId(
              final quickfix.field.NestedPartySubID value) {
            setField(FieldValue.to(nestedPartySubIdField, FieldValue.of(value)));
            return this;
          }

          private final quickfix.IntField nestedPartySubIdTypeField = FieldFactory.newIntField(805);
          public boolean hasNestedPartySubIdType() throws quickfix.FieldNotFound {
            return isSetField(805);
          }
          public int getNestedPartySubIdType() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(nestedPartySubIdTypeField));
          }
          public NoNestedPartySubIds setNestedPartySubIdType(final int value) {
            setField(FieldValue.to(nestedPartySubIdTypeField, value));
            return this;
          }
          public NoNestedPartySubIds setNestedPartySubIdType(
              final quickfix.field.NestedPartySubIDType value) {
            setField(FieldValue.to(nestedPartySubIdTypeField, FieldValue.of(value)));
            return this;
          }

          public NoNestedPartySubIds() {
            super(804, 545, new int[] {545, 805, 0});
          }

          @Override
          public void addGroup(final quickfix.Group group) {
            addGroupRef(group);
          }

          public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                    .NoLegs.NoNestedPartyIds.NoNestedPartySubIds proto) {
            final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.FieldPresence fieldPresence =
                proto.getFieldPresence();

            if (fieldPresence.getNestedPartySubId()) {
              this.setNestedPartySubId(proto.getNestedPartySubId());
            }
            if (fieldPresence.getNestedPartySubIdType()) {
              this.setNestedPartySubIdType(proto.getNestedPartySubIdType());
            }
          }

          public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.NoNestedPartySubIds.Builder
              toBuilder() throws quickfix.FieldNotFound {
            final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.Builder builder =
                garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                    .NoNestedPartyIds.NoNestedPartySubIds.newBuilder();
            final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.FieldPresence.Builder presenceBuilder =
                garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
                    .NoNestedPartyIds.NoNestedPartySubIds.FieldPresence.newBuilder();

            if (this.hasNestedPartySubId()) {
              builder.setNestedPartySubId(this.getNestedPartySubId());
              presenceBuilder.setNestedPartySubId(true);
            }
            if (this.hasNestedPartySubIdType()) {
              builder.setNestedPartySubIdType(this.getNestedPartySubIdType());
              presenceBuilder.setNestedPartySubIdType(true);
            }
            builder.setFieldPresence(presenceBuilder.build());
            return builder;
          }
        }

        private final quickfix.StringField nestedPartyIdField = FieldFactory.newStringField(524);
        public boolean hasNestedPartyId() throws quickfix.FieldNotFound {
          return isSetField(524);
        }
        public String getNestedPartyId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nestedPartyIdField));
        }
        public NoNestedPartyIds setNestedPartyId(final String value) {
          setField(FieldValue.to(nestedPartyIdField, value));
          return this;
        }
        public NoNestedPartyIds setNestedPartyId(final quickfix.field.NestedPartyID value) {
          setField(FieldValue.to(nestedPartyIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.CharField nestedPartyIdSourceField = FieldFactory.newCharField(525);
        public boolean hasNestedPartyIdSource() throws quickfix.FieldNotFound {
          return isSetField(525);
        }
        public int getNestedPartyIdSource() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nestedPartyIdSourceField));
        }
        public NoNestedPartyIds setNestedPartyIdSource(final int value) {
          setField(FieldValue.to(nestedPartyIdSourceField, value));
          return this;
        }
        public NoNestedPartyIds setNestedPartyIdSource(final char value) {
          setField(FieldValue.to(nestedPartyIdSourceField, value));
          return this;
        }
        public NoNestedPartyIds setNestedPartyIdSource(final String value) {
          setField(FieldValue.to(nestedPartyIdSourceField, value));
          return this;
        }
        public NoNestedPartyIds setNestedPartyIdSource(
            final quickfix.field.NestedPartyIDSource value) {
          setField(FieldValue.to(nestedPartyIdSourceField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField nestedPartyRoleField = FieldFactory.newIntField(538);
        public boolean hasNestedPartyRole() throws quickfix.FieldNotFound {
          return isSetField(538);
        }
        public int getNestedPartyRole() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nestedPartyRoleField));
        }
        public NoNestedPartyIds setNestedPartyRole(final int value) {
          setField(FieldValue.to(nestedPartyRoleField, value));
          return this;
        }
        public NoNestedPartyIds setNestedPartyRole(final quickfix.field.NestedPartyRole value) {
          setField(FieldValue.to(nestedPartyRoleField, FieldValue.of(value)));
          return this;
        }

        public NoNestedPartyIds() {
          super(539, 524, new int[] {524, 525, 538, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoLegs.NoNestedPartyIds proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.FieldPresence fieldPresence = proto.getFieldPresence();

          for (int i = 0; i < proto.getNoNestedPartySubIdsCount(); i++) {
            final NoNestedPartyIds.NoNestedPartySubIds group =
                new NoNestedPartyIds.NoNestedPartySubIds();
            group.fromProto(proto.getNoNestedPartySubIds(i));
            this.addGroupRef(group);
          }
          if (fieldPresence.getNestedPartyId()) {
            this.setNestedPartyId(proto.getNestedPartyId());
          }
          if (fieldPresence.getNestedPartyIdSource()) {
            this.setNestedPartyIdSource(proto.getNestedPartyIdSource());
          }
          if (fieldPresence.getNestedPartyRole()) {
            this.setNestedPartyRole(proto.getNestedPartyRole());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoNestedPartyIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIds
                  .newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIds
                  .FieldPresence.newBuilder();

          final int noNestedPartySubIdsGroupCount = this.getGroupCount(804);
          for (int i = 1; i <= noNestedPartySubIdsGroupCount; i++) {
            final NoNestedPartyIds.NoNestedPartySubIds group =
                new NoNestedPartyIds.NoNestedPartySubIds();
            this.getGroup(i, group);
            builder.addNoNestedPartySubIds(group.toBuilder().build());
          }

          if (this.hasNestedPartyId()) {
            builder.setNestedPartyId(this.getNestedPartyId());
            presenceBuilder.setNestedPartyId(true);
          }
          if (this.hasNestedPartyIdSource()) {
            builder.setNestedPartyIdSource(this.getNestedPartyIdSource());
            presenceBuilder.setNestedPartyIdSource(true);
          }
          if (this.hasNestedPartyRole()) {
            builder.setNestedPartyRole(this.getNestedPartyRole());
            presenceBuilder.setNestedPartyRole(true);
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

      private final quickfix.DoubleField legQtyField = FieldFactory.newDoubleField(687);
      public boolean hasLegQty() throws quickfix.FieldNotFound {
        return isSetField(687);
      }
      public double getLegQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legQtyField));
      }
      public NoLegs setLegQty(final double value) {
        setField(FieldValue.to(legQtyField, value));
        return this;
      }
      public NoLegs setLegQty(final quickfix.field.LegQty value) {
        setField(FieldValue.to(legQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legSwapTypeField = FieldFactory.newIntField(690);
      public boolean hasLegSwapType() throws quickfix.FieldNotFound {
        return isSetField(690);
      }
      public int getLegSwapType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSwapTypeField));
      }
      public NoLegs setLegSwapType(final int value) {
        setField(FieldValue.to(legSwapTypeField, value));
        return this;
      }
      public NoLegs setLegSwapType(final quickfix.field.LegSwapType value) {
        setField(FieldValue.to(legSwapTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField legSettlTypeField = FieldFactory.newCharField(587);
      public boolean hasLegSettlType() throws quickfix.FieldNotFound {
        return isSetField(587);
      }
      public int getLegSettlType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSettlTypeField));
      }
      public NoLegs setLegSettlType(final int value) {
        setField(FieldValue.to(legSettlTypeField, value));
        return this;
      }
      public NoLegs setLegSettlType(final char value) {
        setField(FieldValue.to(legSettlTypeField, value));
        return this;
      }
      public NoLegs setLegSettlType(final String value) {
        setField(FieldValue.to(legSettlTypeField, value));
        return this;
      }
      public NoLegs setLegSettlType(final quickfix.field.LegSettlType value) {
        setField(FieldValue.to(legSettlTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legSettlDateField = FieldFactory.newStringField(588);
      public boolean hasLegSettlDate() throws quickfix.FieldNotFound {
        return isSetField(588);
      }
      public String getLegSettlDate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legSettlDateField));
      }
      public NoLegs setLegSettlDate(final String value) {
        setField(FieldValue.to(legSettlDateField, value));
        return this;
      }
      public NoLegs setLegSettlDate(final quickfix.field.LegSettlDate value) {
        setField(FieldValue.to(legSettlDateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legBenchmarkCurveCurrencyField =
          FieldFactory.newStringField(676);
      public boolean hasLegBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
        return isSetField(676);
      }
      public String getLegBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legBenchmarkCurveCurrencyField));
      }
      public NoLegs setLegBenchmarkCurveCurrency(final String value) {
        setField(FieldValue.to(legBenchmarkCurveCurrencyField, value));
        return this;
      }
      public NoLegs setLegBenchmarkCurveCurrency(
          final quickfix.field.LegBenchmarkCurveCurrency value) {
        setField(FieldValue.to(legBenchmarkCurveCurrencyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legBenchmarkCurveNameField =
          FieldFactory.newStringField(677);
      public boolean hasLegBenchmarkCurveName() throws quickfix.FieldNotFound {
        return isSetField(677);
      }
      public String getLegBenchmarkCurveName() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legBenchmarkCurveNameField));
      }
      public NoLegs setLegBenchmarkCurveName(final String value) {
        setField(FieldValue.to(legBenchmarkCurveNameField, value));
        return this;
      }
      public NoLegs setLegBenchmarkCurveName(final quickfix.field.LegBenchmarkCurveName value) {
        setField(FieldValue.to(legBenchmarkCurveNameField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legBenchmarkCurvePointField =
          FieldFactory.newStringField(678);
      public boolean hasLegBenchmarkCurvePoint() throws quickfix.FieldNotFound {
        return isSetField(678);
      }
      public String getLegBenchmarkCurvePoint() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legBenchmarkCurvePointField));
      }
      public NoLegs setLegBenchmarkCurvePoint(final String value) {
        setField(FieldValue.to(legBenchmarkCurvePointField, value));
        return this;
      }
      public NoLegs setLegBenchmarkCurvePoint(final quickfix.field.LegBenchmarkCurvePoint value) {
        setField(FieldValue.to(legBenchmarkCurvePointField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legBenchmarkPriceField = FieldFactory.newDoubleField(679);
      public boolean hasLegBenchmarkPrice() throws quickfix.FieldNotFound {
        return isSetField(679);
      }
      public double getLegBenchmarkPrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legBenchmarkPriceField));
      }
      public NoLegs setLegBenchmarkPrice(final double value) {
        setField(FieldValue.to(legBenchmarkPriceField, value));
        return this;
      }
      public NoLegs setLegBenchmarkPrice(final quickfix.field.LegBenchmarkPrice value) {
        setField(FieldValue.to(legBenchmarkPriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legBenchmarkPriceTypeField = FieldFactory.newIntField(680);
      public boolean hasLegBenchmarkPriceType() throws quickfix.FieldNotFound {
        return isSetField(680);
      }
      public int getLegBenchmarkPriceType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legBenchmarkPriceTypeField));
      }
      public NoLegs setLegBenchmarkPriceType(final int value) {
        setField(FieldValue.to(legBenchmarkPriceTypeField, value));
        return this;
      }
      public NoLegs setLegBenchmarkPriceType(final quickfix.field.LegBenchmarkPriceType value) {
        setField(FieldValue.to(legBenchmarkPriceTypeField, FieldValue.of(value)));
        return this;
      }

      public NoLegs() {
        super(555, 600,
            new int[] {600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252,
                253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620,
                621, 622, 623, 624, 556, 740, 739, 955, 956, 687, 690, 587, 588, 676, 677, 678, 679,
                680, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoLegSecurityAltIdCount(); i++) {
          final NoLegs.NoLegSecurityAltId group = new NoLegs.NoLegSecurityAltId();
          group.fromProto(proto.getNoLegSecurityAltId(i));
          this.addGroupRef(group);
        }
        for (int i = 0; i < proto.getNoLegStipulationsCount(); i++) {
          final NoLegs.NoLegStipulations group = new NoLegs.NoLegStipulations();
          group.fromProto(proto.getNoLegStipulations(i));
          this.addGroupRef(group);
        }
        for (int i = 0; i < proto.getNoNestedPartyIdsCount(); i++) {
          final NoLegs.NoNestedPartyIds group = new NoLegs.NoNestedPartyIds();
          group.fromProto(proto.getNoNestedPartyIds(i));
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
        if (fieldPresence.getLegQty()) {
          this.setLegQty(proto.getLegQty());
        }
        if (fieldPresence.getLegSwapType()) {
          this.setLegSwapType(proto.getLegSwapType());
        }
        if (fieldPresence.getLegSettlType()) {
          this.setLegSettlType(proto.getLegSettlType());
        }
        if (fieldPresence.getLegSettlDate()) {
          this.setLegSettlDate(proto.getLegSettlDate());
        }
        if (fieldPresence.getLegBenchmarkCurveCurrency()) {
          this.setLegBenchmarkCurveCurrency(proto.getLegBenchmarkCurveCurrency());
        }
        if (fieldPresence.getLegBenchmarkCurveName()) {
          this.setLegBenchmarkCurveName(proto.getLegBenchmarkCurveName());
        }
        if (fieldPresence.getLegBenchmarkCurvePoint()) {
          this.setLegBenchmarkCurvePoint(proto.getLegBenchmarkCurvePoint());
        }
        if (fieldPresence.getLegBenchmarkPrice()) {
          this.setLegBenchmarkPrice(proto.getLegBenchmarkPrice());
        }
        if (fieldPresence.getLegBenchmarkPriceType()) {
          this.setLegBenchmarkPriceType(proto.getLegBenchmarkPriceType());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs
            .Builder builder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoLegs.FieldPresence
            .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest
                                           .NoRelatedSym.NoLegs.FieldPresence.newBuilder();

        final int noLegSecurityAltIdGroupCount = this.getGroupCount(604);
        for (int i = 1; i <= noLegSecurityAltIdGroupCount; i++) {
          final NoLegs.NoLegSecurityAltId group = new NoLegs.NoLegSecurityAltId();
          this.getGroup(i, group);
          builder.addNoLegSecurityAltId(group.toBuilder().build());
        }

        final int noLegStipulationsGroupCount = this.getGroupCount(683);
        for (int i = 1; i <= noLegStipulationsGroupCount; i++) {
          final NoLegs.NoLegStipulations group = new NoLegs.NoLegStipulations();
          this.getGroup(i, group);
          builder.addNoLegStipulations(group.toBuilder().build());
        }

        final int noNestedPartyIdsGroupCount = this.getGroupCount(539);
        for (int i = 1; i <= noNestedPartyIdsGroupCount; i++) {
          final NoLegs.NoNestedPartyIds group = new NoLegs.NoNestedPartyIds();
          this.getGroup(i, group);
          builder.addNoNestedPartyIds(group.toBuilder().build());
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
        if (this.hasLegQty()) {
          builder.setLegQty(this.getLegQty());
          presenceBuilder.setLegQty(true);
        }
        if (this.hasLegSwapType()) {
          builder.setLegSwapType(this.getLegSwapType());
          presenceBuilder.setLegSwapType(true);
        }
        if (this.hasLegSettlType()) {
          builder.setLegSettlType(this.getLegSettlType());
          presenceBuilder.setLegSettlType(true);
        }
        if (this.hasLegSettlDate()) {
          builder.setLegSettlDate(this.getLegSettlDate());
          presenceBuilder.setLegSettlDate(true);
        }
        if (this.hasLegBenchmarkCurveCurrency()) {
          builder.setLegBenchmarkCurveCurrency(this.getLegBenchmarkCurveCurrency());
          presenceBuilder.setLegBenchmarkCurveCurrency(true);
        }
        if (this.hasLegBenchmarkCurveName()) {
          builder.setLegBenchmarkCurveName(this.getLegBenchmarkCurveName());
          presenceBuilder.setLegBenchmarkCurveName(true);
        }
        if (this.hasLegBenchmarkCurvePoint()) {
          builder.setLegBenchmarkCurvePoint(this.getLegBenchmarkCurvePoint());
          presenceBuilder.setLegBenchmarkCurvePoint(true);
        }
        if (this.hasLegBenchmarkPrice()) {
          builder.setLegBenchmarkPrice(this.getLegBenchmarkPrice());
          presenceBuilder.setLegBenchmarkPrice(true);
        }
        if (this.hasLegBenchmarkPriceType()) {
          builder.setLegBenchmarkPriceType(this.getLegBenchmarkPriceType());
          presenceBuilder.setLegBenchmarkPriceType(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoQuoteQualifiers extends quickfix.Group {
      private final quickfix.CharField quoteQualifierField = FieldFactory.newCharField(695);
      public boolean hasQuoteQualifier() throws quickfix.FieldNotFound {
        return isSetField(695);
      }
      public int getQuoteQualifier() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(quoteQualifierField));
      }
      public NoQuoteQualifiers setQuoteQualifier(final int value) {
        setField(FieldValue.to(quoteQualifierField, value));
        return this;
      }
      public NoQuoteQualifiers setQuoteQualifier(final char value) {
        setField(FieldValue.to(quoteQualifierField, value));
        return this;
      }
      public NoQuoteQualifiers setQuoteQualifier(final String value) {
        setField(FieldValue.to(quoteQualifierField, value));
        return this;
      }
      public NoQuoteQualifiers setQuoteQualifier(final quickfix.field.QuoteQualifier value) {
        setField(FieldValue.to(quoteQualifierField, FieldValue.of(value)));
        return this;
      }

      public NoQuoteQualifiers() {
        super(735, 695, new int[] {695, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                .NoQuoteQualifiers proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getQuoteQualifier()) {
          this.setQuoteQualifier(proto.getQuoteQualifier());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                   .NoQuoteQualifiers.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
                .FieldPresence.newBuilder();

        if (this.hasQuoteQualifier()) {
          builder.setQuoteQualifier(this.getQuoteQualifier());
          presenceBuilder.setQuoteQualifier(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoPartyIds extends quickfix.Group {
      public static class NoPartySubIds extends quickfix.Group {
        private final quickfix.StringField partySubIdField = FieldFactory.newStringField(523);
        public boolean hasPartySubId() throws quickfix.FieldNotFound {
          return isSetField(523);
        }
        public String getPartySubId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(partySubIdField));
        }
        public NoPartySubIds setPartySubId(final String value) {
          setField(FieldValue.to(partySubIdField, value));
          return this;
        }
        public NoPartySubIds setPartySubId(final quickfix.field.PartySubID value) {
          setField(FieldValue.to(partySubIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField partySubIdTypeField = FieldFactory.newIntField(803);
        public boolean hasPartySubIdType() throws quickfix.FieldNotFound {
          return isSetField(803);
        }
        public int getPartySubIdType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(partySubIdTypeField));
        }
        public NoPartySubIds setPartySubIdType(final int value) {
          setField(FieldValue.to(partySubIdTypeField, value));
          return this;
        }
        public NoPartySubIds setPartySubIdType(final quickfix.field.PartySubIDType value) {
          setField(FieldValue.to(partySubIdTypeField, FieldValue.of(value)));
          return this;
        }

        public NoPartySubIds() {
          super(802, 523, new int[] {523, 803, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
                                  .NoPartyIds.NoPartySubIds proto) {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getPartySubId()) {
            this.setPartySubId(proto.getPartySubId());
          }
          if (fieldPresence.getPartySubIdType()) {
            this.setPartySubIdType(proto.getPartySubIdType());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .NoPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
                  .NoPartySubIds.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
                  .NoPartySubIds.FieldPresence.newBuilder();

          if (this.hasPartySubId()) {
            builder.setPartySubId(this.getPartySubId());
            presenceBuilder.setPartySubId(true);
          }
          if (this.hasPartySubIdType()) {
            builder.setPartySubIdType(this.getPartySubIdType());
            presenceBuilder.setPartySubIdType(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField partyIdField = FieldFactory.newStringField(448);
      public boolean hasPartyId() throws quickfix.FieldNotFound {
        return isSetField(448);
      }
      public String getPartyId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(partyIdField));
      }
      public NoPartyIds setPartyId(final String value) {
        setField(FieldValue.to(partyIdField, value));
        return this;
      }
      public NoPartyIds setPartyId(final quickfix.field.PartyID value) {
        setField(FieldValue.to(partyIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField partyIdSourceField = FieldFactory.newCharField(447);
      public boolean hasPartyIdSource() throws quickfix.FieldNotFound {
        return isSetField(447);
      }
      public int getPartyIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(partyIdSourceField));
      }
      public NoPartyIds setPartyIdSource(final int value) {
        setField(FieldValue.to(partyIdSourceField, value));
        return this;
      }
      public NoPartyIds setPartyIdSource(final char value) {
        setField(FieldValue.to(partyIdSourceField, value));
        return this;
      }
      public NoPartyIds setPartyIdSource(final String value) {
        setField(FieldValue.to(partyIdSourceField, value));
        return this;
      }
      public NoPartyIds setPartyIdSource(final quickfix.field.PartyIDSource value) {
        setField(FieldValue.to(partyIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField partyRoleField = FieldFactory.newIntField(452);
      public boolean hasPartyRole() throws quickfix.FieldNotFound {
        return isSetField(452);
      }
      public int getPartyRole() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(partyRoleField));
      }
      public NoPartyIds setPartyRole(final int value) {
        setField(FieldValue.to(partyRoleField, value));
        return this;
      }
      public NoPartyIds setPartyRole(final quickfix.field.PartyRole value) {
        setField(FieldValue.to(partyRoleField, FieldValue.of(value)));
        return this;
      }

      public NoPartyIds() {
        super(453, 448, new int[] {448, 447, 452, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(
          final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds proto) {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoPartySubIdsCount(); i++) {
          final NoPartyIds.NoPartySubIds group = new NoPartyIds.NoPartySubIds();
          group.fromProto(proto.getNoPartySubIds(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getPartyId()) {
          this.setPartyId(proto.getPartyId());
        }
        if (fieldPresence.getPartyIdSource()) {
          this.setPartyIdSource(proto.getPartyIdSource());
        }
        if (fieldPresence.getPartyRole()) {
          this.setPartyRole(proto.getPartyRole());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .Builder builder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.NoPartyIds.FieldPresence
                .newBuilder();

        final int noPartySubIdsGroupCount = this.getGroupCount(802);
        for (int i = 1; i <= noPartySubIdsGroupCount; i++) {
          final NoPartyIds.NoPartySubIds group = new NoPartyIds.NoPartySubIds();
          this.getGroup(i, group);
          builder.addNoPartySubIds(group.toBuilder().build());
        }

        if (this.hasPartyId()) {
          builder.setPartyId(this.getPartyId());
          presenceBuilder.setPartyId(true);
        }
        if (this.hasPartyIdSource()) {
          builder.setPartyIdSource(this.getPartyIdSource());
          presenceBuilder.setPartyIdSource(true);
        }
        if (this.hasPartyRole()) {
          builder.setPartyRole(this.getPartyRole());
          presenceBuilder.setPartyRole(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

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

    private final quickfix.StringField securityIdSourceField = FieldFactory.newStringField(22);
    public boolean hasSecurityIdSource() throws quickfix.FieldNotFound {
      return isSetField(22);
    }
    public String getSecurityIdSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityIdSourceField));
    }
    public NoRelatedSym setSecurityIdSource(final String value) {
      setField(FieldValue.to(securityIdSourceField, value));
      return this;
    }
    public NoRelatedSym setSecurityIdSource(final quickfix.field.SecurityIDSource value) {
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
    public NoRelatedSym setProduct(final int value) {
      setField(FieldValue.to(productField, value));
      return this;
    }
    public NoRelatedSym setProduct(final quickfix.field.Product value) {
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
    public NoRelatedSym setCfiCode(final String value) {
      setField(FieldValue.to(cfiCodeField, value));
      return this;
    }
    public NoRelatedSym setCfiCode(final quickfix.field.CFICode value) {
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
    public NoRelatedSym setSecurityType(final String value) {
      setField(FieldValue.to(securityTypeField, value));
      return this;
    }
    public NoRelatedSym setSecurityType(final quickfix.field.SecurityType value) {
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
    public NoRelatedSym setSecuritySubType(final String value) {
      setField(FieldValue.to(securitySubTypeField, value));
      return this;
    }
    public NoRelatedSym setSecuritySubType(final quickfix.field.SecuritySubType value) {
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
    public NoRelatedSym setMaturityMonthYear(final String value) {
      setField(FieldValue.to(maturityMonthYearField, value));
      return this;
    }
    public NoRelatedSym setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
    public NoRelatedSym setMaturityDate(final String value) {
      setField(FieldValue.to(maturityDateField, value));
      return this;
    }
    public NoRelatedSym setMaturityDate(final quickfix.field.MaturityDate value) {
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
    public NoRelatedSym setPutOrCall(final int value) {
      setField(FieldValue.to(putOrCallField, value));
      return this;
    }
    public NoRelatedSym setPutOrCall(final quickfix.field.PutOrCall value) {
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
    public NoRelatedSym setCouponPaymentDate(final String value) {
      setField(FieldValue.to(couponPaymentDateField, value));
      return this;
    }
    public NoRelatedSym setCouponPaymentDate(final quickfix.field.CouponPaymentDate value) {
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
    public NoRelatedSym setIssueDate(final String value) {
      setField(FieldValue.to(issueDateField, value));
      return this;
    }
    public NoRelatedSym setIssueDate(final quickfix.field.IssueDate value) {
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
    public NoRelatedSym setRepoCollateralSecurityType(final String value) {
      setField(FieldValue.to(repoCollateralSecurityTypeField, value));
      return this;
    }
    public NoRelatedSym setRepoCollateralSecurityType(
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
    public NoRelatedSym setRepurchaseTerm(final int value) {
      setField(FieldValue.to(repurchaseTermField, value));
      return this;
    }
    public NoRelatedSym setRepurchaseTerm(final quickfix.field.RepurchaseTerm value) {
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
    public NoRelatedSym setRepurchaseRate(final double value) {
      setField(FieldValue.to(repurchaseRateField, value));
      return this;
    }
    public NoRelatedSym setRepurchaseRate(final quickfix.field.RepurchaseRate value) {
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
    public NoRelatedSym setFactor(final double value) {
      setField(FieldValue.to(factorField, value));
      return this;
    }
    public NoRelatedSym setFactor(final quickfix.field.Factor value) {
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
    public NoRelatedSym setCreditRating(final String value) {
      setField(FieldValue.to(creditRatingField, value));
      return this;
    }
    public NoRelatedSym setCreditRating(final quickfix.field.CreditRating value) {
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
    public NoRelatedSym setInstrRegistry(final String value) {
      setField(FieldValue.to(instrRegistryField, value));
      return this;
    }
    public NoRelatedSym setInstrRegistry(final quickfix.field.InstrRegistry value) {
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
    public NoRelatedSym setCountryOfIssue(final String value) {
      setField(FieldValue.to(countryOfIssueField, value));
      return this;
    }
    public NoRelatedSym setCountryOfIssue(final quickfix.field.CountryOfIssue value) {
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
    public NoRelatedSym setStateOrProvinceOfIssue(final String value) {
      setField(FieldValue.to(stateOrProvinceOfIssueField, value));
      return this;
    }
    public NoRelatedSym setStateOrProvinceOfIssue(
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
    public NoRelatedSym setLocaleOfIssue(final String value) {
      setField(FieldValue.to(localeOfIssueField, value));
      return this;
    }
    public NoRelatedSym setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
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
    public NoRelatedSym setRedemptionDate(final String value) {
      setField(FieldValue.to(redemptionDateField, value));
      return this;
    }
    public NoRelatedSym setRedemptionDate(final quickfix.field.RedemptionDate value) {
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
    public NoRelatedSym setStrikePrice(final double value) {
      setField(FieldValue.to(strikePriceField, value));
      return this;
    }
    public NoRelatedSym setStrikePrice(final quickfix.field.StrikePrice value) {
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
    public NoRelatedSym setStrikeCurrency(final String value) {
      setField(FieldValue.to(strikeCurrencyField, value));
      return this;
    }
    public NoRelatedSym setStrikeCurrency(final quickfix.field.StrikeCurrency value) {
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

    private final quickfix.StringField poolField = FieldFactory.newStringField(691);
    public boolean hasPool() throws quickfix.FieldNotFound {
      return isSetField(691);
    }
    public String getPool() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(poolField));
    }
    public NoRelatedSym setPool(final String value) {
      setField(FieldValue.to(poolField, value));
      return this;
    }
    public NoRelatedSym setPool(final quickfix.field.Pool value) {
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
    public NoRelatedSym setContractSettlMonth(final String value) {
      setField(FieldValue.to(contractSettlMonthField, value));
      return this;
    }
    public NoRelatedSym setContractSettlMonth(final quickfix.field.ContractSettlMonth value) {
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
    public NoRelatedSym setCpProgram(final int value) {
      setField(FieldValue.to(cpProgramField, value));
      return this;
    }
    public NoRelatedSym setCpProgram(final quickfix.field.CPProgram value) {
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
    public NoRelatedSym setCpRegType(final String value) {
      setField(FieldValue.to(cpRegTypeField, value));
      return this;
    }
    public NoRelatedSym setCpRegType(final quickfix.field.CPRegType value) {
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
    public NoRelatedSym setDatedDate(final String value) {
      setField(FieldValue.to(datedDateField, value));
      return this;
    }
    public NoRelatedSym setDatedDate(final quickfix.field.DatedDate value) {
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
    public NoRelatedSym setInterestAccrualDate(final String value) {
      setField(FieldValue.to(interestAccrualDateField, value));
      return this;
    }
    public NoRelatedSym setInterestAccrualDate(final quickfix.field.InterestAccrualDate value) {
      setField(FieldValue.to(interestAccrualDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField agreementDescField = FieldFactory.newStringField(913);
    public boolean hasAgreementDesc() throws quickfix.FieldNotFound {
      return isSetField(913);
    }
    public String getAgreementDesc() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(agreementDescField));
    }
    public NoRelatedSym setAgreementDesc(final String value) {
      setField(FieldValue.to(agreementDescField, value));
      return this;
    }
    public NoRelatedSym setAgreementDesc(final quickfix.field.AgreementDesc value) {
      setField(FieldValue.to(agreementDescField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField agreementIdField = FieldFactory.newStringField(914);
    public boolean hasAgreementId() throws quickfix.FieldNotFound {
      return isSetField(914);
    }
    public String getAgreementId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(agreementIdField));
    }
    public NoRelatedSym setAgreementId(final String value) {
      setField(FieldValue.to(agreementIdField, value));
      return this;
    }
    public NoRelatedSym setAgreementId(final quickfix.field.AgreementID value) {
      setField(FieldValue.to(agreementIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField agreementDateField = FieldFactory.newStringField(915);
    public boolean hasAgreementDate() throws quickfix.FieldNotFound {
      return isSetField(915);
    }
    public String getAgreementDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(agreementDateField));
    }
    public NoRelatedSym setAgreementDate(final String value) {
      setField(FieldValue.to(agreementDateField, value));
      return this;
    }
    public NoRelatedSym setAgreementDate(final quickfix.field.AgreementDate value) {
      setField(FieldValue.to(agreementDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField agreementCurrencyField = FieldFactory.newStringField(918);
    public boolean hasAgreementCurrency() throws quickfix.FieldNotFound {
      return isSetField(918);
    }
    public String getAgreementCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(agreementCurrencyField));
    }
    public NoRelatedSym setAgreementCurrency(final String value) {
      setField(FieldValue.to(agreementCurrencyField, value));
      return this;
    }
    public NoRelatedSym setAgreementCurrency(final quickfix.field.AgreementCurrency value) {
      setField(FieldValue.to(agreementCurrencyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField terminationTypeField = FieldFactory.newIntField(788);
    public boolean hasTerminationType() throws quickfix.FieldNotFound {
      return isSetField(788);
    }
    public int getTerminationType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(terminationTypeField));
    }
    public NoRelatedSym setTerminationType(final int value) {
      setField(FieldValue.to(terminationTypeField, value));
      return this;
    }
    public NoRelatedSym setTerminationType(final quickfix.field.TerminationType value) {
      setField(FieldValue.to(terminationTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField startDateField = FieldFactory.newStringField(916);
    public boolean hasStartDate() throws quickfix.FieldNotFound {
      return isSetField(916);
    }
    public String getStartDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(startDateField));
    }
    public NoRelatedSym setStartDate(final String value) {
      setField(FieldValue.to(startDateField, value));
      return this;
    }
    public NoRelatedSym setStartDate(final quickfix.field.StartDate value) {
      setField(FieldValue.to(startDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField endDateField = FieldFactory.newStringField(917);
    public boolean hasEndDate() throws quickfix.FieldNotFound {
      return isSetField(917);
    }
    public String getEndDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(endDateField));
    }
    public NoRelatedSym setEndDate(final String value) {
      setField(FieldValue.to(endDateField, value));
      return this;
    }
    public NoRelatedSym setEndDate(final quickfix.field.EndDate value) {
      setField(FieldValue.to(endDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField deliveryTypeField = FieldFactory.newIntField(919);
    public boolean hasDeliveryType() throws quickfix.FieldNotFound {
      return isSetField(919);
    }
    public int getDeliveryType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deliveryTypeField));
    }
    public NoRelatedSym setDeliveryType(final int value) {
      setField(FieldValue.to(deliveryTypeField, value));
      return this;
    }
    public NoRelatedSym setDeliveryType(final quickfix.field.DeliveryType value) {
      setField(FieldValue.to(deliveryTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField marginRatioField = FieldFactory.newDoubleField(898);
    public boolean hasMarginRatio() throws quickfix.FieldNotFound {
      return isSetField(898);
    }
    public double getMarginRatio() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(marginRatioField));
    }
    public NoRelatedSym setMarginRatio(final double value) {
      setField(FieldValue.to(marginRatioField, value));
      return this;
    }
    public NoRelatedSym setMarginRatio(final quickfix.field.MarginRatio value) {
      setField(FieldValue.to(marginRatioField, FieldValue.of(value)));
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

    private final quickfix.IntField quoteTypeField = FieldFactory.newIntField(537);
    public boolean hasQuoteType() throws quickfix.FieldNotFound {
      return isSetField(537);
    }
    public int getQuoteType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(quoteTypeField));
    }
    public NoRelatedSym setQuoteType(final int value) {
      setField(FieldValue.to(quoteTypeField, value));
      return this;
    }
    public NoRelatedSym setQuoteType(final quickfix.field.QuoteType value) {
      setField(FieldValue.to(quoteTypeField, FieldValue.of(value)));
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

    private final quickfix.StringField tradingSessionSubIdField = FieldFactory.newStringField(625);
    public boolean hasTradingSessionSubId() throws quickfix.FieldNotFound {
      return isSetField(625);
    }
    public String getTradingSessionSubId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionSubIdField));
    }
    public NoRelatedSym setTradingSessionSubId(final String value) {
      setField(FieldValue.to(tradingSessionSubIdField, value));
      return this;
    }
    public NoRelatedSym setTradingSessionSubId(final quickfix.field.TradingSessionSubID value) {
      setField(FieldValue.to(tradingSessionSubIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField tradeOriginationDateField = FieldFactory.newStringField(229);
    public boolean hasTradeOriginationDate() throws quickfix.FieldNotFound {
      return isSetField(229);
    }
    public String getTradeOriginationDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradeOriginationDateField));
    }
    public NoRelatedSym setTradeOriginationDate(final String value) {
      setField(FieldValue.to(tradeOriginationDateField, value));
      return this;
    }
    public NoRelatedSym setTradeOriginationDate(final quickfix.field.TradeOriginationDate value) {
      setField(FieldValue.to(tradeOriginationDateField, FieldValue.of(value)));
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

    private final quickfix.IntField qtyTypeField = FieldFactory.newIntField(854);
    public boolean hasQtyType() throws quickfix.FieldNotFound {
      return isSetField(854);
    }
    public int getQtyType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(qtyTypeField));
    }
    public NoRelatedSym setQtyType(final int value) {
      setField(FieldValue.to(qtyTypeField, value));
      return this;
    }
    public NoRelatedSym setQtyType(final quickfix.field.QtyType value) {
      setField(FieldValue.to(qtyTypeField, FieldValue.of(value)));
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

    private final quickfix.DoubleField cashOrderQtyField = FieldFactory.newDoubleField(152);
    public boolean hasCashOrderQty() throws quickfix.FieldNotFound {
      return isSetField(152);
    }
    public double getCashOrderQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(cashOrderQtyField));
    }
    public NoRelatedSym setCashOrderQty(final double value) {
      setField(FieldValue.to(cashOrderQtyField, value));
      return this;
    }
    public NoRelatedSym setCashOrderQty(final quickfix.field.CashOrderQty value) {
      setField(FieldValue.to(cashOrderQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField orderPercentField = FieldFactory.newDoubleField(516);
    public boolean hasOrderPercent() throws quickfix.FieldNotFound {
      return isSetField(516);
    }
    public double getOrderPercent() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(orderPercentField));
    }
    public NoRelatedSym setOrderPercent(final double value) {
      setField(FieldValue.to(orderPercentField, value));
      return this;
    }
    public NoRelatedSym setOrderPercent(final quickfix.field.OrderPercent value) {
      setField(FieldValue.to(orderPercentField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField roundingDirectionField = FieldFactory.newCharField(468);
    public boolean hasRoundingDirection() throws quickfix.FieldNotFound {
      return isSetField(468);
    }
    public int getRoundingDirection() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(roundingDirectionField));
    }
    public NoRelatedSym setRoundingDirection(final int value) {
      setField(FieldValue.to(roundingDirectionField, value));
      return this;
    }
    public NoRelatedSym setRoundingDirection(final char value) {
      setField(FieldValue.to(roundingDirectionField, value));
      return this;
    }
    public NoRelatedSym setRoundingDirection(final String value) {
      setField(FieldValue.to(roundingDirectionField, value));
      return this;
    }
    public NoRelatedSym setRoundingDirection(final quickfix.field.RoundingDirection value) {
      setField(FieldValue.to(roundingDirectionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField roundingModulusField = FieldFactory.newDoubleField(469);
    public boolean hasRoundingModulus() throws quickfix.FieldNotFound {
      return isSetField(469);
    }
    public double getRoundingModulus() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(roundingModulusField));
    }
    public NoRelatedSym setRoundingModulus(final double value) {
      setField(FieldValue.to(roundingModulusField, value));
      return this;
    }
    public NoRelatedSym setRoundingModulus(final quickfix.field.RoundingModulus value) {
      setField(FieldValue.to(roundingModulusField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField settlTypeField = FieldFactory.newCharField(63);
    public boolean hasSettlType() throws quickfix.FieldNotFound {
      return isSetField(63);
    }
    public int getSettlType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlTypeField));
    }
    public NoRelatedSym setSettlType(final int value) {
      setField(FieldValue.to(settlTypeField, value));
      return this;
    }
    public NoRelatedSym setSettlType(final char value) {
      setField(FieldValue.to(settlTypeField, value));
      return this;
    }
    public NoRelatedSym setSettlType(final String value) {
      setField(FieldValue.to(settlTypeField, value));
      return this;
    }
    public NoRelatedSym setSettlType(final quickfix.field.SettlType value) {
      setField(FieldValue.to(settlTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField settlDateField = FieldFactory.newStringField(64);
    public boolean hasSettlDate() throws quickfix.FieldNotFound {
      return isSetField(64);
    }
    public String getSettlDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlDateField));
    }
    public NoRelatedSym setSettlDate(final String value) {
      setField(FieldValue.to(settlDateField, value));
      return this;
    }
    public NoRelatedSym setSettlDate(final quickfix.field.SettlDate value) {
      setField(FieldValue.to(settlDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField settlDate2Field = FieldFactory.newStringField(193);
    public boolean hasSettlDate2() throws quickfix.FieldNotFound {
      return isSetField(193);
    }
    public String getSettlDate2() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlDate2Field));
    }
    public NoRelatedSym setSettlDate2(final String value) {
      setField(FieldValue.to(settlDate2Field, value));
      return this;
    }
    public NoRelatedSym setSettlDate2(final quickfix.field.SettlDate2 value) {
      setField(FieldValue.to(settlDate2Field, FieldValue.of(value)));
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

    private final quickfix.StringField accountField = FieldFactory.newStringField(1);
    public boolean hasAccount() throws quickfix.FieldNotFound {
      return isSetField(1);
    }
    public String getAccount() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(accountField));
    }
    public NoRelatedSym setAccount(final String value) {
      setField(FieldValue.to(accountField, value));
      return this;
    }
    public NoRelatedSym setAccount(final quickfix.field.Account value) {
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
    public NoRelatedSym setAcctIdSource(final int value) {
      setField(FieldValue.to(acctIdSourceField, value));
      return this;
    }
    public NoRelatedSym setAcctIdSource(final quickfix.field.AcctIDSource value) {
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
    public NoRelatedSym setAccountType(final int value) {
      setField(FieldValue.to(accountTypeField, value));
      return this;
    }
    public NoRelatedSym setAccountType(final quickfix.field.AccountType value) {
      setField(FieldValue.to(accountTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField quotePriceTypeField = FieldFactory.newIntField(692);
    public boolean hasQuotePriceType() throws quickfix.FieldNotFound {
      return isSetField(692);
    }
    public int getQuotePriceType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(quotePriceTypeField));
    }
    public NoRelatedSym setQuotePriceType(final int value) {
      setField(FieldValue.to(quotePriceTypeField, value));
      return this;
    }
    public NoRelatedSym setQuotePriceType(final quickfix.field.QuotePriceType value) {
      setField(FieldValue.to(quotePriceTypeField, FieldValue.of(value)));
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

    private final FieldFactory.TimeStampField validUntilTimeField =
        FieldFactory.newTimeStampField(62);
    public boolean hasValidUntilTime() throws quickfix.FieldNotFound {
      return isSetField(62);
    }
    public long getValidUntilTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(validUntilTimeField));
    }
    public NoRelatedSym setValidUntilTime(final long value) {
      setField(FieldValue.to(validUntilTimeField, value));
      return this;
    }
    public NoRelatedSym setValidUntilTime(final quickfix.field.ValidUntilTime value) {
      setField(FieldValue.to(validUntilTimeField, FieldValue.of(value)));
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

    private final quickfix.DoubleField spreadField = FieldFactory.newDoubleField(218);
    public boolean hasSpread() throws quickfix.FieldNotFound {
      return isSetField(218);
    }
    public double getSpread() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(spreadField));
    }
    public NoRelatedSym setSpread(final double value) {
      setField(FieldValue.to(spreadField, value));
      return this;
    }
    public NoRelatedSym setSpread(final quickfix.field.Spread value) {
      setField(FieldValue.to(spreadField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField benchmarkCurveCurrencyField =
        FieldFactory.newStringField(220);
    public boolean hasBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
      return isSetField(220);
    }
    public String getBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkCurveCurrencyField));
    }
    public NoRelatedSym setBenchmarkCurveCurrency(final String value) {
      setField(FieldValue.to(benchmarkCurveCurrencyField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkCurveCurrency(
        final quickfix.field.BenchmarkCurveCurrency value) {
      setField(FieldValue.to(benchmarkCurveCurrencyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField benchmarkCurveNameField = FieldFactory.newStringField(221);
    public boolean hasBenchmarkCurveName() throws quickfix.FieldNotFound {
      return isSetField(221);
    }
    public String getBenchmarkCurveName() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkCurveNameField));
    }
    public NoRelatedSym setBenchmarkCurveName(final String value) {
      setField(FieldValue.to(benchmarkCurveNameField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkCurveName(final quickfix.field.BenchmarkCurveName value) {
      setField(FieldValue.to(benchmarkCurveNameField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField benchmarkCurvePointField = FieldFactory.newStringField(222);
    public boolean hasBenchmarkCurvePoint() throws quickfix.FieldNotFound {
      return isSetField(222);
    }
    public String getBenchmarkCurvePoint() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkCurvePointField));
    }
    public NoRelatedSym setBenchmarkCurvePoint(final String value) {
      setField(FieldValue.to(benchmarkCurvePointField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkCurvePoint(final quickfix.field.BenchmarkCurvePoint value) {
      setField(FieldValue.to(benchmarkCurvePointField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField benchmarkPriceField = FieldFactory.newDoubleField(662);
    public boolean hasBenchmarkPrice() throws quickfix.FieldNotFound {
      return isSetField(662);
    }
    public double getBenchmarkPrice() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkPriceField));
    }
    public NoRelatedSym setBenchmarkPrice(final double value) {
      setField(FieldValue.to(benchmarkPriceField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkPrice(final quickfix.field.BenchmarkPrice value) {
      setField(FieldValue.to(benchmarkPriceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField benchmarkPriceTypeField = FieldFactory.newIntField(663);
    public boolean hasBenchmarkPriceType() throws quickfix.FieldNotFound {
      return isSetField(663);
    }
    public int getBenchmarkPriceType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkPriceTypeField));
    }
    public NoRelatedSym setBenchmarkPriceType(final int value) {
      setField(FieldValue.to(benchmarkPriceTypeField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkPriceType(final quickfix.field.BenchmarkPriceType value) {
      setField(FieldValue.to(benchmarkPriceTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField benchmarkSecurityIdField = FieldFactory.newStringField(699);
    public boolean hasBenchmarkSecurityId() throws quickfix.FieldNotFound {
      return isSetField(699);
    }
    public String getBenchmarkSecurityId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkSecurityIdField));
    }
    public NoRelatedSym setBenchmarkSecurityId(final String value) {
      setField(FieldValue.to(benchmarkSecurityIdField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkSecurityId(final quickfix.field.BenchmarkSecurityID value) {
      setField(FieldValue.to(benchmarkSecurityIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField benchmarkSecurityIdSourceField =
        FieldFactory.newStringField(761);
    public boolean hasBenchmarkSecurityIdSource() throws quickfix.FieldNotFound {
      return isSetField(761);
    }
    public String getBenchmarkSecurityIdSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(benchmarkSecurityIdSourceField));
    }
    public NoRelatedSym setBenchmarkSecurityIdSource(final String value) {
      setField(FieldValue.to(benchmarkSecurityIdSourceField, value));
      return this;
    }
    public NoRelatedSym setBenchmarkSecurityIdSource(
        final quickfix.field.BenchmarkSecurityIDSource value) {
      setField(FieldValue.to(benchmarkSecurityIdSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField priceTypeField = FieldFactory.newIntField(423);
    public boolean hasPriceType() throws quickfix.FieldNotFound {
      return isSetField(423);
    }
    public int getPriceType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceTypeField));
    }
    public NoRelatedSym setPriceType(final int value) {
      setField(FieldValue.to(priceTypeField, value));
      return this;
    }
    public NoRelatedSym setPriceType(final quickfix.field.PriceType value) {
      setField(FieldValue.to(priceTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField priceField = FieldFactory.newDoubleField(44);
    public boolean hasPrice() throws quickfix.FieldNotFound {
      return isSetField(44);
    }
    public double getPrice() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceField));
    }
    public NoRelatedSym setPrice(final double value) {
      setField(FieldValue.to(priceField, value));
      return this;
    }
    public NoRelatedSym setPrice(final quickfix.field.Price value) {
      setField(FieldValue.to(priceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField price2Field = FieldFactory.newDoubleField(640);
    public boolean hasPrice2() throws quickfix.FieldNotFound {
      return isSetField(640);
    }
    public double getPrice2() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(price2Field));
    }
    public NoRelatedSym setPrice2(final double value) {
      setField(FieldValue.to(price2Field, value));
      return this;
    }
    public NoRelatedSym setPrice2(final quickfix.field.Price2 value) {
      setField(FieldValue.to(price2Field, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField yieldTypeField = FieldFactory.newStringField(235);
    public boolean hasYieldType() throws quickfix.FieldNotFound {
      return isSetField(235);
    }
    public String getYieldType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldTypeField));
    }
    public NoRelatedSym setYieldType(final String value) {
      setField(FieldValue.to(yieldTypeField, value));
      return this;
    }
    public NoRelatedSym setYieldType(final quickfix.field.YieldType value) {
      setField(FieldValue.to(yieldTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField yieldField = FieldFactory.newDoubleField(236);
    public boolean hasYield() throws quickfix.FieldNotFound {
      return isSetField(236);
    }
    public double getYield() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldField));
    }
    public NoRelatedSym setYield(final double value) {
      setField(FieldValue.to(yieldField, value));
      return this;
    }
    public NoRelatedSym setYield(final quickfix.field.Yield value) {
      setField(FieldValue.to(yieldField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField yieldCalcDateField = FieldFactory.newStringField(701);
    public boolean hasYieldCalcDate() throws quickfix.FieldNotFound {
      return isSetField(701);
    }
    public String getYieldCalcDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldCalcDateField));
    }
    public NoRelatedSym setYieldCalcDate(final String value) {
      setField(FieldValue.to(yieldCalcDateField, value));
      return this;
    }
    public NoRelatedSym setYieldCalcDate(final quickfix.field.YieldCalcDate value) {
      setField(FieldValue.to(yieldCalcDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField yieldRedemptionDateField = FieldFactory.newStringField(696);
    public boolean hasYieldRedemptionDate() throws quickfix.FieldNotFound {
      return isSetField(696);
    }
    public String getYieldRedemptionDate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldRedemptionDateField));
    }
    public NoRelatedSym setYieldRedemptionDate(final String value) {
      setField(FieldValue.to(yieldRedemptionDateField, value));
      return this;
    }
    public NoRelatedSym setYieldRedemptionDate(final quickfix.field.YieldRedemptionDate value) {
      setField(FieldValue.to(yieldRedemptionDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField yieldRedemptionPriceField = FieldFactory.newDoubleField(697);
    public boolean hasYieldRedemptionPrice() throws quickfix.FieldNotFound {
      return isSetField(697);
    }
    public double getYieldRedemptionPrice() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldRedemptionPriceField));
    }
    public NoRelatedSym setYieldRedemptionPrice(final double value) {
      setField(FieldValue.to(yieldRedemptionPriceField, value));
      return this;
    }
    public NoRelatedSym setYieldRedemptionPrice(final quickfix.field.YieldRedemptionPrice value) {
      setField(FieldValue.to(yieldRedemptionPriceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField yieldRedemptionPriceTypeField = FieldFactory.newIntField(698);
    public boolean hasYieldRedemptionPriceType() throws quickfix.FieldNotFound {
      return isSetField(698);
    }
    public int getYieldRedemptionPriceType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldRedemptionPriceTypeField));
    }
    public NoRelatedSym setYieldRedemptionPriceType(final int value) {
      setField(FieldValue.to(yieldRedemptionPriceTypeField, value));
      return this;
    }
    public NoRelatedSym setYieldRedemptionPriceType(
        final quickfix.field.YieldRedemptionPriceType value) {
      setField(FieldValue.to(yieldRedemptionPriceTypeField, FieldValue.of(value)));
      return this;
    }

    public NoRelatedSym() {
      super(146, 55,
          new int[] {55, 65, 48, 22, 460, 461, 167, 762, 200, 541, 201, 224, 225, 239, 226, 227,
              228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107,
              350, 351, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898,
              140, 303, 537, 336, 625, 229, 54, 854, 38, 152, 516, 468, 469, 63, 64, 193, 192, 15,
              1, 660, 581, 692, 40, 62, 126, 60, 218, 220, 221, 222, 662, 663, 699, 761, 423, 44,
              640, 235, 236, 701, 696, 697, 698, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym proto) {
      final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final NoRelatedSym.NoSecurityAltId group = new NoRelatedSym.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final NoRelatedSym.NoEvents group = new NoRelatedSym.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final NoRelatedSym.NoUnderlyings group = new NoRelatedSym.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoStipulationsCount(); i++) {
        final NoRelatedSym.NoStipulations group = new NoRelatedSym.NoStipulations();
        group.fromProto(proto.getNoStipulations(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoLegsCount(); i++) {
        final NoRelatedSym.NoLegs group = new NoRelatedSym.NoLegs();
        group.fromProto(proto.getNoLegs(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoQuoteQualifiersCount(); i++) {
        final NoRelatedSym.NoQuoteQualifiers group = new NoRelatedSym.NoQuoteQualifiers();
        group.fromProto(proto.getNoQuoteQualifiers(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoPartyIdsCount(); i++) {
        final NoRelatedSym.NoPartyIds group = new NoRelatedSym.NoPartyIds();
        group.fromProto(proto.getNoPartyIds(i));
        this.addGroupRef(group);
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
      if (fieldPresence.getAgreementDesc()) {
        this.setAgreementDesc(proto.getAgreementDesc());
      }
      if (fieldPresence.getAgreementId()) {
        this.setAgreementId(proto.getAgreementId());
      }
      if (fieldPresence.getAgreementDate()) {
        this.setAgreementDate(proto.getAgreementDate());
      }
      if (fieldPresence.getAgreementCurrency()) {
        this.setAgreementCurrency(proto.getAgreementCurrency());
      }
      if (fieldPresence.getTerminationType()) {
        this.setTerminationType(proto.getTerminationType());
      }
      if (fieldPresence.getStartDate()) {
        this.setStartDate(proto.getStartDate());
      }
      if (fieldPresence.getEndDate()) {
        this.setEndDate(proto.getEndDate());
      }
      if (fieldPresence.getDeliveryType()) {
        this.setDeliveryType(proto.getDeliveryType());
      }
      if (fieldPresence.getMarginRatio()) {
        this.setMarginRatio(proto.getMarginRatio());
      }
      if (fieldPresence.getPrevClosePx()) {
        this.setPrevClosePx(proto.getPrevClosePx());
      }
      if (fieldPresence.getQuoteRequestType()) {
        this.setQuoteRequestType(proto.getQuoteRequestType());
      }
      if (fieldPresence.getQuoteType()) {
        this.setQuoteType(proto.getQuoteType());
      }
      if (fieldPresence.getTradingSessionId()) {
        this.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getTradingSessionSubId()) {
        this.setTradingSessionSubId(proto.getTradingSessionSubId());
      }
      if (fieldPresence.getTradeOriginationDate()) {
        this.setTradeOriginationDate(proto.getTradeOriginationDate());
      }
      if (fieldPresence.getSide()) {
        this.setSide(proto.getSide());
      }
      if (fieldPresence.getQtyType()) {
        this.setQtyType(proto.getQtyType());
      }
      if (fieldPresence.getOrderQty()) {
        this.setOrderQty(proto.getOrderQty());
      }
      if (fieldPresence.getCashOrderQty()) {
        this.setCashOrderQty(proto.getCashOrderQty());
      }
      if (fieldPresence.getOrderPercent()) {
        this.setOrderPercent(proto.getOrderPercent());
      }
      if (fieldPresence.getRoundingDirection()) {
        this.setRoundingDirection(proto.getRoundingDirection());
      }
      if (fieldPresence.getRoundingModulus()) {
        this.setRoundingModulus(proto.getRoundingModulus());
      }
      if (fieldPresence.getSettlType()) {
        this.setSettlType(proto.getSettlType());
      }
      if (fieldPresence.getSettlDate()) {
        this.setSettlDate(proto.getSettlDate());
      }
      if (fieldPresence.getSettlDate2()) {
        this.setSettlDate2(proto.getSettlDate2());
      }
      if (fieldPresence.getOrderQty2()) {
        this.setOrderQty2(proto.getOrderQty2());
      }
      if (fieldPresence.getCurrency()) {
        this.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getAccount()) {
        this.setAccount(proto.getAccount());
      }
      if (fieldPresence.getAcctIdSource()) {
        this.setAcctIdSource(proto.getAcctIdSource());
      }
      if (fieldPresence.getAccountType()) {
        this.setAccountType(proto.getAccountType());
      }
      if (fieldPresence.getQuotePriceType()) {
        this.setQuotePriceType(proto.getQuotePriceType());
      }
      if (fieldPresence.getOrdType()) {
        this.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getValidUntilTime()) {
        this.setValidUntilTime(proto.getValidUntilTime());
      }
      if (fieldPresence.getExpireTime()) {
        this.setExpireTime(proto.getExpireTime());
      }
      if (fieldPresence.getTransactTime()) {
        this.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getSpread()) {
        this.setSpread(proto.getSpread());
      }
      if (fieldPresence.getBenchmarkCurveCurrency()) {
        this.setBenchmarkCurveCurrency(proto.getBenchmarkCurveCurrency());
      }
      if (fieldPresence.getBenchmarkCurveName()) {
        this.setBenchmarkCurveName(proto.getBenchmarkCurveName());
      }
      if (fieldPresence.getBenchmarkCurvePoint()) {
        this.setBenchmarkCurvePoint(proto.getBenchmarkCurvePoint());
      }
      if (fieldPresence.getBenchmarkPrice()) {
        this.setBenchmarkPrice(proto.getBenchmarkPrice());
      }
      if (fieldPresence.getBenchmarkPriceType()) {
        this.setBenchmarkPriceType(proto.getBenchmarkPriceType());
      }
      if (fieldPresence.getBenchmarkSecurityId()) {
        this.setBenchmarkSecurityId(proto.getBenchmarkSecurityId());
      }
      if (fieldPresence.getBenchmarkSecurityIdSource()) {
        this.setBenchmarkSecurityIdSource(proto.getBenchmarkSecurityIdSource());
      }
      if (fieldPresence.getPriceType()) {
        this.setPriceType(proto.getPriceType());
      }
      if (fieldPresence.getPrice()) {
        this.setPrice(proto.getPrice());
      }
      if (fieldPresence.getPrice2()) {
        this.setPrice2(proto.getPrice2());
      }
      if (fieldPresence.getYieldType()) {
        this.setYieldType(proto.getYieldType());
      }
      if (fieldPresence.getYield()) {
        this.setYield(proto.getYield());
      }
      if (fieldPresence.getYieldCalcDate()) {
        this.setYieldCalcDate(proto.getYieldCalcDate());
      }
      if (fieldPresence.getYieldRedemptionDate()) {
        this.setYieldRedemptionDate(proto.getYieldRedemptionDate());
      }
      if (fieldPresence.getYieldRedemptionPrice()) {
        this.setYieldRedemptionPrice(proto.getYieldRedemptionPrice());
      }
      if (fieldPresence.getYieldRedemptionPriceType()) {
        this.setYieldRedemptionPriceType(proto.getYieldRedemptionPriceType());
      }
    }

    public garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.QuoteRequest.NoRelatedSym.FieldPresence.newBuilder();

      final int noSecurityAltIdGroupCount = this.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final NoRelatedSym.NoSecurityAltId group = new NoRelatedSym.NoSecurityAltId();
        this.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = this.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final NoRelatedSym.NoEvents group = new NoRelatedSym.NoEvents();
        this.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = this.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final NoRelatedSym.NoUnderlyings group = new NoRelatedSym.NoUnderlyings();
        this.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noStipulationsGroupCount = this.getGroupCount(232);
      for (int i = 1; i <= noStipulationsGroupCount; i++) {
        final NoRelatedSym.NoStipulations group = new NoRelatedSym.NoStipulations();
        this.getGroup(i, group);
        builder.addNoStipulations(group.toBuilder().build());
      }

      final int noLegsGroupCount = this.getGroupCount(555);
      for (int i = 1; i <= noLegsGroupCount; i++) {
        final NoRelatedSym.NoLegs group = new NoRelatedSym.NoLegs();
        this.getGroup(i, group);
        builder.addNoLegs(group.toBuilder().build());
      }

      final int noQuoteQualifiersGroupCount = this.getGroupCount(735);
      for (int i = 1; i <= noQuoteQualifiersGroupCount; i++) {
        final NoRelatedSym.NoQuoteQualifiers group = new NoRelatedSym.NoQuoteQualifiers();
        this.getGroup(i, group);
        builder.addNoQuoteQualifiers(group.toBuilder().build());
      }

      final int noPartyIdsGroupCount = this.getGroupCount(453);
      for (int i = 1; i <= noPartyIdsGroupCount; i++) {
        final NoRelatedSym.NoPartyIds group = new NoRelatedSym.NoPartyIds();
        this.getGroup(i, group);
        builder.addNoPartyIds(group.toBuilder().build());
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
      if (this.hasAgreementDesc()) {
        builder.setAgreementDesc(this.getAgreementDesc());
        presenceBuilder.setAgreementDesc(true);
      }
      if (this.hasAgreementId()) {
        builder.setAgreementId(this.getAgreementId());
        presenceBuilder.setAgreementId(true);
      }
      if (this.hasAgreementDate()) {
        builder.setAgreementDate(this.getAgreementDate());
        presenceBuilder.setAgreementDate(true);
      }
      if (this.hasAgreementCurrency()) {
        builder.setAgreementCurrency(this.getAgreementCurrency());
        presenceBuilder.setAgreementCurrency(true);
      }
      if (this.hasTerminationType()) {
        builder.setTerminationType(this.getTerminationType());
        presenceBuilder.setTerminationType(true);
      }
      if (this.hasStartDate()) {
        builder.setStartDate(this.getStartDate());
        presenceBuilder.setStartDate(true);
      }
      if (this.hasEndDate()) {
        builder.setEndDate(this.getEndDate());
        presenceBuilder.setEndDate(true);
      }
      if (this.hasDeliveryType()) {
        builder.setDeliveryType(this.getDeliveryType());
        presenceBuilder.setDeliveryType(true);
      }
      if (this.hasMarginRatio()) {
        builder.setMarginRatio(this.getMarginRatio());
        presenceBuilder.setMarginRatio(true);
      }
      if (this.hasPrevClosePx()) {
        builder.setPrevClosePx(this.getPrevClosePx());
        presenceBuilder.setPrevClosePx(true);
      }
      if (this.hasQuoteRequestType()) {
        builder.setQuoteRequestType(this.getQuoteRequestType());
        presenceBuilder.setQuoteRequestType(true);
      }
      if (this.hasQuoteType()) {
        builder.setQuoteType(this.getQuoteType());
        presenceBuilder.setQuoteType(true);
      }
      if (this.hasTradingSessionId()) {
        builder.setTradingSessionId(this.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (this.hasTradingSessionSubId()) {
        builder.setTradingSessionSubId(this.getTradingSessionSubId());
        presenceBuilder.setTradingSessionSubId(true);
      }
      if (this.hasTradeOriginationDate()) {
        builder.setTradeOriginationDate(this.getTradeOriginationDate());
        presenceBuilder.setTradeOriginationDate(true);
      }
      if (this.hasSide()) {
        builder.setSide(this.getSide());
        presenceBuilder.setSide(true);
      }
      if (this.hasQtyType()) {
        builder.setQtyType(this.getQtyType());
        presenceBuilder.setQtyType(true);
      }
      if (this.hasOrderQty()) {
        builder.setOrderQty(this.getOrderQty());
        presenceBuilder.setOrderQty(true);
      }
      if (this.hasCashOrderQty()) {
        builder.setCashOrderQty(this.getCashOrderQty());
        presenceBuilder.setCashOrderQty(true);
      }
      if (this.hasOrderPercent()) {
        builder.setOrderPercent(this.getOrderPercent());
        presenceBuilder.setOrderPercent(true);
      }
      if (this.hasRoundingDirection()) {
        builder.setRoundingDirection(this.getRoundingDirection());
        presenceBuilder.setRoundingDirection(true);
      }
      if (this.hasRoundingModulus()) {
        builder.setRoundingModulus(this.getRoundingModulus());
        presenceBuilder.setRoundingModulus(true);
      }
      if (this.hasSettlType()) {
        builder.setSettlType(this.getSettlType());
        presenceBuilder.setSettlType(true);
      }
      if (this.hasSettlDate()) {
        builder.setSettlDate(this.getSettlDate());
        presenceBuilder.setSettlDate(true);
      }
      if (this.hasSettlDate2()) {
        builder.setSettlDate2(this.getSettlDate2());
        presenceBuilder.setSettlDate2(true);
      }
      if (this.hasOrderQty2()) {
        builder.setOrderQty2(this.getOrderQty2());
        presenceBuilder.setOrderQty2(true);
      }
      if (this.hasCurrency()) {
        builder.setCurrency(this.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (this.hasAccount()) {
        builder.setAccount(this.getAccount());
        presenceBuilder.setAccount(true);
      }
      if (this.hasAcctIdSource()) {
        builder.setAcctIdSource(this.getAcctIdSource());
        presenceBuilder.setAcctIdSource(true);
      }
      if (this.hasAccountType()) {
        builder.setAccountType(this.getAccountType());
        presenceBuilder.setAccountType(true);
      }
      if (this.hasQuotePriceType()) {
        builder.setQuotePriceType(this.getQuotePriceType());
        presenceBuilder.setQuotePriceType(true);
      }
      if (this.hasOrdType()) {
        builder.setOrdType(this.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (this.hasValidUntilTime()) {
        builder.setValidUntilTime(this.getValidUntilTime());
        presenceBuilder.setValidUntilTime(true);
      }
      if (this.hasExpireTime()) {
        builder.setExpireTime(this.getExpireTime());
        presenceBuilder.setExpireTime(true);
      }
      if (this.hasTransactTime()) {
        builder.setTransactTime(this.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (this.hasSpread()) {
        builder.setSpread(this.getSpread());
        presenceBuilder.setSpread(true);
      }
      if (this.hasBenchmarkCurveCurrency()) {
        builder.setBenchmarkCurveCurrency(this.getBenchmarkCurveCurrency());
        presenceBuilder.setBenchmarkCurveCurrency(true);
      }
      if (this.hasBenchmarkCurveName()) {
        builder.setBenchmarkCurveName(this.getBenchmarkCurveName());
        presenceBuilder.setBenchmarkCurveName(true);
      }
      if (this.hasBenchmarkCurvePoint()) {
        builder.setBenchmarkCurvePoint(this.getBenchmarkCurvePoint());
        presenceBuilder.setBenchmarkCurvePoint(true);
      }
      if (this.hasBenchmarkPrice()) {
        builder.setBenchmarkPrice(this.getBenchmarkPrice());
        presenceBuilder.setBenchmarkPrice(true);
      }
      if (this.hasBenchmarkPriceType()) {
        builder.setBenchmarkPriceType(this.getBenchmarkPriceType());
        presenceBuilder.setBenchmarkPriceType(true);
      }
      if (this.hasBenchmarkSecurityId()) {
        builder.setBenchmarkSecurityId(this.getBenchmarkSecurityId());
        presenceBuilder.setBenchmarkSecurityId(true);
      }
      if (this.hasBenchmarkSecurityIdSource()) {
        builder.setBenchmarkSecurityIdSource(this.getBenchmarkSecurityIdSource());
        presenceBuilder.setBenchmarkSecurityIdSource(true);
      }
      if (this.hasPriceType()) {
        builder.setPriceType(this.getPriceType());
        presenceBuilder.setPriceType(true);
      }
      if (this.hasPrice()) {
        builder.setPrice(this.getPrice());
        presenceBuilder.setPrice(true);
      }
      if (this.hasPrice2()) {
        builder.setPrice2(this.getPrice2());
        presenceBuilder.setPrice2(true);
      }
      if (this.hasYieldType()) {
        builder.setYieldType(this.getYieldType());
        presenceBuilder.setYieldType(true);
      }
      if (this.hasYield()) {
        builder.setYield(this.getYield());
        presenceBuilder.setYield(true);
      }
      if (this.hasYieldCalcDate()) {
        builder.setYieldCalcDate(this.getYieldCalcDate());
        presenceBuilder.setYieldCalcDate(true);
      }
      if (this.hasYieldRedemptionDate()) {
        builder.setYieldRedemptionDate(this.getYieldRedemptionDate());
        presenceBuilder.setYieldRedemptionDate(true);
      }
      if (this.hasYieldRedemptionPrice()) {
        builder.setYieldRedemptionPrice(this.getYieldRedemptionPrice());
        presenceBuilder.setYieldRedemptionPrice(true);
      }
      if (this.hasYieldRedemptionPriceType()) {
        builder.setYieldRedemptionPriceType(this.getYieldRedemptionPriceType());
        presenceBuilder.setYieldRedemptionPriceType(true);
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

  private final quickfix.StringField rfqReqIdField = FieldFactory.newStringField(644);
  public boolean hasRfqReqId() throws quickfix.FieldNotFound {
    return isSetField(644);
  }
  public String getRfqReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(rfqReqIdField));
  }
  public QuoteRequest setRfqReqId(final String value) {
    setField(FieldValue.to(rfqReqIdField, value));
    return this;
  }
  public QuoteRequest setRfqReqId(final quickfix.field.RFQReqID value) {
    setField(FieldValue.to(rfqReqIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public QuoteRequest setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public QuoteRequest setClOrdId(final quickfix.field.ClOrdID value) {
    setField(FieldValue.to(clOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField orderCapacityField = FieldFactory.newCharField(528);
  public boolean hasOrderCapacity() throws quickfix.FieldNotFound {
    return isSetField(528);
  }
  public int getOrderCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderCapacityField));
  }
  public QuoteRequest setOrderCapacity(final int value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public QuoteRequest setOrderCapacity(final char value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public QuoteRequest setOrderCapacity(final String value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public QuoteRequest setOrderCapacity(final quickfix.field.OrderCapacity value) {
    setField(FieldValue.to(orderCapacityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public QuoteRequest setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public QuoteRequest setText(final quickfix.field.Text value) {
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
  public QuoteRequest setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public QuoteRequest setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public QuoteRequest setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public QuoteRequest setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public QuoteRequest() {
    super(new int[] {131, 644, 11, 528, 58, 354, 355, 0});
  }

  public QuoteRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {131, 644, 11, 528, 58, 354, 355, 0});
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

  public static Function<garden_leave.gateway.transform.fix44.QuoteRequest,
      garden_leave.fix44.proto.FIX44Protos.QuoteRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix44.proto.FIX44Protos.QuoteRequest.getDefaultInstance();
    }

    final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.Builder builder =
        garden_leave.fix44.proto.FIX44Protos.QuoteRequest.newBuilder();
    final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.FieldPresence.Builder presenceBuilder =
        garden_leave.fix44.proto.FIX44Protos.QuoteRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix44.Header header =
        (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasQuoteReqId()) {
        builder.setQuoteReqId(fix.getQuoteReqId());
        presenceBuilder.setQuoteReqId(true);
      }
      if (fix.hasRfqReqId()) {
        builder.setRfqReqId(fix.getRfqReqId());
        presenceBuilder.setRfqReqId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasOrderCapacity()) {
        builder.setOrderCapacity(fix.getOrderCapacity());
        presenceBuilder.setOrderCapacity(true);
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

  public static Function<garden_leave.fix44.proto.FIX44Protos.QuoteRequest,
      garden_leave.gateway.transform.fix44.QuoteRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix44.QuoteRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix44.QuoteRequest fix =
          new garden_leave.gateway.transform.fix44.QuoteRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix44.Header header =
          (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix44.proto.FIX44Protos.QuoteRequest.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getQuoteReqId()) {
        fix.setQuoteReqId(proto.getQuoteReqId());
      }
      if (fieldPresence.getRfqReqId()) {
        fix.setRfqReqId(proto.getRfqReqId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getOrderCapacity()) {
        fix.setOrderCapacity(proto.getOrderCapacity());
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
