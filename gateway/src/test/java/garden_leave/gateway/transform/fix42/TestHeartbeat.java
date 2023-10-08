package garden_leave.gateway.transform.fix42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHeartbeat {
  @Test
  public void testHeartbeat() throws Exception {
    final quickfix.MessageFactory factory = MessageFactoryProvider.newMessageFactory();
    final Heartbeat heartbeat = (Heartbeat) factory.create(Heartbeat.BEGINSTR, Heartbeat.MSGTYPE);

    assertFalse(heartbeat.hasTestReqId());
    heartbeat.setTestReqId("abc123");
    assertTrue(heartbeat.hasTestReqId());
    assertTrue("abc123".equals(heartbeat.getTestReqId()));

    var proto = Heartbeat.fixToProto.apply(heartbeat);

    assertTrue("0".equals(proto.getHeader().getMsgType()));
    assertTrue(proto.getHeader().getFieldPresence().getMsgType());
    assertFalse(proto.getHeader().getFieldPresence().getBodyLength());
    assertFalse(proto.getHeader().getFieldPresence().getOrigSendingTime());

    assertTrue(proto.getFieldPresence().getTestReqId());
    assertTrue("abc123".equals(proto.getTestReqId()));

    var fix = Heartbeat.protoToFix.apply(proto);

    assertTrue("0".equals(fix.getHeader().getString(quickfix.field.MsgType.FIELD)));
    assertTrue("abc123".equals(fix.getTestReqId()));
  }

  @Test
  public void fromProto() throws Exception {
    final garden_leave.fix42.proto.FIX42Protos.Heartbeat.Builder builder =
        garden_leave.fix42.proto.FIX42Protos.Heartbeat.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.Heartbeat.FieldPresence.Builder presenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.Heartbeat.FieldPresence.newBuilder();

    final garden_leave.fix42.proto.FIX42Protos.Header.Builder headerBuilder =
        garden_leave.fix42.proto.FIX42Protos.Header.newBuilder();
    final garden_leave.fix42.proto.FIX42Protos.Header.FieldPresence.Builder headerPresenceBuilder =
        garden_leave.fix42.proto.FIX42Protos.Header.FieldPresence.newBuilder();

    headerBuilder.setBeginString("FIX.4.2");
    headerPresenceBuilder.setBeginString(true);

    headerBuilder.setMsgType("0");
    headerPresenceBuilder.setMsgType(true);

    builder.setTestReqId("abc123");
    presenceBuilder.setTestReqId(true);

    headerBuilder.setFieldPresence(headerPresenceBuilder.build());

    builder.setMessageId(java.util.UUID.randomUUID().toString())
        .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())
        .setHeader(headerBuilder.build())
        .setFieldPresence(presenceBuilder.build());

    var fix = Heartbeat.protoToFix.apply(builder.build());

    assertTrue("0".equals(fix.getHeader().getString(quickfix.field.MsgType.FIELD)));
    assertTrue("FIX.4.2".equals(fix.getHeader().getString(quickfix.field.BeginString.FIELD)));
    assertTrue("abc123".equals(fix.getTestReqId()));
    assertTrue(fix.hasTestReqId());
  }
}
