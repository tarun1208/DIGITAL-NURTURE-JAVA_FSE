package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        int userId = 101;
        String userName = "Tarun";
        String city = "Hyderabad";

        logger.info("User ID : {}", userId);

        logger.info("User Name : {}", userName);

        logger.info("City : {}", city);

        logger.info("User {} belongs to {}", userName, city);

    }

}