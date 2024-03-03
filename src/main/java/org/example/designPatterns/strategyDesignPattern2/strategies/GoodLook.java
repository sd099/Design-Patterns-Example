package org.example.designPatterns.strategyDesignPattern2.strategies;

public class GoodLook implements IDogLook{
    @Override
    public void look() {
        System.out.println("Looking good");
    }
}
