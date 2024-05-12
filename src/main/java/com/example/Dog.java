package com.example;

public class Dog {

    private final Logger logger = Logger.INSTANCE; // or Logger.getInstance();

    public void woof() {
        logger.log("Woof");
    }



}
