package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.257795
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

  public static final String BEGINSTR = "FIX.5.0";
  public static final String MSGTYPE = "R";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoRootPartyIds extends quickfix.Group {
    public static class NoRootPartySubIds extends quickfix.Group {
      private final quickfix.StringField rootPartySubIdField = FieldFactory.newStringField(1121);
      public boolean hasRootPartySubId() throws quickfix.FieldNotFound {
        return isSetField(1121);
      }
      public String getRootPartySubId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(rootPartySubIdField));
      }
      public NoRootPartySubIds setRootPartySubId(final String value) {
        setField(FieldValue.to(rootPartySubIdField, value));
        return this;
      }
      public NoRootPartySubIds setRootPartySubId(final quickfix.field.RootPartySubID value) {
        setField(FieldValue.to(rootPartySubIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField rootPartySubIdTypeField = FieldFactory.newIntField(1122);
      public boolean hasRootPartySubIdType() throws quickfix.FieldNotFound {
        return isSetField(1122);
      }
      public int getRootPartySubIdType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(rootPartySubIdTypeField));
      }
      public NoRootPartySubIds setRootPartySubIdType(final int value) {
        setField(FieldValue.to(rootPartySubIdTypeField, value));
        return this;
      }
      public NoRootPartySubIds setRootPartySubIdType(
          final quickfix.field.RootPartySubIDType value) {
        setField(FieldValue.to(rootPartySubIdTypeField, FieldValue.of(value)));
        return this;
      }

      public NoRootPartySubIds() {
        super(1120, 1121, new int[] {1121, 1122, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRootPartyIds.NoRootPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds
            .NoRootPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getRootPartySubId()) {
          this.setRootPartySubId(proto.getRootPartySubId());
        }
        if (fieldPresence.getRootPartySubIdType()) {
          this.setRootPartySubIdType(proto.getRootPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds
          .NoRootPartySubIds.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds
            .NoRootPartySubIds.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.NoRootPartySubIds
                .newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds
            .NoRootPartySubIds.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.NoRootPartySubIds
                .FieldPresence.newBuilder();

        if (this.hasRootPartySubId()) {
          builder.setRootPartySubId(this.getRootPartySubId());
          presenceBuilder.setRootPartySubId(true);
        }
        if (this.hasRootPartySubIdType()) {
          builder.setRootPartySubIdType(this.getRootPartySubIdType());
          presenceBuilder.setRootPartySubIdType(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    private final quickfix.StringField rootPartyIdField = FieldFactory.newStringField(1117);
    public boolean hasRootPartyId() throws quickfix.FieldNotFound {
      return isSetField(1117);
    }
    public String getRootPartyId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(rootPartyIdField));
    }
    public NoRootPartyIds setRootPartyId(final String value) {
      setField(FieldValue.to(rootPartyIdField, value));
      return this;
    }
    public NoRootPartyIds setRootPartyId(final quickfix.field.RootPartyID value) {
      setField(FieldValue.to(rootPartyIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField rootPartyIdSourceField = FieldFactory.newCharField(1118);
    public boolean hasRootPartyIdSource() throws quickfix.FieldNotFound {
      return isSetField(1118);
    }
    public int getRootPartyIdSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(rootPartyIdSourceField));
    }
    public NoRootPartyIds setRootPartyIdSource(final int value) {
      setField(FieldValue.to(rootPartyIdSourceField, value));
      return this;
    }
    public NoRootPartyIds setRootPartyIdSource(final char value) {
      setField(FieldValue.to(rootPartyIdSourceField, value));
      return this;
    }
    public NoRootPartyIds setRootPartyIdSource(final String value) {
      setField(FieldValue.to(rootPartyIdSourceField, value));
      return this;
    }
    public NoRootPartyIds setRootPartyIdSource(final quickfix.field.RootPartyIDSource value) {
      setField(FieldValue.to(rootPartyIdSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField rootPartyRoleField = FieldFactory.newIntField(1119);
    public boolean hasRootPartyRole() throws quickfix.FieldNotFound {
      return isSetField(1119);
    }
    public int getRootPartyRole() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(rootPartyRoleField));
    }
    public NoRootPartyIds setRootPartyRole(final int value) {
      setField(FieldValue.to(rootPartyRoleField, value));
      return this;
    }
    public NoRootPartyIds setRootPartyRole(final quickfix.field.RootPartyRole value) {
      setField(FieldValue.to(rootPartyRoleField, FieldValue.of(value)));
      return this;
    }

    public NoRootPartyIds() {
      super(1116, 1117, new int[] {1117, 1118, 1119, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoRootPartySubIdsCount(); i++) {
        final NoRootPartyIds.NoRootPartySubIds group = new NoRootPartyIds.NoRootPartySubIds();
        group.fromProto(proto.getNoRootPartySubIds(i));
        this.addGroupRef(group);
      }
      if (fieldPresence.getRootPartyId()) {
        this.setRootPartyId(proto.getRootPartyId());
      }
      if (fieldPresence.getRootPartyIdSource()) {
        this.setRootPartyIdSource(proto.getRootPartyIdSource());
      }
      if (fieldPresence.getRootPartyRole()) {
        this.setRootPartyRole(proto.getRootPartyRole());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRootPartyIds.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                         .NoRootPartyIds.FieldPresence.newBuilder();

      final int noRootPartySubIdsGroupCount = this.getGroupCount(1120);
      for (int i = 1; i <= noRootPartySubIdsGroupCount; i++) {
        final NoRootPartyIds.NoRootPartySubIds group = new NoRootPartyIds.NoRootPartySubIds();
        this.getGroup(i, group);
        builder.addNoRootPartySubIds(group.toBuilder().build());
      }

      if (this.hasRootPartyId()) {
        builder.setRootPartyId(this.getRootPartyId());
        presenceBuilder.setRootPartyId(true);
      }
      if (this.hasRootPartyIdSource()) {
        builder.setRootPartyIdSource(this.getRootPartyIdSource());
        presenceBuilder.setRootPartyIdSource(true);
      }
      if (this.hasRootPartyRole()) {
        builder.setRootPartyRole(this.getRootPartyRole());
        presenceBuilder.setRootPartyRole(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getSecurityAltId()) {
          this.setSecurityAltId(proto.getSecurityAltId());
        }
        if (fieldPresence.getSecurityAltIdSource()) {
          this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoSecurityAltId
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

      private final FieldFactory.TimeStampField eventTimeField =
          FieldFactory.newTimeStampField(1145);
      public boolean hasEventTime() throws quickfix.FieldNotFound {
        return isSetField(1145);
      }
      public long getEventTime() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(eventTimeField));
      }
      public NoEvents setEventTime(final long value) {
        setField(FieldValue.to(eventTimeField, value));
        return this;
      }
      public NoEvents setEventTime(final quickfix.field.EventTime value) {
        setField(FieldValue.to(eventTimeField, FieldValue.of(value)));
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
        super(864, 865, new int[] {865, 866, 1145, 867, 868, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoEvents proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoEvents
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getEventType()) {
          this.setEventType(proto.getEventType());
        }
        if (fieldPresence.getEventDate()) {
          this.setEventDate(proto.getEventDate());
        }
        if (fieldPresence.getEventTime()) {
          this.setEventTime(proto.getEventTime());
        }
        if (fieldPresence.getEventPx()) {
          this.setEventPx(proto.getEventPx());
        }
        if (fieldPresence.getEventText()) {
          this.setEventText(proto.getEventText());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoEvents.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoEvents
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoEvents.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoEvents
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoEvents
                .FieldPresence.newBuilder();

        if (this.hasEventType()) {
          builder.setEventType(this.getEventType());
          presenceBuilder.setEventType(true);
        }
        if (this.hasEventDate()) {
          builder.setEventDate(this.getEventDate());
          presenceBuilder.setEventDate(true);
        }
        if (this.hasEventTime()) {
          builder.setEventTime(this.getEventTime());
          presenceBuilder.setEventTime(true);
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

    public static class NoInstrumentParties extends quickfix.Group {
      public static class NoInstrumentPartySubIds extends quickfix.Group {
        private final quickfix.StringField instrumentPartySubIdField =
            FieldFactory.newStringField(1053);
        public boolean hasInstrumentPartySubId() throws quickfix.FieldNotFound {
          return isSetField(1053);
        }
        public String getInstrumentPartySubId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(instrumentPartySubIdField));
        }
        public NoInstrumentPartySubIds setInstrumentPartySubId(final String value) {
          setField(FieldValue.to(instrumentPartySubIdField, value));
          return this;
        }
        public NoInstrumentPartySubIds setInstrumentPartySubId(
            final quickfix.field.InstrumentPartySubID value) {
          setField(FieldValue.to(instrumentPartySubIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField instrumentPartySubIdTypeField =
            FieldFactory.newIntField(1054);
        public boolean hasInstrumentPartySubIdType() throws quickfix.FieldNotFound {
          return isSetField(1054);
        }
        public int getInstrumentPartySubIdType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(instrumentPartySubIdTypeField));
        }
        public NoInstrumentPartySubIds setInstrumentPartySubIdType(final int value) {
          setField(FieldValue.to(instrumentPartySubIdTypeField, value));
          return this;
        }
        public NoInstrumentPartySubIds setInstrumentPartySubIdType(
            final quickfix.field.InstrumentPartySubIDType value) {
          setField(FieldValue.to(instrumentPartySubIdTypeField, FieldValue.of(value)));
          return this;
        }

        public NoInstrumentPartySubIds() {
          super(1052, 1053, new int[] {1053, 1054, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoInstrumentParties.NoInstrumentPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
              .NoInstrumentParties.NoInstrumentPartySubIds.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getInstrumentPartySubId()) {
            this.setInstrumentPartySubId(proto.getInstrumentPartySubId());
          }
          if (fieldPresence.getInstrumentPartySubIdType()) {
            this.setInstrumentPartySubIdType(proto.getInstrumentPartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
            .NoInstrumentParties.NoInstrumentPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
              .NoInstrumentParties.NoInstrumentPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                  .NoInstrumentParties.NoInstrumentPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
              .NoInstrumentParties.NoInstrumentPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                  .NoInstrumentParties.NoInstrumentPartySubIds.FieldPresence.newBuilder();

          if (this.hasInstrumentPartySubId()) {
            builder.setInstrumentPartySubId(this.getInstrumentPartySubId());
            presenceBuilder.setInstrumentPartySubId(true);
          }
          if (this.hasInstrumentPartySubIdType()) {
            builder.setInstrumentPartySubIdType(this.getInstrumentPartySubIdType());
            presenceBuilder.setInstrumentPartySubIdType(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField instrumentPartyIdField = FieldFactory.newStringField(1019);
      public boolean hasInstrumentPartyId() throws quickfix.FieldNotFound {
        return isSetField(1019);
      }
      public String getInstrumentPartyId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(instrumentPartyIdField));
      }
      public NoInstrumentParties setInstrumentPartyId(final String value) {
        setField(FieldValue.to(instrumentPartyIdField, value));
        return this;
      }
      public NoInstrumentParties setInstrumentPartyId(
          final quickfix.field.InstrumentPartyID value) {
        setField(FieldValue.to(instrumentPartyIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField instrumentPartyIdSourceField =
          FieldFactory.newCharField(1050);
      public boolean hasInstrumentPartyIdSource() throws quickfix.FieldNotFound {
        return isSetField(1050);
      }
      public int getInstrumentPartyIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(instrumentPartyIdSourceField));
      }
      public NoInstrumentParties setInstrumentPartyIdSource(final int value) {
        setField(FieldValue.to(instrumentPartyIdSourceField, value));
        return this;
      }
      public NoInstrumentParties setInstrumentPartyIdSource(final char value) {
        setField(FieldValue.to(instrumentPartyIdSourceField, value));
        return this;
      }
      public NoInstrumentParties setInstrumentPartyIdSource(final String value) {
        setField(FieldValue.to(instrumentPartyIdSourceField, value));
        return this;
      }
      public NoInstrumentParties setInstrumentPartyIdSource(
          final quickfix.field.InstrumentPartyIDSource value) {
        setField(FieldValue.to(instrumentPartyIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField instrumentPartyRoleField = FieldFactory.newIntField(1051);
      public boolean hasInstrumentPartyRole() throws quickfix.FieldNotFound {
        return isSetField(1051);
      }
      public int getInstrumentPartyRole() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(instrumentPartyRoleField));
      }
      public NoInstrumentParties setInstrumentPartyRole(final int value) {
        setField(FieldValue.to(instrumentPartyRoleField, value));
        return this;
      }
      public NoInstrumentParties setInstrumentPartyRole(
          final quickfix.field.InstrumentPartyRole value) {
        setField(FieldValue.to(instrumentPartyRoleField, FieldValue.of(value)));
        return this;
      }

      public NoInstrumentParties() {
        super(1018, 1019, new int[] {1019, 1050, 1051, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoInstrumentParties proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
            .NoInstrumentParties.FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoInstrumentPartySubIdsCount(); i++) {
          final NoInstrumentParties.NoInstrumentPartySubIds group =
              new NoInstrumentParties.NoInstrumentPartySubIds();
          group.fromProto(proto.getNoInstrumentPartySubIds(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getInstrumentPartyId()) {
          this.setInstrumentPartyId(proto.getInstrumentPartyId());
        }
        if (fieldPresence.getInstrumentPartyIdSource()) {
          this.setInstrumentPartyIdSource(proto.getInstrumentPartyIdSource());
        }
        if (fieldPresence.getInstrumentPartyRole()) {
          this.setInstrumentPartyRole(proto.getInstrumentPartyRole());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
          .NoInstrumentParties.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
            .NoInstrumentParties.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoInstrumentParties
                .newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
            .NoInstrumentParties.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoInstrumentParties
                .FieldPresence.newBuilder();

        final int noInstrumentPartySubIdsGroupCount = this.getGroupCount(1052);
        for (int i = 1; i <= noInstrumentPartySubIdsGroupCount; i++) {
          final NoInstrumentParties.NoInstrumentPartySubIds group =
              new NoInstrumentParties.NoInstrumentPartySubIds();
          this.getGroup(i, group);
          builder.addNoInstrumentPartySubIds(group.toBuilder().build());
        }

        if (this.hasInstrumentPartyId()) {
          builder.setInstrumentPartyId(this.getInstrumentPartyId());
          presenceBuilder.setInstrumentPartyId(true);
        }
        if (this.hasInstrumentPartyIdSource()) {
          builder.setInstrumentPartyIdSource(this.getInstrumentPartyIdSource());
          presenceBuilder.setInstrumentPartyIdSource(true);
        }
        if (this.hasInstrumentPartyRole()) {
          builder.setInstrumentPartyRole(this.getInstrumentPartyRole());
          presenceBuilder.setInstrumentPartyRole(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoComplexEvents extends quickfix.Group {
      public static class NoComplexEventDates extends quickfix.Group {
        public static class NoComplexEventTimes extends quickfix.Group {
          private final FieldFactory.TimeField complexEventStartTimeField =
              FieldFactory.newTimeField(1495);
          public boolean hasComplexEventStartTime() throws quickfix.FieldNotFound {
            return isSetField(1495);
          }
          public long getComplexEventStartTime() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(complexEventStartTimeField));
          }
          public NoComplexEventTimes setComplexEventStartTime(final long value) {
            setField(FieldValue.to(complexEventStartTimeField, value));
            return this;
          }
          public NoComplexEventTimes setComplexEventStartTime(
              final quickfix.field.ComplexEventStartTime value) {
            setField(FieldValue.to(complexEventStartTimeField, FieldValue.of(value)));
            return this;
          }

          private final FieldFactory.TimeField complexEventEndTimeField =
              FieldFactory.newTimeField(1496);
          public boolean hasComplexEventEndTime() throws quickfix.FieldNotFound {
            return isSetField(1496);
          }
          public long getComplexEventEndTime() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(complexEventEndTimeField));
          }
          public NoComplexEventTimes setComplexEventEndTime(final long value) {
            setField(FieldValue.to(complexEventEndTimeField, value));
            return this;
          }
          public NoComplexEventTimes setComplexEventEndTime(
              final quickfix.field.ComplexEventEndTime value) {
            setField(FieldValue.to(complexEventEndTimeField, FieldValue.of(value)));
            return this;
          }

          public NoComplexEventTimes() {
            super(1494, 1495, new int[] {1495, 1496, 0});
          }

          @Override
          public void addGroup(final quickfix.Group group) {
            addGroupRef(group);
          }

          public void fromProto(
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                  .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes proto) {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes
                .FieldPresence fieldPresence = proto.getFieldPresence();

            if (fieldPresence.getComplexEventStartTime()) {
              this.setComplexEventStartTime(proto.getComplexEventStartTime());
            }
            if (fieldPresence.getComplexEventEndTime()) {
              this.setComplexEventEndTime(proto.getComplexEventEndTime());
            }
          }

          public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
              .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.Builder
              toBuilder() throws quickfix.FieldNotFound {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.Builder builder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
                    .NoComplexEventDates.NoComplexEventTimes.newBuilder();
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.FieldPresence
                .Builder presenceBuilder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
                    .NoComplexEventDates.NoComplexEventTimes.FieldPresence.newBuilder();

            if (this.hasComplexEventStartTime()) {
              builder.setComplexEventStartTime(this.getComplexEventStartTime());
              presenceBuilder.setComplexEventStartTime(true);
            }
            if (this.hasComplexEventEndTime()) {
              builder.setComplexEventEndTime(this.getComplexEventEndTime());
              presenceBuilder.setComplexEventEndTime(true);
            }
            builder.setFieldPresence(presenceBuilder.build());
            return builder;
          }
        }

        private final FieldFactory.TimeStampField complexEventStartDateField =
            FieldFactory.newTimeStampField(1492);
        public boolean hasComplexEventStartDate() throws quickfix.FieldNotFound {
          return isSetField(1492);
        }
        public long getComplexEventStartDate() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(complexEventStartDateField));
        }
        public NoComplexEventDates setComplexEventStartDate(final long value) {
          setField(FieldValue.to(complexEventStartDateField, value));
          return this;
        }
        public NoComplexEventDates setComplexEventStartDate(
            final quickfix.field.ComplexEventStartDate value) {
          setField(FieldValue.to(complexEventStartDateField, FieldValue.of(value)));
          return this;
        }

        private final FieldFactory.TimeStampField complexEventEndDateField =
            FieldFactory.newTimeStampField(1493);
        public boolean hasComplexEventEndDate() throws quickfix.FieldNotFound {
          return isSetField(1493);
        }
        public long getComplexEventEndDate() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(complexEventEndDateField));
        }
        public NoComplexEventDates setComplexEventEndDate(final long value) {
          setField(FieldValue.to(complexEventEndDateField, value));
          return this;
        }
        public NoComplexEventDates setComplexEventEndDate(
            final quickfix.field.ComplexEventEndDate value) {
          setField(FieldValue.to(complexEventEndDateField, FieldValue.of(value)));
          return this;
        }

        public NoComplexEventDates() {
          super(1491, 1492, new int[] {1492, 1493, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoComplexEvents.NoComplexEventDates proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
              .NoComplexEventDates.FieldPresence fieldPresence = proto.getFieldPresence();

          for (int i = 0; i < proto.getNoComplexEventTimesCount(); i++) {
            final NoComplexEventDates.NoComplexEventTimes group =
                new NoComplexEventDates.NoComplexEventTimes();
            group.fromProto(proto.getNoComplexEventTimes(i));
            this.addGroupRef(group);
          }
          if (fieldPresence.getComplexEventStartDate()) {
            this.setComplexEventStartDate(proto.getComplexEventStartDate());
          }
          if (fieldPresence.getComplexEventEndDate()) {
            this.setComplexEventEndDate(proto.getComplexEventEndDate());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
            .NoComplexEventDates.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
              .NoComplexEventDates.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
                  .NoComplexEventDates.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
              .NoComplexEventDates.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
                  .NoComplexEventDates.FieldPresence.newBuilder();

          final int noComplexEventTimesGroupCount = this.getGroupCount(1494);
          for (int i = 1; i <= noComplexEventTimesGroupCount; i++) {
            final NoComplexEventDates.NoComplexEventTimes group =
                new NoComplexEventDates.NoComplexEventTimes();
            this.getGroup(i, group);
            builder.addNoComplexEventTimes(group.toBuilder().build());
          }

          if (this.hasComplexEventStartDate()) {
            builder.setComplexEventStartDate(this.getComplexEventStartDate());
            presenceBuilder.setComplexEventStartDate(true);
          }
          if (this.hasComplexEventEndDate()) {
            builder.setComplexEventEndDate(this.getComplexEventEndDate());
            presenceBuilder.setComplexEventEndDate(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.IntField complexEventTypeField = FieldFactory.newIntField(1484);
      public boolean hasComplexEventType() throws quickfix.FieldNotFound {
        return isSetField(1484);
      }
      public int getComplexEventType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventTypeField));
      }
      public NoComplexEvents setComplexEventType(final int value) {
        setField(FieldValue.to(complexEventTypeField, value));
        return this;
      }
      public NoComplexEvents setComplexEventType(final quickfix.field.ComplexEventType value) {
        setField(FieldValue.to(complexEventTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField complexOptPayoutAmountField =
          FieldFactory.newDoubleField(1485);
      public boolean hasComplexOptPayoutAmount() throws quickfix.FieldNotFound {
        return isSetField(1485);
      }
      public double getComplexOptPayoutAmount() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexOptPayoutAmountField));
      }
      public NoComplexEvents setComplexOptPayoutAmount(final double value) {
        setField(FieldValue.to(complexOptPayoutAmountField, value));
        return this;
      }
      public NoComplexEvents setComplexOptPayoutAmount(
          final quickfix.field.ComplexOptPayoutAmount value) {
        setField(FieldValue.to(complexOptPayoutAmountField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField complexEventPriceField = FieldFactory.newDoubleField(1486);
      public boolean hasComplexEventPrice() throws quickfix.FieldNotFound {
        return isSetField(1486);
      }
      public double getComplexEventPrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventPriceField));
      }
      public NoComplexEvents setComplexEventPrice(final double value) {
        setField(FieldValue.to(complexEventPriceField, value));
        return this;
      }
      public NoComplexEvents setComplexEventPrice(final quickfix.field.ComplexEventPrice value) {
        setField(FieldValue.to(complexEventPriceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField complexEventPriceBoundaryMethodField =
          FieldFactory.newIntField(1487);
      public boolean hasComplexEventPriceBoundaryMethod() throws quickfix.FieldNotFound {
        return isSetField(1487);
      }
      public int getComplexEventPriceBoundaryMethod() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventPriceBoundaryMethodField));
      }
      public NoComplexEvents setComplexEventPriceBoundaryMethod(final int value) {
        setField(FieldValue.to(complexEventPriceBoundaryMethodField, value));
        return this;
      }
      public NoComplexEvents setComplexEventPriceBoundaryMethod(
          final quickfix.field.ComplexEventPriceBoundaryMethod value) {
        setField(FieldValue.to(complexEventPriceBoundaryMethodField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField complexEventPriceBoundaryPrecisionField =
          FieldFactory.newDoubleField(1488);
      public boolean hasComplexEventPriceBoundaryPrecision() throws quickfix.FieldNotFound {
        return isSetField(1488);
      }
      public double getComplexEventPriceBoundaryPrecision() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventPriceBoundaryPrecisionField));
      }
      public NoComplexEvents setComplexEventPriceBoundaryPrecision(final double value) {
        setField(FieldValue.to(complexEventPriceBoundaryPrecisionField, value));
        return this;
      }
      public NoComplexEvents setComplexEventPriceBoundaryPrecision(
          final quickfix.field.ComplexEventPriceBoundaryPrecision value) {
        setField(FieldValue.to(complexEventPriceBoundaryPrecisionField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField complexEventPriceTimeTypeField =
          FieldFactory.newIntField(1489);
      public boolean hasComplexEventPriceTimeType() throws quickfix.FieldNotFound {
        return isSetField(1489);
      }
      public int getComplexEventPriceTimeType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventPriceTimeTypeField));
      }
      public NoComplexEvents setComplexEventPriceTimeType(final int value) {
        setField(FieldValue.to(complexEventPriceTimeTypeField, value));
        return this;
      }
      public NoComplexEvents setComplexEventPriceTimeType(
          final quickfix.field.ComplexEventPriceTimeType value) {
        setField(FieldValue.to(complexEventPriceTimeTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField complexEventConditionField = FieldFactory.newIntField(1490);
      public boolean hasComplexEventCondition() throws quickfix.FieldNotFound {
        return isSetField(1490);
      }
      public int getComplexEventCondition() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(complexEventConditionField));
      }
      public NoComplexEvents setComplexEventCondition(final int value) {
        setField(FieldValue.to(complexEventConditionField, value));
        return this;
      }
      public NoComplexEvents setComplexEventCondition(
          final quickfix.field.ComplexEventCondition value) {
        setField(FieldValue.to(complexEventConditionField, FieldValue.of(value)));
        return this;
      }

      public NoComplexEvents() {
        super(1483, 1484, new int[] {1484, 1485, 1486, 1487, 1488, 1489, 1490, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoComplexEvents proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoComplexEventDatesCount(); i++) {
          final NoComplexEvents.NoComplexEventDates group =
              new NoComplexEvents.NoComplexEventDates();
          group.fromProto(proto.getNoComplexEventDates(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getComplexEventType()) {
          this.setComplexEventType(proto.getComplexEventType());
        }
        if (fieldPresence.getComplexOptPayoutAmount()) {
          this.setComplexOptPayoutAmount(proto.getComplexOptPayoutAmount());
        }
        if (fieldPresence.getComplexEventPrice()) {
          this.setComplexEventPrice(proto.getComplexEventPrice());
        }
        if (fieldPresence.getComplexEventPriceBoundaryMethod()) {
          this.setComplexEventPriceBoundaryMethod(proto.getComplexEventPriceBoundaryMethod());
        }
        if (fieldPresence.getComplexEventPriceBoundaryPrecision()) {
          this.setComplexEventPriceBoundaryPrecision(proto.getComplexEventPriceBoundaryPrecision());
        }
        if (fieldPresence.getComplexEventPriceTimeType()) {
          this.setComplexEventPriceTimeType(proto.getComplexEventPriceTimeType());
        }
        if (fieldPresence.getComplexEventCondition()) {
          this.setComplexEventCondition(proto.getComplexEventCondition());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoComplexEvents.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoComplexEvents
                .FieldPresence.newBuilder();

        final int noComplexEventDatesGroupCount = this.getGroupCount(1491);
        for (int i = 1; i <= noComplexEventDatesGroupCount; i++) {
          final NoComplexEvents.NoComplexEventDates group =
              new NoComplexEvents.NoComplexEventDates();
          this.getGroup(i, group);
          builder.addNoComplexEventDates(group.toBuilder().build());
        }

        if (this.hasComplexEventType()) {
          builder.setComplexEventType(this.getComplexEventType());
          presenceBuilder.setComplexEventType(true);
        }
        if (this.hasComplexOptPayoutAmount()) {
          builder.setComplexOptPayoutAmount(this.getComplexOptPayoutAmount());
          presenceBuilder.setComplexOptPayoutAmount(true);
        }
        if (this.hasComplexEventPrice()) {
          builder.setComplexEventPrice(this.getComplexEventPrice());
          presenceBuilder.setComplexEventPrice(true);
        }
        if (this.hasComplexEventPriceBoundaryMethod()) {
          builder.setComplexEventPriceBoundaryMethod(this.getComplexEventPriceBoundaryMethod());
          presenceBuilder.setComplexEventPriceBoundaryMethod(true);
        }
        if (this.hasComplexEventPriceBoundaryPrecision()) {
          builder.setComplexEventPriceBoundaryPrecision(
              this.getComplexEventPriceBoundaryPrecision());
          presenceBuilder.setComplexEventPriceBoundaryPrecision(true);
        }
        if (this.hasComplexEventPriceTimeType()) {
          builder.setComplexEventPriceTimeType(this.getComplexEventPriceTimeType());
          presenceBuilder.setComplexEventPriceTimeType(true);
        }
        if (this.hasComplexEventCondition()) {
          builder.setComplexEventCondition(this.getComplexEventCondition());
          presenceBuilder.setComplexEventCondition(true);
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltId proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getUnderlyingSecurityAltId()) {
            this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
          }
          if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
            this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingSecurityAltId.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoUnderlyings.NoUnderlyingStips proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getUnderlyingStipType()) {
            this.setUnderlyingStipType(proto.getUnderlyingStipType());
          }
          if (fieldPresence.getUnderlyingStipValue()) {
            this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .NoUnderlyingStips.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUnderlyingStips.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
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

      public static class NoUndlyInstrumentParties extends quickfix.Group {
        public static class NoUndlyInstrumentPartySubIds extends quickfix.Group {
          private final quickfix.StringField underlyingInstrumentPartySubIdField =
              FieldFactory.newStringField(1063);
          public boolean hasUnderlyingInstrumentPartySubId() throws quickfix.FieldNotFound {
            return isSetField(1063);
          }
          public String getUnderlyingInstrumentPartySubId() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(underlyingInstrumentPartySubIdField));
          }
          public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubId(
              final String value) {
            setField(FieldValue.to(underlyingInstrumentPartySubIdField, value));
            return this;
          }
          public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubId(
              final quickfix.field.UnderlyingInstrumentPartySubID value) {
            setField(FieldValue.to(underlyingInstrumentPartySubIdField, FieldValue.of(value)));
            return this;
          }

          private final quickfix.IntField underlyingInstrumentPartySubIdTypeField =
              FieldFactory.newIntField(1064);
          public boolean hasUnderlyingInstrumentPartySubIdType() throws quickfix.FieldNotFound {
            return isSetField(1064);
          }
          public int getUnderlyingInstrumentPartySubIdType() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(underlyingInstrumentPartySubIdTypeField));
          }
          public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubIdType(
              final int value) {
            setField(FieldValue.to(underlyingInstrumentPartySubIdTypeField, value));
            return this;
          }
          public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubIdType(
              final quickfix.field.UnderlyingInstrumentPartySubIDType value) {
            setField(FieldValue.to(underlyingInstrumentPartySubIdTypeField, FieldValue.of(value)));
            return this;
          }

          public NoUndlyInstrumentPartySubIds() {
            super(1062, 1063, new int[] {1063, 1064, 0});
          }

          @Override
          public void addGroup(final quickfix.Group group) {
            addGroupRef(group);
          }

          public void fromProto(
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                  .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds proto) {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence fieldPresence =
                proto.getFieldPresence();

            if (fieldPresence.getUnderlyingInstrumentPartySubId()) {
              this.setUnderlyingInstrumentPartySubId(proto.getUnderlyingInstrumentPartySubId());
            }
            if (fieldPresence.getUnderlyingInstrumentPartySubIdType()) {
              this.setUnderlyingInstrumentPartySubIdType(
                  proto.getUnderlyingInstrumentPartySubIdType());
            }
          }

          public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder
              toBuilder() throws quickfix.FieldNotFound {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder builder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                    .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.newBuilder();
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence
                .Builder presenceBuilder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                    .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence
                    .newBuilder();

            if (this.hasUnderlyingInstrumentPartySubId()) {
              builder.setUnderlyingInstrumentPartySubId(this.getUnderlyingInstrumentPartySubId());
              presenceBuilder.setUnderlyingInstrumentPartySubId(true);
            }
            if (this.hasUnderlyingInstrumentPartySubIdType()) {
              builder.setUnderlyingInstrumentPartySubIdType(
                  this.getUnderlyingInstrumentPartySubIdType());
              presenceBuilder.setUnderlyingInstrumentPartySubIdType(true);
            }
            builder.setFieldPresence(presenceBuilder.build());
            return builder;
          }
        }

        private final quickfix.StringField underlyingInstrumentPartyIdField =
            FieldFactory.newStringField(1059);
        public boolean hasUnderlyingInstrumentPartyId() throws quickfix.FieldNotFound {
          return isSetField(1059);
        }
        public String getUnderlyingInstrumentPartyId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingInstrumentPartyIdField));
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyId(final String value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdField, value));
          return this;
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyId(
            final quickfix.field.UnderlyingInstrumentPartyID value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.CharField underlyingInstrumentPartyIdSourceField =
            FieldFactory.newCharField(1060);
        public boolean hasUnderlyingInstrumentPartyIdSource() throws quickfix.FieldNotFound {
          return isSetField(1060);
        }
        public int getUnderlyingInstrumentPartyIdSource() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingInstrumentPartyIdSourceField));
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyIdSource(final int value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdSourceField, value));
          return this;
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyIdSource(final char value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdSourceField, value));
          return this;
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyIdSource(final String value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdSourceField, value));
          return this;
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyIdSource(
            final quickfix.field.UnderlyingInstrumentPartyIDSource value) {
          setField(FieldValue.to(underlyingInstrumentPartyIdSourceField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField underlyingInstrumentPartyRoleField =
            FieldFactory.newIntField(1061);
        public boolean hasUnderlyingInstrumentPartyRole() throws quickfix.FieldNotFound {
          return isSetField(1061);
        }
        public int getUnderlyingInstrumentPartyRole() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(underlyingInstrumentPartyRoleField));
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyRole(final int value) {
          setField(FieldValue.to(underlyingInstrumentPartyRoleField, value));
          return this;
        }
        public NoUndlyInstrumentParties setUnderlyingInstrumentPartyRole(
            final quickfix.field.UnderlyingInstrumentPartyRole value) {
          setField(FieldValue.to(underlyingInstrumentPartyRoleField, FieldValue.of(value)));
          return this;
        }

        public NoUndlyInstrumentParties() {
          super(1058, 1059, new int[] {1059, 1060, 1061, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoUnderlyings.NoUndlyInstrumentParties proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUndlyInstrumentParties.FieldPresence fieldPresence = proto.getFieldPresence();

          for (int i = 0; i < proto.getNoUndlyInstrumentPartySubIdsCount(); i++) {
            final NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds group =
                new NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds();
            group.fromProto(proto.getNoUndlyInstrumentPartySubIds(i));
            this.addGroupRef(group);
          }
          if (fieldPresence.getUnderlyingInstrumentPartyId()) {
            this.setUnderlyingInstrumentPartyId(proto.getUnderlyingInstrumentPartyId());
          }
          if (fieldPresence.getUnderlyingInstrumentPartyIdSource()) {
            this.setUnderlyingInstrumentPartyIdSource(proto.getUnderlyingInstrumentPartyIdSource());
          }
          if (fieldPresence.getUnderlyingInstrumentPartyRole()) {
            this.setUnderlyingInstrumentPartyRole(proto.getUnderlyingInstrumentPartyRole());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .NoUndlyInstrumentParties.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUndlyInstrumentParties.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUndlyInstrumentParties.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
              .NoUndlyInstrumentParties.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
                  .NoUndlyInstrumentParties.FieldPresence.newBuilder();

          final int noUndlyInstrumentPartySubIdsGroupCount = this.getGroupCount(1062);
          for (int i = 1; i <= noUndlyInstrumentPartySubIdsGroupCount; i++) {
            final NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds group =
                new NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds();
            this.getGroup(i, group);
            builder.addNoUndlyInstrumentPartySubIds(group.toBuilder().build());
          }

          if (this.hasUnderlyingInstrumentPartyId()) {
            builder.setUnderlyingInstrumentPartyId(this.getUnderlyingInstrumentPartyId());
            presenceBuilder.setUnderlyingInstrumentPartyId(true);
          }
          if (this.hasUnderlyingInstrumentPartyIdSource()) {
            builder.setUnderlyingInstrumentPartyIdSource(
                this.getUnderlyingInstrumentPartyIdSource());
            presenceBuilder.setUnderlyingInstrumentPartyIdSource(true);
          }
          if (this.hasUnderlyingInstrumentPartyRole()) {
            builder.setUnderlyingInstrumentPartyRole(this.getUnderlyingInstrumentPartyRole());
            presenceBuilder.setUnderlyingInstrumentPartyRole(true);
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

      private final quickfix.StringField underlyingMaturityTimeField =
          FieldFactory.newStringField(1213);
      public boolean hasUnderlyingMaturityTime() throws quickfix.FieldNotFound {
        return isSetField(1213);
      }
      public String getUnderlyingMaturityTime() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingMaturityTimeField));
      }
      public NoUnderlyings setUnderlyingMaturityTime(final String value) {
        setField(FieldValue.to(underlyingMaturityTimeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingMaturityTime(
          final quickfix.field.UnderlyingMaturityTime value) {
        setField(FieldValue.to(underlyingMaturityTimeField, FieldValue.of(value)));
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

      private final quickfix.StringField underlyingRestructuringTypeField =
          FieldFactory.newStringField(1453);
      public boolean hasUnderlyingRestructuringType() throws quickfix.FieldNotFound {
        return isSetField(1453);
      }
      public String getUnderlyingRestructuringType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingRestructuringTypeField));
      }
      public NoUnderlyings setUnderlyingRestructuringType(final String value) {
        setField(FieldValue.to(underlyingRestructuringTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingRestructuringType(
          final quickfix.field.UnderlyingRestructuringType value) {
        setField(FieldValue.to(underlyingRestructuringTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSeniorityField =
          FieldFactory.newStringField(1454);
      public boolean hasUnderlyingSeniority() throws quickfix.FieldNotFound {
        return isSetField(1454);
      }
      public String getUnderlyingSeniority() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSeniorityField));
      }
      public NoUnderlyings setUnderlyingSeniority(final String value) {
        setField(FieldValue.to(underlyingSeniorityField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSeniority(final quickfix.field.UnderlyingSeniority value) {
        setField(FieldValue.to(underlyingSeniorityField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingNotionalPercentageOutstandingField =
          FieldFactory.newDoubleField(1455);
      public boolean hasUnderlyingNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
        return isSetField(1455);
      }
      public double getUnderlyingNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingNotionalPercentageOutstandingField));
      }
      public NoUnderlyings setUnderlyingNotionalPercentageOutstanding(final double value) {
        setField(FieldValue.to(underlyingNotionalPercentageOutstandingField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingNotionalPercentageOutstanding(
          final quickfix.field.UnderlyingNotionalPercentageOutstanding value) {
        setField(FieldValue.to(underlyingNotionalPercentageOutstandingField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingOriginalNotionalPercentageOutstandingField =
          FieldFactory.newDoubleField(1456);
      public boolean hasUnderlyingOriginalNotionalPercentageOutstanding()
          throws quickfix.FieldNotFound {
        return isSetField(1456);
      }
      public double getUnderlyingOriginalNotionalPercentageOutstanding()
          throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingOriginalNotionalPercentageOutstandingField));
      }
      public NoUnderlyings setUnderlyingOriginalNotionalPercentageOutstanding(final double value) {
        setField(FieldValue.to(underlyingOriginalNotionalPercentageOutstandingField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingOriginalNotionalPercentageOutstanding(
          final quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) {
        setField(FieldValue.to(
            underlyingOriginalNotionalPercentageOutstandingField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingAttachmentPointField =
          FieldFactory.newDoubleField(1459);
      public boolean hasUnderlyingAttachmentPoint() throws quickfix.FieldNotFound {
        return isSetField(1459);
      }
      public double getUnderlyingAttachmentPoint() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingAttachmentPointField));
      }
      public NoUnderlyings setUnderlyingAttachmentPoint(final double value) {
        setField(FieldValue.to(underlyingAttachmentPointField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingAttachmentPoint(
          final quickfix.field.UnderlyingAttachmentPoint value) {
        setField(FieldValue.to(underlyingAttachmentPointField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingDetachmentPointField =
          FieldFactory.newDoubleField(1460);
      public boolean hasUnderlyingDetachmentPoint() throws quickfix.FieldNotFound {
        return isSetField(1460);
      }
      public double getUnderlyingDetachmentPoint() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingDetachmentPointField));
      }
      public NoUnderlyings setUnderlyingDetachmentPoint(final double value) {
        setField(FieldValue.to(underlyingDetachmentPointField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingDetachmentPoint(
          final quickfix.field.UnderlyingDetachmentPoint value) {
        setField(FieldValue.to(underlyingDetachmentPointField, FieldValue.of(value)));
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

      private final quickfix.IntField underlyingContractMultiplierUnitField =
          FieldFactory.newIntField(1437);
      public boolean hasUnderlyingContractMultiplierUnit() throws quickfix.FieldNotFound {
        return isSetField(1437);
      }
      public int getUnderlyingContractMultiplierUnit() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingContractMultiplierUnitField));
      }
      public NoUnderlyings setUnderlyingContractMultiplierUnit(final int value) {
        setField(FieldValue.to(underlyingContractMultiplierUnitField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingContractMultiplierUnit(
          final quickfix.field.UnderlyingContractMultiplierUnit value) {
        setField(FieldValue.to(underlyingContractMultiplierUnitField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField underlyingFlowScheduleTypeField =
          FieldFactory.newIntField(1441);
      public boolean hasUnderlyingFlowScheduleType() throws quickfix.FieldNotFound {
        return isSetField(1441);
      }
      public int getUnderlyingFlowScheduleType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingFlowScheduleTypeField));
      }
      public NoUnderlyings setUnderlyingFlowScheduleType(final int value) {
        setField(FieldValue.to(underlyingFlowScheduleTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFlowScheduleType(
          final quickfix.field.UnderlyingFlowScheduleType value) {
        setField(FieldValue.to(underlyingFlowScheduleTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingUnitOfMeasureField =
          FieldFactory.newStringField(998);
      public boolean hasUnderlyingUnitOfMeasure() throws quickfix.FieldNotFound {
        return isSetField(998);
      }
      public String getUnderlyingUnitOfMeasure() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingUnitOfMeasureField));
      }
      public NoUnderlyings setUnderlyingUnitOfMeasure(final String value) {
        setField(FieldValue.to(underlyingUnitOfMeasureField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingUnitOfMeasure(
          final quickfix.field.UnderlyingUnitOfMeasure value) {
        setField(FieldValue.to(underlyingUnitOfMeasureField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingUnitOfMeasureQtyField =
          FieldFactory.newDoubleField(1423);
      public boolean hasUnderlyingUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return isSetField(1423);
      }
      public double getUnderlyingUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingUnitOfMeasureQtyField));
      }
      public NoUnderlyings setUnderlyingUnitOfMeasureQty(final double value) {
        setField(FieldValue.to(underlyingUnitOfMeasureQtyField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingUnitOfMeasureQty(
          final quickfix.field.UnderlyingUnitOfMeasureQty value) {
        setField(FieldValue.to(underlyingUnitOfMeasureQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingPriceUnitOfMeasureField =
          FieldFactory.newStringField(1424);
      public boolean hasUnderlyingPriceUnitOfMeasure() throws quickfix.FieldNotFound {
        return isSetField(1424);
      }
      public String getUnderlyingPriceUnitOfMeasure() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingPriceUnitOfMeasureField));
      }
      public NoUnderlyings setUnderlyingPriceUnitOfMeasure(final String value) {
        setField(FieldValue.to(underlyingPriceUnitOfMeasureField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingPriceUnitOfMeasure(
          final quickfix.field.UnderlyingPriceUnitOfMeasure value) {
        setField(FieldValue.to(underlyingPriceUnitOfMeasureField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingPriceUnitOfMeasureQtyField =
          FieldFactory.newDoubleField(1425);
      public boolean hasUnderlyingPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return isSetField(1425);
      }
      public double getUnderlyingPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingPriceUnitOfMeasureQtyField));
      }
      public NoUnderlyings setUnderlyingPriceUnitOfMeasureQty(final double value) {
        setField(FieldValue.to(underlyingPriceUnitOfMeasureQtyField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingPriceUnitOfMeasureQty(
          final quickfix.field.UnderlyingPriceUnitOfMeasureQty value) {
        setField(FieldValue.to(underlyingPriceUnitOfMeasureQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingTimeUnitField =
          FieldFactory.newStringField(1000);
      public boolean hasUnderlyingTimeUnit() throws quickfix.FieldNotFound {
        return isSetField(1000);
      }
      public String getUnderlyingTimeUnit() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingTimeUnitField));
      }
      public NoUnderlyings setUnderlyingTimeUnit(final String value) {
        setField(FieldValue.to(underlyingTimeUnitField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingTimeUnit(final quickfix.field.UnderlyingTimeUnit value) {
        setField(FieldValue.to(underlyingTimeUnitField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField underlyingExerciseStyleField = FieldFactory.newIntField(1419);
      public boolean hasUnderlyingExerciseStyle() throws quickfix.FieldNotFound {
        return isSetField(1419);
      }
      public int getUnderlyingExerciseStyle() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingExerciseStyleField));
      }
      public NoUnderlyings setUnderlyingExerciseStyle(final int value) {
        setField(FieldValue.to(underlyingExerciseStyleField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingExerciseStyle(
          final quickfix.field.UnderlyingExerciseStyle value) {
        setField(FieldValue.to(underlyingExerciseStyleField, FieldValue.of(value)));
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

      private final quickfix.DoubleField underlyingAllocationPercentField =
          FieldFactory.newDoubleField(972);
      public boolean hasUnderlyingAllocationPercent() throws quickfix.FieldNotFound {
        return isSetField(972);
      }
      public double getUnderlyingAllocationPercent() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingAllocationPercentField));
      }
      public NoUnderlyings setUnderlyingAllocationPercent(final double value) {
        setField(FieldValue.to(underlyingAllocationPercentField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingAllocationPercent(
          final quickfix.field.UnderlyingAllocationPercent value) {
        setField(FieldValue.to(underlyingAllocationPercentField, FieldValue.of(value)));
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

      private final quickfix.IntField underlyingSettlementTypeField = FieldFactory.newIntField(975);
      public boolean hasUnderlyingSettlementType() throws quickfix.FieldNotFound {
        return isSetField(975);
      }
      public int getUnderlyingSettlementType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSettlementTypeField));
      }
      public NoUnderlyings setUnderlyingSettlementType(final int value) {
        setField(FieldValue.to(underlyingSettlementTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSettlementType(
          final quickfix.field.UnderlyingSettlementType value) {
        setField(FieldValue.to(underlyingSettlementTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingCashAmountField =
          FieldFactory.newDoubleField(973);
      public boolean hasUnderlyingCashAmount() throws quickfix.FieldNotFound {
        return isSetField(973);
      }
      public double getUnderlyingCashAmount() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCashAmountField));
      }
      public NoUnderlyings setUnderlyingCashAmount(final double value) {
        setField(FieldValue.to(underlyingCashAmountField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCashAmount(
          final quickfix.field.UnderlyingCashAmount value) {
        setField(FieldValue.to(underlyingCashAmountField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingCashTypeField = FieldFactory.newStringField(974);
      public boolean hasUnderlyingCashType() throws quickfix.FieldNotFound {
        return isSetField(974);
      }
      public String getUnderlyingCashType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCashTypeField));
      }
      public NoUnderlyings setUnderlyingCashType(final String value) {
        setField(FieldValue.to(underlyingCashTypeField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCashType(final quickfix.field.UnderlyingCashType value) {
        setField(FieldValue.to(underlyingCashTypeField, FieldValue.of(value)));
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

      private final quickfix.DoubleField underlyingAdjustedQuantityField =
          FieldFactory.newDoubleField(1044);
      public boolean hasUnderlyingAdjustedQuantity() throws quickfix.FieldNotFound {
        return isSetField(1044);
      }
      public double getUnderlyingAdjustedQuantity() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingAdjustedQuantityField));
      }
      public NoUnderlyings setUnderlyingAdjustedQuantity(final double value) {
        setField(FieldValue.to(underlyingAdjustedQuantityField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingAdjustedQuantity(
          final quickfix.field.UnderlyingAdjustedQuantity value) {
        setField(FieldValue.to(underlyingAdjustedQuantityField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingFxRateField = FieldFactory.newDoubleField(1045);
      public boolean hasUnderlyingFxRate() throws quickfix.FieldNotFound {
        return isSetField(1045);
      }
      public double getUnderlyingFxRate() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingFxRateField));
      }
      public NoUnderlyings setUnderlyingFxRate(final double value) {
        setField(FieldValue.to(underlyingFxRateField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFxRate(final quickfix.field.UnderlyingFXRate value) {
        setField(FieldValue.to(underlyingFxRateField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField underlyingFxRateCalcField = FieldFactory.newCharField(1046);
      public boolean hasUnderlyingFxRateCalc() throws quickfix.FieldNotFound {
        return isSetField(1046);
      }
      public int getUnderlyingFxRateCalc() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingFxRateCalcField));
      }
      public NoUnderlyings setUnderlyingFxRateCalc(final int value) {
        setField(FieldValue.to(underlyingFxRateCalcField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFxRateCalc(final char value) {
        setField(FieldValue.to(underlyingFxRateCalcField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFxRateCalc(final String value) {
        setField(FieldValue.to(underlyingFxRateCalcField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingFxRateCalc(
          final quickfix.field.UnderlyingFXRateCalc value) {
        setField(FieldValue.to(underlyingFxRateCalcField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField underlyingCapValueField =
          FieldFactory.newDoubleField(1038);
      public boolean hasUnderlyingCapValue() throws quickfix.FieldNotFound {
        return isSetField(1038);
      }
      public double getUnderlyingCapValue() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingCapValueField));
      }
      public NoUnderlyings setUnderlyingCapValue(final double value) {
        setField(FieldValue.to(underlyingCapValueField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingCapValue(final quickfix.field.UnderlyingCapValue value) {
        setField(FieldValue.to(underlyingCapValueField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField underlyingSettlMethodField =
          FieldFactory.newStringField(1039);
      public boolean hasUnderlyingSettlMethod() throws quickfix.FieldNotFound {
        return isSetField(1039);
      }
      public String getUnderlyingSettlMethod() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(underlyingSettlMethodField));
      }
      public NoUnderlyings setUnderlyingSettlMethod(final String value) {
        setField(FieldValue.to(underlyingSettlMethodField, value));
        return this;
      }
      public NoUnderlyings setUnderlyingSettlMethod(
          final quickfix.field.UnderlyingSettlMethod value) {
        setField(FieldValue.to(underlyingSettlMethodField, FieldValue.of(value)));
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

      public NoUnderlyings() {
        super(711, 311,
            new int[] {311, 312, 309, 305, 462, 463, 310, 763, 313, 542, 1213, 241, 1453, 1454,
                1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316,
                941, 317, 436, 1437, 1441, 998, 1423, 1424, 1425, 1000, 1419, 435, 308, 306, 362,
                363, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885,
                886, 1044, 1045, 1046, 1038, 1039, 315, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoUnderlyings proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
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
        for (int i = 0; i < proto.getNoUndlyInstrumentPartiesCount(); i++) {
          final NoUnderlyings.NoUndlyInstrumentParties group =
              new NoUnderlyings.NoUndlyInstrumentParties();
          group.fromProto(proto.getNoUndlyInstrumentParties(i));
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
        if (fieldPresence.getUnderlyingMaturityTime()) {
          this.setUnderlyingMaturityTime(proto.getUnderlyingMaturityTime());
        }
        if (fieldPresence.getUnderlyingCouponPaymentDate()) {
          this.setUnderlyingCouponPaymentDate(proto.getUnderlyingCouponPaymentDate());
        }
        if (fieldPresence.getUnderlyingRestructuringType()) {
          this.setUnderlyingRestructuringType(proto.getUnderlyingRestructuringType());
        }
        if (fieldPresence.getUnderlyingSeniority()) {
          this.setUnderlyingSeniority(proto.getUnderlyingSeniority());
        }
        if (fieldPresence.getUnderlyingNotionalPercentageOutstanding()) {
          this.setUnderlyingNotionalPercentageOutstanding(
              proto.getUnderlyingNotionalPercentageOutstanding());
        }
        if (fieldPresence.getUnderlyingOriginalNotionalPercentageOutstanding()) {
          this.setUnderlyingOriginalNotionalPercentageOutstanding(
              proto.getUnderlyingOriginalNotionalPercentageOutstanding());
        }
        if (fieldPresence.getUnderlyingAttachmentPoint()) {
          this.setUnderlyingAttachmentPoint(proto.getUnderlyingAttachmentPoint());
        }
        if (fieldPresence.getUnderlyingDetachmentPoint()) {
          this.setUnderlyingDetachmentPoint(proto.getUnderlyingDetachmentPoint());
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
        if (fieldPresence.getUnderlyingContractMultiplierUnit()) {
          this.setUnderlyingContractMultiplierUnit(proto.getUnderlyingContractMultiplierUnit());
        }
        if (fieldPresence.getUnderlyingFlowScheduleType()) {
          this.setUnderlyingFlowScheduleType(proto.getUnderlyingFlowScheduleType());
        }
        if (fieldPresence.getUnderlyingUnitOfMeasure()) {
          this.setUnderlyingUnitOfMeasure(proto.getUnderlyingUnitOfMeasure());
        }
        if (fieldPresence.getUnderlyingUnitOfMeasureQty()) {
          this.setUnderlyingUnitOfMeasureQty(proto.getUnderlyingUnitOfMeasureQty());
        }
        if (fieldPresence.getUnderlyingPriceUnitOfMeasure()) {
          this.setUnderlyingPriceUnitOfMeasure(proto.getUnderlyingPriceUnitOfMeasure());
        }
        if (fieldPresence.getUnderlyingPriceUnitOfMeasureQty()) {
          this.setUnderlyingPriceUnitOfMeasureQty(proto.getUnderlyingPriceUnitOfMeasureQty());
        }
        if (fieldPresence.getUnderlyingTimeUnit()) {
          this.setUnderlyingTimeUnit(proto.getUnderlyingTimeUnit());
        }
        if (fieldPresence.getUnderlyingExerciseStyle()) {
          this.setUnderlyingExerciseStyle(proto.getUnderlyingExerciseStyle());
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
        if (fieldPresence.getUnderlyingAllocationPercent()) {
          this.setUnderlyingAllocationPercent(proto.getUnderlyingAllocationPercent());
        }
        if (fieldPresence.getUnderlyingCurrency()) {
          this.setUnderlyingCurrency(proto.getUnderlyingCurrency());
        }
        if (fieldPresence.getUnderlyingQty()) {
          this.setUnderlyingQty(proto.getUnderlyingQty());
        }
        if (fieldPresence.getUnderlyingSettlementType()) {
          this.setUnderlyingSettlementType(proto.getUnderlyingSettlementType());
        }
        if (fieldPresence.getUnderlyingCashAmount()) {
          this.setUnderlyingCashAmount(proto.getUnderlyingCashAmount());
        }
        if (fieldPresence.getUnderlyingCashType()) {
          this.setUnderlyingCashType(proto.getUnderlyingCashType());
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
        if (fieldPresence.getUnderlyingAdjustedQuantity()) {
          this.setUnderlyingAdjustedQuantity(proto.getUnderlyingAdjustedQuantity());
        }
        if (fieldPresence.getUnderlyingFxRate()) {
          this.setUnderlyingFxRate(proto.getUnderlyingFxRate());
        }
        if (fieldPresence.getUnderlyingFxRateCalc()) {
          this.setUnderlyingFxRateCalc(proto.getUnderlyingFxRateCalc());
        }
        if (fieldPresence.getUnderlyingCapValue()) {
          this.setUnderlyingCapValue(proto.getUnderlyingCapValue());
        }
        if (fieldPresence.getUnderlyingSettlMethod()) {
          this.setUnderlyingSettlMethod(proto.getUnderlyingSettlMethod());
        }
        if (fieldPresence.getUnderlyingPutOrCall()) {
          this.setUnderlyingPutOrCall(proto.getUnderlyingPutOrCall());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoUnderlyings.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoUnderlyings
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

        final int noUndlyInstrumentPartiesGroupCount = this.getGroupCount(1058);
        for (int i = 1; i <= noUndlyInstrumentPartiesGroupCount; i++) {
          final NoUnderlyings.NoUndlyInstrumentParties group =
              new NoUnderlyings.NoUndlyInstrumentParties();
          this.getGroup(i, group);
          builder.addNoUndlyInstrumentParties(group.toBuilder().build());
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
        if (this.hasUnderlyingMaturityTime()) {
          builder.setUnderlyingMaturityTime(this.getUnderlyingMaturityTime());
          presenceBuilder.setUnderlyingMaturityTime(true);
        }
        if (this.hasUnderlyingCouponPaymentDate()) {
          builder.setUnderlyingCouponPaymentDate(this.getUnderlyingCouponPaymentDate());
          presenceBuilder.setUnderlyingCouponPaymentDate(true);
        }
        if (this.hasUnderlyingRestructuringType()) {
          builder.setUnderlyingRestructuringType(this.getUnderlyingRestructuringType());
          presenceBuilder.setUnderlyingRestructuringType(true);
        }
        if (this.hasUnderlyingSeniority()) {
          builder.setUnderlyingSeniority(this.getUnderlyingSeniority());
          presenceBuilder.setUnderlyingSeniority(true);
        }
        if (this.hasUnderlyingNotionalPercentageOutstanding()) {
          builder.setUnderlyingNotionalPercentageOutstanding(
              this.getUnderlyingNotionalPercentageOutstanding());
          presenceBuilder.setUnderlyingNotionalPercentageOutstanding(true);
        }
        if (this.hasUnderlyingOriginalNotionalPercentageOutstanding()) {
          builder.setUnderlyingOriginalNotionalPercentageOutstanding(
              this.getUnderlyingOriginalNotionalPercentageOutstanding());
          presenceBuilder.setUnderlyingOriginalNotionalPercentageOutstanding(true);
        }
        if (this.hasUnderlyingAttachmentPoint()) {
          builder.setUnderlyingAttachmentPoint(this.getUnderlyingAttachmentPoint());
          presenceBuilder.setUnderlyingAttachmentPoint(true);
        }
        if (this.hasUnderlyingDetachmentPoint()) {
          builder.setUnderlyingDetachmentPoint(this.getUnderlyingDetachmentPoint());
          presenceBuilder.setUnderlyingDetachmentPoint(true);
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
        if (this.hasUnderlyingContractMultiplierUnit()) {
          builder.setUnderlyingContractMultiplierUnit(this.getUnderlyingContractMultiplierUnit());
          presenceBuilder.setUnderlyingContractMultiplierUnit(true);
        }
        if (this.hasUnderlyingFlowScheduleType()) {
          builder.setUnderlyingFlowScheduleType(this.getUnderlyingFlowScheduleType());
          presenceBuilder.setUnderlyingFlowScheduleType(true);
        }
        if (this.hasUnderlyingUnitOfMeasure()) {
          builder.setUnderlyingUnitOfMeasure(this.getUnderlyingUnitOfMeasure());
          presenceBuilder.setUnderlyingUnitOfMeasure(true);
        }
        if (this.hasUnderlyingUnitOfMeasureQty()) {
          builder.setUnderlyingUnitOfMeasureQty(this.getUnderlyingUnitOfMeasureQty());
          presenceBuilder.setUnderlyingUnitOfMeasureQty(true);
        }
        if (this.hasUnderlyingPriceUnitOfMeasure()) {
          builder.setUnderlyingPriceUnitOfMeasure(this.getUnderlyingPriceUnitOfMeasure());
          presenceBuilder.setUnderlyingPriceUnitOfMeasure(true);
        }
        if (this.hasUnderlyingPriceUnitOfMeasureQty()) {
          builder.setUnderlyingPriceUnitOfMeasureQty(this.getUnderlyingPriceUnitOfMeasureQty());
          presenceBuilder.setUnderlyingPriceUnitOfMeasureQty(true);
        }
        if (this.hasUnderlyingTimeUnit()) {
          builder.setUnderlyingTimeUnit(this.getUnderlyingTimeUnit());
          presenceBuilder.setUnderlyingTimeUnit(true);
        }
        if (this.hasUnderlyingExerciseStyle()) {
          builder.setUnderlyingExerciseStyle(this.getUnderlyingExerciseStyle());
          presenceBuilder.setUnderlyingExerciseStyle(true);
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
        if (this.hasUnderlyingAllocationPercent()) {
          builder.setUnderlyingAllocationPercent(this.getUnderlyingAllocationPercent());
          presenceBuilder.setUnderlyingAllocationPercent(true);
        }
        if (this.hasUnderlyingCurrency()) {
          builder.setUnderlyingCurrency(this.getUnderlyingCurrency());
          presenceBuilder.setUnderlyingCurrency(true);
        }
        if (this.hasUnderlyingQty()) {
          builder.setUnderlyingQty(this.getUnderlyingQty());
          presenceBuilder.setUnderlyingQty(true);
        }
        if (this.hasUnderlyingSettlementType()) {
          builder.setUnderlyingSettlementType(this.getUnderlyingSettlementType());
          presenceBuilder.setUnderlyingSettlementType(true);
        }
        if (this.hasUnderlyingCashAmount()) {
          builder.setUnderlyingCashAmount(this.getUnderlyingCashAmount());
          presenceBuilder.setUnderlyingCashAmount(true);
        }
        if (this.hasUnderlyingCashType()) {
          builder.setUnderlyingCashType(this.getUnderlyingCashType());
          presenceBuilder.setUnderlyingCashType(true);
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
        if (this.hasUnderlyingAdjustedQuantity()) {
          builder.setUnderlyingAdjustedQuantity(this.getUnderlyingAdjustedQuantity());
          presenceBuilder.setUnderlyingAdjustedQuantity(true);
        }
        if (this.hasUnderlyingFxRate()) {
          builder.setUnderlyingFxRate(this.getUnderlyingFxRate());
          presenceBuilder.setUnderlyingFxRate(true);
        }
        if (this.hasUnderlyingFxRateCalc()) {
          builder.setUnderlyingFxRateCalc(this.getUnderlyingFxRateCalc());
          presenceBuilder.setUnderlyingFxRateCalc(true);
        }
        if (this.hasUnderlyingCapValue()) {
          builder.setUnderlyingCapValue(this.getUnderlyingCapValue());
          presenceBuilder.setUnderlyingCapValue(true);
        }
        if (this.hasUnderlyingSettlMethod()) {
          builder.setUnderlyingSettlMethod(this.getUnderlyingSettlMethod());
          presenceBuilder.setUnderlyingSettlMethod(true);
        }
        if (this.hasUnderlyingPutOrCall()) {
          builder.setUnderlyingPutOrCall(this.getUnderlyingPutOrCall());
          presenceBuilder.setUnderlyingPutOrCall(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoRateSources extends quickfix.Group {
      private final quickfix.IntField rateSourceField = FieldFactory.newIntField(1446);
      public boolean hasRateSource() throws quickfix.FieldNotFound {
        return isSetField(1446);
      }
      public int getRateSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(rateSourceField));
      }
      public NoRateSources setRateSource(final int value) {
        setField(FieldValue.to(rateSourceField, value));
        return this;
      }
      public NoRateSources setRateSource(final quickfix.field.RateSource value) {
        setField(FieldValue.to(rateSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField rateSourceTypeField = FieldFactory.newIntField(1447);
      public boolean hasRateSourceType() throws quickfix.FieldNotFound {
        return isSetField(1447);
      }
      public int getRateSourceType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(rateSourceTypeField));
      }
      public NoRateSources setRateSourceType(final int value) {
        setField(FieldValue.to(rateSourceTypeField, value));
        return this;
      }
      public NoRateSources setRateSourceType(final quickfix.field.RateSourceType value) {
        setField(FieldValue.to(rateSourceTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField referencePageField = FieldFactory.newStringField(1448);
      public boolean hasReferencePage() throws quickfix.FieldNotFound {
        return isSetField(1448);
      }
      public String getReferencePage() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(referencePageField));
      }
      public NoRateSources setReferencePage(final String value) {
        setField(FieldValue.to(referencePageField, value));
        return this;
      }
      public NoRateSources setReferencePage(final quickfix.field.ReferencePage value) {
        setField(FieldValue.to(referencePageField, FieldValue.of(value)));
        return this;
      }

      public NoRateSources() {
        super(1445, 1446, new int[] {1446, 1447, 1448, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoRateSources proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoRateSources
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getRateSource()) {
          this.setRateSource(proto.getRateSource());
        }
        if (fieldPresence.getRateSourceType()) {
          this.setRateSourceType(proto.getRateSourceType());
        }
        if (fieldPresence.getReferencePage()) {
          this.setReferencePage(proto.getReferencePage());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoRateSources
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoRateSources
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoRateSources.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoRateSources
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoRateSources
                .FieldPresence.newBuilder();

        if (this.hasRateSource()) {
          builder.setRateSource(this.getRateSource());
          presenceBuilder.setRateSource(true);
        }
        if (this.hasRateSourceType()) {
          builder.setRateSourceType(this.getRateSourceType());
          presenceBuilder.setRateSourceType(true);
        }
        if (this.hasReferencePage()) {
          builder.setReferencePage(this.getReferencePage());
          presenceBuilder.setReferencePage(true);
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoStipulations proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getStipulationType()) {
          this.setStipulationType(proto.getStipulationType());
        }
        if (fieldPresence.getStipulationValue()) {
          this.setStipulationValue(proto.getStipulationValue());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoStipulations
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoStipulations.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoStipulations
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoStipulations
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoLegs.NoLegSecurityAltId proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getLegSecurityAltId()) {
            this.setLegSecurityAltId(proto.getLegSecurityAltId());
          }
          if (fieldPresence.getLegSecurityAltIdSource()) {
            this.setLegSecurityAltIdSource(proto.getLegSecurityAltIdSource());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoLegSecurityAltId.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoLegSecurityAltId.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegSecurityAltId.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoLegs.NoLegStipulations proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getLegStipulationType()) {
            this.setLegStipulationType(proto.getLegStipulationType());
          }
          if (fieldPresence.getLegStipulationValue()) {
            this.setLegStipulationValue(proto.getLegStipulationValue());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoLegStipulations.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoLegStipulations.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoLegStipulations.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
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

          public void fromProto(
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoNestedPartyIds.NoNestedPartySubIds proto) {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.FieldPresence fieldPresence =
                proto.getFieldPresence();

            if (fieldPresence.getNestedPartySubId()) {
              this.setNestedPartySubId(proto.getNestedPartySubId());
            }
            if (fieldPresence.getNestedPartySubIdType()) {
              this.setNestedPartySubIdType(proto.getNestedPartySubIdType());
            }
          }

          public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.NoNestedPartySubIds.Builder
              toBuilder() throws quickfix.FieldNotFound {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.Builder builder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                    .NoNestedPartyIds.NoNestedPartySubIds.newBuilder();
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                .NoNestedPartyIds.NoNestedPartySubIds.FieldPresence.Builder presenceBuilder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoLegs.NoNestedPartyIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
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

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
            .NoNestedPartyIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoNestedPartyIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
              .NoNestedPartyIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                  .NoNestedPartyIds.FieldPresence.newBuilder();

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

      private final quickfix.StringField legMaturityTimeField = FieldFactory.newStringField(1212);
      public boolean hasLegMaturityTime() throws quickfix.FieldNotFound {
        return isSetField(1212);
      }
      public String getLegMaturityTime() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legMaturityTimeField));
      }
      public NoLegs setLegMaturityTime(final String value) {
        setField(FieldValue.to(legMaturityTimeField, value));
        return this;
      }
      public NoLegs setLegMaturityTime(final quickfix.field.LegMaturityTime value) {
        setField(FieldValue.to(legMaturityTimeField, FieldValue.of(value)));
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

      private final quickfix.IntField legContractMultiplierUnitField =
          FieldFactory.newIntField(1436);
      public boolean hasLegContractMultiplierUnit() throws quickfix.FieldNotFound {
        return isSetField(1436);
      }
      public int getLegContractMultiplierUnit() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legContractMultiplierUnitField));
      }
      public NoLegs setLegContractMultiplierUnit(final int value) {
        setField(FieldValue.to(legContractMultiplierUnitField, value));
        return this;
      }
      public NoLegs setLegContractMultiplierUnit(
          final quickfix.field.LegContractMultiplierUnit value) {
        setField(FieldValue.to(legContractMultiplierUnitField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legFlowScheduleTypeField = FieldFactory.newIntField(1440);
      public boolean hasLegFlowScheduleType() throws quickfix.FieldNotFound {
        return isSetField(1440);
      }
      public int getLegFlowScheduleType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legFlowScheduleTypeField));
      }
      public NoLegs setLegFlowScheduleType(final int value) {
        setField(FieldValue.to(legFlowScheduleTypeField, value));
        return this;
      }
      public NoLegs setLegFlowScheduleType(final quickfix.field.LegFlowScheduleType value) {
        setField(FieldValue.to(legFlowScheduleTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legUnitOfMeasureField = FieldFactory.newStringField(999);
      public boolean hasLegUnitOfMeasure() throws quickfix.FieldNotFound {
        return isSetField(999);
      }
      public String getLegUnitOfMeasure() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legUnitOfMeasureField));
      }
      public NoLegs setLegUnitOfMeasure(final String value) {
        setField(FieldValue.to(legUnitOfMeasureField, value));
        return this;
      }
      public NoLegs setLegUnitOfMeasure(final quickfix.field.LegUnitOfMeasure value) {
        setField(FieldValue.to(legUnitOfMeasureField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legUnitOfMeasureQtyField =
          FieldFactory.newDoubleField(1224);
      public boolean hasLegUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return isSetField(1224);
      }
      public double getLegUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legUnitOfMeasureQtyField));
      }
      public NoLegs setLegUnitOfMeasureQty(final double value) {
        setField(FieldValue.to(legUnitOfMeasureQtyField, value));
        return this;
      }
      public NoLegs setLegUnitOfMeasureQty(final quickfix.field.LegUnitOfMeasureQty value) {
        setField(FieldValue.to(legUnitOfMeasureQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legPriceUnitOfMeasureField =
          FieldFactory.newStringField(1421);
      public boolean hasLegPriceUnitOfMeasure() throws quickfix.FieldNotFound {
        return isSetField(1421);
      }
      public String getLegPriceUnitOfMeasure() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legPriceUnitOfMeasureField));
      }
      public NoLegs setLegPriceUnitOfMeasure(final String value) {
        setField(FieldValue.to(legPriceUnitOfMeasureField, value));
        return this;
      }
      public NoLegs setLegPriceUnitOfMeasure(final quickfix.field.LegPriceUnitOfMeasure value) {
        setField(FieldValue.to(legPriceUnitOfMeasureField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legPriceUnitOfMeasureQtyField =
          FieldFactory.newDoubleField(1422);
      public boolean hasLegPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return isSetField(1422);
      }
      public double getLegPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legPriceUnitOfMeasureQtyField));
      }
      public NoLegs setLegPriceUnitOfMeasureQty(final double value) {
        setField(FieldValue.to(legPriceUnitOfMeasureQtyField, value));
        return this;
      }
      public NoLegs setLegPriceUnitOfMeasureQty(
          final quickfix.field.LegPriceUnitOfMeasureQty value) {
        setField(FieldValue.to(legPriceUnitOfMeasureQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legTimeUnitField = FieldFactory.newStringField(1001);
      public boolean hasLegTimeUnit() throws quickfix.FieldNotFound {
        return isSetField(1001);
      }
      public String getLegTimeUnit() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legTimeUnitField));
      }
      public NoLegs setLegTimeUnit(final String value) {
        setField(FieldValue.to(legTimeUnitField, value));
        return this;
      }
      public NoLegs setLegTimeUnit(final quickfix.field.LegTimeUnit value) {
        setField(FieldValue.to(legTimeUnitField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField legExerciseStyleField = FieldFactory.newIntField(1420);
      public boolean hasLegExerciseStyle() throws quickfix.FieldNotFound {
        return isSetField(1420);
      }
      public int getLegExerciseStyle() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legExerciseStyleField));
      }
      public NoLegs setLegExerciseStyle(final int value) {
        setField(FieldValue.to(legExerciseStyleField, value));
        return this;
      }
      public NoLegs setLegExerciseStyle(final quickfix.field.LegExerciseStyle value) {
        setField(FieldValue.to(legExerciseStyleField, FieldValue.of(value)));
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

      private final quickfix.IntField legPutOrCallField = FieldFactory.newIntField(1358);
      public boolean hasLegPutOrCall() throws quickfix.FieldNotFound {
        return isSetField(1358);
      }
      public int getLegPutOrCall() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legPutOrCallField));
      }
      public NoLegs setLegPutOrCall(final int value) {
        setField(FieldValue.to(legPutOrCallField, value));
        return this;
      }
      public NoLegs setLegPutOrCall(final quickfix.field.LegPutOrCall value) {
        setField(FieldValue.to(legPutOrCallField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legOptionRatioField = FieldFactory.newDoubleField(1017);
      public boolean hasLegOptionRatio() throws quickfix.FieldNotFound {
        return isSetField(1017);
      }
      public double getLegOptionRatio() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legOptionRatioField));
      }
      public NoLegs setLegOptionRatio(final double value) {
        setField(FieldValue.to(legOptionRatioField, value));
        return this;
      }
      public NoLegs setLegOptionRatio(final quickfix.field.LegOptionRatio value) {
        setField(FieldValue.to(legOptionRatioField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legPriceField = FieldFactory.newDoubleField(566);
      public boolean hasLegPrice() throws quickfix.FieldNotFound {
        return isSetField(566);
      }
      public double getLegPrice() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legPriceField));
      }
      public NoLegs setLegPrice(final double value) {
        setField(FieldValue.to(legPriceField, value));
        return this;
      }
      public NoLegs setLegPrice(final quickfix.field.LegPrice value) {
        setField(FieldValue.to(legPriceField, FieldValue.of(value)));
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

      private final quickfix.DoubleField legOrderQtyField = FieldFactory.newDoubleField(685);
      public boolean hasLegOrderQty() throws quickfix.FieldNotFound {
        return isSetField(685);
      }
      public double getLegOrderQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legOrderQtyField));
      }
      public NoLegs setLegOrderQty(final double value) {
        setField(FieldValue.to(legOrderQtyField, value));
        return this;
      }
      public NoLegs setLegOrderQty(final quickfix.field.LegOrderQty value) {
        setField(FieldValue.to(legOrderQtyField, FieldValue.of(value)));
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

      private final quickfix.StringField legRefIdField = FieldFactory.newStringField(654);
      public boolean hasLegRefId() throws quickfix.FieldNotFound {
        return isSetField(654);
      }
      public String getLegRefId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legRefIdField));
      }
      public NoLegs setLegRefId(final String value) {
        setField(FieldValue.to(legRefIdField, value));
        return this;
      }
      public NoLegs setLegRefId(final quickfix.field.LegRefID value) {
        setField(FieldValue.to(legRefIdField, FieldValue.of(value)));
        return this;
      }

      public NoLegs() {
        super(555, 600,
            new int[] {600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251,
                252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 1436, 1440, 999, 1224,
                1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740,
                739, 955, 956, 1358, 1017, 566, 687, 685, 690, 587, 588, 676, 677, 678, 679, 680,
                654, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
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
        if (fieldPresence.getLegMaturityTime()) {
          this.setLegMaturityTime(proto.getLegMaturityTime());
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
        if (fieldPresence.getLegContractMultiplierUnit()) {
          this.setLegContractMultiplierUnit(proto.getLegContractMultiplierUnit());
        }
        if (fieldPresence.getLegFlowScheduleType()) {
          this.setLegFlowScheduleType(proto.getLegFlowScheduleType());
        }
        if (fieldPresence.getLegUnitOfMeasure()) {
          this.setLegUnitOfMeasure(proto.getLegUnitOfMeasure());
        }
        if (fieldPresence.getLegUnitOfMeasureQty()) {
          this.setLegUnitOfMeasureQty(proto.getLegUnitOfMeasureQty());
        }
        if (fieldPresence.getLegPriceUnitOfMeasure()) {
          this.setLegPriceUnitOfMeasure(proto.getLegPriceUnitOfMeasure());
        }
        if (fieldPresence.getLegPriceUnitOfMeasureQty()) {
          this.setLegPriceUnitOfMeasureQty(proto.getLegPriceUnitOfMeasureQty());
        }
        if (fieldPresence.getLegTimeUnit()) {
          this.setLegTimeUnit(proto.getLegTimeUnit());
        }
        if (fieldPresence.getLegExerciseStyle()) {
          this.setLegExerciseStyle(proto.getLegExerciseStyle());
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
        if (fieldPresence.getLegPutOrCall()) {
          this.setLegPutOrCall(proto.getLegPutOrCall());
        }
        if (fieldPresence.getLegOptionRatio()) {
          this.setLegOptionRatio(proto.getLegOptionRatio());
        }
        if (fieldPresence.getLegPrice()) {
          this.setLegPrice(proto.getLegPrice());
        }
        if (fieldPresence.getLegQty()) {
          this.setLegQty(proto.getLegQty());
        }
        if (fieldPresence.getLegOrderQty()) {
          this.setLegOrderQty(proto.getLegOrderQty());
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
        if (fieldPresence.getLegRefId()) {
          this.setLegRefId(proto.getLegRefId());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoLegs.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoLegs
                .FieldPresence.newBuilder();

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
        if (this.hasLegMaturityTime()) {
          builder.setLegMaturityTime(this.getLegMaturityTime());
          presenceBuilder.setLegMaturityTime(true);
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
        if (this.hasLegContractMultiplierUnit()) {
          builder.setLegContractMultiplierUnit(this.getLegContractMultiplierUnit());
          presenceBuilder.setLegContractMultiplierUnit(true);
        }
        if (this.hasLegFlowScheduleType()) {
          builder.setLegFlowScheduleType(this.getLegFlowScheduleType());
          presenceBuilder.setLegFlowScheduleType(true);
        }
        if (this.hasLegUnitOfMeasure()) {
          builder.setLegUnitOfMeasure(this.getLegUnitOfMeasure());
          presenceBuilder.setLegUnitOfMeasure(true);
        }
        if (this.hasLegUnitOfMeasureQty()) {
          builder.setLegUnitOfMeasureQty(this.getLegUnitOfMeasureQty());
          presenceBuilder.setLegUnitOfMeasureQty(true);
        }
        if (this.hasLegPriceUnitOfMeasure()) {
          builder.setLegPriceUnitOfMeasure(this.getLegPriceUnitOfMeasure());
          presenceBuilder.setLegPriceUnitOfMeasure(true);
        }
        if (this.hasLegPriceUnitOfMeasureQty()) {
          builder.setLegPriceUnitOfMeasureQty(this.getLegPriceUnitOfMeasureQty());
          presenceBuilder.setLegPriceUnitOfMeasureQty(true);
        }
        if (this.hasLegTimeUnit()) {
          builder.setLegTimeUnit(this.getLegTimeUnit());
          presenceBuilder.setLegTimeUnit(true);
        }
        if (this.hasLegExerciseStyle()) {
          builder.setLegExerciseStyle(this.getLegExerciseStyle());
          presenceBuilder.setLegExerciseStyle(true);
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
        if (this.hasLegPutOrCall()) {
          builder.setLegPutOrCall(this.getLegPutOrCall());
          presenceBuilder.setLegPutOrCall(true);
        }
        if (this.hasLegOptionRatio()) {
          builder.setLegOptionRatio(this.getLegOptionRatio());
          presenceBuilder.setLegOptionRatio(true);
        }
        if (this.hasLegPrice()) {
          builder.setLegPrice(this.getLegPrice());
          presenceBuilder.setLegPrice(true);
        }
        if (this.hasLegQty()) {
          builder.setLegQty(this.getLegQty());
          presenceBuilder.setLegQty(true);
        }
        if (this.hasLegOrderQty()) {
          builder.setLegOrderQty(this.getLegOrderQty());
          presenceBuilder.setLegOrderQty(true);
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
        if (this.hasLegRefId()) {
          builder.setLegRefId(this.getLegRefId());
          presenceBuilder.setLegRefId(true);
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoQuoteQualifiers proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getQuoteQualifier()) {
          this.setQuoteQualifier(proto.getQuoteQualifier());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoQuoteQualifiers.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoQuoteQualifiers
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                  .NoRelatedSym.NoPartyIds.NoPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getPartySubId()) {
            this.setPartySubId(proto.getPartySubId());
          }
          if (fieldPresence.getPartySubIdType()) {
            this.setPartySubIdType(proto.getPartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .NoPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
                  .NoPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
              .NoPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                .NoRelatedSym.NoPartyIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
                                   .NoPartyIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.NoPartyIds
                .FieldPresence.newBuilder();

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

    private final quickfix.StringField productComplexField = FieldFactory.newStringField(1227);
    public boolean hasProductComplex() throws quickfix.FieldNotFound {
      return isSetField(1227);
    }
    public String getProductComplex() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(productComplexField));
    }
    public NoRelatedSym setProductComplex(final String value) {
      setField(FieldValue.to(productComplexField, value));
      return this;
    }
    public NoRelatedSym setProductComplex(final quickfix.field.ProductComplex value) {
      setField(FieldValue.to(productComplexField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField securityGroupField = FieldFactory.newStringField(1151);
    public boolean hasSecurityGroup() throws quickfix.FieldNotFound {
      return isSetField(1151);
    }
    public String getSecurityGroup() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityGroupField));
    }
    public NoRelatedSym setSecurityGroup(final String value) {
      setField(FieldValue.to(securityGroupField, value));
      return this;
    }
    public NoRelatedSym setSecurityGroup(final quickfix.field.SecurityGroup value) {
      setField(FieldValue.to(securityGroupField, FieldValue.of(value)));
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

    private final quickfix.StringField maturityTimeField = FieldFactory.newStringField(1079);
    public boolean hasMaturityTime() throws quickfix.FieldNotFound {
      return isSetField(1079);
    }
    public String getMaturityTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(maturityTimeField));
    }
    public NoRelatedSym setMaturityTime(final String value) {
      setField(FieldValue.to(maturityTimeField, value));
      return this;
    }
    public NoRelatedSym setMaturityTime(final quickfix.field.MaturityTime value) {
      setField(FieldValue.to(maturityTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField settleOnOpenFlagField = FieldFactory.newStringField(966);
    public boolean hasSettleOnOpenFlag() throws quickfix.FieldNotFound {
      return isSetField(966);
    }
    public String getSettleOnOpenFlag() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settleOnOpenFlagField));
    }
    public NoRelatedSym setSettleOnOpenFlag(final String value) {
      setField(FieldValue.to(settleOnOpenFlagField, value));
      return this;
    }
    public NoRelatedSym setSettleOnOpenFlag(final quickfix.field.SettleOnOpenFlag value) {
      setField(FieldValue.to(settleOnOpenFlagField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField instrmtAssignmentMethodField = FieldFactory.newCharField(1049);
    public boolean hasInstrmtAssignmentMethod() throws quickfix.FieldNotFound {
      return isSetField(1049);
    }
    public int getInstrmtAssignmentMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(instrmtAssignmentMethodField));
    }
    public NoRelatedSym setInstrmtAssignmentMethod(final int value) {
      setField(FieldValue.to(instrmtAssignmentMethodField, value));
      return this;
    }
    public NoRelatedSym setInstrmtAssignmentMethod(final char value) {
      setField(FieldValue.to(instrmtAssignmentMethodField, value));
      return this;
    }
    public NoRelatedSym setInstrmtAssignmentMethod(final String value) {
      setField(FieldValue.to(instrmtAssignmentMethodField, value));
      return this;
    }
    public NoRelatedSym setInstrmtAssignmentMethod(
        final quickfix.field.InstrmtAssignmentMethod value) {
      setField(FieldValue.to(instrmtAssignmentMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField securityStatusField = FieldFactory.newStringField(965);
    public boolean hasSecurityStatus() throws quickfix.FieldNotFound {
      return isSetField(965);
    }
    public String getSecurityStatus() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityStatusField));
    }
    public NoRelatedSym setSecurityStatus(final String value) {
      setField(FieldValue.to(securityStatusField, value));
      return this;
    }
    public NoRelatedSym setSecurityStatus(final quickfix.field.SecurityStatus value) {
      setField(FieldValue.to(securityStatusField, FieldValue.of(value)));
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

    private final quickfix.StringField restructuringTypeField = FieldFactory.newStringField(1449);
    public boolean hasRestructuringType() throws quickfix.FieldNotFound {
      return isSetField(1449);
    }
    public String getRestructuringType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(restructuringTypeField));
    }
    public NoRelatedSym setRestructuringType(final String value) {
      setField(FieldValue.to(restructuringTypeField, value));
      return this;
    }
    public NoRelatedSym setRestructuringType(final quickfix.field.RestructuringType value) {
      setField(FieldValue.to(restructuringTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField seniorityField = FieldFactory.newStringField(1450);
    public boolean hasSeniority() throws quickfix.FieldNotFound {
      return isSetField(1450);
    }
    public String getSeniority() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(seniorityField));
    }
    public NoRelatedSym setSeniority(final String value) {
      setField(FieldValue.to(seniorityField, value));
      return this;
    }
    public NoRelatedSym setSeniority(final quickfix.field.Seniority value) {
      setField(FieldValue.to(seniorityField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField notionalPercentageOutstandingField =
        FieldFactory.newDoubleField(1451);
    public boolean hasNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
      return isSetField(1451);
    }
    public double getNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(notionalPercentageOutstandingField));
    }
    public NoRelatedSym setNotionalPercentageOutstanding(final double value) {
      setField(FieldValue.to(notionalPercentageOutstandingField, value));
      return this;
    }
    public NoRelatedSym setNotionalPercentageOutstanding(
        final quickfix.field.NotionalPercentageOutstanding value) {
      setField(FieldValue.to(notionalPercentageOutstandingField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField originalNotionalPercentageOutstandingField =
        FieldFactory.newDoubleField(1452);
    public boolean hasOriginalNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
      return isSetField(1452);
    }
    public double getOriginalNotionalPercentageOutstanding() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(originalNotionalPercentageOutstandingField));
    }
    public NoRelatedSym setOriginalNotionalPercentageOutstanding(final double value) {
      setField(FieldValue.to(originalNotionalPercentageOutstandingField, value));
      return this;
    }
    public NoRelatedSym setOriginalNotionalPercentageOutstanding(
        final quickfix.field.OriginalNotionalPercentageOutstanding value) {
      setField(FieldValue.to(originalNotionalPercentageOutstandingField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField attachmentPointField = FieldFactory.newDoubleField(1457);
    public boolean hasAttachmentPoint() throws quickfix.FieldNotFound {
      return isSetField(1457);
    }
    public double getAttachmentPoint() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(attachmentPointField));
    }
    public NoRelatedSym setAttachmentPoint(final double value) {
      setField(FieldValue.to(attachmentPointField, value));
      return this;
    }
    public NoRelatedSym setAttachmentPoint(final quickfix.field.AttachmentPoint value) {
      setField(FieldValue.to(attachmentPointField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField detachmentPointField = FieldFactory.newDoubleField(1458);
    public boolean hasDetachmentPoint() throws quickfix.FieldNotFound {
      return isSetField(1458);
    }
    public double getDetachmentPoint() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(detachmentPointField));
    }
    public NoRelatedSym setDetachmentPoint(final double value) {
      setField(FieldValue.to(detachmentPointField, value));
      return this;
    }
    public NoRelatedSym setDetachmentPoint(final quickfix.field.DetachmentPoint value) {
      setField(FieldValue.to(detachmentPointField, FieldValue.of(value)));
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

    private final quickfix.DoubleField strikeMultiplierField = FieldFactory.newDoubleField(967);
    public boolean hasStrikeMultiplier() throws quickfix.FieldNotFound {
      return isSetField(967);
    }
    public double getStrikeMultiplier() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikeMultiplierField));
    }
    public NoRelatedSym setStrikeMultiplier(final double value) {
      setField(FieldValue.to(strikeMultiplierField, value));
      return this;
    }
    public NoRelatedSym setStrikeMultiplier(final quickfix.field.StrikeMultiplier value) {
      setField(FieldValue.to(strikeMultiplierField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField strikeValueField = FieldFactory.newDoubleField(968);
    public boolean hasStrikeValue() throws quickfix.FieldNotFound {
      return isSetField(968);
    }
    public double getStrikeValue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikeValueField));
    }
    public NoRelatedSym setStrikeValue(final double value) {
      setField(FieldValue.to(strikeValueField, value));
      return this;
    }
    public NoRelatedSym setStrikeValue(final quickfix.field.StrikeValue value) {
      setField(FieldValue.to(strikeValueField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField strikePriceDeterminationMethodField =
        FieldFactory.newIntField(1478);
    public boolean hasStrikePriceDeterminationMethod() throws quickfix.FieldNotFound {
      return isSetField(1478);
    }
    public int getStrikePriceDeterminationMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikePriceDeterminationMethodField));
    }
    public NoRelatedSym setStrikePriceDeterminationMethod(final int value) {
      setField(FieldValue.to(strikePriceDeterminationMethodField, value));
      return this;
    }
    public NoRelatedSym setStrikePriceDeterminationMethod(
        final quickfix.field.StrikePriceDeterminationMethod value) {
      setField(FieldValue.to(strikePriceDeterminationMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField strikePriceBoundaryMethodField = FieldFactory.newIntField(1479);
    public boolean hasStrikePriceBoundaryMethod() throws quickfix.FieldNotFound {
      return isSetField(1479);
    }
    public int getStrikePriceBoundaryMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikePriceBoundaryMethodField));
    }
    public NoRelatedSym setStrikePriceBoundaryMethod(final int value) {
      setField(FieldValue.to(strikePriceBoundaryMethodField, value));
      return this;
    }
    public NoRelatedSym setStrikePriceBoundaryMethod(
        final quickfix.field.StrikePriceBoundaryMethod value) {
      setField(FieldValue.to(strikePriceBoundaryMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField strikePriceBoundaryPrecisionField =
        FieldFactory.newDoubleField(1480);
    public boolean hasStrikePriceBoundaryPrecision() throws quickfix.FieldNotFound {
      return isSetField(1480);
    }
    public double getStrikePriceBoundaryPrecision() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strikePriceBoundaryPrecisionField));
    }
    public NoRelatedSym setStrikePriceBoundaryPrecision(final double value) {
      setField(FieldValue.to(strikePriceBoundaryPrecisionField, value));
      return this;
    }
    public NoRelatedSym setStrikePriceBoundaryPrecision(
        final quickfix.field.StrikePriceBoundaryPrecision value) {
      setField(FieldValue.to(strikePriceBoundaryPrecisionField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField underlyingPriceDeterminationMethodField =
        FieldFactory.newIntField(1481);
    public boolean hasUnderlyingPriceDeterminationMethod() throws quickfix.FieldNotFound {
      return isSetField(1481);
    }
    public int getUnderlyingPriceDeterminationMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(underlyingPriceDeterminationMethodField));
    }
    public NoRelatedSym setUnderlyingPriceDeterminationMethod(final int value) {
      setField(FieldValue.to(underlyingPriceDeterminationMethodField, value));
      return this;
    }
    public NoRelatedSym setUnderlyingPriceDeterminationMethod(
        final quickfix.field.UnderlyingPriceDeterminationMethod value) {
      setField(FieldValue.to(underlyingPriceDeterminationMethodField, FieldValue.of(value)));
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

    private final quickfix.IntField contractMultiplierUnitField = FieldFactory.newIntField(1435);
    public boolean hasContractMultiplierUnit() throws quickfix.FieldNotFound {
      return isSetField(1435);
    }
    public int getContractMultiplierUnit() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contractMultiplierUnitField));
    }
    public NoRelatedSym setContractMultiplierUnit(final int value) {
      setField(FieldValue.to(contractMultiplierUnitField, value));
      return this;
    }
    public NoRelatedSym setContractMultiplierUnit(
        final quickfix.field.ContractMultiplierUnit value) {
      setField(FieldValue.to(contractMultiplierUnitField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField flowScheduleTypeField = FieldFactory.newIntField(1439);
    public boolean hasFlowScheduleType() throws quickfix.FieldNotFound {
      return isSetField(1439);
    }
    public int getFlowScheduleType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(flowScheduleTypeField));
    }
    public NoRelatedSym setFlowScheduleType(final int value) {
      setField(FieldValue.to(flowScheduleTypeField, value));
      return this;
    }
    public NoRelatedSym setFlowScheduleType(final quickfix.field.FlowScheduleType value) {
      setField(FieldValue.to(flowScheduleTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField minPriceIncrementField = FieldFactory.newDoubleField(969);
    public boolean hasMinPriceIncrement() throws quickfix.FieldNotFound {
      return isSetField(969);
    }
    public double getMinPriceIncrement() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(minPriceIncrementField));
    }
    public NoRelatedSym setMinPriceIncrement(final double value) {
      setField(FieldValue.to(minPriceIncrementField, value));
      return this;
    }
    public NoRelatedSym setMinPriceIncrement(final quickfix.field.MinPriceIncrement value) {
      setField(FieldValue.to(minPriceIncrementField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField minPriceIncrementAmountField =
        FieldFactory.newDoubleField(1146);
    public boolean hasMinPriceIncrementAmount() throws quickfix.FieldNotFound {
      return isSetField(1146);
    }
    public double getMinPriceIncrementAmount() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(minPriceIncrementAmountField));
    }
    public NoRelatedSym setMinPriceIncrementAmount(final double value) {
      setField(FieldValue.to(minPriceIncrementAmountField, value));
      return this;
    }
    public NoRelatedSym setMinPriceIncrementAmount(
        final quickfix.field.MinPriceIncrementAmount value) {
      setField(FieldValue.to(minPriceIncrementAmountField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField unitOfMeasureField = FieldFactory.newStringField(996);
    public boolean hasUnitOfMeasure() throws quickfix.FieldNotFound {
      return isSetField(996);
    }
    public String getUnitOfMeasure() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(unitOfMeasureField));
    }
    public NoRelatedSym setUnitOfMeasure(final String value) {
      setField(FieldValue.to(unitOfMeasureField, value));
      return this;
    }
    public NoRelatedSym setUnitOfMeasure(final quickfix.field.UnitOfMeasure value) {
      setField(FieldValue.to(unitOfMeasureField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField unitOfMeasureQtyField = FieldFactory.newDoubleField(1147);
    public boolean hasUnitOfMeasureQty() throws quickfix.FieldNotFound {
      return isSetField(1147);
    }
    public double getUnitOfMeasureQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(unitOfMeasureQtyField));
    }
    public NoRelatedSym setUnitOfMeasureQty(final double value) {
      setField(FieldValue.to(unitOfMeasureQtyField, value));
      return this;
    }
    public NoRelatedSym setUnitOfMeasureQty(final quickfix.field.UnitOfMeasureQty value) {
      setField(FieldValue.to(unitOfMeasureQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField priceUnitOfMeasureField = FieldFactory.newStringField(1191);
    public boolean hasPriceUnitOfMeasure() throws quickfix.FieldNotFound {
      return isSetField(1191);
    }
    public String getPriceUnitOfMeasure() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceUnitOfMeasureField));
    }
    public NoRelatedSym setPriceUnitOfMeasure(final String value) {
      setField(FieldValue.to(priceUnitOfMeasureField, value));
      return this;
    }
    public NoRelatedSym setPriceUnitOfMeasure(final quickfix.field.PriceUnitOfMeasure value) {
      setField(FieldValue.to(priceUnitOfMeasureField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField priceUnitOfMeasureQtyField =
        FieldFactory.newDoubleField(1192);
    public boolean hasPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
      return isSetField(1192);
    }
    public double getPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceUnitOfMeasureQtyField));
    }
    public NoRelatedSym setPriceUnitOfMeasureQty(final double value) {
      setField(FieldValue.to(priceUnitOfMeasureQtyField, value));
      return this;
    }
    public NoRelatedSym setPriceUnitOfMeasureQty(final quickfix.field.PriceUnitOfMeasureQty value) {
      setField(FieldValue.to(priceUnitOfMeasureQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField settlMethodField = FieldFactory.newCharField(1193);
    public boolean hasSettlMethod() throws quickfix.FieldNotFound {
      return isSetField(1193);
    }
    public int getSettlMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlMethodField));
    }
    public NoRelatedSym setSettlMethod(final int value) {
      setField(FieldValue.to(settlMethodField, value));
      return this;
    }
    public NoRelatedSym setSettlMethod(final char value) {
      setField(FieldValue.to(settlMethodField, value));
      return this;
    }
    public NoRelatedSym setSettlMethod(final String value) {
      setField(FieldValue.to(settlMethodField, value));
      return this;
    }
    public NoRelatedSym setSettlMethod(final quickfix.field.SettlMethod value) {
      setField(FieldValue.to(settlMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField exerciseStyleField = FieldFactory.newIntField(1194);
    public boolean hasExerciseStyle() throws quickfix.FieldNotFound {
      return isSetField(1194);
    }
    public int getExerciseStyle() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(exerciseStyleField));
    }
    public NoRelatedSym setExerciseStyle(final int value) {
      setField(FieldValue.to(exerciseStyleField, value));
      return this;
    }
    public NoRelatedSym setExerciseStyle(final quickfix.field.ExerciseStyle value) {
      setField(FieldValue.to(exerciseStyleField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField optPayoutTypeField = FieldFactory.newIntField(1482);
    public boolean hasOptPayoutType() throws quickfix.FieldNotFound {
      return isSetField(1482);
    }
    public int getOptPayoutType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(optPayoutTypeField));
    }
    public NoRelatedSym setOptPayoutType(final int value) {
      setField(FieldValue.to(optPayoutTypeField, value));
      return this;
    }
    public NoRelatedSym setOptPayoutType(final quickfix.field.OptPayoutType value) {
      setField(FieldValue.to(optPayoutTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField optPayoutAmountField = FieldFactory.newDoubleField(1195);
    public boolean hasOptPayoutAmount() throws quickfix.FieldNotFound {
      return isSetField(1195);
    }
    public double getOptPayoutAmount() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(optPayoutAmountField));
    }
    public NoRelatedSym setOptPayoutAmount(final double value) {
      setField(FieldValue.to(optPayoutAmountField, value));
      return this;
    }
    public NoRelatedSym setOptPayoutAmount(final quickfix.field.OptPayoutAmount value) {
      setField(FieldValue.to(optPayoutAmountField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField priceQuoteMethodField = FieldFactory.newStringField(1196);
    public boolean hasPriceQuoteMethod() throws quickfix.FieldNotFound {
      return isSetField(1196);
    }
    public String getPriceQuoteMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceQuoteMethodField));
    }
    public NoRelatedSym setPriceQuoteMethod(final String value) {
      setField(FieldValue.to(priceQuoteMethodField, value));
      return this;
    }
    public NoRelatedSym setPriceQuoteMethod(final quickfix.field.PriceQuoteMethod value) {
      setField(FieldValue.to(priceQuoteMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField valuationMethodField = FieldFactory.newStringField(1197);
    public boolean hasValuationMethod() throws quickfix.FieldNotFound {
      return isSetField(1197);
    }
    public String getValuationMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(valuationMethodField));
    }
    public NoRelatedSym setValuationMethod(final String value) {
      setField(FieldValue.to(valuationMethodField, value));
      return this;
    }
    public NoRelatedSym setValuationMethod(final quickfix.field.ValuationMethod value) {
      setField(FieldValue.to(valuationMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField listMethodField = FieldFactory.newIntField(1198);
    public boolean hasListMethod() throws quickfix.FieldNotFound {
      return isSetField(1198);
    }
    public int getListMethod() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(listMethodField));
    }
    public NoRelatedSym setListMethod(final int value) {
      setField(FieldValue.to(listMethodField, value));
      return this;
    }
    public NoRelatedSym setListMethod(final quickfix.field.ListMethod value) {
      setField(FieldValue.to(listMethodField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField capPriceField = FieldFactory.newDoubleField(1199);
    public boolean hasCapPrice() throws quickfix.FieldNotFound {
      return isSetField(1199);
    }
    public double getCapPrice() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(capPriceField));
    }
    public NoRelatedSym setCapPrice(final double value) {
      setField(FieldValue.to(capPriceField, value));
      return this;
    }
    public NoRelatedSym setCapPrice(final quickfix.field.CapPrice value) {
      setField(FieldValue.to(capPriceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField floorPriceField = FieldFactory.newDoubleField(1200);
    public boolean hasFloorPrice() throws quickfix.FieldNotFound {
      return isSetField(1200);
    }
    public double getFloorPrice() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(floorPriceField));
    }
    public NoRelatedSym setFloorPrice(final double value) {
      setField(FieldValue.to(floorPriceField, value));
      return this;
    }
    public NoRelatedSym setFloorPrice(final quickfix.field.FloorPrice value) {
      setField(FieldValue.to(floorPriceField, FieldValue.of(value)));
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

    private final quickfix.BooleanField flexibleIndicatorField = FieldFactory.newBooleanField(1244);
    public boolean hasFlexibleIndicator() throws quickfix.FieldNotFound {
      return isSetField(1244);
    }
    public boolean getFlexibleIndicator() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(flexibleIndicatorField));
    }
    public NoRelatedSym setFlexibleIndicator(final boolean value) {
      setField(FieldValue.to(flexibleIndicatorField, value));
      return this;
    }
    public NoRelatedSym setFlexibleIndicator(final quickfix.field.FlexibleIndicator value) {
      setField(FieldValue.to(flexibleIndicatorField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.BooleanField flexProductEligibilityIndicatorField =
        FieldFactory.newBooleanField(1242);
    public boolean hasFlexProductEligibilityIndicator() throws quickfix.FieldNotFound {
      return isSetField(1242);
    }
    public boolean getFlexProductEligibilityIndicator() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(flexProductEligibilityIndicatorField));
    }
    public NoRelatedSym setFlexProductEligibilityIndicator(final boolean value) {
      setField(FieldValue.to(flexProductEligibilityIndicatorField, value));
      return this;
    }
    public NoRelatedSym setFlexProductEligibilityIndicator(
        final quickfix.field.FlexProductEligibilityIndicator value) {
      setField(FieldValue.to(flexProductEligibilityIndicatorField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField timeUnitField = FieldFactory.newStringField(997);
    public boolean hasTimeUnit() throws quickfix.FieldNotFound {
      return isSetField(997);
    }
    public String getTimeUnit() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(timeUnitField));
    }
    public NoRelatedSym setTimeUnit(final String value) {
      setField(FieldValue.to(timeUnitField, value));
      return this;
    }
    public NoRelatedSym setTimeUnit(final quickfix.field.TimeUnit value) {
      setField(FieldValue.to(timeUnitField, FieldValue.of(value)));
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

    private final quickfix.IntField positionLimitField = FieldFactory.newIntField(970);
    public boolean hasPositionLimit() throws quickfix.FieldNotFound {
      return isSetField(970);
    }
    public int getPositionLimit() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(positionLimitField));
    }
    public NoRelatedSym setPositionLimit(final int value) {
      setField(FieldValue.to(positionLimitField, value));
      return this;
    }
    public NoRelatedSym setPositionLimit(final quickfix.field.PositionLimit value) {
      setField(FieldValue.to(positionLimitField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField ntPositionLimitField = FieldFactory.newIntField(971);
    public boolean hasNtPositionLimit() throws quickfix.FieldNotFound {
      return isSetField(971);
    }
    public int getNtPositionLimit() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(ntPositionLimitField));
    }
    public NoRelatedSym setNtPositionLimit(final int value) {
      setField(FieldValue.to(ntPositionLimitField, value));
      return this;
    }
    public NoRelatedSym setNtPositionLimit(final quickfix.field.NTPositionLimit value) {
      setField(FieldValue.to(ntPositionLimitField, FieldValue.of(value)));
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

    private final quickfix.IntField securityXmlLenField = FieldFactory.newIntField(1184);
    public boolean hasSecurityXmlLen() throws quickfix.FieldNotFound {
      return isSetField(1184);
    }
    public int getSecurityXmlLen() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityXmlLenField));
    }
    public NoRelatedSym setSecurityXmlLen(final int value) {
      setField(FieldValue.to(securityXmlLenField, value));
      return this;
    }
    public NoRelatedSym setSecurityXmlLen(final quickfix.field.SecurityXMLLen value) {
      setField(FieldValue.to(securityXmlLenField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField securityXmlDataField = FieldFactory.newStringField(1185);
    public boolean hasSecurityXmlData() throws quickfix.FieldNotFound {
      return isSetField(1185);
    }
    public String getSecurityXmlData() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityXmlDataField));
    }
    public NoRelatedSym setSecurityXmlData(final String value) {
      setField(FieldValue.to(securityXmlDataField, value));
      return this;
    }
    public NoRelatedSym setSecurityXmlData(final quickfix.field.SecurityXMLData value) {
      setField(FieldValue.to(securityXmlDataField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField securityXmlSchemaField = FieldFactory.newStringField(1186);
    public boolean hasSecurityXmlSchema() throws quickfix.FieldNotFound {
      return isSetField(1186);
    }
    public String getSecurityXmlSchema() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityXmlSchemaField));
    }
    public NoRelatedSym setSecurityXmlSchema(final String value) {
      setField(FieldValue.to(securityXmlSchemaField, value));
      return this;
    }
    public NoRelatedSym setSecurityXmlSchema(final quickfix.field.SecurityXMLSchema value) {
      setField(FieldValue.to(securityXmlSchemaField, FieldValue.of(value)));
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

    private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
    public boolean hasMinQty() throws quickfix.FieldNotFound {
      return isSetField(110);
    }
    public double getMinQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(minQtyField));
    }
    public NoRelatedSym setMinQty(final double value) {
      setField(FieldValue.to(minQtyField, value));
      return this;
    }
    public NoRelatedSym setMinQty(final quickfix.field.MinQty value) {
      setField(FieldValue.to(minQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField settlTypeField = FieldFactory.newStringField(63);
    public boolean hasSettlType() throws quickfix.FieldNotFound {
      return isSetField(63);
    }
    public String getSettlType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlTypeField));
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

    private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
    public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
      return isSetField(120);
    }
    public String getSettlCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlCurrencyField));
    }
    public NoRelatedSym setSettlCurrency(final String value) {
      setField(FieldValue.to(settlCurrencyField, value));
      return this;
    }
    public NoRelatedSym setSettlCurrency(final quickfix.field.SettlCurrency value) {
      setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
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
          new int[] {55, 65, 48, 22, 460, 1227, 1151, 461, 167, 762, 200, 541, 1079, 966, 1049, 965,
              224, 1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227, 228, 255, 543, 470, 471,
              472, 240, 202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231, 1435, 1439, 969, 1146,
              996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198, 1199, 1200, 201,
              1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350, 351, 1184, 1185, 1186,
              691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898, 140, 303,
              537, 336, 625, 229, 54, 854, 38, 152, 516, 468, 469, 110, 63, 64, 193, 192, 15, 120,
              1, 660, 581, 692, 40, 62, 126, 60, 218, 220, 221, 222, 662, 663, 699, 761, 423, 44,
              640, 235, 236, 701, 696, 697, 698, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym
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
      for (int i = 0; i < proto.getNoInstrumentPartiesCount(); i++) {
        final NoRelatedSym.NoInstrumentParties group = new NoRelatedSym.NoInstrumentParties();
        group.fromProto(proto.getNoInstrumentParties(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoComplexEventsCount(); i++) {
        final NoRelatedSym.NoComplexEvents group = new NoRelatedSym.NoComplexEvents();
        group.fromProto(proto.getNoComplexEvents(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final NoRelatedSym.NoUnderlyings group = new NoRelatedSym.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoRateSourcesCount(); i++) {
        final NoRelatedSym.NoRateSources group = new NoRelatedSym.NoRateSources();
        group.fromProto(proto.getNoRateSources(i));
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
      if (fieldPresence.getProductComplex()) {
        this.setProductComplex(proto.getProductComplex());
      }
      if (fieldPresence.getSecurityGroup()) {
        this.setSecurityGroup(proto.getSecurityGroup());
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
      if (fieldPresence.getMaturityTime()) {
        this.setMaturityTime(proto.getMaturityTime());
      }
      if (fieldPresence.getSettleOnOpenFlag()) {
        this.setSettleOnOpenFlag(proto.getSettleOnOpenFlag());
      }
      if (fieldPresence.getInstrmtAssignmentMethod()) {
        this.setInstrmtAssignmentMethod(proto.getInstrmtAssignmentMethod());
      }
      if (fieldPresence.getSecurityStatus()) {
        this.setSecurityStatus(proto.getSecurityStatus());
      }
      if (fieldPresence.getCouponPaymentDate()) {
        this.setCouponPaymentDate(proto.getCouponPaymentDate());
      }
      if (fieldPresence.getRestructuringType()) {
        this.setRestructuringType(proto.getRestructuringType());
      }
      if (fieldPresence.getSeniority()) {
        this.setSeniority(proto.getSeniority());
      }
      if (fieldPresence.getNotionalPercentageOutstanding()) {
        this.setNotionalPercentageOutstanding(proto.getNotionalPercentageOutstanding());
      }
      if (fieldPresence.getOriginalNotionalPercentageOutstanding()) {
        this.setOriginalNotionalPercentageOutstanding(
            proto.getOriginalNotionalPercentageOutstanding());
      }
      if (fieldPresence.getAttachmentPoint()) {
        this.setAttachmentPoint(proto.getAttachmentPoint());
      }
      if (fieldPresence.getDetachmentPoint()) {
        this.setDetachmentPoint(proto.getDetachmentPoint());
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
      if (fieldPresence.getStrikeMultiplier()) {
        this.setStrikeMultiplier(proto.getStrikeMultiplier());
      }
      if (fieldPresence.getStrikeValue()) {
        this.setStrikeValue(proto.getStrikeValue());
      }
      if (fieldPresence.getStrikePriceDeterminationMethod()) {
        this.setStrikePriceDeterminationMethod(proto.getStrikePriceDeterminationMethod());
      }
      if (fieldPresence.getStrikePriceBoundaryMethod()) {
        this.setStrikePriceBoundaryMethod(proto.getStrikePriceBoundaryMethod());
      }
      if (fieldPresence.getStrikePriceBoundaryPrecision()) {
        this.setStrikePriceBoundaryPrecision(proto.getStrikePriceBoundaryPrecision());
      }
      if (fieldPresence.getUnderlyingPriceDeterminationMethod()) {
        this.setUnderlyingPriceDeterminationMethod(proto.getUnderlyingPriceDeterminationMethod());
      }
      if (fieldPresence.getOptAttribute()) {
        this.setOptAttribute(proto.getOptAttribute());
      }
      if (fieldPresence.getContractMultiplier()) {
        this.setContractMultiplier(proto.getContractMultiplier());
      }
      if (fieldPresence.getContractMultiplierUnit()) {
        this.setContractMultiplierUnit(proto.getContractMultiplierUnit());
      }
      if (fieldPresence.getFlowScheduleType()) {
        this.setFlowScheduleType(proto.getFlowScheduleType());
      }
      if (fieldPresence.getMinPriceIncrement()) {
        this.setMinPriceIncrement(proto.getMinPriceIncrement());
      }
      if (fieldPresence.getMinPriceIncrementAmount()) {
        this.setMinPriceIncrementAmount(proto.getMinPriceIncrementAmount());
      }
      if (fieldPresence.getUnitOfMeasure()) {
        this.setUnitOfMeasure(proto.getUnitOfMeasure());
      }
      if (fieldPresence.getUnitOfMeasureQty()) {
        this.setUnitOfMeasureQty(proto.getUnitOfMeasureQty());
      }
      if (fieldPresence.getPriceUnitOfMeasure()) {
        this.setPriceUnitOfMeasure(proto.getPriceUnitOfMeasure());
      }
      if (fieldPresence.getPriceUnitOfMeasureQty()) {
        this.setPriceUnitOfMeasureQty(proto.getPriceUnitOfMeasureQty());
      }
      if (fieldPresence.getSettlMethod()) {
        this.setSettlMethod(proto.getSettlMethod());
      }
      if (fieldPresence.getExerciseStyle()) {
        this.setExerciseStyle(proto.getExerciseStyle());
      }
      if (fieldPresence.getOptPayoutType()) {
        this.setOptPayoutType(proto.getOptPayoutType());
      }
      if (fieldPresence.getOptPayoutAmount()) {
        this.setOptPayoutAmount(proto.getOptPayoutAmount());
      }
      if (fieldPresence.getPriceQuoteMethod()) {
        this.setPriceQuoteMethod(proto.getPriceQuoteMethod());
      }
      if (fieldPresence.getValuationMethod()) {
        this.setValuationMethod(proto.getValuationMethod());
      }
      if (fieldPresence.getListMethod()) {
        this.setListMethod(proto.getListMethod());
      }
      if (fieldPresence.getCapPrice()) {
        this.setCapPrice(proto.getCapPrice());
      }
      if (fieldPresence.getFloorPrice()) {
        this.setFloorPrice(proto.getFloorPrice());
      }
      if (fieldPresence.getPutOrCall()) {
        this.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getFlexibleIndicator()) {
        this.setFlexibleIndicator(proto.getFlexibleIndicator());
      }
      if (fieldPresence.getFlexProductEligibilityIndicator()) {
        this.setFlexProductEligibilityIndicator(proto.getFlexProductEligibilityIndicator());
      }
      if (fieldPresence.getTimeUnit()) {
        this.setTimeUnit(proto.getTimeUnit());
      }
      if (fieldPresence.getCouponRate()) {
        this.setCouponRate(proto.getCouponRate());
      }
      if (fieldPresence.getSecurityExchange()) {
        this.setSecurityExchange(proto.getSecurityExchange());
      }
      if (fieldPresence.getPositionLimit()) {
        this.setPositionLimit(proto.getPositionLimit());
      }
      if (fieldPresence.getNtPositionLimit()) {
        this.setNtPositionLimit(proto.getNtPositionLimit());
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
      if (fieldPresence.getSecurityXmlLen()) {
        this.setSecurityXmlLen(proto.getSecurityXmlLen());
      }
      if (fieldPresence.getSecurityXmlData()) {
        this.setSecurityXmlData(proto.getSecurityXmlData());
      }
      if (fieldPresence.getSecurityXmlSchema()) {
        this.setSecurityXmlSchema(proto.getSecurityXmlSchema());
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
      if (fieldPresence.getMinQty()) {
        this.setMinQty(proto.getMinQty());
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
      if (fieldPresence.getSettlCurrency()) {
        this.setSettlCurrency(proto.getSettlCurrency());
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.NoRelatedSym.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest
                                         .NoRelatedSym.FieldPresence.newBuilder();

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

      final int noInstrumentPartiesGroupCount = this.getGroupCount(1018);
      for (int i = 1; i <= noInstrumentPartiesGroupCount; i++) {
        final NoRelatedSym.NoInstrumentParties group = new NoRelatedSym.NoInstrumentParties();
        this.getGroup(i, group);
        builder.addNoInstrumentParties(group.toBuilder().build());
      }

      final int noComplexEventsGroupCount = this.getGroupCount(1483);
      for (int i = 1; i <= noComplexEventsGroupCount; i++) {
        final NoRelatedSym.NoComplexEvents group = new NoRelatedSym.NoComplexEvents();
        this.getGroup(i, group);
        builder.addNoComplexEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = this.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final NoRelatedSym.NoUnderlyings group = new NoRelatedSym.NoUnderlyings();
        this.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noRateSourcesGroupCount = this.getGroupCount(1445);
      for (int i = 1; i <= noRateSourcesGroupCount; i++) {
        final NoRelatedSym.NoRateSources group = new NoRelatedSym.NoRateSources();
        this.getGroup(i, group);
        builder.addNoRateSources(group.toBuilder().build());
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
      if (this.hasProductComplex()) {
        builder.setProductComplex(this.getProductComplex());
        presenceBuilder.setProductComplex(true);
      }
      if (this.hasSecurityGroup()) {
        builder.setSecurityGroup(this.getSecurityGroup());
        presenceBuilder.setSecurityGroup(true);
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
      if (this.hasMaturityTime()) {
        builder.setMaturityTime(this.getMaturityTime());
        presenceBuilder.setMaturityTime(true);
      }
      if (this.hasSettleOnOpenFlag()) {
        builder.setSettleOnOpenFlag(this.getSettleOnOpenFlag());
        presenceBuilder.setSettleOnOpenFlag(true);
      }
      if (this.hasInstrmtAssignmentMethod()) {
        builder.setInstrmtAssignmentMethod(this.getInstrmtAssignmentMethod());
        presenceBuilder.setInstrmtAssignmentMethod(true);
      }
      if (this.hasSecurityStatus()) {
        builder.setSecurityStatus(this.getSecurityStatus());
        presenceBuilder.setSecurityStatus(true);
      }
      if (this.hasCouponPaymentDate()) {
        builder.setCouponPaymentDate(this.getCouponPaymentDate());
        presenceBuilder.setCouponPaymentDate(true);
      }
      if (this.hasRestructuringType()) {
        builder.setRestructuringType(this.getRestructuringType());
        presenceBuilder.setRestructuringType(true);
      }
      if (this.hasSeniority()) {
        builder.setSeniority(this.getSeniority());
        presenceBuilder.setSeniority(true);
      }
      if (this.hasNotionalPercentageOutstanding()) {
        builder.setNotionalPercentageOutstanding(this.getNotionalPercentageOutstanding());
        presenceBuilder.setNotionalPercentageOutstanding(true);
      }
      if (this.hasOriginalNotionalPercentageOutstanding()) {
        builder.setOriginalNotionalPercentageOutstanding(
            this.getOriginalNotionalPercentageOutstanding());
        presenceBuilder.setOriginalNotionalPercentageOutstanding(true);
      }
      if (this.hasAttachmentPoint()) {
        builder.setAttachmentPoint(this.getAttachmentPoint());
        presenceBuilder.setAttachmentPoint(true);
      }
      if (this.hasDetachmentPoint()) {
        builder.setDetachmentPoint(this.getDetachmentPoint());
        presenceBuilder.setDetachmentPoint(true);
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
      if (this.hasStrikeMultiplier()) {
        builder.setStrikeMultiplier(this.getStrikeMultiplier());
        presenceBuilder.setStrikeMultiplier(true);
      }
      if (this.hasStrikeValue()) {
        builder.setStrikeValue(this.getStrikeValue());
        presenceBuilder.setStrikeValue(true);
      }
      if (this.hasStrikePriceDeterminationMethod()) {
        builder.setStrikePriceDeterminationMethod(this.getStrikePriceDeterminationMethod());
        presenceBuilder.setStrikePriceDeterminationMethod(true);
      }
      if (this.hasStrikePriceBoundaryMethod()) {
        builder.setStrikePriceBoundaryMethod(this.getStrikePriceBoundaryMethod());
        presenceBuilder.setStrikePriceBoundaryMethod(true);
      }
      if (this.hasStrikePriceBoundaryPrecision()) {
        builder.setStrikePriceBoundaryPrecision(this.getStrikePriceBoundaryPrecision());
        presenceBuilder.setStrikePriceBoundaryPrecision(true);
      }
      if (this.hasUnderlyingPriceDeterminationMethod()) {
        builder.setUnderlyingPriceDeterminationMethod(this.getUnderlyingPriceDeterminationMethod());
        presenceBuilder.setUnderlyingPriceDeterminationMethod(true);
      }
      if (this.hasOptAttribute()) {
        builder.setOptAttribute(this.getOptAttribute());
        presenceBuilder.setOptAttribute(true);
      }
      if (this.hasContractMultiplier()) {
        builder.setContractMultiplier(this.getContractMultiplier());
        presenceBuilder.setContractMultiplier(true);
      }
      if (this.hasContractMultiplierUnit()) {
        builder.setContractMultiplierUnit(this.getContractMultiplierUnit());
        presenceBuilder.setContractMultiplierUnit(true);
      }
      if (this.hasFlowScheduleType()) {
        builder.setFlowScheduleType(this.getFlowScheduleType());
        presenceBuilder.setFlowScheduleType(true);
      }
      if (this.hasMinPriceIncrement()) {
        builder.setMinPriceIncrement(this.getMinPriceIncrement());
        presenceBuilder.setMinPriceIncrement(true);
      }
      if (this.hasMinPriceIncrementAmount()) {
        builder.setMinPriceIncrementAmount(this.getMinPriceIncrementAmount());
        presenceBuilder.setMinPriceIncrementAmount(true);
      }
      if (this.hasUnitOfMeasure()) {
        builder.setUnitOfMeasure(this.getUnitOfMeasure());
        presenceBuilder.setUnitOfMeasure(true);
      }
      if (this.hasUnitOfMeasureQty()) {
        builder.setUnitOfMeasureQty(this.getUnitOfMeasureQty());
        presenceBuilder.setUnitOfMeasureQty(true);
      }
      if (this.hasPriceUnitOfMeasure()) {
        builder.setPriceUnitOfMeasure(this.getPriceUnitOfMeasure());
        presenceBuilder.setPriceUnitOfMeasure(true);
      }
      if (this.hasPriceUnitOfMeasureQty()) {
        builder.setPriceUnitOfMeasureQty(this.getPriceUnitOfMeasureQty());
        presenceBuilder.setPriceUnitOfMeasureQty(true);
      }
      if (this.hasSettlMethod()) {
        builder.setSettlMethod(this.getSettlMethod());
        presenceBuilder.setSettlMethod(true);
      }
      if (this.hasExerciseStyle()) {
        builder.setExerciseStyle(this.getExerciseStyle());
        presenceBuilder.setExerciseStyle(true);
      }
      if (this.hasOptPayoutType()) {
        builder.setOptPayoutType(this.getOptPayoutType());
        presenceBuilder.setOptPayoutType(true);
      }
      if (this.hasOptPayoutAmount()) {
        builder.setOptPayoutAmount(this.getOptPayoutAmount());
        presenceBuilder.setOptPayoutAmount(true);
      }
      if (this.hasPriceQuoteMethod()) {
        builder.setPriceQuoteMethod(this.getPriceQuoteMethod());
        presenceBuilder.setPriceQuoteMethod(true);
      }
      if (this.hasValuationMethod()) {
        builder.setValuationMethod(this.getValuationMethod());
        presenceBuilder.setValuationMethod(true);
      }
      if (this.hasListMethod()) {
        builder.setListMethod(this.getListMethod());
        presenceBuilder.setListMethod(true);
      }
      if (this.hasCapPrice()) {
        builder.setCapPrice(this.getCapPrice());
        presenceBuilder.setCapPrice(true);
      }
      if (this.hasFloorPrice()) {
        builder.setFloorPrice(this.getFloorPrice());
        presenceBuilder.setFloorPrice(true);
      }
      if (this.hasPutOrCall()) {
        builder.setPutOrCall(this.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (this.hasFlexibleIndicator()) {
        builder.setFlexibleIndicator(this.getFlexibleIndicator());
        presenceBuilder.setFlexibleIndicator(true);
      }
      if (this.hasFlexProductEligibilityIndicator()) {
        builder.setFlexProductEligibilityIndicator(this.getFlexProductEligibilityIndicator());
        presenceBuilder.setFlexProductEligibilityIndicator(true);
      }
      if (this.hasTimeUnit()) {
        builder.setTimeUnit(this.getTimeUnit());
        presenceBuilder.setTimeUnit(true);
      }
      if (this.hasCouponRate()) {
        builder.setCouponRate(this.getCouponRate());
        presenceBuilder.setCouponRate(true);
      }
      if (this.hasSecurityExchange()) {
        builder.setSecurityExchange(this.getSecurityExchange());
        presenceBuilder.setSecurityExchange(true);
      }
      if (this.hasPositionLimit()) {
        builder.setPositionLimit(this.getPositionLimit());
        presenceBuilder.setPositionLimit(true);
      }
      if (this.hasNtPositionLimit()) {
        builder.setNtPositionLimit(this.getNtPositionLimit());
        presenceBuilder.setNtPositionLimit(true);
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
      if (this.hasSecurityXmlLen()) {
        builder.setSecurityXmlLen(this.getSecurityXmlLen());
        presenceBuilder.setSecurityXmlLen(true);
      }
      if (this.hasSecurityXmlData()) {
        builder.setSecurityXmlData(this.getSecurityXmlData());
        presenceBuilder.setSecurityXmlData(true);
      }
      if (this.hasSecurityXmlSchema()) {
        builder.setSecurityXmlSchema(this.getSecurityXmlSchema());
        presenceBuilder.setSecurityXmlSchema(true);
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
      if (this.hasMinQty()) {
        builder.setMinQty(this.getMinQty());
        presenceBuilder.setMinQty(true);
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
      if (this.hasSettlCurrency()) {
        builder.setSettlCurrency(this.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
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

  private final quickfix.IntField bookingTypeField = FieldFactory.newIntField(775);
  public boolean hasBookingType() throws quickfix.FieldNotFound {
    return isSetField(775);
  }
  public int getBookingType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bookingTypeField));
  }
  public QuoteRequest setBookingType(final int value) {
    setField(FieldValue.to(bookingTypeField, value));
    return this;
  }
  public QuoteRequest setBookingType(final quickfix.field.BookingType value) {
    setField(FieldValue.to(bookingTypeField, FieldValue.of(value)));
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

  private final quickfix.StringField orderRestrictionsField = FieldFactory.newStringField(529);
  public boolean hasOrderRestrictions() throws quickfix.FieldNotFound {
    return isSetField(529);
  }
  public String getOrderRestrictions() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderRestrictionsField));
  }
  public QuoteRequest setOrderRestrictions(final String value) {
    setField(FieldValue.to(orderRestrictionsField, value));
    return this;
  }
  public QuoteRequest setOrderRestrictions(final quickfix.field.OrderRestrictions value) {
    setField(FieldValue.to(orderRestrictionsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField privateQuoteField = FieldFactory.newBooleanField(1171);
  public boolean hasPrivateQuote() throws quickfix.FieldNotFound {
    return isSetField(1171);
  }
  public boolean getPrivateQuote() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(privateQuoteField));
  }
  public QuoteRequest setPrivateQuote(final boolean value) {
    setField(FieldValue.to(privateQuoteField, value));
    return this;
  }
  public QuoteRequest setPrivateQuote(final quickfix.field.PrivateQuote value) {
    setField(FieldValue.to(privateQuoteField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField respondentTypeField = FieldFactory.newIntField(1172);
  public boolean hasRespondentType() throws quickfix.FieldNotFound {
    return isSetField(1172);
  }
  public int getRespondentType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(respondentTypeField));
  }
  public QuoteRequest setRespondentType(final int value) {
    setField(FieldValue.to(respondentTypeField, value));
    return this;
  }
  public QuoteRequest setRespondentType(final quickfix.field.RespondentType value) {
    setField(FieldValue.to(respondentTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField preTradeAnonymityField = FieldFactory.newBooleanField(1091);
  public boolean hasPreTradeAnonymity() throws quickfix.FieldNotFound {
    return isSetField(1091);
  }
  public boolean getPreTradeAnonymity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(preTradeAnonymityField));
  }
  public QuoteRequest setPreTradeAnonymity(final boolean value) {
    setField(FieldValue.to(preTradeAnonymityField, value));
    return this;
  }
  public QuoteRequest setPreTradeAnonymity(final quickfix.field.PreTradeAnonymity value) {
    setField(FieldValue.to(preTradeAnonymityField, FieldValue.of(value)));
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
    super(new int[] {131, 644, 11, 775, 528, 529, 1171, 1172, 1091, 58, 354, 355, 0});
  }

  public QuoteRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {131, 644, 11, 775, 528, 529, 1171, 1172, 1091, 58, 354, 355, 0});
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

  public static Function<garden_leave.gateway.transform.fix50sp2.QuoteRequest,
      garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.getDefaultInstance();
    }

    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.Builder builder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.newBuilder();
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix50sp2.Header header =
        (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
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
      if (fix.hasBookingType()) {
        builder.setBookingType(fix.getBookingType());
        presenceBuilder.setBookingType(true);
      }
      if (fix.hasOrderCapacity()) {
        builder.setOrderCapacity(fix.getOrderCapacity());
        presenceBuilder.setOrderCapacity(true);
      }
      if (fix.hasOrderRestrictions()) {
        builder.setOrderRestrictions(fix.getOrderRestrictions());
        presenceBuilder.setOrderRestrictions(true);
      }
      if (fix.hasPrivateQuote()) {
        builder.setPrivateQuote(fix.getPrivateQuote());
        presenceBuilder.setPrivateQuote(true);
      }
      if (fix.hasRespondentType()) {
        builder.setRespondentType(fix.getRespondentType());
        presenceBuilder.setRespondentType(true);
      }
      if (fix.hasPreTradeAnonymity()) {
        builder.setPreTradeAnonymity(fix.getPreTradeAnonymity());
        presenceBuilder.setPreTradeAnonymity(true);
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
      final int noRootPartyIdsGroupCount = fix.getGroupCount(1116);
      for (int i = 1; i <= noRootPartyIdsGroupCount; i++) {
        final QuoteRequest.NoRootPartyIds group = new QuoteRequest.NoRootPartyIds();
        fix.getGroup(i, group);
        builder.addNoRootPartyIds(group.toBuilder().build());
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

  public static Function<garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest,
      garden_leave.gateway.transform.fix50sp2.QuoteRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix50sp2.QuoteRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix50sp2.QuoteRequest fix =
          new garden_leave.gateway.transform.fix50sp2.QuoteRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix50sp2.Header header =
          (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix50sp2.proto.FIX50SP2Protos.QuoteRequest.FieldPresence fieldPresence =
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
      if (fieldPresence.getBookingType()) {
        fix.setBookingType(proto.getBookingType());
      }
      if (fieldPresence.getOrderCapacity()) {
        fix.setOrderCapacity(proto.getOrderCapacity());
      }
      if (fieldPresence.getOrderRestrictions()) {
        fix.setOrderRestrictions(proto.getOrderRestrictions());
      }
      if (fieldPresence.getPrivateQuote()) {
        fix.setPrivateQuote(proto.getPrivateQuote());
      }
      if (fieldPresence.getRespondentType()) {
        fix.setRespondentType(proto.getRespondentType());
      }
      if (fieldPresence.getPreTradeAnonymity()) {
        fix.setPreTradeAnonymity(proto.getPreTradeAnonymity());
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
      for (int i = 0; i < proto.getNoRootPartyIdsCount(); i++) {
        final QuoteRequest.NoRootPartyIds group = new QuoteRequest.NoRootPartyIds();
        group.fromProto(proto.getNoRootPartyIds(i));
        fix.addGroupRef(group);
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
