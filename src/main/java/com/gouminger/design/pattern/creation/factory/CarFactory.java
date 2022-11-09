package com.gouminger.design.pattern.creation.factory;

/**
 * 扩展性高，适用于创建复杂对象
 */
public class CarFactory {

  public Car getCar(CarName carName){
    switch (carName){
      case AO_DI:
        return new AoDiCar();
      case BEN_CHI:
        return new BenChiCar();
      case DA_ZHONG:
        return new DaZhongCar();
      default:
        return null;
    }
  }

}
