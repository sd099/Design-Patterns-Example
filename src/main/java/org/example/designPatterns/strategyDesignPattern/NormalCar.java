package org.example.designPatterns.strategyDesignPattern;

import org.example.designPatterns.strategyDesignPattern.strategies.NormalDrive;

public class NormalCar extends Car{
    NormalCar() {
        super(new NormalDrive());
    }
}
