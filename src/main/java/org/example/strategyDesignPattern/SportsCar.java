package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.strategies.SportsDrive;

public class SportsCar extends Car {
    SportsCar() {
        super(new SportsDrive());
    }
}
