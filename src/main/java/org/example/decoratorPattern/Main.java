package org.example.decoratorPattern;

import org.example.decoratorPattern.concrete.BasePizza;
import org.example.decoratorPattern.concrete.NonVegPizza;
import org.example.decoratorPattern.concrete.VegPizza;
import org.example.decoratorPattern.decorator.ExtraCheese;
import org.example.decoratorPattern.decorator.Jalapeno;

public class Main {
    public static void main(String[] args) {
        BasePizza veg = new VegPizza();
        System.out.println("veg pizza : " + veg.cost());

        BasePizza nonVeg = new NonVegPizza();
        System.out.println("non veg pizza : " + nonVeg.cost());

        BasePizza vegExtraCheese = new ExtraCheese(new VegPizza());
        System.out.println("veg pizza plus extra cheese : " + vegExtraCheese.cost());

        BasePizza vegExtraCheeseJalapeno = new Jalapeno(new ExtraCheese(new VegPizza()));
        System.out.println("veg pizza plus extra cheese plus jalapeno : " + vegExtraCheeseJalapeno.cost());
    }
}
