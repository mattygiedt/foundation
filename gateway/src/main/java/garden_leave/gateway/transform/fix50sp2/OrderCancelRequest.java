package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.347617900
//

public final class OrderCancelRequest extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(OrderCancelRequest.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(OrderCancelRequest.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public OrderCancelRequest setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.5.0";
  public static final String MSGTYPE = "F";

  public final String UUID = java.util.UUID.randomUUID().toString();

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoPartyIds.NoPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.NoPartySubIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getPartySubId()) {
          this.setPartySubId(proto.getPartySubId());
        }
        if (fieldPresence.getPartySubIdType()) {
          this.setPartySubIdType(proto.getPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.NoPartySubIds
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.NoPartySubIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                   .NoPartyIds.NoPartySubIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.NoPartySubIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.NoPartySubIds
                .FieldPresence.newBuilder();

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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoPartyIds.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getSecurityAltId()) {
        this.setSecurityAltId(proto.getSecurityAltId());
      }
      if (fieldPresence.getSecurityAltIdSource()) {
        this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                 .NoSecurityAltId.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoSecurityAltId
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoEvents.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                         .NoEvents.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoInstrumentParties.NoInstrumentPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
            .NoInstrumentPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getInstrumentPartySubId()) {
          this.setInstrumentPartySubId(proto.getInstrumentPartySubId());
        }
        if (fieldPresence.getInstrumentPartySubIdType()) {
          this.setInstrumentPartySubIdType(proto.getInstrumentPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
          .NoInstrumentPartySubIds.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
            .NoInstrumentPartySubIds.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
                .NoInstrumentPartySubIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
            .NoInstrumentPartySubIds.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
                .NoInstrumentPartySubIds.FieldPresence.newBuilder();

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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                              .NoInstrumentParties proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
          .FieldPresence fieldPresence = proto.getFieldPresence();

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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                 .NoInstrumentParties.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoInstrumentParties
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                  .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getComplexEventStartTime()) {
            this.setComplexEventStartTime(proto.getComplexEventStartTime());
          }
          if (fieldPresence.getComplexEventEndTime()) {
            this.setComplexEventEndTime(proto.getComplexEventEndTime());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
            .NoComplexEventDates.NoComplexEventTimes.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
                  .NoComplexEventDates.NoComplexEventTimes.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoComplexEvents.NoComplexEventDates proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
          .NoComplexEventDates.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
            .NoComplexEventDates.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
                .NoComplexEventDates.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
            .NoComplexEventDates.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                 .NoComplexEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoComplexEvents
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoUnderlyings.NoUnderlyingSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingSecurityAltId()) {
          this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
        }
        if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
          this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
          .NoUnderlyingSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
                .NoUnderlyingSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoUnderlyings.NoUnderlyingStips proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingStips.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingStipType()) {
          this.setUnderlyingStipType(proto.getUnderlyingStipType());
        }
        if (fieldPresence.getUnderlyingStipValue()) {
          this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
          .NoUnderlyingStips.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingStips.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
                .NoUnderlyingStips.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
                .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
              .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
                  .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
              .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence
              .Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
                                .NoUnderlyings.NoUndlyInstrumentParties proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
          .NoUndlyInstrumentParties.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUndlyInstrumentParties.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
                .NoUndlyInstrumentParties.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
            .NoUndlyInstrumentParties.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.NoUnderlyings.FieldPresence
              .newBuilder();

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

  private final quickfix.StringField origClOrdIdField = FieldFactory.newStringField(41);
  public boolean hasOrigClOrdId() throws quickfix.FieldNotFound {
    return isSetField(41);
  }
  public String getOrigClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origClOrdIdField));
  }
  public OrderCancelRequest setOrigClOrdId(final String value) {
    setField(FieldValue.to(origClOrdIdField, value));
    return this;
  }
  public OrderCancelRequest setOrigClOrdId(final quickfix.field.OrigClOrdID value) {
    setField(FieldValue.to(origClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField orderIdField = FieldFactory.newStringField(37);
  public boolean hasOrderId() throws quickfix.FieldNotFound {
    return isSetField(37);
  }
  public String getOrderId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderIdField));
  }
  public OrderCancelRequest setOrderId(final String value) {
    setField(FieldValue.to(orderIdField, value));
    return this;
  }
  public OrderCancelRequest setOrderId(final quickfix.field.OrderID value) {
    setField(FieldValue.to(orderIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public OrderCancelRequest setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public OrderCancelRequest setClOrdId(final quickfix.field.ClOrdID value) {
    setField(FieldValue.to(clOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField secondaryClOrdIdField = FieldFactory.newStringField(526);
  public boolean hasSecondaryClOrdId() throws quickfix.FieldNotFound {
    return isSetField(526);
  }
  public String getSecondaryClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryClOrdIdField));
  }
  public OrderCancelRequest setSecondaryClOrdId(final String value) {
    setField(FieldValue.to(secondaryClOrdIdField, value));
    return this;
  }
  public OrderCancelRequest setSecondaryClOrdId(final quickfix.field.SecondaryClOrdID value) {
    setField(FieldValue.to(secondaryClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdLinkIdField = FieldFactory.newStringField(583);
  public boolean hasClOrdLinkId() throws quickfix.FieldNotFound {
    return isSetField(583);
  }
  public String getClOrdLinkId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdLinkIdField));
  }
  public OrderCancelRequest setClOrdLinkId(final String value) {
    setField(FieldValue.to(clOrdLinkIdField, value));
    return this;
  }
  public OrderCancelRequest setClOrdLinkId(final quickfix.field.ClOrdLinkID value) {
    setField(FieldValue.to(clOrdLinkIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField listIdField = FieldFactory.newStringField(66);
  public boolean hasListId() throws quickfix.FieldNotFound {
    return isSetField(66);
  }
  public String getListId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(listIdField));
  }
  public OrderCancelRequest setListId(final String value) {
    setField(FieldValue.to(listIdField, value));
    return this;
  }
  public OrderCancelRequest setListId(final quickfix.field.ListID value) {
    setField(FieldValue.to(listIdField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField origOrdModTimeField =
      FieldFactory.newTimeStampField(586);
  public boolean hasOrigOrdModTime() throws quickfix.FieldNotFound {
    return isSetField(586);
  }
  public long getOrigOrdModTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origOrdModTimeField));
  }
  public OrderCancelRequest setOrigOrdModTime(final long value) {
    setField(FieldValue.to(origOrdModTimeField, value));
    return this;
  }
  public OrderCancelRequest setOrigOrdModTime(final quickfix.field.OrigOrdModTime value) {
    setField(FieldValue.to(origOrdModTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField accountField = FieldFactory.newStringField(1);
  public boolean hasAccount() throws quickfix.FieldNotFound {
    return isSetField(1);
  }
  public String getAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountField));
  }
  public OrderCancelRequest setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public OrderCancelRequest setAccount(final quickfix.field.Account value) {
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
  public OrderCancelRequest setAcctIdSource(final int value) {
    setField(FieldValue.to(acctIdSourceField, value));
    return this;
  }
  public OrderCancelRequest setAcctIdSource(final quickfix.field.AcctIDSource value) {
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
  public OrderCancelRequest setAccountType(final int value) {
    setField(FieldValue.to(accountTypeField, value));
    return this;
  }
  public OrderCancelRequest setAccountType(final quickfix.field.AccountType value) {
    setField(FieldValue.to(accountTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public OrderCancelRequest setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public OrderCancelRequest setSymbol(final quickfix.field.Symbol value) {
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
  public OrderCancelRequest setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public OrderCancelRequest setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public OrderCancelRequest setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public OrderCancelRequest setSecurityId(final quickfix.field.SecurityID value) {
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
  public OrderCancelRequest setSecurityIdSource(final String value) {
    setField(FieldValue.to(securityIdSourceField, value));
    return this;
  }
  public OrderCancelRequest setSecurityIdSource(final quickfix.field.SecurityIDSource value) {
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
  public OrderCancelRequest setProduct(final int value) {
    setField(FieldValue.to(productField, value));
    return this;
  }
  public OrderCancelRequest setProduct(final quickfix.field.Product value) {
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
  public OrderCancelRequest setProductComplex(final String value) {
    setField(FieldValue.to(productComplexField, value));
    return this;
  }
  public OrderCancelRequest setProductComplex(final quickfix.field.ProductComplex value) {
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
  public OrderCancelRequest setSecurityGroup(final String value) {
    setField(FieldValue.to(securityGroupField, value));
    return this;
  }
  public OrderCancelRequest setSecurityGroup(final quickfix.field.SecurityGroup value) {
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
  public OrderCancelRequest setCfiCode(final String value) {
    setField(FieldValue.to(cfiCodeField, value));
    return this;
  }
  public OrderCancelRequest setCfiCode(final quickfix.field.CFICode value) {
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
  public OrderCancelRequest setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public OrderCancelRequest setSecurityType(final quickfix.field.SecurityType value) {
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
  public OrderCancelRequest setSecuritySubType(final String value) {
    setField(FieldValue.to(securitySubTypeField, value));
    return this;
  }
  public OrderCancelRequest setSecuritySubType(final quickfix.field.SecuritySubType value) {
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
  public OrderCancelRequest setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public OrderCancelRequest setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public OrderCancelRequest setMaturityDate(final String value) {
    setField(FieldValue.to(maturityDateField, value));
    return this;
  }
  public OrderCancelRequest setMaturityDate(final quickfix.field.MaturityDate value) {
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
  public OrderCancelRequest setMaturityTime(final String value) {
    setField(FieldValue.to(maturityTimeField, value));
    return this;
  }
  public OrderCancelRequest setMaturityTime(final quickfix.field.MaturityTime value) {
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
  public OrderCancelRequest setSettleOnOpenFlag(final String value) {
    setField(FieldValue.to(settleOnOpenFlagField, value));
    return this;
  }
  public OrderCancelRequest setSettleOnOpenFlag(final quickfix.field.SettleOnOpenFlag value) {
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
  public OrderCancelRequest setInstrmtAssignmentMethod(final int value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public OrderCancelRequest setInstrmtAssignmentMethod(final char value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public OrderCancelRequest setInstrmtAssignmentMethod(final String value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public OrderCancelRequest setInstrmtAssignmentMethod(
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
  public OrderCancelRequest setSecurityStatus(final String value) {
    setField(FieldValue.to(securityStatusField, value));
    return this;
  }
  public OrderCancelRequest setSecurityStatus(final quickfix.field.SecurityStatus value) {
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
  public OrderCancelRequest setCouponPaymentDate(final String value) {
    setField(FieldValue.to(couponPaymentDateField, value));
    return this;
  }
  public OrderCancelRequest setCouponPaymentDate(final quickfix.field.CouponPaymentDate value) {
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
  public OrderCancelRequest setRestructuringType(final String value) {
    setField(FieldValue.to(restructuringTypeField, value));
    return this;
  }
  public OrderCancelRequest setRestructuringType(final quickfix.field.RestructuringType value) {
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
  public OrderCancelRequest setSeniority(final String value) {
    setField(FieldValue.to(seniorityField, value));
    return this;
  }
  public OrderCancelRequest setSeniority(final quickfix.field.Seniority value) {
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
  public OrderCancelRequest setNotionalPercentageOutstanding(final double value) {
    setField(FieldValue.to(notionalPercentageOutstandingField, value));
    return this;
  }
  public OrderCancelRequest setNotionalPercentageOutstanding(
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
  public OrderCancelRequest setOriginalNotionalPercentageOutstanding(final double value) {
    setField(FieldValue.to(originalNotionalPercentageOutstandingField, value));
    return this;
  }
  public OrderCancelRequest setOriginalNotionalPercentageOutstanding(
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
  public OrderCancelRequest setAttachmentPoint(final double value) {
    setField(FieldValue.to(attachmentPointField, value));
    return this;
  }
  public OrderCancelRequest setAttachmentPoint(final quickfix.field.AttachmentPoint value) {
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
  public OrderCancelRequest setDetachmentPoint(final double value) {
    setField(FieldValue.to(detachmentPointField, value));
    return this;
  }
  public OrderCancelRequest setDetachmentPoint(final quickfix.field.DetachmentPoint value) {
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
  public OrderCancelRequest setIssueDate(final String value) {
    setField(FieldValue.to(issueDateField, value));
    return this;
  }
  public OrderCancelRequest setIssueDate(final quickfix.field.IssueDate value) {
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
  public OrderCancelRequest setRepoCollateralSecurityType(final String value) {
    setField(FieldValue.to(repoCollateralSecurityTypeField, value));
    return this;
  }
  public OrderCancelRequest setRepoCollateralSecurityType(
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
  public OrderCancelRequest setRepurchaseTerm(final int value) {
    setField(FieldValue.to(repurchaseTermField, value));
    return this;
  }
  public OrderCancelRequest setRepurchaseTerm(final quickfix.field.RepurchaseTerm value) {
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
  public OrderCancelRequest setRepurchaseRate(final double value) {
    setField(FieldValue.to(repurchaseRateField, value));
    return this;
  }
  public OrderCancelRequest setRepurchaseRate(final quickfix.field.RepurchaseRate value) {
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
  public OrderCancelRequest setFactor(final double value) {
    setField(FieldValue.to(factorField, value));
    return this;
  }
  public OrderCancelRequest setFactor(final quickfix.field.Factor value) {
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
  public OrderCancelRequest setCreditRating(final String value) {
    setField(FieldValue.to(creditRatingField, value));
    return this;
  }
  public OrderCancelRequest setCreditRating(final quickfix.field.CreditRating value) {
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
  public OrderCancelRequest setInstrRegistry(final String value) {
    setField(FieldValue.to(instrRegistryField, value));
    return this;
  }
  public OrderCancelRequest setInstrRegistry(final quickfix.field.InstrRegistry value) {
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
  public OrderCancelRequest setCountryOfIssue(final String value) {
    setField(FieldValue.to(countryOfIssueField, value));
    return this;
  }
  public OrderCancelRequest setCountryOfIssue(final quickfix.field.CountryOfIssue value) {
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
  public OrderCancelRequest setStateOrProvinceOfIssue(final String value) {
    setField(FieldValue.to(stateOrProvinceOfIssueField, value));
    return this;
  }
  public OrderCancelRequest setStateOrProvinceOfIssue(
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
  public OrderCancelRequest setLocaleOfIssue(final String value) {
    setField(FieldValue.to(localeOfIssueField, value));
    return this;
  }
  public OrderCancelRequest setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
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
  public OrderCancelRequest setRedemptionDate(final String value) {
    setField(FieldValue.to(redemptionDateField, value));
    return this;
  }
  public OrderCancelRequest setRedemptionDate(final quickfix.field.RedemptionDate value) {
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
  public OrderCancelRequest setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public OrderCancelRequest setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public OrderCancelRequest setStrikeCurrency(final String value) {
    setField(FieldValue.to(strikeCurrencyField, value));
    return this;
  }
  public OrderCancelRequest setStrikeCurrency(final quickfix.field.StrikeCurrency value) {
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
  public OrderCancelRequest setStrikeMultiplier(final double value) {
    setField(FieldValue.to(strikeMultiplierField, value));
    return this;
  }
  public OrderCancelRequest setStrikeMultiplier(final quickfix.field.StrikeMultiplier value) {
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
  public OrderCancelRequest setStrikeValue(final double value) {
    setField(FieldValue.to(strikeValueField, value));
    return this;
  }
  public OrderCancelRequest setStrikeValue(final quickfix.field.StrikeValue value) {
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
  public OrderCancelRequest setStrikePriceDeterminationMethod(final int value) {
    setField(FieldValue.to(strikePriceDeterminationMethodField, value));
    return this;
  }
  public OrderCancelRequest setStrikePriceDeterminationMethod(
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
  public OrderCancelRequest setStrikePriceBoundaryMethod(final int value) {
    setField(FieldValue.to(strikePriceBoundaryMethodField, value));
    return this;
  }
  public OrderCancelRequest setStrikePriceBoundaryMethod(
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
  public OrderCancelRequest setStrikePriceBoundaryPrecision(final double value) {
    setField(FieldValue.to(strikePriceBoundaryPrecisionField, value));
    return this;
  }
  public OrderCancelRequest setStrikePriceBoundaryPrecision(
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
  public OrderCancelRequest setUnderlyingPriceDeterminationMethod(final int value) {
    setField(FieldValue.to(underlyingPriceDeterminationMethodField, value));
    return this;
  }
  public OrderCancelRequest setUnderlyingPriceDeterminationMethod(
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
  public OrderCancelRequest setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelRequest setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelRequest setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public OrderCancelRequest setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public OrderCancelRequest setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public OrderCancelRequest setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public OrderCancelRequest setContractMultiplierUnit(final int value) {
    setField(FieldValue.to(contractMultiplierUnitField, value));
    return this;
  }
  public OrderCancelRequest setContractMultiplierUnit(
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
  public OrderCancelRequest setFlowScheduleType(final int value) {
    setField(FieldValue.to(flowScheduleTypeField, value));
    return this;
  }
  public OrderCancelRequest setFlowScheduleType(final quickfix.field.FlowScheduleType value) {
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
  public OrderCancelRequest setMinPriceIncrement(final double value) {
    setField(FieldValue.to(minPriceIncrementField, value));
    return this;
  }
  public OrderCancelRequest setMinPriceIncrement(final quickfix.field.MinPriceIncrement value) {
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
  public OrderCancelRequest setMinPriceIncrementAmount(final double value) {
    setField(FieldValue.to(minPriceIncrementAmountField, value));
    return this;
  }
  public OrderCancelRequest setMinPriceIncrementAmount(
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
  public OrderCancelRequest setUnitOfMeasure(final String value) {
    setField(FieldValue.to(unitOfMeasureField, value));
    return this;
  }
  public OrderCancelRequest setUnitOfMeasure(final quickfix.field.UnitOfMeasure value) {
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
  public OrderCancelRequest setUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(unitOfMeasureQtyField, value));
    return this;
  }
  public OrderCancelRequest setUnitOfMeasureQty(final quickfix.field.UnitOfMeasureQty value) {
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
  public OrderCancelRequest setPriceUnitOfMeasure(final String value) {
    setField(FieldValue.to(priceUnitOfMeasureField, value));
    return this;
  }
  public OrderCancelRequest setPriceUnitOfMeasure(final quickfix.field.PriceUnitOfMeasure value) {
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
  public OrderCancelRequest setPriceUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(priceUnitOfMeasureQtyField, value));
    return this;
  }
  public OrderCancelRequest setPriceUnitOfMeasureQty(
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
  public OrderCancelRequest setSettlMethod(final int value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public OrderCancelRequest setSettlMethod(final char value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public OrderCancelRequest setSettlMethod(final String value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public OrderCancelRequest setSettlMethod(final quickfix.field.SettlMethod value) {
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
  public OrderCancelRequest setExerciseStyle(final int value) {
    setField(FieldValue.to(exerciseStyleField, value));
    return this;
  }
  public OrderCancelRequest setExerciseStyle(final quickfix.field.ExerciseStyle value) {
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
  public OrderCancelRequest setOptPayoutType(final int value) {
    setField(FieldValue.to(optPayoutTypeField, value));
    return this;
  }
  public OrderCancelRequest setOptPayoutType(final quickfix.field.OptPayoutType value) {
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
  public OrderCancelRequest setOptPayoutAmount(final double value) {
    setField(FieldValue.to(optPayoutAmountField, value));
    return this;
  }
  public OrderCancelRequest setOptPayoutAmount(final quickfix.field.OptPayoutAmount value) {
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
  public OrderCancelRequest setPriceQuoteMethod(final String value) {
    setField(FieldValue.to(priceQuoteMethodField, value));
    return this;
  }
  public OrderCancelRequest setPriceQuoteMethod(final quickfix.field.PriceQuoteMethod value) {
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
  public OrderCancelRequest setValuationMethod(final String value) {
    setField(FieldValue.to(valuationMethodField, value));
    return this;
  }
  public OrderCancelRequest setValuationMethod(final quickfix.field.ValuationMethod value) {
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
  public OrderCancelRequest setListMethod(final int value) {
    setField(FieldValue.to(listMethodField, value));
    return this;
  }
  public OrderCancelRequest setListMethod(final quickfix.field.ListMethod value) {
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
  public OrderCancelRequest setCapPrice(final double value) {
    setField(FieldValue.to(capPriceField, value));
    return this;
  }
  public OrderCancelRequest setCapPrice(final quickfix.field.CapPrice value) {
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
  public OrderCancelRequest setFloorPrice(final double value) {
    setField(FieldValue.to(floorPriceField, value));
    return this;
  }
  public OrderCancelRequest setFloorPrice(final quickfix.field.FloorPrice value) {
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
  public OrderCancelRequest setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public OrderCancelRequest setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public OrderCancelRequest setFlexibleIndicator(final boolean value) {
    setField(FieldValue.to(flexibleIndicatorField, value));
    return this;
  }
  public OrderCancelRequest setFlexibleIndicator(final quickfix.field.FlexibleIndicator value) {
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
  public OrderCancelRequest setFlexProductEligibilityIndicator(final boolean value) {
    setField(FieldValue.to(flexProductEligibilityIndicatorField, value));
    return this;
  }
  public OrderCancelRequest setFlexProductEligibilityIndicator(
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
  public OrderCancelRequest setTimeUnit(final String value) {
    setField(FieldValue.to(timeUnitField, value));
    return this;
  }
  public OrderCancelRequest setTimeUnit(final quickfix.field.TimeUnit value) {
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
  public OrderCancelRequest setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public OrderCancelRequest setCouponRate(final quickfix.field.CouponRate value) {
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
  public OrderCancelRequest setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public OrderCancelRequest setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public OrderCancelRequest setPositionLimit(final int value) {
    setField(FieldValue.to(positionLimitField, value));
    return this;
  }
  public OrderCancelRequest setPositionLimit(final quickfix.field.PositionLimit value) {
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
  public OrderCancelRequest setNtPositionLimit(final int value) {
    setField(FieldValue.to(ntPositionLimitField, value));
    return this;
  }
  public OrderCancelRequest setNtPositionLimit(final quickfix.field.NTPositionLimit value) {
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
  public OrderCancelRequest setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public OrderCancelRequest setIssuer(final quickfix.field.Issuer value) {
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
  public OrderCancelRequest setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public OrderCancelRequest setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public OrderCancelRequest setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public OrderCancelRequest setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public OrderCancelRequest setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public OrderCancelRequest setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public OrderCancelRequest setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public OrderCancelRequest setEncodedSecurityDescLen(
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
  public OrderCancelRequest setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public OrderCancelRequest setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
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
  public OrderCancelRequest setSecurityXmlLen(final int value) {
    setField(FieldValue.to(securityXmlLenField, value));
    return this;
  }
  public OrderCancelRequest setSecurityXmlLen(final quickfix.field.SecurityXMLLen value) {
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
  public OrderCancelRequest setSecurityXmlData(final String value) {
    setField(FieldValue.to(securityXmlDataField, value));
    return this;
  }
  public OrderCancelRequest setSecurityXmlData(final quickfix.field.SecurityXMLData value) {
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
  public OrderCancelRequest setSecurityXmlSchema(final String value) {
    setField(FieldValue.to(securityXmlSchemaField, value));
    return this;
  }
  public OrderCancelRequest setSecurityXmlSchema(final quickfix.field.SecurityXMLSchema value) {
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
  public OrderCancelRequest setPool(final String value) {
    setField(FieldValue.to(poolField, value));
    return this;
  }
  public OrderCancelRequest setPool(final quickfix.field.Pool value) {
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
  public OrderCancelRequest setContractSettlMonth(final String value) {
    setField(FieldValue.to(contractSettlMonthField, value));
    return this;
  }
  public OrderCancelRequest setContractSettlMonth(final quickfix.field.ContractSettlMonth value) {
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
  public OrderCancelRequest setCpProgram(final int value) {
    setField(FieldValue.to(cpProgramField, value));
    return this;
  }
  public OrderCancelRequest setCpProgram(final quickfix.field.CPProgram value) {
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
  public OrderCancelRequest setCpRegType(final String value) {
    setField(FieldValue.to(cpRegTypeField, value));
    return this;
  }
  public OrderCancelRequest setCpRegType(final quickfix.field.CPRegType value) {
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
  public OrderCancelRequest setDatedDate(final String value) {
    setField(FieldValue.to(datedDateField, value));
    return this;
  }
  public OrderCancelRequest setDatedDate(final quickfix.field.DatedDate value) {
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
  public OrderCancelRequest setInterestAccrualDate(final String value) {
    setField(FieldValue.to(interestAccrualDateField, value));
    return this;
  }
  public OrderCancelRequest setInterestAccrualDate(final quickfix.field.InterestAccrualDate value) {
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
  public OrderCancelRequest setAgreementDesc(final String value) {
    setField(FieldValue.to(agreementDescField, value));
    return this;
  }
  public OrderCancelRequest setAgreementDesc(final quickfix.field.AgreementDesc value) {
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
  public OrderCancelRequest setAgreementId(final String value) {
    setField(FieldValue.to(agreementIdField, value));
    return this;
  }
  public OrderCancelRequest setAgreementId(final quickfix.field.AgreementID value) {
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
  public OrderCancelRequest setAgreementDate(final String value) {
    setField(FieldValue.to(agreementDateField, value));
    return this;
  }
  public OrderCancelRequest setAgreementDate(final quickfix.field.AgreementDate value) {
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
  public OrderCancelRequest setAgreementCurrency(final String value) {
    setField(FieldValue.to(agreementCurrencyField, value));
    return this;
  }
  public OrderCancelRequest setAgreementCurrency(final quickfix.field.AgreementCurrency value) {
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
  public OrderCancelRequest setTerminationType(final int value) {
    setField(FieldValue.to(terminationTypeField, value));
    return this;
  }
  public OrderCancelRequest setTerminationType(final quickfix.field.TerminationType value) {
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
  public OrderCancelRequest setStartDate(final String value) {
    setField(FieldValue.to(startDateField, value));
    return this;
  }
  public OrderCancelRequest setStartDate(final quickfix.field.StartDate value) {
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
  public OrderCancelRequest setEndDate(final String value) {
    setField(FieldValue.to(endDateField, value));
    return this;
  }
  public OrderCancelRequest setEndDate(final quickfix.field.EndDate value) {
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
  public OrderCancelRequest setDeliveryType(final int value) {
    setField(FieldValue.to(deliveryTypeField, value));
    return this;
  }
  public OrderCancelRequest setDeliveryType(final quickfix.field.DeliveryType value) {
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
  public OrderCancelRequest setMarginRatio(final double value) {
    setField(FieldValue.to(marginRatioField, value));
    return this;
  }
  public OrderCancelRequest setMarginRatio(final quickfix.field.MarginRatio value) {
    setField(FieldValue.to(marginRatioField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField sideField = FieldFactory.newCharField(54);
  public boolean hasSide() throws quickfix.FieldNotFound {
    return isSetField(54);
  }
  public int getSide() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sideField));
  }
  public OrderCancelRequest setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelRequest setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelRequest setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public OrderCancelRequest setSide(final quickfix.field.Side value) {
    setField(FieldValue.to(sideField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public OrderCancelRequest setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public OrderCancelRequest setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField orderQtyField = FieldFactory.newDoubleField(38);
  public boolean hasOrderQty() throws quickfix.FieldNotFound {
    return isSetField(38);
  }
  public double getOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderQtyField));
  }
  public OrderCancelRequest setOrderQty(final double value) {
    setField(FieldValue.to(orderQtyField, value));
    return this;
  }
  public OrderCancelRequest setOrderQty(final quickfix.field.OrderQty value) {
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
  public OrderCancelRequest setCashOrderQty(final double value) {
    setField(FieldValue.to(cashOrderQtyField, value));
    return this;
  }
  public OrderCancelRequest setCashOrderQty(final quickfix.field.CashOrderQty value) {
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
  public OrderCancelRequest setOrderPercent(final double value) {
    setField(FieldValue.to(orderPercentField, value));
    return this;
  }
  public OrderCancelRequest setOrderPercent(final quickfix.field.OrderPercent value) {
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
  public OrderCancelRequest setRoundingDirection(final int value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public OrderCancelRequest setRoundingDirection(final char value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public OrderCancelRequest setRoundingDirection(final String value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public OrderCancelRequest setRoundingDirection(final quickfix.field.RoundingDirection value) {
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
  public OrderCancelRequest setRoundingModulus(final double value) {
    setField(FieldValue.to(roundingModulusField, value));
    return this;
  }
  public OrderCancelRequest setRoundingModulus(final quickfix.field.RoundingModulus value) {
    setField(FieldValue.to(roundingModulusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField complianceIdField = FieldFactory.newStringField(376);
  public boolean hasComplianceId() throws quickfix.FieldNotFound {
    return isSetField(376);
  }
  public String getComplianceId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(complianceIdField));
  }
  public OrderCancelRequest setComplianceId(final String value) {
    setField(FieldValue.to(complianceIdField, value));
    return this;
  }
  public OrderCancelRequest setComplianceId(final quickfix.field.ComplianceID value) {
    setField(FieldValue.to(complianceIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public OrderCancelRequest setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public OrderCancelRequest setText(final quickfix.field.Text value) {
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
  public OrderCancelRequest setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public OrderCancelRequest setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public OrderCancelRequest setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public OrderCancelRequest setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public OrderCancelRequest() {
    super(new int[] {41, 37, 11, 526, 583, 66, 586, 1, 660, 581, 55, 65, 48, 22, 460, 1227, 1151,
        461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225,
        239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480,
        1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196,
        1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350,
        351, 1184, 1185, 1186, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919,
        898, 54, 60, 38, 152, 516, 468, 469, 376, 58, 354, 355, 0});
  }

  public OrderCancelRequest(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {41, 37, 11, 526, 583, 66, 586, 1, 660, 581, 55, 65, 48, 22, 460, 1227, 1151,
        461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225,
        239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480,
        1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196,
        1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350,
        351, 1184, 1185, 1186, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919,
        898, 54, 60, 38, 152, 516, 468, 469, 376, 58, 354, 355, 0});
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

  public static Function<garden_leave.gateway.transform.fix50sp2.OrderCancelRequest,
      garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.getDefaultInstance();
    }

    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.Builder builder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.newBuilder();
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix50sp2.Header header =
        (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasOrigClOrdId()) {
        builder.setOrigClOrdId(fix.getOrigClOrdId());
        presenceBuilder.setOrigClOrdId(true);
      }
      if (fix.hasOrderId()) {
        builder.setOrderId(fix.getOrderId());
        presenceBuilder.setOrderId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasSecondaryClOrdId()) {
        builder.setSecondaryClOrdId(fix.getSecondaryClOrdId());
        presenceBuilder.setSecondaryClOrdId(true);
      }
      if (fix.hasClOrdLinkId()) {
        builder.setClOrdLinkId(fix.getClOrdLinkId());
        presenceBuilder.setClOrdLinkId(true);
      }
      if (fix.hasListId()) {
        builder.setListId(fix.getListId());
        presenceBuilder.setListId(true);
      }
      if (fix.hasOrigOrdModTime()) {
        builder.setOrigOrdModTime(fix.getOrigOrdModTime());
        presenceBuilder.setOrigOrdModTime(true);
      }
      if (fix.hasAccount()) {
        builder.setAccount(fix.getAccount());
        presenceBuilder.setAccount(true);
      }
      if (fix.hasAcctIdSource()) {
        builder.setAcctIdSource(fix.getAcctIdSource());
        presenceBuilder.setAcctIdSource(true);
      }
      if (fix.hasAccountType()) {
        builder.setAccountType(fix.getAccountType());
        presenceBuilder.setAccountType(true);
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
      if (fix.hasAgreementDesc()) {
        builder.setAgreementDesc(fix.getAgreementDesc());
        presenceBuilder.setAgreementDesc(true);
      }
      if (fix.hasAgreementId()) {
        builder.setAgreementId(fix.getAgreementId());
        presenceBuilder.setAgreementId(true);
      }
      if (fix.hasAgreementDate()) {
        builder.setAgreementDate(fix.getAgreementDate());
        presenceBuilder.setAgreementDate(true);
      }
      if (fix.hasAgreementCurrency()) {
        builder.setAgreementCurrency(fix.getAgreementCurrency());
        presenceBuilder.setAgreementCurrency(true);
      }
      if (fix.hasTerminationType()) {
        builder.setTerminationType(fix.getTerminationType());
        presenceBuilder.setTerminationType(true);
      }
      if (fix.hasStartDate()) {
        builder.setStartDate(fix.getStartDate());
        presenceBuilder.setStartDate(true);
      }
      if (fix.hasEndDate()) {
        builder.setEndDate(fix.getEndDate());
        presenceBuilder.setEndDate(true);
      }
      if (fix.hasDeliveryType()) {
        builder.setDeliveryType(fix.getDeliveryType());
        presenceBuilder.setDeliveryType(true);
      }
      if (fix.hasMarginRatio()) {
        builder.setMarginRatio(fix.getMarginRatio());
        presenceBuilder.setMarginRatio(true);
      }
      if (fix.hasSide()) {
        builder.setSide(fix.getSide());
        presenceBuilder.setSide(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasOrderQty()) {
        builder.setOrderQty(fix.getOrderQty());
        presenceBuilder.setOrderQty(true);
      }
      if (fix.hasCashOrderQty()) {
        builder.setCashOrderQty(fix.getCashOrderQty());
        presenceBuilder.setCashOrderQty(true);
      }
      if (fix.hasOrderPercent()) {
        builder.setOrderPercent(fix.getOrderPercent());
        presenceBuilder.setOrderPercent(true);
      }
      if (fix.hasRoundingDirection()) {
        builder.setRoundingDirection(fix.getRoundingDirection());
        presenceBuilder.setRoundingDirection(true);
      }
      if (fix.hasRoundingModulus()) {
        builder.setRoundingModulus(fix.getRoundingModulus());
        presenceBuilder.setRoundingModulus(true);
      }
      if (fix.hasComplianceId()) {
        builder.setComplianceId(fix.getComplianceId());
        presenceBuilder.setComplianceId(true);
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
      final int noPartyIdsGroupCount = fix.getGroupCount(453);
      for (int i = 1; i <= noPartyIdsGroupCount; i++) {
        final OrderCancelRequest.NoPartyIds group = new OrderCancelRequest.NoPartyIds();
        fix.getGroup(i, group);
        builder.addNoPartyIds(group.toBuilder().build());
      }

      final int noSecurityAltIdGroupCount = fix.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final OrderCancelRequest.NoSecurityAltId group = new OrderCancelRequest.NoSecurityAltId();
        fix.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = fix.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final OrderCancelRequest.NoEvents group = new OrderCancelRequest.NoEvents();
        fix.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noInstrumentPartiesGroupCount = fix.getGroupCount(1018);
      for (int i = 1; i <= noInstrumentPartiesGroupCount; i++) {
        final OrderCancelRequest.NoInstrumentParties group =
            new OrderCancelRequest.NoInstrumentParties();
        fix.getGroup(i, group);
        builder.addNoInstrumentParties(group.toBuilder().build());
      }

      final int noComplexEventsGroupCount = fix.getGroupCount(1483);
      for (int i = 1; i <= noComplexEventsGroupCount; i++) {
        final OrderCancelRequest.NoComplexEvents group = new OrderCancelRequest.NoComplexEvents();
        fix.getGroup(i, group);
        builder.addNoComplexEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = fix.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final OrderCancelRequest.NoUnderlyings group = new OrderCancelRequest.NoUnderlyings();
        fix.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("orderCancelRequest error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest,
      garden_leave.gateway.transform.fix50sp2.OrderCancelRequest> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix50sp2.OrderCancelRequest.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix50sp2.OrderCancelRequest fix =
          new garden_leave.gateway.transform.fix50sp2.OrderCancelRequest();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix50sp2.Header header =
          (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix50sp2.proto.FIX50SP2Protos.OrderCancelRequest
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getOrigClOrdId()) {
        fix.setOrigClOrdId(proto.getOrigClOrdId());
      }
      if (fieldPresence.getOrderId()) {
        fix.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getSecondaryClOrdId()) {
        fix.setSecondaryClOrdId(proto.getSecondaryClOrdId());
      }
      if (fieldPresence.getClOrdLinkId()) {
        fix.setClOrdLinkId(proto.getClOrdLinkId());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getOrigOrdModTime()) {
        fix.setOrigOrdModTime(proto.getOrigOrdModTime());
      }
      if (fieldPresence.getAccount()) {
        fix.setAccount(proto.getAccount());
      }
      if (fieldPresence.getAcctIdSource()) {
        fix.setAcctIdSource(proto.getAcctIdSource());
      }
      if (fieldPresence.getAccountType()) {
        fix.setAccountType(proto.getAccountType());
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
      if (fieldPresence.getAgreementDesc()) {
        fix.setAgreementDesc(proto.getAgreementDesc());
      }
      if (fieldPresence.getAgreementId()) {
        fix.setAgreementId(proto.getAgreementId());
      }
      if (fieldPresence.getAgreementDate()) {
        fix.setAgreementDate(proto.getAgreementDate());
      }
      if (fieldPresence.getAgreementCurrency()) {
        fix.setAgreementCurrency(proto.getAgreementCurrency());
      }
      if (fieldPresence.getTerminationType()) {
        fix.setTerminationType(proto.getTerminationType());
      }
      if (fieldPresence.getStartDate()) {
        fix.setStartDate(proto.getStartDate());
      }
      if (fieldPresence.getEndDate()) {
        fix.setEndDate(proto.getEndDate());
      }
      if (fieldPresence.getDeliveryType()) {
        fix.setDeliveryType(proto.getDeliveryType());
      }
      if (fieldPresence.getMarginRatio()) {
        fix.setMarginRatio(proto.getMarginRatio());
      }
      if (fieldPresence.getSide()) {
        fix.setSide(proto.getSide());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getOrderQty()) {
        fix.setOrderQty(proto.getOrderQty());
      }
      if (fieldPresence.getCashOrderQty()) {
        fix.setCashOrderQty(proto.getCashOrderQty());
      }
      if (fieldPresence.getOrderPercent()) {
        fix.setOrderPercent(proto.getOrderPercent());
      }
      if (fieldPresence.getRoundingDirection()) {
        fix.setRoundingDirection(proto.getRoundingDirection());
      }
      if (fieldPresence.getRoundingModulus()) {
        fix.setRoundingModulus(proto.getRoundingModulus());
      }
      if (fieldPresence.getComplianceId()) {
        fix.setComplianceId(proto.getComplianceId());
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
      for (int i = 0; i < proto.getNoPartyIdsCount(); i++) {
        final OrderCancelRequest.NoPartyIds group = new OrderCancelRequest.NoPartyIds();
        group.fromProto(proto.getNoPartyIds(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final OrderCancelRequest.NoSecurityAltId group = new OrderCancelRequest.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final OrderCancelRequest.NoEvents group = new OrderCancelRequest.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoInstrumentPartiesCount(); i++) {
        final OrderCancelRequest.NoInstrumentParties group =
            new OrderCancelRequest.NoInstrumentParties();
        group.fromProto(proto.getNoInstrumentParties(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoComplexEventsCount(); i++) {
        final OrderCancelRequest.NoComplexEvents group = new OrderCancelRequest.NoComplexEvents();
        group.fromProto(proto.getNoComplexEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final OrderCancelRequest.NoUnderlyings group = new OrderCancelRequest.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
