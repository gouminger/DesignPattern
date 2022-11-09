package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 饿汉式，线程安全，服务启动时就会实例化，浪费内存资源
 */
public class HungryPattern {
  private static Logger logger = LogManager.getLogger(HungryPattern.class);
  private static HungryPattern instance = new HungryPattern();

  private HungryPattern() {
    logger.info("HungryPattern construct");
  }

  public static HungryPattern getInstance(){
    return instance;
  }
}
