package garden_leave.gateway.transform.fix50sp2;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.314934400
//

public final class ExecutionReport extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(ExecutionReport.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(ExecutionReport.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public ExecutionReport setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.5.0";
  public static final String MSGTYPE = "8";

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoPartyIds.NoPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.NoPartySubIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getPartySubId()) {
          this.setPartySubId(proto.getPartySubId());
        }
        if (fieldPresence.getPartySubIdType()) {
          this.setPartySubIdType(proto.getPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.NoPartySubIds
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.NoPartySubIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds
                                   .NoPartySubIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.NoPartySubIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.NoPartySubIds
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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoPartyIds.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
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

  public static class NoContraBrokers extends quickfix.Group {
    private final quickfix.StringField contraBrokerField = FieldFactory.newStringField(375);
    public boolean hasContraBroker() throws quickfix.FieldNotFound {
      return isSetField(375);
    }
    public String getContraBroker() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraBrokerField));
    }
    public NoContraBrokers setContraBroker(final String value) {
      setField(FieldValue.to(contraBrokerField, value));
      return this;
    }
    public NoContraBrokers setContraBroker(final quickfix.field.ContraBroker value) {
      setField(FieldValue.to(contraBrokerField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField contraTraderField = FieldFactory.newStringField(337);
    public boolean hasContraTrader() throws quickfix.FieldNotFound {
      return isSetField(337);
    }
    public String getContraTrader() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTraderField));
    }
    public NoContraBrokers setContraTrader(final String value) {
      setField(FieldValue.to(contraTraderField, value));
      return this;
    }
    public NoContraBrokers setContraTrader(final quickfix.field.ContraTrader value) {
      setField(FieldValue.to(contraTraderField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField contraTradeQtyField = FieldFactory.newDoubleField(437);
    public boolean hasContraTradeQty() throws quickfix.FieldNotFound {
      return isSetField(437);
    }
    public double getContraTradeQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTradeQtyField));
    }
    public NoContraBrokers setContraTradeQty(final double value) {
      setField(FieldValue.to(contraTradeQtyField, value));
      return this;
    }
    public NoContraBrokers setContraTradeQty(final quickfix.field.ContraTradeQty value) {
      setField(FieldValue.to(contraTradeQtyField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeStampField contraTradeTimeField =
        FieldFactory.newTimeStampField(438);
    public boolean hasContraTradeTime() throws quickfix.FieldNotFound {
      return isSetField(438);
    }
    public long getContraTradeTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraTradeTimeField));
    }
    public NoContraBrokers setContraTradeTime(final long value) {
      setField(FieldValue.to(contraTradeTimeField, value));
      return this;
    }
    public NoContraBrokers setContraTradeTime(final quickfix.field.ContraTradeTime value) {
      setField(FieldValue.to(contraTradeTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField contraLegRefIdField = FieldFactory.newStringField(655);
    public boolean hasContraLegRefId() throws quickfix.FieldNotFound {
      return isSetField(655);
    }
    public String getContraLegRefId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contraLegRefIdField));
    }
    public NoContraBrokers setContraLegRefId(final String value) {
      setField(FieldValue.to(contraLegRefIdField, value));
      return this;
    }
    public NoContraBrokers setContraLegRefId(final quickfix.field.ContraLegRefID value) {
      setField(FieldValue.to(contraLegRefIdField, FieldValue.of(value)));
      return this;
    }

    public NoContraBrokers() {
      super(382, 375, new int[] {375, 337, 437, 438, 655, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getContraBroker()) {
        this.setContraBroker(proto.getContraBroker());
      }
      if (fieldPresence.getContraTrader()) {
        this.setContraTrader(proto.getContraTrader());
      }
      if (fieldPresence.getContraTradeQty()) {
        this.setContraTradeQty(proto.getContraTradeQty());
      }
      if (fieldPresence.getContraTradeTime()) {
        this.setContraTradeTime(proto.getContraTradeTime());
      }
      if (fieldPresence.getContraLegRefId()) {
        this.setContraLegRefId(proto.getContraLegRefId());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContraBrokers.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoContraBrokers.FieldPresence.newBuilder();

      if (this.hasContraBroker()) {
        builder.setContraBroker(this.getContraBroker());
        presenceBuilder.setContraBroker(true);
      }
      if (this.hasContraTrader()) {
        builder.setContraTrader(this.getContraTrader());
        presenceBuilder.setContraTrader(true);
      }
      if (this.hasContraTradeQty()) {
        builder.setContraTradeQty(this.getContraTradeQty());
        presenceBuilder.setContraTradeQty(true);
      }
      if (this.hasContraTradeTime()) {
        builder.setContraTradeTime(this.getContraTradeTime());
        presenceBuilder.setContraTradeTime(true);
      }
      if (this.hasContraLegRefId()) {
        builder.setContraLegRefId(this.getContraLegRefId());
        presenceBuilder.setContraLegRefId(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoAllocs extends quickfix.Group {
    public static class NoNestedPartyIds extends quickfix.Group {
      public static class NoNestedPartySubIds extends quickfix.Group {
        private final quickfix.StringField nestedPartySubIdField = FieldFactory.newStringField(545);
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                  .NoAllocs.NoNestedPartyIds.NoNestedPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getNestedPartySubId()) {
            this.setNestedPartySubId(proto.getNestedPartySubId());
          }
          if (fieldPresence.getNestedPartySubIdType()) {
            this.setNestedPartySubIdType(proto.getNestedPartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
            .NoNestedPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
                  .NoNestedPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
                  .NoNestedPartySubIds.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoAllocs.NoNestedPartyIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs
                                   .NoNestedPartyIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.NoNestedPartyIds
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

    private final quickfix.StringField allocAccountField = FieldFactory.newStringField(79);
    public boolean hasAllocAccount() throws quickfix.FieldNotFound {
      return isSetField(79);
    }
    public String getAllocAccount() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocAccountField));
    }
    public NoAllocs setAllocAccount(final String value) {
      setField(FieldValue.to(allocAccountField, value));
      return this;
    }
    public NoAllocs setAllocAccount(final quickfix.field.AllocAccount value) {
      setField(FieldValue.to(allocAccountField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField allocAcctIdSourceField = FieldFactory.newIntField(661);
    public boolean hasAllocAcctIdSource() throws quickfix.FieldNotFound {
      return isSetField(661);
    }
    public int getAllocAcctIdSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocAcctIdSourceField));
    }
    public NoAllocs setAllocAcctIdSource(final int value) {
      setField(FieldValue.to(allocAcctIdSourceField, value));
      return this;
    }
    public NoAllocs setAllocAcctIdSource(final quickfix.field.AllocAcctIDSource value) {
      setField(FieldValue.to(allocAcctIdSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField allocSettlCurrencyField = FieldFactory.newStringField(736);
    public boolean hasAllocSettlCurrency() throws quickfix.FieldNotFound {
      return isSetField(736);
    }
    public String getAllocSettlCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocSettlCurrencyField));
    }
    public NoAllocs setAllocSettlCurrency(final String value) {
      setField(FieldValue.to(allocSettlCurrencyField, value));
      return this;
    }
    public NoAllocs setAllocSettlCurrency(final quickfix.field.AllocSettlCurrency value) {
      setField(FieldValue.to(allocSettlCurrencyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField individualAllocIdField = FieldFactory.newStringField(467);
    public boolean hasIndividualAllocId() throws quickfix.FieldNotFound {
      return isSetField(467);
    }
    public String getIndividualAllocId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(individualAllocIdField));
    }
    public NoAllocs setIndividualAllocId(final String value) {
      setField(FieldValue.to(individualAllocIdField, value));
      return this;
    }
    public NoAllocs setIndividualAllocId(final quickfix.field.IndividualAllocID value) {
      setField(FieldValue.to(individualAllocIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField allocQtyField = FieldFactory.newDoubleField(80);
    public boolean hasAllocQty() throws quickfix.FieldNotFound {
      return isSetField(80);
    }
    public double getAllocQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(allocQtyField));
    }
    public NoAllocs setAllocQty(final double value) {
      setField(FieldValue.to(allocQtyField, value));
      return this;
    }
    public NoAllocs setAllocQty(final quickfix.field.AllocQty value) {
      setField(FieldValue.to(allocQtyField, FieldValue.of(value)));
      return this;
    }

    public NoAllocs() {
      super(78, 79, new int[] {79, 661, 736, 467, 80, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoNestedPartyIdsCount(); i++) {
        final NoAllocs.NoNestedPartyIds group = new NoAllocs.NoNestedPartyIds();
        group.fromProto(proto.getNoNestedPartyIds(i));
        this.addGroupRef(group);
      }
      if (fieldPresence.getAllocAccount()) {
        this.setAllocAccount(proto.getAllocAccount());
      }
      if (fieldPresence.getAllocAcctIdSource()) {
        this.setAllocAcctIdSource(proto.getAllocAcctIdSource());
      }
      if (fieldPresence.getAllocSettlCurrency()) {
        this.setAllocSettlCurrency(proto.getAllocSettlCurrency());
      }
      if (fieldPresence.getIndividualAllocId()) {
        this.setIndividualAllocId(proto.getIndividualAllocId());
      }
      if (fieldPresence.getAllocQty()) {
        this.setAllocQty(proto.getAllocQty());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoAllocs.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoAllocs.FieldPresence.newBuilder();

      final int noNestedPartyIdsGroupCount = this.getGroupCount(539);
      for (int i = 1; i <= noNestedPartyIdsGroupCount; i++) {
        final NoAllocs.NoNestedPartyIds group = new NoAllocs.NoNestedPartyIds();
        this.getGroup(i, group);
        builder.addNoNestedPartyIds(group.toBuilder().build());
      }

      if (this.hasAllocAccount()) {
        builder.setAllocAccount(this.getAllocAccount());
        presenceBuilder.setAllocAccount(true);
      }
      if (this.hasAllocAcctIdSource()) {
        builder.setAllocAcctIdSource(this.getAllocAcctIdSource());
        presenceBuilder.setAllocAcctIdSource(true);
      }
      if (this.hasAllocSettlCurrency()) {
        builder.setAllocSettlCurrency(this.getAllocSettlCurrency());
        presenceBuilder.setAllocSettlCurrency(true);
      }
      if (this.hasIndividualAllocId()) {
        builder.setIndividualAllocId(this.getIndividualAllocId());
        presenceBuilder.setIndividualAllocId(true);
      }
      if (this.hasAllocQty()) {
        builder.setAllocQty(this.getAllocQty());
        presenceBuilder.setAllocQty(true);
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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getSecurityAltId()) {
        this.setSecurityAltId(proto.getSecurityAltId());
      }
      if (fieldPresence.getSecurityAltIdSource()) {
        this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoSecurityAltId.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoEvents.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoInstrumentParties.NoInstrumentPartySubIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
            .NoInstrumentPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getInstrumentPartySubId()) {
          this.setInstrumentPartySubId(proto.getInstrumentPartySubId());
        }
        if (fieldPresence.getInstrumentPartySubIdType()) {
          this.setInstrumentPartySubIdType(proto.getInstrumentPartySubIdType());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
          .NoInstrumentPartySubIds.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
            .NoInstrumentPartySubIds.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
                .NoInstrumentPartySubIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
            .NoInstrumentPartySubIds.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
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

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                              .NoInstrumentParties proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                 .NoInstrumentParties.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoInstrumentParties
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

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                  .NoComplexEvents.NoComplexEventDates.NoComplexEventTimes proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.FieldPresence fieldPresence =
              proto.getFieldPresence();

          if (fieldPresence.getComplexEventStartTime()) {
            this.setComplexEventStartTime(proto.getComplexEventStartTime());
          }
          if (fieldPresence.getComplexEventEndTime()) {
            this.setComplexEventEndTime(proto.getComplexEventEndTime());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
            .NoComplexEventDates.NoComplexEventTimes.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
                  .NoComplexEventDates.NoComplexEventTimes.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
              .NoComplexEventDates.NoComplexEventTimes.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoComplexEvents.NoComplexEventDates proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
          .NoComplexEventDates.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
            .NoComplexEventDates.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
                .NoComplexEventDates.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
            .NoComplexEventDates.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoComplexEvents.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoComplexEvents.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoUnderlyings.NoUnderlyingSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingSecurityAltId()) {
          this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
        }
        if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
          this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
          .NoUnderlyingSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
                .NoUnderlyingSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoUnderlyings.NoUnderlyingStips proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingStips.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingStipType()) {
          this.setUnderlyingStipType(proto.getUnderlyingStipType());
        }
        if (fieldPresence.getUnderlyingStipValue()) {
          this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
          .NoUnderlyingStips.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingStips.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
                .NoUnderlyingStips.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUnderlyingStips.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
                .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
              .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
                  .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
              .NoUndlyInstrumentParties.NoUndlyInstrumentPartySubIds.FieldPresence
              .Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                .NoUnderlyings.NoUndlyInstrumentParties proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
          .NoUndlyInstrumentParties.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUndlyInstrumentParties.Builder builder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
                .NoUndlyInstrumentParties.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
            .NoUndlyInstrumentParties.FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoUnderlyings.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getStipulationType()) {
        this.setStipulationType(proto.getStipulationType());
      }
      if (fieldPresence.getStipulationValue()) {
        this.setStipulationValue(proto.getStipulationValue());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStipulations.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoStipulations.FieldPresence.newBuilder();

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

  public static class NoStrategyParameters extends quickfix.Group {
    private final quickfix.StringField strategyParameterNameField =
        FieldFactory.newStringField(958);
    public boolean hasStrategyParameterName() throws quickfix.FieldNotFound {
      return isSetField(958);
    }
    public String getStrategyParameterName() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strategyParameterNameField));
    }
    public NoStrategyParameters setStrategyParameterName(final String value) {
      setField(FieldValue.to(strategyParameterNameField, value));
      return this;
    }
    public NoStrategyParameters setStrategyParameterName(
        final quickfix.field.StrategyParameterName value) {
      setField(FieldValue.to(strategyParameterNameField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField strategyParameterTypeField = FieldFactory.newIntField(959);
    public boolean hasStrategyParameterType() throws quickfix.FieldNotFound {
      return isSetField(959);
    }
    public int getStrategyParameterType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strategyParameterTypeField));
    }
    public NoStrategyParameters setStrategyParameterType(final int value) {
      setField(FieldValue.to(strategyParameterTypeField, value));
      return this;
    }
    public NoStrategyParameters setStrategyParameterType(
        final quickfix.field.StrategyParameterType value) {
      setField(FieldValue.to(strategyParameterTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField strategyParameterValueField =
        FieldFactory.newStringField(960);
    public boolean hasStrategyParameterValue() throws quickfix.FieldNotFound {
      return isSetField(960);
    }
    public String getStrategyParameterValue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(strategyParameterValueField));
    }
    public NoStrategyParameters setStrategyParameterValue(final String value) {
      setField(FieldValue.to(strategyParameterValueField, value));
      return this;
    }
    public NoStrategyParameters setStrategyParameterValue(
        final quickfix.field.StrategyParameterValue value) {
      setField(FieldValue.to(strategyParameterValueField, FieldValue.of(value)));
      return this;
    }

    public NoStrategyParameters() {
      super(957, 958, new int[] {958, 959, 960, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                              .NoStrategyParameters proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStrategyParameters
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getStrategyParameterName()) {
        this.setStrategyParameterName(proto.getStrategyParameterName());
      }
      if (fieldPresence.getStrategyParameterType()) {
        this.setStrategyParameterType(proto.getStrategyParameterType());
      }
      if (fieldPresence.getStrategyParameterValue()) {
        this.setStrategyParameterValue(proto.getStrategyParameterValue());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStrategyParameters.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStrategyParameters
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                 .NoStrategyParameters.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStrategyParameters
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoStrategyParameters
              .FieldPresence.newBuilder();

      if (this.hasStrategyParameterName()) {
        builder.setStrategyParameterName(this.getStrategyParameterName());
        presenceBuilder.setStrategyParameterName(true);
      }
      if (this.hasStrategyParameterType()) {
        builder.setStrategyParameterType(this.getStrategyParameterType());
        presenceBuilder.setStrategyParameterType(true);
      }
      if (this.hasStrategyParameterValue()) {
        builder.setStrategyParameterValue(this.getStrategyParameterValue());
        presenceBuilder.setStrategyParameterValue(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoFills extends quickfix.Group {
    public static class NoNested4PartyIds extends quickfix.Group {
      public static class NoNested4PartySubIds extends quickfix.Group {
        private final quickfix.StringField nested4PartySubIdField =
            FieldFactory.newStringField(1412);
        public boolean hasNested4PartySubId() throws quickfix.FieldNotFound {
          return isSetField(1412);
        }
        public String getNested4PartySubId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested4PartySubIdField));
        }
        public NoNested4PartySubIds setNested4PartySubId(final String value) {
          setField(FieldValue.to(nested4PartySubIdField, value));
          return this;
        }
        public NoNested4PartySubIds setNested4PartySubId(
            final quickfix.field.Nested4PartySubID value) {
          setField(FieldValue.to(nested4PartySubIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField nested4PartySubIdTypeField = FieldFactory.newIntField(1411);
        public boolean hasNested4PartySubIdType() throws quickfix.FieldNotFound {
          return isSetField(1411);
        }
        public int getNested4PartySubIdType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested4PartySubIdTypeField));
        }
        public NoNested4PartySubIds setNested4PartySubIdType(final int value) {
          setField(FieldValue.to(nested4PartySubIdTypeField, value));
          return this;
        }
        public NoNested4PartySubIds setNested4PartySubIdType(
            final quickfix.field.Nested4PartySubIDType value) {
          setField(FieldValue.to(nested4PartySubIdTypeField, FieldValue.of(value)));
          return this;
        }

        public NoNested4PartySubIds() {
          super(1413, 1412, new int[] {1412, 1411, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                  .NoFills.NoNested4PartyIds.NoNested4PartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
              .NoNested4PartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getNested4PartySubId()) {
            this.setNested4PartySubId(proto.getNested4PartySubId());
          }
          if (fieldPresence.getNested4PartySubIdType()) {
            this.setNested4PartySubIdType(proto.getNested4PartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
            .NoNested4PartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
              .NoNested4PartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
                  .NoNested4PartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
              .NoNested4PartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
                  .NoNested4PartySubIds.FieldPresence.newBuilder();

          if (this.hasNested4PartySubId()) {
            builder.setNested4PartySubId(this.getNested4PartySubId());
            presenceBuilder.setNested4PartySubId(true);
          }
          if (this.hasNested4PartySubIdType()) {
            builder.setNested4PartySubIdType(this.getNested4PartySubIdType());
            presenceBuilder.setNested4PartySubIdType(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField nested4PartyIdField = FieldFactory.newStringField(1415);
      public boolean hasNested4PartyId() throws quickfix.FieldNotFound {
        return isSetField(1415);
      }
      public String getNested4PartyId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested4PartyIdField));
      }
      public NoNested4PartyIds setNested4PartyId(final String value) {
        setField(FieldValue.to(nested4PartyIdField, value));
        return this;
      }
      public NoNested4PartyIds setNested4PartyId(final quickfix.field.Nested4PartyID value) {
        setField(FieldValue.to(nested4PartyIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField nested4PartyIdSourceField = FieldFactory.newCharField(1416);
      public boolean hasNested4PartyIdSource() throws quickfix.FieldNotFound {
        return isSetField(1416);
      }
      public int getNested4PartyIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested4PartyIdSourceField));
      }
      public NoNested4PartyIds setNested4PartyIdSource(final int value) {
        setField(FieldValue.to(nested4PartyIdSourceField, value));
        return this;
      }
      public NoNested4PartyIds setNested4PartyIdSource(final char value) {
        setField(FieldValue.to(nested4PartyIdSourceField, value));
        return this;
      }
      public NoNested4PartyIds setNested4PartyIdSource(final String value) {
        setField(FieldValue.to(nested4PartyIdSourceField, value));
        return this;
      }
      public NoNested4PartyIds setNested4PartyIdSource(
          final quickfix.field.Nested4PartyIDSource value) {
        setField(FieldValue.to(nested4PartyIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField nested4PartyRoleField = FieldFactory.newIntField(1417);
      public boolean hasNested4PartyRole() throws quickfix.FieldNotFound {
        return isSetField(1417);
      }
      public int getNested4PartyRole() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested4PartyRoleField));
      }
      public NoNested4PartyIds setNested4PartyRole(final int value) {
        setField(FieldValue.to(nested4PartyRoleField, value));
        return this;
      }
      public NoNested4PartyIds setNested4PartyRole(final quickfix.field.Nested4PartyRole value) {
        setField(FieldValue.to(nested4PartyRoleField, FieldValue.of(value)));
        return this;
      }

      public NoNested4PartyIds() {
        super(1414, 1415, new int[] {1415, 1416, 1417, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills
                                .NoNested4PartyIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoNested4PartySubIdsCount(); i++) {
          final NoNested4PartyIds.NoNested4PartySubIds group =
              new NoNested4PartyIds.NoNested4PartySubIds();
          group.fromProto(proto.getNoNested4PartySubIds(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getNested4PartyId()) {
          this.setNested4PartyId(proto.getNested4PartyId());
        }
        if (fieldPresence.getNested4PartyIdSource()) {
          this.setNested4PartyIdSource(proto.getNested4PartyIdSource());
        }
        if (fieldPresence.getNested4PartyRole()) {
          this.setNested4PartyRole(proto.getNested4PartyRole());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills
                                   .NoNested4PartyIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.NoNested4PartyIds
                .FieldPresence.newBuilder();

        final int noNested4PartySubIdsGroupCount = this.getGroupCount(1413);
        for (int i = 1; i <= noNested4PartySubIdsGroupCount; i++) {
          final NoNested4PartyIds.NoNested4PartySubIds group =
              new NoNested4PartyIds.NoNested4PartySubIds();
          this.getGroup(i, group);
          builder.addNoNested4PartySubIds(group.toBuilder().build());
        }

        if (this.hasNested4PartyId()) {
          builder.setNested4PartyId(this.getNested4PartyId());
          presenceBuilder.setNested4PartyId(true);
        }
        if (this.hasNested4PartyIdSource()) {
          builder.setNested4PartyIdSource(this.getNested4PartyIdSource());
          presenceBuilder.setNested4PartyIdSource(true);
        }
        if (this.hasNested4PartyRole()) {
          builder.setNested4PartyRole(this.getNested4PartyRole());
          presenceBuilder.setNested4PartyRole(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    private final quickfix.StringField fillExecIdField = FieldFactory.newStringField(1363);
    public boolean hasFillExecId() throws quickfix.FieldNotFound {
      return isSetField(1363);
    }
    public String getFillExecId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(fillExecIdField));
    }
    public NoFills setFillExecId(final String value) {
      setField(FieldValue.to(fillExecIdField, value));
      return this;
    }
    public NoFills setFillExecId(final quickfix.field.FillExecID value) {
      setField(FieldValue.to(fillExecIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField fillPxField = FieldFactory.newDoubleField(1364);
    public boolean hasFillPx() throws quickfix.FieldNotFound {
      return isSetField(1364);
    }
    public double getFillPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(fillPxField));
    }
    public NoFills setFillPx(final double value) {
      setField(FieldValue.to(fillPxField, value));
      return this;
    }
    public NoFills setFillPx(final quickfix.field.FillPx value) {
      setField(FieldValue.to(fillPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField fillQtyField = FieldFactory.newDoubleField(1365);
    public boolean hasFillQty() throws quickfix.FieldNotFound {
      return isSetField(1365);
    }
    public double getFillQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(fillQtyField));
    }
    public NoFills setFillQty(final double value) {
      setField(FieldValue.to(fillQtyField, value));
      return this;
    }
    public NoFills setFillQty(final quickfix.field.FillQty value) {
      setField(FieldValue.to(fillQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField fillLiquidityIndField = FieldFactory.newIntField(1443);
    public boolean hasFillLiquidityInd() throws quickfix.FieldNotFound {
      return isSetField(1443);
    }
    public int getFillLiquidityInd() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(fillLiquidityIndField));
    }
    public NoFills setFillLiquidityInd(final int value) {
      setField(FieldValue.to(fillLiquidityIndField, value));
      return this;
    }
    public NoFills setFillLiquidityInd(final quickfix.field.FillLiquidityInd value) {
      setField(FieldValue.to(fillLiquidityIndField, FieldValue.of(value)));
      return this;
    }

    public NoFills() {
      super(1362, 1363, new int[] {1363, 1364, 1365, 1443, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills
          .FieldPresence fieldPresence = proto.getFieldPresence();

      for (int i = 0; i < proto.getNoNested4PartyIdsCount(); i++) {
        final NoFills.NoNested4PartyIds group = new NoFills.NoNested4PartyIds();
        group.fromProto(proto.getNoNested4PartyIds(i));
        this.addGroupRef(group);
      }
      if (fieldPresence.getFillExecId()) {
        this.setFillExecId(proto.getFillExecId());
      }
      if (fieldPresence.getFillPx()) {
        this.setFillPx(proto.getFillPx());
      }
      if (fieldPresence.getFillQty()) {
        this.setFillQty(proto.getFillQty());
      }
      if (fieldPresence.getFillLiquidityInd()) {
        this.setFillLiquidityInd(proto.getFillLiquidityInd());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoFills.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoFills.FieldPresence.newBuilder();

      final int noNested4PartyIdsGroupCount = this.getGroupCount(1414);
      for (int i = 1; i <= noNested4PartyIdsGroupCount; i++) {
        final NoFills.NoNested4PartyIds group = new NoFills.NoNested4PartyIds();
        this.getGroup(i, group);
        builder.addNoNested4PartyIds(group.toBuilder().build());
      }

      if (this.hasFillExecId()) {
        builder.setFillExecId(this.getFillExecId());
        presenceBuilder.setFillExecId(true);
      }
      if (this.hasFillPx()) {
        builder.setFillPx(this.getFillPx());
        presenceBuilder.setFillPx(true);
      }
      if (this.hasFillQty()) {
        builder.setFillQty(this.getFillQty());
        presenceBuilder.setFillQty(true);
      }
      if (this.hasFillLiquidityInd()) {
        builder.setFillLiquidityInd(this.getFillLiquidityInd());
        presenceBuilder.setFillLiquidityInd(true);
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

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources
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

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources
          .Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoRateSources.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
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

  public static class NoContAmts extends quickfix.Group {
    private final quickfix.IntField contAmtTypeField = FieldFactory.newIntField(519);
    public boolean hasContAmtType() throws quickfix.FieldNotFound {
      return isSetField(519);
    }
    public int getContAmtType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contAmtTypeField));
    }
    public NoContAmts setContAmtType(final int value) {
      setField(FieldValue.to(contAmtTypeField, value));
      return this;
    }
    public NoContAmts setContAmtType(final quickfix.field.ContAmtType value) {
      setField(FieldValue.to(contAmtTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField contAmtValueField = FieldFactory.newDoubleField(520);
    public boolean hasContAmtValue() throws quickfix.FieldNotFound {
      return isSetField(520);
    }
    public double getContAmtValue() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contAmtValueField));
    }
    public NoContAmts setContAmtValue(final double value) {
      setField(FieldValue.to(contAmtValueField, value));
      return this;
    }
    public NoContAmts setContAmtValue(final quickfix.field.ContAmtValue value) {
      setField(FieldValue.to(contAmtValueField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField contAmtCurrField = FieldFactory.newStringField(521);
    public boolean hasContAmtCurr() throws quickfix.FieldNotFound {
      return isSetField(521);
    }
    public String getContAmtCurr() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(contAmtCurrField));
    }
    public NoContAmts setContAmtCurr(final String value) {
      setField(FieldValue.to(contAmtCurrField, value));
      return this;
    }
    public NoContAmts setContAmtCurr(final quickfix.field.ContAmtCurr value) {
      setField(FieldValue.to(contAmtCurrField, FieldValue.of(value)));
      return this;
    }

    public NoContAmts() {
      super(518, 519, new int[] {519, 520, 521, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getContAmtType()) {
        this.setContAmtType(proto.getContAmtType());
      }
      if (fieldPresence.getContAmtValue()) {
        this.setContAmtValue(proto.getContAmtValue());
      }
      if (fieldPresence.getContAmtCurr()) {
        this.setContAmtCurr(proto.getContAmtCurr());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoContAmts.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoContAmts.FieldPresence.newBuilder();

      if (this.hasContAmtType()) {
        builder.setContAmtType(this.getContAmtType());
        presenceBuilder.setContAmtType(true);
      }
      if (this.hasContAmtValue()) {
        builder.setContAmtValue(this.getContAmtValue());
        presenceBuilder.setContAmtValue(true);
      }
      if (this.hasContAmtCurr()) {
        builder.setContAmtCurr(this.getContAmtCurr());
        presenceBuilder.setContAmtCurr(true);
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                .NoLegSecurityAltId proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegSecurityAltId
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getLegSecurityAltId()) {
          this.setLegSecurityAltId(proto.getLegSecurityAltId());
        }
        if (fieldPresence.getLegSecurityAltIdSource()) {
          this.setLegSecurityAltIdSource(proto.getLegSecurityAltIdSource());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegSecurityAltId
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegSecurityAltId
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                   .NoLegSecurityAltId.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegSecurityAltId
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegSecurityAltId
                .FieldPresence.newBuilder();

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
      private final quickfix.StringField legStipulationTypeField = FieldFactory.newStringField(688);
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

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                .NoLegStipulations proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegStipulations
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getLegStipulationType()) {
          this.setLegStipulationType(proto.getLegStipulationType());
        }
        if (fieldPresence.getLegStipulationValue()) {
          this.setLegStipulationValue(proto.getLegStipulationValue());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegStipulations
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegStipulations
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                   .NoLegStipulations.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegStipulations
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegStipulations
                .FieldPresence.newBuilder();

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

    public static class NoLegAllocs extends quickfix.Group {
      public static class NoNested2PartyIds extends quickfix.Group {
        public static class NoNested2PartySubIds extends quickfix.Group {
          private final quickfix.StringField nested2PartySubIdField =
              FieldFactory.newStringField(760);
          public boolean hasNested2PartySubId() throws quickfix.FieldNotFound {
            return isSetField(760);
          }
          public String getNested2PartySubId() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(nested2PartySubIdField));
          }
          public NoNested2PartySubIds setNested2PartySubId(final String value) {
            setField(FieldValue.to(nested2PartySubIdField, value));
            return this;
          }
          public NoNested2PartySubIds setNested2PartySubId(
              final quickfix.field.Nested2PartySubID value) {
            setField(FieldValue.to(nested2PartySubIdField, FieldValue.of(value)));
            return this;
          }

          private final quickfix.IntField nested2PartySubIdTypeField =
              FieldFactory.newIntField(807);
          public boolean hasNested2PartySubIdType() throws quickfix.FieldNotFound {
            return isSetField(807);
          }
          public int getNested2PartySubIdType() throws quickfix.FieldNotFound {
            return FieldValue.of(getField(nested2PartySubIdTypeField));
          }
          public NoNested2PartySubIds setNested2PartySubIdType(final int value) {
            setField(FieldValue.to(nested2PartySubIdTypeField, value));
            return this;
          }
          public NoNested2PartySubIds setNested2PartySubIdType(
              final quickfix.field.Nested2PartySubIDType value) {
            setField(FieldValue.to(nested2PartySubIdTypeField, FieldValue.of(value)));
            return this;
          }

          public NoNested2PartySubIds() {
            super(806, 760, new int[] {760, 807, 0});
          }

          @Override
          public void addGroup(final quickfix.Group group) {
            addGroupRef(group);
          }

          public void fromProto(
              final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                  .NoNested2PartyIds.NoNested2PartySubIds proto) {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                .NoNested2PartyIds.NoNested2PartySubIds.FieldPresence fieldPresence =
                proto.getFieldPresence();

            if (fieldPresence.getNested2PartySubId()) {
              this.setNested2PartySubId(proto.getNested2PartySubId());
            }
            if (fieldPresence.getNested2PartySubIdType()) {
              this.setNested2PartySubIdType(proto.getNested2PartySubIdType());
            }
          }

          public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
              .NoNested2PartyIds.NoNested2PartySubIds.Builder
              toBuilder() throws quickfix.FieldNotFound {
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                .NoNested2PartyIds.NoNested2PartySubIds.Builder builder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                    .NoNested2PartyIds.NoNested2PartySubIds.newBuilder();
            final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                .NoNested2PartyIds.NoNested2PartySubIds.FieldPresence.Builder presenceBuilder =
                garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                    .NoNested2PartyIds.NoNested2PartySubIds.FieldPresence.newBuilder();

            if (this.hasNested2PartySubId()) {
              builder.setNested2PartySubId(this.getNested2PartySubId());
              presenceBuilder.setNested2PartySubId(true);
            }
            if (this.hasNested2PartySubIdType()) {
              builder.setNested2PartySubIdType(this.getNested2PartySubIdType());
              presenceBuilder.setNested2PartySubIdType(true);
            }
            builder.setFieldPresence(presenceBuilder.build());
            return builder;
          }
        }

        private final quickfix.StringField nested2PartyIdField = FieldFactory.newStringField(757);
        public boolean hasNested2PartyId() throws quickfix.FieldNotFound {
          return isSetField(757);
        }
        public String getNested2PartyId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested2PartyIdField));
        }
        public NoNested2PartyIds setNested2PartyId(final String value) {
          setField(FieldValue.to(nested2PartyIdField, value));
          return this;
        }
        public NoNested2PartyIds setNested2PartyId(final quickfix.field.Nested2PartyID value) {
          setField(FieldValue.to(nested2PartyIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.CharField nested2PartyIdSourceField = FieldFactory.newCharField(758);
        public boolean hasNested2PartyIdSource() throws quickfix.FieldNotFound {
          return isSetField(758);
        }
        public int getNested2PartyIdSource() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested2PartyIdSourceField));
        }
        public NoNested2PartyIds setNested2PartyIdSource(final int value) {
          setField(FieldValue.to(nested2PartyIdSourceField, value));
          return this;
        }
        public NoNested2PartyIds setNested2PartyIdSource(final char value) {
          setField(FieldValue.to(nested2PartyIdSourceField, value));
          return this;
        }
        public NoNested2PartyIds setNested2PartyIdSource(final String value) {
          setField(FieldValue.to(nested2PartyIdSourceField, value));
          return this;
        }
        public NoNested2PartyIds setNested2PartyIdSource(
            final quickfix.field.Nested2PartyIDSource value) {
          setField(FieldValue.to(nested2PartyIdSourceField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField nested2PartyRoleField = FieldFactory.newIntField(759);
        public boolean hasNested2PartyRole() throws quickfix.FieldNotFound {
          return isSetField(759);
        }
        public int getNested2PartyRole() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested2PartyRoleField));
        }
        public NoNested2PartyIds setNested2PartyRole(final int value) {
          setField(FieldValue.to(nested2PartyRoleField, value));
          return this;
        }
        public NoNested2PartyIds setNested2PartyRole(final quickfix.field.Nested2PartyRole value) {
          setField(FieldValue.to(nested2PartyRoleField, FieldValue.of(value)));
          return this;
        }

        public NoNested2PartyIds() {
          super(756, 757, new int[] {757, 758, 759, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                  .NoLegs.NoLegAllocs.NoNested2PartyIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
              .NoNested2PartyIds.FieldPresence fieldPresence = proto.getFieldPresence();

          for (int i = 0; i < proto.getNoNested2PartySubIdsCount(); i++) {
            final NoNested2PartyIds.NoNested2PartySubIds group =
                new NoNested2PartyIds.NoNested2PartySubIds();
            group.fromProto(proto.getNoNested2PartySubIds(i));
            this.addGroupRef(group);
          }
          if (fieldPresence.getNested2PartyId()) {
            this.setNested2PartyId(proto.getNested2PartyId());
          }
          if (fieldPresence.getNested2PartyIdSource()) {
            this.setNested2PartyIdSource(proto.getNested2PartyIdSource());
          }
          if (fieldPresence.getNested2PartyRole()) {
            this.setNested2PartyRole(proto.getNested2PartyRole());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
            .NoNested2PartyIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
              .NoNested2PartyIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                  .NoNested2PartyIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
              .NoNested2PartyIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                  .NoNested2PartyIds.FieldPresence.newBuilder();

          final int noNested2PartySubIdsGroupCount = this.getGroupCount(806);
          for (int i = 1; i <= noNested2PartySubIdsGroupCount; i++) {
            final NoNested2PartyIds.NoNested2PartySubIds group =
                new NoNested2PartyIds.NoNested2PartySubIds();
            this.getGroup(i, group);
            builder.addNoNested2PartySubIds(group.toBuilder().build());
          }

          if (this.hasNested2PartyId()) {
            builder.setNested2PartyId(this.getNested2PartyId());
            presenceBuilder.setNested2PartyId(true);
          }
          if (this.hasNested2PartyIdSource()) {
            builder.setNested2PartyIdSource(this.getNested2PartyIdSource());
            presenceBuilder.setNested2PartyIdSource(true);
          }
          if (this.hasNested2PartyRole()) {
            builder.setNested2PartyRole(this.getNested2PartyRole());
            presenceBuilder.setNested2PartyRole(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField legAllocAccountField = FieldFactory.newStringField(671);
      public boolean hasLegAllocAccount() throws quickfix.FieldNotFound {
        return isSetField(671);
      }
      public String getLegAllocAccount() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legAllocAccountField));
      }
      public NoLegAllocs setLegAllocAccount(final String value) {
        setField(FieldValue.to(legAllocAccountField, value));
        return this;
      }
      public NoLegAllocs setLegAllocAccount(final quickfix.field.LegAllocAccount value) {
        setField(FieldValue.to(legAllocAccountField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legIndividualAllocIdField =
          FieldFactory.newStringField(672);
      public boolean hasLegIndividualAllocId() throws quickfix.FieldNotFound {
        return isSetField(672);
      }
      public String getLegIndividualAllocId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legIndividualAllocIdField));
      }
      public NoLegAllocs setLegIndividualAllocId(final String value) {
        setField(FieldValue.to(legIndividualAllocIdField, value));
        return this;
      }
      public NoLegAllocs setLegIndividualAllocId(final quickfix.field.LegIndividualAllocID value) {
        setField(FieldValue.to(legIndividualAllocIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.DoubleField legAllocQtyField = FieldFactory.newDoubleField(673);
      public boolean hasLegAllocQty() throws quickfix.FieldNotFound {
        return isSetField(673);
      }
      public double getLegAllocQty() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legAllocQtyField));
      }
      public NoLegAllocs setLegAllocQty(final double value) {
        setField(FieldValue.to(legAllocQtyField, value));
        return this;
      }
      public NoLegAllocs setLegAllocQty(final quickfix.field.LegAllocQty value) {
        setField(FieldValue.to(legAllocQtyField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legAllocAcctIdSourceField =
          FieldFactory.newStringField(674);
      public boolean hasLegAllocAcctIdSource() throws quickfix.FieldNotFound {
        return isSetField(674);
      }
      public String getLegAllocAcctIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legAllocAcctIdSourceField));
      }
      public NoLegAllocs setLegAllocAcctIdSource(final String value) {
        setField(FieldValue.to(legAllocAcctIdSourceField, value));
        return this;
      }
      public NoLegAllocs setLegAllocAcctIdSource(final quickfix.field.LegAllocAcctIDSource value) {
        setField(FieldValue.to(legAllocAcctIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.StringField legAllocSettlCurrencyField =
          FieldFactory.newStringField(1367);
      public boolean hasLegAllocSettlCurrency() throws quickfix.FieldNotFound {
        return isSetField(1367);
      }
      public String getLegAllocSettlCurrency() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(legAllocSettlCurrencyField));
      }
      public NoLegAllocs setLegAllocSettlCurrency(final String value) {
        setField(FieldValue.to(legAllocSettlCurrencyField, value));
        return this;
      }
      public NoLegAllocs setLegAllocSettlCurrency(
          final quickfix.field.LegAllocSettlCurrency value) {
        setField(FieldValue.to(legAllocSettlCurrencyField, FieldValue.of(value)));
        return this;
      }

      public NoLegAllocs() {
        super(670, 671, new int[] {671, 672, 673, 674, 1367, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                .NoLegAllocs proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoNested2PartyIdsCount(); i++) {
          final NoLegAllocs.NoNested2PartyIds group = new NoLegAllocs.NoNested2PartyIds();
          group.fromProto(proto.getNoNested2PartyIds(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getLegAllocAccount()) {
          this.setLegAllocAccount(proto.getLegAllocAccount());
        }
        if (fieldPresence.getLegIndividualAllocId()) {
          this.setLegIndividualAllocId(proto.getLegIndividualAllocId());
        }
        if (fieldPresence.getLegAllocQty()) {
          this.setLegAllocQty(proto.getLegAllocQty());
        }
        if (fieldPresence.getLegAllocAcctIdSource()) {
          this.setLegAllocAcctIdSource(proto.getLegAllocAcctIdSource());
        }
        if (fieldPresence.getLegAllocSettlCurrency()) {
          this.setLegAllocSettlCurrency(proto.getLegAllocSettlCurrency());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                   .NoLegAllocs.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoLegAllocs
                .FieldPresence.newBuilder();

        final int noNested2PartyIdsGroupCount = this.getGroupCount(756);
        for (int i = 1; i <= noNested2PartyIdsGroupCount; i++) {
          final NoLegAllocs.NoNested2PartyIds group = new NoLegAllocs.NoNested2PartyIds();
          this.getGroup(i, group);
          builder.addNoNested2PartyIds(group.toBuilder().build());
        }

        if (this.hasLegAllocAccount()) {
          builder.setLegAllocAccount(this.getLegAllocAccount());
          presenceBuilder.setLegAllocAccount(true);
        }
        if (this.hasLegIndividualAllocId()) {
          builder.setLegIndividualAllocId(this.getLegIndividualAllocId());
          presenceBuilder.setLegIndividualAllocId(true);
        }
        if (this.hasLegAllocQty()) {
          builder.setLegAllocQty(this.getLegAllocQty());
          presenceBuilder.setLegAllocQty(true);
        }
        if (this.hasLegAllocAcctIdSource()) {
          builder.setLegAllocAcctIdSource(this.getLegAllocAcctIdSource());
          presenceBuilder.setLegAllocAcctIdSource(true);
        }
        if (this.hasLegAllocSettlCurrency()) {
          builder.setLegAllocSettlCurrency(this.getLegAllocSettlCurrency());
          presenceBuilder.setLegAllocSettlCurrency(true);
        }
        builder.setFieldPresence(presenceBuilder.build());
        return builder;
      }
    }

    public static class NoNested3PartyIds extends quickfix.Group {
      public static class NoNested3PartySubIds extends quickfix.Group {
        private final quickfix.StringField nested3PartySubIdField =
            FieldFactory.newStringField(953);
        public boolean hasNested3PartySubId() throws quickfix.FieldNotFound {
          return isSetField(953);
        }
        public String getNested3PartySubId() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested3PartySubIdField));
        }
        public NoNested3PartySubIds setNested3PartySubId(final String value) {
          setField(FieldValue.to(nested3PartySubIdField, value));
          return this;
        }
        public NoNested3PartySubIds setNested3PartySubId(
            final quickfix.field.Nested3PartySubID value) {
          setField(FieldValue.to(nested3PartySubIdField, FieldValue.of(value)));
          return this;
        }

        private final quickfix.IntField nested3PartySubIdTypeField = FieldFactory.newIntField(954);
        public boolean hasNested3PartySubIdType() throws quickfix.FieldNotFound {
          return isSetField(954);
        }
        public int getNested3PartySubIdType() throws quickfix.FieldNotFound {
          return FieldValue.of(getField(nested3PartySubIdTypeField));
        }
        public NoNested3PartySubIds setNested3PartySubIdType(final int value) {
          setField(FieldValue.to(nested3PartySubIdTypeField, value));
          return this;
        }
        public NoNested3PartySubIds setNested3PartySubIdType(
            final quickfix.field.Nested3PartySubIDType value) {
          setField(FieldValue.to(nested3PartySubIdTypeField, FieldValue.of(value)));
          return this;
        }

        public NoNested3PartySubIds() {
          super(952, 953, new int[] {953, 954, 0});
        }

        @Override
        public void addGroup(final quickfix.Group group) {
          addGroupRef(group);
        }

        public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                  .NoLegs.NoNested3PartyIds.NoNested3PartySubIds proto) {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
              .NoNested3PartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getNested3PartySubId()) {
            this.setNested3PartySubId(proto.getNested3PartySubId());
          }
          if (fieldPresence.getNested3PartySubIdType()) {
            this.setNested3PartySubIdType(proto.getNested3PartySubIdType());
          }
        }

        public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
            .NoNested3PartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
              .NoNested3PartySubIds.Builder builder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
                  .NoNested3PartySubIds.newBuilder();
          final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
              .NoNested3PartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
                  .NoNested3PartySubIds.FieldPresence.newBuilder();

          if (this.hasNested3PartySubId()) {
            builder.setNested3PartySubId(this.getNested3PartySubId());
            presenceBuilder.setNested3PartySubId(true);
          }
          if (this.hasNested3PartySubIdType()) {
            builder.setNested3PartySubIdType(this.getNested3PartySubIdType());
            presenceBuilder.setNested3PartySubIdType(true);
          }
          builder.setFieldPresence(presenceBuilder.build());
          return builder;
        }
      }

      private final quickfix.StringField nested3PartyIdField = FieldFactory.newStringField(949);
      public boolean hasNested3PartyId() throws quickfix.FieldNotFound {
        return isSetField(949);
      }
      public String getNested3PartyId() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested3PartyIdField));
      }
      public NoNested3PartyIds setNested3PartyId(final String value) {
        setField(FieldValue.to(nested3PartyIdField, value));
        return this;
      }
      public NoNested3PartyIds setNested3PartyId(final quickfix.field.Nested3PartyID value) {
        setField(FieldValue.to(nested3PartyIdField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.CharField nested3PartyIdSourceField = FieldFactory.newCharField(950);
      public boolean hasNested3PartyIdSource() throws quickfix.FieldNotFound {
        return isSetField(950);
      }
      public int getNested3PartyIdSource() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested3PartyIdSourceField));
      }
      public NoNested3PartyIds setNested3PartyIdSource(final int value) {
        setField(FieldValue.to(nested3PartyIdSourceField, value));
        return this;
      }
      public NoNested3PartyIds setNested3PartyIdSource(final char value) {
        setField(FieldValue.to(nested3PartyIdSourceField, value));
        return this;
      }
      public NoNested3PartyIds setNested3PartyIdSource(final String value) {
        setField(FieldValue.to(nested3PartyIdSourceField, value));
        return this;
      }
      public NoNested3PartyIds setNested3PartyIdSource(
          final quickfix.field.Nested3PartyIDSource value) {
        setField(FieldValue.to(nested3PartyIdSourceField, FieldValue.of(value)));
        return this;
      }

      private final quickfix.IntField nested3PartyRoleField = FieldFactory.newIntField(951);
      public boolean hasNested3PartyRole() throws quickfix.FieldNotFound {
        return isSetField(951);
      }
      public int getNested3PartyRole() throws quickfix.FieldNotFound {
        return FieldValue.of(getField(nested3PartyRoleField));
      }
      public NoNested3PartyIds setNested3PartyRole(final int value) {
        setField(FieldValue.to(nested3PartyRoleField, value));
        return this;
      }
      public NoNested3PartyIds setNested3PartyRole(final quickfix.field.Nested3PartyRole value) {
        setField(FieldValue.to(nested3PartyRoleField, FieldValue.of(value)));
        return this;
      }

      public NoNested3PartyIds() {
        super(948, 949, new int[] {949, 950, 951, 0});
      }

      @Override
      public void addGroup(final quickfix.Group group) {
        addGroupRef(group);
      }

      public void fromProto(final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                .NoNested3PartyIds proto) {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        for (int i = 0; i < proto.getNoNested3PartySubIdsCount(); i++) {
          final NoNested3PartyIds.NoNested3PartySubIds group =
              new NoNested3PartyIds.NoNested3PartySubIds();
          group.fromProto(proto.getNoNested3PartySubIds(i));
          this.addGroupRef(group);
        }
        if (fieldPresence.getNested3PartyId()) {
          this.setNested3PartyId(proto.getNested3PartyId());
        }
        if (fieldPresence.getNested3PartyIdSource()) {
          this.setNested3PartyIdSource(proto.getNested3PartyIdSource());
        }
        if (fieldPresence.getNested3PartyRole()) {
          this.setNested3PartyRole(proto.getNested3PartyRole());
        }
      }

      public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
            .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
                                   .NoNested3PartyIds.newBuilder();
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.NoNested3PartyIds
                .FieldPresence.newBuilder();

        final int noNested3PartySubIdsGroupCount = this.getGroupCount(952);
        for (int i = 1; i <= noNested3PartySubIdsGroupCount; i++) {
          final NoNested3PartyIds.NoNested3PartySubIds group =
              new NoNested3PartyIds.NoNested3PartySubIds();
          this.getGroup(i, group);
          builder.addNoNested3PartySubIds(group.toBuilder().build());
        }

        if (this.hasNested3PartyId()) {
          builder.setNested3PartyId(this.getNested3PartyId());
          presenceBuilder.setNested3PartyId(true);
        }
        if (this.hasNested3PartyIdSource()) {
          builder.setNested3PartyIdSource(this.getNested3PartyIdSource());
          presenceBuilder.setNested3PartyIdSource(true);
        }
        if (this.hasNested3PartyRole()) {
          builder.setNested3PartyRole(this.getNested3PartyRole());
          presenceBuilder.setNested3PartyRole(true);
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

    private final quickfix.StringField legAllocIdField = FieldFactory.newStringField(1366);
    public boolean hasLegAllocId() throws quickfix.FieldNotFound {
      return isSetField(1366);
    }
    public String getLegAllocId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legAllocIdField));
    }
    public NoLegs setLegAllocId(final String value) {
      setField(FieldValue.to(legAllocIdField, value));
      return this;
    }
    public NoLegs setLegAllocId(final quickfix.field.LegAllocID value) {
      setField(FieldValue.to(legAllocIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField legPositionEffectField = FieldFactory.newCharField(564);
    public boolean hasLegPositionEffect() throws quickfix.FieldNotFound {
      return isSetField(564);
    }
    public int getLegPositionEffect() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legPositionEffectField));
    }
    public NoLegs setLegPositionEffect(final int value) {
      setField(FieldValue.to(legPositionEffectField, value));
      return this;
    }
    public NoLegs setLegPositionEffect(final char value) {
      setField(FieldValue.to(legPositionEffectField, value));
      return this;
    }
    public NoLegs setLegPositionEffect(final String value) {
      setField(FieldValue.to(legPositionEffectField, value));
      return this;
    }
    public NoLegs setLegPositionEffect(final quickfix.field.LegPositionEffect value) {
      setField(FieldValue.to(legPositionEffectField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField legCoveredOrUncoveredField = FieldFactory.newIntField(565);
    public boolean hasLegCoveredOrUncovered() throws quickfix.FieldNotFound {
      return isSetField(565);
    }
    public int getLegCoveredOrUncovered() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legCoveredOrUncoveredField));
    }
    public NoLegs setLegCoveredOrUncovered(final int value) {
      setField(FieldValue.to(legCoveredOrUncoveredField, value));
      return this;
    }
    public NoLegs setLegCoveredOrUncovered(final quickfix.field.LegCoveredOrUncovered value) {
      setField(FieldValue.to(legCoveredOrUncoveredField, FieldValue.of(value)));
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

    private final quickfix.DoubleField legLastPxField = FieldFactory.newDoubleField(637);
    public boolean hasLegLastPx() throws quickfix.FieldNotFound {
      return isSetField(637);
    }
    public double getLegLastPx() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legLastPxField));
    }
    public NoLegs setLegLastPx(final double value) {
      setField(FieldValue.to(legLastPxField, value));
      return this;
    }
    public NoLegs setLegLastPx(final quickfix.field.LegLastPx value) {
      setField(FieldValue.to(legLastPxField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField legSettlCurrencyField = FieldFactory.newStringField(675);
    public boolean hasLegSettlCurrency() throws quickfix.FieldNotFound {
      return isSetField(675);
    }
    public String getLegSettlCurrency() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legSettlCurrencyField));
    }
    public NoLegs setLegSettlCurrency(final String value) {
      setField(FieldValue.to(legSettlCurrencyField, value));
      return this;
    }
    public NoLegs setLegSettlCurrency(final quickfix.field.LegSettlCurrency value) {
      setField(FieldValue.to(legSettlCurrencyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legLastForwardPointsField =
        FieldFactory.newDoubleField(1073);
    public boolean hasLegLastForwardPoints() throws quickfix.FieldNotFound {
      return isSetField(1073);
    }
    public double getLegLastForwardPoints() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legLastForwardPointsField));
    }
    public NoLegs setLegLastForwardPoints(final double value) {
      setField(FieldValue.to(legLastForwardPointsField, value));
      return this;
    }
    public NoLegs setLegLastForwardPoints(final quickfix.field.LegLastForwardPoints value) {
      setField(FieldValue.to(legLastForwardPointsField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legCalculatedCcyLastQtyField =
        FieldFactory.newDoubleField(1074);
    public boolean hasLegCalculatedCcyLastQty() throws quickfix.FieldNotFound {
      return isSetField(1074);
    }
    public double getLegCalculatedCcyLastQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legCalculatedCcyLastQtyField));
    }
    public NoLegs setLegCalculatedCcyLastQty(final double value) {
      setField(FieldValue.to(legCalculatedCcyLastQtyField, value));
      return this;
    }
    public NoLegs setLegCalculatedCcyLastQty(final quickfix.field.LegCalculatedCcyLastQty value) {
      setField(FieldValue.to(legCalculatedCcyLastQtyField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legGrossTradeAmtField = FieldFactory.newDoubleField(1075);
    public boolean hasLegGrossTradeAmt() throws quickfix.FieldNotFound {
      return isSetField(1075);
    }
    public double getLegGrossTradeAmt() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legGrossTradeAmtField));
    }
    public NoLegs setLegGrossTradeAmt(final double value) {
      setField(FieldValue.to(legGrossTradeAmtField, value));
      return this;
    }
    public NoLegs setLegGrossTradeAmt(final quickfix.field.LegGrossTradeAmt value) {
      setField(FieldValue.to(legGrossTradeAmtField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legVolatilityField = FieldFactory.newDoubleField(1379);
    public boolean hasLegVolatility() throws quickfix.FieldNotFound {
      return isSetField(1379);
    }
    public double getLegVolatility() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legVolatilityField));
    }
    public NoLegs setLegVolatility(final double value) {
      setField(FieldValue.to(legVolatilityField, value));
      return this;
    }
    public NoLegs setLegVolatility(final quickfix.field.LegVolatility value) {
      setField(FieldValue.to(legVolatilityField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legDividendYieldField = FieldFactory.newDoubleField(1381);
    public boolean hasLegDividendYield() throws quickfix.FieldNotFound {
      return isSetField(1381);
    }
    public double getLegDividendYield() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legDividendYieldField));
    }
    public NoLegs setLegDividendYield(final double value) {
      setField(FieldValue.to(legDividendYieldField, value));
      return this;
    }
    public NoLegs setLegDividendYield(final quickfix.field.LegDividendYield value) {
      setField(FieldValue.to(legDividendYieldField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legCurrencyRatioField = FieldFactory.newDoubleField(1383);
    public boolean hasLegCurrencyRatio() throws quickfix.FieldNotFound {
      return isSetField(1383);
    }
    public double getLegCurrencyRatio() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legCurrencyRatioField));
    }
    public NoLegs setLegCurrencyRatio(final double value) {
      setField(FieldValue.to(legCurrencyRatioField, value));
      return this;
    }
    public NoLegs setLegCurrencyRatio(final quickfix.field.LegCurrencyRatio value) {
      setField(FieldValue.to(legCurrencyRatioField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField legExecInstField = FieldFactory.newStringField(1384);
    public boolean hasLegExecInst() throws quickfix.FieldNotFound {
      return isSetField(1384);
    }
    public String getLegExecInst() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legExecInstField));
    }
    public NoLegs setLegExecInst(final String value) {
      setField(FieldValue.to(legExecInstField, value));
      return this;
    }
    public NoLegs setLegExecInst(final quickfix.field.LegExecInst value) {
      setField(FieldValue.to(legExecInstField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.DoubleField legLastQtyField = FieldFactory.newDoubleField(1418);
    public boolean hasLegLastQty() throws quickfix.FieldNotFound {
      return isSetField(1418);
    }
    public double getLegLastQty() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(legLastQtyField));
    }
    public NoLegs setLegLastQty(final double value) {
      setField(FieldValue.to(legLastQtyField, value));
      return this;
    }
    public NoLegs setLegLastQty(final quickfix.field.LegLastQty value) {
      setField(FieldValue.to(legLastQtyField, FieldValue.of(value)));
      return this;
    }

    public NoLegs() {
      super(555, 600,
          new int[] {600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251,
              252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 1436, 1440, 999, 1224,
              1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740,
              739, 955, 956, 1358, 1017, 566, 687, 685, 690, 1366, 564, 565, 654, 587, 588, 637,
              675, 1073, 1074, 1075, 1379, 1381, 1383, 1384, 1418, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs
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
      for (int i = 0; i < proto.getNoLegAllocsCount(); i++) {
        final NoLegs.NoLegAllocs group = new NoLegs.NoLegAllocs();
        group.fromProto(proto.getNoLegAllocs(i));
        this.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoNested3PartyIdsCount(); i++) {
        final NoLegs.NoNested3PartyIds group = new NoLegs.NoNested3PartyIds();
        group.fromProto(proto.getNoNested3PartyIds(i));
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
      if (fieldPresence.getLegAllocId()) {
        this.setLegAllocId(proto.getLegAllocId());
      }
      if (fieldPresence.getLegPositionEffect()) {
        this.setLegPositionEffect(proto.getLegPositionEffect());
      }
      if (fieldPresence.getLegCoveredOrUncovered()) {
        this.setLegCoveredOrUncovered(proto.getLegCoveredOrUncovered());
      }
      if (fieldPresence.getLegRefId()) {
        this.setLegRefId(proto.getLegRefId());
      }
      if (fieldPresence.getLegSettlType()) {
        this.setLegSettlType(proto.getLegSettlType());
      }
      if (fieldPresence.getLegSettlDate()) {
        this.setLegSettlDate(proto.getLegSettlDate());
      }
      if (fieldPresence.getLegLastPx()) {
        this.setLegLastPx(proto.getLegLastPx());
      }
      if (fieldPresence.getLegSettlCurrency()) {
        this.setLegSettlCurrency(proto.getLegSettlCurrency());
      }
      if (fieldPresence.getLegLastForwardPoints()) {
        this.setLegLastForwardPoints(proto.getLegLastForwardPoints());
      }
      if (fieldPresence.getLegCalculatedCcyLastQty()) {
        this.setLegCalculatedCcyLastQty(proto.getLegCalculatedCcyLastQty());
      }
      if (fieldPresence.getLegGrossTradeAmt()) {
        this.setLegGrossTradeAmt(proto.getLegGrossTradeAmt());
      }
      if (fieldPresence.getLegVolatility()) {
        this.setLegVolatility(proto.getLegVolatility());
      }
      if (fieldPresence.getLegDividendYield()) {
        this.setLegDividendYield(proto.getLegDividendYield());
      }
      if (fieldPresence.getLegCurrencyRatio()) {
        this.setLegCurrencyRatio(proto.getLegCurrencyRatio());
      }
      if (fieldPresence.getLegExecInst()) {
        this.setLegExecInst(proto.getLegExecInst());
      }
      if (fieldPresence.getLegLastQty()) {
        this.setLegLastQty(proto.getLegLastQty());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoLegs.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoLegs.FieldPresence.newBuilder();

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

      final int noLegAllocsGroupCount = this.getGroupCount(670);
      for (int i = 1; i <= noLegAllocsGroupCount; i++) {
        final NoLegs.NoLegAllocs group = new NoLegs.NoLegAllocs();
        this.getGroup(i, group);
        builder.addNoLegAllocs(group.toBuilder().build());
      }

      final int noNested3PartyIdsGroupCount = this.getGroupCount(948);
      for (int i = 1; i <= noNested3PartyIdsGroupCount; i++) {
        final NoLegs.NoNested3PartyIds group = new NoLegs.NoNested3PartyIds();
        this.getGroup(i, group);
        builder.addNoNested3PartyIds(group.toBuilder().build());
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
      if (this.hasLegAllocId()) {
        builder.setLegAllocId(this.getLegAllocId());
        presenceBuilder.setLegAllocId(true);
      }
      if (this.hasLegPositionEffect()) {
        builder.setLegPositionEffect(this.getLegPositionEffect());
        presenceBuilder.setLegPositionEffect(true);
      }
      if (this.hasLegCoveredOrUncovered()) {
        builder.setLegCoveredOrUncovered(this.getLegCoveredOrUncovered());
        presenceBuilder.setLegCoveredOrUncovered(true);
      }
      if (this.hasLegRefId()) {
        builder.setLegRefId(this.getLegRefId());
        presenceBuilder.setLegRefId(true);
      }
      if (this.hasLegSettlType()) {
        builder.setLegSettlType(this.getLegSettlType());
        presenceBuilder.setLegSettlType(true);
      }
      if (this.hasLegSettlDate()) {
        builder.setLegSettlDate(this.getLegSettlDate());
        presenceBuilder.setLegSettlDate(true);
      }
      if (this.hasLegLastPx()) {
        builder.setLegLastPx(this.getLegLastPx());
        presenceBuilder.setLegLastPx(true);
      }
      if (this.hasLegSettlCurrency()) {
        builder.setLegSettlCurrency(this.getLegSettlCurrency());
        presenceBuilder.setLegSettlCurrency(true);
      }
      if (this.hasLegLastForwardPoints()) {
        builder.setLegLastForwardPoints(this.getLegLastForwardPoints());
        presenceBuilder.setLegLastForwardPoints(true);
      }
      if (this.hasLegCalculatedCcyLastQty()) {
        builder.setLegCalculatedCcyLastQty(this.getLegCalculatedCcyLastQty());
        presenceBuilder.setLegCalculatedCcyLastQty(true);
      }
      if (this.hasLegGrossTradeAmt()) {
        builder.setLegGrossTradeAmt(this.getLegGrossTradeAmt());
        presenceBuilder.setLegGrossTradeAmt(true);
      }
      if (this.hasLegVolatility()) {
        builder.setLegVolatility(this.getLegVolatility());
        presenceBuilder.setLegVolatility(true);
      }
      if (this.hasLegDividendYield()) {
        builder.setLegDividendYield(this.getLegDividendYield());
        presenceBuilder.setLegDividendYield(true);
      }
      if (this.hasLegCurrencyRatio()) {
        builder.setLegCurrencyRatio(this.getLegCurrencyRatio());
        presenceBuilder.setLegCurrencyRatio(true);
      }
      if (this.hasLegExecInst()) {
        builder.setLegExecInst(this.getLegExecInst());
        presenceBuilder.setLegExecInst(true);
      }
      if (this.hasLegLastQty()) {
        builder.setLegLastQty(this.getLegLastQty());
        presenceBuilder.setLegLastQty(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoMiscFees extends quickfix.Group {
    private final quickfix.DoubleField miscFeeAmtField = FieldFactory.newDoubleField(137);
    public boolean hasMiscFeeAmt() throws quickfix.FieldNotFound {
      return isSetField(137);
    }
    public double getMiscFeeAmt() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(miscFeeAmtField));
    }
    public NoMiscFees setMiscFeeAmt(final double value) {
      setField(FieldValue.to(miscFeeAmtField, value));
      return this;
    }
    public NoMiscFees setMiscFeeAmt(final quickfix.field.MiscFeeAmt value) {
      setField(FieldValue.to(miscFeeAmtField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField miscFeeCurrField = FieldFactory.newStringField(138);
    public boolean hasMiscFeeCurr() throws quickfix.FieldNotFound {
      return isSetField(138);
    }
    public String getMiscFeeCurr() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(miscFeeCurrField));
    }
    public NoMiscFees setMiscFeeCurr(final String value) {
      setField(FieldValue.to(miscFeeCurrField, value));
      return this;
    }
    public NoMiscFees setMiscFeeCurr(final quickfix.field.MiscFeeCurr value) {
      setField(FieldValue.to(miscFeeCurrField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField miscFeeTypeField = FieldFactory.newStringField(139);
    public boolean hasMiscFeeType() throws quickfix.FieldNotFound {
      return isSetField(139);
    }
    public String getMiscFeeType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(miscFeeTypeField));
    }
    public NoMiscFees setMiscFeeType(final String value) {
      setField(FieldValue.to(miscFeeTypeField, value));
      return this;
    }
    public NoMiscFees setMiscFeeType(final quickfix.field.MiscFeeType value) {
      setField(FieldValue.to(miscFeeTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField miscFeeBasisField = FieldFactory.newIntField(891);
    public boolean hasMiscFeeBasis() throws quickfix.FieldNotFound {
      return isSetField(891);
    }
    public int getMiscFeeBasis() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(miscFeeBasisField));
    }
    public NoMiscFees setMiscFeeBasis(final int value) {
      setField(FieldValue.to(miscFeeBasisField, value));
      return this;
    }
    public NoMiscFees setMiscFeeBasis(final quickfix.field.MiscFeeBasis value) {
      setField(FieldValue.to(miscFeeBasisField, FieldValue.of(value)));
      return this;
    }

    public NoMiscFees() {
      super(136, 137, new int[] {137, 138, 139, 891, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getMiscFeeAmt()) {
        this.setMiscFeeAmt(proto.getMiscFeeAmt());
      }
      if (fieldPresence.getMiscFeeCurr()) {
        this.setMiscFeeCurr(proto.getMiscFeeCurr());
      }
      if (fieldPresence.getMiscFeeType()) {
        this.setMiscFeeType(proto.getMiscFeeType());
      }
      if (fieldPresence.getMiscFeeBasis()) {
        this.setMiscFeeBasis(proto.getMiscFeeBasis());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees.Builder builder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoMiscFees.FieldPresence
          .Builder presenceBuilder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                         .NoMiscFees.FieldPresence.newBuilder();

      if (this.hasMiscFeeAmt()) {
        builder.setMiscFeeAmt(this.getMiscFeeAmt());
        presenceBuilder.setMiscFeeAmt(true);
      }
      if (this.hasMiscFeeCurr()) {
        builder.setMiscFeeCurr(this.getMiscFeeCurr());
        presenceBuilder.setMiscFeeCurr(true);
      }
      if (this.hasMiscFeeType()) {
        builder.setMiscFeeType(this.getMiscFeeType());
        presenceBuilder.setMiscFeeType(true);
      }
      if (this.hasMiscFeeBasis()) {
        builder.setMiscFeeBasis(this.getMiscFeeBasis());
        presenceBuilder.setMiscFeeBasis(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public static class NoTrdRegTimestamps extends quickfix.Group {
    private final FieldFactory.TimeStampField trdRegTimestampField =
        FieldFactory.newTimeStampField(769);
    public boolean hasTrdRegTimestamp() throws quickfix.FieldNotFound {
      return isSetField(769);
    }
    public long getTrdRegTimestamp() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(trdRegTimestampField));
    }
    public NoTrdRegTimestamps setTrdRegTimestamp(final long value) {
      setField(FieldValue.to(trdRegTimestampField, value));
      return this;
    }
    public NoTrdRegTimestamps setTrdRegTimestamp(final quickfix.field.TrdRegTimestamp value) {
      setField(FieldValue.to(trdRegTimestampField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField trdRegTimestampTypeField = FieldFactory.newIntField(770);
    public boolean hasTrdRegTimestampType() throws quickfix.FieldNotFound {
      return isSetField(770);
    }
    public int getTrdRegTimestampType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(trdRegTimestampTypeField));
    }
    public NoTrdRegTimestamps setTrdRegTimestampType(final int value) {
      setField(FieldValue.to(trdRegTimestampTypeField, value));
      return this;
    }
    public NoTrdRegTimestamps setTrdRegTimestampType(
        final quickfix.field.TrdRegTimestampType value) {
      setField(FieldValue.to(trdRegTimestampTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField trdRegTimestampOriginField =
        FieldFactory.newStringField(771);
    public boolean hasTrdRegTimestampOrigin() throws quickfix.FieldNotFound {
      return isSetField(771);
    }
    public String getTrdRegTimestampOrigin() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(trdRegTimestampOriginField));
    }
    public NoTrdRegTimestamps setTrdRegTimestampOrigin(final String value) {
      setField(FieldValue.to(trdRegTimestampOriginField, value));
      return this;
    }
    public NoTrdRegTimestamps setTrdRegTimestampOrigin(
        final quickfix.field.TrdRegTimestampOrigin value) {
      setField(FieldValue.to(trdRegTimestampOriginField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField deskTypeField = FieldFactory.newStringField(1033);
    public boolean hasDeskType() throws quickfix.FieldNotFound {
      return isSetField(1033);
    }
    public String getDeskType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deskTypeField));
    }
    public NoTrdRegTimestamps setDeskType(final String value) {
      setField(FieldValue.to(deskTypeField, value));
      return this;
    }
    public NoTrdRegTimestamps setDeskType(final quickfix.field.DeskType value) {
      setField(FieldValue.to(deskTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField deskTypeSourceField = FieldFactory.newIntField(1034);
    public boolean hasDeskTypeSource() throws quickfix.FieldNotFound {
      return isSetField(1034);
    }
    public int getDeskTypeSource() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deskTypeSourceField));
    }
    public NoTrdRegTimestamps setDeskTypeSource(final int value) {
      setField(FieldValue.to(deskTypeSourceField, value));
      return this;
    }
    public NoTrdRegTimestamps setDeskTypeSource(final quickfix.field.DeskTypeSource value) {
      setField(FieldValue.to(deskTypeSourceField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField deskOrderHandlingInstField =
        FieldFactory.newStringField(1035);
    public boolean hasDeskOrderHandlingInst() throws quickfix.FieldNotFound {
      return isSetField(1035);
    }
    public String getDeskOrderHandlingInst() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(deskOrderHandlingInstField));
    }
    public NoTrdRegTimestamps setDeskOrderHandlingInst(final String value) {
      setField(FieldValue.to(deskOrderHandlingInstField, value));
      return this;
    }
    public NoTrdRegTimestamps setDeskOrderHandlingInst(
        final quickfix.field.DeskOrderHandlingInst value) {
      setField(FieldValue.to(deskOrderHandlingInstField, FieldValue.of(value)));
      return this;
    }

    public NoTrdRegTimestamps() {
      super(768, 769, new int[] {769, 770, 771, 1033, 1034, 1035, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps proto) {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getTrdRegTimestamp()) {
        this.setTrdRegTimestamp(proto.getTrdRegTimestamp());
      }
      if (fieldPresence.getTrdRegTimestampType()) {
        this.setTrdRegTimestampType(proto.getTrdRegTimestampType());
      }
      if (fieldPresence.getTrdRegTimestampOrigin()) {
        this.setTrdRegTimestampOrigin(proto.getTrdRegTimestampOrigin());
      }
      if (fieldPresence.getDeskType()) {
        this.setDeskType(proto.getDeskType());
      }
      if (fieldPresence.getDeskTypeSource()) {
        this.setDeskTypeSource(proto.getDeskTypeSource());
      }
      if (fieldPresence.getDeskOrderHandlingInst()) {
        this.setDeskOrderHandlingInst(proto.getDeskOrderHandlingInst());
      }
    }

    public garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps.Builder
    toBuilder() throws quickfix.FieldNotFound {
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps
          .Builder builder = garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport
                                 .NoTrdRegTimestamps.newBuilder();
      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps
          .FieldPresence.Builder presenceBuilder =
          garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.NoTrdRegTimestamps
              .FieldPresence.newBuilder();

      if (this.hasTrdRegTimestamp()) {
        builder.setTrdRegTimestamp(this.getTrdRegTimestamp());
        presenceBuilder.setTrdRegTimestamp(true);
      }
      if (this.hasTrdRegTimestampType()) {
        builder.setTrdRegTimestampType(this.getTrdRegTimestampType());
        presenceBuilder.setTrdRegTimestampType(true);
      }
      if (this.hasTrdRegTimestampOrigin()) {
        builder.setTrdRegTimestampOrigin(this.getTrdRegTimestampOrigin());
        presenceBuilder.setTrdRegTimestampOrigin(true);
      }
      if (this.hasDeskType()) {
        builder.setDeskType(this.getDeskType());
        presenceBuilder.setDeskType(true);
      }
      if (this.hasDeskTypeSource()) {
        builder.setDeskTypeSource(this.getDeskTypeSource());
        presenceBuilder.setDeskTypeSource(true);
      }
      if (this.hasDeskOrderHandlingInst()) {
        builder.setDeskOrderHandlingInst(this.getDeskOrderHandlingInst());
        presenceBuilder.setDeskOrderHandlingInst(true);
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
  public ExecutionReport setApplId(final String value) {
    setField(FieldValue.to(applIdField, value));
    return this;
  }
  public ExecutionReport setApplId(final quickfix.field.ApplID value) {
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
  public ExecutionReport setApplSeqNum(final int value) {
    setField(FieldValue.to(applSeqNumField, value));
    return this;
  }
  public ExecutionReport setApplSeqNum(final quickfix.field.ApplSeqNum value) {
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
  public ExecutionReport setApplLastSeqNum(final int value) {
    setField(FieldValue.to(applLastSeqNumField, value));
    return this;
  }
  public ExecutionReport setApplLastSeqNum(final quickfix.field.ApplLastSeqNum value) {
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
  public ExecutionReport setApplResendFlag(final boolean value) {
    setField(FieldValue.to(applResendFlagField, value));
    return this;
  }
  public ExecutionReport setApplResendFlag(final quickfix.field.ApplResendFlag value) {
    setField(FieldValue.to(applResendFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField orderIdField = FieldFactory.newStringField(37);
  public boolean hasOrderId() throws quickfix.FieldNotFound {
    return isSetField(37);
  }
  public String getOrderId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderIdField));
  }
  public ExecutionReport setOrderId(final String value) {
    setField(FieldValue.to(orderIdField, value));
    return this;
  }
  public ExecutionReport setOrderId(final quickfix.field.OrderID value) {
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
  public ExecutionReport setSecondaryOrderId(final String value) {
    setField(FieldValue.to(secondaryOrderIdField, value));
    return this;
  }
  public ExecutionReport setSecondaryOrderId(final quickfix.field.SecondaryOrderID value) {
    setField(FieldValue.to(secondaryOrderIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField secondaryClOrdIdField = FieldFactory.newStringField(526);
  public boolean hasSecondaryClOrdId() throws quickfix.FieldNotFound {
    return isSetField(526);
  }
  public String getSecondaryClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryClOrdIdField));
  }
  public ExecutionReport setSecondaryClOrdId(final String value) {
    setField(FieldValue.to(secondaryClOrdIdField, value));
    return this;
  }
  public ExecutionReport setSecondaryClOrdId(final quickfix.field.SecondaryClOrdID value) {
    setField(FieldValue.to(secondaryClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField secondaryExecIdField = FieldFactory.newStringField(527);
  public boolean hasSecondaryExecId() throws quickfix.FieldNotFound {
    return isSetField(527);
  }
  public String getSecondaryExecId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryExecIdField));
  }
  public ExecutionReport setSecondaryExecId(final String value) {
    setField(FieldValue.to(secondaryExecIdField, value));
    return this;
  }
  public ExecutionReport setSecondaryExecId(final quickfix.field.SecondaryExecID value) {
    setField(FieldValue.to(secondaryExecIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public ExecutionReport setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public ExecutionReport setClOrdId(final quickfix.field.ClOrdID value) {
    setField(FieldValue.to(clOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField origClOrdIdField = FieldFactory.newStringField(41);
  public boolean hasOrigClOrdId() throws quickfix.FieldNotFound {
    return isSetField(41);
  }
  public String getOrigClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origClOrdIdField));
  }
  public ExecutionReport setOrigClOrdId(final String value) {
    setField(FieldValue.to(origClOrdIdField, value));
    return this;
  }
  public ExecutionReport setOrigClOrdId(final quickfix.field.OrigClOrdID value) {
    setField(FieldValue.to(origClOrdIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clOrdLinkIdField = FieldFactory.newStringField(583);
  public boolean hasClOrdLinkId() throws quickfix.FieldNotFound {
    return isSetField(583);
  }
  public String getClOrdLinkId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdLinkIdField));
  }
  public ExecutionReport setClOrdLinkId(final String value) {
    setField(FieldValue.to(clOrdLinkIdField, value));
    return this;
  }
  public ExecutionReport setClOrdLinkId(final quickfix.field.ClOrdLinkID value) {
    setField(FieldValue.to(clOrdLinkIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField quoteRespIdField = FieldFactory.newStringField(693);
  public boolean hasQuoteRespId() throws quickfix.FieldNotFound {
    return isSetField(693);
  }
  public String getQuoteRespId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteRespIdField));
  }
  public ExecutionReport setQuoteRespId(final String value) {
    setField(FieldValue.to(quoteRespIdField, value));
    return this;
  }
  public ExecutionReport setQuoteRespId(final quickfix.field.QuoteRespID value) {
    setField(FieldValue.to(quoteRespIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField ordStatusReqIdField = FieldFactory.newStringField(790);
  public boolean hasOrdStatusReqId() throws quickfix.FieldNotFound {
    return isSetField(790);
  }
  public String getOrdStatusReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordStatusReqIdField));
  }
  public ExecutionReport setOrdStatusReqId(final String value) {
    setField(FieldValue.to(ordStatusReqIdField, value));
    return this;
  }
  public ExecutionReport setOrdStatusReqId(final quickfix.field.OrdStatusReqID value) {
    setField(FieldValue.to(ordStatusReqIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField massStatusReqIdField = FieldFactory.newStringField(584);
  public boolean hasMassStatusReqId() throws quickfix.FieldNotFound {
    return isSetField(584);
  }
  public String getMassStatusReqId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(massStatusReqIdField));
  }
  public ExecutionReport setMassStatusReqId(final String value) {
    setField(FieldValue.to(massStatusReqIdField, value));
    return this;
  }
  public ExecutionReport setMassStatusReqId(final quickfix.field.MassStatusReqID value) {
    setField(FieldValue.to(massStatusReqIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField hostCrossIdField = FieldFactory.newStringField(961);
  public boolean hasHostCrossId() throws quickfix.FieldNotFound {
    return isSetField(961);
  }
  public String getHostCrossId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(hostCrossIdField));
  }
  public ExecutionReport setHostCrossId(final String value) {
    setField(FieldValue.to(hostCrossIdField, value));
    return this;
  }
  public ExecutionReport setHostCrossId(final quickfix.field.HostCrossID value) {
    setField(FieldValue.to(hostCrossIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField totNumReportsField = FieldFactory.newIntField(911);
  public boolean hasTotNumReports() throws quickfix.FieldNotFound {
    return isSetField(911);
  }
  public int getTotNumReports() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(totNumReportsField));
  }
  public ExecutionReport setTotNumReports(final int value) {
    setField(FieldValue.to(totNumReportsField, value));
    return this;
  }
  public ExecutionReport setTotNumReports(final quickfix.field.TotNumReports value) {
    setField(FieldValue.to(totNumReportsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField lastRptRequestedField = FieldFactory.newBooleanField(912);
  public boolean hasLastRptRequested() throws quickfix.FieldNotFound {
    return isSetField(912);
  }
  public boolean getLastRptRequested() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastRptRequestedField));
  }
  public ExecutionReport setLastRptRequested(final boolean value) {
    setField(FieldValue.to(lastRptRequestedField, value));
    return this;
  }
  public ExecutionReport setLastRptRequested(final quickfix.field.LastRptRequested value) {
    setField(FieldValue.to(lastRptRequestedField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeOriginationDateField = FieldFactory.newStringField(229);
  public boolean hasTradeOriginationDate() throws quickfix.FieldNotFound {
    return isSetField(229);
  }
  public String getTradeOriginationDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeOriginationDateField));
  }
  public ExecutionReport setTradeOriginationDate(final String value) {
    setField(FieldValue.to(tradeOriginationDateField, value));
    return this;
  }
  public ExecutionReport setTradeOriginationDate(final quickfix.field.TradeOriginationDate value) {
    setField(FieldValue.to(tradeOriginationDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField listIdField = FieldFactory.newStringField(66);
  public boolean hasListId() throws quickfix.FieldNotFound {
    return isSetField(66);
  }
  public String getListId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(listIdField));
  }
  public ExecutionReport setListId(final String value) {
    setField(FieldValue.to(listIdField, value));
    return this;
  }
  public ExecutionReport setListId(final quickfix.field.ListID value) {
    setField(FieldValue.to(listIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField crossIdField = FieldFactory.newStringField(548);
  public boolean hasCrossId() throws quickfix.FieldNotFound {
    return isSetField(548);
  }
  public String getCrossId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(crossIdField));
  }
  public ExecutionReport setCrossId(final String value) {
    setField(FieldValue.to(crossIdField, value));
    return this;
  }
  public ExecutionReport setCrossId(final quickfix.field.CrossID value) {
    setField(FieldValue.to(crossIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField origCrossIdField = FieldFactory.newStringField(551);
  public boolean hasOrigCrossId() throws quickfix.FieldNotFound {
    return isSetField(551);
  }
  public String getOrigCrossId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origCrossIdField));
  }
  public ExecutionReport setOrigCrossId(final String value) {
    setField(FieldValue.to(origCrossIdField, value));
    return this;
  }
  public ExecutionReport setOrigCrossId(final quickfix.field.OrigCrossID value) {
    setField(FieldValue.to(origCrossIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField crossTypeField = FieldFactory.newIntField(549);
  public boolean hasCrossType() throws quickfix.FieldNotFound {
    return isSetField(549);
  }
  public int getCrossType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(crossTypeField));
  }
  public ExecutionReport setCrossType(final int value) {
    setField(FieldValue.to(crossTypeField, value));
    return this;
  }
  public ExecutionReport setCrossType(final quickfix.field.CrossType value) {
    setField(FieldValue.to(crossTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField trdMatchIdField = FieldFactory.newStringField(880);
  public boolean hasTrdMatchId() throws quickfix.FieldNotFound {
    return isSetField(880);
  }
  public String getTrdMatchId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(trdMatchIdField));
  }
  public ExecutionReport setTrdMatchId(final String value) {
    setField(FieldValue.to(trdMatchIdField, value));
    return this;
  }
  public ExecutionReport setTrdMatchId(final quickfix.field.TrdMatchID value) {
    setField(FieldValue.to(trdMatchIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execIdField = FieldFactory.newStringField(17);
  public boolean hasExecId() throws quickfix.FieldNotFound {
    return isSetField(17);
  }
  public String getExecId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execIdField));
  }
  public ExecutionReport setExecId(final String value) {
    setField(FieldValue.to(execIdField, value));
    return this;
  }
  public ExecutionReport setExecId(final quickfix.field.ExecID value) {
    setField(FieldValue.to(execIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execRefIdField = FieldFactory.newStringField(19);
  public boolean hasExecRefId() throws quickfix.FieldNotFound {
    return isSetField(19);
  }
  public String getExecRefId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execRefIdField));
  }
  public ExecutionReport setExecRefId(final String value) {
    setField(FieldValue.to(execRefIdField, value));
    return this;
  }
  public ExecutionReport setExecRefId(final quickfix.field.ExecRefID value) {
    setField(FieldValue.to(execRefIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField execTypeField = FieldFactory.newCharField(150);
  public boolean hasExecType() throws quickfix.FieldNotFound {
    return isSetField(150);
  }
  public int getExecType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execTypeField));
  }
  public ExecutionReport setExecType(final int value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final char value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final String value) {
    setField(FieldValue.to(execTypeField, value));
    return this;
  }
  public ExecutionReport setExecType(final quickfix.field.ExecType value) {
    setField(FieldValue.to(execTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordStatusField = FieldFactory.newCharField(39);
  public boolean hasOrdStatus() throws quickfix.FieldNotFound {
    return isSetField(39);
  }
  public int getOrdStatus() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordStatusField));
  }
  public ExecutionReport setOrdStatus(final int value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final char value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final String value) {
    setField(FieldValue.to(ordStatusField, value));
    return this;
  }
  public ExecutionReport setOrdStatus(final quickfix.field.OrdStatus value) {
    setField(FieldValue.to(ordStatusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField workingIndicatorField = FieldFactory.newBooleanField(636);
  public boolean hasWorkingIndicator() throws quickfix.FieldNotFound {
    return isSetField(636);
  }
  public boolean getWorkingIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(workingIndicatorField));
  }
  public ExecutionReport setWorkingIndicator(final boolean value) {
    setField(FieldValue.to(workingIndicatorField, value));
    return this;
  }
  public ExecutionReport setWorkingIndicator(final quickfix.field.WorkingIndicator value) {
    setField(FieldValue.to(workingIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField ordRejReasonField = FieldFactory.newIntField(103);
  public boolean hasOrdRejReason() throws quickfix.FieldNotFound {
    return isSetField(103);
  }
  public int getOrdRejReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordRejReasonField));
  }
  public ExecutionReport setOrdRejReason(final int value) {
    setField(FieldValue.to(ordRejReasonField, value));
    return this;
  }
  public ExecutionReport setOrdRejReason(final quickfix.field.OrdRejReason value) {
    setField(FieldValue.to(ordRejReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField execRestatementReasonField = FieldFactory.newIntField(378);
  public boolean hasExecRestatementReason() throws quickfix.FieldNotFound {
    return isSetField(378);
  }
  public int getExecRestatementReason() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execRestatementReasonField));
  }
  public ExecutionReport setExecRestatementReason(final int value) {
    setField(FieldValue.to(execRestatementReasonField, value));
    return this;
  }
  public ExecutionReport setExecRestatementReason(
      final quickfix.field.ExecRestatementReason value) {
    setField(FieldValue.to(execRestatementReasonField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField accountField = FieldFactory.newStringField(1);
  public boolean hasAccount() throws quickfix.FieldNotFound {
    return isSetField(1);
  }
  public String getAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountField));
  }
  public ExecutionReport setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public ExecutionReport setAccount(final quickfix.field.Account value) {
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
  public ExecutionReport setAcctIdSource(final int value) {
    setField(FieldValue.to(acctIdSourceField, value));
    return this;
  }
  public ExecutionReport setAcctIdSource(final quickfix.field.AcctIDSource value) {
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
  public ExecutionReport setAccountType(final int value) {
    setField(FieldValue.to(accountTypeField, value));
    return this;
  }
  public ExecutionReport setAccountType(final quickfix.field.AccountType value) {
    setField(FieldValue.to(accountTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField dayBookingInstField = FieldFactory.newCharField(589);
  public boolean hasDayBookingInst() throws quickfix.FieldNotFound {
    return isSetField(589);
  }
  public int getDayBookingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayBookingInstField));
  }
  public ExecutionReport setDayBookingInst(final int value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public ExecutionReport setDayBookingInst(final char value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public ExecutionReport setDayBookingInst(final String value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public ExecutionReport setDayBookingInst(final quickfix.field.DayBookingInst value) {
    setField(FieldValue.to(dayBookingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField bookingUnitField = FieldFactory.newCharField(590);
  public boolean hasBookingUnit() throws quickfix.FieldNotFound {
    return isSetField(590);
  }
  public int getBookingUnit() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bookingUnitField));
  }
  public ExecutionReport setBookingUnit(final int value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public ExecutionReport setBookingUnit(final char value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public ExecutionReport setBookingUnit(final String value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public ExecutionReport setBookingUnit(final quickfix.field.BookingUnit value) {
    setField(FieldValue.to(bookingUnitField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField preallocMethodField = FieldFactory.newCharField(591);
  public boolean hasPreallocMethod() throws quickfix.FieldNotFound {
    return isSetField(591);
  }
  public int getPreallocMethod() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(preallocMethodField));
  }
  public ExecutionReport setPreallocMethod(final int value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public ExecutionReport setPreallocMethod(final char value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public ExecutionReport setPreallocMethod(final String value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public ExecutionReport setPreallocMethod(final quickfix.field.PreallocMethod value) {
    setField(FieldValue.to(preallocMethodField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField allocIdField = FieldFactory.newStringField(70);
  public boolean hasAllocId() throws quickfix.FieldNotFound {
    return isSetField(70);
  }
  public String getAllocId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(allocIdField));
  }
  public ExecutionReport setAllocId(final String value) {
    setField(FieldValue.to(allocIdField, value));
    return this;
  }
  public ExecutionReport setAllocId(final quickfix.field.AllocID value) {
    setField(FieldValue.to(allocIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlTypeField = FieldFactory.newStringField(63);
  public boolean hasSettlType() throws quickfix.FieldNotFound {
    return isSetField(63);
  }
  public String getSettlType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlTypeField));
  }
  public ExecutionReport setSettlType(final String value) {
    setField(FieldValue.to(settlTypeField, value));
    return this;
  }
  public ExecutionReport setSettlType(final quickfix.field.SettlType value) {
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
  public ExecutionReport setSettlDate(final String value) {
    setField(FieldValue.to(settlDateField, value));
    return this;
  }
  public ExecutionReport setSettlDate(final quickfix.field.SettlDate value) {
    setField(FieldValue.to(settlDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField matchTypeField = FieldFactory.newStringField(574);
  public boolean hasMatchType() throws quickfix.FieldNotFound {
    return isSetField(574);
  }
  public String getMatchType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(matchTypeField));
  }
  public ExecutionReport setMatchType(final String value) {
    setField(FieldValue.to(matchTypeField, value));
    return this;
  }
  public ExecutionReport setMatchType(final quickfix.field.MatchType value) {
    setField(FieldValue.to(matchTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField orderCategoryField = FieldFactory.newCharField(1115);
  public boolean hasOrderCategory() throws quickfix.FieldNotFound {
    return isSetField(1115);
  }
  public int getOrderCategory() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderCategoryField));
  }
  public ExecutionReport setOrderCategory(final int value) {
    setField(FieldValue.to(orderCategoryField, value));
    return this;
  }
  public ExecutionReport setOrderCategory(final char value) {
    setField(FieldValue.to(orderCategoryField, value));
    return this;
  }
  public ExecutionReport setOrderCategory(final String value) {
    setField(FieldValue.to(orderCategoryField, value));
    return this;
  }
  public ExecutionReport setOrderCategory(final quickfix.field.OrderCategory value) {
    setField(FieldValue.to(orderCategoryField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField cashMarginField = FieldFactory.newCharField(544);
  public boolean hasCashMargin() throws quickfix.FieldNotFound {
    return isSetField(544);
  }
  public int getCashMargin() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cashMarginField));
  }
  public ExecutionReport setCashMargin(final int value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public ExecutionReport setCashMargin(final char value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public ExecutionReport setCashMargin(final String value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public ExecutionReport setCashMargin(final quickfix.field.CashMargin value) {
    setField(FieldValue.to(cashMarginField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField clearingFeeIndicatorField = FieldFactory.newStringField(635);
  public boolean hasClearingFeeIndicator() throws quickfix.FieldNotFound {
    return isSetField(635);
  }
  public String getClearingFeeIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clearingFeeIndicatorField));
  }
  public ExecutionReport setClearingFeeIndicator(final String value) {
    setField(FieldValue.to(clearingFeeIndicatorField, value));
    return this;
  }
  public ExecutionReport setClearingFeeIndicator(final quickfix.field.ClearingFeeIndicator value) {
    setField(FieldValue.to(clearingFeeIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public ExecutionReport setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public ExecutionReport setSymbol(final quickfix.field.Symbol value) {
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
  public ExecutionReport setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public ExecutionReport setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public ExecutionReport setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public ExecutionReport setSecurityId(final quickfix.field.SecurityID value) {
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
  public ExecutionReport setSecurityIdSource(final String value) {
    setField(FieldValue.to(securityIdSourceField, value));
    return this;
  }
  public ExecutionReport setSecurityIdSource(final quickfix.field.SecurityIDSource value) {
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
  public ExecutionReport setProduct(final int value) {
    setField(FieldValue.to(productField, value));
    return this;
  }
  public ExecutionReport setProduct(final quickfix.field.Product value) {
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
  public ExecutionReport setProductComplex(final String value) {
    setField(FieldValue.to(productComplexField, value));
    return this;
  }
  public ExecutionReport setProductComplex(final quickfix.field.ProductComplex value) {
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
  public ExecutionReport setSecurityGroup(final String value) {
    setField(FieldValue.to(securityGroupField, value));
    return this;
  }
  public ExecutionReport setSecurityGroup(final quickfix.field.SecurityGroup value) {
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
  public ExecutionReport setCfiCode(final String value) {
    setField(FieldValue.to(cfiCodeField, value));
    return this;
  }
  public ExecutionReport setCfiCode(final quickfix.field.CFICode value) {
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
  public ExecutionReport setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public ExecutionReport setSecurityType(final quickfix.field.SecurityType value) {
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
  public ExecutionReport setSecuritySubType(final String value) {
    setField(FieldValue.to(securitySubTypeField, value));
    return this;
  }
  public ExecutionReport setSecuritySubType(final quickfix.field.SecuritySubType value) {
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
  public ExecutionReport setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public ExecutionReport setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public ExecutionReport setMaturityDate(final String value) {
    setField(FieldValue.to(maturityDateField, value));
    return this;
  }
  public ExecutionReport setMaturityDate(final quickfix.field.MaturityDate value) {
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
  public ExecutionReport setMaturityTime(final String value) {
    setField(FieldValue.to(maturityTimeField, value));
    return this;
  }
  public ExecutionReport setMaturityTime(final quickfix.field.MaturityTime value) {
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
  public ExecutionReport setSettleOnOpenFlag(final String value) {
    setField(FieldValue.to(settleOnOpenFlagField, value));
    return this;
  }
  public ExecutionReport setSettleOnOpenFlag(final quickfix.field.SettleOnOpenFlag value) {
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
  public ExecutionReport setInstrmtAssignmentMethod(final int value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public ExecutionReport setInstrmtAssignmentMethod(final char value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public ExecutionReport setInstrmtAssignmentMethod(final String value) {
    setField(FieldValue.to(instrmtAssignmentMethodField, value));
    return this;
  }
  public ExecutionReport setInstrmtAssignmentMethod(
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
  public ExecutionReport setSecurityStatus(final String value) {
    setField(FieldValue.to(securityStatusField, value));
    return this;
  }
  public ExecutionReport setSecurityStatus(final quickfix.field.SecurityStatus value) {
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
  public ExecutionReport setCouponPaymentDate(final String value) {
    setField(FieldValue.to(couponPaymentDateField, value));
    return this;
  }
  public ExecutionReport setCouponPaymentDate(final quickfix.field.CouponPaymentDate value) {
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
  public ExecutionReport setRestructuringType(final String value) {
    setField(FieldValue.to(restructuringTypeField, value));
    return this;
  }
  public ExecutionReport setRestructuringType(final quickfix.field.RestructuringType value) {
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
  public ExecutionReport setSeniority(final String value) {
    setField(FieldValue.to(seniorityField, value));
    return this;
  }
  public ExecutionReport setSeniority(final quickfix.field.Seniority value) {
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
  public ExecutionReport setNotionalPercentageOutstanding(final double value) {
    setField(FieldValue.to(notionalPercentageOutstandingField, value));
    return this;
  }
  public ExecutionReport setNotionalPercentageOutstanding(
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
  public ExecutionReport setOriginalNotionalPercentageOutstanding(final double value) {
    setField(FieldValue.to(originalNotionalPercentageOutstandingField, value));
    return this;
  }
  public ExecutionReport setOriginalNotionalPercentageOutstanding(
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
  public ExecutionReport setAttachmentPoint(final double value) {
    setField(FieldValue.to(attachmentPointField, value));
    return this;
  }
  public ExecutionReport setAttachmentPoint(final quickfix.field.AttachmentPoint value) {
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
  public ExecutionReport setDetachmentPoint(final double value) {
    setField(FieldValue.to(detachmentPointField, value));
    return this;
  }
  public ExecutionReport setDetachmentPoint(final quickfix.field.DetachmentPoint value) {
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
  public ExecutionReport setIssueDate(final String value) {
    setField(FieldValue.to(issueDateField, value));
    return this;
  }
  public ExecutionReport setIssueDate(final quickfix.field.IssueDate value) {
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
  public ExecutionReport setRepoCollateralSecurityType(final String value) {
    setField(FieldValue.to(repoCollateralSecurityTypeField, value));
    return this;
  }
  public ExecutionReport setRepoCollateralSecurityType(
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
  public ExecutionReport setRepurchaseTerm(final int value) {
    setField(FieldValue.to(repurchaseTermField, value));
    return this;
  }
  public ExecutionReport setRepurchaseTerm(final quickfix.field.RepurchaseTerm value) {
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
  public ExecutionReport setRepurchaseRate(final double value) {
    setField(FieldValue.to(repurchaseRateField, value));
    return this;
  }
  public ExecutionReport setRepurchaseRate(final quickfix.field.RepurchaseRate value) {
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
  public ExecutionReport setFactor(final double value) {
    setField(FieldValue.to(factorField, value));
    return this;
  }
  public ExecutionReport setFactor(final quickfix.field.Factor value) {
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
  public ExecutionReport setCreditRating(final String value) {
    setField(FieldValue.to(creditRatingField, value));
    return this;
  }
  public ExecutionReport setCreditRating(final quickfix.field.CreditRating value) {
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
  public ExecutionReport setInstrRegistry(final String value) {
    setField(FieldValue.to(instrRegistryField, value));
    return this;
  }
  public ExecutionReport setInstrRegistry(final quickfix.field.InstrRegistry value) {
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
  public ExecutionReport setCountryOfIssue(final String value) {
    setField(FieldValue.to(countryOfIssueField, value));
    return this;
  }
  public ExecutionReport setCountryOfIssue(final quickfix.field.CountryOfIssue value) {
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
  public ExecutionReport setStateOrProvinceOfIssue(final String value) {
    setField(FieldValue.to(stateOrProvinceOfIssueField, value));
    return this;
  }
  public ExecutionReport setStateOrProvinceOfIssue(
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
  public ExecutionReport setLocaleOfIssue(final String value) {
    setField(FieldValue.to(localeOfIssueField, value));
    return this;
  }
  public ExecutionReport setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
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
  public ExecutionReport setRedemptionDate(final String value) {
    setField(FieldValue.to(redemptionDateField, value));
    return this;
  }
  public ExecutionReport setRedemptionDate(final quickfix.field.RedemptionDate value) {
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
  public ExecutionReport setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public ExecutionReport setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public ExecutionReport setStrikeCurrency(final String value) {
    setField(FieldValue.to(strikeCurrencyField, value));
    return this;
  }
  public ExecutionReport setStrikeCurrency(final quickfix.field.StrikeCurrency value) {
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
  public ExecutionReport setStrikeMultiplier(final double value) {
    setField(FieldValue.to(strikeMultiplierField, value));
    return this;
  }
  public ExecutionReport setStrikeMultiplier(final quickfix.field.StrikeMultiplier value) {
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
  public ExecutionReport setStrikeValue(final double value) {
    setField(FieldValue.to(strikeValueField, value));
    return this;
  }
  public ExecutionReport setStrikeValue(final quickfix.field.StrikeValue value) {
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
  public ExecutionReport setStrikePriceDeterminationMethod(final int value) {
    setField(FieldValue.to(strikePriceDeterminationMethodField, value));
    return this;
  }
  public ExecutionReport setStrikePriceDeterminationMethod(
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
  public ExecutionReport setStrikePriceBoundaryMethod(final int value) {
    setField(FieldValue.to(strikePriceBoundaryMethodField, value));
    return this;
  }
  public ExecutionReport setStrikePriceBoundaryMethod(
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
  public ExecutionReport setStrikePriceBoundaryPrecision(final double value) {
    setField(FieldValue.to(strikePriceBoundaryPrecisionField, value));
    return this;
  }
  public ExecutionReport setStrikePriceBoundaryPrecision(
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
  public ExecutionReport setUnderlyingPriceDeterminationMethod(final int value) {
    setField(FieldValue.to(underlyingPriceDeterminationMethodField, value));
    return this;
  }
  public ExecutionReport setUnderlyingPriceDeterminationMethod(
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
  public ExecutionReport setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public ExecutionReport setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public ExecutionReport setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public ExecutionReport setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public ExecutionReport setContractMultiplierUnit(final int value) {
    setField(FieldValue.to(contractMultiplierUnitField, value));
    return this;
  }
  public ExecutionReport setContractMultiplierUnit(
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
  public ExecutionReport setFlowScheduleType(final int value) {
    setField(FieldValue.to(flowScheduleTypeField, value));
    return this;
  }
  public ExecutionReport setFlowScheduleType(final quickfix.field.FlowScheduleType value) {
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
  public ExecutionReport setMinPriceIncrement(final double value) {
    setField(FieldValue.to(minPriceIncrementField, value));
    return this;
  }
  public ExecutionReport setMinPriceIncrement(final quickfix.field.MinPriceIncrement value) {
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
  public ExecutionReport setMinPriceIncrementAmount(final double value) {
    setField(FieldValue.to(minPriceIncrementAmountField, value));
    return this;
  }
  public ExecutionReport setMinPriceIncrementAmount(
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
  public ExecutionReport setUnitOfMeasure(final String value) {
    setField(FieldValue.to(unitOfMeasureField, value));
    return this;
  }
  public ExecutionReport setUnitOfMeasure(final quickfix.field.UnitOfMeasure value) {
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
  public ExecutionReport setUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(unitOfMeasureQtyField, value));
    return this;
  }
  public ExecutionReport setUnitOfMeasureQty(final quickfix.field.UnitOfMeasureQty value) {
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
  public ExecutionReport setPriceUnitOfMeasure(final String value) {
    setField(FieldValue.to(priceUnitOfMeasureField, value));
    return this;
  }
  public ExecutionReport setPriceUnitOfMeasure(final quickfix.field.PriceUnitOfMeasure value) {
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
  public ExecutionReport setPriceUnitOfMeasureQty(final double value) {
    setField(FieldValue.to(priceUnitOfMeasureQtyField, value));
    return this;
  }
  public ExecutionReport setPriceUnitOfMeasureQty(
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
  public ExecutionReport setSettlMethod(final int value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public ExecutionReport setSettlMethod(final char value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public ExecutionReport setSettlMethod(final String value) {
    setField(FieldValue.to(settlMethodField, value));
    return this;
  }
  public ExecutionReport setSettlMethod(final quickfix.field.SettlMethod value) {
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
  public ExecutionReport setExerciseStyle(final int value) {
    setField(FieldValue.to(exerciseStyleField, value));
    return this;
  }
  public ExecutionReport setExerciseStyle(final quickfix.field.ExerciseStyle value) {
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
  public ExecutionReport setOptPayoutType(final int value) {
    setField(FieldValue.to(optPayoutTypeField, value));
    return this;
  }
  public ExecutionReport setOptPayoutType(final quickfix.field.OptPayoutType value) {
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
  public ExecutionReport setOptPayoutAmount(final double value) {
    setField(FieldValue.to(optPayoutAmountField, value));
    return this;
  }
  public ExecutionReport setOptPayoutAmount(final quickfix.field.OptPayoutAmount value) {
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
  public ExecutionReport setPriceQuoteMethod(final String value) {
    setField(FieldValue.to(priceQuoteMethodField, value));
    return this;
  }
  public ExecutionReport setPriceQuoteMethod(final quickfix.field.PriceQuoteMethod value) {
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
  public ExecutionReport setValuationMethod(final String value) {
    setField(FieldValue.to(valuationMethodField, value));
    return this;
  }
  public ExecutionReport setValuationMethod(final quickfix.field.ValuationMethod value) {
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
  public ExecutionReport setListMethod(final int value) {
    setField(FieldValue.to(listMethodField, value));
    return this;
  }
  public ExecutionReport setListMethod(final quickfix.field.ListMethod value) {
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
  public ExecutionReport setCapPrice(final double value) {
    setField(FieldValue.to(capPriceField, value));
    return this;
  }
  public ExecutionReport setCapPrice(final quickfix.field.CapPrice value) {
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
  public ExecutionReport setFloorPrice(final double value) {
    setField(FieldValue.to(floorPriceField, value));
    return this;
  }
  public ExecutionReport setFloorPrice(final quickfix.field.FloorPrice value) {
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
  public ExecutionReport setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public ExecutionReport setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public ExecutionReport setFlexibleIndicator(final boolean value) {
    setField(FieldValue.to(flexibleIndicatorField, value));
    return this;
  }
  public ExecutionReport setFlexibleIndicator(final quickfix.field.FlexibleIndicator value) {
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
  public ExecutionReport setFlexProductEligibilityIndicator(final boolean value) {
    setField(FieldValue.to(flexProductEligibilityIndicatorField, value));
    return this;
  }
  public ExecutionReport setFlexProductEligibilityIndicator(
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
  public ExecutionReport setTimeUnit(final String value) {
    setField(FieldValue.to(timeUnitField, value));
    return this;
  }
  public ExecutionReport setTimeUnit(final quickfix.field.TimeUnit value) {
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
  public ExecutionReport setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public ExecutionReport setCouponRate(final quickfix.field.CouponRate value) {
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
  public ExecutionReport setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public ExecutionReport setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public ExecutionReport setPositionLimit(final int value) {
    setField(FieldValue.to(positionLimitField, value));
    return this;
  }
  public ExecutionReport setPositionLimit(final quickfix.field.PositionLimit value) {
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
  public ExecutionReport setNtPositionLimit(final int value) {
    setField(FieldValue.to(ntPositionLimitField, value));
    return this;
  }
  public ExecutionReport setNtPositionLimit(final quickfix.field.NTPositionLimit value) {
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
  public ExecutionReport setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public ExecutionReport setIssuer(final quickfix.field.Issuer value) {
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
  public ExecutionReport setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public ExecutionReport setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public ExecutionReport setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public ExecutionReport setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public ExecutionReport setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public ExecutionReport setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public ExecutionReport setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public ExecutionReport setEncodedSecurityDescLen(
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
  public ExecutionReport setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public ExecutionReport setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
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
  public ExecutionReport setSecurityXmlLen(final int value) {
    setField(FieldValue.to(securityXmlLenField, value));
    return this;
  }
  public ExecutionReport setSecurityXmlLen(final quickfix.field.SecurityXMLLen value) {
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
  public ExecutionReport setSecurityXmlData(final String value) {
    setField(FieldValue.to(securityXmlDataField, value));
    return this;
  }
  public ExecutionReport setSecurityXmlData(final quickfix.field.SecurityXMLData value) {
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
  public ExecutionReport setSecurityXmlSchema(final String value) {
    setField(FieldValue.to(securityXmlSchemaField, value));
    return this;
  }
  public ExecutionReport setSecurityXmlSchema(final quickfix.field.SecurityXMLSchema value) {
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
  public ExecutionReport setPool(final String value) {
    setField(FieldValue.to(poolField, value));
    return this;
  }
  public ExecutionReport setPool(final quickfix.field.Pool value) {
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
  public ExecutionReport setContractSettlMonth(final String value) {
    setField(FieldValue.to(contractSettlMonthField, value));
    return this;
  }
  public ExecutionReport setContractSettlMonth(final quickfix.field.ContractSettlMonth value) {
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
  public ExecutionReport setCpProgram(final int value) {
    setField(FieldValue.to(cpProgramField, value));
    return this;
  }
  public ExecutionReport setCpProgram(final quickfix.field.CPProgram value) {
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
  public ExecutionReport setCpRegType(final String value) {
    setField(FieldValue.to(cpRegTypeField, value));
    return this;
  }
  public ExecutionReport setCpRegType(final quickfix.field.CPRegType value) {
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
  public ExecutionReport setDatedDate(final String value) {
    setField(FieldValue.to(datedDateField, value));
    return this;
  }
  public ExecutionReport setDatedDate(final quickfix.field.DatedDate value) {
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
  public ExecutionReport setInterestAccrualDate(final String value) {
    setField(FieldValue.to(interestAccrualDateField, value));
    return this;
  }
  public ExecutionReport setInterestAccrualDate(final quickfix.field.InterestAccrualDate value) {
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
  public ExecutionReport setAgreementDesc(final String value) {
    setField(FieldValue.to(agreementDescField, value));
    return this;
  }
  public ExecutionReport setAgreementDesc(final quickfix.field.AgreementDesc value) {
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
  public ExecutionReport setAgreementId(final String value) {
    setField(FieldValue.to(agreementIdField, value));
    return this;
  }
  public ExecutionReport setAgreementId(final quickfix.field.AgreementID value) {
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
  public ExecutionReport setAgreementDate(final String value) {
    setField(FieldValue.to(agreementDateField, value));
    return this;
  }
  public ExecutionReport setAgreementDate(final quickfix.field.AgreementDate value) {
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
  public ExecutionReport setAgreementCurrency(final String value) {
    setField(FieldValue.to(agreementCurrencyField, value));
    return this;
  }
  public ExecutionReport setAgreementCurrency(final quickfix.field.AgreementCurrency value) {
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
  public ExecutionReport setTerminationType(final int value) {
    setField(FieldValue.to(terminationTypeField, value));
    return this;
  }
  public ExecutionReport setTerminationType(final quickfix.field.TerminationType value) {
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
  public ExecutionReport setStartDate(final String value) {
    setField(FieldValue.to(startDateField, value));
    return this;
  }
  public ExecutionReport setStartDate(final quickfix.field.StartDate value) {
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
  public ExecutionReport setEndDate(final String value) {
    setField(FieldValue.to(endDateField, value));
    return this;
  }
  public ExecutionReport setEndDate(final quickfix.field.EndDate value) {
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
  public ExecutionReport setDeliveryType(final int value) {
    setField(FieldValue.to(deliveryTypeField, value));
    return this;
  }
  public ExecutionReport setDeliveryType(final quickfix.field.DeliveryType value) {
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
  public ExecutionReport setMarginRatio(final double value) {
    setField(FieldValue.to(marginRatioField, value));
    return this;
  }
  public ExecutionReport setMarginRatio(final quickfix.field.MarginRatio value) {
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
  public ExecutionReport setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public ExecutionReport setSide(final quickfix.field.Side value) {
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
  public ExecutionReport setQtyType(final int value) {
    setField(FieldValue.to(qtyTypeField, value));
    return this;
  }
  public ExecutionReport setQtyType(final quickfix.field.QtyType value) {
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
  public ExecutionReport setOrderQty(final double value) {
    setField(FieldValue.to(orderQtyField, value));
    return this;
  }
  public ExecutionReport setOrderQty(final quickfix.field.OrderQty value) {
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
  public ExecutionReport setCashOrderQty(final double value) {
    setField(FieldValue.to(cashOrderQtyField, value));
    return this;
  }
  public ExecutionReport setCashOrderQty(final quickfix.field.CashOrderQty value) {
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
  public ExecutionReport setOrderPercent(final double value) {
    setField(FieldValue.to(orderPercentField, value));
    return this;
  }
  public ExecutionReport setOrderPercent(final quickfix.field.OrderPercent value) {
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
  public ExecutionReport setRoundingDirection(final int value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public ExecutionReport setRoundingDirection(final char value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public ExecutionReport setRoundingDirection(final String value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public ExecutionReport setRoundingDirection(final quickfix.field.RoundingDirection value) {
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
  public ExecutionReport setRoundingModulus(final double value) {
    setField(FieldValue.to(roundingModulusField, value));
    return this;
  }
  public ExecutionReport setRoundingModulus(final quickfix.field.RoundingModulus value) {
    setField(FieldValue.to(roundingModulusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField lotTypeField = FieldFactory.newCharField(1093);
  public boolean hasLotType() throws quickfix.FieldNotFound {
    return isSetField(1093);
  }
  public int getLotType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lotTypeField));
  }
  public ExecutionReport setLotType(final int value) {
    setField(FieldValue.to(lotTypeField, value));
    return this;
  }
  public ExecutionReport setLotType(final char value) {
    setField(FieldValue.to(lotTypeField, value));
    return this;
  }
  public ExecutionReport setLotType(final String value) {
    setField(FieldValue.to(lotTypeField, value));
    return this;
  }
  public ExecutionReport setLotType(final quickfix.field.LotType value) {
    setField(FieldValue.to(lotTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordTypeField = FieldFactory.newCharField(40);
  public boolean hasOrdType() throws quickfix.FieldNotFound {
    return isSetField(40);
  }
  public int getOrdType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordTypeField));
  }
  public ExecutionReport setOrdType(final int value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final char value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final String value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public ExecutionReport setOrdType(final quickfix.field.OrdType value) {
    setField(FieldValue.to(ordTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField priceTypeField = FieldFactory.newIntField(423);
  public boolean hasPriceType() throws quickfix.FieldNotFound {
    return isSetField(423);
  }
  public int getPriceType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceTypeField));
  }
  public ExecutionReport setPriceType(final int value) {
    setField(FieldValue.to(priceTypeField, value));
    return this;
  }
  public ExecutionReport setPriceType(final quickfix.field.PriceType value) {
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
  public ExecutionReport setPrice(final double value) {
    setField(FieldValue.to(priceField, value));
    return this;
  }
  public ExecutionReport setPrice(final quickfix.field.Price value) {
    setField(FieldValue.to(priceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField priceProtectionScopeField = FieldFactory.newCharField(1092);
  public boolean hasPriceProtectionScope() throws quickfix.FieldNotFound {
    return isSetField(1092);
  }
  public int getPriceProtectionScope() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceProtectionScopeField));
  }
  public ExecutionReport setPriceProtectionScope(final int value) {
    setField(FieldValue.to(priceProtectionScopeField, value));
    return this;
  }
  public ExecutionReport setPriceProtectionScope(final char value) {
    setField(FieldValue.to(priceProtectionScopeField, value));
    return this;
  }
  public ExecutionReport setPriceProtectionScope(final String value) {
    setField(FieldValue.to(priceProtectionScopeField, value));
    return this;
  }
  public ExecutionReport setPriceProtectionScope(final quickfix.field.PriceProtectionScope value) {
    setField(FieldValue.to(priceProtectionScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField stopPxField = FieldFactory.newDoubleField(99);
  public boolean hasStopPx() throws quickfix.FieldNotFound {
    return isSetField(99);
  }
  public double getStopPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(stopPxField));
  }
  public ExecutionReport setStopPx(final double value) {
    setField(FieldValue.to(stopPxField, value));
    return this;
  }
  public ExecutionReport setStopPx(final quickfix.field.StopPx value) {
    setField(FieldValue.to(stopPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerTypeField = FieldFactory.newCharField(1100);
  public boolean hasTriggerType() throws quickfix.FieldNotFound {
    return isSetField(1100);
  }
  public int getTriggerType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerTypeField));
  }
  public ExecutionReport setTriggerType(final int value) {
    setField(FieldValue.to(triggerTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerType(final char value) {
    setField(FieldValue.to(triggerTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerType(final String value) {
    setField(FieldValue.to(triggerTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerType(final quickfix.field.TriggerType value) {
    setField(FieldValue.to(triggerTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerActionField = FieldFactory.newCharField(1101);
  public boolean hasTriggerAction() throws quickfix.FieldNotFound {
    return isSetField(1101);
  }
  public int getTriggerAction() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerActionField));
  }
  public ExecutionReport setTriggerAction(final int value) {
    setField(FieldValue.to(triggerActionField, value));
    return this;
  }
  public ExecutionReport setTriggerAction(final char value) {
    setField(FieldValue.to(triggerActionField, value));
    return this;
  }
  public ExecutionReport setTriggerAction(final String value) {
    setField(FieldValue.to(triggerActionField, value));
    return this;
  }
  public ExecutionReport setTriggerAction(final quickfix.field.TriggerAction value) {
    setField(FieldValue.to(triggerActionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField triggerPriceField = FieldFactory.newDoubleField(1102);
  public boolean hasTriggerPrice() throws quickfix.FieldNotFound {
    return isSetField(1102);
  }
  public double getTriggerPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerPriceField));
  }
  public ExecutionReport setTriggerPrice(final double value) {
    setField(FieldValue.to(triggerPriceField, value));
    return this;
  }
  public ExecutionReport setTriggerPrice(final quickfix.field.TriggerPrice value) {
    setField(FieldValue.to(triggerPriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerSymbolField = FieldFactory.newStringField(1103);
  public boolean hasTriggerSymbol() throws quickfix.FieldNotFound {
    return isSetField(1103);
  }
  public String getTriggerSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerSymbolField));
  }
  public ExecutionReport setTriggerSymbol(final String value) {
    setField(FieldValue.to(triggerSymbolField, value));
    return this;
  }
  public ExecutionReport setTriggerSymbol(final quickfix.field.TriggerSymbol value) {
    setField(FieldValue.to(triggerSymbolField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerSecurityIdField = FieldFactory.newStringField(1104);
  public boolean hasTriggerSecurityId() throws quickfix.FieldNotFound {
    return isSetField(1104);
  }
  public String getTriggerSecurityId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerSecurityIdField));
  }
  public ExecutionReport setTriggerSecurityId(final String value) {
    setField(FieldValue.to(triggerSecurityIdField, value));
    return this;
  }
  public ExecutionReport setTriggerSecurityId(final quickfix.field.TriggerSecurityID value) {
    setField(FieldValue.to(triggerSecurityIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerSecurityIdSourceField =
      FieldFactory.newStringField(1105);
  public boolean hasTriggerSecurityIdSource() throws quickfix.FieldNotFound {
    return isSetField(1105);
  }
  public String getTriggerSecurityIdSource() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerSecurityIdSourceField));
  }
  public ExecutionReport setTriggerSecurityIdSource(final String value) {
    setField(FieldValue.to(triggerSecurityIdSourceField, value));
    return this;
  }
  public ExecutionReport setTriggerSecurityIdSource(
      final quickfix.field.TriggerSecurityIDSource value) {
    setField(FieldValue.to(triggerSecurityIdSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerSecurityDescField = FieldFactory.newStringField(1106);
  public boolean hasTriggerSecurityDesc() throws quickfix.FieldNotFound {
    return isSetField(1106);
  }
  public String getTriggerSecurityDesc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerSecurityDescField));
  }
  public ExecutionReport setTriggerSecurityDesc(final String value) {
    setField(FieldValue.to(triggerSecurityDescField, value));
    return this;
  }
  public ExecutionReport setTriggerSecurityDesc(final quickfix.field.TriggerSecurityDesc value) {
    setField(FieldValue.to(triggerSecurityDescField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerPriceTypeField = FieldFactory.newCharField(1107);
  public boolean hasTriggerPriceType() throws quickfix.FieldNotFound {
    return isSetField(1107);
  }
  public int getTriggerPriceType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerPriceTypeField));
  }
  public ExecutionReport setTriggerPriceType(final int value) {
    setField(FieldValue.to(triggerPriceTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceType(final char value) {
    setField(FieldValue.to(triggerPriceTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceType(final String value) {
    setField(FieldValue.to(triggerPriceTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceType(final quickfix.field.TriggerPriceType value) {
    setField(FieldValue.to(triggerPriceTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerPriceTypeScopeField = FieldFactory.newCharField(1108);
  public boolean hasTriggerPriceTypeScope() throws quickfix.FieldNotFound {
    return isSetField(1108);
  }
  public int getTriggerPriceTypeScope() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerPriceTypeScopeField));
  }
  public ExecutionReport setTriggerPriceTypeScope(final int value) {
    setField(FieldValue.to(triggerPriceTypeScopeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceTypeScope(final char value) {
    setField(FieldValue.to(triggerPriceTypeScopeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceTypeScope(final String value) {
    setField(FieldValue.to(triggerPriceTypeScopeField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceTypeScope(
      final quickfix.field.TriggerPriceTypeScope value) {
    setField(FieldValue.to(triggerPriceTypeScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerPriceDirectionField = FieldFactory.newCharField(1109);
  public boolean hasTriggerPriceDirection() throws quickfix.FieldNotFound {
    return isSetField(1109);
  }
  public int getTriggerPriceDirection() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerPriceDirectionField));
  }
  public ExecutionReport setTriggerPriceDirection(final int value) {
    setField(FieldValue.to(triggerPriceDirectionField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceDirection(final char value) {
    setField(FieldValue.to(triggerPriceDirectionField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceDirection(final String value) {
    setField(FieldValue.to(triggerPriceDirectionField, value));
    return this;
  }
  public ExecutionReport setTriggerPriceDirection(
      final quickfix.field.TriggerPriceDirection value) {
    setField(FieldValue.to(triggerPriceDirectionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField triggerNewPriceField = FieldFactory.newDoubleField(1110);
  public boolean hasTriggerNewPrice() throws quickfix.FieldNotFound {
    return isSetField(1110);
  }
  public double getTriggerNewPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerNewPriceField));
  }
  public ExecutionReport setTriggerNewPrice(final double value) {
    setField(FieldValue.to(triggerNewPriceField, value));
    return this;
  }
  public ExecutionReport setTriggerNewPrice(final quickfix.field.TriggerNewPrice value) {
    setField(FieldValue.to(triggerNewPriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField triggerOrderTypeField = FieldFactory.newCharField(1111);
  public boolean hasTriggerOrderType() throws quickfix.FieldNotFound {
    return isSetField(1111);
  }
  public int getTriggerOrderType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerOrderTypeField));
  }
  public ExecutionReport setTriggerOrderType(final int value) {
    setField(FieldValue.to(triggerOrderTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerOrderType(final char value) {
    setField(FieldValue.to(triggerOrderTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerOrderType(final String value) {
    setField(FieldValue.to(triggerOrderTypeField, value));
    return this;
  }
  public ExecutionReport setTriggerOrderType(final quickfix.field.TriggerOrderType value) {
    setField(FieldValue.to(triggerOrderTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField triggerNewQtyField = FieldFactory.newDoubleField(1112);
  public boolean hasTriggerNewQty() throws quickfix.FieldNotFound {
    return isSetField(1112);
  }
  public double getTriggerNewQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerNewQtyField));
  }
  public ExecutionReport setTriggerNewQty(final double value) {
    setField(FieldValue.to(triggerNewQtyField, value));
    return this;
  }
  public ExecutionReport setTriggerNewQty(final quickfix.field.TriggerNewQty value) {
    setField(FieldValue.to(triggerNewQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerTradingSessionIdField =
      FieldFactory.newStringField(1113);
  public boolean hasTriggerTradingSessionId() throws quickfix.FieldNotFound {
    return isSetField(1113);
  }
  public String getTriggerTradingSessionId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerTradingSessionIdField));
  }
  public ExecutionReport setTriggerTradingSessionId(final String value) {
    setField(FieldValue.to(triggerTradingSessionIdField, value));
    return this;
  }
  public ExecutionReport setTriggerTradingSessionId(
      final quickfix.field.TriggerTradingSessionID value) {
    setField(FieldValue.to(triggerTradingSessionIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField triggerTradingSessionSubIdField =
      FieldFactory.newStringField(1114);
  public boolean hasTriggerTradingSessionSubId() throws quickfix.FieldNotFound {
    return isSetField(1114);
  }
  public String getTriggerTradingSessionSubId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(triggerTradingSessionSubIdField));
  }
  public ExecutionReport setTriggerTradingSessionSubId(final String value) {
    setField(FieldValue.to(triggerTradingSessionSubIdField, value));
    return this;
  }
  public ExecutionReport setTriggerTradingSessionSubId(
      final quickfix.field.TriggerTradingSessionSubID value) {
    setField(FieldValue.to(triggerTradingSessionSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField pegOffsetValueField = FieldFactory.newDoubleField(211);
  public boolean hasPegOffsetValue() throws quickfix.FieldNotFound {
    return isSetField(211);
  }
  public double getPegOffsetValue() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegOffsetValueField));
  }
  public ExecutionReport setPegOffsetValue(final double value) {
    setField(FieldValue.to(pegOffsetValueField, value));
    return this;
  }
  public ExecutionReport setPegOffsetValue(final quickfix.field.PegOffsetValue value) {
    setField(FieldValue.to(pegOffsetValueField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegPriceTypeField = FieldFactory.newIntField(1094);
  public boolean hasPegPriceType() throws quickfix.FieldNotFound {
    return isSetField(1094);
  }
  public int getPegPriceType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegPriceTypeField));
  }
  public ExecutionReport setPegPriceType(final int value) {
    setField(FieldValue.to(pegPriceTypeField, value));
    return this;
  }
  public ExecutionReport setPegPriceType(final quickfix.field.PegPriceType value) {
    setField(FieldValue.to(pegPriceTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegMoveTypeField = FieldFactory.newIntField(835);
  public boolean hasPegMoveType() throws quickfix.FieldNotFound {
    return isSetField(835);
  }
  public int getPegMoveType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegMoveTypeField));
  }
  public ExecutionReport setPegMoveType(final int value) {
    setField(FieldValue.to(pegMoveTypeField, value));
    return this;
  }
  public ExecutionReport setPegMoveType(final quickfix.field.PegMoveType value) {
    setField(FieldValue.to(pegMoveTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegOffsetTypeField = FieldFactory.newIntField(836);
  public boolean hasPegOffsetType() throws quickfix.FieldNotFound {
    return isSetField(836);
  }
  public int getPegOffsetType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegOffsetTypeField));
  }
  public ExecutionReport setPegOffsetType(final int value) {
    setField(FieldValue.to(pegOffsetTypeField, value));
    return this;
  }
  public ExecutionReport setPegOffsetType(final quickfix.field.PegOffsetType value) {
    setField(FieldValue.to(pegOffsetTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegLimitTypeField = FieldFactory.newIntField(837);
  public boolean hasPegLimitType() throws quickfix.FieldNotFound {
    return isSetField(837);
  }
  public int getPegLimitType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegLimitTypeField));
  }
  public ExecutionReport setPegLimitType(final int value) {
    setField(FieldValue.to(pegLimitTypeField, value));
    return this;
  }
  public ExecutionReport setPegLimitType(final quickfix.field.PegLimitType value) {
    setField(FieldValue.to(pegLimitTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegRoundDirectionField = FieldFactory.newIntField(838);
  public boolean hasPegRoundDirection() throws quickfix.FieldNotFound {
    return isSetField(838);
  }
  public int getPegRoundDirection() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegRoundDirectionField));
  }
  public ExecutionReport setPegRoundDirection(final int value) {
    setField(FieldValue.to(pegRoundDirectionField, value));
    return this;
  }
  public ExecutionReport setPegRoundDirection(final quickfix.field.PegRoundDirection value) {
    setField(FieldValue.to(pegRoundDirectionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegScopeField = FieldFactory.newIntField(840);
  public boolean hasPegScope() throws quickfix.FieldNotFound {
    return isSetField(840);
  }
  public int getPegScope() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegScopeField));
  }
  public ExecutionReport setPegScope(final int value) {
    setField(FieldValue.to(pegScopeField, value));
    return this;
  }
  public ExecutionReport setPegScope(final quickfix.field.PegScope value) {
    setField(FieldValue.to(pegScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField pegSecurityIdSourceField = FieldFactory.newStringField(1096);
  public boolean hasPegSecurityIdSource() throws quickfix.FieldNotFound {
    return isSetField(1096);
  }
  public String getPegSecurityIdSource() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegSecurityIdSourceField));
  }
  public ExecutionReport setPegSecurityIdSource(final String value) {
    setField(FieldValue.to(pegSecurityIdSourceField, value));
    return this;
  }
  public ExecutionReport setPegSecurityIdSource(final quickfix.field.PegSecurityIDSource value) {
    setField(FieldValue.to(pegSecurityIdSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField pegSecurityIdField = FieldFactory.newStringField(1097);
  public boolean hasPegSecurityId() throws quickfix.FieldNotFound {
    return isSetField(1097);
  }
  public String getPegSecurityId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegSecurityIdField));
  }
  public ExecutionReport setPegSecurityId(final String value) {
    setField(FieldValue.to(pegSecurityIdField, value));
    return this;
  }
  public ExecutionReport setPegSecurityId(final quickfix.field.PegSecurityID value) {
    setField(FieldValue.to(pegSecurityIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField pegSymbolField = FieldFactory.newStringField(1098);
  public boolean hasPegSymbol() throws quickfix.FieldNotFound {
    return isSetField(1098);
  }
  public String getPegSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegSymbolField));
  }
  public ExecutionReport setPegSymbol(final String value) {
    setField(FieldValue.to(pegSymbolField, value));
    return this;
  }
  public ExecutionReport setPegSymbol(final quickfix.field.PegSymbol value) {
    setField(FieldValue.to(pegSymbolField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField pegSecurityDescField = FieldFactory.newStringField(1099);
  public boolean hasPegSecurityDesc() throws quickfix.FieldNotFound {
    return isSetField(1099);
  }
  public String getPegSecurityDesc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegSecurityDescField));
  }
  public ExecutionReport setPegSecurityDesc(final String value) {
    setField(FieldValue.to(pegSecurityDescField, value));
    return this;
  }
  public ExecutionReport setPegSecurityDesc(final quickfix.field.PegSecurityDesc value) {
    setField(FieldValue.to(pegSecurityDescField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField discretionInstField = FieldFactory.newCharField(388);
  public boolean hasDiscretionInst() throws quickfix.FieldNotFound {
    return isSetField(388);
  }
  public int getDiscretionInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionInstField));
  }
  public ExecutionReport setDiscretionInst(final int value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final char value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final String value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public ExecutionReport setDiscretionInst(final quickfix.field.DiscretionInst value) {
    setField(FieldValue.to(discretionInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField discretionOffsetValueField = FieldFactory.newDoubleField(389);
  public boolean hasDiscretionOffsetValue() throws quickfix.FieldNotFound {
    return isSetField(389);
  }
  public double getDiscretionOffsetValue() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionOffsetValueField));
  }
  public ExecutionReport setDiscretionOffsetValue(final double value) {
    setField(FieldValue.to(discretionOffsetValueField, value));
    return this;
  }
  public ExecutionReport setDiscretionOffsetValue(
      final quickfix.field.DiscretionOffsetValue value) {
    setField(FieldValue.to(discretionOffsetValueField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField discretionMoveTypeField = FieldFactory.newIntField(841);
  public boolean hasDiscretionMoveType() throws quickfix.FieldNotFound {
    return isSetField(841);
  }
  public int getDiscretionMoveType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionMoveTypeField));
  }
  public ExecutionReport setDiscretionMoveType(final int value) {
    setField(FieldValue.to(discretionMoveTypeField, value));
    return this;
  }
  public ExecutionReport setDiscretionMoveType(final quickfix.field.DiscretionMoveType value) {
    setField(FieldValue.to(discretionMoveTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField discretionOffsetTypeField = FieldFactory.newIntField(842);
  public boolean hasDiscretionOffsetType() throws quickfix.FieldNotFound {
    return isSetField(842);
  }
  public int getDiscretionOffsetType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionOffsetTypeField));
  }
  public ExecutionReport setDiscretionOffsetType(final int value) {
    setField(FieldValue.to(discretionOffsetTypeField, value));
    return this;
  }
  public ExecutionReport setDiscretionOffsetType(final quickfix.field.DiscretionOffsetType value) {
    setField(FieldValue.to(discretionOffsetTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField discretionLimitTypeField = FieldFactory.newIntField(843);
  public boolean hasDiscretionLimitType() throws quickfix.FieldNotFound {
    return isSetField(843);
  }
  public int getDiscretionLimitType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionLimitTypeField));
  }
  public ExecutionReport setDiscretionLimitType(final int value) {
    setField(FieldValue.to(discretionLimitTypeField, value));
    return this;
  }
  public ExecutionReport setDiscretionLimitType(final quickfix.field.DiscretionLimitType value) {
    setField(FieldValue.to(discretionLimitTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField discretionRoundDirectionField = FieldFactory.newIntField(844);
  public boolean hasDiscretionRoundDirection() throws quickfix.FieldNotFound {
    return isSetField(844);
  }
  public int getDiscretionRoundDirection() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionRoundDirectionField));
  }
  public ExecutionReport setDiscretionRoundDirection(final int value) {
    setField(FieldValue.to(discretionRoundDirectionField, value));
    return this;
  }
  public ExecutionReport setDiscretionRoundDirection(
      final quickfix.field.DiscretionRoundDirection value) {
    setField(FieldValue.to(discretionRoundDirectionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField discretionScopeField = FieldFactory.newIntField(846);
  public boolean hasDiscretionScope() throws quickfix.FieldNotFound {
    return isSetField(846);
  }
  public int getDiscretionScope() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionScopeField));
  }
  public ExecutionReport setDiscretionScope(final int value) {
    setField(FieldValue.to(discretionScopeField, value));
    return this;
  }
  public ExecutionReport setDiscretionScope(final quickfix.field.DiscretionScope value) {
    setField(FieldValue.to(discretionScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField peggedPriceField = FieldFactory.newDoubleField(839);
  public boolean hasPeggedPrice() throws quickfix.FieldNotFound {
    return isSetField(839);
  }
  public double getPeggedPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(peggedPriceField));
  }
  public ExecutionReport setPeggedPrice(final double value) {
    setField(FieldValue.to(peggedPriceField, value));
    return this;
  }
  public ExecutionReport setPeggedPrice(final quickfix.field.PeggedPrice value) {
    setField(FieldValue.to(peggedPriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField peggedRefPriceField = FieldFactory.newDoubleField(1095);
  public boolean hasPeggedRefPrice() throws quickfix.FieldNotFound {
    return isSetField(1095);
  }
  public double getPeggedRefPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(peggedRefPriceField));
  }
  public ExecutionReport setPeggedRefPrice(final double value) {
    setField(FieldValue.to(peggedRefPriceField, value));
    return this;
  }
  public ExecutionReport setPeggedRefPrice(final quickfix.field.PeggedRefPrice value) {
    setField(FieldValue.to(peggedRefPriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField discretionPriceField = FieldFactory.newDoubleField(845);
  public boolean hasDiscretionPrice() throws quickfix.FieldNotFound {
    return isSetField(845);
  }
  public double getDiscretionPrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionPriceField));
  }
  public ExecutionReport setDiscretionPrice(final double value) {
    setField(FieldValue.to(discretionPriceField, value));
    return this;
  }
  public ExecutionReport setDiscretionPrice(final quickfix.field.DiscretionPrice value) {
    setField(FieldValue.to(discretionPriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField targetStrategyField = FieldFactory.newIntField(847);
  public boolean hasTargetStrategy() throws quickfix.FieldNotFound {
    return isSetField(847);
  }
  public int getTargetStrategy() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetStrategyField));
  }
  public ExecutionReport setTargetStrategy(final int value) {
    setField(FieldValue.to(targetStrategyField, value));
    return this;
  }
  public ExecutionReport setTargetStrategy(final quickfix.field.TargetStrategy value) {
    setField(FieldValue.to(targetStrategyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField targetStrategyParametersField =
      FieldFactory.newStringField(848);
  public boolean hasTargetStrategyParameters() throws quickfix.FieldNotFound {
    return isSetField(848);
  }
  public String getTargetStrategyParameters() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetStrategyParametersField));
  }
  public ExecutionReport setTargetStrategyParameters(final String value) {
    setField(FieldValue.to(targetStrategyParametersField, value));
    return this;
  }
  public ExecutionReport setTargetStrategyParameters(
      final quickfix.field.TargetStrategyParameters value) {
    setField(FieldValue.to(targetStrategyParametersField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField participationRateField = FieldFactory.newDoubleField(849);
  public boolean hasParticipationRate() throws quickfix.FieldNotFound {
    return isSetField(849);
  }
  public double getParticipationRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(participationRateField));
  }
  public ExecutionReport setParticipationRate(final double value) {
    setField(FieldValue.to(participationRateField, value));
    return this;
  }
  public ExecutionReport setParticipationRate(final quickfix.field.ParticipationRate value) {
    setField(FieldValue.to(participationRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField targetStrategyPerformanceField =
      FieldFactory.newDoubleField(850);
  public boolean hasTargetStrategyPerformance() throws quickfix.FieldNotFound {
    return isSetField(850);
  }
  public double getTargetStrategyPerformance() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetStrategyPerformanceField));
  }
  public ExecutionReport setTargetStrategyPerformance(final double value) {
    setField(FieldValue.to(targetStrategyPerformanceField, value));
    return this;
  }
  public ExecutionReport setTargetStrategyPerformance(
      final quickfix.field.TargetStrategyPerformance value) {
    setField(FieldValue.to(targetStrategyPerformanceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public ExecutionReport setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public ExecutionReport setCurrency(final quickfix.field.Currency value) {
    setField(FieldValue.to(currencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField complianceIdField = FieldFactory.newStringField(376);
  public boolean hasComplianceId() throws quickfix.FieldNotFound {
    return isSetField(376);
  }
  public String getComplianceId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(complianceIdField));
  }
  public ExecutionReport setComplianceId(final String value) {
    setField(FieldValue.to(complianceIdField, value));
    return this;
  }
  public ExecutionReport setComplianceId(final quickfix.field.ComplianceID value) {
    setField(FieldValue.to(complianceIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField solicitedFlagField = FieldFactory.newBooleanField(377);
  public boolean hasSolicitedFlag() throws quickfix.FieldNotFound {
    return isSetField(377);
  }
  public boolean getSolicitedFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(solicitedFlagField));
  }
  public ExecutionReport setSolicitedFlag(final boolean value) {
    setField(FieldValue.to(solicitedFlagField, value));
    return this;
  }
  public ExecutionReport setSolicitedFlag(final quickfix.field.SolicitedFlag value) {
    setField(FieldValue.to(solicitedFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField timeInForceField = FieldFactory.newCharField(59);
  public boolean hasTimeInForce() throws quickfix.FieldNotFound {
    return isSetField(59);
  }
  public int getTimeInForce() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeInForceField));
  }
  public ExecutionReport setTimeInForce(final int value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final char value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final String value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public ExecutionReport setTimeInForce(final quickfix.field.TimeInForce value) {
    setField(FieldValue.to(timeInForceField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField effectiveTimeField =
      FieldFactory.newTimeStampField(168);
  public boolean hasEffectiveTime() throws quickfix.FieldNotFound {
    return isSetField(168);
  }
  public long getEffectiveTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(effectiveTimeField));
  }
  public ExecutionReport setEffectiveTime(final long value) {
    setField(FieldValue.to(effectiveTimeField, value));
    return this;
  }
  public ExecutionReport setEffectiveTime(final quickfix.field.EffectiveTime value) {
    setField(FieldValue.to(effectiveTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField expireDateField = FieldFactory.newStringField(432);
  public boolean hasExpireDate() throws quickfix.FieldNotFound {
    return isSetField(432);
  }
  public String getExpireDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(expireDateField));
  }
  public ExecutionReport setExpireDate(final String value) {
    setField(FieldValue.to(expireDateField, value));
    return this;
  }
  public ExecutionReport setExpireDate(final quickfix.field.ExpireDate value) {
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
  public ExecutionReport setExpireTime(final long value) {
    setField(FieldValue.to(expireTimeField, value));
    return this;
  }
  public ExecutionReport setExpireTime(final quickfix.field.ExpireTime value) {
    setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execInstField = FieldFactory.newStringField(18);
  public boolean hasExecInst() throws quickfix.FieldNotFound {
    return isSetField(18);
  }
  public String getExecInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execInstField));
  }
  public ExecutionReport setExecInst(final String value) {
    setField(FieldValue.to(execInstField, value));
    return this;
  }
  public ExecutionReport setExecInst(final quickfix.field.ExecInst value) {
    setField(FieldValue.to(execInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField aggressorIndicatorField = FieldFactory.newBooleanField(1057);
  public boolean hasAggressorIndicator() throws quickfix.FieldNotFound {
    return isSetField(1057);
  }
  public boolean getAggressorIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(aggressorIndicatorField));
  }
  public ExecutionReport setAggressorIndicator(final boolean value) {
    setField(FieldValue.to(aggressorIndicatorField, value));
    return this;
  }
  public ExecutionReport setAggressorIndicator(final quickfix.field.AggressorIndicator value) {
    setField(FieldValue.to(aggressorIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField orderCapacityField = FieldFactory.newCharField(528);
  public boolean hasOrderCapacity() throws quickfix.FieldNotFound {
    return isSetField(528);
  }
  public int getOrderCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderCapacityField));
  }
  public ExecutionReport setOrderCapacity(final int value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public ExecutionReport setOrderCapacity(final char value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public ExecutionReport setOrderCapacity(final String value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public ExecutionReport setOrderCapacity(final quickfix.field.OrderCapacity value) {
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
  public ExecutionReport setOrderRestrictions(final String value) {
    setField(FieldValue.to(orderRestrictionsField, value));
    return this;
  }
  public ExecutionReport setOrderRestrictions(final quickfix.field.OrderRestrictions value) {
    setField(FieldValue.to(orderRestrictionsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField preTradeAnonymityField = FieldFactory.newBooleanField(1091);
  public boolean hasPreTradeAnonymity() throws quickfix.FieldNotFound {
    return isSetField(1091);
  }
  public boolean getPreTradeAnonymity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(preTradeAnonymityField));
  }
  public ExecutionReport setPreTradeAnonymity(final boolean value) {
    setField(FieldValue.to(preTradeAnonymityField, value));
    return this;
  }
  public ExecutionReport setPreTradeAnonymity(final quickfix.field.PreTradeAnonymity value) {
    setField(FieldValue.to(preTradeAnonymityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField custOrderCapacityField = FieldFactory.newIntField(582);
  public boolean hasCustOrderCapacity() throws quickfix.FieldNotFound {
    return isSetField(582);
  }
  public int getCustOrderCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(custOrderCapacityField));
  }
  public ExecutionReport setCustOrderCapacity(final int value) {
    setField(FieldValue.to(custOrderCapacityField, value));
    return this;
  }
  public ExecutionReport setCustOrderCapacity(final quickfix.field.CustOrderCapacity value) {
    setField(FieldValue.to(custOrderCapacityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastQtyField = FieldFactory.newDoubleField(32);
  public boolean hasLastQty() throws quickfix.FieldNotFound {
    return isSetField(32);
  }
  public double getLastQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastQtyField));
  }
  public ExecutionReport setLastQty(final double value) {
    setField(FieldValue.to(lastQtyField, value));
    return this;
  }
  public ExecutionReport setLastQty(final quickfix.field.LastQty value) {
    setField(FieldValue.to(lastQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField calculatedCcyLastQtyField = FieldFactory.newDoubleField(1056);
  public boolean hasCalculatedCcyLastQty() throws quickfix.FieldNotFound {
    return isSetField(1056);
  }
  public double getCalculatedCcyLastQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(calculatedCcyLastQtyField));
  }
  public ExecutionReport setCalculatedCcyLastQty(final double value) {
    setField(FieldValue.to(calculatedCcyLastQtyField, value));
    return this;
  }
  public ExecutionReport setCalculatedCcyLastQty(final quickfix.field.CalculatedCcyLastQty value) {
    setField(FieldValue.to(calculatedCcyLastQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastSwapPointsField = FieldFactory.newDoubleField(1071);
  public boolean hasLastSwapPoints() throws quickfix.FieldNotFound {
    return isSetField(1071);
  }
  public double getLastSwapPoints() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastSwapPointsField));
  }
  public ExecutionReport setLastSwapPoints(final double value) {
    setField(FieldValue.to(lastSwapPointsField, value));
    return this;
  }
  public ExecutionReport setLastSwapPoints(final quickfix.field.LastSwapPoints value) {
    setField(FieldValue.to(lastSwapPointsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField underlyingLastQtyField = FieldFactory.newDoubleField(652);
  public boolean hasUnderlyingLastQty() throws quickfix.FieldNotFound {
    return isSetField(652);
  }
  public double getUnderlyingLastQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(underlyingLastQtyField));
  }
  public ExecutionReport setUnderlyingLastQty(final double value) {
    setField(FieldValue.to(underlyingLastQtyField, value));
    return this;
  }
  public ExecutionReport setUnderlyingLastQty(final quickfix.field.UnderlyingLastQty value) {
    setField(FieldValue.to(underlyingLastQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastPxField = FieldFactory.newDoubleField(31);
  public boolean hasLastPx() throws quickfix.FieldNotFound {
    return isSetField(31);
  }
  public double getLastPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastPxField));
  }
  public ExecutionReport setLastPx(final double value) {
    setField(FieldValue.to(lastPxField, value));
    return this;
  }
  public ExecutionReport setLastPx(final quickfix.field.LastPx value) {
    setField(FieldValue.to(lastPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField underlyingLastPxField = FieldFactory.newDoubleField(651);
  public boolean hasUnderlyingLastPx() throws quickfix.FieldNotFound {
    return isSetField(651);
  }
  public double getUnderlyingLastPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(underlyingLastPxField));
  }
  public ExecutionReport setUnderlyingLastPx(final double value) {
    setField(FieldValue.to(underlyingLastPxField, value));
    return this;
  }
  public ExecutionReport setUnderlyingLastPx(final quickfix.field.UnderlyingLastPx value) {
    setField(FieldValue.to(underlyingLastPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastParPxField = FieldFactory.newDoubleField(669);
  public boolean hasLastParPx() throws quickfix.FieldNotFound {
    return isSetField(669);
  }
  public double getLastParPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastParPxField));
  }
  public ExecutionReport setLastParPx(final double value) {
    setField(FieldValue.to(lastParPxField, value));
    return this;
  }
  public ExecutionReport setLastParPx(final quickfix.field.LastParPx value) {
    setField(FieldValue.to(lastParPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastSpotRateField = FieldFactory.newDoubleField(194);
  public boolean hasLastSpotRate() throws quickfix.FieldNotFound {
    return isSetField(194);
  }
  public double getLastSpotRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastSpotRateField));
  }
  public ExecutionReport setLastSpotRate(final double value) {
    setField(FieldValue.to(lastSpotRateField, value));
    return this;
  }
  public ExecutionReport setLastSpotRate(final quickfix.field.LastSpotRate value) {
    setField(FieldValue.to(lastSpotRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastForwardPointsField = FieldFactory.newDoubleField(195);
  public boolean hasLastForwardPoints() throws quickfix.FieldNotFound {
    return isSetField(195);
  }
  public double getLastForwardPoints() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastForwardPointsField));
  }
  public ExecutionReport setLastForwardPoints(final double value) {
    setField(FieldValue.to(lastForwardPointsField, value));
    return this;
  }
  public ExecutionReport setLastForwardPoints(final quickfix.field.LastForwardPoints value) {
    setField(FieldValue.to(lastForwardPointsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField lastMktField = FieldFactory.newStringField(30);
  public boolean hasLastMkt() throws quickfix.FieldNotFound {
    return isSetField(30);
  }
  public String getLastMkt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastMktField));
  }
  public ExecutionReport setLastMkt(final String value) {
    setField(FieldValue.to(lastMktField, value));
    return this;
  }
  public ExecutionReport setLastMkt(final quickfix.field.LastMkt value) {
    setField(FieldValue.to(lastMktField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
  public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
    return isSetField(336);
  }
  public String getTradingSessionId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradingSessionIdField));
  }
  public ExecutionReport setTradingSessionId(final String value) {
    setField(FieldValue.to(tradingSessionIdField, value));
    return this;
  }
  public ExecutionReport setTradingSessionId(final quickfix.field.TradingSessionID value) {
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
  public ExecutionReport setTradingSessionSubId(final String value) {
    setField(FieldValue.to(tradingSessionSubIdField, value));
    return this;
  }
  public ExecutionReport setTradingSessionSubId(final quickfix.field.TradingSessionSubID value) {
    setField(FieldValue.to(tradingSessionSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField timeBracketField = FieldFactory.newStringField(943);
  public boolean hasTimeBracket() throws quickfix.FieldNotFound {
    return isSetField(943);
  }
  public String getTimeBracket() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeBracketField));
  }
  public ExecutionReport setTimeBracket(final String value) {
    setField(FieldValue.to(timeBracketField, value));
    return this;
  }
  public ExecutionReport setTimeBracket(final quickfix.field.TimeBracket value) {
    setField(FieldValue.to(timeBracketField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField lastCapacityField = FieldFactory.newCharField(29);
  public boolean hasLastCapacity() throws quickfix.FieldNotFound {
    return isSetField(29);
  }
  public int getLastCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastCapacityField));
  }
  public ExecutionReport setLastCapacity(final int value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final char value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final String value) {
    setField(FieldValue.to(lastCapacityField, value));
    return this;
  }
  public ExecutionReport setLastCapacity(final quickfix.field.LastCapacity value) {
    setField(FieldValue.to(lastCapacityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField leavesQtyField = FieldFactory.newDoubleField(151);
  public boolean hasLeavesQty() throws quickfix.FieldNotFound {
    return isSetField(151);
  }
  public double getLeavesQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(leavesQtyField));
  }
  public ExecutionReport setLeavesQty(final double value) {
    setField(FieldValue.to(leavesQtyField, value));
    return this;
  }
  public ExecutionReport setLeavesQty(final quickfix.field.LeavesQty value) {
    setField(FieldValue.to(leavesQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField cumQtyField = FieldFactory.newDoubleField(14);
  public boolean hasCumQty() throws quickfix.FieldNotFound {
    return isSetField(14);
  }
  public double getCumQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cumQtyField));
  }
  public ExecutionReport setCumQty(final double value) {
    setField(FieldValue.to(cumQtyField, value));
    return this;
  }
  public ExecutionReport setCumQty(final quickfix.field.CumQty value) {
    setField(FieldValue.to(cumQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField avgPxField = FieldFactory.newDoubleField(6);
  public boolean hasAvgPx() throws quickfix.FieldNotFound {
    return isSetField(6);
  }
  public double getAvgPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(avgPxField));
  }
  public ExecutionReport setAvgPx(final double value) {
    setField(FieldValue.to(avgPxField, value));
    return this;
  }
  public ExecutionReport setAvgPx(final quickfix.field.AvgPx value) {
    setField(FieldValue.to(avgPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayOrderQtyField = FieldFactory.newDoubleField(424);
  public boolean hasDayOrderQty() throws quickfix.FieldNotFound {
    return isSetField(424);
  }
  public double getDayOrderQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayOrderQtyField));
  }
  public ExecutionReport setDayOrderQty(final double value) {
    setField(FieldValue.to(dayOrderQtyField, value));
    return this;
  }
  public ExecutionReport setDayOrderQty(final quickfix.field.DayOrderQty value) {
    setField(FieldValue.to(dayOrderQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayCumQtyField = FieldFactory.newDoubleField(425);
  public boolean hasDayCumQty() throws quickfix.FieldNotFound {
    return isSetField(425);
  }
  public double getDayCumQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayCumQtyField));
  }
  public ExecutionReport setDayCumQty(final double value) {
    setField(FieldValue.to(dayCumQtyField, value));
    return this;
  }
  public ExecutionReport setDayCumQty(final quickfix.field.DayCumQty value) {
    setField(FieldValue.to(dayCumQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dayAvgPxField = FieldFactory.newDoubleField(426);
  public boolean hasDayAvgPx() throws quickfix.FieldNotFound {
    return isSetField(426);
  }
  public double getDayAvgPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dayAvgPxField));
  }
  public ExecutionReport setDayAvgPx(final double value) {
    setField(FieldValue.to(dayAvgPxField, value));
    return this;
  }
  public ExecutionReport setDayAvgPx(final quickfix.field.DayAvgPx value) {
    setField(FieldValue.to(dayAvgPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField totNoFillsField = FieldFactory.newIntField(1361);
  public boolean hasTotNoFills() throws quickfix.FieldNotFound {
    return isSetField(1361);
  }
  public int getTotNoFills() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(totNoFillsField));
  }
  public ExecutionReport setTotNoFills(final int value) {
    setField(FieldValue.to(totNoFillsField, value));
    return this;
  }
  public ExecutionReport setTotNoFills(final quickfix.field.TotNoFills value) {
    setField(FieldValue.to(totNoFillsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField lastFragmentField = FieldFactory.newBooleanField(893);
  public boolean hasLastFragment() throws quickfix.FieldNotFound {
    return isSetField(893);
  }
  public boolean getLastFragment() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastFragmentField));
  }
  public ExecutionReport setLastFragment(final boolean value) {
    setField(FieldValue.to(lastFragmentField, value));
    return this;
  }
  public ExecutionReport setLastFragment(final quickfix.field.LastFragment value) {
    setField(FieldValue.to(lastFragmentField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField gtBookingInstField = FieldFactory.newIntField(427);
  public boolean hasGtBookingInst() throws quickfix.FieldNotFound {
    return isSetField(427);
  }
  public int getGtBookingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(gtBookingInstField));
  }
  public ExecutionReport setGtBookingInst(final int value) {
    setField(FieldValue.to(gtBookingInstField, value));
    return this;
  }
  public ExecutionReport setGtBookingInst(final quickfix.field.GTBookingInst value) {
    setField(FieldValue.to(gtBookingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeDateField = FieldFactory.newStringField(75);
  public boolean hasTradeDate() throws quickfix.FieldNotFound {
    return isSetField(75);
  }
  public String getTradeDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeDateField));
  }
  public ExecutionReport setTradeDate(final String value) {
    setField(FieldValue.to(tradeDateField, value));
    return this;
  }
  public ExecutionReport setTradeDate(final quickfix.field.TradeDate value) {
    setField(FieldValue.to(tradeDateField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public ExecutionReport setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public ExecutionReport setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField reportToExchField = FieldFactory.newBooleanField(113);
  public boolean hasReportToExch() throws quickfix.FieldNotFound {
    return isSetField(113);
  }
  public boolean getReportToExch() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(reportToExchField));
  }
  public ExecutionReport setReportToExch(final boolean value) {
    setField(FieldValue.to(reportToExchField, value));
    return this;
  }
  public ExecutionReport setReportToExch(final quickfix.field.ReportToExch value) {
    setField(FieldValue.to(reportToExchField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField commissionField = FieldFactory.newDoubleField(12);
  public boolean hasCommission() throws quickfix.FieldNotFound {
    return isSetField(12);
  }
  public double getCommission() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commissionField));
  }
  public ExecutionReport setCommission(final double value) {
    setField(FieldValue.to(commissionField, value));
    return this;
  }
  public ExecutionReport setCommission(final quickfix.field.Commission value) {
    setField(FieldValue.to(commissionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField commTypeField = FieldFactory.newCharField(13);
  public boolean hasCommType() throws quickfix.FieldNotFound {
    return isSetField(13);
  }
  public int getCommType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commTypeField));
  }
  public ExecutionReport setCommType(final int value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final char value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final String value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public ExecutionReport setCommType(final quickfix.field.CommType value) {
    setField(FieldValue.to(commTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField commCurrencyField = FieldFactory.newStringField(479);
  public boolean hasCommCurrency() throws quickfix.FieldNotFound {
    return isSetField(479);
  }
  public String getCommCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commCurrencyField));
  }
  public ExecutionReport setCommCurrency(final String value) {
    setField(FieldValue.to(commCurrencyField, value));
    return this;
  }
  public ExecutionReport setCommCurrency(final quickfix.field.CommCurrency value) {
    setField(FieldValue.to(commCurrencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField fundRenewWaivField = FieldFactory.newCharField(497);
  public boolean hasFundRenewWaiv() throws quickfix.FieldNotFound {
    return isSetField(497);
  }
  public int getFundRenewWaiv() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(fundRenewWaivField));
  }
  public ExecutionReport setFundRenewWaiv(final int value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public ExecutionReport setFundRenewWaiv(final char value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public ExecutionReport setFundRenewWaiv(final String value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public ExecutionReport setFundRenewWaiv(final quickfix.field.FundRenewWaiv value) {
    setField(FieldValue.to(fundRenewWaivField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField spreadField = FieldFactory.newDoubleField(218);
  public boolean hasSpread() throws quickfix.FieldNotFound {
    return isSetField(218);
  }
  public double getSpread() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(spreadField));
  }
  public ExecutionReport setSpread(final double value) {
    setField(FieldValue.to(spreadField, value));
    return this;
  }
  public ExecutionReport setSpread(final quickfix.field.Spread value) {
    setField(FieldValue.to(spreadField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField benchmarkCurveCurrencyField = FieldFactory.newStringField(220);
  public boolean hasBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
    return isSetField(220);
  }
  public String getBenchmarkCurveCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(benchmarkCurveCurrencyField));
  }
  public ExecutionReport setBenchmarkCurveCurrency(final String value) {
    setField(FieldValue.to(benchmarkCurveCurrencyField, value));
    return this;
  }
  public ExecutionReport setBenchmarkCurveCurrency(
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
  public ExecutionReport setBenchmarkCurveName(final String value) {
    setField(FieldValue.to(benchmarkCurveNameField, value));
    return this;
  }
  public ExecutionReport setBenchmarkCurveName(final quickfix.field.BenchmarkCurveName value) {
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
  public ExecutionReport setBenchmarkCurvePoint(final String value) {
    setField(FieldValue.to(benchmarkCurvePointField, value));
    return this;
  }
  public ExecutionReport setBenchmarkCurvePoint(final quickfix.field.BenchmarkCurvePoint value) {
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
  public ExecutionReport setBenchmarkPrice(final double value) {
    setField(FieldValue.to(benchmarkPriceField, value));
    return this;
  }
  public ExecutionReport setBenchmarkPrice(final quickfix.field.BenchmarkPrice value) {
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
  public ExecutionReport setBenchmarkPriceType(final int value) {
    setField(FieldValue.to(benchmarkPriceTypeField, value));
    return this;
  }
  public ExecutionReport setBenchmarkPriceType(final quickfix.field.BenchmarkPriceType value) {
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
  public ExecutionReport setBenchmarkSecurityId(final String value) {
    setField(FieldValue.to(benchmarkSecurityIdField, value));
    return this;
  }
  public ExecutionReport setBenchmarkSecurityId(final quickfix.field.BenchmarkSecurityID value) {
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
  public ExecutionReport setBenchmarkSecurityIdSource(final String value) {
    setField(FieldValue.to(benchmarkSecurityIdSourceField, value));
    return this;
  }
  public ExecutionReport setBenchmarkSecurityIdSource(
      final quickfix.field.BenchmarkSecurityIDSource value) {
    setField(FieldValue.to(benchmarkSecurityIdSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField yieldTypeField = FieldFactory.newStringField(235);
  public boolean hasYieldType() throws quickfix.FieldNotFound {
    return isSetField(235);
  }
  public String getYieldType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(yieldTypeField));
  }
  public ExecutionReport setYieldType(final String value) {
    setField(FieldValue.to(yieldTypeField, value));
    return this;
  }
  public ExecutionReport setYieldType(final quickfix.field.YieldType value) {
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
  public ExecutionReport setYield(final double value) {
    setField(FieldValue.to(yieldField, value));
    return this;
  }
  public ExecutionReport setYield(final quickfix.field.Yield value) {
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
  public ExecutionReport setYieldCalcDate(final String value) {
    setField(FieldValue.to(yieldCalcDateField, value));
    return this;
  }
  public ExecutionReport setYieldCalcDate(final quickfix.field.YieldCalcDate value) {
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
  public ExecutionReport setYieldRedemptionDate(final String value) {
    setField(FieldValue.to(yieldRedemptionDateField, value));
    return this;
  }
  public ExecutionReport setYieldRedemptionDate(final quickfix.field.YieldRedemptionDate value) {
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
  public ExecutionReport setYieldRedemptionPrice(final double value) {
    setField(FieldValue.to(yieldRedemptionPriceField, value));
    return this;
  }
  public ExecutionReport setYieldRedemptionPrice(final quickfix.field.YieldRedemptionPrice value) {
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
  public ExecutionReport setYieldRedemptionPriceType(final int value) {
    setField(FieldValue.to(yieldRedemptionPriceTypeField, value));
    return this;
  }
  public ExecutionReport setYieldRedemptionPriceType(
      final quickfix.field.YieldRedemptionPriceType value) {
    setField(FieldValue.to(yieldRedemptionPriceTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField grossTradeAmtField = FieldFactory.newDoubleField(381);
  public boolean hasGrossTradeAmt() throws quickfix.FieldNotFound {
    return isSetField(381);
  }
  public double getGrossTradeAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(grossTradeAmtField));
  }
  public ExecutionReport setGrossTradeAmt(final double value) {
    setField(FieldValue.to(grossTradeAmtField, value));
    return this;
  }
  public ExecutionReport setGrossTradeAmt(final quickfix.field.GrossTradeAmt value) {
    setField(FieldValue.to(grossTradeAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField numDaysInterestField = FieldFactory.newIntField(157);
  public boolean hasNumDaysInterest() throws quickfix.FieldNotFound {
    return isSetField(157);
  }
  public int getNumDaysInterest() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(numDaysInterestField));
  }
  public ExecutionReport setNumDaysInterest(final int value) {
    setField(FieldValue.to(numDaysInterestField, value));
    return this;
  }
  public ExecutionReport setNumDaysInterest(final quickfix.field.NumDaysInterest value) {
    setField(FieldValue.to(numDaysInterestField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField exDateField = FieldFactory.newStringField(230);
  public boolean hasExDate() throws quickfix.FieldNotFound {
    return isSetField(230);
  }
  public String getExDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(exDateField));
  }
  public ExecutionReport setExDate(final String value) {
    setField(FieldValue.to(exDateField, value));
    return this;
  }
  public ExecutionReport setExDate(final quickfix.field.ExDate value) {
    setField(FieldValue.to(exDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField accruedInterestRateField = FieldFactory.newDoubleField(158);
  public boolean hasAccruedInterestRate() throws quickfix.FieldNotFound {
    return isSetField(158);
  }
  public double getAccruedInterestRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accruedInterestRateField));
  }
  public ExecutionReport setAccruedInterestRate(final double value) {
    setField(FieldValue.to(accruedInterestRateField, value));
    return this;
  }
  public ExecutionReport setAccruedInterestRate(final quickfix.field.AccruedInterestRate value) {
    setField(FieldValue.to(accruedInterestRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField accruedInterestAmtField = FieldFactory.newDoubleField(159);
  public boolean hasAccruedInterestAmt() throws quickfix.FieldNotFound {
    return isSetField(159);
  }
  public double getAccruedInterestAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accruedInterestAmtField));
  }
  public ExecutionReport setAccruedInterestAmt(final double value) {
    setField(FieldValue.to(accruedInterestAmtField, value));
    return this;
  }
  public ExecutionReport setAccruedInterestAmt(final quickfix.field.AccruedInterestAmt value) {
    setField(FieldValue.to(accruedInterestAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField interestAtMaturityField = FieldFactory.newDoubleField(738);
  public boolean hasInterestAtMaturity() throws quickfix.FieldNotFound {
    return isSetField(738);
  }
  public double getInterestAtMaturity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(interestAtMaturityField));
  }
  public ExecutionReport setInterestAtMaturity(final double value) {
    setField(FieldValue.to(interestAtMaturityField, value));
    return this;
  }
  public ExecutionReport setInterestAtMaturity(final quickfix.field.InterestAtMaturity value) {
    setField(FieldValue.to(interestAtMaturityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField endAccruedInterestAmtField = FieldFactory.newDoubleField(920);
  public boolean hasEndAccruedInterestAmt() throws quickfix.FieldNotFound {
    return isSetField(920);
  }
  public double getEndAccruedInterestAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(endAccruedInterestAmtField));
  }
  public ExecutionReport setEndAccruedInterestAmt(final double value) {
    setField(FieldValue.to(endAccruedInterestAmtField, value));
    return this;
  }
  public ExecutionReport setEndAccruedInterestAmt(
      final quickfix.field.EndAccruedInterestAmt value) {
    setField(FieldValue.to(endAccruedInterestAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField startCashField = FieldFactory.newDoubleField(921);
  public boolean hasStartCash() throws quickfix.FieldNotFound {
    return isSetField(921);
  }
  public double getStartCash() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(startCashField));
  }
  public ExecutionReport setStartCash(final double value) {
    setField(FieldValue.to(startCashField, value));
    return this;
  }
  public ExecutionReport setStartCash(final quickfix.field.StartCash value) {
    setField(FieldValue.to(startCashField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField endCashField = FieldFactory.newDoubleField(922);
  public boolean hasEndCash() throws quickfix.FieldNotFound {
    return isSetField(922);
  }
  public double getEndCash() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(endCashField));
  }
  public ExecutionReport setEndCash(final double value) {
    setField(FieldValue.to(endCashField, value));
    return this;
  }
  public ExecutionReport setEndCash(final quickfix.field.EndCash value) {
    setField(FieldValue.to(endCashField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField tradedFlatSwitchField = FieldFactory.newBooleanField(258);
  public boolean hasTradedFlatSwitch() throws quickfix.FieldNotFound {
    return isSetField(258);
  }
  public boolean getTradedFlatSwitch() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradedFlatSwitchField));
  }
  public ExecutionReport setTradedFlatSwitch(final boolean value) {
    setField(FieldValue.to(tradedFlatSwitchField, value));
    return this;
  }
  public ExecutionReport setTradedFlatSwitch(final quickfix.field.TradedFlatSwitch value) {
    setField(FieldValue.to(tradedFlatSwitchField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField basisFeatureDateField = FieldFactory.newStringField(259);
  public boolean hasBasisFeatureDate() throws quickfix.FieldNotFound {
    return isSetField(259);
  }
  public String getBasisFeatureDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(basisFeatureDateField));
  }
  public ExecutionReport setBasisFeatureDate(final String value) {
    setField(FieldValue.to(basisFeatureDateField, value));
    return this;
  }
  public ExecutionReport setBasisFeatureDate(final quickfix.field.BasisFeatureDate value) {
    setField(FieldValue.to(basisFeatureDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField basisFeaturePriceField = FieldFactory.newDoubleField(260);
  public boolean hasBasisFeaturePrice() throws quickfix.FieldNotFound {
    return isSetField(260);
  }
  public double getBasisFeaturePrice() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(basisFeaturePriceField));
  }
  public ExecutionReport setBasisFeaturePrice(final double value) {
    setField(FieldValue.to(basisFeaturePriceField, value));
    return this;
  }
  public ExecutionReport setBasisFeaturePrice(final quickfix.field.BasisFeaturePrice value) {
    setField(FieldValue.to(basisFeaturePriceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField concessionField = FieldFactory.newDoubleField(238);
  public boolean hasConcession() throws quickfix.FieldNotFound {
    return isSetField(238);
  }
  public double getConcession() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(concessionField));
  }
  public ExecutionReport setConcession(final double value) {
    setField(FieldValue.to(concessionField, value));
    return this;
  }
  public ExecutionReport setConcession(final quickfix.field.Concession value) {
    setField(FieldValue.to(concessionField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField totalTakedownField = FieldFactory.newDoubleField(237);
  public boolean hasTotalTakedown() throws quickfix.FieldNotFound {
    return isSetField(237);
  }
  public double getTotalTakedown() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(totalTakedownField));
  }
  public ExecutionReport setTotalTakedown(final double value) {
    setField(FieldValue.to(totalTakedownField, value));
    return this;
  }
  public ExecutionReport setTotalTakedown(final quickfix.field.TotalTakedown value) {
    setField(FieldValue.to(totalTakedownField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField netMoneyField = FieldFactory.newDoubleField(118);
  public boolean hasNetMoney() throws quickfix.FieldNotFound {
    return isSetField(118);
  }
  public double getNetMoney() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(netMoneyField));
  }
  public ExecutionReport setNetMoney(final double value) {
    setField(FieldValue.to(netMoneyField, value));
    return this;
  }
  public ExecutionReport setNetMoney(final quickfix.field.NetMoney value) {
    setField(FieldValue.to(netMoneyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField settlCurrAmtField = FieldFactory.newDoubleField(119);
  public boolean hasSettlCurrAmt() throws quickfix.FieldNotFound {
    return isSetField(119);
  }
  public double getSettlCurrAmt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrAmtField));
  }
  public ExecutionReport setSettlCurrAmt(final double value) {
    setField(FieldValue.to(settlCurrAmtField, value));
    return this;
  }
  public ExecutionReport setSettlCurrAmt(final quickfix.field.SettlCurrAmt value) {
    setField(FieldValue.to(settlCurrAmtField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
  public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
    return isSetField(120);
  }
  public String getSettlCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrencyField));
  }
  public ExecutionReport setSettlCurrency(final String value) {
    setField(FieldValue.to(settlCurrencyField, value));
    return this;
  }
  public ExecutionReport setSettlCurrency(final quickfix.field.SettlCurrency value) {
    setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField settlCurrFxRateField = FieldFactory.newDoubleField(155);
  public boolean hasSettlCurrFxRate() throws quickfix.FieldNotFound {
    return isSetField(155);
  }
  public double getSettlCurrFxRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrFxRateField));
  }
  public ExecutionReport setSettlCurrFxRate(final double value) {
    setField(FieldValue.to(settlCurrFxRateField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRate(final quickfix.field.SettlCurrFxRate value) {
    setField(FieldValue.to(settlCurrFxRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField settlCurrFxRateCalcField = FieldFactory.newCharField(156);
  public boolean hasSettlCurrFxRateCalc() throws quickfix.FieldNotFound {
    return isSetField(156);
  }
  public int getSettlCurrFxRateCalc() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrFxRateCalcField));
  }
  public ExecutionReport setSettlCurrFxRateCalc(final int value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final char value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final String value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, value));
    return this;
  }
  public ExecutionReport setSettlCurrFxRateCalc(final quickfix.field.SettlCurrFxRateCalc value) {
    setField(FieldValue.to(settlCurrFxRateCalcField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField handlInstField = FieldFactory.newCharField(21);
  public boolean hasHandlInst() throws quickfix.FieldNotFound {
    return isSetField(21);
  }
  public int getHandlInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(handlInstField));
  }
  public ExecutionReport setHandlInst(final int value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final char value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final String value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public ExecutionReport setHandlInst(final quickfix.field.HandlInst value) {
    setField(FieldValue.to(handlInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
  public boolean hasMinQty() throws quickfix.FieldNotFound {
    return isSetField(110);
  }
  public double getMinQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(minQtyField));
  }
  public ExecutionReport setMinQty(final double value) {
    setField(FieldValue.to(minQtyField, value));
    return this;
  }
  public ExecutionReport setMinQty(final quickfix.field.MinQty value) {
    setField(FieldValue.to(minQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField matchIncrementField = FieldFactory.newDoubleField(1089);
  public boolean hasMatchIncrement() throws quickfix.FieldNotFound {
    return isSetField(1089);
  }
  public double getMatchIncrement() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(matchIncrementField));
  }
  public ExecutionReport setMatchIncrement(final double value) {
    setField(FieldValue.to(matchIncrementField, value));
    return this;
  }
  public ExecutionReport setMatchIncrement(final quickfix.field.MatchIncrement value) {
    setField(FieldValue.to(matchIncrementField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField maxPriceLevelsField = FieldFactory.newIntField(1090);
  public boolean hasMaxPriceLevels() throws quickfix.FieldNotFound {
    return isSetField(1090);
  }
  public int getMaxPriceLevels() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxPriceLevelsField));
  }
  public ExecutionReport setMaxPriceLevels(final int value) {
    setField(FieldValue.to(maxPriceLevelsField, value));
    return this;
  }
  public ExecutionReport setMaxPriceLevels(final quickfix.field.MaxPriceLevels value) {
    setField(FieldValue.to(maxPriceLevelsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField displayQtyField = FieldFactory.newDoubleField(1138);
  public boolean hasDisplayQty() throws quickfix.FieldNotFound {
    return isSetField(1138);
  }
  public double getDisplayQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayQtyField));
  }
  public ExecutionReport setDisplayQty(final double value) {
    setField(FieldValue.to(displayQtyField, value));
    return this;
  }
  public ExecutionReport setDisplayQty(final quickfix.field.DisplayQty value) {
    setField(FieldValue.to(displayQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField secondaryDisplayQtyField = FieldFactory.newDoubleField(1082);
  public boolean hasSecondaryDisplayQty() throws quickfix.FieldNotFound {
    return isSetField(1082);
  }
  public double getSecondaryDisplayQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secondaryDisplayQtyField));
  }
  public ExecutionReport setSecondaryDisplayQty(final double value) {
    setField(FieldValue.to(secondaryDisplayQtyField, value));
    return this;
  }
  public ExecutionReport setSecondaryDisplayQty(final quickfix.field.SecondaryDisplayQty value) {
    setField(FieldValue.to(secondaryDisplayQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField displayWhenField = FieldFactory.newCharField(1083);
  public boolean hasDisplayWhen() throws quickfix.FieldNotFound {
    return isSetField(1083);
  }
  public int getDisplayWhen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayWhenField));
  }
  public ExecutionReport setDisplayWhen(final int value) {
    setField(FieldValue.to(displayWhenField, value));
    return this;
  }
  public ExecutionReport setDisplayWhen(final char value) {
    setField(FieldValue.to(displayWhenField, value));
    return this;
  }
  public ExecutionReport setDisplayWhen(final String value) {
    setField(FieldValue.to(displayWhenField, value));
    return this;
  }
  public ExecutionReport setDisplayWhen(final quickfix.field.DisplayWhen value) {
    setField(FieldValue.to(displayWhenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField displayMethodField = FieldFactory.newCharField(1084);
  public boolean hasDisplayMethod() throws quickfix.FieldNotFound {
    return isSetField(1084);
  }
  public int getDisplayMethod() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayMethodField));
  }
  public ExecutionReport setDisplayMethod(final int value) {
    setField(FieldValue.to(displayMethodField, value));
    return this;
  }
  public ExecutionReport setDisplayMethod(final char value) {
    setField(FieldValue.to(displayMethodField, value));
    return this;
  }
  public ExecutionReport setDisplayMethod(final String value) {
    setField(FieldValue.to(displayMethodField, value));
    return this;
  }
  public ExecutionReport setDisplayMethod(final quickfix.field.DisplayMethod value) {
    setField(FieldValue.to(displayMethodField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField displayLowQtyField = FieldFactory.newDoubleField(1085);
  public boolean hasDisplayLowQty() throws quickfix.FieldNotFound {
    return isSetField(1085);
  }
  public double getDisplayLowQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayLowQtyField));
  }
  public ExecutionReport setDisplayLowQty(final double value) {
    setField(FieldValue.to(displayLowQtyField, value));
    return this;
  }
  public ExecutionReport setDisplayLowQty(final quickfix.field.DisplayLowQty value) {
    setField(FieldValue.to(displayLowQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField displayHighQtyField = FieldFactory.newDoubleField(1086);
  public boolean hasDisplayHighQty() throws quickfix.FieldNotFound {
    return isSetField(1086);
  }
  public double getDisplayHighQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayHighQtyField));
  }
  public ExecutionReport setDisplayHighQty(final double value) {
    setField(FieldValue.to(displayHighQtyField, value));
    return this;
  }
  public ExecutionReport setDisplayHighQty(final quickfix.field.DisplayHighQty value) {
    setField(FieldValue.to(displayHighQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField displayMinIncrField = FieldFactory.newDoubleField(1087);
  public boolean hasDisplayMinIncr() throws quickfix.FieldNotFound {
    return isSetField(1087);
  }
  public double getDisplayMinIncr() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(displayMinIncrField));
  }
  public ExecutionReport setDisplayMinIncr(final double value) {
    setField(FieldValue.to(displayMinIncrField, value));
    return this;
  }
  public ExecutionReport setDisplayMinIncr(final quickfix.field.DisplayMinIncr value) {
    setField(FieldValue.to(displayMinIncrField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField refreshQtyField = FieldFactory.newDoubleField(1088);
  public boolean hasRefreshQty() throws quickfix.FieldNotFound {
    return isSetField(1088);
  }
  public double getRefreshQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(refreshQtyField));
  }
  public ExecutionReport setRefreshQty(final double value) {
    setField(FieldValue.to(refreshQtyField, value));
    return this;
  }
  public ExecutionReport setRefreshQty(final quickfix.field.RefreshQty value) {
    setField(FieldValue.to(refreshQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxFloorField = FieldFactory.newDoubleField(111);
  public boolean hasMaxFloor() throws quickfix.FieldNotFound {
    return isSetField(111);
  }
  public double getMaxFloor() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxFloorField));
  }
  public ExecutionReport setMaxFloor(final double value) {
    setField(FieldValue.to(maxFloorField, value));
    return this;
  }
  public ExecutionReport setMaxFloor(final quickfix.field.MaxFloor value) {
    setField(FieldValue.to(maxFloorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField positionEffectField = FieldFactory.newCharField(77);
  public boolean hasPositionEffect() throws quickfix.FieldNotFound {
    return isSetField(77);
  }
  public int getPositionEffect() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(positionEffectField));
  }
  public ExecutionReport setPositionEffect(final int value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public ExecutionReport setPositionEffect(final char value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public ExecutionReport setPositionEffect(final String value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public ExecutionReport setPositionEffect(final quickfix.field.PositionEffect value) {
    setField(FieldValue.to(positionEffectField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxShowField = FieldFactory.newDoubleField(210);
  public boolean hasMaxShow() throws quickfix.FieldNotFound {
    return isSetField(210);
  }
  public double getMaxShow() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxShowField));
  }
  public ExecutionReport setMaxShow(final double value) {
    setField(FieldValue.to(maxShowField, value));
    return this;
  }
  public ExecutionReport setMaxShow(final quickfix.field.MaxShow value) {
    setField(FieldValue.to(maxShowField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField bookingTypeField = FieldFactory.newIntField(775);
  public boolean hasBookingType() throws quickfix.FieldNotFound {
    return isSetField(775);
  }
  public int getBookingType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bookingTypeField));
  }
  public ExecutionReport setBookingType(final int value) {
    setField(FieldValue.to(bookingTypeField, value));
    return this;
  }
  public ExecutionReport setBookingType(final quickfix.field.BookingType value) {
    setField(FieldValue.to(bookingTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public ExecutionReport setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public ExecutionReport setText(final quickfix.field.Text value) {
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
  public ExecutionReport setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public ExecutionReport setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public ExecutionReport setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public ExecutionReport setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlDate2Field = FieldFactory.newStringField(193);
  public boolean hasSettlDate2() throws quickfix.FieldNotFound {
    return isSetField(193);
  }
  public String getSettlDate2() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlDate2Field));
  }
  public ExecutionReport setSettlDate2(final String value) {
    setField(FieldValue.to(settlDate2Field, value));
    return this;
  }
  public ExecutionReport setSettlDate2(final quickfix.field.SettlDate2 value) {
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
  public ExecutionReport setOrderQty2(final double value) {
    setField(FieldValue.to(orderQty2Field, value));
    return this;
  }
  public ExecutionReport setOrderQty2(final quickfix.field.OrderQty2 value) {
    setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField lastForwardPoints2Field = FieldFactory.newDoubleField(641);
  public boolean hasLastForwardPoints2() throws quickfix.FieldNotFound {
    return isSetField(641);
  }
  public double getLastForwardPoints2() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastForwardPoints2Field));
  }
  public ExecutionReport setLastForwardPoints2(final double value) {
    setField(FieldValue.to(lastForwardPoints2Field, value));
    return this;
  }
  public ExecutionReport setLastForwardPoints2(final quickfix.field.LastForwardPoints2 value) {
    setField(FieldValue.to(lastForwardPoints2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField multiLegReportingTypeField = FieldFactory.newCharField(442);
  public boolean hasMultiLegReportingType() throws quickfix.FieldNotFound {
    return isSetField(442);
  }
  public int getMultiLegReportingType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(multiLegReportingTypeField));
  }
  public ExecutionReport setMultiLegReportingType(final int value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(final char value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(final String value) {
    setField(FieldValue.to(multiLegReportingTypeField, value));
    return this;
  }
  public ExecutionReport setMultiLegReportingType(
      final quickfix.field.MultiLegReportingType value) {
    setField(FieldValue.to(multiLegReportingTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField cancellationRightsField = FieldFactory.newCharField(480);
  public boolean hasCancellationRights() throws quickfix.FieldNotFound {
    return isSetField(480);
  }
  public int getCancellationRights() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cancellationRightsField));
  }
  public ExecutionReport setCancellationRights(final int value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public ExecutionReport setCancellationRights(final char value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public ExecutionReport setCancellationRights(final String value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public ExecutionReport setCancellationRights(final quickfix.field.CancellationRights value) {
    setField(FieldValue.to(cancellationRightsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField moneyLaunderingStatusField = FieldFactory.newCharField(481);
  public boolean hasMoneyLaunderingStatus() throws quickfix.FieldNotFound {
    return isSetField(481);
  }
  public int getMoneyLaunderingStatus() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(moneyLaunderingStatusField));
  }
  public ExecutionReport setMoneyLaunderingStatus(final int value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public ExecutionReport setMoneyLaunderingStatus(final char value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public ExecutionReport setMoneyLaunderingStatus(final String value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public ExecutionReport setMoneyLaunderingStatus(
      final quickfix.field.MoneyLaunderingStatus value) {
    setField(FieldValue.to(moneyLaunderingStatusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField registIdField = FieldFactory.newStringField(513);
  public boolean hasRegistId() throws quickfix.FieldNotFound {
    return isSetField(513);
  }
  public String getRegistId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(registIdField));
  }
  public ExecutionReport setRegistId(final String value) {
    setField(FieldValue.to(registIdField, value));
    return this;
  }
  public ExecutionReport setRegistId(final quickfix.field.RegistID value) {
    setField(FieldValue.to(registIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField designationField = FieldFactory.newStringField(494);
  public boolean hasDesignation() throws quickfix.FieldNotFound {
    return isSetField(494);
  }
  public String getDesignation() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(designationField));
  }
  public ExecutionReport setDesignation(final String value) {
    setField(FieldValue.to(designationField, value));
    return this;
  }
  public ExecutionReport setDesignation(final quickfix.field.Designation value) {
    setField(FieldValue.to(designationField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transBkdTimeField = FieldFactory.newTimeStampField(483);
  public boolean hasTransBkdTime() throws quickfix.FieldNotFound {
    return isSetField(483);
  }
  public long getTransBkdTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transBkdTimeField));
  }
  public ExecutionReport setTransBkdTime(final long value) {
    setField(FieldValue.to(transBkdTimeField, value));
    return this;
  }
  public ExecutionReport setTransBkdTime(final quickfix.field.TransBkdTime value) {
    setField(FieldValue.to(transBkdTimeField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField execValuationPointField =
      FieldFactory.newTimeStampField(515);
  public boolean hasExecValuationPoint() throws quickfix.FieldNotFound {
    return isSetField(515);
  }
  public long getExecValuationPoint() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execValuationPointField));
  }
  public ExecutionReport setExecValuationPoint(final long value) {
    setField(FieldValue.to(execValuationPointField, value));
    return this;
  }
  public ExecutionReport setExecValuationPoint(final quickfix.field.ExecValuationPoint value) {
    setField(FieldValue.to(execValuationPointField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField execPriceTypeField = FieldFactory.newCharField(484);
  public boolean hasExecPriceType() throws quickfix.FieldNotFound {
    return isSetField(484);
  }
  public int getExecPriceType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execPriceTypeField));
  }
  public ExecutionReport setExecPriceType(final int value) {
    setField(FieldValue.to(execPriceTypeField, value));
    return this;
  }
  public ExecutionReport setExecPriceType(final char value) {
    setField(FieldValue.to(execPriceTypeField, value));
    return this;
  }
  public ExecutionReport setExecPriceType(final String value) {
    setField(FieldValue.to(execPriceTypeField, value));
    return this;
  }
  public ExecutionReport setExecPriceType(final quickfix.field.ExecPriceType value) {
    setField(FieldValue.to(execPriceTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField execPriceAdjustmentField = FieldFactory.newDoubleField(485);
  public boolean hasExecPriceAdjustment() throws quickfix.FieldNotFound {
    return isSetField(485);
  }
  public double getExecPriceAdjustment() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execPriceAdjustmentField));
  }
  public ExecutionReport setExecPriceAdjustment(final double value) {
    setField(FieldValue.to(execPriceAdjustmentField, value));
    return this;
  }
  public ExecutionReport setExecPriceAdjustment(final quickfix.field.ExecPriceAdjustment value) {
    setField(FieldValue.to(execPriceAdjustmentField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField priorityIndicatorField = FieldFactory.newIntField(638);
  public boolean hasPriorityIndicator() throws quickfix.FieldNotFound {
    return isSetField(638);
  }
  public int getPriorityIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priorityIndicatorField));
  }
  public ExecutionReport setPriorityIndicator(final int value) {
    setField(FieldValue.to(priorityIndicatorField, value));
    return this;
  }
  public ExecutionReport setPriorityIndicator(final quickfix.field.PriorityIndicator value) {
    setField(FieldValue.to(priorityIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField priceImprovementField = FieldFactory.newDoubleField(639);
  public boolean hasPriceImprovement() throws quickfix.FieldNotFound {
    return isSetField(639);
  }
  public double getPriceImprovement() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceImprovementField));
  }
  public ExecutionReport setPriceImprovement(final double value) {
    setField(FieldValue.to(priceImprovementField, value));
    return this;
  }
  public ExecutionReport setPriceImprovement(final quickfix.field.PriceImprovement value) {
    setField(FieldValue.to(priceImprovementField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField lastLiquidityIndField = FieldFactory.newIntField(851);
  public boolean hasLastLiquidityInd() throws quickfix.FieldNotFound {
    return isSetField(851);
  }
  public int getLastLiquidityInd() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastLiquidityIndField));
  }
  public ExecutionReport setLastLiquidityInd(final int value) {
    setField(FieldValue.to(lastLiquidityIndField, value));
    return this;
  }
  public ExecutionReport setLastLiquidityInd(final quickfix.field.LastLiquidityInd value) {
    setField(FieldValue.to(lastLiquidityIndField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField copyMsgIndicatorField = FieldFactory.newBooleanField(797);
  public boolean hasCopyMsgIndicator() throws quickfix.FieldNotFound {
    return isSetField(797);
  }
  public boolean getCopyMsgIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(copyMsgIndicatorField));
  }
  public ExecutionReport setCopyMsgIndicator(final boolean value) {
    setField(FieldValue.to(copyMsgIndicatorField, value));
    return this;
  }
  public ExecutionReport setCopyMsgIndicator(final quickfix.field.CopyMsgIndicator value) {
    setField(FieldValue.to(copyMsgIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField dividendYieldField = FieldFactory.newDoubleField(1380);
  public boolean hasDividendYield() throws quickfix.FieldNotFound {
    return isSetField(1380);
  }
  public double getDividendYield() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(dividendYieldField));
  }
  public ExecutionReport setDividendYield(final double value) {
    setField(FieldValue.to(dividendYieldField, value));
    return this;
  }
  public ExecutionReport setDividendYield(final quickfix.field.DividendYield value) {
    setField(FieldValue.to(dividendYieldField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField manualOrderIndicatorField =
      FieldFactory.newBooleanField(1028);
  public boolean hasManualOrderIndicator() throws quickfix.FieldNotFound {
    return isSetField(1028);
  }
  public boolean getManualOrderIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(manualOrderIndicatorField));
  }
  public ExecutionReport setManualOrderIndicator(final boolean value) {
    setField(FieldValue.to(manualOrderIndicatorField, value));
    return this;
  }
  public ExecutionReport setManualOrderIndicator(final quickfix.field.ManualOrderIndicator value) {
    setField(FieldValue.to(manualOrderIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField custDirectedOrderField = FieldFactory.newBooleanField(1029);
  public boolean hasCustDirectedOrder() throws quickfix.FieldNotFound {
    return isSetField(1029);
  }
  public boolean getCustDirectedOrder() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(custDirectedOrderField));
  }
  public ExecutionReport setCustDirectedOrder(final boolean value) {
    setField(FieldValue.to(custDirectedOrderField, value));
    return this;
  }
  public ExecutionReport setCustDirectedOrder(final quickfix.field.CustDirectedOrder value) {
    setField(FieldValue.to(custDirectedOrderField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField receivedDeptIdField = FieldFactory.newStringField(1030);
  public boolean hasReceivedDeptId() throws quickfix.FieldNotFound {
    return isSetField(1030);
  }
  public String getReceivedDeptId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(receivedDeptIdField));
  }
  public ExecutionReport setReceivedDeptId(final String value) {
    setField(FieldValue.to(receivedDeptIdField, value));
    return this;
  }
  public ExecutionReport setReceivedDeptId(final quickfix.field.ReceivedDeptID value) {
    setField(FieldValue.to(receivedDeptIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField custOrderHandlingInstField = FieldFactory.newStringField(1031);
  public boolean hasCustOrderHandlingInst() throws quickfix.FieldNotFound {
    return isSetField(1031);
  }
  public String getCustOrderHandlingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(custOrderHandlingInstField));
  }
  public ExecutionReport setCustOrderHandlingInst(final String value) {
    setField(FieldValue.to(custOrderHandlingInstField, value));
    return this;
  }
  public ExecutionReport setCustOrderHandlingInst(
      final quickfix.field.CustOrderHandlingInst value) {
    setField(FieldValue.to(custOrderHandlingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField orderHandlingInstSourceField = FieldFactory.newIntField(1032);
  public boolean hasOrderHandlingInstSource() throws quickfix.FieldNotFound {
    return isSetField(1032);
  }
  public int getOrderHandlingInstSource() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderHandlingInstSourceField));
  }
  public ExecutionReport setOrderHandlingInstSource(final int value) {
    setField(FieldValue.to(orderHandlingInstSourceField, value));
    return this;
  }
  public ExecutionReport setOrderHandlingInstSource(
      final quickfix.field.OrderHandlingInstSource value) {
    setField(FieldValue.to(orderHandlingInstSourceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField volatilityField = FieldFactory.newDoubleField(1188);
  public boolean hasVolatility() throws quickfix.FieldNotFound {
    return isSetField(1188);
  }
  public double getVolatility() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(volatilityField));
  }
  public ExecutionReport setVolatility(final double value) {
    setField(FieldValue.to(volatilityField, value));
    return this;
  }
  public ExecutionReport setVolatility(final quickfix.field.Volatility value) {
    setField(FieldValue.to(volatilityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField timeToExpirationField = FieldFactory.newDoubleField(1189);
  public boolean hasTimeToExpiration() throws quickfix.FieldNotFound {
    return isSetField(1189);
  }
  public double getTimeToExpiration() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeToExpirationField));
  }
  public ExecutionReport setTimeToExpiration(final double value) {
    setField(FieldValue.to(timeToExpirationField, value));
    return this;
  }
  public ExecutionReport setTimeToExpiration(final quickfix.field.TimeToExpiration value) {
    setField(FieldValue.to(timeToExpirationField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField riskFreeRateField = FieldFactory.newDoubleField(1190);
  public boolean hasRiskFreeRate() throws quickfix.FieldNotFound {
    return isSetField(1190);
  }
  public double getRiskFreeRate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(riskFreeRateField));
  }
  public ExecutionReport setRiskFreeRate(final double value) {
    setField(FieldValue.to(riskFreeRateField, value));
    return this;
  }
  public ExecutionReport setRiskFreeRate(final quickfix.field.RiskFreeRate value) {
    setField(FieldValue.to(riskFreeRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField priceDeltaField = FieldFactory.newDoubleField(811);
  public boolean hasPriceDelta() throws quickfix.FieldNotFound {
    return isSetField(811);
  }
  public double getPriceDelta() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(priceDeltaField));
  }
  public ExecutionReport setPriceDelta(final double value) {
    setField(FieldValue.to(priceDeltaField, value));
    return this;
  }
  public ExecutionReport setPriceDelta(final quickfix.field.PriceDelta value) {
    setField(FieldValue.to(priceDeltaField, FieldValue.of(value)));
    return this;
  }

  public ExecutionReport() {
    super(new int[] {1180, 1181, 1350, 1352, 37, 198, 526, 527, 11, 41, 583, 693, 790, 584, 961,
        911, 912, 229, 66, 548, 551, 549, 880, 17, 19, 150, 39, 636, 103, 378, 1, 660, 581, 589,
        590, 591, 70, 63, 64, 574, 1115, 544, 635, 55, 65, 48, 22, 460, 1227, 1151, 461, 167, 762,
        200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227,
        228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231,
        1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198,
        1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350, 351, 1184,
        1185, 1186, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898, 54,
        854, 38, 152, 516, 468, 469, 1093, 40, 423, 44, 1092, 99, 1100, 1101, 1102, 1103, 1104,
        1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114, 211, 1094, 835, 836, 837, 838,
        840, 1096, 1097, 1098, 1099, 388, 389, 841, 842, 843, 844, 846, 839, 1095, 845, 847, 848,
        849, 850, 15, 376, 377, 59, 168, 432, 126, 18, 1057, 528, 529, 1091, 582, 32, 1056, 1071,
        652, 31, 651, 669, 194, 195, 30, 336, 625, 943, 29, 151, 14, 6, 424, 425, 426, 1361, 893,
        427, 75, 60, 113, 12, 13, 479, 497, 218, 220, 221, 222, 662, 663, 699, 761, 235, 236, 701,
        696, 697, 698, 381, 157, 230, 158, 159, 738, 920, 921, 922, 258, 259, 260, 238, 237, 118,
        119, 120, 155, 156, 21, 110, 1089, 1090, 1138, 1082, 1083, 1084, 1085, 1086, 1087, 1088,
        111, 77, 210, 775, 58, 354, 355, 193, 192, 641, 442, 480, 481, 513, 494, 483, 515, 484, 485,
        638, 639, 851, 797, 1380, 1028, 1029, 1030, 1031, 1032, 1188, 1189, 1190, 811, 0});
  }

  public ExecutionReport(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {1180, 1181, 1350, 1352, 37, 198, 526, 527, 11, 41, 583, 693, 790, 584, 961,
        911, 912, 229, 66, 548, 551, 549, 880, 17, 19, 150, 39, 636, 103, 378, 1, 660, 581, 589,
        590, 591, 70, 63, 64, 574, 1115, 544, 635, 55, 65, 48, 22, 460, 1227, 1151, 461, 167, 762,
        200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227,
        228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231,
        1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198,
        1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350, 351, 1184,
        1185, 1186, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898, 54,
        854, 38, 152, 516, 468, 469, 1093, 40, 423, 44, 1092, 99, 1100, 1101, 1102, 1103, 1104,
        1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114, 211, 1094, 835, 836, 837, 838,
        840, 1096, 1097, 1098, 1099, 388, 389, 841, 842, 843, 844, 846, 839, 1095, 845, 847, 848,
        849, 850, 15, 376, 377, 59, 168, 432, 126, 18, 1057, 528, 529, 1091, 582, 32, 1056, 1071,
        652, 31, 651, 669, 194, 195, 30, 336, 625, 943, 29, 151, 14, 6, 424, 425, 426, 1361, 893,
        427, 75, 60, 113, 12, 13, 479, 497, 218, 220, 221, 222, 662, 663, 699, 761, 235, 236, 701,
        696, 697, 698, 381, 157, 230, 158, 159, 738, 920, 921, 922, 258, 259, 260, 238, 237, 118,
        119, 120, 155, 156, 21, 110, 1089, 1090, 1138, 1082, 1083, 1084, 1085, 1086, 1087, 1088,
        111, 77, 210, 775, 58, 354, 355, 193, 192, 641, 442, 480, 481, 513, 494, 483, 515, 484, 485,
        638, 639, 851, 797, 1380, 1028, 1029, 1030, 1031, 1032, 1188, 1189, 1190, 811, 0});
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

  public static Function<garden_leave.gateway.transform.fix50sp2.ExecutionReport,
      garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.getDefaultInstance();
    }

    final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.Builder builder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.newBuilder();
    final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.FieldPresence.newBuilder();

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
      if (fix.hasOrderId()) {
        builder.setOrderId(fix.getOrderId());
        presenceBuilder.setOrderId(true);
      }
      if (fix.hasSecondaryOrderId()) {
        builder.setSecondaryOrderId(fix.getSecondaryOrderId());
        presenceBuilder.setSecondaryOrderId(true);
      }
      if (fix.hasSecondaryClOrdId()) {
        builder.setSecondaryClOrdId(fix.getSecondaryClOrdId());
        presenceBuilder.setSecondaryClOrdId(true);
      }
      if (fix.hasSecondaryExecId()) {
        builder.setSecondaryExecId(fix.getSecondaryExecId());
        presenceBuilder.setSecondaryExecId(true);
      }
      if (fix.hasClOrdId()) {
        builder.setClOrdId(fix.getClOrdId());
        presenceBuilder.setClOrdId(true);
      }
      if (fix.hasOrigClOrdId()) {
        builder.setOrigClOrdId(fix.getOrigClOrdId());
        presenceBuilder.setOrigClOrdId(true);
      }
      if (fix.hasClOrdLinkId()) {
        builder.setClOrdLinkId(fix.getClOrdLinkId());
        presenceBuilder.setClOrdLinkId(true);
      }
      if (fix.hasQuoteRespId()) {
        builder.setQuoteRespId(fix.getQuoteRespId());
        presenceBuilder.setQuoteRespId(true);
      }
      if (fix.hasOrdStatusReqId()) {
        builder.setOrdStatusReqId(fix.getOrdStatusReqId());
        presenceBuilder.setOrdStatusReqId(true);
      }
      if (fix.hasMassStatusReqId()) {
        builder.setMassStatusReqId(fix.getMassStatusReqId());
        presenceBuilder.setMassStatusReqId(true);
      }
      if (fix.hasHostCrossId()) {
        builder.setHostCrossId(fix.getHostCrossId());
        presenceBuilder.setHostCrossId(true);
      }
      if (fix.hasTotNumReports()) {
        builder.setTotNumReports(fix.getTotNumReports());
        presenceBuilder.setTotNumReports(true);
      }
      if (fix.hasLastRptRequested()) {
        builder.setLastRptRequested(fix.getLastRptRequested());
        presenceBuilder.setLastRptRequested(true);
      }
      if (fix.hasTradeOriginationDate()) {
        builder.setTradeOriginationDate(fix.getTradeOriginationDate());
        presenceBuilder.setTradeOriginationDate(true);
      }
      if (fix.hasListId()) {
        builder.setListId(fix.getListId());
        presenceBuilder.setListId(true);
      }
      if (fix.hasCrossId()) {
        builder.setCrossId(fix.getCrossId());
        presenceBuilder.setCrossId(true);
      }
      if (fix.hasOrigCrossId()) {
        builder.setOrigCrossId(fix.getOrigCrossId());
        presenceBuilder.setOrigCrossId(true);
      }
      if (fix.hasCrossType()) {
        builder.setCrossType(fix.getCrossType());
        presenceBuilder.setCrossType(true);
      }
      if (fix.hasTrdMatchId()) {
        builder.setTrdMatchId(fix.getTrdMatchId());
        presenceBuilder.setTrdMatchId(true);
      }
      if (fix.hasExecId()) {
        builder.setExecId(fix.getExecId());
        presenceBuilder.setExecId(true);
      }
      if (fix.hasExecRefId()) {
        builder.setExecRefId(fix.getExecRefId());
        presenceBuilder.setExecRefId(true);
      }
      if (fix.hasExecType()) {
        builder.setExecType(fix.getExecType());
        presenceBuilder.setExecType(true);
      }
      if (fix.hasOrdStatus()) {
        builder.setOrdStatus(fix.getOrdStatus());
        presenceBuilder.setOrdStatus(true);
      }
      if (fix.hasWorkingIndicator()) {
        builder.setWorkingIndicator(fix.getWorkingIndicator());
        presenceBuilder.setWorkingIndicator(true);
      }
      if (fix.hasOrdRejReason()) {
        builder.setOrdRejReason(fix.getOrdRejReason());
        presenceBuilder.setOrdRejReason(true);
      }
      if (fix.hasExecRestatementReason()) {
        builder.setExecRestatementReason(fix.getExecRestatementReason());
        presenceBuilder.setExecRestatementReason(true);
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
      if (fix.hasDayBookingInst()) {
        builder.setDayBookingInst(fix.getDayBookingInst());
        presenceBuilder.setDayBookingInst(true);
      }
      if (fix.hasBookingUnit()) {
        builder.setBookingUnit(fix.getBookingUnit());
        presenceBuilder.setBookingUnit(true);
      }
      if (fix.hasPreallocMethod()) {
        builder.setPreallocMethod(fix.getPreallocMethod());
        presenceBuilder.setPreallocMethod(true);
      }
      if (fix.hasAllocId()) {
        builder.setAllocId(fix.getAllocId());
        presenceBuilder.setAllocId(true);
      }
      if (fix.hasSettlType()) {
        builder.setSettlType(fix.getSettlType());
        presenceBuilder.setSettlType(true);
      }
      if (fix.hasSettlDate()) {
        builder.setSettlDate(fix.getSettlDate());
        presenceBuilder.setSettlDate(true);
      }
      if (fix.hasMatchType()) {
        builder.setMatchType(fix.getMatchType());
        presenceBuilder.setMatchType(true);
      }
      if (fix.hasOrderCategory()) {
        builder.setOrderCategory(fix.getOrderCategory());
        presenceBuilder.setOrderCategory(true);
      }
      if (fix.hasCashMargin()) {
        builder.setCashMargin(fix.getCashMargin());
        presenceBuilder.setCashMargin(true);
      }
      if (fix.hasClearingFeeIndicator()) {
        builder.setClearingFeeIndicator(fix.getClearingFeeIndicator());
        presenceBuilder.setClearingFeeIndicator(true);
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
      if (fix.hasQtyType()) {
        builder.setQtyType(fix.getQtyType());
        presenceBuilder.setQtyType(true);
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
      if (fix.hasLotType()) {
        builder.setLotType(fix.getLotType());
        presenceBuilder.setLotType(true);
      }
      if (fix.hasOrdType()) {
        builder.setOrdType(fix.getOrdType());
        presenceBuilder.setOrdType(true);
      }
      if (fix.hasPriceType()) {
        builder.setPriceType(fix.getPriceType());
        presenceBuilder.setPriceType(true);
      }
      if (fix.hasPrice()) {
        builder.setPrice(fix.getPrice());
        presenceBuilder.setPrice(true);
      }
      if (fix.hasPriceProtectionScope()) {
        builder.setPriceProtectionScope(fix.getPriceProtectionScope());
        presenceBuilder.setPriceProtectionScope(true);
      }
      if (fix.hasStopPx()) {
        builder.setStopPx(fix.getStopPx());
        presenceBuilder.setStopPx(true);
      }
      if (fix.hasTriggerType()) {
        builder.setTriggerType(fix.getTriggerType());
        presenceBuilder.setTriggerType(true);
      }
      if (fix.hasTriggerAction()) {
        builder.setTriggerAction(fix.getTriggerAction());
        presenceBuilder.setTriggerAction(true);
      }
      if (fix.hasTriggerPrice()) {
        builder.setTriggerPrice(fix.getTriggerPrice());
        presenceBuilder.setTriggerPrice(true);
      }
      if (fix.hasTriggerSymbol()) {
        builder.setTriggerSymbol(fix.getTriggerSymbol());
        presenceBuilder.setTriggerSymbol(true);
      }
      if (fix.hasTriggerSecurityId()) {
        builder.setTriggerSecurityId(fix.getTriggerSecurityId());
        presenceBuilder.setTriggerSecurityId(true);
      }
      if (fix.hasTriggerSecurityIdSource()) {
        builder.setTriggerSecurityIdSource(fix.getTriggerSecurityIdSource());
        presenceBuilder.setTriggerSecurityIdSource(true);
      }
      if (fix.hasTriggerSecurityDesc()) {
        builder.setTriggerSecurityDesc(fix.getTriggerSecurityDesc());
        presenceBuilder.setTriggerSecurityDesc(true);
      }
      if (fix.hasTriggerPriceType()) {
        builder.setTriggerPriceType(fix.getTriggerPriceType());
        presenceBuilder.setTriggerPriceType(true);
      }
      if (fix.hasTriggerPriceTypeScope()) {
        builder.setTriggerPriceTypeScope(fix.getTriggerPriceTypeScope());
        presenceBuilder.setTriggerPriceTypeScope(true);
      }
      if (fix.hasTriggerPriceDirection()) {
        builder.setTriggerPriceDirection(fix.getTriggerPriceDirection());
        presenceBuilder.setTriggerPriceDirection(true);
      }
      if (fix.hasTriggerNewPrice()) {
        builder.setTriggerNewPrice(fix.getTriggerNewPrice());
        presenceBuilder.setTriggerNewPrice(true);
      }
      if (fix.hasTriggerOrderType()) {
        builder.setTriggerOrderType(fix.getTriggerOrderType());
        presenceBuilder.setTriggerOrderType(true);
      }
      if (fix.hasTriggerNewQty()) {
        builder.setTriggerNewQty(fix.getTriggerNewQty());
        presenceBuilder.setTriggerNewQty(true);
      }
      if (fix.hasTriggerTradingSessionId()) {
        builder.setTriggerTradingSessionId(fix.getTriggerTradingSessionId());
        presenceBuilder.setTriggerTradingSessionId(true);
      }
      if (fix.hasTriggerTradingSessionSubId()) {
        builder.setTriggerTradingSessionSubId(fix.getTriggerTradingSessionSubId());
        presenceBuilder.setTriggerTradingSessionSubId(true);
      }
      if (fix.hasPegOffsetValue()) {
        builder.setPegOffsetValue(fix.getPegOffsetValue());
        presenceBuilder.setPegOffsetValue(true);
      }
      if (fix.hasPegPriceType()) {
        builder.setPegPriceType(fix.getPegPriceType());
        presenceBuilder.setPegPriceType(true);
      }
      if (fix.hasPegMoveType()) {
        builder.setPegMoveType(fix.getPegMoveType());
        presenceBuilder.setPegMoveType(true);
      }
      if (fix.hasPegOffsetType()) {
        builder.setPegOffsetType(fix.getPegOffsetType());
        presenceBuilder.setPegOffsetType(true);
      }
      if (fix.hasPegLimitType()) {
        builder.setPegLimitType(fix.getPegLimitType());
        presenceBuilder.setPegLimitType(true);
      }
      if (fix.hasPegRoundDirection()) {
        builder.setPegRoundDirection(fix.getPegRoundDirection());
        presenceBuilder.setPegRoundDirection(true);
      }
      if (fix.hasPegScope()) {
        builder.setPegScope(fix.getPegScope());
        presenceBuilder.setPegScope(true);
      }
      if (fix.hasPegSecurityIdSource()) {
        builder.setPegSecurityIdSource(fix.getPegSecurityIdSource());
        presenceBuilder.setPegSecurityIdSource(true);
      }
      if (fix.hasPegSecurityId()) {
        builder.setPegSecurityId(fix.getPegSecurityId());
        presenceBuilder.setPegSecurityId(true);
      }
      if (fix.hasPegSymbol()) {
        builder.setPegSymbol(fix.getPegSymbol());
        presenceBuilder.setPegSymbol(true);
      }
      if (fix.hasPegSecurityDesc()) {
        builder.setPegSecurityDesc(fix.getPegSecurityDesc());
        presenceBuilder.setPegSecurityDesc(true);
      }
      if (fix.hasDiscretionInst()) {
        builder.setDiscretionInst(fix.getDiscretionInst());
        presenceBuilder.setDiscretionInst(true);
      }
      if (fix.hasDiscretionOffsetValue()) {
        builder.setDiscretionOffsetValue(fix.getDiscretionOffsetValue());
        presenceBuilder.setDiscretionOffsetValue(true);
      }
      if (fix.hasDiscretionMoveType()) {
        builder.setDiscretionMoveType(fix.getDiscretionMoveType());
        presenceBuilder.setDiscretionMoveType(true);
      }
      if (fix.hasDiscretionOffsetType()) {
        builder.setDiscretionOffsetType(fix.getDiscretionOffsetType());
        presenceBuilder.setDiscretionOffsetType(true);
      }
      if (fix.hasDiscretionLimitType()) {
        builder.setDiscretionLimitType(fix.getDiscretionLimitType());
        presenceBuilder.setDiscretionLimitType(true);
      }
      if (fix.hasDiscretionRoundDirection()) {
        builder.setDiscretionRoundDirection(fix.getDiscretionRoundDirection());
        presenceBuilder.setDiscretionRoundDirection(true);
      }
      if (fix.hasDiscretionScope()) {
        builder.setDiscretionScope(fix.getDiscretionScope());
        presenceBuilder.setDiscretionScope(true);
      }
      if (fix.hasPeggedPrice()) {
        builder.setPeggedPrice(fix.getPeggedPrice());
        presenceBuilder.setPeggedPrice(true);
      }
      if (fix.hasPeggedRefPrice()) {
        builder.setPeggedRefPrice(fix.getPeggedRefPrice());
        presenceBuilder.setPeggedRefPrice(true);
      }
      if (fix.hasDiscretionPrice()) {
        builder.setDiscretionPrice(fix.getDiscretionPrice());
        presenceBuilder.setDiscretionPrice(true);
      }
      if (fix.hasTargetStrategy()) {
        builder.setTargetStrategy(fix.getTargetStrategy());
        presenceBuilder.setTargetStrategy(true);
      }
      if (fix.hasTargetStrategyParameters()) {
        builder.setTargetStrategyParameters(fix.getTargetStrategyParameters());
        presenceBuilder.setTargetStrategyParameters(true);
      }
      if (fix.hasParticipationRate()) {
        builder.setParticipationRate(fix.getParticipationRate());
        presenceBuilder.setParticipationRate(true);
      }
      if (fix.hasTargetStrategyPerformance()) {
        builder.setTargetStrategyPerformance(fix.getTargetStrategyPerformance());
        presenceBuilder.setTargetStrategyPerformance(true);
      }
      if (fix.hasCurrency()) {
        builder.setCurrency(fix.getCurrency());
        presenceBuilder.setCurrency(true);
      }
      if (fix.hasComplianceId()) {
        builder.setComplianceId(fix.getComplianceId());
        presenceBuilder.setComplianceId(true);
      }
      if (fix.hasSolicitedFlag()) {
        builder.setSolicitedFlag(fix.getSolicitedFlag());
        presenceBuilder.setSolicitedFlag(true);
      }
      if (fix.hasTimeInForce()) {
        builder.setTimeInForce(fix.getTimeInForce());
        presenceBuilder.setTimeInForce(true);
      }
      if (fix.hasEffectiveTime()) {
        builder.setEffectiveTime(fix.getEffectiveTime());
        presenceBuilder.setEffectiveTime(true);
      }
      if (fix.hasExpireDate()) {
        builder.setExpireDate(fix.getExpireDate());
        presenceBuilder.setExpireDate(true);
      }
      if (fix.hasExpireTime()) {
        builder.setExpireTime(fix.getExpireTime());
        presenceBuilder.setExpireTime(true);
      }
      if (fix.hasExecInst()) {
        builder.setExecInst(fix.getExecInst());
        presenceBuilder.setExecInst(true);
      }
      if (fix.hasAggressorIndicator()) {
        builder.setAggressorIndicator(fix.getAggressorIndicator());
        presenceBuilder.setAggressorIndicator(true);
      }
      if (fix.hasOrderCapacity()) {
        builder.setOrderCapacity(fix.getOrderCapacity());
        presenceBuilder.setOrderCapacity(true);
      }
      if (fix.hasOrderRestrictions()) {
        builder.setOrderRestrictions(fix.getOrderRestrictions());
        presenceBuilder.setOrderRestrictions(true);
      }
      if (fix.hasPreTradeAnonymity()) {
        builder.setPreTradeAnonymity(fix.getPreTradeAnonymity());
        presenceBuilder.setPreTradeAnonymity(true);
      }
      if (fix.hasCustOrderCapacity()) {
        builder.setCustOrderCapacity(fix.getCustOrderCapacity());
        presenceBuilder.setCustOrderCapacity(true);
      }
      if (fix.hasLastQty()) {
        builder.setLastQty(fix.getLastQty());
        presenceBuilder.setLastQty(true);
      }
      if (fix.hasCalculatedCcyLastQty()) {
        builder.setCalculatedCcyLastQty(fix.getCalculatedCcyLastQty());
        presenceBuilder.setCalculatedCcyLastQty(true);
      }
      if (fix.hasLastSwapPoints()) {
        builder.setLastSwapPoints(fix.getLastSwapPoints());
        presenceBuilder.setLastSwapPoints(true);
      }
      if (fix.hasUnderlyingLastQty()) {
        builder.setUnderlyingLastQty(fix.getUnderlyingLastQty());
        presenceBuilder.setUnderlyingLastQty(true);
      }
      if (fix.hasLastPx()) {
        builder.setLastPx(fix.getLastPx());
        presenceBuilder.setLastPx(true);
      }
      if (fix.hasUnderlyingLastPx()) {
        builder.setUnderlyingLastPx(fix.getUnderlyingLastPx());
        presenceBuilder.setUnderlyingLastPx(true);
      }
      if (fix.hasLastParPx()) {
        builder.setLastParPx(fix.getLastParPx());
        presenceBuilder.setLastParPx(true);
      }
      if (fix.hasLastSpotRate()) {
        builder.setLastSpotRate(fix.getLastSpotRate());
        presenceBuilder.setLastSpotRate(true);
      }
      if (fix.hasLastForwardPoints()) {
        builder.setLastForwardPoints(fix.getLastForwardPoints());
        presenceBuilder.setLastForwardPoints(true);
      }
      if (fix.hasLastMkt()) {
        builder.setLastMkt(fix.getLastMkt());
        presenceBuilder.setLastMkt(true);
      }
      if (fix.hasTradingSessionId()) {
        builder.setTradingSessionId(fix.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (fix.hasTradingSessionSubId()) {
        builder.setTradingSessionSubId(fix.getTradingSessionSubId());
        presenceBuilder.setTradingSessionSubId(true);
      }
      if (fix.hasTimeBracket()) {
        builder.setTimeBracket(fix.getTimeBracket());
        presenceBuilder.setTimeBracket(true);
      }
      if (fix.hasLastCapacity()) {
        builder.setLastCapacity(fix.getLastCapacity());
        presenceBuilder.setLastCapacity(true);
      }
      if (fix.hasLeavesQty()) {
        builder.setLeavesQty(fix.getLeavesQty());
        presenceBuilder.setLeavesQty(true);
      }
      if (fix.hasCumQty()) {
        builder.setCumQty(fix.getCumQty());
        presenceBuilder.setCumQty(true);
      }
      if (fix.hasAvgPx()) {
        builder.setAvgPx(fix.getAvgPx());
        presenceBuilder.setAvgPx(true);
      }
      if (fix.hasDayOrderQty()) {
        builder.setDayOrderQty(fix.getDayOrderQty());
        presenceBuilder.setDayOrderQty(true);
      }
      if (fix.hasDayCumQty()) {
        builder.setDayCumQty(fix.getDayCumQty());
        presenceBuilder.setDayCumQty(true);
      }
      if (fix.hasDayAvgPx()) {
        builder.setDayAvgPx(fix.getDayAvgPx());
        presenceBuilder.setDayAvgPx(true);
      }
      if (fix.hasTotNoFills()) {
        builder.setTotNoFills(fix.getTotNoFills());
        presenceBuilder.setTotNoFills(true);
      }
      if (fix.hasLastFragment()) {
        builder.setLastFragment(fix.getLastFragment());
        presenceBuilder.setLastFragment(true);
      }
      if (fix.hasGtBookingInst()) {
        builder.setGtBookingInst(fix.getGtBookingInst());
        presenceBuilder.setGtBookingInst(true);
      }
      if (fix.hasTradeDate()) {
        builder.setTradeDate(fix.getTradeDate());
        presenceBuilder.setTradeDate(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
      }
      if (fix.hasReportToExch()) {
        builder.setReportToExch(fix.getReportToExch());
        presenceBuilder.setReportToExch(true);
      }
      if (fix.hasCommission()) {
        builder.setCommission(fix.getCommission());
        presenceBuilder.setCommission(true);
      }
      if (fix.hasCommType()) {
        builder.setCommType(fix.getCommType());
        presenceBuilder.setCommType(true);
      }
      if (fix.hasCommCurrency()) {
        builder.setCommCurrency(fix.getCommCurrency());
        presenceBuilder.setCommCurrency(true);
      }
      if (fix.hasFundRenewWaiv()) {
        builder.setFundRenewWaiv(fix.getFundRenewWaiv());
        presenceBuilder.setFundRenewWaiv(true);
      }
      if (fix.hasSpread()) {
        builder.setSpread(fix.getSpread());
        presenceBuilder.setSpread(true);
      }
      if (fix.hasBenchmarkCurveCurrency()) {
        builder.setBenchmarkCurveCurrency(fix.getBenchmarkCurveCurrency());
        presenceBuilder.setBenchmarkCurveCurrency(true);
      }
      if (fix.hasBenchmarkCurveName()) {
        builder.setBenchmarkCurveName(fix.getBenchmarkCurveName());
        presenceBuilder.setBenchmarkCurveName(true);
      }
      if (fix.hasBenchmarkCurvePoint()) {
        builder.setBenchmarkCurvePoint(fix.getBenchmarkCurvePoint());
        presenceBuilder.setBenchmarkCurvePoint(true);
      }
      if (fix.hasBenchmarkPrice()) {
        builder.setBenchmarkPrice(fix.getBenchmarkPrice());
        presenceBuilder.setBenchmarkPrice(true);
      }
      if (fix.hasBenchmarkPriceType()) {
        builder.setBenchmarkPriceType(fix.getBenchmarkPriceType());
        presenceBuilder.setBenchmarkPriceType(true);
      }
      if (fix.hasBenchmarkSecurityId()) {
        builder.setBenchmarkSecurityId(fix.getBenchmarkSecurityId());
        presenceBuilder.setBenchmarkSecurityId(true);
      }
      if (fix.hasBenchmarkSecurityIdSource()) {
        builder.setBenchmarkSecurityIdSource(fix.getBenchmarkSecurityIdSource());
        presenceBuilder.setBenchmarkSecurityIdSource(true);
      }
      if (fix.hasYieldType()) {
        builder.setYieldType(fix.getYieldType());
        presenceBuilder.setYieldType(true);
      }
      if (fix.hasYield()) {
        builder.setYield(fix.getYield());
        presenceBuilder.setYield(true);
      }
      if (fix.hasYieldCalcDate()) {
        builder.setYieldCalcDate(fix.getYieldCalcDate());
        presenceBuilder.setYieldCalcDate(true);
      }
      if (fix.hasYieldRedemptionDate()) {
        builder.setYieldRedemptionDate(fix.getYieldRedemptionDate());
        presenceBuilder.setYieldRedemptionDate(true);
      }
      if (fix.hasYieldRedemptionPrice()) {
        builder.setYieldRedemptionPrice(fix.getYieldRedemptionPrice());
        presenceBuilder.setYieldRedemptionPrice(true);
      }
      if (fix.hasYieldRedemptionPriceType()) {
        builder.setYieldRedemptionPriceType(fix.getYieldRedemptionPriceType());
        presenceBuilder.setYieldRedemptionPriceType(true);
      }
      if (fix.hasGrossTradeAmt()) {
        builder.setGrossTradeAmt(fix.getGrossTradeAmt());
        presenceBuilder.setGrossTradeAmt(true);
      }
      if (fix.hasNumDaysInterest()) {
        builder.setNumDaysInterest(fix.getNumDaysInterest());
        presenceBuilder.setNumDaysInterest(true);
      }
      if (fix.hasExDate()) {
        builder.setExDate(fix.getExDate());
        presenceBuilder.setExDate(true);
      }
      if (fix.hasAccruedInterestRate()) {
        builder.setAccruedInterestRate(fix.getAccruedInterestRate());
        presenceBuilder.setAccruedInterestRate(true);
      }
      if (fix.hasAccruedInterestAmt()) {
        builder.setAccruedInterestAmt(fix.getAccruedInterestAmt());
        presenceBuilder.setAccruedInterestAmt(true);
      }
      if (fix.hasInterestAtMaturity()) {
        builder.setInterestAtMaturity(fix.getInterestAtMaturity());
        presenceBuilder.setInterestAtMaturity(true);
      }
      if (fix.hasEndAccruedInterestAmt()) {
        builder.setEndAccruedInterestAmt(fix.getEndAccruedInterestAmt());
        presenceBuilder.setEndAccruedInterestAmt(true);
      }
      if (fix.hasStartCash()) {
        builder.setStartCash(fix.getStartCash());
        presenceBuilder.setStartCash(true);
      }
      if (fix.hasEndCash()) {
        builder.setEndCash(fix.getEndCash());
        presenceBuilder.setEndCash(true);
      }
      if (fix.hasTradedFlatSwitch()) {
        builder.setTradedFlatSwitch(fix.getTradedFlatSwitch());
        presenceBuilder.setTradedFlatSwitch(true);
      }
      if (fix.hasBasisFeatureDate()) {
        builder.setBasisFeatureDate(fix.getBasisFeatureDate());
        presenceBuilder.setBasisFeatureDate(true);
      }
      if (fix.hasBasisFeaturePrice()) {
        builder.setBasisFeaturePrice(fix.getBasisFeaturePrice());
        presenceBuilder.setBasisFeaturePrice(true);
      }
      if (fix.hasConcession()) {
        builder.setConcession(fix.getConcession());
        presenceBuilder.setConcession(true);
      }
      if (fix.hasTotalTakedown()) {
        builder.setTotalTakedown(fix.getTotalTakedown());
        presenceBuilder.setTotalTakedown(true);
      }
      if (fix.hasNetMoney()) {
        builder.setNetMoney(fix.getNetMoney());
        presenceBuilder.setNetMoney(true);
      }
      if (fix.hasSettlCurrAmt()) {
        builder.setSettlCurrAmt(fix.getSettlCurrAmt());
        presenceBuilder.setSettlCurrAmt(true);
      }
      if (fix.hasSettlCurrency()) {
        builder.setSettlCurrency(fix.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
      }
      if (fix.hasSettlCurrFxRate()) {
        builder.setSettlCurrFxRate(fix.getSettlCurrFxRate());
        presenceBuilder.setSettlCurrFxRate(true);
      }
      if (fix.hasSettlCurrFxRateCalc()) {
        builder.setSettlCurrFxRateCalc(fix.getSettlCurrFxRateCalc());
        presenceBuilder.setSettlCurrFxRateCalc(true);
      }
      if (fix.hasHandlInst()) {
        builder.setHandlInst(fix.getHandlInst());
        presenceBuilder.setHandlInst(true);
      }
      if (fix.hasMinQty()) {
        builder.setMinQty(fix.getMinQty());
        presenceBuilder.setMinQty(true);
      }
      if (fix.hasMatchIncrement()) {
        builder.setMatchIncrement(fix.getMatchIncrement());
        presenceBuilder.setMatchIncrement(true);
      }
      if (fix.hasMaxPriceLevels()) {
        builder.setMaxPriceLevels(fix.getMaxPriceLevels());
        presenceBuilder.setMaxPriceLevels(true);
      }
      if (fix.hasDisplayQty()) {
        builder.setDisplayQty(fix.getDisplayQty());
        presenceBuilder.setDisplayQty(true);
      }
      if (fix.hasSecondaryDisplayQty()) {
        builder.setSecondaryDisplayQty(fix.getSecondaryDisplayQty());
        presenceBuilder.setSecondaryDisplayQty(true);
      }
      if (fix.hasDisplayWhen()) {
        builder.setDisplayWhen(fix.getDisplayWhen());
        presenceBuilder.setDisplayWhen(true);
      }
      if (fix.hasDisplayMethod()) {
        builder.setDisplayMethod(fix.getDisplayMethod());
        presenceBuilder.setDisplayMethod(true);
      }
      if (fix.hasDisplayLowQty()) {
        builder.setDisplayLowQty(fix.getDisplayLowQty());
        presenceBuilder.setDisplayLowQty(true);
      }
      if (fix.hasDisplayHighQty()) {
        builder.setDisplayHighQty(fix.getDisplayHighQty());
        presenceBuilder.setDisplayHighQty(true);
      }
      if (fix.hasDisplayMinIncr()) {
        builder.setDisplayMinIncr(fix.getDisplayMinIncr());
        presenceBuilder.setDisplayMinIncr(true);
      }
      if (fix.hasRefreshQty()) {
        builder.setRefreshQty(fix.getRefreshQty());
        presenceBuilder.setRefreshQty(true);
      }
      if (fix.hasMaxFloor()) {
        builder.setMaxFloor(fix.getMaxFloor());
        presenceBuilder.setMaxFloor(true);
      }
      if (fix.hasPositionEffect()) {
        builder.setPositionEffect(fix.getPositionEffect());
        presenceBuilder.setPositionEffect(true);
      }
      if (fix.hasMaxShow()) {
        builder.setMaxShow(fix.getMaxShow());
        presenceBuilder.setMaxShow(true);
      }
      if (fix.hasBookingType()) {
        builder.setBookingType(fix.getBookingType());
        presenceBuilder.setBookingType(true);
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
      if (fix.hasSettlDate2()) {
        builder.setSettlDate2(fix.getSettlDate2());
        presenceBuilder.setSettlDate2(true);
      }
      if (fix.hasOrderQty2()) {
        builder.setOrderQty2(fix.getOrderQty2());
        presenceBuilder.setOrderQty2(true);
      }
      if (fix.hasLastForwardPoints2()) {
        builder.setLastForwardPoints2(fix.getLastForwardPoints2());
        presenceBuilder.setLastForwardPoints2(true);
      }
      if (fix.hasMultiLegReportingType()) {
        builder.setMultiLegReportingType(fix.getMultiLegReportingType());
        presenceBuilder.setMultiLegReportingType(true);
      }
      if (fix.hasCancellationRights()) {
        builder.setCancellationRights(fix.getCancellationRights());
        presenceBuilder.setCancellationRights(true);
      }
      if (fix.hasMoneyLaunderingStatus()) {
        builder.setMoneyLaunderingStatus(fix.getMoneyLaunderingStatus());
        presenceBuilder.setMoneyLaunderingStatus(true);
      }
      if (fix.hasRegistId()) {
        builder.setRegistId(fix.getRegistId());
        presenceBuilder.setRegistId(true);
      }
      if (fix.hasDesignation()) {
        builder.setDesignation(fix.getDesignation());
        presenceBuilder.setDesignation(true);
      }
      if (fix.hasTransBkdTime()) {
        builder.setTransBkdTime(fix.getTransBkdTime());
        presenceBuilder.setTransBkdTime(true);
      }
      if (fix.hasExecValuationPoint()) {
        builder.setExecValuationPoint(fix.getExecValuationPoint());
        presenceBuilder.setExecValuationPoint(true);
      }
      if (fix.hasExecPriceType()) {
        builder.setExecPriceType(fix.getExecPriceType());
        presenceBuilder.setExecPriceType(true);
      }
      if (fix.hasExecPriceAdjustment()) {
        builder.setExecPriceAdjustment(fix.getExecPriceAdjustment());
        presenceBuilder.setExecPriceAdjustment(true);
      }
      if (fix.hasPriorityIndicator()) {
        builder.setPriorityIndicator(fix.getPriorityIndicator());
        presenceBuilder.setPriorityIndicator(true);
      }
      if (fix.hasPriceImprovement()) {
        builder.setPriceImprovement(fix.getPriceImprovement());
        presenceBuilder.setPriceImprovement(true);
      }
      if (fix.hasLastLiquidityInd()) {
        builder.setLastLiquidityInd(fix.getLastLiquidityInd());
        presenceBuilder.setLastLiquidityInd(true);
      }
      if (fix.hasCopyMsgIndicator()) {
        builder.setCopyMsgIndicator(fix.getCopyMsgIndicator());
        presenceBuilder.setCopyMsgIndicator(true);
      }
      if (fix.hasDividendYield()) {
        builder.setDividendYield(fix.getDividendYield());
        presenceBuilder.setDividendYield(true);
      }
      if (fix.hasManualOrderIndicator()) {
        builder.setManualOrderIndicator(fix.getManualOrderIndicator());
        presenceBuilder.setManualOrderIndicator(true);
      }
      if (fix.hasCustDirectedOrder()) {
        builder.setCustDirectedOrder(fix.getCustDirectedOrder());
        presenceBuilder.setCustDirectedOrder(true);
      }
      if (fix.hasReceivedDeptId()) {
        builder.setReceivedDeptId(fix.getReceivedDeptId());
        presenceBuilder.setReceivedDeptId(true);
      }
      if (fix.hasCustOrderHandlingInst()) {
        builder.setCustOrderHandlingInst(fix.getCustOrderHandlingInst());
        presenceBuilder.setCustOrderHandlingInst(true);
      }
      if (fix.hasOrderHandlingInstSource()) {
        builder.setOrderHandlingInstSource(fix.getOrderHandlingInstSource());
        presenceBuilder.setOrderHandlingInstSource(true);
      }
      if (fix.hasVolatility()) {
        builder.setVolatility(fix.getVolatility());
        presenceBuilder.setVolatility(true);
      }
      if (fix.hasTimeToExpiration()) {
        builder.setTimeToExpiration(fix.getTimeToExpiration());
        presenceBuilder.setTimeToExpiration(true);
      }
      if (fix.hasRiskFreeRate()) {
        builder.setRiskFreeRate(fix.getRiskFreeRate());
        presenceBuilder.setRiskFreeRate(true);
      }
      if (fix.hasPriceDelta()) {
        builder.setPriceDelta(fix.getPriceDelta());
        presenceBuilder.setPriceDelta(true);
      }
      final int noPartyIdsGroupCount = fix.getGroupCount(453);
      for (int i = 1; i <= noPartyIdsGroupCount; i++) {
        final ExecutionReport.NoPartyIds group = new ExecutionReport.NoPartyIds();
        fix.getGroup(i, group);
        builder.addNoPartyIds(group.toBuilder().build());
      }

      final int noContraBrokersGroupCount = fix.getGroupCount(382);
      for (int i = 1; i <= noContraBrokersGroupCount; i++) {
        final ExecutionReport.NoContraBrokers group = new ExecutionReport.NoContraBrokers();
        fix.getGroup(i, group);
        builder.addNoContraBrokers(group.toBuilder().build());
      }

      final int noAllocsGroupCount = fix.getGroupCount(78);
      for (int i = 1; i <= noAllocsGroupCount; i++) {
        final ExecutionReport.NoAllocs group = new ExecutionReport.NoAllocs();
        fix.getGroup(i, group);
        builder.addNoAllocs(group.toBuilder().build());
      }

      final int noSecurityAltIdGroupCount = fix.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final ExecutionReport.NoSecurityAltId group = new ExecutionReport.NoSecurityAltId();
        fix.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = fix.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final ExecutionReport.NoEvents group = new ExecutionReport.NoEvents();
        fix.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noInstrumentPartiesGroupCount = fix.getGroupCount(1018);
      for (int i = 1; i <= noInstrumentPartiesGroupCount; i++) {
        final ExecutionReport.NoInstrumentParties group = new ExecutionReport.NoInstrumentParties();
        fix.getGroup(i, group);
        builder.addNoInstrumentParties(group.toBuilder().build());
      }

      final int noComplexEventsGroupCount = fix.getGroupCount(1483);
      for (int i = 1; i <= noComplexEventsGroupCount; i++) {
        final ExecutionReport.NoComplexEvents group = new ExecutionReport.NoComplexEvents();
        fix.getGroup(i, group);
        builder.addNoComplexEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = fix.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final ExecutionReport.NoUnderlyings group = new ExecutionReport.NoUnderlyings();
        fix.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noStipulationsGroupCount = fix.getGroupCount(232);
      for (int i = 1; i <= noStipulationsGroupCount; i++) {
        final ExecutionReport.NoStipulations group = new ExecutionReport.NoStipulations();
        fix.getGroup(i, group);
        builder.addNoStipulations(group.toBuilder().build());
      }

      final int noStrategyParametersGroupCount = fix.getGroupCount(957);
      for (int i = 1; i <= noStrategyParametersGroupCount; i++) {
        final ExecutionReport.NoStrategyParameters group =
            new ExecutionReport.NoStrategyParameters();
        fix.getGroup(i, group);
        builder.addNoStrategyParameters(group.toBuilder().build());
      }

      final int noFillsGroupCount = fix.getGroupCount(1362);
      for (int i = 1; i <= noFillsGroupCount; i++) {
        final ExecutionReport.NoFills group = new ExecutionReport.NoFills();
        fix.getGroup(i, group);
        builder.addNoFills(group.toBuilder().build());
      }

      final int noRateSourcesGroupCount = fix.getGroupCount(1445);
      for (int i = 1; i <= noRateSourcesGroupCount; i++) {
        final ExecutionReport.NoRateSources group = new ExecutionReport.NoRateSources();
        fix.getGroup(i, group);
        builder.addNoRateSources(group.toBuilder().build());
      }

      final int noContAmtsGroupCount = fix.getGroupCount(518);
      for (int i = 1; i <= noContAmtsGroupCount; i++) {
        final ExecutionReport.NoContAmts group = new ExecutionReport.NoContAmts();
        fix.getGroup(i, group);
        builder.addNoContAmts(group.toBuilder().build());
      }

      final int noLegsGroupCount = fix.getGroupCount(555);
      for (int i = 1; i <= noLegsGroupCount; i++) {
        final ExecutionReport.NoLegs group = new ExecutionReport.NoLegs();
        fix.getGroup(i, group);
        builder.addNoLegs(group.toBuilder().build());
      }

      final int noMiscFeesGroupCount = fix.getGroupCount(136);
      for (int i = 1; i <= noMiscFeesGroupCount; i++) {
        final ExecutionReport.NoMiscFees group = new ExecutionReport.NoMiscFees();
        fix.getGroup(i, group);
        builder.addNoMiscFees(group.toBuilder().build());
      }

      final int noTrdRegTimestampsGroupCount = fix.getGroupCount(768);
      for (int i = 1; i <= noTrdRegTimestampsGroupCount; i++) {
        final ExecutionReport.NoTrdRegTimestamps group = new ExecutionReport.NoTrdRegTimestamps();
        fix.getGroup(i, group);
        builder.addNoTrdRegTimestamps(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("executionReport error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport,
      garden_leave.gateway.transform.fix50sp2.ExecutionReport> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix50sp2.ExecutionReport.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix50sp2.ExecutionReport fix =
          new garden_leave.gateway.transform.fix50sp2.ExecutionReport();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix50sp2.Header header =
          (garden_leave.gateway.transform.fix50sp2.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix50sp2.proto.FIX50SP2Protos.ExecutionReport.FieldPresence fieldPresence =
          proto.getFieldPresence();

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
      if (fieldPresence.getOrderId()) {
        fix.setOrderId(proto.getOrderId());
      }
      if (fieldPresence.getSecondaryOrderId()) {
        fix.setSecondaryOrderId(proto.getSecondaryOrderId());
      }
      if (fieldPresence.getSecondaryClOrdId()) {
        fix.setSecondaryClOrdId(proto.getSecondaryClOrdId());
      }
      if (fieldPresence.getSecondaryExecId()) {
        fix.setSecondaryExecId(proto.getSecondaryExecId());
      }
      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getOrigClOrdId()) {
        fix.setOrigClOrdId(proto.getOrigClOrdId());
      }
      if (fieldPresence.getClOrdLinkId()) {
        fix.setClOrdLinkId(proto.getClOrdLinkId());
      }
      if (fieldPresence.getQuoteRespId()) {
        fix.setQuoteRespId(proto.getQuoteRespId());
      }
      if (fieldPresence.getOrdStatusReqId()) {
        fix.setOrdStatusReqId(proto.getOrdStatusReqId());
      }
      if (fieldPresence.getMassStatusReqId()) {
        fix.setMassStatusReqId(proto.getMassStatusReqId());
      }
      if (fieldPresence.getHostCrossId()) {
        fix.setHostCrossId(proto.getHostCrossId());
      }
      if (fieldPresence.getTotNumReports()) {
        fix.setTotNumReports(proto.getTotNumReports());
      }
      if (fieldPresence.getLastRptRequested()) {
        fix.setLastRptRequested(proto.getLastRptRequested());
      }
      if (fieldPresence.getTradeOriginationDate()) {
        fix.setTradeOriginationDate(proto.getTradeOriginationDate());
      }
      if (fieldPresence.getListId()) {
        fix.setListId(proto.getListId());
      }
      if (fieldPresence.getCrossId()) {
        fix.setCrossId(proto.getCrossId());
      }
      if (fieldPresence.getOrigCrossId()) {
        fix.setOrigCrossId(proto.getOrigCrossId());
      }
      if (fieldPresence.getCrossType()) {
        fix.setCrossType(proto.getCrossType());
      }
      if (fieldPresence.getTrdMatchId()) {
        fix.setTrdMatchId(proto.getTrdMatchId());
      }
      if (fieldPresence.getExecId()) {
        fix.setExecId(proto.getExecId());
      }
      if (fieldPresence.getExecRefId()) {
        fix.setExecRefId(proto.getExecRefId());
      }
      if (fieldPresence.getExecType()) {
        fix.setExecType(proto.getExecType());
      }
      if (fieldPresence.getOrdStatus()) {
        fix.setOrdStatus(proto.getOrdStatus());
      }
      if (fieldPresence.getWorkingIndicator()) {
        fix.setWorkingIndicator(proto.getWorkingIndicator());
      }
      if (fieldPresence.getOrdRejReason()) {
        fix.setOrdRejReason(proto.getOrdRejReason());
      }
      if (fieldPresence.getExecRestatementReason()) {
        fix.setExecRestatementReason(proto.getExecRestatementReason());
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
      if (fieldPresence.getDayBookingInst()) {
        fix.setDayBookingInst(proto.getDayBookingInst());
      }
      if (fieldPresence.getBookingUnit()) {
        fix.setBookingUnit(proto.getBookingUnit());
      }
      if (fieldPresence.getPreallocMethod()) {
        fix.setPreallocMethod(proto.getPreallocMethod());
      }
      if (fieldPresence.getAllocId()) {
        fix.setAllocId(proto.getAllocId());
      }
      if (fieldPresence.getSettlType()) {
        fix.setSettlType(proto.getSettlType());
      }
      if (fieldPresence.getSettlDate()) {
        fix.setSettlDate(proto.getSettlDate());
      }
      if (fieldPresence.getMatchType()) {
        fix.setMatchType(proto.getMatchType());
      }
      if (fieldPresence.getOrderCategory()) {
        fix.setOrderCategory(proto.getOrderCategory());
      }
      if (fieldPresence.getCashMargin()) {
        fix.setCashMargin(proto.getCashMargin());
      }
      if (fieldPresence.getClearingFeeIndicator()) {
        fix.setClearingFeeIndicator(proto.getClearingFeeIndicator());
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
      if (fieldPresence.getQtyType()) {
        fix.setQtyType(proto.getQtyType());
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
      if (fieldPresence.getLotType()) {
        fix.setLotType(proto.getLotType());
      }
      if (fieldPresence.getOrdType()) {
        fix.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getPriceType()) {
        fix.setPriceType(proto.getPriceType());
      }
      if (fieldPresence.getPrice()) {
        fix.setPrice(proto.getPrice());
      }
      if (fieldPresence.getPriceProtectionScope()) {
        fix.setPriceProtectionScope(proto.getPriceProtectionScope());
      }
      if (fieldPresence.getStopPx()) {
        fix.setStopPx(proto.getStopPx());
      }
      if (fieldPresence.getTriggerType()) {
        fix.setTriggerType(proto.getTriggerType());
      }
      if (fieldPresence.getTriggerAction()) {
        fix.setTriggerAction(proto.getTriggerAction());
      }
      if (fieldPresence.getTriggerPrice()) {
        fix.setTriggerPrice(proto.getTriggerPrice());
      }
      if (fieldPresence.getTriggerSymbol()) {
        fix.setTriggerSymbol(proto.getTriggerSymbol());
      }
      if (fieldPresence.getTriggerSecurityId()) {
        fix.setTriggerSecurityId(proto.getTriggerSecurityId());
      }
      if (fieldPresence.getTriggerSecurityIdSource()) {
        fix.setTriggerSecurityIdSource(proto.getTriggerSecurityIdSource());
      }
      if (fieldPresence.getTriggerSecurityDesc()) {
        fix.setTriggerSecurityDesc(proto.getTriggerSecurityDesc());
      }
      if (fieldPresence.getTriggerPriceType()) {
        fix.setTriggerPriceType(proto.getTriggerPriceType());
      }
      if (fieldPresence.getTriggerPriceTypeScope()) {
        fix.setTriggerPriceTypeScope(proto.getTriggerPriceTypeScope());
      }
      if (fieldPresence.getTriggerPriceDirection()) {
        fix.setTriggerPriceDirection(proto.getTriggerPriceDirection());
      }
      if (fieldPresence.getTriggerNewPrice()) {
        fix.setTriggerNewPrice(proto.getTriggerNewPrice());
      }
      if (fieldPresence.getTriggerOrderType()) {
        fix.setTriggerOrderType(proto.getTriggerOrderType());
      }
      if (fieldPresence.getTriggerNewQty()) {
        fix.setTriggerNewQty(proto.getTriggerNewQty());
      }
      if (fieldPresence.getTriggerTradingSessionId()) {
        fix.setTriggerTradingSessionId(proto.getTriggerTradingSessionId());
      }
      if (fieldPresence.getTriggerTradingSessionSubId()) {
        fix.setTriggerTradingSessionSubId(proto.getTriggerTradingSessionSubId());
      }
      if (fieldPresence.getPegOffsetValue()) {
        fix.setPegOffsetValue(proto.getPegOffsetValue());
      }
      if (fieldPresence.getPegPriceType()) {
        fix.setPegPriceType(proto.getPegPriceType());
      }
      if (fieldPresence.getPegMoveType()) {
        fix.setPegMoveType(proto.getPegMoveType());
      }
      if (fieldPresence.getPegOffsetType()) {
        fix.setPegOffsetType(proto.getPegOffsetType());
      }
      if (fieldPresence.getPegLimitType()) {
        fix.setPegLimitType(proto.getPegLimitType());
      }
      if (fieldPresence.getPegRoundDirection()) {
        fix.setPegRoundDirection(proto.getPegRoundDirection());
      }
      if (fieldPresence.getPegScope()) {
        fix.setPegScope(proto.getPegScope());
      }
      if (fieldPresence.getPegSecurityIdSource()) {
        fix.setPegSecurityIdSource(proto.getPegSecurityIdSource());
      }
      if (fieldPresence.getPegSecurityId()) {
        fix.setPegSecurityId(proto.getPegSecurityId());
      }
      if (fieldPresence.getPegSymbol()) {
        fix.setPegSymbol(proto.getPegSymbol());
      }
      if (fieldPresence.getPegSecurityDesc()) {
        fix.setPegSecurityDesc(proto.getPegSecurityDesc());
      }
      if (fieldPresence.getDiscretionInst()) {
        fix.setDiscretionInst(proto.getDiscretionInst());
      }
      if (fieldPresence.getDiscretionOffsetValue()) {
        fix.setDiscretionOffsetValue(proto.getDiscretionOffsetValue());
      }
      if (fieldPresence.getDiscretionMoveType()) {
        fix.setDiscretionMoveType(proto.getDiscretionMoveType());
      }
      if (fieldPresence.getDiscretionOffsetType()) {
        fix.setDiscretionOffsetType(proto.getDiscretionOffsetType());
      }
      if (fieldPresence.getDiscretionLimitType()) {
        fix.setDiscretionLimitType(proto.getDiscretionLimitType());
      }
      if (fieldPresence.getDiscretionRoundDirection()) {
        fix.setDiscretionRoundDirection(proto.getDiscretionRoundDirection());
      }
      if (fieldPresence.getDiscretionScope()) {
        fix.setDiscretionScope(proto.getDiscretionScope());
      }
      if (fieldPresence.getPeggedPrice()) {
        fix.setPeggedPrice(proto.getPeggedPrice());
      }
      if (fieldPresence.getPeggedRefPrice()) {
        fix.setPeggedRefPrice(proto.getPeggedRefPrice());
      }
      if (fieldPresence.getDiscretionPrice()) {
        fix.setDiscretionPrice(proto.getDiscretionPrice());
      }
      if (fieldPresence.getTargetStrategy()) {
        fix.setTargetStrategy(proto.getTargetStrategy());
      }
      if (fieldPresence.getTargetStrategyParameters()) {
        fix.setTargetStrategyParameters(proto.getTargetStrategyParameters());
      }
      if (fieldPresence.getParticipationRate()) {
        fix.setParticipationRate(proto.getParticipationRate());
      }
      if (fieldPresence.getTargetStrategyPerformance()) {
        fix.setTargetStrategyPerformance(proto.getTargetStrategyPerformance());
      }
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getComplianceId()) {
        fix.setComplianceId(proto.getComplianceId());
      }
      if (fieldPresence.getSolicitedFlag()) {
        fix.setSolicitedFlag(proto.getSolicitedFlag());
      }
      if (fieldPresence.getTimeInForce()) {
        fix.setTimeInForce(proto.getTimeInForce());
      }
      if (fieldPresence.getEffectiveTime()) {
        fix.setEffectiveTime(proto.getEffectiveTime());
      }
      if (fieldPresence.getExpireDate()) {
        fix.setExpireDate(proto.getExpireDate());
      }
      if (fieldPresence.getExpireTime()) {
        fix.setExpireTime(proto.getExpireTime());
      }
      if (fieldPresence.getExecInst()) {
        fix.setExecInst(proto.getExecInst());
      }
      if (fieldPresence.getAggressorIndicator()) {
        fix.setAggressorIndicator(proto.getAggressorIndicator());
      }
      if (fieldPresence.getOrderCapacity()) {
        fix.setOrderCapacity(proto.getOrderCapacity());
      }
      if (fieldPresence.getOrderRestrictions()) {
        fix.setOrderRestrictions(proto.getOrderRestrictions());
      }
      if (fieldPresence.getPreTradeAnonymity()) {
        fix.setPreTradeAnonymity(proto.getPreTradeAnonymity());
      }
      if (fieldPresence.getCustOrderCapacity()) {
        fix.setCustOrderCapacity(proto.getCustOrderCapacity());
      }
      if (fieldPresence.getLastQty()) {
        fix.setLastQty(proto.getLastQty());
      }
      if (fieldPresence.getCalculatedCcyLastQty()) {
        fix.setCalculatedCcyLastQty(proto.getCalculatedCcyLastQty());
      }
      if (fieldPresence.getLastSwapPoints()) {
        fix.setLastSwapPoints(proto.getLastSwapPoints());
      }
      if (fieldPresence.getUnderlyingLastQty()) {
        fix.setUnderlyingLastQty(proto.getUnderlyingLastQty());
      }
      if (fieldPresence.getLastPx()) {
        fix.setLastPx(proto.getLastPx());
      }
      if (fieldPresence.getUnderlyingLastPx()) {
        fix.setUnderlyingLastPx(proto.getUnderlyingLastPx());
      }
      if (fieldPresence.getLastParPx()) {
        fix.setLastParPx(proto.getLastParPx());
      }
      if (fieldPresence.getLastSpotRate()) {
        fix.setLastSpotRate(proto.getLastSpotRate());
      }
      if (fieldPresence.getLastForwardPoints()) {
        fix.setLastForwardPoints(proto.getLastForwardPoints());
      }
      if (fieldPresence.getLastMkt()) {
        fix.setLastMkt(proto.getLastMkt());
      }
      if (fieldPresence.getTradingSessionId()) {
        fix.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getTradingSessionSubId()) {
        fix.setTradingSessionSubId(proto.getTradingSessionSubId());
      }
      if (fieldPresence.getTimeBracket()) {
        fix.setTimeBracket(proto.getTimeBracket());
      }
      if (fieldPresence.getLastCapacity()) {
        fix.setLastCapacity(proto.getLastCapacity());
      }
      if (fieldPresence.getLeavesQty()) {
        fix.setLeavesQty(proto.getLeavesQty());
      }
      if (fieldPresence.getCumQty()) {
        fix.setCumQty(proto.getCumQty());
      }
      if (fieldPresence.getAvgPx()) {
        fix.setAvgPx(proto.getAvgPx());
      }
      if (fieldPresence.getDayOrderQty()) {
        fix.setDayOrderQty(proto.getDayOrderQty());
      }
      if (fieldPresence.getDayCumQty()) {
        fix.setDayCumQty(proto.getDayCumQty());
      }
      if (fieldPresence.getDayAvgPx()) {
        fix.setDayAvgPx(proto.getDayAvgPx());
      }
      if (fieldPresence.getTotNoFills()) {
        fix.setTotNoFills(proto.getTotNoFills());
      }
      if (fieldPresence.getLastFragment()) {
        fix.setLastFragment(proto.getLastFragment());
      }
      if (fieldPresence.getGtBookingInst()) {
        fix.setGtBookingInst(proto.getGtBookingInst());
      }
      if (fieldPresence.getTradeDate()) {
        fix.setTradeDate(proto.getTradeDate());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
      }
      if (fieldPresence.getReportToExch()) {
        fix.setReportToExch(proto.getReportToExch());
      }
      if (fieldPresence.getCommission()) {
        fix.setCommission(proto.getCommission());
      }
      if (fieldPresence.getCommType()) {
        fix.setCommType(proto.getCommType());
      }
      if (fieldPresence.getCommCurrency()) {
        fix.setCommCurrency(proto.getCommCurrency());
      }
      if (fieldPresence.getFundRenewWaiv()) {
        fix.setFundRenewWaiv(proto.getFundRenewWaiv());
      }
      if (fieldPresence.getSpread()) {
        fix.setSpread(proto.getSpread());
      }
      if (fieldPresence.getBenchmarkCurveCurrency()) {
        fix.setBenchmarkCurveCurrency(proto.getBenchmarkCurveCurrency());
      }
      if (fieldPresence.getBenchmarkCurveName()) {
        fix.setBenchmarkCurveName(proto.getBenchmarkCurveName());
      }
      if (fieldPresence.getBenchmarkCurvePoint()) {
        fix.setBenchmarkCurvePoint(proto.getBenchmarkCurvePoint());
      }
      if (fieldPresence.getBenchmarkPrice()) {
        fix.setBenchmarkPrice(proto.getBenchmarkPrice());
      }
      if (fieldPresence.getBenchmarkPriceType()) {
        fix.setBenchmarkPriceType(proto.getBenchmarkPriceType());
      }
      if (fieldPresence.getBenchmarkSecurityId()) {
        fix.setBenchmarkSecurityId(proto.getBenchmarkSecurityId());
      }
      if (fieldPresence.getBenchmarkSecurityIdSource()) {
        fix.setBenchmarkSecurityIdSource(proto.getBenchmarkSecurityIdSource());
      }
      if (fieldPresence.getYieldType()) {
        fix.setYieldType(proto.getYieldType());
      }
      if (fieldPresence.getYield()) {
        fix.setYield(proto.getYield());
      }
      if (fieldPresence.getYieldCalcDate()) {
        fix.setYieldCalcDate(proto.getYieldCalcDate());
      }
      if (fieldPresence.getYieldRedemptionDate()) {
        fix.setYieldRedemptionDate(proto.getYieldRedemptionDate());
      }
      if (fieldPresence.getYieldRedemptionPrice()) {
        fix.setYieldRedemptionPrice(proto.getYieldRedemptionPrice());
      }
      if (fieldPresence.getYieldRedemptionPriceType()) {
        fix.setYieldRedemptionPriceType(proto.getYieldRedemptionPriceType());
      }
      if (fieldPresence.getGrossTradeAmt()) {
        fix.setGrossTradeAmt(proto.getGrossTradeAmt());
      }
      if (fieldPresence.getNumDaysInterest()) {
        fix.setNumDaysInterest(proto.getNumDaysInterest());
      }
      if (fieldPresence.getExDate()) {
        fix.setExDate(proto.getExDate());
      }
      if (fieldPresence.getAccruedInterestRate()) {
        fix.setAccruedInterestRate(proto.getAccruedInterestRate());
      }
      if (fieldPresence.getAccruedInterestAmt()) {
        fix.setAccruedInterestAmt(proto.getAccruedInterestAmt());
      }
      if (fieldPresence.getInterestAtMaturity()) {
        fix.setInterestAtMaturity(proto.getInterestAtMaturity());
      }
      if (fieldPresence.getEndAccruedInterestAmt()) {
        fix.setEndAccruedInterestAmt(proto.getEndAccruedInterestAmt());
      }
      if (fieldPresence.getStartCash()) {
        fix.setStartCash(proto.getStartCash());
      }
      if (fieldPresence.getEndCash()) {
        fix.setEndCash(proto.getEndCash());
      }
      if (fieldPresence.getTradedFlatSwitch()) {
        fix.setTradedFlatSwitch(proto.getTradedFlatSwitch());
      }
      if (fieldPresence.getBasisFeatureDate()) {
        fix.setBasisFeatureDate(proto.getBasisFeatureDate());
      }
      if (fieldPresence.getBasisFeaturePrice()) {
        fix.setBasisFeaturePrice(proto.getBasisFeaturePrice());
      }
      if (fieldPresence.getConcession()) {
        fix.setConcession(proto.getConcession());
      }
      if (fieldPresence.getTotalTakedown()) {
        fix.setTotalTakedown(proto.getTotalTakedown());
      }
      if (fieldPresence.getNetMoney()) {
        fix.setNetMoney(proto.getNetMoney());
      }
      if (fieldPresence.getSettlCurrAmt()) {
        fix.setSettlCurrAmt(proto.getSettlCurrAmt());
      }
      if (fieldPresence.getSettlCurrency()) {
        fix.setSettlCurrency(proto.getSettlCurrency());
      }
      if (fieldPresence.getSettlCurrFxRate()) {
        fix.setSettlCurrFxRate(proto.getSettlCurrFxRate());
      }
      if (fieldPresence.getSettlCurrFxRateCalc()) {
        fix.setSettlCurrFxRateCalc(proto.getSettlCurrFxRateCalc());
      }
      if (fieldPresence.getHandlInst()) {
        fix.setHandlInst(proto.getHandlInst());
      }
      if (fieldPresence.getMinQty()) {
        fix.setMinQty(proto.getMinQty());
      }
      if (fieldPresence.getMatchIncrement()) {
        fix.setMatchIncrement(proto.getMatchIncrement());
      }
      if (fieldPresence.getMaxPriceLevels()) {
        fix.setMaxPriceLevels(proto.getMaxPriceLevels());
      }
      if (fieldPresence.getDisplayQty()) {
        fix.setDisplayQty(proto.getDisplayQty());
      }
      if (fieldPresence.getSecondaryDisplayQty()) {
        fix.setSecondaryDisplayQty(proto.getSecondaryDisplayQty());
      }
      if (fieldPresence.getDisplayWhen()) {
        fix.setDisplayWhen(proto.getDisplayWhen());
      }
      if (fieldPresence.getDisplayMethod()) {
        fix.setDisplayMethod(proto.getDisplayMethod());
      }
      if (fieldPresence.getDisplayLowQty()) {
        fix.setDisplayLowQty(proto.getDisplayLowQty());
      }
      if (fieldPresence.getDisplayHighQty()) {
        fix.setDisplayHighQty(proto.getDisplayHighQty());
      }
      if (fieldPresence.getDisplayMinIncr()) {
        fix.setDisplayMinIncr(proto.getDisplayMinIncr());
      }
      if (fieldPresence.getRefreshQty()) {
        fix.setRefreshQty(proto.getRefreshQty());
      }
      if (fieldPresence.getMaxFloor()) {
        fix.setMaxFloor(proto.getMaxFloor());
      }
      if (fieldPresence.getPositionEffect()) {
        fix.setPositionEffect(proto.getPositionEffect());
      }
      if (fieldPresence.getMaxShow()) {
        fix.setMaxShow(proto.getMaxShow());
      }
      if (fieldPresence.getBookingType()) {
        fix.setBookingType(proto.getBookingType());
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
      if (fieldPresence.getSettlDate2()) {
        fix.setSettlDate2(proto.getSettlDate2());
      }
      if (fieldPresence.getOrderQty2()) {
        fix.setOrderQty2(proto.getOrderQty2());
      }
      if (fieldPresence.getLastForwardPoints2()) {
        fix.setLastForwardPoints2(proto.getLastForwardPoints2());
      }
      if (fieldPresence.getMultiLegReportingType()) {
        fix.setMultiLegReportingType(proto.getMultiLegReportingType());
      }
      if (fieldPresence.getCancellationRights()) {
        fix.setCancellationRights(proto.getCancellationRights());
      }
      if (fieldPresence.getMoneyLaunderingStatus()) {
        fix.setMoneyLaunderingStatus(proto.getMoneyLaunderingStatus());
      }
      if (fieldPresence.getRegistId()) {
        fix.setRegistId(proto.getRegistId());
      }
      if (fieldPresence.getDesignation()) {
        fix.setDesignation(proto.getDesignation());
      }
      if (fieldPresence.getTransBkdTime()) {
        fix.setTransBkdTime(proto.getTransBkdTime());
      }
      if (fieldPresence.getExecValuationPoint()) {
        fix.setExecValuationPoint(proto.getExecValuationPoint());
      }
      if (fieldPresence.getExecPriceType()) {
        fix.setExecPriceType(proto.getExecPriceType());
      }
      if (fieldPresence.getExecPriceAdjustment()) {
        fix.setExecPriceAdjustment(proto.getExecPriceAdjustment());
      }
      if (fieldPresence.getPriorityIndicator()) {
        fix.setPriorityIndicator(proto.getPriorityIndicator());
      }
      if (fieldPresence.getPriceImprovement()) {
        fix.setPriceImprovement(proto.getPriceImprovement());
      }
      if (fieldPresence.getLastLiquidityInd()) {
        fix.setLastLiquidityInd(proto.getLastLiquidityInd());
      }
      if (fieldPresence.getCopyMsgIndicator()) {
        fix.setCopyMsgIndicator(proto.getCopyMsgIndicator());
      }
      if (fieldPresence.getDividendYield()) {
        fix.setDividendYield(proto.getDividendYield());
      }
      if (fieldPresence.getManualOrderIndicator()) {
        fix.setManualOrderIndicator(proto.getManualOrderIndicator());
      }
      if (fieldPresence.getCustDirectedOrder()) {
        fix.setCustDirectedOrder(proto.getCustDirectedOrder());
      }
      if (fieldPresence.getReceivedDeptId()) {
        fix.setReceivedDeptId(proto.getReceivedDeptId());
      }
      if (fieldPresence.getCustOrderHandlingInst()) {
        fix.setCustOrderHandlingInst(proto.getCustOrderHandlingInst());
      }
      if (fieldPresence.getOrderHandlingInstSource()) {
        fix.setOrderHandlingInstSource(proto.getOrderHandlingInstSource());
      }
      if (fieldPresence.getVolatility()) {
        fix.setVolatility(proto.getVolatility());
      }
      if (fieldPresence.getTimeToExpiration()) {
        fix.setTimeToExpiration(proto.getTimeToExpiration());
      }
      if (fieldPresence.getRiskFreeRate()) {
        fix.setRiskFreeRate(proto.getRiskFreeRate());
      }
      if (fieldPresence.getPriceDelta()) {
        fix.setPriceDelta(proto.getPriceDelta());
      }
      for (int i = 0; i < proto.getNoPartyIdsCount(); i++) {
        final ExecutionReport.NoPartyIds group = new ExecutionReport.NoPartyIds();
        group.fromProto(proto.getNoPartyIds(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoContraBrokersCount(); i++) {
        final ExecutionReport.NoContraBrokers group = new ExecutionReport.NoContraBrokers();
        group.fromProto(proto.getNoContraBrokers(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoAllocsCount(); i++) {
        final ExecutionReport.NoAllocs group = new ExecutionReport.NoAllocs();
        group.fromProto(proto.getNoAllocs(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final ExecutionReport.NoSecurityAltId group = new ExecutionReport.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final ExecutionReport.NoEvents group = new ExecutionReport.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoInstrumentPartiesCount(); i++) {
        final ExecutionReport.NoInstrumentParties group = new ExecutionReport.NoInstrumentParties();
        group.fromProto(proto.getNoInstrumentParties(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoComplexEventsCount(); i++) {
        final ExecutionReport.NoComplexEvents group = new ExecutionReport.NoComplexEvents();
        group.fromProto(proto.getNoComplexEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final ExecutionReport.NoUnderlyings group = new ExecutionReport.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoStipulationsCount(); i++) {
        final ExecutionReport.NoStipulations group = new ExecutionReport.NoStipulations();
        group.fromProto(proto.getNoStipulations(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoStrategyParametersCount(); i++) {
        final ExecutionReport.NoStrategyParameters group =
            new ExecutionReport.NoStrategyParameters();
        group.fromProto(proto.getNoStrategyParameters(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoFillsCount(); i++) {
        final ExecutionReport.NoFills group = new ExecutionReport.NoFills();
        group.fromProto(proto.getNoFills(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoRateSourcesCount(); i++) {
        final ExecutionReport.NoRateSources group = new ExecutionReport.NoRateSources();
        group.fromProto(proto.getNoRateSources(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoContAmtsCount(); i++) {
        final ExecutionReport.NoContAmts group = new ExecutionReport.NoContAmts();
        group.fromProto(proto.getNoContAmts(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoLegsCount(); i++) {
        final ExecutionReport.NoLegs group = new ExecutionReport.NoLegs();
        group.fromProto(proto.getNoLegs(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoMiscFeesCount(); i++) {
        final ExecutionReport.NoMiscFees group = new ExecutionReport.NoMiscFees();
        group.fromProto(proto.getNoMiscFees(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoTrdRegTimestampsCount(); i++) {
        final ExecutionReport.NoTrdRegTimestamps group = new ExecutionReport.NoTrdRegTimestamps();
        group.fromProto(proto.getNoTrdRegTimestamps(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
