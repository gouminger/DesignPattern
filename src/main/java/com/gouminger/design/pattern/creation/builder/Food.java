package com.gouminger.design.pattern.creation.builder;

import java.math.BigDecimal;

public class Food implements Item {

  @Override
  public String name() {
    return "food";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal("35");
  }
}
