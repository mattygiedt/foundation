package garden_leave.internalizer.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrice {
  private static final double delta = 0.000001D;

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMaxPrice() {
    new Price(Price.MAX_PRICE + 1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMinPrice() {
    new Price(Price.MIN_PRICE - 1);
  }

  @Test
  public void testFractionalPrice() {
    final double doublePrice = 1 / 19D;
    final Price price = new Price(doublePrice);
    assertEquals(doublePrice, price.toDouble(), delta);
  }

  @Test
  public void testZeroPrice() {
    final double doublePrice = 0D;
    final Price price = new Price(doublePrice);
    assertEquals(doublePrice, price.toDouble(), delta);
    assertEquals(doublePrice, Price.ZERO.toDouble(), delta);
  }

  @Test
  public void testMaxPositivePrice() {
    final double doublePrice = Price.MAX_PRICE - 0.001;
    final Price price = new Price(doublePrice);
    assertEquals(doublePrice, price.toDouble(), delta);
  }

  @Test
  public void testMinNegativePrice() {
    final double doublePrice = Price.MIN_PRICE + 0.001;
    final Price price = new Price(doublePrice);
    assertEquals(doublePrice, price.toDouble(), delta);
  }

  @Test
  public void testEquals() {
    final double doublePrice = Price.MIN_PRICE + 0.001;
    final Price a = new Price(doublePrice);
    final Price b = new Price(doublePrice);

    assertEquals(a, b);
  }

  @Test
  public void testNotEquals() {
    final Price a = new Price(Price.MIN_PRICE + 0.001);
    final Price b = new Price(Price.MAX_PRICE - 0.001);

    assertNotEquals(a, b);
  }
}
