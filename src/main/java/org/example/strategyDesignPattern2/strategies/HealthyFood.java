package org.example.strategyDesignPattern2.strategies;

public class HealthyFood implements IDogEat{
    @Override
    public void eat() {
        System.out.println("Eat healthy food");
    }
}
