package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAppenderExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAppenderExample.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.warn("Low Memory Warning");

        logger.error("Database Connection Failed");

        logger.info("Application Finished");

    }

}