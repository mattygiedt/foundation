package garden_leave.internalizer.data;

import java.util.Objects;

public final class Price implements Comparable<Price> {
  public static final double PRICE_MULTIPLIER = 100000000D;
  public static final double MAX_PRICE = 10000000000D;
  public static final double MIN_PRICE = -10000000000D;
  public static final Price ZERO = new Price(0D);

  private final long price;
  private final int hashCode;

  public Price(final double price) {
    if (price > MAX_PRICE) {
      throw new IllegalArgumentException("invalid: (price > MAX_PRICE)");
    }

    if (price < MIN_PRICE) {
      throw new IllegalArgumentException("invalid: (price < MIN_PRICE)");
    }

    this.price = Double.valueOf(price * PRICE_MULTIPLIER).longValue();
    this.hashCode = Objects.hashCode(this.price);
  }

  public long getPrice() {
    return price;
  }

  public double toDouble() {
    return getPrice() / PRICE_MULTIPLIER;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Price that = (Price) o;
    return price == that.price;
  }

  @Override
  public int hashCode() {
    return this.hashCode;
  }

  @Override
  public int compareTo(final Price other) {
    return Long.compare(getPrice(), other.getPrice());
  }

  @Override
  public String toString() {
    return Double.toString(toDouble());
  }
}
