package com.example;

public class Cat {


    private final Logger logger = Logger.INSTANCE; // or Logger.getInstance();

    public void meow() {
        logger.log("Meow");
    }

}
