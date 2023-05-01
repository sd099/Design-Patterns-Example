package org.example.strategyDesignPattern2;

import org.example.strategyDesignPattern2.strategies.BadLook;
import org.example.strategyDesignPattern2.strategies.HealthyFood;

public class PitBull extends Dog{
    PitBull() {
        super(new BadLook(), new HealthyFood());
    }
}
