package garden_leave.gateway.transform.fixt11;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;
import java.util.function.Function;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:05.417397
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

  public static final String BEGINSTR = "FIXT.1.1";
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

    private final quickfix.StringField refApplVerIdField = FieldFactory.newStringField(1130);
    public boolean hasRefApplVerId() throws quickfix.FieldNotFound {
      return isSetField(1130);
    }
    public String getRefApplVerId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(refApplVerIdField));
    }
    public NoMsgTypes setRefApplVerId(final String value) {
      setField(FieldValue.to(refApplVerIdField, value));
      return this;
    }
    public NoMsgTypes setRefApplVerId(final quickfix.field.RefApplVerID value) {
      setField(FieldValue.to(refApplVerIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField refApplExtIdField = FieldFactory.newIntField(1406);
    public boolean hasRefApplExtId() throws quickfix.FieldNotFound {
      return isSetField(1406);
    }
    public int getRefApplExtId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(refApplExtIdField));
    }
    public NoMsgTypes setRefApplExtId(final int value) {
      setField(FieldValue.to(refApplExtIdField, value));
      return this;
    }
    public NoMsgTypes setRefApplExtId(final quickfix.field.RefApplExtID value) {
      setField(FieldValue.to(refApplExtIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.StringField refCstmApplVerIdField = FieldFactory.newStringField(1131);
    public boolean hasRefCstmApplVerId() throws quickfix.FieldNotFound {
      return isSetField(1131);
    }
    public String getRefCstmApplVerId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(refCstmApplVerIdField));
    }
    public NoMsgTypes setRefCstmApplVerId(final String value) {
      setField(FieldValue.to(refCstmApplVerIdField, value));
      return this;
    }
    public NoMsgTypes setRefCstmApplVerId(final quickfix.field.RefCstmApplVerID value) {
      setField(FieldValue.to(refCstmApplVerIdField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.BooleanField defaultVerIndicatorField =
        FieldFactory.newBooleanField(1410);
    public boolean hasDefaultVerIndicator() throws quickfix.FieldNotFound {
      return isSetField(1410);
    }
    public boolean getDefaultVerIndicator() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(defaultVerIndicatorField));
    }
    public NoMsgTypes setDefaultVerIndicator(final boolean value) {
      setField(FieldValue.to(defaultVerIndicatorField, value));
      return this;
    }
    public NoMsgTypes setDefaultVerIndicator(final quickfix.field.DefaultVerIndicator value) {
      setField(FieldValue.to(defaultVerIndicatorField, FieldValue.of(value)));
      return this;
    }

    public NoMsgTypes() {
      super(384, 372, new int[] {372, 385, 1130, 1406, 1131, 1410, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes proto) {
      final garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getRefMsgType()) {
        this.setRefMsgType(proto.getRefMsgType());
      }
      if (fieldPresence.getMsgDirection()) {
        this.setMsgDirection(proto.getMsgDirection());
      }
      if (fieldPresence.getRefApplVerId()) {
        this.setRefApplVerId(proto.getRefApplVerId());
      }
      if (fieldPresence.getRefApplExtId()) {
        this.setRefApplExtId(proto.getRefApplExtId());
      }
      if (fieldPresence.getRefCstmApplVerId()) {
        this.setRefCstmApplVerId(proto.getRefCstmApplVerId());
      }
      if (fieldPresence.getDefaultVerIndicator()) {
        this.setDefaultVerIndicator(proto.getDefaultVerIndicator());
      }
    }

    public garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.Builder builder =
          garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.newBuilder();
      final garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fixt11.proto.FIXT11Protos.Logon.NoMsgTypes.FieldPresence.newBuilder();

      if (this.hasRefMsgType()) {
        builder.setRefMsgType(this.getRefMsgType());
        presenceBuilder.setRefMsgType(true);
      }
      if (this.hasMsgDirection()) {
        builder.setMsgDirection(this.getMsgDirection());
        presenceBuilder.setMsgDirection(true);
      }
      if (this.hasRefApplVerId()) {
        builder.setRefApplVerId(this.getRefApplVerId());
        presenceBuilder.setRefApplVerId(true);
      }
      if (this.hasRefApplExtId()) {
        builder.setRefApplExtId(this.getRefApplExtId());
        presenceBuilder.setRefApplExtId(true);
      }
      if (this.hasRefCstmApplVerId()) {
        builder.setRefCstmApplVerId(this.getRefCstmApplVerId());
        presenceBuilder.setRefCstmApplVerId(true);
      }
      if (this.hasDefaultVerIndicator()) {
        builder.setDefaultVerIndicator(this.getDefaultVerIndicator());
        presenceBuilder.setDefaultVerIndicator(true);
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

  private final quickfix.IntField nextExpectedMsgSeqNumField = FieldFactory.newIntField(789);
  public boolean hasNextExpectedMsgSeqNum() throws quickfix.FieldNotFound {
    return isSetField(789);
  }
  public int getNextExpectedMsgSeqNum() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(nextExpectedMsgSeqNumField));
  }
  public Logon setNextExpectedMsgSeqNum(final int value) {
    setField(FieldValue.to(nextExpectedMsgSeqNumField, value));
    return this;
  }
  public Logon setNextExpectedMsgSeqNum(final quickfix.field.NextExpectedMsgSeqNum value) {
    setField(FieldValue.to(nextExpectedMsgSeqNumField, FieldValue.of(value)));
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

  private final quickfix.BooleanField testMessageIndicatorField = FieldFactory.newBooleanField(464);
  public boolean hasTestMessageIndicator() throws quickfix.FieldNotFound {
    return isSetField(464);
  }
  public boolean getTestMessageIndicator() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(testMessageIndicatorField));
  }
  public Logon setTestMessageIndicator(final boolean value) {
    setField(FieldValue.to(testMessageIndicatorField, value));
    return this;
  }
  public Logon setTestMessageIndicator(final quickfix.field.TestMessageIndicator value) {
    setField(FieldValue.to(testMessageIndicatorField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField usernameField = FieldFactory.newStringField(553);
  public boolean hasUsername() throws quickfix.FieldNotFound {
    return isSetField(553);
  }
  public String getUsername() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(usernameField));
  }
  public Logon setUsername(final String value) {
    setField(FieldValue.to(usernameField, value));
    return this;
  }
  public Logon setUsername(final quickfix.field.Username value) {
    setField(FieldValue.to(usernameField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField passwordField = FieldFactory.newStringField(554);
  public boolean hasPassword() throws quickfix.FieldNotFound {
    return isSetField(554);
  }
  public String getPassword() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(passwordField));
  }
  public Logon setPassword(final String value) {
    setField(FieldValue.to(passwordField, value));
    return this;
  }
  public Logon setPassword(final quickfix.field.Password value) {
    setField(FieldValue.to(passwordField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField newPasswordField = FieldFactory.newStringField(925);
  public boolean hasNewPassword() throws quickfix.FieldNotFound {
    return isSetField(925);
  }
  public String getNewPassword() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(newPasswordField));
  }
  public Logon setNewPassword(final String value) {
    setField(FieldValue.to(newPasswordField, value));
    return this;
  }
  public Logon setNewPassword(final quickfix.field.NewPassword value) {
    setField(FieldValue.to(newPasswordField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encryptedPasswordMethodField = FieldFactory.newIntField(1400);
  public boolean hasEncryptedPasswordMethod() throws quickfix.FieldNotFound {
    return isSetField(1400);
  }
  public int getEncryptedPasswordMethod() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptedPasswordMethodField));
  }
  public Logon setEncryptedPasswordMethod(final int value) {
    setField(FieldValue.to(encryptedPasswordMethodField, value));
    return this;
  }
  public Logon setEncryptedPasswordMethod(final quickfix.field.EncryptedPasswordMethod value) {
    setField(FieldValue.to(encryptedPasswordMethodField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encryptedPasswordLenField = FieldFactory.newIntField(1401);
  public boolean hasEncryptedPasswordLen() throws quickfix.FieldNotFound {
    return isSetField(1401);
  }
  public int getEncryptedPasswordLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptedPasswordLenField));
  }
  public Logon setEncryptedPasswordLen(final int value) {
    setField(FieldValue.to(encryptedPasswordLenField, value));
    return this;
  }
  public Logon setEncryptedPasswordLen(final quickfix.field.EncryptedPasswordLen value) {
    setField(FieldValue.to(encryptedPasswordLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField encryptedPasswordField = FieldFactory.newStringField(1402);
  public boolean hasEncryptedPassword() throws quickfix.FieldNotFound {
    return isSetField(1402);
  }
  public String getEncryptedPassword() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptedPasswordField));
  }
  public Logon setEncryptedPassword(final String value) {
    setField(FieldValue.to(encryptedPasswordField, value));
    return this;
  }
  public Logon setEncryptedPassword(final quickfix.field.EncryptedPassword value) {
    setField(FieldValue.to(encryptedPasswordField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField encryptedNewPasswordLenField = FieldFactory.newIntField(1403);
  public boolean hasEncryptedNewPasswordLen() throws quickfix.FieldNotFound {
    return isSetField(1403);
  }
  public int getEncryptedNewPasswordLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptedNewPasswordLenField));
  }
  public Logon setEncryptedNewPasswordLen(final int value) {
    setField(FieldValue.to(encryptedNewPasswordLenField, value));
    return this;
  }
  public Logon setEncryptedNewPasswordLen(final quickfix.field.EncryptedNewPasswordLen value) {
    setField(FieldValue.to(encryptedNewPasswordLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField encryptedNewPasswordField = FieldFactory.newStringField(1404);
  public boolean hasEncryptedNewPassword() throws quickfix.FieldNotFound {
    return isSetField(1404);
  }
  public String getEncryptedNewPassword() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(encryptedNewPasswordField));
  }
  public Logon setEncryptedNewPassword(final String value) {
    setField(FieldValue.to(encryptedNewPasswordField, value));
    return this;
  }
  public Logon setEncryptedNewPassword(final quickfix.field.EncryptedNewPassword value) {
    setField(FieldValue.to(encryptedNewPasswordField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField sessionStatusField = FieldFactory.newIntField(1409);
  public boolean hasSessionStatus() throws quickfix.FieldNotFound {
    return isSetField(1409);
  }
  public int getSessionStatus() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sessionStatusField));
  }
  public Logon setSessionStatus(final int value) {
    setField(FieldValue.to(sessionStatusField, value));
    return this;
  }
  public Logon setSessionStatus(final quickfix.field.SessionStatus value) {
    setField(FieldValue.to(sessionStatusField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField defaultApplVerIdField = FieldFactory.newStringField(1137);
  public boolean hasDefaultApplVerId() throws quickfix.FieldNotFound {
    return isSetField(1137);
  }
  public String getDefaultApplVerId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(defaultApplVerIdField));
  }
  public Logon setDefaultApplVerId(final String value) {
    setField(FieldValue.to(defaultApplVerIdField, value));
    return this;
  }
  public Logon setDefaultApplVerId(final quickfix.field.DefaultApplVerID value) {
    setField(FieldValue.to(defaultApplVerIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField defaultApplExtIdField = FieldFactory.newIntField(1407);
  public boolean hasDefaultApplExtId() throws quickfix.FieldNotFound {
    return isSetField(1407);
  }
  public int getDefaultApplExtId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(defaultApplExtIdField));
  }
  public Logon setDefaultApplExtId(final int value) {
    setField(FieldValue.to(defaultApplExtIdField, value));
    return this;
  }
  public Logon setDefaultApplExtId(final quickfix.field.DefaultApplExtID value) {
    setField(FieldValue.to(defaultApplExtIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField defaultCstmApplVerIdField = FieldFactory.newStringField(1408);
  public boolean hasDefaultCstmApplVerId() throws quickfix.FieldNotFound {
    return isSetField(1408);
  }
  public String getDefaultCstmApplVerId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(defaultCstmApplVerIdField));
  }
  public Logon setDefaultCstmApplVerId(final String value) {
    setField(FieldValue.to(defaultCstmApplVerIdField, value));
    return this;
  }
  public Logon setDefaultCstmApplVerId(final quickfix.field.DefaultCstmApplVerID value) {
    setField(FieldValue.to(defaultCstmApplVerIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField textField = FieldFactory.newStringField(58);
  public boolean hasText() throws quickfix.FieldNotFound {
    return isSetField(58);
  }
  public String getText() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(textField));
  }
  public Logon setText(final String value) {
    setField(FieldValue.to(textField, value));
    return this;
  }
  public Logon setText(final quickfix.field.Text value) {
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
  public Logon setEncodedTextLen(final int value) {
    setField(FieldValue.to(encodedTextLenField, value));
    return this;
  }
  public Logon setEncodedTextLen(final quickfix.field.EncodedTextLen value) {
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
  public Logon setEncodedText(final String value) {
    setField(FieldValue.to(encodedTextField, value));
    return this;
  }
  public Logon setEncodedText(final quickfix.field.EncodedText value) {
    setField(FieldValue.to(encodedTextField, FieldValue.of(value)));
    return this;
  }

  public Logon() {
    super(new int[] {98, 108, 95, 96, 141, 789, 383, 464, 553, 554, 925, 1400, 1401, 1402, 1403,
        1404, 1409, 1137, 1407, 1408, 58, 354, 355, 0});
  }

  public Logon(final io.opentelemetry.api.trace.Span span) {
    super(new int[] {98, 108, 95, 96, 141, 789, 383, 464, 553, 554, 925, 1400, 1401, 1402, 1403,
        1404, 1409, 1137, 1407, 1408, 58, 354, 355, 0});
    this.span = span;
  }

  @Override
  protected quickfix.Message.Header newHeader() {
    return new garden_leave.gateway.transform.fixt11.Header(this, BEGINSTR, MSGTYPE);
  }

  @Override
  public void addGroup(final quickfix.Group group) {
    addGroupRef(group);
  }

  public static Function<garden_leave.gateway.transform.fixt11.Logon,
      garden_leave.fixt11.proto.FIXT11Protos.Logon> fixToProto = (fix) -> {
    if (fix == null) {
      return garden_leave.fixt11.proto.FIXT11Protos.Logon.getDefaultInstance();
    }

    final garden_leave.fixt11.proto.FIXT11Protos.Logon.Builder builder =
        garden_leave.fixt11.proto.FIXT11Protos.Logon.newBuilder();
    final garden_leave.fixt11.proto.FIXT11Protos.Logon.FieldPresence.Builder presenceBuilder =
        garden_leave.fixt11.proto.FIXT11Protos.Logon.FieldPresence.newBuilder();

    final garden_leave.gateway.transform.fixt11.Header header =
        (garden_leave.gateway.transform.fixt11.Header) fix.getHeader();
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
      if (fix.hasNextExpectedMsgSeqNum()) {
        builder.setNextExpectedMsgSeqNum(fix.getNextExpectedMsgSeqNum());
        presenceBuilder.setNextExpectedMsgSeqNum(true);
      }
      if (fix.hasMaxMessageSize()) {
        builder.setMaxMessageSize(fix.getMaxMessageSize());
        presenceBuilder.setMaxMessageSize(true);
      }
      if (fix.hasTestMessageIndicator()) {
        builder.setTestMessageIndicator(fix.getTestMessageIndicator());
        presenceBuilder.setTestMessageIndicator(true);
      }
      if (fix.hasUsername()) {
        builder.setUsername(fix.getUsername());
        presenceBuilder.setUsername(true);
      }
      if (fix.hasPassword()) {
        builder.setPassword(fix.getPassword());
        presenceBuilder.setPassword(true);
      }
      if (fix.hasNewPassword()) {
        builder.setNewPassword(fix.getNewPassword());
        presenceBuilder.setNewPassword(true);
      }
      if (fix.hasEncryptedPasswordMethod()) {
        builder.setEncryptedPasswordMethod(fix.getEncryptedPasswordMethod());
        presenceBuilder.setEncryptedPasswordMethod(true);
      }
      if (fix.hasEncryptedPasswordLen()) {
        builder.setEncryptedPasswordLen(fix.getEncryptedPasswordLen());
        presenceBuilder.setEncryptedPasswordLen(true);
      }
      if (fix.hasEncryptedPassword()) {
        builder.setEncryptedPassword(fix.getEncryptedPassword());
        presenceBuilder.setEncryptedPassword(true);
      }
      if (fix.hasEncryptedNewPasswordLen()) {
        builder.setEncryptedNewPasswordLen(fix.getEncryptedNewPasswordLen());
        presenceBuilder.setEncryptedNewPasswordLen(true);
      }
      if (fix.hasEncryptedNewPassword()) {
        builder.setEncryptedNewPassword(fix.getEncryptedNewPassword());
        presenceBuilder.setEncryptedNewPassword(true);
      }
      if (fix.hasSessionStatus()) {
        builder.setSessionStatus(fix.getSessionStatus());
        presenceBuilder.setSessionStatus(true);
      }
      if (fix.hasDefaultApplVerId()) {
        builder.setDefaultApplVerId(fix.getDefaultApplVerId());
        presenceBuilder.setDefaultApplVerId(true);
      }
      if (fix.hasDefaultApplExtId()) {
        builder.setDefaultApplExtId(fix.getDefaultApplExtId());
        presenceBuilder.setDefaultApplExtId(true);
      }
      if (fix.hasDefaultCstmApplVerId()) {
        builder.setDefaultCstmApplVerId(fix.getDefaultCstmApplVerId());
        presenceBuilder.setDefaultCstmApplVerId(true);
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

  public static Function<garden_leave.fixt11.proto.FIXT11Protos.Logon,
      garden_leave.gateway.transform.fixt11.Logon> protoToFix = (proto) -> {
    final io.opentelemetry.api.trace.Span span = garden_leave.utils.Telemetry.startSpan(
        tracer, "garden_leave.gateway.transform.fixt11.Logon.protoToFix");
    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {
      final garden_leave.gateway.transform.fixt11.Logon fix =
          new garden_leave.gateway.transform.fixt11.Logon();
      if (proto == null) {
        return fix;
      }

      final garden_leave.gateway.transform.fixt11.Header header =
          (garden_leave.gateway.transform.fixt11.Header) fix.getHeader();
      header.fromProto(proto.getHeader());

      final garden_leave.fixt11.proto.FIXT11Protos.Logon.FieldPresence fieldPresence =
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
      if (fieldPresence.getNextExpectedMsgSeqNum()) {
        fix.setNextExpectedMsgSeqNum(proto.getNextExpectedMsgSeqNum());
      }
      if (fieldPresence.getMaxMessageSize()) {
        fix.setMaxMessageSize(proto.getMaxMessageSize());
      }
      if (fieldPresence.getTestMessageIndicator()) {
        fix.setTestMessageIndicator(proto.getTestMessageIndicator());
      }
      if (fieldPresence.getUsername()) {
        fix.setUsername(proto.getUsername());
      }
      if (fieldPresence.getPassword()) {
        fix.setPassword(proto.getPassword());
      }
      if (fieldPresence.getNewPassword()) {
        fix.setNewPassword(proto.getNewPassword());
      }
      if (fieldPresence.getEncryptedPasswordMethod()) {
        fix.setEncryptedPasswordMethod(proto.getEncryptedPasswordMethod());
      }
      if (fieldPresence.getEncryptedPasswordLen()) {
        fix.setEncryptedPasswordLen(proto.getEncryptedPasswordLen());
      }
      if (fieldPresence.getEncryptedPassword()) {
        fix.setEncryptedPassword(proto.getEncryptedPassword());
      }
      if (fieldPresence.getEncryptedNewPasswordLen()) {
        fix.setEncryptedNewPasswordLen(proto.getEncryptedNewPasswordLen());
      }
      if (fieldPresence.getEncryptedNewPassword()) {
        fix.setEncryptedNewPassword(proto.getEncryptedNewPassword());
      }
      if (fieldPresence.getSessionStatus()) {
        fix.setSessionStatus(proto.getSessionStatus());
      }
      if (fieldPresence.getDefaultApplVerId()) {
        fix.setDefaultApplVerId(proto.getDefaultApplVerId());
      }
      if (fieldPresence.getDefaultApplExtId()) {
        fix.setDefaultApplExtId(proto.getDefaultApplExtId());
      }
      if (fieldPresence.getDefaultCstmApplVerId()) {
        fix.setDefaultCstmApplVerId(proto.getDefaultCstmApplVerId());
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
