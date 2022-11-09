package com.gouminger.design.pattern.creation.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 枚举式，线程安全但是浪费资源，跟其他不同的是，该方法绝对单例，可以防止序列化创建对象
 */
public enum EnumPattern {
  INSTANCE;

  private static Logger logger = LogManager.getLogger(EnumPattern.class);
  public void run(){
    logger.info("EnumPattern construct");
  }
}
