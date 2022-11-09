package com.gouminger.design.pattern.creation.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Black implements Colour {
  private static Logger logger = LogManager.getLogger(Black.class);

  public void dyeing() {
    logger.info("dyeing black");
  }
}
