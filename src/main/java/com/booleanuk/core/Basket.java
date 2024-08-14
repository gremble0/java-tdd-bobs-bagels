package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
  private int capacity = 5;
  private List<Bagel> bagels = new ArrayList<>();

  public int size() {
    return bagels.size();
  }

  private boolean isFull() {
    return this.bagels.size() == this.capacity;
  }

  public boolean add(Bagel bagel) {
    if (this.isFull())
      return false;

    this.bagels.add(bagel);
    return true;
  }

}
