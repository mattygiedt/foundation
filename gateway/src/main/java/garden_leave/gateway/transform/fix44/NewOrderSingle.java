package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.805122300
//

public final class NewOrderSingle extends quickfix.Message {
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(NewOrderSingle.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(NewOrderSingle.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public NewOrderSingle setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.4";
  public static final String MSGTYPE = "D";

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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds
                                .NoPartySubIds proto) {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.NoPartySubIds
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getPartySubId()) {
          this.setPartySubId(proto.getPartySubId());
        }
        if (fieldPresence.getPartySubIdType()) {
          this.setPartySubIdType(proto.getPartySubIdType());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.NoPartySubIds.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.NoPartySubIds
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds
                                   .NoPartySubIds.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.NoPartySubIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.NoPartySubIds
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
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds
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

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoPartyIds.FieldPresence.newBuilder();

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

        public void fromProto(final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs
                                  .NoNestedPartyIds.NoNestedPartySubIds proto) {
          final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.FieldPresence fieldPresence = proto.getFieldPresence();

          if (fieldPresence.getNestedPartySubId()) {
            this.setNestedPartySubId(proto.getNestedPartySubId());
          }
          if (fieldPresence.getNestedPartySubIdType()) {
            this.setNestedPartySubIdType(proto.getNestedPartySubIdType());
          }
        }

        public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
            .NoNestedPartySubIds.Builder
            toBuilder() throws quickfix.FieldNotFound {
          final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.Builder builder =
              garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
                  .NoNestedPartySubIds.newBuilder();
          final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
              .NoNestedPartySubIds.FieldPresence.Builder presenceBuilder =
              garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs
                                .NoNestedPartyIds proto) {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
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

      public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds.Builder
      toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs
                                   .NoNestedPartyIds.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.NoNestedPartyIds
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
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs
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

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoAllocs.FieldPresence.newBuilder();

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

  public static class NoTradingSessions extends quickfix.Group {
    private final quickfix.StringField tradingSessionIdField = FieldFactory.newStringField(336);
    public boolean hasTradingSessionId() throws quickfix.FieldNotFound {
      return isSetField(336);
    }
    public String getTradingSessionId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(tradingSessionIdField));
    }
    public NoTradingSessions setTradingSessionId(final String value) {
      setField(FieldValue.to(tradingSessionIdField, value));
      return this;
    }
    public NoTradingSessions setTradingSessionId(final quickfix.field.TradingSessionID value) {
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
    public NoTradingSessions setTradingSessionSubId(final String value) {
      setField(FieldValue.to(tradingSessionSubIdField, value));
      return this;
    }
    public NoTradingSessions setTradingSessionSubId(
        final quickfix.field.TradingSessionSubID value) {
      setField(FieldValue.to(tradingSessionSubIdField, FieldValue.of(value)));
      return this;
    }

    public NoTradingSessions() {
      super(386, 336, new int[] {336, 625, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getTradingSessionId()) {
        this.setTradingSessionId(proto.getTradingSessionId());
      }
      if (fieldPresence.getTradingSessionSubId()) {
        this.setTradingSessionSubId(proto.getTradingSessionSubId());
      }
    }

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoTradingSessions.FieldPresence
          .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle
                                         .NoTradingSessions.FieldPresence.newBuilder();

      if (this.hasTradingSessionId()) {
        builder.setTradingSessionId(this.getTradingSessionId());
        presenceBuilder.setTradingSessionId(true);
      }
      if (this.hasTradingSessionSubId()) {
        builder.setTradingSessionSubId(this.getTradingSessionSubId());
        presenceBuilder.setTradingSessionSubId(true);
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
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getSecurityAltId()) {
        this.setSecurityAltId(proto.getSecurityAltId());
      }
      if (fieldPresence.getSecurityAltIdSource()) {
        this.setSecurityAltIdSource(proto.getSecurityAltIdSource());
      }
    }

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoSecurityAltId.FieldPresence
          .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle
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

    public void fromProto(
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents
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

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoEvents.FieldPresence.newBuilder();

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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
                                .NoUnderlyingSecurityAltId proto) {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingSecurityAltId()) {
          this.setUnderlyingSecurityAltId(proto.getUnderlyingSecurityAltId());
        }
        if (fieldPresence.getUnderlyingSecurityAltIdSource()) {
          this.setUnderlyingSecurityAltIdSource(proto.getUnderlyingSecurityAltIdSource());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
          .NoUnderlyingSecurityAltId.Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
            .NoUnderlyingSecurityAltId.Builder builder =
            garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
                .NoUnderlyingSecurityAltId.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
            .NoUnderlyingSecurityAltId.FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
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

      public void fromProto(final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
                                .NoUnderlyingStips proto) {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.NoUnderlyingStips
            .FieldPresence fieldPresence = proto.getFieldPresence();

        if (fieldPresence.getUnderlyingStipType()) {
          this.setUnderlyingStipType(proto.getUnderlyingStipType());
        }
        if (fieldPresence.getUnderlyingStipValue()) {
          this.setUnderlyingStipValue(proto.getUnderlyingStipValue());
        }
      }

      public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.NoUnderlyingStips
          .Builder
          toBuilder() throws quickfix.FieldNotFound {
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.NoUnderlyingStips
            .Builder builder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
                                   .NoUnderlyingStips.newBuilder();
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.NoUnderlyingStips
            .FieldPresence.Builder presenceBuilder =
            garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.NoUnderlyingStips
                .FieldPresence.newBuilder();

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

    public NoUnderlyings() {
      super(711, 311,
          new int[] {311, 312, 309, 305, 462, 463, 310, 763, 313, 542, 315, 241, 242, 243, 244, 245,
              246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307,
              364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings
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

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoUnderlyings.FieldPresence
          .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle
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
        final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations proto) {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations
          .FieldPresence fieldPresence = proto.getFieldPresence();

      if (fieldPresence.getStipulationType()) {
        this.setStipulationType(proto.getStipulationType());
      }
      if (fieldPresence.getStipulationValue()) {
        this.setStipulationValue(proto.getStipulationValue());
      }
    }

    public garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.NoStipulations.FieldPresence
          .Builder presenceBuilder = garden_leave.fix44.proto.FIX44Protos.NewOrderSingle
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

  private final quickfix.StringField clOrdIdField = FieldFactory.newStringField(11);
  public boolean hasClOrdId() throws quickfix.FieldNotFound {
    return isSetField(11);
  }
  public String getClOrdId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(clOrdIdField));
  }
  public NewOrderSingle setClOrdId(final String value) {
    setField(FieldValue.to(clOrdIdField, value));
    return this;
  }
  public NewOrderSingle setClOrdId(final quickfix.field.ClOrdID value) {
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
  public NewOrderSingle setSecondaryClOrdId(final String value) {
    setField(FieldValue.to(secondaryClOrdIdField, value));
    return this;
  }
  public NewOrderSingle setSecondaryClOrdId(final quickfix.field.SecondaryClOrdID value) {
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
  public NewOrderSingle setClOrdLinkId(final String value) {
    setField(FieldValue.to(clOrdLinkIdField, value));
    return this;
  }
  public NewOrderSingle setClOrdLinkId(final quickfix.field.ClOrdLinkID value) {
    setField(FieldValue.to(clOrdLinkIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeOriginationDateField = FieldFactory.newStringField(229);
  public boolean hasTradeOriginationDate() throws quickfix.FieldNotFound {
    return isSetField(229);
  }
  public String getTradeOriginationDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeOriginationDateField));
  }
  public NewOrderSingle setTradeOriginationDate(final String value) {
    setField(FieldValue.to(tradeOriginationDateField, value));
    return this;
  }
  public NewOrderSingle setTradeOriginationDate(final quickfix.field.TradeOriginationDate value) {
    setField(FieldValue.to(tradeOriginationDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField tradeDateField = FieldFactory.newStringField(75);
  public boolean hasTradeDate() throws quickfix.FieldNotFound {
    return isSetField(75);
  }
  public String getTradeDate() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(tradeDateField));
  }
  public NewOrderSingle setTradeDate(final String value) {
    setField(FieldValue.to(tradeDateField, value));
    return this;
  }
  public NewOrderSingle setTradeDate(final quickfix.field.TradeDate value) {
    setField(FieldValue.to(tradeDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField accountField = FieldFactory.newStringField(1);
  public boolean hasAccount() throws quickfix.FieldNotFound {
    return isSetField(1);
  }
  public String getAccount() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(accountField));
  }
  public NewOrderSingle setAccount(final String value) {
    setField(FieldValue.to(accountField, value));
    return this;
  }
  public NewOrderSingle setAccount(final quickfix.field.Account value) {
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
  public NewOrderSingle setAcctIdSource(final int value) {
    setField(FieldValue.to(acctIdSourceField, value));
    return this;
  }
  public NewOrderSingle setAcctIdSource(final quickfix.field.AcctIDSource value) {
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
  public NewOrderSingle setAccountType(final int value) {
    setField(FieldValue.to(accountTypeField, value));
    return this;
  }
  public NewOrderSingle setAccountType(final quickfix.field.AccountType value) {
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
  public NewOrderSingle setDayBookingInst(final int value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public NewOrderSingle setDayBookingInst(final char value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public NewOrderSingle setDayBookingInst(final String value) {
    setField(FieldValue.to(dayBookingInstField, value));
    return this;
  }
  public NewOrderSingle setDayBookingInst(final quickfix.field.DayBookingInst value) {
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
  public NewOrderSingle setBookingUnit(final int value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public NewOrderSingle setBookingUnit(final char value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public NewOrderSingle setBookingUnit(final String value) {
    setField(FieldValue.to(bookingUnitField, value));
    return this;
  }
  public NewOrderSingle setBookingUnit(final quickfix.field.BookingUnit value) {
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
  public NewOrderSingle setPreallocMethod(final int value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public NewOrderSingle setPreallocMethod(final char value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public NewOrderSingle setPreallocMethod(final String value) {
    setField(FieldValue.to(preallocMethodField, value));
    return this;
  }
  public NewOrderSingle setPreallocMethod(final quickfix.field.PreallocMethod value) {
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
  public NewOrderSingle setAllocId(final String value) {
    setField(FieldValue.to(allocIdField, value));
    return this;
  }
  public NewOrderSingle setAllocId(final quickfix.field.AllocID value) {
    setField(FieldValue.to(allocIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField settlTypeField = FieldFactory.newCharField(63);
  public boolean hasSettlType() throws quickfix.FieldNotFound {
    return isSetField(63);
  }
  public int getSettlType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlTypeField));
  }
  public NewOrderSingle setSettlType(final int value) {
    setField(FieldValue.to(settlTypeField, value));
    return this;
  }
  public NewOrderSingle setSettlType(final char value) {
    setField(FieldValue.to(settlTypeField, value));
    return this;
  }
  public NewOrderSingle setSettlType(final String value) {
    setField(FieldValue.to(settlTypeField, value));
    return this;
  }
  public NewOrderSingle setSettlType(final quickfix.field.SettlType value) {
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
  public NewOrderSingle setSettlDate(final String value) {
    setField(FieldValue.to(settlDateField, value));
    return this;
  }
  public NewOrderSingle setSettlDate(final quickfix.field.SettlDate value) {
    setField(FieldValue.to(settlDateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField cashMarginField = FieldFactory.newCharField(544);
  public boolean hasCashMargin() throws quickfix.FieldNotFound {
    return isSetField(544);
  }
  public int getCashMargin() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cashMarginField));
  }
  public NewOrderSingle setCashMargin(final int value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public NewOrderSingle setCashMargin(final char value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public NewOrderSingle setCashMargin(final String value) {
    setField(FieldValue.to(cashMarginField, value));
    return this;
  }
  public NewOrderSingle setCashMargin(final quickfix.field.CashMargin value) {
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
  public NewOrderSingle setClearingFeeIndicator(final String value) {
    setField(FieldValue.to(clearingFeeIndicatorField, value));
    return this;
  }
  public NewOrderSingle setClearingFeeIndicator(final quickfix.field.ClearingFeeIndicator value) {
    setField(FieldValue.to(clearingFeeIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField handlInstField = FieldFactory.newCharField(21);
  public boolean hasHandlInst() throws quickfix.FieldNotFound {
    return isSetField(21);
  }
  public int getHandlInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(handlInstField));
  }
  public NewOrderSingle setHandlInst(final int value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public NewOrderSingle setHandlInst(final char value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public NewOrderSingle setHandlInst(final String value) {
    setField(FieldValue.to(handlInstField, value));
    return this;
  }
  public NewOrderSingle setHandlInst(final quickfix.field.HandlInst value) {
    setField(FieldValue.to(handlInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField execInstField = FieldFactory.newStringField(18);
  public boolean hasExecInst() throws quickfix.FieldNotFound {
    return isSetField(18);
  }
  public String getExecInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(execInstField));
  }
  public NewOrderSingle setExecInst(final String value) {
    setField(FieldValue.to(execInstField, value));
    return this;
  }
  public NewOrderSingle setExecInst(final quickfix.field.ExecInst value) {
    setField(FieldValue.to(execInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField minQtyField = FieldFactory.newDoubleField(110);
  public boolean hasMinQty() throws quickfix.FieldNotFound {
    return isSetField(110);
  }
  public double getMinQty() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(minQtyField));
  }
  public NewOrderSingle setMinQty(final double value) {
    setField(FieldValue.to(minQtyField, value));
    return this;
  }
  public NewOrderSingle setMinQty(final quickfix.field.MinQty value) {
    setField(FieldValue.to(minQtyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxFloorField = FieldFactory.newDoubleField(111);
  public boolean hasMaxFloor() throws quickfix.FieldNotFound {
    return isSetField(111);
  }
  public double getMaxFloor() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxFloorField));
  }
  public NewOrderSingle setMaxFloor(final double value) {
    setField(FieldValue.to(maxFloorField, value));
    return this;
  }
  public NewOrderSingle setMaxFloor(final quickfix.field.MaxFloor value) {
    setField(FieldValue.to(maxFloorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField exDestinationField = FieldFactory.newStringField(100);
  public boolean hasExDestination() throws quickfix.FieldNotFound {
    return isSetField(100);
  }
  public String getExDestination() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(exDestinationField));
  }
  public NewOrderSingle setExDestination(final String value) {
    setField(FieldValue.to(exDestinationField, value));
    return this;
  }
  public NewOrderSingle setExDestination(final quickfix.field.ExDestination value) {
    setField(FieldValue.to(exDestinationField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField processCodeField = FieldFactory.newCharField(81);
  public boolean hasProcessCode() throws quickfix.FieldNotFound {
    return isSetField(81);
  }
  public int getProcessCode() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(processCodeField));
  }
  public NewOrderSingle setProcessCode(final int value) {
    setField(FieldValue.to(processCodeField, value));
    return this;
  }
  public NewOrderSingle setProcessCode(final char value) {
    setField(FieldValue.to(processCodeField, value));
    return this;
  }
  public NewOrderSingle setProcessCode(final String value) {
    setField(FieldValue.to(processCodeField, value));
    return this;
  }
  public NewOrderSingle setProcessCode(final quickfix.field.ProcessCode value) {
    setField(FieldValue.to(processCodeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField symbolField = FieldFactory.newStringField(55);
  public boolean hasSymbol() throws quickfix.FieldNotFound {
    return isSetField(55);
  }
  public String getSymbol() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(symbolField));
  }
  public NewOrderSingle setSymbol(final String value) {
    setField(FieldValue.to(symbolField, value));
    return this;
  }
  public NewOrderSingle setSymbol(final quickfix.field.Symbol value) {
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
  public NewOrderSingle setSymbolSfx(final String value) {
    setField(FieldValue.to(symbolSfxField, value));
    return this;
  }
  public NewOrderSingle setSymbolSfx(final quickfix.field.SymbolSfx value) {
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
  public NewOrderSingle setSecurityId(final String value) {
    setField(FieldValue.to(securityIdField, value));
    return this;
  }
  public NewOrderSingle setSecurityId(final quickfix.field.SecurityID value) {
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
  public NewOrderSingle setSecurityIdSource(final String value) {
    setField(FieldValue.to(securityIdSourceField, value));
    return this;
  }
  public NewOrderSingle setSecurityIdSource(final quickfix.field.SecurityIDSource value) {
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
  public NewOrderSingle setProduct(final int value) {
    setField(FieldValue.to(productField, value));
    return this;
  }
  public NewOrderSingle setProduct(final quickfix.field.Product value) {
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
  public NewOrderSingle setCfiCode(final String value) {
    setField(FieldValue.to(cfiCodeField, value));
    return this;
  }
  public NewOrderSingle setCfiCode(final quickfix.field.CFICode value) {
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
  public NewOrderSingle setSecurityType(final String value) {
    setField(FieldValue.to(securityTypeField, value));
    return this;
  }
  public NewOrderSingle setSecurityType(final quickfix.field.SecurityType value) {
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
  public NewOrderSingle setSecuritySubType(final String value) {
    setField(FieldValue.to(securitySubTypeField, value));
    return this;
  }
  public NewOrderSingle setSecuritySubType(final quickfix.field.SecuritySubType value) {
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
  public NewOrderSingle setMaturityMonthYear(final String value) {
    setField(FieldValue.to(maturityMonthYearField, value));
    return this;
  }
  public NewOrderSingle setMaturityMonthYear(final quickfix.field.MaturityMonthYear value) {
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
  public NewOrderSingle setMaturityDate(final String value) {
    setField(FieldValue.to(maturityDateField, value));
    return this;
  }
  public NewOrderSingle setMaturityDate(final quickfix.field.MaturityDate value) {
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
  public NewOrderSingle setPutOrCall(final int value) {
    setField(FieldValue.to(putOrCallField, value));
    return this;
  }
  public NewOrderSingle setPutOrCall(final quickfix.field.PutOrCall value) {
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
  public NewOrderSingle setCouponPaymentDate(final String value) {
    setField(FieldValue.to(couponPaymentDateField, value));
    return this;
  }
  public NewOrderSingle setCouponPaymentDate(final quickfix.field.CouponPaymentDate value) {
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
  public NewOrderSingle setIssueDate(final String value) {
    setField(FieldValue.to(issueDateField, value));
    return this;
  }
  public NewOrderSingle setIssueDate(final quickfix.field.IssueDate value) {
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
  public NewOrderSingle setRepoCollateralSecurityType(final String value) {
    setField(FieldValue.to(repoCollateralSecurityTypeField, value));
    return this;
  }
  public NewOrderSingle setRepoCollateralSecurityType(
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
  public NewOrderSingle setRepurchaseTerm(final int value) {
    setField(FieldValue.to(repurchaseTermField, value));
    return this;
  }
  public NewOrderSingle setRepurchaseTerm(final quickfix.field.RepurchaseTerm value) {
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
  public NewOrderSingle setRepurchaseRate(final double value) {
    setField(FieldValue.to(repurchaseRateField, value));
    return this;
  }
  public NewOrderSingle setRepurchaseRate(final quickfix.field.RepurchaseRate value) {
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
  public NewOrderSingle setFactor(final double value) {
    setField(FieldValue.to(factorField, value));
    return this;
  }
  public NewOrderSingle setFactor(final quickfix.field.Factor value) {
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
  public NewOrderSingle setCreditRating(final String value) {
    setField(FieldValue.to(creditRatingField, value));
    return this;
  }
  public NewOrderSingle setCreditRating(final quickfix.field.CreditRating value) {
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
  public NewOrderSingle setInstrRegistry(final String value) {
    setField(FieldValue.to(instrRegistryField, value));
    return this;
  }
  public NewOrderSingle setInstrRegistry(final quickfix.field.InstrRegistry value) {
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
  public NewOrderSingle setCountryOfIssue(final String value) {
    setField(FieldValue.to(countryOfIssueField, value));
    return this;
  }
  public NewOrderSingle setCountryOfIssue(final quickfix.field.CountryOfIssue value) {
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
  public NewOrderSingle setStateOrProvinceOfIssue(final String value) {
    setField(FieldValue.to(stateOrProvinceOfIssueField, value));
    return this;
  }
  public NewOrderSingle setStateOrProvinceOfIssue(
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
  public NewOrderSingle setLocaleOfIssue(final String value) {
    setField(FieldValue.to(localeOfIssueField, value));
    return this;
  }
  public NewOrderSingle setLocaleOfIssue(final quickfix.field.LocaleOfIssue value) {
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
  public NewOrderSingle setRedemptionDate(final String value) {
    setField(FieldValue.to(redemptionDateField, value));
    return this;
  }
  public NewOrderSingle setRedemptionDate(final quickfix.field.RedemptionDate value) {
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
  public NewOrderSingle setStrikePrice(final double value) {
    setField(FieldValue.to(strikePriceField, value));
    return this;
  }
  public NewOrderSingle setStrikePrice(final quickfix.field.StrikePrice value) {
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
  public NewOrderSingle setStrikeCurrency(final String value) {
    setField(FieldValue.to(strikeCurrencyField, value));
    return this;
  }
  public NewOrderSingle setStrikeCurrency(final quickfix.field.StrikeCurrency value) {
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
  public NewOrderSingle setOptAttribute(final int value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public NewOrderSingle setOptAttribute(final char value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public NewOrderSingle setOptAttribute(final String value) {
    setField(FieldValue.to(optAttributeField, value));
    return this;
  }
  public NewOrderSingle setOptAttribute(final quickfix.field.OptAttribute value) {
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
  public NewOrderSingle setContractMultiplier(final double value) {
    setField(FieldValue.to(contractMultiplierField, value));
    return this;
  }
  public NewOrderSingle setContractMultiplier(final quickfix.field.ContractMultiplier value) {
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
  public NewOrderSingle setCouponRate(final double value) {
    setField(FieldValue.to(couponRateField, value));
    return this;
  }
  public NewOrderSingle setCouponRate(final quickfix.field.CouponRate value) {
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
  public NewOrderSingle setSecurityExchange(final String value) {
    setField(FieldValue.to(securityExchangeField, value));
    return this;
  }
  public NewOrderSingle setSecurityExchange(final quickfix.field.SecurityExchange value) {
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
  public NewOrderSingle setIssuer(final String value) {
    setField(FieldValue.to(issuerField, value));
    return this;
  }
  public NewOrderSingle setIssuer(final quickfix.field.Issuer value) {
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
  public NewOrderSingle setEncodedIssuerLen(final int value) {
    setField(FieldValue.to(encodedIssuerLenField, value));
    return this;
  }
  public NewOrderSingle setEncodedIssuerLen(final quickfix.field.EncodedIssuerLen value) {
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
  public NewOrderSingle setEncodedIssuer(final String value) {
    setField(FieldValue.to(encodedIssuerField, value));
    return this;
  }
  public NewOrderSingle setEncodedIssuer(final quickfix.field.EncodedIssuer value) {
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
  public NewOrderSingle setSecurityDesc(final String value) {
    setField(FieldValue.to(securityDescField, value));
    return this;
  }
  public NewOrderSingle setSecurityDesc(final quickfix.field.SecurityDesc value) {
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
  public NewOrderSingle setEncodedSecurityDescLen(final int value) {
    setField(FieldValue.to(encodedSecurityDescLenField, value));
    return this;
  }
  public NewOrderSingle setEncodedSecurityDescLen(
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
  public NewOrderSingle setEncodedSecurityDesc(final String value) {
    setField(FieldValue.to(encodedSecurityDescField, value));
    return this;
  }
  public NewOrderSingle setEncodedSecurityDesc(final quickfix.field.EncodedSecurityDesc value) {
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
  public NewOrderSingle setPool(final String value) {
    setField(FieldValue.to(poolField, value));
    return this;
  }
  public NewOrderSingle setPool(final quickfix.field.Pool value) {
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
  public NewOrderSingle setContractSettlMonth(final String value) {
    setField(FieldValue.to(contractSettlMonthField, value));
    return this;
  }
  public NewOrderSingle setContractSettlMonth(final quickfix.field.ContractSettlMonth value) {
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
  public NewOrderSingle setCpProgram(final int value) {
    setField(FieldValue.to(cpProgramField, value));
    return this;
  }
  public NewOrderSingle setCpProgram(final quickfix.field.CPProgram value) {
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
  public NewOrderSingle setCpRegType(final String value) {
    setField(FieldValue.to(cpRegTypeField, value));
    return this;
  }
  public NewOrderSingle setCpRegType(final quickfix.field.CPRegType value) {
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
  public NewOrderSingle setDatedDate(final String value) {
    setField(FieldValue.to(datedDateField, value));
    return this;
  }
  public NewOrderSingle setDatedDate(final quickfix.field.DatedDate value) {
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
  public NewOrderSingle setInterestAccrualDate(final String value) {
    setField(FieldValue.to(interestAccrualDateField, value));
    return this;
  }
  public NewOrderSingle setInterestAccrualDate(final quickfix.field.InterestAccrualDate value) {
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
  public NewOrderSingle setAgreementDesc(final String value) {
    setField(FieldValue.to(agreementDescField, value));
    return this;
  }
  public NewOrderSingle setAgreementDesc(final quickfix.field.AgreementDesc value) {
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
  public NewOrderSingle setAgreementId(final String value) {
    setField(FieldValue.to(agreementIdField, value));
    return this;
  }
  public NewOrderSingle setAgreementId(final quickfix.field.AgreementID value) {
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
  public NewOrderSingle setAgreementDate(final String value) {
    setField(FieldValue.to(agreementDateField, value));
    return this;
  }
  public NewOrderSingle setAgreementDate(final quickfix.field.AgreementDate value) {
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
  public NewOrderSingle setAgreementCurrency(final String value) {
    setField(FieldValue.to(agreementCurrencyField, value));
    return this;
  }
  public NewOrderSingle setAgreementCurrency(final quickfix.field.AgreementCurrency value) {
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
  public NewOrderSingle setTerminationType(final int value) {
    setField(FieldValue.to(terminationTypeField, value));
    return this;
  }
  public NewOrderSingle setTerminationType(final quickfix.field.TerminationType value) {
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
  public NewOrderSingle setStartDate(final String value) {
    setField(FieldValue.to(startDateField, value));
    return this;
  }
  public NewOrderSingle setStartDate(final quickfix.field.StartDate value) {
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
  public NewOrderSingle setEndDate(final String value) {
    setField(FieldValue.to(endDateField, value));
    return this;
  }
  public NewOrderSingle setEndDate(final quickfix.field.EndDate value) {
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
  public NewOrderSingle setDeliveryType(final int value) {
    setField(FieldValue.to(deliveryTypeField, value));
    return this;
  }
  public NewOrderSingle setDeliveryType(final quickfix.field.DeliveryType value) {
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
  public NewOrderSingle setMarginRatio(final double value) {
    setField(FieldValue.to(marginRatioField, value));
    return this;
  }
  public NewOrderSingle setMarginRatio(final quickfix.field.MarginRatio value) {
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
  public NewOrderSingle setPrevClosePx(final double value) {
    setField(FieldValue.to(prevClosePxField, value));
    return this;
  }
  public NewOrderSingle setPrevClosePx(final quickfix.field.PrevClosePx value) {
    setField(FieldValue.to(prevClosePxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField sideField = FieldFactory.newCharField(54);
  public boolean hasSide() throws quickfix.FieldNotFound {
    return isSetField(54);
  }
  public int getSide() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sideField));
  }
  public NewOrderSingle setSide(final int value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public NewOrderSingle setSide(final char value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public NewOrderSingle setSide(final String value) {
    setField(FieldValue.to(sideField, value));
    return this;
  }
  public NewOrderSingle setSide(final quickfix.field.Side value) {
    setField(FieldValue.to(sideField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField locateReqdField = FieldFactory.newBooleanField(114);
  public boolean hasLocateReqd() throws quickfix.FieldNotFound {
    return isSetField(114);
  }
  public boolean getLocateReqd() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(locateReqdField));
  }
  public NewOrderSingle setLocateReqd(final boolean value) {
    setField(FieldValue.to(locateReqdField, value));
    return this;
  }
  public NewOrderSingle setLocateReqd(final quickfix.field.LocateReqd value) {
    setField(FieldValue.to(locateReqdField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField transactTimeField = FieldFactory.newTimeStampField(60);
  public boolean hasTransactTime() throws quickfix.FieldNotFound {
    return isSetField(60);
  }
  public long getTransactTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(transactTimeField));
  }
  public NewOrderSingle setTransactTime(final long value) {
    setField(FieldValue.to(transactTimeField, value));
    return this;
  }
  public NewOrderSingle setTransactTime(final quickfix.field.TransactTime value) {
    setField(FieldValue.to(transactTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField qtyTypeField = FieldFactory.newIntField(854);
  public boolean hasQtyType() throws quickfix.FieldNotFound {
    return isSetField(854);
  }
  public int getQtyType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(qtyTypeField));
  }
  public NewOrderSingle setQtyType(final int value) {
    setField(FieldValue.to(qtyTypeField, value));
    return this;
  }
  public NewOrderSingle setQtyType(final quickfix.field.QtyType value) {
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
  public NewOrderSingle setOrderQty(final double value) {
    setField(FieldValue.to(orderQtyField, value));
    return this;
  }
  public NewOrderSingle setOrderQty(final quickfix.field.OrderQty value) {
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
  public NewOrderSingle setCashOrderQty(final double value) {
    setField(FieldValue.to(cashOrderQtyField, value));
    return this;
  }
  public NewOrderSingle setCashOrderQty(final quickfix.field.CashOrderQty value) {
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
  public NewOrderSingle setOrderPercent(final double value) {
    setField(FieldValue.to(orderPercentField, value));
    return this;
  }
  public NewOrderSingle setOrderPercent(final quickfix.field.OrderPercent value) {
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
  public NewOrderSingle setRoundingDirection(final int value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public NewOrderSingle setRoundingDirection(final char value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public NewOrderSingle setRoundingDirection(final String value) {
    setField(FieldValue.to(roundingDirectionField, value));
    return this;
  }
  public NewOrderSingle setRoundingDirection(final quickfix.field.RoundingDirection value) {
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
  public NewOrderSingle setRoundingModulus(final double value) {
    setField(FieldValue.to(roundingModulusField, value));
    return this;
  }
  public NewOrderSingle setRoundingModulus(final quickfix.field.RoundingModulus value) {
    setField(FieldValue.to(roundingModulusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField ordTypeField = FieldFactory.newCharField(40);
  public boolean hasOrdType() throws quickfix.FieldNotFound {
    return isSetField(40);
  }
  public int getOrdType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ordTypeField));
  }
  public NewOrderSingle setOrdType(final int value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public NewOrderSingle setOrdType(final char value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public NewOrderSingle setOrdType(final String value) {
    setField(FieldValue.to(ordTypeField, value));
    return this;
  }
  public NewOrderSingle setOrdType(final quickfix.field.OrdType value) {
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
  public NewOrderSingle setPriceType(final int value) {
    setField(FieldValue.to(priceTypeField, value));
    return this;
  }
  public NewOrderSingle setPriceType(final quickfix.field.PriceType value) {
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
  public NewOrderSingle setPrice(final double value) {
    setField(FieldValue.to(priceField, value));
    return this;
  }
  public NewOrderSingle setPrice(final quickfix.field.Price value) {
    setField(FieldValue.to(priceField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField stopPxField = FieldFactory.newDoubleField(99);
  public boolean hasStopPx() throws quickfix.FieldNotFound {
    return isSetField(99);
  }
  public double getStopPx() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(stopPxField));
  }
  public NewOrderSingle setStopPx(final double value) {
    setField(FieldValue.to(stopPxField, value));
    return this;
  }
  public NewOrderSingle setStopPx(final quickfix.field.StopPx value) {
    setField(FieldValue.to(stopPxField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField spreadField = FieldFactory.newDoubleField(218);
  public boolean hasSpread() throws quickfix.FieldNotFound {
    return isSetField(218);
  }
  public double getSpread() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(spreadField));
  }
  public NewOrderSingle setSpread(final double value) {
    setField(FieldValue.to(spreadField, value));
    return this;
  }
  public NewOrderSingle setSpread(final quickfix.field.Spread value) {
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
  public NewOrderSingle setBenchmarkCurveCurrency(final String value) {
    setField(FieldValue.to(benchmarkCurveCurrencyField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkCurveCurrency(
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
  public NewOrderSingle setBenchmarkCurveName(final String value) {
    setField(FieldValue.to(benchmarkCurveNameField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkCurveName(final quickfix.field.BenchmarkCurveName value) {
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
  public NewOrderSingle setBenchmarkCurvePoint(final String value) {
    setField(FieldValue.to(benchmarkCurvePointField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkCurvePoint(final quickfix.field.BenchmarkCurvePoint value) {
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
  public NewOrderSingle setBenchmarkPrice(final double value) {
    setField(FieldValue.to(benchmarkPriceField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkPrice(final quickfix.field.BenchmarkPrice value) {
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
  public NewOrderSingle setBenchmarkPriceType(final int value) {
    setField(FieldValue.to(benchmarkPriceTypeField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkPriceType(final quickfix.field.BenchmarkPriceType value) {
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
  public NewOrderSingle setBenchmarkSecurityId(final String value) {
    setField(FieldValue.to(benchmarkSecurityIdField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkSecurityId(final quickfix.field.BenchmarkSecurityID value) {
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
  public NewOrderSingle setBenchmarkSecurityIdSource(final String value) {
    setField(FieldValue.to(benchmarkSecurityIdSourceField, value));
    return this;
  }
  public NewOrderSingle setBenchmarkSecurityIdSource(
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
  public NewOrderSingle setYieldType(final String value) {
    setField(FieldValue.to(yieldTypeField, value));
    return this;
  }
  public NewOrderSingle setYieldType(final quickfix.field.YieldType value) {
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
  public NewOrderSingle setYield(final double value) {
    setField(FieldValue.to(yieldField, value));
    return this;
  }
  public NewOrderSingle setYield(final quickfix.field.Yield value) {
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
  public NewOrderSingle setYieldCalcDate(final String value) {
    setField(FieldValue.to(yieldCalcDateField, value));
    return this;
  }
  public NewOrderSingle setYieldCalcDate(final quickfix.field.YieldCalcDate value) {
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
  public NewOrderSingle setYieldRedemptionDate(final String value) {
    setField(FieldValue.to(yieldRedemptionDateField, value));
    return this;
  }
  public NewOrderSingle setYieldRedemptionDate(final quickfix.field.YieldRedemptionDate value) {
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
  public NewOrderSingle setYieldRedemptionPrice(final double value) {
    setField(FieldValue.to(yieldRedemptionPriceField, value));
    return this;
  }
  public NewOrderSingle setYieldRedemptionPrice(final quickfix.field.YieldRedemptionPrice value) {
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
  public NewOrderSingle setYieldRedemptionPriceType(final int value) {
    setField(FieldValue.to(yieldRedemptionPriceTypeField, value));
    return this;
  }
  public NewOrderSingle setYieldRedemptionPriceType(
      final quickfix.field.YieldRedemptionPriceType value) {
    setField(FieldValue.to(yieldRedemptionPriceTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField currencyField = FieldFactory.newStringField(15);
  public boolean hasCurrency() throws quickfix.FieldNotFound {
    return isSetField(15);
  }
  public String getCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(currencyField));
  }
  public NewOrderSingle setCurrency(final String value) {
    setField(FieldValue.to(currencyField, value));
    return this;
  }
  public NewOrderSingle setCurrency(final quickfix.field.Currency value) {
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
  public NewOrderSingle setComplianceId(final String value) {
    setField(FieldValue.to(complianceIdField, value));
    return this;
  }
  public NewOrderSingle setComplianceId(final quickfix.field.ComplianceID value) {
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
  public NewOrderSingle setSolicitedFlag(final boolean value) {
    setField(FieldValue.to(solicitedFlagField, value));
    return this;
  }
  public NewOrderSingle setSolicitedFlag(final quickfix.field.SolicitedFlag value) {
    setField(FieldValue.to(solicitedFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField ioiIdField = FieldFactory.newStringField(23);
  public boolean hasIoiId() throws quickfix.FieldNotFound {
    return isSetField(23);
  }
  public String getIoiId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(ioiIdField));
  }
  public NewOrderSingle setIoiId(final String value) {
    setField(FieldValue.to(ioiIdField, value));
    return this;
  }
  public NewOrderSingle setIoiId(final quickfix.field.IOIID value) {
    setField(FieldValue.to(ioiIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField quoteIdField = FieldFactory.newStringField(117);
  public boolean hasQuoteId() throws quickfix.FieldNotFound {
    return isSetField(117);
  }
  public String getQuoteId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(quoteIdField));
  }
  public NewOrderSingle setQuoteId(final String value) {
    setField(FieldValue.to(quoteIdField, value));
    return this;
  }
  public NewOrderSingle setQuoteId(final quickfix.field.QuoteID value) {
    setField(FieldValue.to(quoteIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField timeInForceField = FieldFactory.newCharField(59);
  public boolean hasTimeInForce() throws quickfix.FieldNotFound {
    return isSetField(59);
  }
  public int getTimeInForce() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(timeInForceField));
  }
  public NewOrderSingle setTimeInForce(final int value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public NewOrderSingle setTimeInForce(final char value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public NewOrderSingle setTimeInForce(final String value) {
    setField(FieldValue.to(timeInForceField, value));
    return this;
  }
  public NewOrderSingle setTimeInForce(final quickfix.field.TimeInForce value) {
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
  public NewOrderSingle setEffectiveTime(final long value) {
    setField(FieldValue.to(effectiveTimeField, value));
    return this;
  }
  public NewOrderSingle setEffectiveTime(final quickfix.field.EffectiveTime value) {
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
  public NewOrderSingle setExpireDate(final String value) {
    setField(FieldValue.to(expireDateField, value));
    return this;
  }
  public NewOrderSingle setExpireDate(final quickfix.field.ExpireDate value) {
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
  public NewOrderSingle setExpireTime(final long value) {
    setField(FieldValue.to(expireTimeField, value));
    return this;
  }
  public NewOrderSingle setExpireTime(final quickfix.field.ExpireTime value) {
    setField(FieldValue.to(expireTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField gtBookingInstField = FieldFactory.newIntField(427);
  public boolean hasGtBookingInst() throws quickfix.FieldNotFound {
    return isSetField(427);
  }
  public int getGtBookingInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(gtBookingInstField));
  }
  public NewOrderSingle setGtBookingInst(final int value) {
    setField(FieldValue.to(gtBookingInstField, value));
    return this;
  }
  public NewOrderSingle setGtBookingInst(final quickfix.field.GTBookingInst value) {
    setField(FieldValue.to(gtBookingInstField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField commissionField = FieldFactory.newDoubleField(12);
  public boolean hasCommission() throws quickfix.FieldNotFound {
    return isSetField(12);
  }
  public double getCommission() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(commissionField));
  }
  public NewOrderSingle setCommission(final double value) {
    setField(FieldValue.to(commissionField, value));
    return this;
  }
  public NewOrderSingle setCommission(final quickfix.field.Commission value) {
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
  public NewOrderSingle setCommType(final int value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public NewOrderSingle setCommType(final char value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public NewOrderSingle setCommType(final String value) {
    setField(FieldValue.to(commTypeField, value));
    return this;
  }
  public NewOrderSingle setCommType(final quickfix.field.CommType value) {
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
  public NewOrderSingle setCommCurrency(final String value) {
    setField(FieldValue.to(commCurrencyField, value));
    return this;
  }
  public NewOrderSingle setCommCurrency(final quickfix.field.CommCurrency value) {
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
  public NewOrderSingle setFundRenewWaiv(final int value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public NewOrderSingle setFundRenewWaiv(final char value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public NewOrderSingle setFundRenewWaiv(final String value) {
    setField(FieldValue.to(fundRenewWaivField, value));
    return this;
  }
  public NewOrderSingle setFundRenewWaiv(final quickfix.field.FundRenewWaiv value) {
    setField(FieldValue.to(fundRenewWaivField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField orderCapacityField = FieldFactory.newCharField(528);
  public boolean hasOrderCapacity() throws quickfix.FieldNotFound {
    return isSetField(528);
  }
  public int getOrderCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(orderCapacityField));
  }
  public NewOrderSingle setOrderCapacity(final int value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public NewOrderSingle setOrderCapacity(final char value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public NewOrderSingle setOrderCapacity(final String value) {
    setField(FieldValue.to(orderCapacityField, value));
    return this;
  }
  public NewOrderSingle setOrderCapacity(final quickfix.field.OrderCapacity value) {
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
  public NewOrderSingle setOrderRestrictions(final String value) {
    setField(FieldValue.to(orderRestrictionsField, value));
    return this;
  }
  public NewOrderSingle setOrderRestrictions(final quickfix.field.OrderRestrictions value) {
    setField(FieldValue.to(orderRestrictionsField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField custOrderCapacityField = FieldFactory.newIntField(582);
  public boolean hasCustOrderCapacity() throws quickfix.FieldNotFound {
    return isSetField(582);
  }
  public int getCustOrderCapacity() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(custOrderCapacityField));
  }
  public NewOrderSingle setCustOrderCapacity(final int value) {
    setField(FieldValue.to(custOrderCapacityField, value));
    return this;
  }
  public NewOrderSingle setCustOrderCapacity(final quickfix.field.CustOrderCapacity value) {
    setField(FieldValue.to(custOrderCapacityField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField forexReqField = FieldFactory.newBooleanField(121);
  public boolean hasForexReq() throws quickfix.FieldNotFound {
    return isSetField(121);
  }
  public boolean getForexReq() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(forexReqField));
  }
  public NewOrderSingle setForexReq(final boolean value) {
    setField(FieldValue.to(forexReqField, value));
    return this;
  }
  public NewOrderSingle setForexReq(final quickfix.field.ForexReq value) {
    setField(FieldValue.to(forexReqField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField settlCurrencyField = FieldFactory.newStringField(120);
  public boolean hasSettlCurrency() throws quickfix.FieldNotFound {
    return isSetField(120);
  }
  public String getSettlCurrency() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(settlCurrencyField));
  }
  public NewOrderSingle setSettlCurrency(final String value) {
    setField(FieldValue.to(settlCurrencyField, value));
    return this;
  }
  public NewOrderSingle setSettlCurrency(final quickfix.field.SettlCurrency value) {
    setField(FieldValue.to(settlCurrencyField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField bookingTypeField = FieldFactory.newIntField(775);
  public boolean hasBookingType() throws quickfix.FieldNotFound {
    return isSetField(775);
  }
  public int getBookingType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bookingTypeField));
  }
  public NewOrderSingle setBookingType(final int value) {
    setField(FieldValue.to(bookingTypeField, value));
    return this;
  }
  public NewOrderSingle setBookingType(final quickfix.field.BookingType value) {
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
  public NewOrderSingle setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public NewOrderSingle setText(final quickfix.field.Text value) {
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
  public NewOrderSingle setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public NewOrderSingle setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public NewOrderSingle setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public NewOrderSingle setEncodedText(final quickfix.field.EncodedText value) {
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
  public NewOrderSingle setSettlDate2(final String value) {
    setField(FieldValue.to(settlDate2Field, value));
    return this;
  }
  public NewOrderSingle setSettlDate2(final quickfix.field.SettlDate2 value) {
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
  public NewOrderSingle setOrderQty2(final double value) {
    setField(FieldValue.to(orderQty2Field, value));
    return this;
  }
  public NewOrderSingle setOrderQty2(final quickfix.field.OrderQty2 value) {
    setField(FieldValue.to(orderQty2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField price2Field = FieldFactory.newDoubleField(640);
  public boolean hasPrice2() throws quickfix.FieldNotFound {
    return isSetField(640);
  }
  public double getPrice2() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(price2Field));
  }
  public NewOrderSingle setPrice2(final double value) {
    setField(FieldValue.to(price2Field, value));
    return this;
  }
  public NewOrderSingle setPrice2(final quickfix.field.Price2 value) {
    setField(FieldValue.to(price2Field, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField positionEffectField = FieldFactory.newCharField(77);
  public boolean hasPositionEffect() throws quickfix.FieldNotFound {
    return isSetField(77);
  }
  public int getPositionEffect() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(positionEffectField));
  }
  public NewOrderSingle setPositionEffect(final int value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public NewOrderSingle setPositionEffect(final char value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public NewOrderSingle setPositionEffect(final String value) {
    setField(FieldValue.to(positionEffectField, value));
    return this;
  }
  public NewOrderSingle setPositionEffect(final quickfix.field.PositionEffect value) {
    setField(FieldValue.to(positionEffectField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField coveredOrUncoveredField = FieldFactory.newIntField(203);
  public boolean hasCoveredOrUncovered() throws quickfix.FieldNotFound {
    return isSetField(203);
  }
  public int getCoveredOrUncovered() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(coveredOrUncoveredField));
  }
  public NewOrderSingle setCoveredOrUncovered(final int value) {
    setField(FieldValue.to(coveredOrUncoveredField, value));
    return this;
  }
  public NewOrderSingle setCoveredOrUncovered(final quickfix.field.CoveredOrUncovered value) {
    setField(FieldValue.to(coveredOrUncoveredField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField maxShowField = FieldFactory.newDoubleField(210);
  public boolean hasMaxShow() throws quickfix.FieldNotFound {
    return isSetField(210);
  }
  public double getMaxShow() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxShowField));
  }
  public NewOrderSingle setMaxShow(final double value) {
    setField(FieldValue.to(maxShowField, value));
    return this;
  }
  public NewOrderSingle setMaxShow(final quickfix.field.MaxShow value) {
    setField(FieldValue.to(maxShowField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.DoubleField pegOffsetValueField = FieldFactory.newDoubleField(211);
  public boolean hasPegOffsetValue() throws quickfix.FieldNotFound {
    return isSetField(211);
  }
  public double getPegOffsetValue() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegOffsetValueField));
  }
  public NewOrderSingle setPegOffsetValue(final double value) {
    setField(FieldValue.to(pegOffsetValueField, value));
    return this;
  }
  public NewOrderSingle setPegOffsetValue(final quickfix.field.PegOffsetValue value) {
    setField(FieldValue.to(pegOffsetValueField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField pegMoveTypeField = FieldFactory.newIntField(835);
  public boolean hasPegMoveType() throws quickfix.FieldNotFound {
    return isSetField(835);
  }
  public int getPegMoveType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(pegMoveTypeField));
  }
  public NewOrderSingle setPegMoveType(final int value) {
    setField(FieldValue.to(pegMoveTypeField, value));
    return this;
  }
  public NewOrderSingle setPegMoveType(final quickfix.field.PegMoveType value) {
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
  public NewOrderSingle setPegOffsetType(final int value) {
    setField(FieldValue.to(pegOffsetTypeField, value));
    return this;
  }
  public NewOrderSingle setPegOffsetType(final quickfix.field.PegOffsetType value) {
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
  public NewOrderSingle setPegLimitType(final int value) {
    setField(FieldValue.to(pegLimitTypeField, value));
    return this;
  }
  public NewOrderSingle setPegLimitType(final quickfix.field.PegLimitType value) {
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
  public NewOrderSingle setPegRoundDirection(final int value) {
    setField(FieldValue.to(pegRoundDirectionField, value));
    return this;
  }
  public NewOrderSingle setPegRoundDirection(final quickfix.field.PegRoundDirection value) {
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
  public NewOrderSingle setPegScope(final int value) {
    setField(FieldValue.to(pegScopeField, value));
    return this;
  }
  public NewOrderSingle setPegScope(final quickfix.field.PegScope value) {
    setField(FieldValue.to(pegScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField discretionInstField = FieldFactory.newCharField(388);
  public boolean hasDiscretionInst() throws quickfix.FieldNotFound {
    return isSetField(388);
  }
  public int getDiscretionInst() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(discretionInstField));
  }
  public NewOrderSingle setDiscretionInst(final int value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public NewOrderSingle setDiscretionInst(final char value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public NewOrderSingle setDiscretionInst(final String value) {
    setField(FieldValue.to(discretionInstField, value));
    return this;
  }
  public NewOrderSingle setDiscretionInst(final quickfix.field.DiscretionInst value) {
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
  public NewOrderSingle setDiscretionOffsetValue(final double value) {
    setField(FieldValue.to(discretionOffsetValueField, value));
    return this;
  }
  public NewOrderSingle setDiscretionOffsetValue(final quickfix.field.DiscretionOffsetValue value) {
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
  public NewOrderSingle setDiscretionMoveType(final int value) {
    setField(FieldValue.to(discretionMoveTypeField, value));
    return this;
  }
  public NewOrderSingle setDiscretionMoveType(final quickfix.field.DiscretionMoveType value) {
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
  public NewOrderSingle setDiscretionOffsetType(final int value) {
    setField(FieldValue.to(discretionOffsetTypeField, value));
    return this;
  }
  public NewOrderSingle setDiscretionOffsetType(final quickfix.field.DiscretionOffsetType value) {
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
  public NewOrderSingle setDiscretionLimitType(final int value) {
    setField(FieldValue.to(discretionLimitTypeField, value));
    return this;
  }
  public NewOrderSingle setDiscretionLimitType(final quickfix.field.DiscretionLimitType value) {
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
  public NewOrderSingle setDiscretionRoundDirection(final int value) {
    setField(FieldValue.to(discretionRoundDirectionField, value));
    return this;
  }
  public NewOrderSingle setDiscretionRoundDirection(
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
  public NewOrderSingle setDiscretionScope(final int value) {
    setField(FieldValue.to(discretionScopeField, value));
    return this;
  }
  public NewOrderSingle setDiscretionScope(final quickfix.field.DiscretionScope value) {
    setField(FieldValue.to(discretionScopeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField targetStrategyField = FieldFactory.newIntField(847);
  public boolean hasTargetStrategy() throws quickfix.FieldNotFound {
    return isSetField(847);
  }
  public int getTargetStrategy() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetStrategyField));
  }
  public NewOrderSingle setTargetStrategy(final int value) {
    setField(FieldValue.to(targetStrategyField, value));
    return this;
  }
  public NewOrderSingle setTargetStrategy(final quickfix.field.TargetStrategy value) {
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
  public NewOrderSingle setTargetStrategyParameters(final String value) {
    setField(FieldValue.to(targetStrategyParametersField, value));
    return this;
  }
  public NewOrderSingle setTargetStrategyParameters(
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
  public NewOrderSingle setParticipationRate(final double value) {
    setField(FieldValue.to(participationRateField, value));
    return this;
  }
  public NewOrderSingle setParticipationRate(final quickfix.field.ParticipationRate value) {
    setField(FieldValue.to(participationRateField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.CharField cancellationRightsField = FieldFactory.newCharField(480);
  public boolean hasCancellationRights() throws quickfix.FieldNotFound {
    return isSetField(480);
  }
  public int getCancellationRights() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(cancellationRightsField));
  }
  public NewOrderSingle setCancellationRights(final int value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public NewOrderSingle setCancellationRights(final char value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public NewOrderSingle setCancellationRights(final String value) {
    setField(FieldValue.to(cancellationRightsField, value));
    return this;
  }
  public NewOrderSingle setCancellationRights(final quickfix.field.CancellationRights value) {
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
  public NewOrderSingle setMoneyLaunderingStatus(final int value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public NewOrderSingle setMoneyLaunderingStatus(final char value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public NewOrderSingle setMoneyLaunderingStatus(final String value) {
    setField(FieldValue.to(moneyLaunderingStatusField, value));
    return this;
  }
  public NewOrderSingle setMoneyLaunderingStatus(final quickfix.field.MoneyLaunderingStatus value) {
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
  public NewOrderSingle setRegistId(final String value) {
    setField(FieldValue.to(registIdField, value));
    return this;
  }
  public NewOrderSingle setRegistId(final quickfix.field.RegistID value) {
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
  public NewOrderSingle setDesignation(final String value) {
    setField(FieldValue.to(designationField, value));
    return this;
  }
  public NewOrderSingle setDesignation(final quickfix.field.Designation value) {
    setField(FieldValue.to(designationField, FieldValue.of(value)));
    return this;
  }

  public NewOrderSingle() {
    super(new int[] {11, 526, 583, 229, 75, 1, 660, 581, 589, 590, 591, 70, 63, 64, 544, 635, 21,
        18, 110, 111, 100, 81, 55, 65, 48, 22, 460, 461, 167, 762, 200, 541, 201, 224, 225, 239,
        226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349,
        107, 350, 351, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898,
        140, 54, 114, 60, 854, 38, 152, 516, 468, 469, 40, 423, 44, 99, 218, 220, 221, 222, 662,
        663, 699, 761, 235, 236, 701, 696, 697, 698, 15, 376, 377, 23, 117, 59, 168, 432, 126, 427,
        12, 13, 479, 497, 528, 529, 582, 121, 120, 775, 58, 354, 355, 193, 192, 640, 77, 203, 210,
        211, 835, 836, 837, 838, 840, 388, 389, 841, 842, 843, 844, 846, 847, 848, 849, 480, 481,
        513, 494, 0});
  }

  public NewOrderSingle(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {11, 526, 583, 229, 75, 1, 660, 581, 589, 590, 591, 70, 63, 64, 544, 635, 21,
        18, 110, 111, 100, 81, 55, 65, 48, 22, 460, 461, 167, 762, 200, 541, 201, 224, 225, 239,
        226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349,
        107, 350, 351, 691, 667, 875, 876, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898,
        140, 54, 114, 60, 854, 38, 152, 516, 468, 469, 40, 423, 44, 99, 218, 220, 221, 222, 662,
        663, 699, 761, 235, 236, 701, 696, 697, 698, 15, 376, 377, 23, 117, 59, 168, 432, 126, 427,
        12, 13, 479, 497, 528, 529, 582, 121, 120, 775, 58, 354, 355, 193, 192, 640, 77, 203, 210,
        211, 835, 836, 837, 838, 840, 388, 389, 841, 842, 843, 844, 846, 847, 848, 849, 480, 481,
        513, 494, 0});
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

  public static Function<garden_leave.gateway.transform.fix44.NewOrderSingle,
      garden_leave.fix44.proto.FIX44Protos.NewOrderSingle> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.getDefaultInstance();
    }

    final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.Builder builder =
        garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.newBuilder();
    final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.FieldPresence
        .Builder presenceBuilder =
        garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix44.Header header =
        (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

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
      if (fix.hasTradeOriginationDate()) {
        builder.setTradeOriginationDate(fix.getTradeOriginationDate());
        presenceBuilder.setTradeOriginationDate(true);
      }
      if (fix.hasTradeDate()) {
        builder.setTradeDate(fix.getTradeDate());
        presenceBuilder.setTradeDate(true);
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
      if (fix.hasCashMargin()) {
        builder.setCashMargin(fix.getCashMargin());
        presenceBuilder.setCashMargin(true);
      }
      if (fix.hasClearingFeeIndicator()) {
        builder.setClearingFeeIndicator(fix.getClearingFeeIndicator());
        presenceBuilder.setClearingFeeIndicator(true);
      }
      if (fix.hasHandlInst()) {
        builder.setHandlInst(fix.getHandlInst());
        presenceBuilder.setHandlInst(true);
      }
      if (fix.hasExecInst()) {
        builder.setExecInst(fix.getExecInst());
        presenceBuilder.setExecInst(true);
      }
      if (fix.hasMinQty()) {
        builder.setMinQty(fix.getMinQty());
        presenceBuilder.setMinQty(true);
      }
      if (fix.hasMaxFloor()) {
        builder.setMaxFloor(fix.getMaxFloor());
        presenceBuilder.setMaxFloor(true);
      }
      if (fix.hasExDestination()) {
        builder.setExDestination(fix.getExDestination());
        presenceBuilder.setExDestination(true);
      }
      if (fix.hasProcessCode()) {
        builder.setProcessCode(fix.getProcessCode());
        presenceBuilder.setProcessCode(true);
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
      if (fix.hasPutOrCall()) {
        builder.setPutOrCall(fix.getPutOrCall());
        presenceBuilder.setPutOrCall(true);
      }
      if (fix.hasCouponPaymentDate()) {
        builder.setCouponPaymentDate(fix.getCouponPaymentDate());
        presenceBuilder.setCouponPaymentDate(true);
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
      if (fix.hasPrevClosePx()) {
        builder.setPrevClosePx(fix.getPrevClosePx());
        presenceBuilder.setPrevClosePx(true);
      }
      if (fix.hasSide()) {
        builder.setSide(fix.getSide());
        presenceBuilder.setSide(true);
      }
      if (fix.hasLocateReqd()) {
        builder.setLocateReqd(fix.getLocateReqd());
        presenceBuilder.setLocateReqd(true);
      }
      if (fix.hasTransactTime()) {
        builder.setTransactTime(fix.getTransactTime());
        presenceBuilder.setTransactTime(true);
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
      if (fix.hasStopPx()) {
        builder.setStopPx(fix.getStopPx());
        presenceBuilder.setStopPx(true);
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
      if (fix.hasIoiId()) {
        builder.setIoiId(fix.getIoiId());
        presenceBuilder.setIoiId(true);
      }
      if (fix.hasQuoteId()) {
        builder.setQuoteId(fix.getQuoteId());
        presenceBuilder.setQuoteId(true);
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
      if (fix.hasGtBookingInst()) {
        builder.setGtBookingInst(fix.getGtBookingInst());
        presenceBuilder.setGtBookingInst(true);
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
      if (fix.hasOrderCapacity()) {
        builder.setOrderCapacity(fix.getOrderCapacity());
        presenceBuilder.setOrderCapacity(true);
      }
      if (fix.hasOrderRestrictions()) {
        builder.setOrderRestrictions(fix.getOrderRestrictions());
        presenceBuilder.setOrderRestrictions(true);
      }
      if (fix.hasCustOrderCapacity()) {
        builder.setCustOrderCapacity(fix.getCustOrderCapacity());
        presenceBuilder.setCustOrderCapacity(true);
      }
      if (fix.hasForexReq()) {
        builder.setForexReq(fix.getForexReq());
        presenceBuilder.setForexReq(true);
      }
      if (fix.hasSettlCurrency()) {
        builder.setSettlCurrency(fix.getSettlCurrency());
        presenceBuilder.setSettlCurrency(true);
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
      if (fix.hasPrice2()) {
        builder.setPrice2(fix.getPrice2());
        presenceBuilder.setPrice2(true);
      }
      if (fix.hasPositionEffect()) {
        builder.setPositionEffect(fix.getPositionEffect());
        presenceBuilder.setPositionEffect(true);
      }
      if (fix.hasCoveredOrUncovered()) {
        builder.setCoveredOrUncovered(fix.getCoveredOrUncovered());
        presenceBuilder.setCoveredOrUncovered(true);
      }
      if (fix.hasMaxShow()) {
        builder.setMaxShow(fix.getMaxShow());
        presenceBuilder.setMaxShow(true);
      }
      if (fix.hasPegOffsetValue()) {
        builder.setPegOffsetValue(fix.getPegOffsetValue());
        presenceBuilder.setPegOffsetValue(true);
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
      final int noPartyIdsGroupCount = fix.getGroupCount(453);
      for (int i = 1; i <= noPartyIdsGroupCount; i++) {
        final NewOrderSingle.NoPartyIds group = new NewOrderSingle.NoPartyIds();
        fix.getGroup(i, group);
        builder.addNoPartyIds(group.toBuilder().build());
      }

      final int noAllocsGroupCount = fix.getGroupCount(78);
      for (int i = 1; i <= noAllocsGroupCount; i++) {
        final NewOrderSingle.NoAllocs group = new NewOrderSingle.NoAllocs();
        fix.getGroup(i, group);
        builder.addNoAllocs(group.toBuilder().build());
      }

      final int noTradingSessionsGroupCount = fix.getGroupCount(386);
      for (int i = 1; i <= noTradingSessionsGroupCount; i++) {
        final NewOrderSingle.NoTradingSessions group = new NewOrderSingle.NoTradingSessions();
        fix.getGroup(i, group);
        builder.addNoTradingSessions(group.toBuilder().build());
      }

      final int noSecurityAltIdGroupCount = fix.getGroupCount(454);
      for (int i = 1; i <= noSecurityAltIdGroupCount; i++) {
        final NewOrderSingle.NoSecurityAltId group = new NewOrderSingle.NoSecurityAltId();
        fix.getGroup(i, group);
        builder.addNoSecurityAltId(group.toBuilder().build());
      }

      final int noEventsGroupCount = fix.getGroupCount(864);
      for (int i = 1; i <= noEventsGroupCount; i++) {
        final NewOrderSingle.NoEvents group = new NewOrderSingle.NoEvents();
        fix.getGroup(i, group);
        builder.addNoEvents(group.toBuilder().build());
      }

      final int noUnderlyingsGroupCount = fix.getGroupCount(711);
      for (int i = 1; i <= noUnderlyingsGroupCount; i++) {
        final NewOrderSingle.NoUnderlyings group = new NewOrderSingle.NoUnderlyings();
        fix.getGroup(i, group);
        builder.addNoUnderlyings(group.toBuilder().build());
      }

      final int noStipulationsGroupCount = fix.getGroupCount(232);
      for (int i = 1; i <= noStipulationsGroupCount; i++) {
        final NewOrderSingle.NoStipulations group = new NewOrderSingle.NoStipulations();
        fix.getGroup(i, group);
        builder.addNoStipulations(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("newOrderSingle error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix44.proto.FIX44Protos.NewOrderSingle,
      garden_leave.gateway.transform.fix44.NewOrderSingle> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix44.NewOrderSingle.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix44.NewOrderSingle fix =
          new garden_leave.gateway.transform.fix44.NewOrderSingle();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix44.Header header =
          (garden_leave.gateway.transform.fix44.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix44.proto.FIX44Protos.NewOrderSingle.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getClOrdId()) {
        fix.setClOrdId(proto.getClOrdId());
      }
      if (fieldPresence.getSecondaryClOrdId()) {
        fix.setSecondaryClOrdId(proto.getSecondaryClOrdId());
      }
      if (fieldPresence.getClOrdLinkId()) {
        fix.setClOrdLinkId(proto.getClOrdLinkId());
      }
      if (fieldPresence.getTradeOriginationDate()) {
        fix.setTradeOriginationDate(proto.getTradeOriginationDate());
      }
      if (fieldPresence.getTradeDate()) {
        fix.setTradeDate(proto.getTradeDate());
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
      if (fieldPresence.getCashMargin()) {
        fix.setCashMargin(proto.getCashMargin());
      }
      if (fieldPresence.getClearingFeeIndicator()) {
        fix.setClearingFeeIndicator(proto.getClearingFeeIndicator());
      }
      if (fieldPresence.getHandlInst()) {
        fix.setHandlInst(proto.getHandlInst());
      }
      if (fieldPresence.getExecInst()) {
        fix.setExecInst(proto.getExecInst());
      }
      if (fieldPresence.getMinQty()) {
        fix.setMinQty(proto.getMinQty());
      }
      if (fieldPresence.getMaxFloor()) {
        fix.setMaxFloor(proto.getMaxFloor());
      }
      if (fieldPresence.getExDestination()) {
        fix.setExDestination(proto.getExDestination());
      }
      if (fieldPresence.getProcessCode()) {
        fix.setProcessCode(proto.getProcessCode());
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
      if (fieldPresence.getPutOrCall()) {
        fix.setPutOrCall(proto.getPutOrCall());
      }
      if (fieldPresence.getCouponPaymentDate()) {
        fix.setCouponPaymentDate(proto.getCouponPaymentDate());
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
      if (fieldPresence.getPrevClosePx()) {
        fix.setPrevClosePx(proto.getPrevClosePx());
      }
      if (fieldPresence.getSide()) {
        fix.setSide(proto.getSide());
      }
      if (fieldPresence.getLocateReqd()) {
        fix.setLocateReqd(proto.getLocateReqd());
      }
      if (fieldPresence.getTransactTime()) {
        fix.setTransactTime(proto.getTransactTime());
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
      if (fieldPresence.getOrdType()) {
        fix.setOrdType(proto.getOrdType());
      }
      if (fieldPresence.getPriceType()) {
        fix.setPriceType(proto.getPriceType());
      }
      if (fieldPresence.getPrice()) {
        fix.setPrice(proto.getPrice());
      }
      if (fieldPresence.getStopPx()) {
        fix.setStopPx(proto.getStopPx());
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
      if (fieldPresence.getCurrency()) {
        fix.setCurrency(proto.getCurrency());
      }
      if (fieldPresence.getComplianceId()) {
        fix.setComplianceId(proto.getComplianceId());
      }
      if (fieldPresence.getSolicitedFlag()) {
        fix.setSolicitedFlag(proto.getSolicitedFlag());
      }
      if (fieldPresence.getIoiId()) {
        fix.setIoiId(proto.getIoiId());
      }
      if (fieldPresence.getQuoteId()) {
        fix.setQuoteId(proto.getQuoteId());
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
      if (fieldPresence.getGtBookingInst()) {
        fix.setGtBookingInst(proto.getGtBookingInst());
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
      if (fieldPresence.getOrderCapacity()) {
        fix.setOrderCapacity(proto.getOrderCapacity());
      }
      if (fieldPresence.getOrderRestrictions()) {
        fix.setOrderRestrictions(proto.getOrderRestrictions());
      }
      if (fieldPresence.getCustOrderCapacity()) {
        fix.setCustOrderCapacity(proto.getCustOrderCapacity());
      }
      if (fieldPresence.getForexReq()) {
        fix.setForexReq(proto.getForexReq());
      }
      if (fieldPresence.getSettlCurrency()) {
        fix.setSettlCurrency(proto.getSettlCurrency());
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
      if (fieldPresence.getPrice2()) {
        fix.setPrice2(proto.getPrice2());
      }
      if (fieldPresence.getPositionEffect()) {
        fix.setPositionEffect(proto.getPositionEffect());
      }
      if (fieldPresence.getCoveredOrUncovered()) {
        fix.setCoveredOrUncovered(proto.getCoveredOrUncovered());
      }
      if (fieldPresence.getMaxShow()) {
        fix.setMaxShow(proto.getMaxShow());
      }
      if (fieldPresence.getPegOffsetValue()) {
        fix.setPegOffsetValue(proto.getPegOffsetValue());
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
      if (fieldPresence.getTargetStrategy()) {
        fix.setTargetStrategy(proto.getTargetStrategy());
      }
      if (fieldPresence.getTargetStrategyParameters()) {
        fix.setTargetStrategyParameters(proto.getTargetStrategyParameters());
      }
      if (fieldPresence.getParticipationRate()) {
        fix.setParticipationRate(proto.getParticipationRate());
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
      for (int i = 0; i < proto.getNoPartyIdsCount(); i++) {
        final NewOrderSingle.NoPartyIds group = new NewOrderSingle.NoPartyIds();
        group.fromProto(proto.getNoPartyIds(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoAllocsCount(); i++) {
        final NewOrderSingle.NoAllocs group = new NewOrderSingle.NoAllocs();
        group.fromProto(proto.getNoAllocs(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoTradingSessionsCount(); i++) {
        final NewOrderSingle.NoTradingSessions group = new NewOrderSingle.NoTradingSessions();
        group.fromProto(proto.getNoTradingSessions(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoSecurityAltIdCount(); i++) {
        final NewOrderSingle.NoSecurityAltId group = new NewOrderSingle.NoSecurityAltId();
        group.fromProto(proto.getNoSecurityAltId(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoEventsCount(); i++) {
        final NewOrderSingle.NoEvents group = new NewOrderSingle.NoEvents();
        group.fromProto(proto.getNoEvents(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoUnderlyingsCount(); i++) {
        final NewOrderSingle.NoUnderlyings group = new NewOrderSingle.NoUnderlyings();
        group.fromProto(proto.getNoUnderlyings(i));
        fix.addGroupRef(group);
      }
      for (int i = 0; i < proto.getNoStipulationsCount(); i++) {
        final NewOrderSingle.NoStipulations group = new NewOrderSingle.NoStipulations();
        group.fromProto(proto.getNoStipulations(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
