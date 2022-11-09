package com.gouminger.design.pattern.creation.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Green implements Colour {
  private static Logger logger = LogManager.getLogger(Green.class);

  public void dyeing() {
    logger.info("dyeing green");
  }
}
