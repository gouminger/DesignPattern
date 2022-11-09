package com.gouminger.design.pattern.creation.abstractFactory;

public class FactoryProduce {

  public static AbstractFactory getFactory(String type){
    if("colour".equals(type)){
      return new ColourFactory();
    } else if ("shape".equals(type)) {
      return new ShapeFactory();
    }
    return null;
  }

}
