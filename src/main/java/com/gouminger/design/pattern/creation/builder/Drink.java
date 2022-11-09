package com.gouminger.design.pattern.creation.builder;

import java.math.BigDecimal;

public class Drink implements Item {

  @Override
  public String name() {
    return "drink";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(10);
  }
}
