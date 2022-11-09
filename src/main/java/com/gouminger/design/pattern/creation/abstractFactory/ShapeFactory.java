package com.gouminger.design.pattern.creation.abstractFactory;

public class ShapeFactory implements AbstractFactory{

  public Colour createColour(ColourName colourName) {
    return null;
  }

  public Shape createShape(ShapeName shapeName){
    switch (shapeName){
      case Triangle:
        return new Triangle();
      case Square:
        return new Square();
      case Pentagon:
        return new Pentagon();
      default:
        return null;
    }
  }

}
