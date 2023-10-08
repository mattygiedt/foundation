package garden_leave.gateway.transform.fix44;

import static org.junit.Assert.*;

import org.junit.Test;
import quickfix.field.*;

public class TestQuote {
  private static final double tolerance = 0.0001;

  @Test
  public void testQuote() throws Exception {
    final quickfix.MessageFactory factory = MessageFactoryProvider.newMessageFactory();
    final Quote quote = (Quote) factory.create("FIX.4.4", Quote.MSGTYPE);

    quote.setQuoteId(new QuoteID("abc123"));

    Quote.NoQuoteQualifiers NoQuoteQualifiers = new Quote.NoQuoteQualifiers();

    quote.addGroup(NoQuoteQualifiers);
    quote.addGroup(new Quote.NoQuoteQualifiers());

    Quote.NoPartyIds NoPartyIds = new Quote.NoPartyIds();
    Quote.NoPartyIds.NoPartySubIds NoPartySubIds = new Quote.NoPartyIds.NoPartySubIds();
    NoPartyIds.addGroup(NoPartySubIds);

    quote.addGroup(NoPartyIds);

    Quote.NoSecurityAltId NoSecurityAltId = new Quote.NoSecurityAltId();

    quote.addGroup(NoSecurityAltId);

    Quote.NoEvents NoEvents = new Quote.NoEvents();

    quote.addGroup(NoEvents);

    Quote.NoUnderlyings NoUnderlyings = new Quote.NoUnderlyings();
    Quote.NoUnderlyings.NoUnderlyingSecurityAltId NoUnderlyingSecurityAltId =
        new Quote.NoUnderlyings.NoUnderlyingSecurityAltId();

    NoUnderlyings.addGroup(NoUnderlyingSecurityAltId);
    quote.addGroup(NoUnderlyings);

    Quote.NoStipulations NoStipulations = new Quote.NoStipulations();

    quote.addGroup(NoStipulations);

    Quote.NoLegs noLegs = new Quote.NoLegs();
    Quote.NoLegs.NoLegSecurityAltId NoLegSecurityAltId = new Quote.NoLegs.NoLegSecurityAltId();
    Quote.NoLegs.NoLegStipulations NoLegStipulations = new Quote.NoLegs.NoLegStipulations();
    Quote.NoLegs.NoNestedPartyIds NoNestedPartyIds = new Quote.NoLegs.NoNestedPartyIds();
    Quote.NoLegs.NoNestedPartyIds.NoNestedPartySubIds noNestedPartySubIds =
        new Quote.NoLegs.NoNestedPartyIds.NoNestedPartySubIds();

    noNestedPartySubIds.setNestedPartySubId("abc123");

    NoNestedPartyIds.addGroup(noNestedPartySubIds);
    noLegs.addGroup(NoLegSecurityAltId);
    noLegs.addGroup(NoLegStipulations);
    noLegs.addGroup(NoNestedPartyIds);

    noLegs.setLegQty(new LegQty(100D));
    noLegs.setLegSwapType(new LegSwapType(5));
    noLegs.setLegSettlType(new LegSettlType('1'));
    noLegs.setLegSettlDate(new LegSettlDate("20230514"));
    noLegs.setLegPriceType(new LegPriceType(9));
    noLegs.setLegBidPx(new LegBidPx(40.342));
    noLegs.setLegOfferPx(new LegOfferPx(40.452));

    quote.addGroup(noLegs);

    var proto = Quote.fixToProto.apply(quote);

    assertTrue("FIX.4.4".equals(proto.getHeader().getBeginString()));
    assertTrue(proto.getNoQuoteQualifiersCount() == 2);
    assertTrue(proto.getNoPartyIdsCount() == 1);
    assertTrue(proto.getNoSecurityAltIdCount() == 1);
    assertTrue(proto.getNoUnderlyingsCount() == 1);
    assertTrue(proto.getNoStipulationsCount() == 1);
    assertTrue(proto.getNoLegsCount() == 1);
    assertEquals(100.0, proto.getNoLegs(0).getLegQty(), tolerance);
    assertTrue(proto.getNoLegs(0).getNoNestedPartyIdsCount() == 1);
    assertTrue(proto.getNoLegs(0).getNoNestedPartyIds(0).getNoNestedPartySubIdsCount() == 1);
    assertTrue("abc123".equals(
        proto.getNoLegs(0).getNoNestedPartyIds(0).getNoNestedPartySubIds(0).getNestedPartySubId()));

    var fix = Quote.protoToFix.apply(proto);

    assertTrue("FIX.4.4".equals(fix.getHeader().getString(quickfix.field.BeginString.FIELD)));
    assertTrue("S".equals(fix.getHeader().getString(quickfix.field.MsgType.FIELD)));
    assertTrue(fix.getGroupCount(quickfix.field.NoQuoteQualifiers.FIELD) == 2);
    assertTrue(fix.getGroupCount(quickfix.field.NoLegs.FIELD) == 1);
    assertTrue("abc123".equals(fix.getGroup(1, quickfix.field.NoLegs.FIELD)
                                   .getGroup(1, quickfix.field.NoNestedPartyIDs.FIELD)
                                   .getGroup(1, quickfix.field.NoNestedPartySubIDs.FIELD)
                                   .getString(quickfix.field.NestedPartySubID.FIELD)));
  }
}
