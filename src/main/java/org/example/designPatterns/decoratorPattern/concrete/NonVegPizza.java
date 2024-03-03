package org.example.designPatterns.decoratorPattern.concrete;

public class NonVegPizza extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
