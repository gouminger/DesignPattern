package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 内部静态类式，线程安全也不浪费内存资源，比双重锁校验式写法简单
 */
public class StaticInnerClassPattern {
  private static Logger logger = LogManager.getLogger(StaticInnerClassPattern.class);
  private static class StaticInnerClassPatternHolder{
    private static StaticInnerClassPattern instance = new StaticInnerClassPattern();
  }

  private StaticInnerClassPattern() {
    logger.info("StaticInnerClassPattern construct");
  }

  public static StaticInnerClassPattern getInstance(){
    return StaticInnerClassPatternHolder.instance;
  }
}
