package com.gouminger.design.pattern.creation.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pentagon implements Shape{
  private static Logger logger = LogManager.getLogger(Pentagon.class);

  public void run() {
    logger.info("da da da da da");
  }
}
