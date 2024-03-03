package org.example.designPatterns.strategyDesignPattern.strategies;

public class SportsDrive implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("Inside sports drive strategy");
    }
}
