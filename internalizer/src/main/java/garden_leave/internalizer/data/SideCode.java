package garden_leave.internalizer.data;

public enum SideCode {
  UNKNOWN,
  BUY,
  SELL,
  BUY_COVER,
  SELL_SHORT;

  public static SideCode of(final int fixValue) {
    if (fixValue == '1') {
      return BUY;
    } else if (fixValue == '2') {
      return SELL;
    } else if (fixValue == '3') {
      return BUY_COVER;
    } else if (fixValue == '5') {
      return SELL_SHORT;
    } else {
      return UNKNOWN;
    }
  }

  public int toFixValue() {
    switch (this) {
      case BUY:
        return '1';
      case SELL:
        return '2';
      case BUY_COVER:
        return '3';
      case SELL_SHORT:
        return '5';
      default:
        return 0;
    }
  }

  public SideCode opposite() {
    switch (this) {
      case BUY:
        return SELL;
      case BUY_COVER:
        return SELL_SHORT;
      case SELL:
        return BUY;
      case SELL_SHORT:
        return BUY_COVER;
      default:
        return UNKNOWN;
    }
  }
}
