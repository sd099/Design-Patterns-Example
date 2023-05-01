package org.example.strategyDesignPattern2.strategies;

public class GoodLook implements IDogLook{
    @Override
    public void look() {
        System.out.println("Looking good");
    }
}
