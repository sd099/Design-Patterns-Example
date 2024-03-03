package org.example.designPatterns.strategyDesignPattern;

import org.example.designPatterns.strategyDesignPattern.strategies.SportsDrive;

public class SportsCar extends Car {
    SportsCar() {
        super(new SportsDrive());
    }
}
