package org.example.designPatterns.strategyDesignPattern2;

import org.example.designPatterns.strategyDesignPattern2.strategies.GoodLook;
import org.example.designPatterns.strategyDesignPattern2.strategies.HealthyFood;

public class GermanShepherd extends Dog{
    GermanShepherd() {
        super(new GoodLook(), new HealthyFood());
    }
}
