package com.gouminger.design.pattern.creation.abstractFactory;

public class ColourFactory implements AbstractFactory {

  public Colour createColour(ColourName colourName){
    switch (colourName){
      case RED:
        return new Red();
      case GREEN:
        return new Green();
      case BLACK:
        return new Black();
      default:
        return null;
    }
  }

  public Shape createShape(ShapeName shapeName) {
    return null;
  }

}
