package garden_leave.gateway.transform.fix42;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.Test;
import quickfix.field.*;

public class TestExecutionReport {
  private static final double tolerance = 0.0001;

  @Test
  public void testExecutionReport() throws Exception {
    final quickfix.MessageFactory factory = MessageFactoryProvider.newMessageFactory();
    final ExecutionReport executionReport =
        (ExecutionReport) factory.create(ExecutionReport.BEGINSTR, ExecutionReport.MSGTYPE);

    final LocalDateTime time = LocalDateTime.now(ZoneId.of("America/Chicago"));
    final long utcTimeMillis = time.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli();

    executionReport.setOrderId(new OrderID("abc123"));
    executionReport.setExecId(new ExecID("abc123"));
    executionReport.setExecTransType(new ExecTransType('0'));
    executionReport.setExecType(new ExecType('1'));
    executionReport.setOrdStatus(new OrdStatus('1'));
    executionReport.setSymbol(new Symbol("SPX"));
    executionReport.setSide(new Side('1'));
    executionReport.setLeavesQty(new LeavesQty(0D));
    executionReport.setCumQty(new CumQty(100D));
    executionReport.setAvgPx(new AvgPx(1000.0 / 3));

    final ExecutionReport.NoContraBrokers noContraBrokers = new ExecutionReport.NoContraBrokers();
    noContraBrokers.setContraTradeTime(new ContraTradeTime(time));
    noContraBrokers.setContraTradeQty(new ContraTradeQty(100D));
    noContraBrokers.setContraBroker(new ContraBroker("abc123"));
    noContraBrokers.setContraTrader(new ContraTrader("abc123"));

    executionReport.addGroup(noContraBrokers);

    var proto = ExecutionReport.fixToProto.apply(executionReport);

    assertTrue("FIX.4.2".equals(proto.getHeader().getBeginString()));
    assertTrue("8".equals(proto.getHeader().getMsgType()));
    assertTrue("abc123".equals(proto.getOrderId()));
    assertTrue("abc123".equals(proto.getExecId()));
    assertTrue('0' == proto.getExecTransType());
    assertTrue('1' == proto.getExecType());
    assertTrue('1' == proto.getOrdStatus());
    assertTrue("SPX".equals(proto.getSymbol()));
    assertTrue('1' == proto.getSide());
    assertEquals(0.0, proto.getLeavesQty(), tolerance);
    assertEquals(100.0, proto.getCumQty(), tolerance);
    assertEquals((1000.0 / 3), proto.getAvgPx(), tolerance);
    assertTrue(proto.getNoContraBrokersCount() == 1);
    assertTrue(utcTimeMillis == proto.getNoContraBrokers(0).getContraTradeTime());
    assertTrue("abc123".equals(proto.getNoContraBrokers(0).getContraBroker()));
    assertTrue("abc123".equals(proto.getNoContraBrokers(0).getContraTrader()));
    assertEquals(100.0, proto.getNoContraBrokers(0).getContraTradeQty(), tolerance);

    var fix = ExecutionReport.protoToFix.apply(proto);

    assertTrue("FIX.4.2".equals(fix.getHeader().getString(quickfix.field.BeginString.FIELD)));
    assertTrue("8".equals(fix.getHeader().getString(quickfix.field.MsgType.FIELD)));
    assertTrue(fix.getGroupCount(quickfix.field.NoContraBrokers.FIELD) == 1);
  }
}
