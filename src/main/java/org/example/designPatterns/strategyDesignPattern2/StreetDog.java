package org.example.designPatterns.strategyDesignPattern2;

import org.example.designPatterns.strategyDesignPattern2.strategies.BadLook;
import org.example.designPatterns.strategyDesignPattern2.strategies.UnhealthyFood;

public class StreetDog extends Dog{
    StreetDog() {
        super(new BadLook(), new UnhealthyFood());
    }
}
