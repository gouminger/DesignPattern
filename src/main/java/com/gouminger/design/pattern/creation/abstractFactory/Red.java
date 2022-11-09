package com.gouminger.design.pattern.creation.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Red implements Colour {
  private static Logger logger = LogManager.getLogger(Red.class);

  public void dyeing() {
    logger.info("dyeing red");
  }
}
