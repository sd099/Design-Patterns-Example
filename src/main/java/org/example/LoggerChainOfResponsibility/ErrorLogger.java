package org.example.LoggerChainOfResponsibility;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String label, String msg) {
        if (label.equals("ERROR")) {
            System.out.println("ERROR: " + msg);
        } else {
            super.log(label, msg);
        }
    }
}
