package com.example;

public class Logger {

    private static Logger INSTANCE;

    private Logger() {}

    public synchronized static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
