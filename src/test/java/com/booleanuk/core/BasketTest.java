package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
  @Test
  public void testAddBagel() {
    Basket basket = new Basket();
    basket.add(Bagel.Plain);
    Assertions.assertEquals(basket.size(), 1);
    basket.add(Bagel.Rainbow);
    Assertions.assertEquals(basket.size(), 2);
  }

  @Test
  public void testRemoveBagel() {
    Basket basket = new Basket();
    basket.add(Bagel.Plain);
    basket.add(Bagel.Rainbow);

    Assertions.assertTrue(basket.remove(Bagel.Plain));
    Assertions.assertFalse(basket.remove(Bagel.Everything));
  }
}
