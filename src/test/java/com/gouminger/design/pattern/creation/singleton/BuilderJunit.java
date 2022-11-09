package com.gouminger.design.pattern.creation.singleton;

import com.gouminger.design.pattern.creation.builder.Meal;
import com.gouminger.design.pattern.creation.builder.MealBuilder;
import org.junit.jupiter.api.Test;

public class BuilderJunit {

  @Test
  public void testBuilder(){
    MealBuilder builder = new MealBuilder();
    Meal studentMeal = builder.prepayStudentPack();
    studentMeal.showItem();
    studentMeal.totalPrice();
    Meal familyMeal = builder.prepayFamilyPack();
    familyMeal.showItem();
    familyMeal.totalPrice();
  }

}
