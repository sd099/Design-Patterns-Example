package org.example.LoggerChainOfResponsibility;

public class DebugLogger extends Logger {
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String label, String msg) {
        if (label.equals("DEBUG")) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(label, msg);
        }
    }
}
