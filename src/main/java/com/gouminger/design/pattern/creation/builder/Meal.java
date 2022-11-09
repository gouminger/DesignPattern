package com.gouminger.design.pattern.creation.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Meal {
  private static Logger logger = LogManager.getLogger(Meal.class);

  private List<Item> itemList;

  public List<Item> getItemList() {
    return itemList;
  }

  public void setItemList(List<Item> itemList) {
    this.itemList = itemList;
  }

  public void showItem(){
    itemList.forEach(item -> logger.info("item name: {}, totalPrice: {}.",item.name(), item.price()));
  }

  public void totalPrice(){
    BigDecimal totalPrice = BigDecimal.ZERO;
    for(Item item : itemList){
      totalPrice = totalPrice.add(item.price());
    }
    logger.info("totalPrice: {}.",totalPrice);
  }
}
