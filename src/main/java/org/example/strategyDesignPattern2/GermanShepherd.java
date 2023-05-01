package org.example.strategyDesignPattern2;

import org.example.strategyDesignPattern2.strategies.GoodLook;
import org.example.strategyDesignPattern2.strategies.HealthyFood;

public class GermanShepherd extends Dog{
    GermanShepherd() {
        super(new GoodLook(), new HealthyFood());
    }
}
