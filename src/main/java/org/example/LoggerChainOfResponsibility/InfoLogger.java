package org.example.LoggerChainOfResponsibility;

public class InfoLogger extends Logger {

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String label, String msg) {
        if (label.equals("INFO")) {
            System.out.println("INFO: " + msg);
        } else {
            super.log(label, msg);
        }
    }
}
