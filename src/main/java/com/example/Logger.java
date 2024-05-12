package com.example;

public enum Logger {

    INSTANCE;

    // This method is redundant in the "enum" solution
    @SuppressWarnings("unused")
    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
