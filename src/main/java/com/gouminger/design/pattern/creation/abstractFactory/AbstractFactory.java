package com.gouminger.design.pattern.creation.abstractFactory;

public interface AbstractFactory {

  Colour createColour(ColourName colourName);

  Shape createShape(ShapeName shapeName);

}
