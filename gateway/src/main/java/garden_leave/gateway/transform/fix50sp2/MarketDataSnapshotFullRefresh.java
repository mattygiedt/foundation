package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.298919500
//

public final class MarketDataSnapshotFullRefresh extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(MarketDataSnapshotFullRefresh.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(MarketDataSnapshotFullRefresh.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public MarketDataSnapshotFullRefresh setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.5.0";
  public static final String MSGTYPE = "W";

  public final String UUID = java.util.UUID.randomUUID().toString();

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

    private final quickfix.StringField securityAltIdSourceField = FieldFactory.newStringField(456);
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
    public NoSecurityAltId setSecurityAltIdSource(final quickfix.field.SecurityAltIDSource value) {
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoSecurityAltId proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoSecurityAltId
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getSecurityAltId()) {
        this.setSecurityAltId(proto.getSecurityAltId());
      }
      if (fieldPresence.getSecurityAltIdSource()) {
        this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoSecurityAltId
        .Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoSecurityAltId
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoSecurityAltId.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoSecurityAltId
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoSecurityAltId
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

    private final FieldFactory.TimeStampField eventTimeField = FieldFactory.newTimeStampField(1145);
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoEvents
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoEvents.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoEvents
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoEvents
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoEvents
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

      public void fromProto(
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoInstrumentParties.NoInstrumentPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoInstrumentParties.NoInstrumentPartySubIds.FieldPresence fieldPresence =
            proto.getFieldPresence();

        if (fieldPresence.getInstrumentPartySubId()) {
          this.setInstrumentPartySubId(proto.getInstrumentPartySubId());
        }
        if (fieldPresence.getInstrumentPartySubIdType()) {
          this.setInstrumentPartySubIdType(proto.getInstrumentPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .NoInstrumentParties.NoInstrumentPartySubIds.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoInstrumentParties.NoInstrumentPartySubIds.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                .NoInstrumentParties.NoInstrumentPartySubIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoInstrumentParties.NoInstrumentPartySubIds.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
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
    public NoInstrumentParties setInstrumentPartyId(final quickfix.field.InstrumentPartyID value) {
      setField(FieldValue.to(instrumentPartyIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField instrumentPartyIdSourceField = FieldFactory.newCharField(1050);
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoInstrumentParties proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
        .NoInstrumentParties.Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .NoInstrumentParties.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoInstrumentParties.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .NoInstrumentParties.FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoInstrumentParties.FieldPresence.newBuilder();

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
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getComplexEventStartTime()) {
            this.setComplexEventStartTime(proto.getComplexEventStartTime());
          }
          if (fieldPresence.getComplexEventEndTime()) {
            this.setComplexEventEndTime(proto.getComplexEventEndTime());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                  .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.FieldPresence
              .Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                  .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes.FieldPresence
                  .newBuilder();

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

      public void fromProto(
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoComplexEvents.NoComplexEventDates proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoComplexEvents.NoComplexEventDates.FieldPresence fieldPresence =
            proto.getFieldPresence();

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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .NoComplexEvents.NoComplexEventDates.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoComplexEvents.NoComplexEventDates.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
                .NoComplexEventDates.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoComplexEvents.NoComplexEventDates.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
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

    private final quickfix.IntField complexEventPriceTimeTypeField = FieldFactory.newIntField(1489);
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoComplexEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoComplexEventDatesCount(); i++) {
        final NoComplexEvents.NoComplexEventDates group = new NoComplexEvents.NoComplexEventDates();
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
        .Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoComplexEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoComplexEvents
              .FieldPresence.newBuilder();

      final int noComplexEventDatesGroupCount = this.getGroupCount(1491);
      for (int i = 1; i <= noComplexEventDatesGroupCount; i++) {
        final NoComplexEvents.NoComplexEventDates group = new NoComplexEvents.NoComplexEventDates();
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
        builder.setComplexEventPriceBoundaryPrecision(this.getComplexEventPriceBoundaryPrecision());
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

      public void fromProto(
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUnderlyingSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingSecurityAltId()) {
          this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
        }
        if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
          this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
          .NoUnderlyingSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
                .NoUnderlyingSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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
      private final quickfix.StringField underlyingStipTypeField = FieldFactory.newStringField(888);
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
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUnderlyingStips proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingStips.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingStipType()) {
          this.setUnderlyingStipType(proto.getUnderlyingStipType());
        }
        if (fieldPresence.getUnderlyingStipValue()) {
          this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
          .NoUnderlyingStips.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingStips.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
                .NoUnderlyingStips.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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
        public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubId(final String value) {
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
        public NoUndlyInstrumentPartySubIds setUnderlyingInstrumentPartySubIdType(final int value) {
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
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds
              .FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getUnderlyingInstrumentPartySubId()) {
            this.setUnderlyingInstrumentPartySubId(proto.getUnderlyingInstrumentPartySubId());
          }
          if (fieldPresence.getUnderlyingInstrumentPartySubIdType()) {
            this.setUnderlyingInstrumentPartySubIdType(
                proto.getUnderlyingInstrumentPartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
            .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
                  .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence
              .Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
                  .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence.newBuilder();

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

      public void fromProto(
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
              .NoUnderlyings.NoUndlyInstrumentParties proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
          .NoUndlyInstrumentParties.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUndlyInstrumentParties.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
                .NoUndlyInstrumentParties.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
            .NoUndlyInstrumentParties.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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
          builder.setUnderlyingInstrumentPartyIdSource(this.getUnderlyingInstrumentPartyIdSource());
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

    private final quickfix.StringField underlyingSymbolSfxField = FieldFactory.newStringField(312);
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

    private final quickfix.StringField underlyingSecurityIdField = FieldFactory.newStringField(309);
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
    public NoUnderlyings setUnderlyingSecurityId(final quickfix.field.UnderlyingSecurityID value) {
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

    private final quickfix.StringField underlyingSeniorityField = FieldFactory.newStringField(1454);
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

    private final quickfix.StringField underlyingIssueDateField = FieldFactory.newStringField(242);
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

    private final quickfix.StringField underlyingTimeUnitField = FieldFactory.newStringField(1000);
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

    private final quickfix.DoubleField underlyingCouponRateField = FieldFactory.newDoubleField(435);
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
    public NoUnderlyings setUnderlyingCouponRate(final quickfix.field.UnderlyingCouponRate value) {
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

    private final quickfix.IntField encodedUnderlyingIssuerLenField = FieldFactory.newIntField(362);
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

    private final quickfix.StringField underlyingCpProgramField = FieldFactory.newStringField(877);
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

    private final quickfix.StringField underlyingCpRegTypeField = FieldFactory.newStringField(878);
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

    private final quickfix.DoubleField underlyingCashAmountField = FieldFactory.newDoubleField(973);
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
    public NoUnderlyings setUnderlyingCashAmount(final quickfix.field.UnderlyingCashAmount value) {
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

    private final quickfix.DoubleField underlyingDirtyPriceField = FieldFactory.newDoubleField(882);
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
    public NoUnderlyings setUnderlyingDirtyPrice(final quickfix.field.UnderlyingDirtyPrice value) {
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

    private final quickfix.DoubleField underlyingStartValueField = FieldFactory.newDoubleField(884);
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
    public NoUnderlyings setUnderlyingStartValue(final quickfix.field.UnderlyingStartValue value) {
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
    public NoUnderlyings setUnderlyingFxRateCalc(final quickfix.field.UnderlyingFXRateCalc value) {
      setField(FieldValue.to(underlyingFxRateCalcField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField underlyingCapValueField = FieldFactory.newDoubleField(1038);
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
          new int[] {311, 312, 309, 305, 462, 463, 310, 763, 313, 542, 1213, 241, 1453, 1454, 1455,
              1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941,
              317, 436, 1437, 1441, 998, 1423, 1424, 1425, 1000, 1419, 435, 308, 306, 362, 363, 307,
              364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 1044,
              1045, 1046, 1038, 1039, 315, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoUnderlyings proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
        .Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoUnderlyings.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoUnderlyings
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                                .MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
            .NoLegSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getLegSecurityAltId()) {
          this.setLegSecurityAltId(proto.getLegSecurityAltId());
        }
        if (fieldPresence.getLegSecurityAltIdSource()) {
          this.setLegSecurityAltIdSource(proto.getLegSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
          .NoLegSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
            .NoLegSecurityAltId.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
                .NoLegSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
            .NoLegSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
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

    private final quickfix.StringField legSecurityIdSourceField = FieldFactory.newStringField(603);
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

    private final quickfix.StringField legMaturityMonthYearField = FieldFactory.newStringField(610);
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

    private final quickfix.StringField legCouponPaymentDateField = FieldFactory.newStringField(248);
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

    private final quickfix.IntField legContractMultiplierUnitField = FieldFactory.newIntField(1436);
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

    private final quickfix.DoubleField legUnitOfMeasureQtyField = FieldFactory.newDoubleField(1224);
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
    public NoLegs setLegPriceUnitOfMeasureQty(final quickfix.field.LegPriceUnitOfMeasureQty value) {
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

    private final quickfix.StringField legSecurityExchangeField = FieldFactory.newStringField(616);
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

    private final quickfix.IntField encodedLegSecurityDescLenField = FieldFactory.newIntField(621);
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

    public NoLegs() {
      super(555, 600,
          new int[] {600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251,
              252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 1436, 1440, 999, 1224,
              1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740,
              739, 955, 956, 1358, 1017, 566, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoLegs proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
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
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoLegs.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoLegs
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
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoMdEntries extends quickfix.Group {
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                                .MarketDataSnapshotFullRefresh.NoMdEntries.NoRateSources proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoRateSources.FieldPresence fieldPresence = proto.getFieldPresence();

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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .NoRateSources.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoRateSources.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoRateSources.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoRateSources.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoRateSources.FieldPresence.newBuilder();

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

    public static class NoOfSecSizes extends quickfix.Group {
      private final quickfix.IntField mdSecSizeTypeField = FieldFactory.newIntField(1178);
      public boolean hasMdSecSizeType() throws quickfix.FieldNotFound {
        return isSetField(1178);
      }
      public int getMdSecSizeType() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(mdSecSizeTypeField));
      }
      public NoOfSecSizes setMdSecSizeType(final int value) {
        setField(FieldValue.to(mdSecSizeTypeField, value));
        return this;
      }
      public NoOfSecSizes setMdSecSizeType(final quickfix.field.MDSecSizeType value) {
        setField(FieldValue.to(mdSecSizeTypeField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField mdSecSizeField = FieldFactory.newDoubleField(1179);
      public boolean hasMdSecSize() throws quickfix.FieldNotFound {
        return isSetField(1179);
      }
      public double getMdSecSize() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(mdSecSizeField));
      }
      public NoOfSecSizes setMdSecSize(final double value) {
        setField(FieldValue.to(mdSecSizeField, value));
        return this;
      }
      public NoOfSecSizes setMdSecSize(final quickfix.field.MDSecSize value) {
        setField(FieldValue.to(mdSecSizeField, FieldValue.of(value)));
        return this;
      }

      public NoOfSecSizes() {
        super(1177, 1178, new int[] {1178, 1179, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                                .MarketDataSnapshotFullRefresh.NoMdEntries.NoOfSecSizes proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoOfSecSizes.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getMdSecSizeType()) {
          this.setMdSecSizeType(proto.getMdSecSizeType());
        }
        if (fieldPresence.getMdSecSize()) {
          this.setMdSecSize(proto.getMdSecSize());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .NoOfSecSizes.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoOfSecSizes.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoOfSecSizes.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoOfSecSizes.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoOfSecSizes.FieldPresence.newBuilder();

        if (this.hasMdSecSizeType()) {
          builder.setMdSecSizeType(this.getMdSecSizeType());
          presenceBuilder.setMdSecSizeType(true);
        }
        if (this.hasMdSecSize()) {
          builder.setMdSecSize(this.getMdSecSize());
          presenceBuilder.setMdSecSize(true);
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

        public void fromProto(
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
                .NoMdEntries.NoPartyIds.NoPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
              .NoPartyIds.NoPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getPartySubId()) {
            this.setPartySubId(proto.getPartySubId());
          }
          if (fieldPresence.getPartySubIdType()) {
            this.setPartySubIdType(proto.getPartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoPartyIds.NoPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
              .NoPartyIds.NoPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                  .NoPartyIds.NoPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
              .NoPartyIds.NoPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                  .NoPartyIds.NoPartySubIds.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                                .MarketDataSnapshotFullRefresh.NoMdEntries.NoPartyIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoPartyIds.FieldPresence fieldPresence = proto.getFieldPresence();

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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .NoPartyIds.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoPartyIds.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoPartyIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
            .NoPartyIds.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
                .NoPartyIds.FieldPresence.newBuilder();

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

    private final quickfix.IntField priceTypeField = FieldFactory.newIntField(423);
    public boolean hasPriceType() throws quickfix.FieldNotFound {
      return isSetField(423);
    }
    public int getPriceType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(priceTypeField));
    }
    public NoMdEntries setPriceType(final int value) {
      setField(FieldValue.to(priceTypeField, value));
      return this;
    }
    public NoMdEntries setPriceType(final quickfix.field.PriceType value) {
      setField(FieldValue.to(priceTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField yieldTypeField = FieldFactory.newStringField(235);
    public boolean hasYieldType() throws quickfix.FieldNotFound {
      return isSetField(235);
    }
    public String getYieldType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(yieldTypeField));
    }
    public NoMdEntries setYieldType(final String value) {
      setField(FieldValue.to(yieldTypeField, value));
      return this;
    }
    public NoMdEntries setYieldType(final quickfix.field.YieldType value) {
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
    public NoMdEntries setYield(final double value) {
      setField(FieldValue.to(yieldField, value));
      return this;
    }
    public NoMdEntries setYield(final quickfix.field.Yield value) {
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
    public NoMdEntries setYieldCalcDate(final String value) {
      setField(FieldValue.to(yieldCalcDateField, value));
      return this;
    }
    public NoMdEntries setYieldCalcDate(final quickfix.field.YieldCalcDate value) {
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
    public NoMdEntries setYieldRedemptionDate(final String value) {
      setField(FieldValue.to(yieldRedemptionDateField, value));
      return this;
    }
    public NoMdEntries setYieldRedemptionDate(final quickfix.field.YieldRedemptionDate value) {
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
    public NoMdEntries setYieldRedemptionPrice(final double value) {
      setField(FieldValue.to(yieldRedemptionPriceField, value));
      return this;
    }
    public NoMdEntries setYieldRedemptionPrice(final quickfix.field.YieldRedemptionPrice value) {
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
    public NoMdEntries setYieldRedemptionPriceType(final int value) {
      setField(FieldValue.to(yieldRedemptionPriceTypeField, value));
      return this;
    }
    public NoMdEntries setYieldRedemptionPriceType(
        final quickfix.field.YieldRedemptionPriceType value) {
      setField(FieldValue.to(yieldRedemptionPriceTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField spreadField = FieldFactory.newDoubleField(218);
    public boolean hasSpread() throws quickfix.FieldNotFound {
      return isSetField(218);
    }
    public double getSpread() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(spreadField));
    }
    public NoMdEntries setSpread(final double value) {
      setField(FieldValue.to(spreadField, value));
      return this;
    }
    public NoMdEntries setSpread(final quickfix.field.Spread value) {
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
    public NoMdEntries setBenchmarkCurveCurrency(final String value) {
      setField(FieldValue.to(benchmarkCurveCurrencyField, value));
      return this;
    }
    public NoMdEntries setBenchmarkCurveCurrency(
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
    public NoMdEntries setBenchmarkCurveName(final String value) {
      setField(FieldValue.to(benchmarkCurveNameField, value));
      return this;
    }
    public NoMdEntries setBenchmarkCurveName(final quickfix.field.BenchmarkCurveName value) {
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
    public NoMdEntries setBenchmarkCurvePoint(final String value) {
      setField(FieldValue.to(benchmarkCurvePointField, value));
      return this;
    }
    public NoMdEntries setBenchmarkCurvePoint(final quickfix.field.BenchmarkCurvePoint value) {
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
    public NoMdEntries setBenchmarkPrice(final double value) {
      setField(FieldValue.to(benchmarkPriceField, value));
      return this;
    }
    public NoMdEntries setBenchmarkPrice(final quickfix.field.BenchmarkPrice value) {
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
    public NoMdEntries setBenchmarkPriceType(final int value) {
      setField(FieldValue.to(benchmarkPriceTypeField, value));
      return this;
    }
    public NoMdEntries setBenchmarkPriceType(final quickfix.field.BenchmarkPriceType value) {
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
    public NoMdEntries setBenchmarkSecurityId(final String value) {
      setField(FieldValue.to(benchmarkSecurityIdField, value));
      return this;
    }
    public NoMdEntries setBenchmarkSecurityId(final quickfix.field.BenchmarkSecurityID value) {
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
    public NoMdEntries setBenchmarkSecurityIdSource(final String value) {
      setField(FieldValue.to(benchmarkSecurityIdSourceField, value));
      return this;
    }
    public NoMdEntries setBenchmarkSecurityIdSource(
        final quickfix.field.BenchmarkSecurityIDSource value) {
      setField(FieldValue.to(benchmarkSecurityIdSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField ordTypeField = FieldFactory.newCharField(40);
    public boolean hasOrdType() throws quickfix.FieldNotFound {
      return isSetField(40);
    }
    public int getOrdType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(ordTypeField));
    }
    public NoMdEntries setOrdType(final int value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoMdEntries setOrdType(final char value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoMdEntries setOrdType(final String value) {
      setField(FieldValue.to(ordTypeField, value));
      return this;
    }
    public NoMdEntries setOrdType(final quickfix.field.OrdType value) {
      setField(FieldValue.to(ordTypeField, FieldValue.of(value)));
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

    private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
    public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
      return isSetField(120);
    }
    public String getSettlCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlCurrencyField));
    }
    public NoMdEntries setSettlCurrency(final String value) {
      setField(FieldValue.to(settlCurrencyField, value));
      return this;
    }
    public NoMdEntries setSettlCurrency(final quickfix.field.SettlCurrency value) {
      setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
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

    private final quickfix.CharField lotTypeField = FieldFactory.newCharField(1093);
    public boolean hasLotType() throws quickfix.FieldNotFound {
      return isSetField(1093);
    }
    public int getLotType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(lotTypeField));
    }
    public NoMdEntries setLotType(final int value) {
      setField(FieldValue.to(lotTypeField, value));
      return this;
    }
    public NoMdEntries setLotType(final char value) {
      setField(FieldValue.to(lotTypeField, value));
      return this;
    }
    public NoMdEntries setLotType(final String value) {
      setField(FieldValue.to(lotTypeField, value));
      return this;
    }
    public NoMdEntries setLotType(final quickfix.field.LotType value) {
      setField(FieldValue.to(lotTypeField, FieldValue.of(value)));
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

    private final quickfix.IntField securityTradingStatusField = FieldFactory.newIntField(326);
    public boolean hasSecurityTradingStatus() throws quickfix.FieldNotFound {
      return isSetField(326);
    }
    public int getSecurityTradingStatus() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(securityTradingStatusField));
    }
    public NoMdEntries setSecurityTradingStatus(final int value) {
      setField(FieldValue.to(securityTradingStatusField, value));
      return this;
    }
    public NoMdEntries setSecurityTradingStatus(final quickfix.field.SecurityTradingStatus value) {
      setField(FieldValue.to(securityTradingStatusField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField haltReasonField = FieldFactory.newIntField(327);
    public boolean hasHaltReason() throws quickfix.FieldNotFound {
      return isSetField(327);
    }
    public int getHaltReason() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(haltReasonField));
    }
    public NoMdEntries setHaltReason(final int value) {
      setField(FieldValue.to(haltReasonField, value));
      return this;
    }
    public NoMdEntries setHaltReason(final quickfix.field.HaltReason value) {
      setField(FieldValue.to(haltReasonField, FieldValue.of(value)));
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

    private final quickfix.StringField secondaryOrderIdField = FieldFactory.newStringField(198);
    public boolean hasSecondaryOrderId() throws quickfix.FieldNotFound {
      return isSetField(198);
    }
    public String getSecondaryOrderId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(secondaryOrderIdField));
    }
    public NoMdEntries setSecondaryOrderId(final String value) {
      setField(FieldValue.to(secondaryOrderIdField, value));
      return this;
    }
    public NoMdEntries setSecondaryOrderId(final quickfix.field.SecondaryOrderID value) {
      setField(FieldValue.to(secondaryOrderIdField, FieldValue.of(value)));
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

    private final quickfix.IntField trdTypeField = FieldFactory.newIntField(828);
    public boolean hasTrdType() throws quickfix.FieldNotFound {
      return isSetField(828);
    }
    public int getTrdType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(trdTypeField));
    }
    public NoMdEntries setTrdType(final int value) {
      setField(FieldValue.to(trdTypeField, value));
      return this;
    }
    public NoMdEntries setTrdType(final quickfix.field.TrdType value) {
      setField(FieldValue.to(trdTypeField, FieldValue.of(value)));
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

    private final quickfix.IntField mdPriceLevelField = FieldFactory.newIntField(1023);
    public boolean hasMdPriceLevel() throws quickfix.FieldNotFound {
      return isSetField(1023);
    }
    public int getMdPriceLevel() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdPriceLevelField));
    }
    public NoMdEntries setMdPriceLevel(final int value) {
      setField(FieldValue.to(mdPriceLevelField, value));
      return this;
    }
    public NoMdEntries setMdPriceLevel(final quickfix.field.MDPriceLevel value) {
      setField(FieldValue.to(mdPriceLevelField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField orderCapacityField = FieldFactory.newCharField(528);
    public boolean hasOrderCapacity() throws quickfix.FieldNotFound {
      return isSetField(528);
    }
    public int getOrderCapacity() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(orderCapacityField));
    }
    public NoMdEntries setOrderCapacity(final int value) {
      setField(FieldValue.to(orderCapacityField, value));
      return this;
    }
    public NoMdEntries setOrderCapacity(final char value) {
      setField(FieldValue.to(orderCapacityField, value));
      return this;
    }
    public NoMdEntries setOrderCapacity(final String value) {
      setField(FieldValue.to(orderCapacityField, value));
      return this;
    }
    public NoMdEntries setOrderCapacity(final quickfix.field.OrderCapacity value) {
      setField(FieldValue.to(orderCapacityField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField mdOriginTypeField = FieldFactory.newIntField(1024);
    public boolean hasMdOriginType() throws quickfix.FieldNotFound {
      return isSetField(1024);
    }
    public int getMdOriginType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdOriginTypeField));
    }
    public NoMdEntries setMdOriginType(final int value) {
      setField(FieldValue.to(mdOriginTypeField, value));
      return this;
    }
    public NoMdEntries setMdOriginType(final quickfix.field.MDOriginType value) {
      setField(FieldValue.to(mdOriginTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField highPxField = FieldFactory.newDoubleField(332);
    public boolean hasHighPx() throws quickfix.FieldNotFound {
      return isSetField(332);
    }
    public double getHighPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(highPxField));
    }
    public NoMdEntries setHighPx(final double value) {
      setField(FieldValue.to(highPxField, value));
      return this;
    }
    public NoMdEntries setHighPx(final quickfix.field.HighPx value) {
      setField(FieldValue.to(highPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField lowPxField = FieldFactory.newDoubleField(333);
    public boolean hasLowPx() throws quickfix.FieldNotFound {
      return isSetField(333);
    }
    public double getLowPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(lowPxField));
    }
    public NoMdEntries setLowPx(final double value) {
      setField(FieldValue.to(lowPxField, value));
      return this;
    }
    public NoMdEntries setLowPx(final quickfix.field.LowPx value) {
      setField(FieldValue.to(lowPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField firstPxField = FieldFactory.newDoubleField(1025);
    public boolean hasFirstPx() throws quickfix.FieldNotFound {
      return isSetField(1025);
    }
    public double getFirstPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(firstPxField));
    }
    public NoMdEntries setFirstPx(final double value) {
      setField(FieldValue.to(firstPxField, value));
      return this;
    }
    public NoMdEntries setFirstPx(final quickfix.field.FirstPx value) {
      setField(FieldValue.to(firstPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField lastPxField = FieldFactory.newDoubleField(31);
    public boolean hasLastPx() throws quickfix.FieldNotFound {
      return isSetField(31);
    }
    public double getLastPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(lastPxField));
    }
    public NoMdEntries setLastPx(final double value) {
      setField(FieldValue.to(lastPxField, value));
      return this;
    }
    public NoMdEntries setLastPx(final quickfix.field.LastPx value) {
      setField(FieldValue.to(lastPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField tradeVolumeField = FieldFactory.newDoubleField(1020);
    public boolean hasTradeVolume() throws quickfix.FieldNotFound {
      return isSetField(1020);
    }
    public double getTradeVolume() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradeVolumeField));
    }
    public NoMdEntries setTradeVolume(final double value) {
      setField(FieldValue.to(tradeVolumeField, value));
      return this;
    }
    public NoMdEntries setTradeVolume(final quickfix.field.TradeVolume value) {
      setField(FieldValue.to(tradeVolumeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField settlTypeField = FieldFactory.newStringField(63);
    public boolean hasSettlType() throws quickfix.FieldNotFound {
      return isSetField(63);
    }
    public String getSettlType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(settlTypeField));
    }
    public NoMdEntries setSettlType(final String value) {
      setField(FieldValue.to(settlTypeField, value));
      return this;
    }
    public NoMdEntries setSettlType(final quickfix.field.SettlType value) {
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
    public NoMdEntries setSettlDate(final String value) {
      setField(FieldValue.to(settlDateField, value));
      return this;
    }
    public NoMdEntries setSettlDate(final quickfix.field.SettlDate value) {
      setField(FieldValue.to(settlDateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField mdQuoteTypeField = FieldFactory.newIntField(1070);
    public boolean hasMdQuoteType() throws quickfix.FieldNotFound {
      return isSetField(1070);
    }
    public int getMdQuoteType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdQuoteTypeField));
    }
    public NoMdEntries setMdQuoteType(final int value) {
      setField(FieldValue.to(mdQuoteTypeField, value));
      return this;
    }
    public NoMdEntries setMdQuoteType(final quickfix.field.MDQuoteType value) {
      setField(FieldValue.to(mdQuoteTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField rptSeqField = FieldFactory.newIntField(83);
    public boolean hasRptSeq() throws quickfix.FieldNotFound {
      return isSetField(83);
    }
    public int getRptSeq() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(rptSeqField));
    }
    public NoMdEntries setRptSeq(final int value) {
      setField(FieldValue.to(rptSeqField, value));
      return this;
    }
    public NoMdEntries setRptSeq(final quickfix.field.RptSeq value) {
      setField(FieldValue.to(rptSeqField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField dealingCapacityField = FieldFactory.newCharField(1048);
    public boolean hasDealingCapacity() throws quickfix.FieldNotFound {
      return isSetField(1048);
    }
    public int getDealingCapacity() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(dealingCapacityField));
    }
    public NoMdEntries setDealingCapacity(final int value) {
      setField(FieldValue.to(dealingCapacityField, value));
      return this;
    }
    public NoMdEntries setDealingCapacity(final char value) {
      setField(FieldValue.to(dealingCapacityField, value));
      return this;
    }
    public NoMdEntries setDealingCapacity(final String value) {
      setField(FieldValue.to(dealingCapacityField, value));
      return this;
    }
    public NoMdEntries setDealingCapacity(final quickfix.field.DealingCapacity value) {
      setField(FieldValue.to(dealingCapacityField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField mdEntrySpotRateField = FieldFactory.newDoubleField(1026);
    public boolean hasMdEntrySpotRate() throws quickfix.FieldNotFound {
      return isSetField(1026);
    }
    public double getMdEntrySpotRate() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntrySpotRateField));
    }
    public NoMdEntries setMdEntrySpotRate(final double value) {
      setField(FieldValue.to(mdEntrySpotRateField, value));
      return this;
    }
    public NoMdEntries setMdEntrySpotRate(final quickfix.field.MDEntrySpotRate value) {
      setField(FieldValue.to(mdEntrySpotRateField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField mdEntryForwardPointsField =
        FieldFactory.newDoubleField(1027);
    public boolean hasMdEntryForwardPoints() throws quickfix.FieldNotFound {
      return isSetField(1027);
    }
    public double getMdEntryForwardPoints() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(mdEntryForwardPointsField));
    }
    public NoMdEntries setMdEntryForwardPoints(final double value) {
      setField(FieldValue.to(mdEntryForwardPointsField, value));
      return this;
    }
    public NoMdEntries setMdEntryForwardPoints(final quickfix.field.MDEntryForwardPoints value) {
      setField(FieldValue.to(mdEntryForwardPointsField, FieldValue.of(value)));
      return this;
    }

    public NoMdEntries() {
      super(268, 269,
          new int[] {269, 278, 270, 423, 235, 236, 701, 696, 697, 698, 218, 220, 221, 222, 662, 663,
              699, 761, 40, 15, 120, 271, 1093, 272, 273, 274, 275, 336, 625, 326, 327, 276, 277,
              282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 198, 299, 288, 289, 346, 290, 546,
              811, 828, 58, 354, 355, 1023, 528, 1024, 332, 333, 1025, 31, 1020, 63, 64, 1070, 83,
              1048, 1026, 1027, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoMdEntries proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoRateSourcesCount(); i++) {
        final NoMdEntries.NoRateSources group = new NoMdEntries.NoRateSources();
        group.fromProto(proto.getNoRateSources(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoOfSecSizesCount(); i++) {
        final NoMdEntries.NoOfSecSizes group = new NoMdEntries.NoOfSecSizes();
        group.fromProto(proto.getNoOfSecSizes(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoPartyIdsCount(); i++) {
        final NoMdEntries.NoPartyIds group = new NoMdEntries.NoPartyIds();
        group.fromProto(proto.getNoPartyIds(i));
        this.addGroupRef(group);
      }
      if (fieldPresence.getMdEntryType()) {
        this.setMdEntryType(proto.getMdEntryType());
      }
      if (fieldPresence.getMdEntryId()) {
        this.setMdEntryId(proto.getMdEntryId());
      }
      if (fieldPresence.getMdEntryPx()) {
        this.setMdEntryPx(proto.getMdEntryPx());
      }
      if (fieldPresence.getPriceType()) {
        this.setPriceType(proto.getPriceType());
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
      if (fieldPresence.getOrdType()) {
        this.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getCurrency()) {
        this.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getSettlCurrency()) {
        this.setSettlCurrency(proto.getSettlCurrency());
      }
      if (fieldPresence.getMdEntrySize()) {
        this.setMdEntrySize(proto.getMdEntrySize());
      }
      if (fieldPresence.getLotType()) {
        this.setLotType(proto.getLotType());
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
      if (fieldPresence.getSecurityTradingStatus()) {
        this.setSecurityTradingStatus(proto.getSecurityTradingStatus());
      }
      if (fieldPresence.getHaltReason()) {
        this.setHaltReason(proto.getHaltReason());
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
      if (fieldPresence.getSecondaryOrderId()) {
        this.setSecondaryOrderId(proto.getSecondaryOrderId());
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
      if (fieldPresence.getTrdType()) {
        this.setTrdType(proto.getTrdType());
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
      if (fieldPresence.getMdPriceLevel()) {
        this.setMdPriceLevel(proto.getMdPriceLevel());
      }
      if (fieldPresence.getOrderCapacity()) {
        this.setOrderCapacity(proto.getOrderCapacity());
      }
      if (fieldPresence.getMdOriginType()) {
        this.setMdOriginType(proto.getMdOriginType());
      }
      if (fieldPresence.getHighPx()) {
        this.setHighPx(proto.getHighPx());
      }
      if (fieldPresence.getLowPx()) {
        this.setLowPx(proto.getLowPx());
      }
      if (fieldPresence.getFirstPx()) {
        this.setFirstPx(proto.getFirstPx());
      }
      if (fieldPresence.getLastPx()) {
        this.setLastPx(proto.getLastPx());
      }
      if (fieldPresence.getTradeVolume()) {
        this.setTradeVolume(proto.getTradeVolume());
      }
      if (fieldPresence.getSettlType()) {
        this.setSettlType(proto.getSettlType());
      }
      if (fieldPresence.getSettlDate()) {
        this.setSettlDate(proto.getSettlDate());
      }
      if (fieldPresence.getMdQuoteType()) {
        this.setMdQuoteType(proto.getMdQuoteType());
      }
      if (fieldPresence.getRptSeq()) {
        this.setRptSeq(proto.getRptSeq());
      }
      if (fieldPresence.getDealingCapacity()) {
        this.setDealingCapacity(proto.getDealingCapacity());
      }
      if (fieldPresence.getMdEntrySpotRate()) {
        this.setMdEntrySpotRate(proto.getMdEntrySpotRate());
      }
      if (fieldPresence.getMdEntryForwardPoints()) {
        this.setMdEntryForwardPoints(proto.getMdEntryForwardPoints());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
        .Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoMdEntries.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoMdEntries
              .FieldPresence.newBuilder();

      final int noRateSourcesGroupCount = this.getGroupCount(1445);
      for (int i = 1; i <= noRateSourcesGroupCount; i++) {
        final NoMdEntries.NoRateSources group = new NoMdEntries.NoRateSources();
        this.getGroup(i, group);
        builder.addNoRateSources(group.toBuilder().build());
      }

      final int noOfSecSizesGroupCount = this.getGroupCount(1177);
      for (int i = 1; i <= noOfSecSizesGroupCount; i++) {
        final NoMdEntries.NoOfSecSizes group = new NoMdEntries.NoOfSecSizes();
        this.getGroup(i, group);
        builder.addNoOfSecSizes(group.toBuilder().build());
      }

      final int noPartyIdsGroupCount = this.getGroupCount(453);
      for (int i = 1; i <= noPartyIdsGroupCount; i++) {
        final NoMdEntries.NoPartyIds group = new NoMdEntries.NoPartyIds();
        this.getGroup(i, group);
        builder.addNoPartyIds(group.toBuilder().build());
      }

      if (this.hasMdEntryType()) {
        builder.setMdEntryType(this.getMdEntryType());
        presenceBuilder.setMdEntryType(true);
      }
      if (this.hasMdEntryId()) {
        builder.setMdEntryId(this.getMdEntryId());
        presenceBuilder.setMdEntryId(true);
      }
      if (this.hasMdEntryPx()) {
        builder.setMdEntryPx(this.getMdEntryPx());
        presenceBuilder.setMdEntryPx(true);
      }
      if (this.hasPriceType()) {
        builder.setPriceType(this.getPriceType());
        presenceBuilder.setPriceType(true);
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
      if (this.hasOrdType()) {
        builder.setOrdType(this.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (this.hasCurrency()) {
        builder.setCurrency(this.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (this.hasSettlCurrency()) {
        builder.setSettlCurrency(this.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
      }
      if (this.hasMdEntrySize()) {
        builder.setMdEntrySize(this.getMdEntrySize());
        presenceBuilder.setMdEntrySize(true);
      }
      if (this.hasLotType()) {
        builder.setLotType(this.getLotType());
        presenceBuilder.setLotType(true);
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
      if (this.hasSecurityTradingStatus()) {
        builder.setSecurityTradingStatus(this.getSecurityTradingStatus());
        presenceBuilder.setSecurityTradingStatus(true);
      }
      if (this.hasHaltReason()) {
        builder.setHaltReason(this.getHaltReason());
        presenceBuilder.setHaltReason(true);
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
      if (this.hasSecondaryOrderId()) {
        builder.setSecondaryOrderId(this.getSecondaryOrderId());
        presenceBuilder.setSecondaryOrderId(true);
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
      if (this.hasTrdType()) {
        builder.setTrdType(this.getTrdType());
        presenceBuilder.setTrdType(true);
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
      if (this.hasMdPriceLevel()) {
        builder.setMdPriceLevel(this.getMdPriceLevel());
        presenceBuilder.setMdPriceLevel(true);
      }
      if (this.hasOrderCapacity()) {
        builder.setOrderCapacity(this.getOrderCapacity());
        presenceBuilder.setOrderCapacity(true);
      }
      if (this.hasMdOriginType()) {
        builder.setMdOriginType(this.getMdOriginType());
        presenceBuilder.setMdOriginType(true);
      }
      if (this.hasHighPx()) {
        builder.setHighPx(this.getHighPx());
        presenceBuilder.setHighPx(true);
      }
      if (this.hasLowPx()) {
        builder.setLowPx(this.getLowPx());
        presenceBuilder.setLowPx(true);
      }
      if (this.hasFirstPx()) {
        builder.setFirstPx(this.getFirstPx());
        presenceBuilder.setFirstPx(true);
      }
      if (this.hasLastPx()) {
        builder.setLastPx(this.getLastPx());
        presenceBuilder.setLastPx(true);
      }
      if (this.hasTradeVolume()) {
        builder.setTradeVolume(this.getTradeVolume());
        presenceBuilder.setTradeVolume(true);
      }
      if (this.hasSettlType()) {
        builder.setSettlType(this.getSettlType());
        presenceBuilder.setSettlType(true);
      }
      if (this.hasSettlDate()) {
        builder.setSettlDate(this.getSettlDate());
        presenceBuilder.setSettlDate(true);
      }
      if (this.hasMdQuoteType()) {
        builder.setMdQuoteType(this.getMdQuoteType());
        presenceBuilder.setMdQuoteType(true);
      }
      if (this.hasRptSeq()) {
        builder.setRptSeq(this.getRptSeq());
        presenceBuilder.setRptSeq(true);
      }
      if (this.hasDealingCapacity()) {
        builder.setDealingCapacity(this.getDealingCapacity());
        presenceBuilder.setDealingCapacity(true);
      }
      if (this.hasMdEntrySpotRate()) {
        builder.setMdEntrySpotRate(this.getMdEntrySpotRate());
        presenceBuilder.setMdEntrySpotRate(true);
      }
      if (this.hasMdEntryForwardPoints()) {
        builder.setMdEntryForwardPoints(this.getMdEntryForwardPoints());
        presenceBuilder.setMdEntryForwardPoints(true);
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos
                              .MarketDataSnapshotFullRefresh.NoRoutingIds proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoRoutingIds
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getRoutingType()) {
        this.setRoutingType(proto.getRoutingType());
      }
      if (fieldPresence.getRoutingId()) {
        this.setRoutingId(proto.getRoutingId());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoRoutingIds
        .Builder
        toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoRoutingIds
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                 .MarketDataSnapshotFullRefresh.NoRoutingIds.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoRoutingIds
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.NoRoutingIds
              .FieldPresence.newBuilder();

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

  private final quickfix.StringField applIdField = FieldFactory.newStringField(1180);
  public boolean hasApplId() throws quickfix.FieldNotFound {
    return isSetField(1180);
  }
  public String getApplId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applIdField));
  }
  public MarketDataSnapshotFullRefresh setApplId(final String value) {
    setField(FieldValue.to(applIdField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplId(final quickfix.field.ApplID value) {
    setField(FieldValue.to(applIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField applSeqNumField = FieldFactory.newIntField(1181);
  public boolean hasApplSeqNum() throws quickfix.FieldNotFound {
    return isSetField(1181);
  }
  public int getApplSeqNum() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applSeqNumField));
  }
  public MarketDataSnapshotFullRefresh setApplSeqNum(final int value) {
    setField(FieldValue.to(applSeqNumField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplSeqNum(final quickfix.field.ApplSeqNum value) {
    setField(FieldValue.to(applSeqNumField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField applLastSeqNumField = FieldFactory.newIntField(1350);
  public boolean hasApplLastSeqNum() throws quickfix.FieldNotFound {
    return isSetField(1350);
  }
  public int getApplLastSeqNum() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applLastSeqNumField));
  }
  public MarketDataSnapshotFullRefresh setApplLastSeqNum(final int value) {
    setField(FieldValue.to(applLastSeqNumField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplLastSeqNum(
      final quickfix.field.ApplLastSeqNum value) {
    setField(FieldValue.to(applLastSeqNumField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField applResendFlagField = FieldFactory.newBooleanField(1352);
  public boolean hasApplResendFlag() throws quickfix.FieldNotFound {
    return isSetField(1352);
  }
  public boolean getApplResendFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applResendFlagField));
  }
  public MarketDataSnapshotFullRefresh setApplResendFlag(final boolean value) {
    setField(FieldValue.to(applResendFlagField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplResendFlag(
      final quickfix.field.ApplResendFlag value) {
    setField(FieldValue.to(applResendFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField totNumReportsField = FieldFactory.newIntField(911);
  public boolean hasTotNumReports() throws quickfix.FieldNotFound {
    return isSetField(911);
  }
  public int getTotNumReports() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(totNumReportsField));
  }
  public MarketDataSnapshotFullRefresh setTotNumReports(final int value) {
    setField(FieldValue.to(totNumReportsField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setTotNumReports(final quickfix.field.TotNumReports value) {
    setField(FieldValue.to(totNumReportsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField mdReportIdField = FieldFactory.newIntField(963);
  public boolean hasMdReportId() throws quickfix.FieldNotFound {
    return isSetField(963);
  }
  public int getMdReportId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdReportIdField));
  }
  public MarketDataSnapshotFullRefresh setMdReportId(final int value) {
    setField(FieldValue.to(mdReportIdField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdReportId(final quickfix.field.MDReportID value) {
    setField(FieldValue.to(mdReportIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clearingBusinessDateField = FieldFactory.newStringField(715);
  public boolean hasClearingBusinessDate() throws quickfix.FieldNotFound {
    return isSetField(715);
  }
  public String getClearingBusinessDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clearingBusinessDateField));
  }
  public MarketDataSnapshotFullRefresh setClearingBusinessDate(final String value) {
    setField(FieldValue.to(clearingBusinessDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setClearingBusinessDate(
      final quickfix.field.ClearingBusinessDate value) {
    setField(FieldValue.to(clearingBusinessDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField mdBookTypeField = FieldFactory.newIntField(1021);
  public boolean hasMdBookType() throws quickfix.FieldNotFound {
    return isSetField(1021);
  }
  public int getMdBookType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdBookTypeField));
  }
  public MarketDataSnapshotFullRefresh setMdBookType(final int value) {
    setField(FieldValue.to(mdBookTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdBookType(final quickfix.field.MDBookType value) {
    setField(FieldValue.to(mdBookTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField mdSubBookTypeField = FieldFactory.newIntField(1173);
  public boolean hasMdSubBookType() throws quickfix.FieldNotFound {
    return isSetField(1173);
  }
  public int getMdSubBookType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdSubBookTypeField));
  }
  public MarketDataSnapshotFullRefresh setMdSubBookType(final int value) {
    setField(FieldValue.to(mdSubBookTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdSubBookType(final quickfix.field.MDSubBookType value) {
    setField(FieldValue.to(mdSubBookTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField marketDepthField = FieldFactory.newIntField(264);
  public boolean hasMarketDepth() throws quickfix.FieldNotFound {
    return isSetField(264);
  }
  public int getMarketDepth() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(marketDepthField));
  }
  public MarketDataSnapshotFullRefresh setMarketDepth(final int value) {
    setField(FieldValue.to(marketDepthField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMarketDepth(final quickfix.field.MarketDepth value) {
    setField(FieldValue.to(marketDepthField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField mdFeedTypeField = FieldFactory.newStringField(1022);
  public boolean hasMdFeedType() throws quickfix.FieldNotFound {
    return isSetField(1022);
  }
  public String getMdFeedType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdFeedTypeField));
  }
  public MarketDataSnapshotFullRefresh setMdFeedType(final String value) {
    setField(FieldValue.to(mdFeedTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdFeedType(final quickfix.field.MDFeedType value) {
    setField(FieldValue.to(mdFeedTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField refreshIndicatorField = FieldFactory.newBooleanField(1187);
  public boolean hasRefreshIndicator() throws quickfix.FieldNotFound {
    return isSetField(1187);
  }
  public boolean getRefreshIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(refreshIndicatorField));
  }
  public MarketDataSnapshotFullRefresh setRefreshIndicator(final boolean value) {
    setField(FieldValue.to(refreshIndicatorField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRefreshIndicator(
      final quickfix.field.RefreshIndicator value) {
    setField(FieldValue.to(refreshIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeDateField = FieldFactory.newStringField(75);
  public boolean hasTradeDate() throws quickfix.FieldNotFound {
    return isSetField(75);
  }
  public String getTradeDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeDateField));
  }
  public MarketDataSnapshotFullRefresh setTradeDate(final String value) {
    setField(FieldValue.to(tradeDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setTradeDate(final quickfix.field.TradeDate value) {
    setField(FieldValue.to(tradeDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField mdReqIdField = FieldFactory.newStringField(262);
  public boolean hasMdReqId() throws quickfix.FieldNotFound {
    return isSetField(262);
  }
  public String getMdReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdReqIdField));
  }
  public MarketDataSnapshotFullRefresh setMdReqId(final String value) {
    setField(FieldValue.to(mdReqIdField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdReqId(final quickfix.field.MDReqID value) {
    setField(FieldValue.to(mdReqIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField mdStreamIdField = FieldFactory.newStringField(1500);
  public boolean hasMdStreamId() throws quickfix.FieldNotFound {
    return isSetField(1500);
  }
  public String getMdStreamId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(mdStreamIdField));
  }
  public MarketDataSnapshotFullRefresh setMdStreamId(final String value) {
    setField(FieldValue.to(mdStreamIdField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMdStreamId(final quickfix.field.MDStreamID value) {
    setField(FieldValue.to(mdStreamIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public MarketDataSnapshotFullRefresh setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSymbol(final quickfix.field.Symbol value) {
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
  public MarketDataSnapshotFullRefresh setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public MarketDataSnapshotFullRefresh setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityId(final quickfix.field.SecurityID value) {
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
  public MarketDataSnapshotFullRefresh setSecurityIdSource(final String value) {
    setField(FieldValue.to(securityIdSourceField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityIdSource(
      final quickfix.field.SecurityIDSource value) {
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
  public MarketDataSnapshotFullRefresh setProduct(final int value) {
    setField(FieldValue.to(productField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setProduct(final quickfix.field.Product value) {
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
  public MarketDataSnapshotFullRefresh setProductComplex(final String value) {
    setField(FieldValue.to(productComplexField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setProductComplex(
      final quickfix.field.ProductComplex value) {
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
  public MarketDataSnapshotFullRefresh setSecurityGroup(final String value) {
    setField(FieldValue.to(securityGroupField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityGroup(final quickfix.field.SecurityGroup value) {
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
  public MarketDataSnapshotFullRefresh setCfiCode(final String value) {
    setField(FieldValue.to(cfiCodeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCfiCode(final quickfix.field.CFICode value) {
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
  public MarketDataSnapshotFullRefresh setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityType(final quickfix.field.SecurityType value) {
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
  public MarketDataSnapshotFullRefresh setSecuritySubType(final String value) {
    setField(FieldValue.to(securitySubTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecuritySubType(
      final quickfix.field.SecuritySubType value) {
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
  public MarketDataSnapshotFullRefresh setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMaturityMonthYear(
      final quickfix.field.MaturityMonthYear value) {
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
  public MarketDataSnapshotFullRefresh setMaturityDate(final String value) {
    setField(FieldValue.to(maturityDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMaturityDate(final quickfix.field.MaturityDate value) {
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
  public MarketDataSnapshotFullRefresh setMaturityTime(final String value) {
    setField(FieldValue.to(maturityTimeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMaturityTime(final quickfix.field.MaturityTime value) {
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
  public MarketDataSnapshotFullRefresh setSettleOnOpenFlag(final String value) {
    setField(FieldValue.to(settleOnOpenFlagField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSettleOnOpenFlag(
      final quickfix.field.SettleOnOpenFlag value) {
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
  public MarketDataSnapshotFullRefresh setInstrmtAssignmentMethod(final int value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setInstrmtAssignmentMethod(final char value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setInstrmtAssignmentMethod(final String value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setInstrmtAssignmentMethod(
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
  public MarketDataSnapshotFullRefresh setSecurityStatus(final String value) {
    setField(FieldValue.to(securityStatusField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityStatus(
      final quickfix.field.SecurityStatus value) {
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
  public MarketDataSnapshotFullRefresh setCouponPaymentDate(final String value) {
    setField(FieldValue.to(couponPaymentDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCouponPaymentDate(
      final quickfix.field.CouponPaymentDate value) {
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
  public MarketDataSnapshotFullRefresh setRestructuringType(final String value) {
    setField(FieldValue.to(restructuringTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRestructuringType(
      final quickfix.field.RestructuringType value) {
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
  public MarketDataSnapshotFullRefresh setSeniority(final String value) {
    setField(FieldValue.to(seniorityField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSeniority(final quickfix.field.Seniority value) {
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
  public MarketDataSnapshotFullRefresh setNotionalPercentageOutstanding(final double value) {
    setField(FieldValue.to(notionalPercentageOutstandingField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setNotionalPercentageOutstanding(
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
  public MarketDataSnapshotFullRefresh setOriginalNotionalPercentageOutstanding(
      final double value) {
    setField(FieldValue.to(originalNotionalPercentageOutstandingField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOriginalNotionalPercentageOutstanding(
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
  public MarketDataSnapshotFullRefresh setAttachmentPoint(final double value) {
    setField(FieldValue.to(attachmentPointField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setAttachmentPoint(
      final quickfix.field.AttachmentPoint value) {
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
  public MarketDataSnapshotFullRefresh setDetachmentPoint(final double value) {
    setField(FieldValue.to(detachmentPointField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setDetachmentPoint(
      final quickfix.field.DetachmentPoint value) {
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
  public MarketDataSnapshotFullRefresh setIssueDate(final String value) {
    setField(FieldValue.to(issueDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setIssueDate(final quickfix.field.IssueDate value) {
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
  public MarketDataSnapshotFullRefresh setRepoCollateralSecurityType(final String value) {
    setField(FieldValue.to(repoCollateralSecurityTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRepoCollateralSecurityType(
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
  public MarketDataSnapshotFullRefresh setRepurchaseTerm(final int value) {
    setField(FieldValue.to(repurchaseTermField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRepurchaseTerm(
      final quickfix.field.RepurchaseTerm value) {
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
  public MarketDataSnapshotFullRefresh setRepurchaseRate(final double value) {
    setField(FieldValue.to(repurchaseRateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRepurchaseRate(
      final quickfix.field.RepurchaseRate value) {
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
  public MarketDataSnapshotFullRefresh setFactor(final double value) {
    setField(FieldValue.to(factorField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFactor(final quickfix.field.Factor value) {
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
  public MarketDataSnapshotFullRefresh setCreditRating(final String value) {
    setField(FieldValue.to(creditRatingField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCreditRating(final quickfix.field.CreditRating value) {
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
  public MarketDataSnapshotFullRefresh setInstrRegistry(final String value) {
    setField(FieldValue.to(instrRegistryField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setInstrRegistry(final quickfix.field.InstrRegistry value) {
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
  public MarketDataSnapshotFullRefresh setCountryOfIssue(final String value) {
    setField(FieldValue.to(countryOfIssueField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCountryOfIssue(
      final quickfix.field.CountryOfIssue value) {
    setField(FieldValue.to(countryOfIssueField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField stateOrProvinceOfIssueField = FieldFactory.newStringField(471);
  public boolean hasStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
    return isSetField(471);
  }
  public String getStateOrProvinceOfIssue() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(stateOrProvinceOfIssueField));
  }
  public MarketDataSnapshotFullRefresh setStateOrProvinceOfIssue(final String value) {
    setField(FieldValue.to(stateOrProvinceOfIssueField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStateOrProvinceOfIssue(
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
  public MarketDataSnapshotFullRefresh setLocaleOfIssue(final String value) {
    setField(FieldValue.to(localeOfIssueField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
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
  public MarketDataSnapshotFullRefresh setRedemptionDate(final String value) {
    setField(FieldValue.to(redemptionDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setRedemptionDate(
      final quickfix.field.RedemptionDate value) {
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
  public MarketDataSnapshotFullRefresh setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public MarketDataSnapshotFullRefresh setStrikeCurrency(final String value) {
    setField(FieldValue.to(strikeCurrencyField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikeCurrency(
      final quickfix.field.StrikeCurrency value) {
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
  public MarketDataSnapshotFullRefresh setStrikeMultiplier(final double value) {
    setField(FieldValue.to(strikeMultiplierField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikeMultiplier(
      final quickfix.field.StrikeMultiplier value) {
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
  public MarketDataSnapshotFullRefresh setStrikeValue(final double value) {
    setField(FieldValue.to(strikeValueField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikeValue(final quickfix.field.StrikeValue value) {
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
  public MarketDataSnapshotFullRefresh setStrikePriceDeterminationMethod(final int value) {
    setField(FieldValue.to(strikePriceDeterminationMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikePriceDeterminationMethod(
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
  public MarketDataSnapshotFullRefresh setStrikePriceBoundaryMethod(final int value) {
    setField(FieldValue.to(strikePriceBoundaryMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikePriceBoundaryMethod(
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
  public MarketDataSnapshotFullRefresh setStrikePriceBoundaryPrecision(final double value) {
    setField(FieldValue.to(strikePriceBoundaryPrecisionField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setStrikePriceBoundaryPrecision(
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
  public MarketDataSnapshotFullRefresh setUnderlyingPriceDeterminationMethod(final int value) {
    setField(FieldValue.to(underlyingPriceDeterminationMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setUnderlyingPriceDeterminationMethod(
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
  public MarketDataSnapshotFullRefresh setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public MarketDataSnapshotFullRefresh setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setContractMultiplier(
      final quickfix.field.ContractMultiplier value) {
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
  public MarketDataSnapshotFullRefresh setContractMultiplierUnit(final int value) {
    setField(FieldValue.to(contractMultiplierUnitField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setContractMultiplierUnit(
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
  public MarketDataSnapshotFullRefresh setFlowScheduleType(final int value) {
    setField(FieldValue.to(flowScheduleTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFlowScheduleType(
      final quickfix.field.FlowScheduleType value) {
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
  public MarketDataSnapshotFullRefresh setMinPriceIncrement(final double value) {
    setField(FieldValue.to(minPriceIncrementField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMinPriceIncrement(
      final quickfix.field.MinPriceIncrement value) {
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
  public MarketDataSnapshotFullRefresh setMinPriceIncrementAmount(final double value) {
    setField(FieldValue.to(minPriceIncrementAmountField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setMinPriceIncrementAmount(
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
  public MarketDataSnapshotFullRefresh setUnitOfMeasure(final String value) {
    setField(FieldValue.to(unitOfMeasureField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setUnitOfMeasure(final quickfix.field.UnitOfMeasure value) {
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
  public MarketDataSnapshotFullRefresh setUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(unitOfMeasureQtyField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setUnitOfMeasureQty(
      final quickfix.field.UnitOfMeasureQty value) {
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
  public MarketDataSnapshotFullRefresh setPriceUnitOfMeasure(final String value) {
    setField(FieldValue.to(priceUnitOfMeasureField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPriceUnitOfMeasure(
      final quickfix.field.PriceUnitOfMeasure value) {
    setField(FieldValue.to(priceUnitOfMeasureField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField priceUnitOfMeasureQtyField = FieldFactory.newDoubleField(1192);
  public boolean hasPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
    return isSetField(1192);
  }
  public double getPriceUnitOfMeasureQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceUnitOfMeasureQtyField));
  }
  public MarketDataSnapshotFullRefresh setPriceUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(priceUnitOfMeasureQtyField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPriceUnitOfMeasureQty(
      final quickfix.field.PriceUnitOfMeasureQty value) {
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
  public MarketDataSnapshotFullRefresh setSettlMethod(final int value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSettlMethod(final char value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSettlMethod(final String value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSettlMethod(final quickfix.field.SettlMethod value) {
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
  public MarketDataSnapshotFullRefresh setExerciseStyle(final int value) {
    setField(FieldValue.to(exerciseStyleField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setExerciseStyle(final quickfix.field.ExerciseStyle value) {
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
  public MarketDataSnapshotFullRefresh setOptPayoutType(final int value) {
    setField(FieldValue.to(optPayoutTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOptPayoutType(final quickfix.field.OptPayoutType value) {
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
  public MarketDataSnapshotFullRefresh setOptPayoutAmount(final double value) {
    setField(FieldValue.to(optPayoutAmountField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setOptPayoutAmount(
      final quickfix.field.OptPayoutAmount value) {
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
  public MarketDataSnapshotFullRefresh setPriceQuoteMethod(final String value) {
    setField(FieldValue.to(priceQuoteMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPriceQuoteMethod(
      final quickfix.field.PriceQuoteMethod value) {
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
  public MarketDataSnapshotFullRefresh setValuationMethod(final String value) {
    setField(FieldValue.to(valuationMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setValuationMethod(
      final quickfix.field.ValuationMethod value) {
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
  public MarketDataSnapshotFullRefresh setListMethod(final int value) {
    setField(FieldValue.to(listMethodField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setListMethod(final quickfix.field.ListMethod value) {
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
  public MarketDataSnapshotFullRefresh setCapPrice(final double value) {
    setField(FieldValue.to(capPriceField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCapPrice(final quickfix.field.CapPrice value) {
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
  public MarketDataSnapshotFullRefresh setFloorPrice(final double value) {
    setField(FieldValue.to(floorPriceField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFloorPrice(final quickfix.field.FloorPrice value) {
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
  public MarketDataSnapshotFullRefresh setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public MarketDataSnapshotFullRefresh setFlexibleIndicator(final boolean value) {
    setField(FieldValue.to(flexibleIndicatorField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFlexibleIndicator(
      final quickfix.field.FlexibleIndicator value) {
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
  public MarketDataSnapshotFullRefresh setFlexProductEligibilityIndicator(final boolean value) {
    setField(FieldValue.to(flexProductEligibilityIndicatorField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFlexProductEligibilityIndicator(
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
  public MarketDataSnapshotFullRefresh setTimeUnit(final String value) {
    setField(FieldValue.to(timeUnitField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setTimeUnit(final quickfix.field.TimeUnit value) {
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
  public MarketDataSnapshotFullRefresh setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCouponRate(final quickfix.field.CouponRate value) {
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
  public MarketDataSnapshotFullRefresh setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityExchange(
      final quickfix.field.SecurityExchange value) {
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
  public MarketDataSnapshotFullRefresh setPositionLimit(final int value) {
    setField(FieldValue.to(positionLimitField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPositionLimit(final quickfix.field.PositionLimit value) {
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
  public MarketDataSnapshotFullRefresh setNtPositionLimit(final int value) {
    setField(FieldValue.to(ntPositionLimitField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setNtPositionLimit(
      final quickfix.field.NTPositionLimit value) {
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
  public MarketDataSnapshotFullRefresh setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setIssuer(final quickfix.field.Issuer value) {
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
  public MarketDataSnapshotFullRefresh setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setEncodedIssuerLen(
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
  public MarketDataSnapshotFullRefresh setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public MarketDataSnapshotFullRefresh setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public MarketDataSnapshotFullRefresh setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setEncodedSecurityDescLen(
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
  public MarketDataSnapshotFullRefresh setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setEncodedSecurityDesc(
      final quickfix.field.EncodedSecurityDesc value) {
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
  public MarketDataSnapshotFullRefresh setSecurityXmlLen(final int value) {
    setField(FieldValue.to(securityXmlLenField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityXmlLen(
      final quickfix.field.SecurityXMLLen value) {
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
  public MarketDataSnapshotFullRefresh setSecurityXmlData(final String value) {
    setField(FieldValue.to(securityXmlDataField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityXmlData(
      final quickfix.field.SecurityXMLData value) {
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
  public MarketDataSnapshotFullRefresh setSecurityXmlSchema(final String value) {
    setField(FieldValue.to(securityXmlSchemaField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setSecurityXmlSchema(
      final quickfix.field.SecurityXMLSchema value) {
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
  public MarketDataSnapshotFullRefresh setPool(final String value) {
    setField(FieldValue.to(poolField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setPool(final quickfix.field.Pool value) {
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
  public MarketDataSnapshotFullRefresh setContractSettlMonth(final String value) {
    setField(FieldValue.to(contractSettlMonthField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setContractSettlMonth(
      final quickfix.field.ContractSettlMonth value) {
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
  public MarketDataSnapshotFullRefresh setCpProgram(final int value) {
    setField(FieldValue.to(cpProgramField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCpProgram(final quickfix.field.CPProgram value) {
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
  public MarketDataSnapshotFullRefresh setCpRegType(final String value) {
    setField(FieldValue.to(cpRegTypeField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCpRegType(final quickfix.field.CPRegType value) {
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
  public MarketDataSnapshotFullRefresh setDatedDate(final String value) {
    setField(FieldValue.to(datedDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setDatedDate(final quickfix.field.DatedDate value) {
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
  public MarketDataSnapshotFullRefresh setInterestAccrualDate(final String value) {
    setField(FieldValue.to(interestAccrualDateField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setInterestAccrualDate(
      final quickfix.field.InterestAccrualDate value) {
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
  public MarketDataSnapshotFullRefresh setFinancialStatus(final String value) {
    setField(FieldValue.to(financialStatusField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setFinancialStatus(
      final quickfix.field.FinancialStatus value) {
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
  public MarketDataSnapshotFullRefresh setCorporateAction(final String value) {
    setField(FieldValue.to(corporateActionField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setCorporateAction(
      final quickfix.field.CorporateAction value) {
    setField(FieldValue.to(corporateActionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField netChgPrevDayField = FieldFactory.newDoubleField(451);
  public boolean hasNetChgPrevDay() throws quickfix.FieldNotFound {
    return isSetField(451);
  }
  public double getNetChgPrevDay() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(netChgPrevDayField));
  }
  public MarketDataSnapshotFullRefresh setNetChgPrevDay(final double value) {
    setField(FieldValue.to(netChgPrevDayField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setNetChgPrevDay(final quickfix.field.NetChgPrevDay value) {
    setField(FieldValue.to(netChgPrevDayField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField applQueueDepthField = FieldFactory.newIntField(813);
  public boolean hasApplQueueDepth() throws quickfix.FieldNotFound {
    return isSetField(813);
  }
  public int getApplQueueDepth() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(applQueueDepthField));
  }
  public MarketDataSnapshotFullRefresh setApplQueueDepth(final int value) {
    setField(FieldValue.to(applQueueDepthField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplQueueDepth(
      final quickfix.field.ApplQueueDepth value) {
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
  public MarketDataSnapshotFullRefresh setApplQueueResolution(final int value) {
    setField(FieldValue.to(applQueueResolutionField, value));
    return this;
  }
  public MarketDataSnapshotFullRefresh setApplQueueResolution(
      final quickfix.field.ApplQueueResolution value) {
    setField(FieldValue.to(applQueueResolutionField, FieldValue.of(value)));
    return this;
  }

  public MarketDataSnapshotFullRefresh() {
    super(new int[] {1180, 1181, 1350, 1352, 911, 963, 715, 1021, 1173, 264, 1022, 1187, 75, 262,
        1500, 55, 65, 48, 22, 460, 1227, 1151, 461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224,
        1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240,
        202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147,
        1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223,
        207, 970, 971, 106, 348, 349, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 873, 874,
        291, 292, 451, 813, 814, 0});
  }

  public MarketDataSnapshotFullRefresh(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {1180, 1181, 1350, 1352, 911, 963, 715, 1021, 1173, 264, 1022, 1187, 75, 262,
        1500, 55, 65, 48, 22, 460, 1227, 1151, 461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224,
        1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240,
        202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147,
        1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223,
        207, 970, 971, 106, 348, 349, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 873, 874,
        291, 292, 451, 813, 814, 0});
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

  public static Function<garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh,
      garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh> fixToProto =
      (fix) -> {
    if (fix == null) {
      return garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .getDefaultInstance();
    }

    final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.Builder builder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.newBuilder();
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh.FieldPresence
        .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos
                                       .MarketDataSnapshotFullRefresh.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix50sp2.Header header =
        (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasApplId()) {
        builder.setApplId(fix.getApplId());
        presenceBuilder.setApplId(true);
      }
      if (fix.hasApplSeqNum()) {
        builder.setApplSeqNum(fix.getApplSeqNum());
        presenceBuilder.setApplSeqNum(true);
      }
      if (fix.hasApplLastSeqNum()) {
        builder.setApplLastSeqNum(fix.getApplLastSeqNum());
        presenceBuilder.setApplLastSeqNum(true);
      }
      if (fix.hasApplResendFlag()) {
        builder.setApplResendFlag(fix.getApplResendFlag());
        presenceBuilder.setApplResendFlag(true);
      }
      if (fix.hasTotNumReports()) {
        builder.setTotNumReports(fix.getTotNumReports());
        presenceBuilder.setTotNumReports(true);
      }
      if (fix.hasMdReportId()) {
        builder.setMdReportId(fix.getMdReportId());
        presenceBuilder.setMdReportId(true);
      }
      if (fix.hasClearingBusinessDate()) {
        builder.setClearingBusinessDate(fix.getClearingBusinessDate());
        presenceBuilder.setClearingBusinessDate(true);
      }
      if (fix.hasMdBookType()) {
        builder.setMdBookType(fix.getMdBookType());
        presenceBuilder.setMdBookType(true);
      }
      if (fix.hasMdSubBookType()) {
        builder.setMdSubBookType(fix.getMdSubBookType());
        presenceBuilder.setMdSubBookType(true);
      }
      if (fix.hasMarketDepth()) {
        builder.setMarketDepth(fix.getMarketDepth());
        presenceBuilder.setMarketDepth(true);
      }
      if (fix.hasMdFeedType()) {
        builder.setMdFeedType(fix.getMdFeedType());
        presenceBuilder.setMdFeedType(true);
      }
      if (fix.hasRefreshIndicator()) {
        builder.setRefreshIndicator(fix.getRefreshIndicator());
        presenceBuilder.setRefreshIndicator(true);
      }
      if (fix.hasTradeDate()) {
        builder.setTradeDate(fix.getTradeDate());
        presenceBuilder.setTradeDate(true);
      }
      if (fix.hasMdReqId()) {
        builder.setMdReqId(fix.getMdReqId());
        presenceBuilder.setMdReqId(true);
      }
      if (fix.hasMdStreamId()) {
        builder.setMdStreamId(fix.getMdStreamId());
        presenceBuilder.setMdStreamId(true);
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
      if (fix.hasSecurityIdSource()) {
        builder.setSecurityIdSource(fix.getSecurityIdSource());
        presenceBuilder.setSecurityIdSource(true);
      }
      if (fix.hasProduct()) {
        builder.setProduct(fix.getProduct());
        presenceBuilder.setProduct(true);
      }
      if (fix.hasProductComplex()) {
        builder.setProductComplex(fix.getProductComplex());
        presenceBuilder.setProductComplex(true);
      }
      if (fix.hasSecurityGroup()) {
        builder.setSecurityGroup(fix.getSecurityGroup());
        presenceBuilder.setSecurityGroup(true);
      }
      if (fix.hasCfiCode()) {
        builder.setCfiCode(fix.getCfiCode());
        presenceBuilder.setCfiCode(true);
      }
      if (fix.hasSecurityType()) {
        builder.setSecurityType(fix.getSecurityType());
        presenceBuilder.setSecurityType(true);
      }
      if (fix.hasSecuritySubType()) {
        builder.setSecuritySubType(fix.getSecuritySubType());
        presenceBuilder.setSecuritySubType(true);
      }
      if (fix.hasMaturityMonthYear()) {
        builder.setMaturityMonthYear(fix.getMaturityMonthYear());
        presenceBuilder.setMaturityMonthYear(true);
      }
      if (fix.hasMaturityDate()) {
        builder.setMaturityDate(fix.getMaturityDate());
        presenceBuilder.setMaturityDate(true);
      }
      if (fix.hasMaturityTime()) {
        builder.setMaturityTime(fix.getMaturityTime());
        presenceBuilder.setMaturityTime(true);
      }
      if (fix.hasSettleOnOpenFlag()) {
        builder.setSettleOnOpenFlag(fix.getSettleOnOpenFlag());
        presenceBuilder.setSettleOnOpenFlag(true);
      }
      if (fix.hasInstrmtAssignmentMethod()) {
        builder.setInstrmtAssignmentMethod(fix.getInstrmtAssignmentMethod());
        presenceBuilder.setInstrmtAssignmentMethod(true);
      }
      if (fix.hasSecurityStatus()) {
        builder.setSecurityStatus(fix.getSecurityStatus());
        presenceBuilder.setSecurityStatus(true);
      }
      if (fix.hasCouponPaymentDate()) {
        builder.setCouponPaymentDate(fix.getCouponPaymentDate());
        presenceBuilder.setCouponPaymentDate(true);
      }
      if (fix.hasRestructuringType()) {
        builder.setRestructuringType(fix.getRestructuringType());
        presenceBuilder.setRestructuringType(true);
      }
      if (fix.hasSeniority()) {
        builder.setSeniority(fix.getSeniority());
        presenceBuilder.setSeniority(true);
      }
      if (fix.hasNotionalPercentageOutstanding()) {
        builder.setNotionalPercentageOutstanding(fix.getNotionalPercentageOutstanding());
        presenceBuilder.setNotionalPercentageOutstanding(true);
      }
      if (fix.hasOriginalNotionalPercentageOutstanding()) {
        builder.setOriginalNotionalPercentageOutstanding(
            fix.getOriginalNotionalPercentageOutstanding());
        presenceBuilder.setOriginalNotionalPercentageOutstanding(true);
      }
      if (fix.hasAttachmentPoint()) {
        builder.setAttachmentPoint(fix.getAttachmentPoint());
        presenceBuilder.setAttachmentPoint(true);
      }
      if (fix.hasDetachmentPoint()) {
        builder.setDetachmentPoint(fix.getDetachmentPoint());
        presenceBuilder.setDetachmentPoint(true);
      }
      if (fix.hasIssueDate()) {
        builder.setIssueDate(fix.getIssueDate());
        presenceBuilder.setIssueDate(true);
      }
      if (fix.hasRepoCollateralSecurityType()) {
        builder.setRepoCollateralSecurityType(fix.getRepoCollateralSecurityType());
        presenceBuilder.setRepoCollateralSecurityType(true);
      }
      if (fix.hasRepurchaseTerm()) {
        builder.setRepurchaseTerm(fix.getRepurchaseTerm());
        presenceBuilder.setRepurchaseTerm(true);
      }
      if (fix.hasRepurchaseRate()) {
        builder.setRepurchaseRate(fix.getRepurchaseRate());
        presenceBuilder.setRepurchaseRate(true);
      }
      if (fix.hasFactor()) {
        builder.setFactor(fix.getFactor());
        presenceBuilder.setFactor(true);
      }
      if (fix.hasCreditRating()) {
        builder.setCreditRating(fix.getCreditRating());
        presenceBuilder.setCreditRating(true);
      }
      if (fix.hasInstrRegistry()) {
        builder.setInstrRegistry(fix.getInstrRegistry());
        presenceBuilder.setInstrRegistry(true);
      }
      if (fix.hasCountryOfIssue()) {
        builder.setCountryOfIssue(fix.getCountryOfIssue());
        presenceBuilder.setCountryOfIssue(true);
      }
      if (fix.hasStateOrProvinceOfIssue()) {
        builder.setStateOrProvinceOfIssue(fix.getStateOrProvinceOfIssue());
        presenceBuilder.setStateOrProvinceOfIssue(true);
      }
      if (fix.hasLocaleOfIssue()) {
        builder.setLocaleOfIssue(fix.getLocaleOfIssue());
        presenceBuilder.setLocaleOfIssue(true);
      }
      if (fix.hasRedemptionDate()) {
        builder.setRedemptionDate(fix.getRedemptionDate());
        presenceBuilder.setRedemptionDate(true);
      }
      if (fix.hasStrikePrice()) {
        builder.setStrikePrice(fix.getStrikePrice());
        presenceBuilder.setStrikePrice(true);
      }
      if (fix.hasStrikeCurrency()) {
        builder.setStrikeCurrency(fix.getStrikeCurrency());
        presenceBuilder.setStrikeCurrency(true);
      }
      if (fix.hasStrikeMultiplier()) {
        builder.setStrikeMultiplier(fix.getStrikeMultiplier());
        presenceBuilder.setStrikeMultiplier(true);
      }
      if (fix.hasStrikeValue()) {
        builder.setStrikeValue(fix.getStrikeValue());
        presenceBuilder.setStrikeValue(true);
      }
      if (fix.hasStrikePriceDeterminationMethod()) {
        builder.setStrikePriceDeterminationMethod(fix.getStrikePriceDeterminationMethod());
        presenceBuilder.setStrikePriceDeterminationMethod(true);
      }
      if (fix.hasStrikePriceBoundaryMethod()) {
        builder.setStrikePriceBoundaryMethod(fix.getStrikePriceBoundaryMethod());
        presenceBuilder.setStrikePriceBoundaryMethod(true);
      }
      if (fix.hasStrikePriceBoundaryPrecision()) {
        builder.setStrikePriceBoundaryPrecision(fix.getStrikePriceBoundaryPrecision());
        presenceBuilder.setStrikePriceBoundaryPrecision(true);
      }
      if (fix.hasUnderlyingPriceDeterminationMethod()) {
        builder.setUnderlyingPriceDeterminationMethod(fix.getUnderlyingPriceDeterminationMethod());
        presenceBuilder.setUnderlyingPriceDeterminationMethod(true);
      }
      if (fix.hasOptAttribute()) {
        builder.setOptAttribute(fix.getOptAttribute());
        presenceBuilder.setOptAttribute(true);
      }
      if (fix.hasContractMultiplier()) {
        builder.setContractMultiplier(fix.getContractMultiplier());
        presenceBuilder.setContractMultiplier(true);
      }
      if (fix.hasContractMultiplierUnit()) {
        builder.setContractMultiplierUnit(fix.getContractMultiplierUnit());
        presenceBuilder.setContractMultiplierUnit(true);
      }
      if (fix.hasFlowScheduleType()) {
        builder.setFlowScheduleType(fix.getFlowScheduleType());
        presenceBuilder.setFlowScheduleType(true);
      }
      if (fix.hasMinPriceIncrement()) {
        builder.setMinPriceIncrement(fix.getMinPriceIncrement());
        presenceBuilder.setMinPriceIncrement(true);
      }
      if (fix.hasMinPriceIncrementAmount()) {
        builder.setMinPriceIncrementAmount(fix.getMinPriceIncrementAmount());
        presenceBuilder.setMinPriceIncrementAmount(true);
      }
      if (fix.hasUnitOfMeasure()) {
        builder.setUnitOfMeasure(fix.getUnitOfMeasure());
        presenceBuilder.setUnitOfMeasure(true);
      }
      if (fix.hasUnitOfMeasureQty()) {
        builder.setUnitOfMeasureQty(fix.getUnitOfMeasureQty());
        presenceBuilder.setUnitOfMeasureQty(true);
      }
      if (fix.hasPriceUnitOfMeasure()) {
        builder.setPriceUnitOfMeasure(fix.getPriceUnitOfMeasure());
        presenceBuilder.setPriceUnitOfMeasure(true);
      }
      if (fix.hasPriceUnitOfMeasureQty()) {
        builder.setPriceUnitOfMeasureQty(fix.getPriceUnitOfMeasureQty());
        presenceBuilder.setPriceUnitOfMeasureQty(true);
      }
      if (fix.hasSettlMethod()) {
        builder.setSettlMethod(fix.getSettlMethod());
        presenceBuilder.setSettlMethod(true);
      }
      if (fix.hasExerciseStyle()) {
        builder.setExerciseStyle(fix.getExerciseStyle());
        presenceBuilder.setExerciseStyle(true);
      }
      if (fix.hasOptPayoutType()) {
        builder.setOptPayoutType(fix.getOptPayoutType());
        presenceBuilder.setOptPayoutType(true);
      }
      if (fix.hasOptPayoutAmount()) {
        builder.setOptPayoutAmount(fix.getOptPayoutAmount());
        presenceBuilder.setOptPayoutAmount(true);
      }
      if (fix.hasPriceQuoteMethod()) {
        builder.setPriceQuoteMethod(fix.getPriceQuoteMethod());
        presenceBuilder.setPriceQuoteMethod(true);
      }
      if (fix.hasValuationMethod()) {
        builder.setValuationMethod(fix.getValuationMethod());
        presenceBuilder.setValuationMethod(true);
      }
      if (fix.hasListMethod()) {
        builder.setListMethod(fix.getListMethod());
        presenceBuilder.setListMethod(true);
      }
      if (fix.hasCapPrice()) {
        builder.setCapPrice(fix.getCapPrice());
        presenceBuilder.setCapPrice(true);
      }
      if (fix.hasFloorPrice()) {
        builder.setFloorPrice(fix.getFloorPrice());
        presenceBuilder.setFloorPrice(true);
      }
      if (fix.hasPutOrCall()) {
        builder.setPutOrCall(fix.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (fix.hasFlexibleIndicator()) {
        builder.setFlexibleIndicator(fix.getFlexibleIndicator());
        presenceBuilder.setFlexibleIndicator(true);
      }
      if (fix.hasFlexProductEligibilityIndicator()) {
        builder.setFlexProductEligibilityIndicator(fix.getFlexProductEligibilityIndicator());
        presenceBuilder.setFlexProductEligibilityIndicator(true);
      }
      if (fix.hasTimeUnit()) {
        builder.setTimeUnit(fix.getTimeUnit());
        presenceBuilder.setTimeUnit(true);
      }
      if (fix.hasCouponRate()) {
        builder.setCouponRate(fix.getCouponRate());
        presenceBuilder.setCouponRate(true);
      }
      if (fix.hasSecurityExchange()) {
        builder.setSecurityExchange(fix.getSecurityExchange());
        presenceBuilder.setSecurityExchange(true);
      }
      if (fix.hasPositionLimit()) {
        builder.setPositionLimit(fix.getPositionLimit());
        presenceBuilder.setPositionLimit(true);
      }
      if (fix.hasNtPositionLimit()) {
        builder.setNtPositionLimit(fix.getNtPositionLimit());
        presenceBuilder.setNtPositionLimit(true);
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
      if (fix.hasSecurityXmlLen()) {
        builder.setSecurityXmlLen(fix.getSecurityXmlLen());
        presenceBuilder.setSecurityXmlLen(true);
      }
      if (fix.hasSecurityXmlData()) {
        builder.setSecurityXmlData(fix.getSecurityXmlData());
        presenceBuilder.setSecurityXmlData(true);
      }
      if (fix.hasSecurityXmlSchema()) {
        builder.setSecurityXmlSchema(fix.getSecurityXmlSchema());
        presenceBuilder.setSecurityXmlSchema(true);
      }
      if (fix.hasPool()) {
        builder.setPool(fix.getPool());
        presenceBuilder.setPool(true);
      }
      if (fix.hasContractSettlMonth()) {
        builder.setContractSettlMonth(fix.getContractSettlMonth());
        presenceBuilder.setContractSettlMonth(true);
      }
      if (fix.hasCpProgram()) {
        builder.setCpProgram(fix.getCpProgram());
        presenceBuilder.setCpProgram(true);
      }
      if (fix.hasCpRegType()) {
        builder.setCpRegType(fix.getCpRegType());
        presenceBuilder.setCpRegType(true);
      }
      if (fix.hasDatedDate()) {
        builder.setDatedDate(fix.getDatedDate());
        presenceBuilder.setDatedDate(true);
      }
      if (fix.hasInterestAccrualDate()) {
        builder.setInterestAccrualDate(fix.getInterestAccrualDate());
        presenceBuilder.setInterestAccrualDate(true);
      }
      if (fix.hasFinancialStatus()) {
        builder.setFinancialStatus(fix.getFinancialStatus());
        presenceBuilder.setFinancialStatus(true);
      }
      if (fix.hasCorporateAction()) {
        builder.setCorporateAction(fix.getCorporateAction());
        presenceBuilder.setCorporateAction(true);
      }
      if (fix.hasNetChgPrevDay()) {
        builder.setNetChgPrevDay(fix.getNetChgPrevDay());
        presenceBuilder.setNetChgPrevDay(true);
      }
      if (fix.hasApplQueueDepth()) {
        builder.setApplQueueDepth(fix.getApplQueueDepth());
        presenceBuilder.setApplQueueDepth(true);
      }
      if (fix.hasApplQueueResolution()) {
        builder.setApplQueueResolution(fix.getApplQueueResolution());
        presenceBuilder.setApplQueueResolution(true);
      }
      final int noSecurityAltIdGroupCount = fix.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoSecurityAltId group =
            new MarketDataSnapshotFullRefresh.NoSecurityAltId();
        fix.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = fix.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoEvents group =
            new MarketDataSnapshotFullRefresh.NoEvents();
        fix.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noInstrumentPartiesGroupCount = fix.getGroupCount(1018);
      for (int i = 1; i <= noInstrumentPartiesGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoInstrumentParties group =
            new MarketDataSnapshotFullRefresh.NoInstrumentParties();
        fix.getGroup(i, group);
        builder.addNoInstrumentParties(group.toBuilder().build());
      }

      final int noComplexEventsGroupCount = fix.getGroupCount(1483);
      for (int i = 1; i <= noComplexEventsGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoComplexEvents group =
            new MarketDataSnapshotFullRefresh.NoComplexEvents();
        fix.getGroup(i, group);
        builder.addNoComplexEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = fix.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoUnderlyings group =
            new MarketDataSnapshotFullRefresh.NoUnderlyings();
        fix.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noLegsGroupCount = fix.getGroupCount(555);
      for (int i = 1; i <= noLegsGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoLegs group =
            new MarketDataSnapshotFullRefresh.NoLegs();
        fix.getGroup(i, group);
        builder.addNoLegs(group.toBuilder().build());
      }

      final int noMdEntriesGroupCount = fix.getGroupCount(268);
      for (int i = 1; i <= noMdEntriesGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoMdEntries group =
            new MarketDataSnapshotFullRefresh.NoMdEntries();
        fix.getGroup(i, group);
        builder.addNoMdEntries(group.toBuilder().build());
      }

      final int noRoutingIdsGroupCount = fix.getGroupCount(215);
      for (int i = 1; i <= noRoutingIdsGroupCount; i++) {
        final MarketDataSnapshotFullRefresh.NoRoutingIds group =
            new MarketDataSnapshotFullRefresh.NoRoutingIds();
        fix.getGroup(i, group);
        builder.addNoRoutingIds(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("marketDataSnapshotFullRefresh error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh,
      garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh> protoToFix =
      (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh fix =
          new garden_leave.gateway.transform.fix50sp2.MarketDataSnapshotFullRefresh();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix50sp2.Header header =
          (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix50sp2.proto.FIX50SP2Protos.MarketDataSnapshotFullRefresh
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getApplId()) {
        fix.setApplId(proto.getApplId());
      }
      if (fieldPresence.getApplSeqNum()) {
        fix.setApplSeqNum(proto.getApplSeqNum());
      }
      if (fieldPresence.getApplLastSeqNum()) {
        fix.setApplLastSeqNum(proto.getApplLastSeqNum());
      }
      if (fieldPresence.getApplResendFlag()) {
        fix.setApplResendFlag(proto.getApplResendFlag());
      }
      if (fieldPresence.getTotNumReports()) {
        fix.setTotNumReports(proto.getTotNumReports());
      }
      if (fieldPresence.getMdReportId()) {
        fix.setMdReportId(proto.getMdReportId());
      }
      if (fieldPresence.getClearingBusinessDate()) {
        fix.setClearingBusinessDate(proto.getClearingBusinessDate());
      }
      if (fieldPresence.getMdBookType()) {
        fix.setMdBookType(proto.getMdBookType());
      }
      if (fieldPresence.getMdSubBookType()) {
        fix.setMdSubBookType(proto.getMdSubBookType());
      }
      if (fieldPresence.getMarketDepth()) {
        fix.setMarketDepth(proto.getMarketDepth());
      }
      if (fieldPresence.getMdFeedType()) {
        fix.setMdFeedType(proto.getMdFeedType());
      }
      if (fieldPresence.getRefreshIndicator()) {
        fix.setRefreshIndicator(proto.getRefreshIndicator());
      }
      if (fieldPresence.getTradeDate()) {
        fix.setTradeDate(proto.getTradeDate());
      }
      if (fieldPresence.getMdReqId()) {
        fix.setMdReqId(proto.getMdReqId());
      }
      if (fieldPresence.getMdStreamId()) {
        fix.setMdStreamId(proto.getMdStreamId());
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
      if (fieldPresence.getSecurityIdSource()) {
        fix.setSecurityIdSource(proto.getSecurityIdSource());
      }
      if (fieldPresence.getProduct()) {
        fix.setProduct(proto.getProduct());
      }
      if (fieldPresence.getProductComplex()) {
        fix.setProductComplex(proto.getProductComplex());
      }
      if (fieldPresence.getSecurityGroup()) {
        fix.setSecurityGroup(proto.getSecurityGroup());
      }
      if (fieldPresence.getCfiCode()) {
        fix.setCfiCode(proto.getCfiCode());
      }
      if (fieldPresence.getSecurityType()) {
        fix.setSecurityType(proto.getSecurityType());
      }
      if (fieldPresence.getSecuritySubType()) {
        fix.setSecuritySubType(proto.getSecuritySubType());
      }
      if (fieldPresence.getMaturityMonthYear()) {
        fix.setMaturityMonthYear(proto.getMaturityMonthYear());
      }
      if (fieldPresence.getMaturityDate()) {
        fix.setMaturityDate(proto.getMaturityDate());
      }
      if (fieldPresence.getMaturityTime()) {
        fix.setMaturityTime(proto.getMaturityTime());
      }
      if (fieldPresence.getSettleOnOpenFlag()) {
        fix.setSettleOnOpenFlag(proto.getSettleOnOpenFlag());
      }
      if (fieldPresence.getInstrmtAssignmentMethod()) {
        fix.setInstrmtAssignmentMethod(proto.getInstrmtAssignmentMethod());
      }
      if (fieldPresence.getSecurityStatus()) {
        fix.setSecurityStatus(proto.getSecurityStatus());
      }
      if (fieldPresence.getCouponPaymentDate()) {
        fix.setCouponPaymentDate(proto.getCouponPaymentDate());
      }
      if (fieldPresence.getRestructuringType()) {
        fix.setRestructuringType(proto.getRestructuringType());
      }
      if (fieldPresence.getSeniority()) {
        fix.setSeniority(proto.getSeniority());
      }
      if (fieldPresence.getNotionalPercentageOutstanding()) {
        fix.setNotionalPercentageOutstanding(proto.getNotionalPercentageOutstanding());
      }
      if (fieldPresence.getOriginalNotionalPercentageOutstanding()) {
        fix.setOriginalNotionalPercentageOutstanding(
            proto.getOriginalNotionalPercentageOutstanding());
      }
      if (fieldPresence.getAttachmentPoint()) {
        fix.setAttachmentPoint(proto.getAttachmentPoint());
      }
      if (fieldPresence.getDetachmentPoint()) {
        fix.setDetachmentPoint(proto.getDetachmentPoint());
      }
      if (fieldPresence.getIssueDate()) {
        fix.setIssueDate(proto.getIssueDate());
      }
      if (fieldPresence.getRepoCollateralSecurityType()) {
        fix.setRepoCollateralSecurityType(proto.getRepoCollateralSecurityType());
      }
      if (fieldPresence.getRepurchaseTerm()) {
        fix.setRepurchaseTerm(proto.getRepurchaseTerm());
      }
      if (fieldPresence.getRepurchaseRate()) {
        fix.setRepurchaseRate(proto.getRepurchaseRate());
      }
      if (fieldPresence.getFactor()) {
        fix.setFactor(proto.getFactor());
      }
      if (fieldPresence.getCreditRating()) {
        fix.setCreditRating(proto.getCreditRating());
      }
      if (fieldPresence.getInstrRegistry()) {
        fix.setInstrRegistry(proto.getInstrRegistry());
      }
      if (fieldPresence.getCountryOfIssue()) {
        fix.setCountryOfIssue(proto.getCountryOfIssue());
      }
      if (fieldPresence.getStateOrProvinceOfIssue()) {
        fix.setStateOrProvinceOfIssue(proto.getStateOrProvinceOfIssue());
      }
      if (fieldPresence.getLocaleOfIssue()) {
        fix.setLocaleOfIssue(proto.getLocaleOfIssue());
      }
      if (fieldPresence.getRedemptionDate()) {
        fix.setRedemptionDate(proto.getRedemptionDate());
      }
      if (fieldPresence.getStrikePrice()) {
        fix.setStrikePrice(proto.getStrikePrice());
      }
      if (fieldPresence.getStrikeCurrency()) {
        fix.setStrikeCurrency(proto.getStrikeCurrency());
      }
      if (fieldPresence.getStrikeMultiplier()) {
        fix.setStrikeMultiplier(proto.getStrikeMultiplier());
      }
      if (fieldPresence.getStrikeValue()) {
        fix.setStrikeValue(proto.getStrikeValue());
      }
      if (fieldPresence.getStrikePriceDeterminationMethod()) {
        fix.setStrikePriceDeterminationMethod(proto.getStrikePriceDeterminationMethod());
      }
      if (fieldPresence.getStrikePriceBoundaryMethod()) {
        fix.setStrikePriceBoundaryMethod(proto.getStrikePriceBoundaryMethod());
      }
      if (fieldPresence.getStrikePriceBoundaryPrecision()) {
        fix.setStrikePriceBoundaryPrecision(proto.getStrikePriceBoundaryPrecision());
      }
      if (fieldPresence.getUnderlyingPriceDeterminationMethod()) {
        fix.setUnderlyingPriceDeterminationMethod(proto.getUnderlyingPriceDeterminationMethod());
      }
      if (fieldPresence.getOptAttribute()) {
        fix.setOptAttribute(proto.getOptAttribute());
      }
      if (fieldPresence.getContractMultiplier()) {
        fix.setContractMultiplier(proto.getContractMultiplier());
      }
      if (fieldPresence.getContractMultiplierUnit()) {
        fix.setContractMultiplierUnit(proto.getContractMultiplierUnit());
      }
      if (fieldPresence.getFlowScheduleType()) {
        fix.setFlowScheduleType(proto.getFlowScheduleType());
      }
      if (fieldPresence.getMinPriceIncrement()) {
        fix.setMinPriceIncrement(proto.getMinPriceIncrement());
      }
      if (fieldPresence.getMinPriceIncrementAmount()) {
        fix.setMinPriceIncrementAmount(proto.getMinPriceIncrementAmount());
      }
      if (fieldPresence.getUnitOfMeasure()) {
        fix.setUnitOfMeasure(proto.getUnitOfMeasure());
      }
      if (fieldPresence.getUnitOfMeasureQty()) {
        fix.setUnitOfMeasureQty(proto.getUnitOfMeasureQty());
      }
      if (fieldPresence.getPriceUnitOfMeasure()) {
        fix.setPriceUnitOfMeasure(proto.getPriceUnitOfMeasure());
      }
      if (fieldPresence.getPriceUnitOfMeasureQty()) {
        fix.setPriceUnitOfMeasureQty(proto.getPriceUnitOfMeasureQty());
      }
      if (fieldPresence.getSettlMethod()) {
        fix.setSettlMethod(proto.getSettlMethod());
      }
      if (fieldPresence.getExerciseStyle()) {
        fix.setExerciseStyle(proto.getExerciseStyle());
      }
      if (fieldPresence.getOptPayoutType()) {
        fix.setOptPayoutType(proto.getOptPayoutType());
      }
      if (fieldPresence.getOptPayoutAmount()) {
        fix.setOptPayoutAmount(proto.getOptPayoutAmount());
      }
      if (fieldPresence.getPriceQuoteMethod()) {
        fix.setPriceQuoteMethod(proto.getPriceQuoteMethod());
      }
      if (fieldPresence.getValuationMethod()) {
        fix.setValuationMethod(proto.getValuationMethod());
      }
      if (fieldPresence.getListMethod()) {
        fix.setListMethod(proto.getListMethod());
      }
      if (fieldPresence.getCapPrice()) {
        fix.setCapPrice(proto.getCapPrice());
      }
      if (fieldPresence.getFloorPrice()) {
        fix.setFloorPrice(proto.getFloorPrice());
      }
      if (fieldPresence.getPutOrCall()) {
        fix.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getFlexibleIndicator()) {
        fix.setFlexibleIndicator(proto.getFlexibleIndicator());
      }
      if (fieldPresence.getFlexProductEligibilityIndicator()) {
        fix.setFlexProductEligibilityIndicator(proto.getFlexProductEligibilityIndicator());
      }
      if (fieldPresence.getTimeUnit()) {
        fix.setTimeUnit(proto.getTimeUnit());
      }
      if (fieldPresence.getCouponRate()) {
        fix.setCouponRate(proto.getCouponRate());
      }
      if (fieldPresence.getSecurityExchange()) {
        fix.setSecurityExchange(proto.getSecurityExchange());
      }
      if (fieldPresence.getPositionLimit()) {
        fix.setPositionLimit(proto.getPositionLimit());
      }
      if (fieldPresence.getNtPositionLimit()) {
        fix.setNtPositionLimit(proto.getNtPositionLimit());
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
      if (fieldPresence.getSecurityXmlLen()) {
        fix.setSecurityXmlLen(proto.getSecurityXmlLen());
      }
      if (fieldPresence.getSecurityXmlData()) {
        fix.setSecurityXmlData(proto.getSecurityXmlData());
      }
      if (fieldPresence.getSecurityXmlSchema()) {
        fix.setSecurityXmlSchema(proto.getSecurityXmlSchema());
      }
      if (fieldPresence.getPool()) {
        fix.setPool(proto.getPool());
      }
      if (fieldPresence.getContractSettlMonth()) {
        fix.setContractSettlMonth(proto.getContractSettlMonth());
      }
      if (fieldPresence.getCpProgram()) {
        fix.setCpProgram(proto.getCpProgram());
      }
      if (fieldPresence.getCpRegType()) {
        fix.setCpRegType(proto.getCpRegType());
      }
      if (fieldPresence.getDatedDate()) {
        fix.setDatedDate(proto.getDatedDate());
      }
      if (fieldPresence.getInterestAccrualDate()) {
        fix.setInterestAccrualDate(proto.getInterestAccrualDate());
      }
      if (fieldPresence.getFinancialStatus()) {
        fix.setFinancialStatus(proto.getFinancialStatus());
      }
      if (fieldPresence.getCorporateAction()) {
        fix.setCorporateAction(proto.getCorporateAction());
      }
      if (fieldPresence.getNetChgPrevDay()) {
        fix.setNetChgPrevDay(proto.getNetChgPrevDay());
      }
      if (fieldPresence.getApplQueueDepth()) {
        fix.setApplQueueDepth(proto.getApplQueueDepth());
      }
      if (fieldPresence.getApplQueueResolution()) {
        fix.setApplQueueResolution(proto.getApplQueueResolution());
      }
      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoSecurityAltId group =
            new MarketDataSnapshotFullRefresh.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoEvents group =
            new MarketDataSnapshotFullRefresh.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoInstrumentPartiesCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoInstrumentParties group =
            new MarketDataSnapshotFullRefresh.NoInstrumentParties();
        group.fromProto(proto.getNoInstrumentParties(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoComplexEventsCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoComplexEvents group =
            new MarketDataSnapshotFullRefresh.NoComplexEvents();
        group.fromProto(proto.getNoComplexEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoUnderlyings group =
            new MarketDataSnapshotFullRefresh.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoLegsCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoLegs group =
            new MarketDataSnapshotFullRefresh.NoLegs();
        group.fromProto(proto.getNoLegs(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoMdEntriesCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoMdEntries group =
            new MarketDataSnapshotFullRefresh.NoMdEntries();
        group.fromProto(proto.getNoMdEntries(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoRoutingIdsCount(); i++) {
        final MarketDataSnapshotFullRefresh.NoRoutingIds group =
            new MarketDataSnapshotFullRefresh.NoRoutingIds();
        group.fromProto(proto.getNoRoutingIds(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
