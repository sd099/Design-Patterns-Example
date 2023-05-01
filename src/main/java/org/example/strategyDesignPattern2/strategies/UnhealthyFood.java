package org.example.strategyDesignPattern2.strategies;

public class UnhealthyFood implements IDogEat{
    @Override
    public void eat() {
        System.out.println("Eat unhealthy food");
    }
}
