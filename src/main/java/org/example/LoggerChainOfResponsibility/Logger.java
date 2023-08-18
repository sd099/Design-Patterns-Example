package org.example.LoggerChainOfResponsibility;

import java.util.Objects;

public abstract class Logger {

    Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String label, String msg) {
        if (!Objects.isNull(nextLogger)) {
            nextLogger.log(label, msg);
        } else {
            System.out.println("NULL");
        }
    }
}
