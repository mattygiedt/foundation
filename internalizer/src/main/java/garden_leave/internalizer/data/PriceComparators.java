package garden_leave.internalizer.data;

import java.util.Comparator;

public class PriceComparators {
  public final static Comparator<Price> ASK_COMPARATOR =
      (final Price p1, final Price p2) -> Long.compare(p1.getPrice(), p2.getPrice());

  public final static Comparator<Price> BID_COMPARATOR =
      (final Price p1, final Price p2) -> Long.compare(p2.getPrice(), p1.getPrice());
}
