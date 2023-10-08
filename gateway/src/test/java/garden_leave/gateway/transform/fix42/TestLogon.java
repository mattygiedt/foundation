package garden_leave.gateway.transform.fix42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogon {
  @Test
  public void testLogon() throws Exception {
    final quickfix.MessageFactory factory = MessageFactoryProvider.newMessageFactory();
    final Logon logon = (Logon) factory.create(Logon.BEGINSTR, Logon.MSGTYPE);

    assertFalse(logon.hasEncryptMethod());
    assertFalse(logon.hasHeartBtInt());

    logon.setEncryptMethod(99);
    logon.setHeartBtInt(30);

    assertTrue(logon.hasEncryptMethod());
    assertTrue(logon.hasHeartBtInt());

    assertTrue(99 == logon.getEncryptMethod());
    assertTrue(30 == logon.getHeartBtInt());

    assertTrue(logon.getGroupCount(quickfix.field.NoMsgTypes.FIELD) == 0);

    Logon.NoMsgTypes noMsgTypes = new Logon.NoMsgTypes();
    noMsgTypes.setRefMsgType("D");
    noMsgTypes.setMsgDirection("R");
    logon.addGroup(noMsgTypes);

    assertTrue(logon.getGroupCount(quickfix.field.NoMsgTypes.FIELD) == 1);

    noMsgTypes = new Logon.NoMsgTypes();
    noMsgTypes.setRefMsgType("8");
    noMsgTypes.setMsgDirection("S");
    logon.addGroup(noMsgTypes);

    assertTrue(logon.getGroupCount(quickfix.field.NoMsgTypes.FIELD) == 2);

    var proto = Logon.fixToProto.apply(logon);

    assertTrue(proto.getHeader().getFieldPresence().getBeginString());
    assertTrue(proto.getHeader().getFieldPresence().getMsgType());
    assertFalse(proto.getHeader().getFieldPresence().getOrigSendingTime());

    assertTrue("FIX.4.2".equals(proto.getHeader().getBeginString()));
    assertTrue("A".equals(proto.getHeader().getMsgType()));
    assertTrue(99 == proto.getEncryptMethod());
    assertTrue(30 == proto.getHeartBtInt());

    assertTrue(proto.getNoMsgTypesCount() == 2);
    assertTrue(proto.getNoMsgTypes(0).getFieldPresence().getRefMsgType());
    assertTrue(proto.getNoMsgTypes(0).getFieldPresence().getMsgDirection());
    assertTrue(proto.getNoMsgTypes(1).getFieldPresence().getRefMsgType());
    assertTrue(proto.getNoMsgTypes(1).getFieldPresence().getMsgDirection());

    assertTrue("D".equals(proto.getNoMsgTypes(0).getRefMsgType()));
    assertTrue('R' == proto.getNoMsgTypes(0).getMsgDirection());
    assertTrue("8".equals(proto.getNoMsgTypes(1).getRefMsgType()));
    assertTrue('S' == proto.getNoMsgTypes(1).getMsgDirection());

    var fix = Logon.protoToFix.apply(proto);

    assertArrayEquals(fix.getFieldOrder(), logon.getFieldOrder());

    assertTrue("A".equals(fix.getHeader().getString(quickfix.field.MsgType.FIELD)));
    assertTrue(fix.getGroupCount(quickfix.field.NoMsgTypes.FIELD) == 2);

    assertEquals(fix.getGroup(1, quickfix.field.NoMsgTypes.FIELD).delim(),
        logon.getGroup(1, quickfix.field.NoMsgTypes.FIELD).delim());
    assertArrayEquals(fix.getGroup(1, quickfix.field.NoMsgTypes.FIELD).getFieldOrder(),
        logon.getGroup(1, quickfix.field.NoMsgTypes.FIELD).getFieldOrder());

    assertEquals(fix.getGroup(2, quickfix.field.NoMsgTypes.FIELD).delim(),
        logon.getGroup(2, quickfix.field.NoMsgTypes.FIELD).delim());
    assertArrayEquals(fix.getGroup(2, quickfix.field.NoMsgTypes.FIELD).getFieldOrder(),
        logon.getGroup(2, quickfix.field.NoMsgTypes.FIELD).getFieldOrder());
  }
}
