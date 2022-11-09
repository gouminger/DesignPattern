package com.gouminger.design.pattern.creation.singleton;

import com.gouminger.design.pattern.creation.factory.Car;
import com.gouminger.design.pattern.creation.factory.CarFactory;
import com.gouminger.design.pattern.creation.factory.CarName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class FactoryJunit {

  @Test
  public void testFactory(){
    CarFactory carFactory = new CarFactory();
    Car aodi = carFactory.getCar(CarName.AO_DI);
    Car dazhong = carFactory.getCar(CarName.DA_ZHONG);
    Car benchi = carFactory.getCar(CarName.BEN_CHI);
    Assert.isTrue(aodi.name().equals("奥迪"), "testFactory failure");
    Assert.isTrue(dazhong.name().equals("大众"), "testFactory failure");
    Assert.isTrue(benchi.name().equals("奔驰"), "testFactory failure");
  }

}
