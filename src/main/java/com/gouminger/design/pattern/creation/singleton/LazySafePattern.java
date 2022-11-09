package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 懒汉式线程安全版，通过对getInstance加锁，保证实例化的过程不会同时发生。
 * 但是后面调用getInstance都要进行加锁释放锁
 */
public class LazySafePattern {
  private static Logger logger = LogManager.getLogger(LazySafePattern.class);
  private static LazySafePattern instance;

  private LazySafePattern() {
    logger.info("LazySafePattern construct");
  }

  public static synchronized LazySafePattern getInstance(){
    if(instance == null){
      instance = new LazySafePattern();
    }
    return instance;
  }
}
