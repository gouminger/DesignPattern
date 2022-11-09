package com.gouminger.design.pattern.creation.singleton;

import com.gouminger.design.pattern.creation.abstractFactory.AbstractFactory;
import com.gouminger.design.pattern.creation.abstractFactory.ColourName;
import com.gouminger.design.pattern.creation.abstractFactory.FactoryProduce;
import com.gouminger.design.pattern.creation.abstractFactory.ShapeName;
import org.junit.jupiter.api.Test;

public class AbstractFactoryJunit {

  @Test
  public void testAbstractFactory(){
    AbstractFactory colourFactory = FactoryProduce.getFactory("colour");
    colourFactory.createColour(ColourName.RED).dyeing();
    colourFactory.createColour(ColourName.GREEN).dyeing();
    colourFactory.createColour(ColourName.BLACK).dyeing();

    AbstractFactory shapeFactory = FactoryProduce.getFactory("shape");
    shapeFactory.createShape(ShapeName.Triangle).run();
    shapeFactory.createShape(ShapeName.Square).run();
    shapeFactory.createShape(ShapeName.Pentagon).run();
  }

}
