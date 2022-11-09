package com.gouminger.design.pattern.creation.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class SingletonJunit {

  @Test
  public void testLazyUnSafePattern(){
    LazyUnSafePattern lazyUnSafePattern1 = LazyUnSafePattern.getInstance();
    LazyUnSafePattern lazyUnSafePattern2 = LazyUnSafePattern.getInstance();
    Assert.isTrue(lazyUnSafePattern1 == lazyUnSafePattern2, "testLazyUnSafePattern failure");
  }

  @Test
  public void testLazySafePattern(){
    LazySafePattern lazySafePattern1 = LazySafePattern.getInstance();
    LazySafePattern lazySafePattern2 = LazySafePattern.getInstance();
    Assert.isTrue(lazySafePattern1 == lazySafePattern2, "testLazySafePattern failure");
  }

  @Test
  public void testHungryPattern(){
    HungryPattern hungryPattern1 = HungryPattern.getInstance();
    HungryPattern hungryPattern2 = HungryPattern.getInstance();
    Assert.isTrue(hungryPattern1 == hungryPattern2, "testHungryPattern failure");
  }

  @Test
  public void testDoubleCheckPattern(){
    DoubleCheckPattern doubleCheckPattern1 = DoubleCheckPattern.getInstance();
    DoubleCheckPattern doubleCheckPattern2 = DoubleCheckPattern.getInstance();
    Assert.isTrue(doubleCheckPattern1 == doubleCheckPattern2, "testDoubleCheckPattern failure");
  }

  @Test
  public void testStaticInnerClassPattern(){
    StaticInnerClassPattern staticInnerClassPattern1 = StaticInnerClassPattern.getInstance();
    StaticInnerClassPattern staticInnerClassPattern2 = StaticInnerClassPattern.getInstance();
    Assert.isTrue(staticInnerClassPattern1 == staticInnerClassPattern2, "testStaticInnerClassPattern failure");
  }

  @Test
  public void testEnumPattern(){
    EnumPattern instance1 = EnumPattern.INSTANCE;
    EnumPattern instance2 = EnumPattern.INSTANCE;
    Assert.isTrue(instance1 == instance2, "testEnumPattern failure");
  }

}
