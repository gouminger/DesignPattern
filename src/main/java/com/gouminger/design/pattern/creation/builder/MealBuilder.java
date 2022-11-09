package com.gouminger.design.pattern.creation.builder;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {

  public Meal prepayStudentPack(){
    Meal meal = new Meal();
    Food food = new Food();
    Drink drink = new Drink();
    List<Item> itemList = new ArrayList<>();
    itemList.add(food);
    itemList.add(drink);
    meal.setItemList(itemList);
    return meal;
  }

  public Meal prepayFamilyPack(){
    Meal meal = new Meal();
    List<Item> itemList = new ArrayList<>();
    int i=3;
    while (--i>0){
      Food food = new Food();
      Drink drink = new Drink();
      itemList.add(food);
      itemList.add(drink);
    }
    meal.setItemList(itemList);
    return meal;
  }

}
