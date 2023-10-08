package garden_leave.gateway.transform.fix44;

import garden_leave.gateway.transform.FieldFactory;
import garden_leave.gateway.transform.FieldValue;

//
// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!
//
//    2023-06-05T14:03:04.693910600
//

public final class Header extends quickfix.Message.Header {
  private final quickfix.StringField beginStringField = FieldFactory.newStringField(8);
  public boolean hasBeginString() throws quickfix.FieldNotFound {
    return isSetField(8);
  }
  public String getBeginString() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(beginStringField));
  }
  public Header setBeginString(final String value) {
    setField(FieldValue.to(beginStringField, value));
    return this;
  }
  public Header setBeginString(final quickfix.field.BeginString value) {
    setField(FieldValue.to(beginStringField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField bodyLengthField = FieldFactory.newIntField(9);
  public boolean hasBodyLength() throws quickfix.FieldNotFound {
    return isSetField(9);
  }
  public int getBodyLength() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(bodyLengthField));
  }
  public Header setBodyLength(final int value) {
    setField(FieldValue.to(bodyLengthField, value));
    return this;
  }
  public Header setBodyLength(final quickfix.field.BodyLength value) {
    setField(FieldValue.to(bodyLengthField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField msgTypeField = FieldFactory.newStringField(35);
  public boolean hasMsgType() throws quickfix.FieldNotFound {
    return isSetField(35);
  }
  public String getMsgType() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(msgTypeField));
  }
  public Header setMsgType(final String value) {
    setField(FieldValue.to(msgTypeField, value));
    return this;
  }
  public Header setMsgType(final quickfix.field.MsgType value) {
    setField(FieldValue.to(msgTypeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField senderCompIdField = FieldFactory.newStringField(49);
  public boolean hasSenderCompId() throws quickfix.FieldNotFound {
    return isSetField(49);
  }
  public String getSenderCompId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(senderCompIdField));
  }
  public Header setSenderCompId(final String value) {
    setField(FieldValue.to(senderCompIdField, value));
    return this;
  }
  public Header setSenderCompId(final quickfix.field.SenderCompID value) {
    setField(FieldValue.to(senderCompIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField targetCompIdField = FieldFactory.newStringField(56);
  public boolean hasTargetCompId() throws quickfix.FieldNotFound {
    return isSetField(56);
  }
  public String getTargetCompId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetCompIdField));
  }
  public Header setTargetCompId(final String value) {
    setField(FieldValue.to(targetCompIdField, value));
    return this;
  }
  public Header setTargetCompId(final quickfix.field.TargetCompID value) {
    setField(FieldValue.to(targetCompIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField onBehalfOfCompIdField = FieldFactory.newStringField(115);
  public boolean hasOnBehalfOfCompId() throws quickfix.FieldNotFound {
    return isSetField(115);
  }
  public String getOnBehalfOfCompId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(onBehalfOfCompIdField));
  }
  public Header setOnBehalfOfCompId(final String value) {
    setField(FieldValue.to(onBehalfOfCompIdField, value));
    return this;
  }
  public Header setOnBehalfOfCompId(final quickfix.field.OnBehalfOfCompID value) {
    setField(FieldValue.to(onBehalfOfCompIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField deliverToCompIdField = FieldFactory.newStringField(128);
  public boolean hasDeliverToCompId() throws quickfix.FieldNotFound {
    return isSetField(128);
  }
  public String getDeliverToCompId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(deliverToCompIdField));
  }
  public Header setDeliverToCompId(final String value) {
    setField(FieldValue.to(deliverToCompIdField, value));
    return this;
  }
  public Header setDeliverToCompId(final quickfix.field.DeliverToCompID value) {
    setField(FieldValue.to(deliverToCompIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField secureDataLenField = FieldFactory.newIntField(90);
  public boolean hasSecureDataLen() throws quickfix.FieldNotFound {
    return isSetField(90);
  }
  public int getSecureDataLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secureDataLenField));
  }
  public Header setSecureDataLen(final int value) {
    setField(FieldValue.to(secureDataLenField, value));
    return this;
  }
  public Header setSecureDataLen(final quickfix.field.SecureDataLen value) {
    setField(FieldValue.to(secureDataLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField secureDataField = FieldFactory.newStringField(91);
  public boolean hasSecureData() throws quickfix.FieldNotFound {
    return isSetField(91);
  }
  public String getSecureData() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(secureDataField));
  }
  public Header setSecureData(final String value) {
    setField(FieldValue.to(secureDataField, value));
    return this;
  }
  public Header setSecureData(final quickfix.field.SecureData value) {
    setField(FieldValue.to(secureDataField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField msgSeqNumField = FieldFactory.newIntField(34);
  public boolean hasMsgSeqNum() throws quickfix.FieldNotFound {
    return isSetField(34);
  }
  public int getMsgSeqNum() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(msgSeqNumField));
  }
  public Header setMsgSeqNum(final int value) {
    setField(FieldValue.to(msgSeqNumField, value));
    return this;
  }
  public Header setMsgSeqNum(final quickfix.field.MsgSeqNum value) {
    setField(FieldValue.to(msgSeqNumField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField senderSubIdField = FieldFactory.newStringField(50);
  public boolean hasSenderSubId() throws quickfix.FieldNotFound {
    return isSetField(50);
  }
  public String getSenderSubId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(senderSubIdField));
  }
  public Header setSenderSubId(final String value) {
    setField(FieldValue.to(senderSubIdField, value));
    return this;
  }
  public Header setSenderSubId(final quickfix.field.SenderSubID value) {
    setField(FieldValue.to(senderSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField senderLocationIdField = FieldFactory.newStringField(142);
  public boolean hasSenderLocationId() throws quickfix.FieldNotFound {
    return isSetField(142);
  }
  public String getSenderLocationId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(senderLocationIdField));
  }
  public Header setSenderLocationId(final String value) {
    setField(FieldValue.to(senderLocationIdField, value));
    return this;
  }
  public Header setSenderLocationId(final quickfix.field.SenderLocationID value) {
    setField(FieldValue.to(senderLocationIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField targetSubIdField = FieldFactory.newStringField(57);
  public boolean hasTargetSubId() throws quickfix.FieldNotFound {
    return isSetField(57);
  }
  public String getTargetSubId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetSubIdField));
  }
  public Header setTargetSubId(final String value) {
    setField(FieldValue.to(targetSubIdField, value));
    return this;
  }
  public Header setTargetSubId(final quickfix.field.TargetSubID value) {
    setField(FieldValue.to(targetSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField targetLocationIdField = FieldFactory.newStringField(143);
  public boolean hasTargetLocationId() throws quickfix.FieldNotFound {
    return isSetField(143);
  }
  public String getTargetLocationId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(targetLocationIdField));
  }
  public Header setTargetLocationId(final String value) {
    setField(FieldValue.to(targetLocationIdField, value));
    return this;
  }
  public Header setTargetLocationId(final quickfix.field.TargetLocationID value) {
    setField(FieldValue.to(targetLocationIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField onBehalfOfSubIdField = FieldFactory.newStringField(116);
  public boolean hasOnBehalfOfSubId() throws quickfix.FieldNotFound {
    return isSetField(116);
  }
  public String getOnBehalfOfSubId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(onBehalfOfSubIdField));
  }
  public Header setOnBehalfOfSubId(final String value) {
    setField(FieldValue.to(onBehalfOfSubIdField, value));
    return this;
  }
  public Header setOnBehalfOfSubId(final quickfix.field.OnBehalfOfSubID value) {
    setField(FieldValue.to(onBehalfOfSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField onBehalfOfLocationIdField = FieldFactory.newStringField(144);
  public boolean hasOnBehalfOfLocationId() throws quickfix.FieldNotFound {
    return isSetField(144);
  }
  public String getOnBehalfOfLocationId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(onBehalfOfLocationIdField));
  }
  public Header setOnBehalfOfLocationId(final String value) {
    setField(FieldValue.to(onBehalfOfLocationIdField, value));
    return this;
  }
  public Header setOnBehalfOfLocationId(final quickfix.field.OnBehalfOfLocationID value) {
    setField(FieldValue.to(onBehalfOfLocationIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField deliverToSubIdField = FieldFactory.newStringField(129);
  public boolean hasDeliverToSubId() throws quickfix.FieldNotFound {
    return isSetField(129);
  }
  public String getDeliverToSubId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(deliverToSubIdField));
  }
  public Header setDeliverToSubId(final String value) {
    setField(FieldValue.to(deliverToSubIdField, value));
    return this;
  }
  public Header setDeliverToSubId(final quickfix.field.DeliverToSubID value) {
    setField(FieldValue.to(deliverToSubIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField deliverToLocationIdField = FieldFactory.newStringField(145);
  public boolean hasDeliverToLocationId() throws quickfix.FieldNotFound {
    return isSetField(145);
  }
  public String getDeliverToLocationId() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(deliverToLocationIdField));
  }
  public Header setDeliverToLocationId(final String value) {
    setField(FieldValue.to(deliverToLocationIdField, value));
    return this;
  }
  public Header setDeliverToLocationId(final quickfix.field.DeliverToLocationID value) {
    setField(FieldValue.to(deliverToLocationIdField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField possDupFlagField = FieldFactory.newBooleanField(43);
  public boolean hasPossDupFlag() throws quickfix.FieldNotFound {
    return isSetField(43);
  }
  public boolean getPossDupFlag() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(possDupFlagField));
  }
  public Header setPossDupFlag(final boolean value) {
    setField(FieldValue.to(possDupFlagField, value));
    return this;
  }
  public Header setPossDupFlag(final quickfix.field.PossDupFlag value) {
    setField(FieldValue.to(possDupFlagField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.BooleanField possResendField = FieldFactory.newBooleanField(97);
  public boolean hasPossResend() throws quickfix.FieldNotFound {
    return isSetField(97);
  }
  public boolean getPossResend() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(possResendField));
  }
  public Header setPossResend(final boolean value) {
    setField(FieldValue.to(possResendField, value));
    return this;
  }
  public Header setPossResend(final quickfix.field.PossResend value) {
    setField(FieldValue.to(possResendField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField sendingTimeField = FieldFactory.newTimeStampField(52);
  public boolean hasSendingTime() throws quickfix.FieldNotFound {
    return isSetField(52);
  }
  public long getSendingTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(sendingTimeField));
  }
  public Header setSendingTime(final long value) {
    setField(FieldValue.to(sendingTimeField, value));
    return this;
  }
  public Header setSendingTime(final quickfix.field.SendingTime value) {
    setField(FieldValue.to(sendingTimeField, FieldValue.of(value)));
    return this;
  }

  private final FieldFactory.TimeStampField origSendingTimeField =
      FieldFactory.newTimeStampField(122);
  public boolean hasOrigSendingTime() throws quickfix.FieldNotFound {
    return isSetField(122);
  }
  public long getOrigSendingTime() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(origSendingTimeField));
  }
  public Header setOrigSendingTime(final long value) {
    setField(FieldValue.to(origSendingTimeField, value));
    return this;
  }
  public Header setOrigSendingTime(final quickfix.field.OrigSendingTime value) {
    setField(FieldValue.to(origSendingTimeField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField xmlDataLenField = FieldFactory.newIntField(212);
  public boolean hasXmlDataLen() throws quickfix.FieldNotFound {
    return isSetField(212);
  }
  public int getXmlDataLen() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(xmlDataLenField));
  }
  public Header setXmlDataLen(final int value) {
    setField(FieldValue.to(xmlDataLenField, value));
    return this;
  }
  public Header setXmlDataLen(final quickfix.field.XmlDataLen value) {
    setField(FieldValue.to(xmlDataLenField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField xmlDataField = FieldFactory.newStringField(213);
  public boolean hasXmlData() throws quickfix.FieldNotFound {
    return isSetField(213);
  }
  public String getXmlData() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(xmlDataField));
  }
  public Header setXmlData(final String value) {
    setField(FieldValue.to(xmlDataField, value));
    return this;
  }
  public Header setXmlData(final quickfix.field.XmlData value) {
    setField(FieldValue.to(xmlDataField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.StringField messageEncodingField = FieldFactory.newStringField(347);
  public boolean hasMessageEncoding() throws quickfix.FieldNotFound {
    return isSetField(347);
  }
  public String getMessageEncoding() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(messageEncodingField));
  }
  public Header setMessageEncoding(final String value) {
    setField(FieldValue.to(messageEncodingField, value));
    return this;
  }
  public Header setMessageEncoding(final quickfix.field.MessageEncoding value) {
    setField(FieldValue.to(messageEncodingField, FieldValue.of(value)));
    return this;
  }

  private final quickfix.IntField lastMsgSeqNumProcessedField = FieldFactory.newIntField(369);
  public boolean hasLastMsgSeqNumProcessed() throws quickfix.FieldNotFound {
    return isSetField(369);
  }
  public int getLastMsgSeqNumProcessed() throws quickfix.FieldNotFound {
    return FieldValue.of(getField(lastMsgSeqNumProcessedField));
  }
  public Header setLastMsgSeqNumProcessed(final int value) {
    setField(FieldValue.to(lastMsgSeqNumProcessedField, value));
    return this;
  }
  public Header setLastMsgSeqNumProcessed(final quickfix.field.LastMsgSeqNumProcessed value) {
    setField(FieldValue.to(lastMsgSeqNumProcessedField, FieldValue.of(value)));
    return this;
  }

  public static class NoHops extends quickfix.Group {
    private final quickfix.StringField hopCompIdField = FieldFactory.newStringField(628);
    public boolean hasHopCompId() throws quickfix.FieldNotFound {
      return isSetField(628);
    }
    public String getHopCompId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(hopCompIdField));
    }
    public NoHops setHopCompId(final String value) {
      setField(FieldValue.to(hopCompIdField, value));
      return this;
    }
    public NoHops setHopCompId(final quickfix.field.HopCompID value) {
      setField(FieldValue.to(hopCompIdField, FieldValue.of(value)));
      return this;
    }

    private final FieldFactory.TimeStampField hopSendingTimeField =
        FieldFactory.newTimeStampField(629);
    public boolean hasHopSendingTime() throws quickfix.FieldNotFound {
      return isSetField(629);
    }
    public long getHopSendingTime() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(hopSendingTimeField));
    }
    public NoHops setHopSendingTime(final long value) {
      setField(FieldValue.to(hopSendingTimeField, value));
      return this;
    }
    public NoHops setHopSendingTime(final quickfix.field.HopSendingTime value) {
      setField(FieldValue.to(hopSendingTimeField, FieldValue.of(value)));
      return this;
    }

    private final quickfix.IntField hopRefIdField = FieldFactory.newIntField(630);
    public boolean hasHopRefId() throws quickfix.FieldNotFound {
      return isSetField(630);
    }
    public int getHopRefId() throws quickfix.FieldNotFound {
      return FieldValue.of(getField(hopRefIdField));
    }
    public NoHops setHopRefId(final int value) {
      setField(FieldValue.to(hopRefIdField, value));
      return this;
    }
    public NoHops setHopRefId(final quickfix.field.HopRefID value) {
      setField(FieldValue.to(hopRefIdField, FieldValue.of(value)));
      return this;
    }

    public NoHops() {
      super(627, 628, new int[] {628, 629, 630, 0});
    }

    @Override
    public void addGroup(final quickfix.Group group) {
      addGroupRef(group);
    }

    public void fromProto(final garden_leave.fix44.proto.FIX44Protos.Header.NoHops proto) {
      final garden_leave.fix44.proto.FIX44Protos.Header.NoHops.FieldPresence fieldPresence =
          proto.getFieldPresence();

      if (fieldPresence.getHopCompId()) {
        this.setHopCompId(proto.getHopCompId());
      }
      if (fieldPresence.getHopSendingTime()) {
        this.setHopSendingTime(proto.getHopSendingTime());
      }
      if (fieldPresence.getHopRefId()) {
        this.setHopRefId(proto.getHopRefId());
      }
    }

    public garden_leave.fix44.proto.FIX44Protos.Header.NoHops.Builder toBuilder()
        throws quickfix.FieldNotFound {
      final garden_leave.fix44.proto.FIX44Protos.Header.NoHops.Builder builder =
          garden_leave.fix44.proto.FIX44Protos.Header.NoHops.newBuilder();
      final garden_leave.fix44.proto.FIX44Protos.Header.NoHops.FieldPresence
          .Builder presenceBuilder =
          garden_leave.fix44.proto.FIX44Protos.Header.NoHops.FieldPresence.newBuilder();

      if (this.hasHopCompId()) {
        builder.setHopCompId(this.getHopCompId());
        presenceBuilder.setHopCompId(true);
      }
      if (this.hasHopSendingTime()) {
        builder.setHopSendingTime(this.getHopSendingTime());
        presenceBuilder.setHopSendingTime(true);
      }
      if (this.hasHopRefId()) {
        builder.setHopRefId(this.getHopRefId());
        presenceBuilder.setHopRefId(true);
      }
      builder.setFieldPresence(presenceBuilder.build());
      return builder;
    }
  }

  public Header(final quickfix.Message msg, final String beginString, final String msgType) {
    super(new int[] {8, 9, 35, 49, 56, 115, 128, 90, 91, 34, 50, 142, 57, 143, 116, 144, 129, 145,
        43, 97, 52, 122, 212, 213, 347, 369, 0});
    setMsgType(msgType);
    setBeginString(beginString);
  }

  public void fromProto(final garden_leave.fix44.proto.FIX44Protos.Header proto) {
    final garden_leave.fix44.proto.FIX44Protos.Header.FieldPresence fieldPresence =
        proto.getFieldPresence();

    if (fieldPresence.getBeginString()) {
      this.setBeginString(proto.getBeginString());
    }
    if (fieldPresence.getBodyLength()) {
      this.setBodyLength(proto.getBodyLength());
    }
    if (fieldPresence.getMsgType()) {
      this.setMsgType(proto.getMsgType());
    }
    if (fieldPresence.getSenderCompId()) {
      this.setSenderCompId(proto.getSenderCompId());
    }
    if (fieldPresence.getTargetCompId()) {
      this.setTargetCompId(proto.getTargetCompId());
    }
    if (fieldPresence.getOnBehalfOfCompId()) {
      this.setOnBehalfOfCompId(proto.getOnBehalfOfCompId());
    }
    if (fieldPresence.getDeliverToCompId()) {
      this.setDeliverToCompId(proto.getDeliverToCompId());
    }
    if (fieldPresence.getSecureDataLen()) {
      this.setSecureDataLen(proto.getSecureDataLen());
    }
    if (fieldPresence.getSecureData()) {
      this.setSecureData(proto.getSecureData());
    }
    if (fieldPresence.getMsgSeqNum()) {
      this.setMsgSeqNum(proto.getMsgSeqNum());
    }
    if (fieldPresence.getSenderSubId()) {
      this.setSenderSubId(proto.getSenderSubId());
    }
    if (fieldPresence.getSenderLocationId()) {
      this.setSenderLocationId(proto.getSenderLocationId());
    }
    if (fieldPresence.getTargetSubId()) {
      this.setTargetSubId(proto.getTargetSubId());
    }
    if (fieldPresence.getTargetLocationId()) {
      this.setTargetLocationId(proto.getTargetLocationId());
    }
    if (fieldPresence.getOnBehalfOfSubId()) {
      this.setOnBehalfOfSubId(proto.getOnBehalfOfSubId());
    }
    if (fieldPresence.getOnBehalfOfLocationId()) {
      this.setOnBehalfOfLocationId(proto.getOnBehalfOfLocationId());
    }
    if (fieldPresence.getDeliverToSubId()) {
      this.setDeliverToSubId(proto.getDeliverToSubId());
    }
    if (fieldPresence.getDeliverToLocationId()) {
      this.setDeliverToLocationId(proto.getDeliverToLocationId());
    }
    if (fieldPresence.getPossDupFlag()) {
      this.setPossDupFlag(proto.getPossDupFlag());
    }
    if (fieldPresence.getPossResend()) {
      this.setPossResend(proto.getPossResend());
    }
    if (fieldPresence.getSendingTime()) {
      this.setSendingTime(proto.getSendingTime());
    }
    if (fieldPresence.getOrigSendingTime()) {
      this.setOrigSendingTime(proto.getOrigSendingTime());
    }
    if (fieldPresence.getXmlDataLen()) {
      this.setXmlDataLen(proto.getXmlDataLen());
    }
    if (fieldPresence.getXmlData()) {
      this.setXmlData(proto.getXmlData());
    }
    if (fieldPresence.getMessageEncoding()) {
      this.setMessageEncoding(proto.getMessageEncoding());
    }
    if (fieldPresence.getLastMsgSeqNumProcessed()) {
      this.setLastMsgSeqNumProcessed(proto.getLastMsgSeqNumProcessed());
    }
  }

  public garden_leave.fix44.proto.FIX44Protos.Header.Builder toBuilder()
      throws quickfix.FieldNotFound {
    final garden_leave.fix44.proto.FIX44Protos.Header.Builder builder =
        garden_leave.fix44.proto.FIX44Protos.Header.newBuilder();
    final garden_leave.fix44.proto.FIX44Protos.Header.FieldPresence.Builder presenceBuilder =
        garden_leave.fix44.proto.FIX44Protos.Header.FieldPresence.newBuilder();

    if (this.hasBeginString()) {
      builder.setBeginString(this.getBeginString());
      presenceBuilder.setBeginString(true);
    }
    if (this.hasBodyLength()) {
      builder.setBodyLength(this.getBodyLength());
      presenceBuilder.setBodyLength(true);
    }
    if (this.hasMsgType()) {
      builder.setMsgType(this.getMsgType());
      presenceBuilder.setMsgType(true);
    }
    if (this.hasSenderCompId()) {
      builder.setSenderCompId(this.getSenderCompId());
      presenceBuilder.setSenderCompId(true);
    }
    if (this.hasTargetCompId()) {
      builder.setTargetCompId(this.getTargetCompId());
      presenceBuilder.setTargetCompId(true);
    }
    if (this.hasOnBehalfOfCompId()) {
      builder.setOnBehalfOfCompId(this.getOnBehalfOfCompId());
      presenceBuilder.setOnBehalfOfCompId(true);
    }
    if (this.hasDeliverToCompId()) {
      builder.setDeliverToCompId(this.getDeliverToCompId());
      presenceBuilder.setDeliverToCompId(true);
    }
    if (this.hasSecureDataLen()) {
      builder.setSecureDataLen(this.getSecureDataLen());
      presenceBuilder.setSecureDataLen(true);
    }
    if (this.hasSecureData()) {
      builder.setSecureData(this.getSecureData());
      presenceBuilder.setSecureData(true);
    }
    if (this.hasMsgSeqNum()) {
      builder.setMsgSeqNum(this.getMsgSeqNum());
      presenceBuilder.setMsgSeqNum(true);
    }
    if (this.hasSenderSubId()) {
      builder.setSenderSubId(this.getSenderSubId());
      presenceBuilder.setSenderSubId(true);
    }
    if (this.hasSenderLocationId()) {
      builder.setSenderLocationId(this.getSenderLocationId());
      presenceBuilder.setSenderLocationId(true);
    }
    if (this.hasTargetSubId()) {
      builder.setTargetSubId(this.getTargetSubId());
      presenceBuilder.setTargetSubId(true);
    }
    if (this.hasTargetLocationId()) {
      builder.setTargetLocationId(this.getTargetLocationId());
      presenceBuilder.setTargetLocationId(true);
    }
    if (this.hasOnBehalfOfSubId()) {
      builder.setOnBehalfOfSubId(this.getOnBehalfOfSubId());
      presenceBuilder.setOnBehalfOfSubId(true);
    }
    if (this.hasOnBehalfOfLocationId()) {
      builder.setOnBehalfOfLocationId(this.getOnBehalfOfLocationId());
      presenceBuilder.setOnBehalfOfLocationId(true);
    }
    if (this.hasDeliverToSubId()) {
      builder.setDeliverToSubId(this.getDeliverToSubId());
      presenceBuilder.setDeliverToSubId(true);
    }
    if (this.hasDeliverToLocationId()) {
      builder.setDeliverToLocationId(this.getDeliverToLocationId());
      presenceBuilder.setDeliverToLocationId(true);
    }
    if (this.hasPossDupFlag()) {
      builder.setPossDupFlag(this.getPossDupFlag());
      presenceBuilder.setPossDupFlag(true);
    }
    if (this.hasPossResend()) {
      builder.setPossResend(this.getPossResend());
      presenceBuilder.setPossResend(true);
    }
    if (this.hasSendingTime()) {
      builder.setSendingTime(this.getSendingTime());
      presenceBuilder.setSendingTime(true);
    }
    if (this.hasOrigSendingTime()) {
      builder.setOrigSendingTime(this.getOrigSendingTime());
      presenceBuilder.setOrigSendingTime(true);
    }
    if (this.hasXmlDataLen()) {
      builder.setXmlDataLen(this.getXmlDataLen());
      presenceBuilder.setXmlDataLen(true);
    }
    if (this.hasXmlData()) {
      builder.setXmlData(this.getXmlData());
      presenceBuilder.setXmlData(true);
    }
    if (this.hasMessageEncoding()) {
      builder.setMessageEncoding(this.getMessageEncoding());
      presenceBuilder.setMessageEncoding(true);
    }
    if (this.hasLastMsgSeqNumProcessed()) {
      builder.setLastMsgSeqNumProcessed(this.getLastMsgSeqNumProcessed());
      presenceBuilder.setLastMsgSeqNumProcessed(true);
    }

    builder.setFieldPresence(presenceBuilder.build());
    return builder;
  }
}
