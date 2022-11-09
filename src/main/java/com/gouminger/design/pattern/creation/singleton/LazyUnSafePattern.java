package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 懒汉式线程不安全版，instance未实例化时，多线程同时调用getInstance会创建多个实例进行覆盖
 */
public class LazyUnSafePattern {
  private static Logger logger = LogManager.getLogger(LazyUnSafePattern.class);
  private static LazyUnSafePattern instance;

  private LazyUnSafePattern() {
    logger.info("LazyUnSafePattern construct");
  }

  public static LazyUnSafePattern getInstance(){
    if(instance == null){
      instance = new LazyUnSafePattern();
    }
    return instance;
  }

}
