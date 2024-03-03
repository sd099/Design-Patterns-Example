package org.example.designPatterns.decoratorPattern.decorator;

import org.example.designPatterns.decoratorPattern.concrete.BasePizza;

public class Jalapeno extends ToppingDecorator{

    BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 25;
    }
}
