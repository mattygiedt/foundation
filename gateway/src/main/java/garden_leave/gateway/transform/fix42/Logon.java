package garden_leave.gateway.transform.fix42;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.502191600
//

public final class Logon extends quickfix.Message {
  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Logon.class);

  private static final io.opentelemetry.api.trace.Tracer tracer =
      garden_leave.utils.Telemetry.getInstance().getTracer(Logon.class);
  private io.opentelemetry.api.trace.Span span = null;
  public io.opentelemetry.api.trace.Span getSpan() {
    return span;
  }
  public Logon setSpan(final io.opentelemetry.api.trace.Span span) {
    this.span = span;
    return this;
  }

  public static final String BEGINSTR = "FIX.4.2";
  public static final String MSGTYPE = "A";

  public final String UUID = java.util.UUID.randomUUID().toString();

  public static class NoMsgTypes extends quickfix.Group {
    private final quickfix.StringField refMsgTypeField = FieldFactory.newStringField(372);
    public boolean hasRefMsgType() throws quickfix.FieldNotFound {
      return isSetField(372);
    }
    public String getRefMsgType() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(refMsgTypeField));
    }
    public NoMsgTypes setRefMsgType(final String value) {
      setField(FieldValue.to(refMsgTypeField, value));
      return this;
    }
    public NoMsgTypes setRefMsgType(final quickfix.field.RefMsgType value) {
      setField(FieldValue.to(refMsgTypeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.CharField msgDirectionField = FieldFactory.newCharField(385);
    public boolean hasMsgDirection() throws quickfix.FieldNotFound {
      return isSetField(385);
    }
    public int getMsgDirection() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(msgDirectionField));
    }
    public NoMsgTypes setMsgDirection(final int value) {
      setField(FieldValue.to(msgDirectionField, value));
      return this;
    }
    public NoMsgTypes setMsgDirection(final char value) {
      setField(FieldValue.to(msgDirectionField, value));
      return this;
    }
    public NoMsgTypes setMsgDirection(final String value) {
      setField(FieldValue.to(msgDirectionField, value));
      return this;
    }
    public NoMsgTypes setMsgDirection(final quickfix.field.MsgDirection value) {
      setField(FieldValue.to(msgDirectionField, FieldValue.of(value)));
      return this;
    }

    public NoMsgTypes() {
      super(384, 372, new int[] {372, 385, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes proto) {
      final garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getRefMsgType()) {
        this.setRefMsgType(proto.getRefMsgType());
      }
      if (fieldPresence.getMsgDirection()) {
        this.setMsgDirection(proto.getMsgDirection());
      }
    }

    public garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.Builder builder =
          garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.newBuilder();
      final garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix42.proto.FIX42Protos.Logon.NoMsgTypes.FieldPresence.newBuilder();

      if (this.hasRefMsgType()) {
        builder.setRefMsgType(this.getRefMsgType());
        presenceBuilder.setRefMsgType(true);
      }
      if (this.hasMsgDirection()) {
        builder.setMsgDirection(this.getMsgDirection());
        presenceBuilder.setMsgDirection(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  private final quickfix.IntField encryptMethodField = FieldFactory.newIntField(98);
  public boolean hasEncryptMethod() throws quickfix.FieldNotFound {
    return isSetField(98);
  }
  public int getEncryptMethod() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptMethodField));
  }
  public Logon setEncryptMethod(final int value) {
    setField(FieldValue.to(encryptMethodField, value));
    return this;
  }
  public Logon setEncryptMethod(final quickfix.field.EncryptMethod value) {
    setField(FieldValue.to(encryptMethodField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField heartBtIntField = FieldFactory.newIntField(108);
  public boolean hasHeartBtInt() throws quickfix.FieldNotFound {
    return isSetField(108);
  }
  public int getHeartBtInt() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(heartBtIntField));
  }
  public Logon setHeartBtInt(final int value) {
    setField(FieldValue.to(heartBtIntField, value));
    return this;
  }
  public Logon setHeartBtInt(final quickfix.field.HeartBtInt value) {
    setField(FieldValue.to(heartBtIntField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField rawDataLengthField = FieldFactory.newIntField(95);
  public boolean hasRawDataLength() throws quickfix.FieldNotFound {
    return isSetField(95);
  }
  public int getRawDataLength() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(rawDataLengthField));
  }
  public Logon setRawDataLength(final int value) {
    setField(FieldValue.to(rawDataLengthField, value));
    return this;
  }
  public Logon setRawDataLength(final quickfix.field.RawDataLength value) {
    setField(FieldValue.to(rawDataLengthField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField rawDataField = FieldFactory.newStringField(96);
  public boolean hasRawData() throws quickfix.FieldNotFound {
    return isSetField(96);
  }
  public String getRawData() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(rawDataField));
  }
  public Logon setRawData(final String value) {
    setField(FieldValue.to(rawDataField, value));
    return this;
  }
  public Logon setRawData(final quickfix.field.RawData value) {
    setField(FieldValue.to(rawDataField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField resetSeqNumFlagField = FieldFactory.newBooleanField(141);
  public boolean hasResetSeqNumFlag() throws quickfix.FieldNotFound {
    return isSetField(141);
  }
  public boolean getResetSeqNumFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(resetSeqNumFlagField));
  }
  public Logon setResetSeqNumFlag(final boolean value) {
    setField(FieldValue.to(resetSeqNumFlagField, value));
    return this;
  }
  public Logon setResetSeqNumFlag(final quickfix.field.ResetSeqNumFlag value) {
    setField(FieldValue.to(resetSeqNumFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField maxMessageSizeField = FieldFactory.newIntField(383);
  public boolean hasMaxMessageSize() throws quickfix.FieldNotFound {
    return isSetField(383);
  }
  public int getMaxMessageSize() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(maxMessageSizeField));
  }
  public Logon setMaxMessageSize(final int value) {
    setField(FieldValue.to(maxMessageSizeField, value));
    return this;
  }
  public Logon setMaxMessageSize(final quickfix.field.MaxMessageSize value) {
    setField(FieldValue.to(maxMessageSizeField, FieldValue.of(value)));
    return this;
  }

  public Logon() {
    super(new int[] {98, 108, 95, 96, 141, 383, 0});
  }

  public Logon(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {98, 108, 95, 96, 141, 383, 0});
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

  public static Function<garden_leave.gateway.transform.fix42.Logon,
      garden_leave.fix42.proto.FIX42Protos.Logon> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fix42.proto.FIX42Protos.Logon.getDefaultInstance();
    }

    final garden_leave.fix42.proto.FIX42Protos.Logon.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.Logon.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.Logon.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.Logon.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fix42.Header header =
        (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
    try {
      builder.setMessageId(fix.UUID)
          .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
          .setHeader(header.toBuilder().build());

      if (fix.hasEncryptMethod()) {
        builder.setEncryptMethod(fix.getEncryptMethod());
        presenceBuilder.setEncryptMethod(true);
      }
      if (fix.hasHeartBtInt()) {
        builder.setHeartBtInt(fix.getHeartBtInt());
        presenceBuilder.setHeartBtInt(true);
      }
      if (fix.hasRawDataLength()) {
        builder.setRawDataLength(fix.getRawDataLength());
        presenceBuilder.setRawDataLength(true);
      }
      if (fix.hasRawData()) {
        builder.setRawData(fix.getRawData());
        presenceBuilder.setRawData(true);
      }
      if (fix.hasResetSeqNumFlag()) {
        builder.setResetSeqNumFlag(fix.getResetSeqNumFlag());
        presenceBuilder.setResetSeqNumFlag(true);
      }
      if (fix.hasMaxMessageSize()) {
        builder.setMaxMessageSize(fix.getMaxMessageSize());
        presenceBuilder.setMaxMessageSize(true);
      }
      final int noMsgTypesGroupCount = fix.getGroupCount(384);
      for (int i = 1; i <= noMsgTypesGroupCount; i++) {
        final Logon.NoMsgTypes group = new Logon.NoMsgTypes();
        fix.getGroup(i, group);
        builder.addNoMsgTypes(group.toBuilder().build());
      }

    } catch (final Throwable t) {
      logger.error("logon error:", t);
    }
    builder.setFieldPresence(presenceBuilder.build());
    return builder.build();
  };

  public static Function<garden_leave.fix42.proto.FIX42Protos.Logon,
      garden_leave.gateway.transform.fix42.Logon> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fix42.Logon.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fix42.Logon fix =
          new garden_leave.gateway.transform.fix42.Logon();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fix42.Header header =
          (garden_leave.gateway.transform.fix42.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fix42.proto.FIX42Protos.Logon.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getEncryptMethod()) {
        fix.setEncryptMethod(proto.getEncryptMethod());
      }
      if (fieldPresence.getHeartBtInt()) {
        fix.setHeartBtInt(proto.getHeartBtInt());
      }
      if (fieldPresence.getRawDataLength()) {
        fix.setRawDataLength(proto.getRawDataLength());
      }
      if (fieldPresence.getRawData()) {
        fix.setRawData(proto.getRawData());
      }
      if (fieldPresence.getResetSeqNumFlag()) {
        fix.setResetSeqNumFlag(proto.getResetSeqNumFlag());
      }
      if (fieldPresence.getMaxMessageSize()) {
        fix.setMaxMessageSize(proto.getMaxMessageSize());
      }
      for (int i = 0; i < proto.getNoMsgTypesCount(); i++) {
        final Logon.NoMsgTypes group = new Logon.NoMsgTypes();
        group.fromProto(proto.getNoMsgTypes(i));
        fix.addGroupRef(group);
      }
      return fix;
    } finally {
      span.end();
    }
  };
}
