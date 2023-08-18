package org.example.LoggerChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");

        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log("INFO", "Hello from INFO logger");
        logger.log("DEBUG", "Hello from DEBUG logger");
        logger.log("ERROR", "Hello from ERROR logger");

    }
}
