package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 双重锁校验式，仅对实例化部分加锁，线程安全也不浪费内存资源
 */
public class DoubleCheckPattern {
  private static Logger logger = LogManager.getLogger(DoubleCheckPattern.class);
  private static DoubleCheckPattern instance;

  private DoubleCheckPattern() {
    logger.info("DoubleCheckPattern construct");
  }

  public static DoubleCheckPattern getInstance(){
    if(instance == null){
      synchronized (DoubleCheckPattern.class){
        if(instance == null){
          instance = new DoubleCheckPattern();
        }
      }
    }
    return instance;
  }
}
