package org.example.decoratorPattern.decorator;

import org.example.decoratorPattern.concrete.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
