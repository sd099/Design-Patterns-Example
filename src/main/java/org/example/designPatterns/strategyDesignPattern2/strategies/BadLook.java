package org.example.designPatterns.strategyDesignPattern2.strategies;

public class BadLook implements IDogLook{
    @Override
    public void look() {
        System.out.println("Looking bad..");
    }
}
