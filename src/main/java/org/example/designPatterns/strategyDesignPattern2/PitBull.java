package org.example.designPatterns.strategyDesignPattern2;

import org.example.designPatterns.strategyDesignPattern2.strategies.HealthyFood;
import org.example.designPatterns.strategyDesignPattern2.strategies.BadLook;

public class PitBull extends Dog{
    PitBull() {
        super(new BadLook(), new HealthyFood());
    }
}
