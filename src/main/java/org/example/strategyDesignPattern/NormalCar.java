package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.strategies.NormalDrive;

public class NormalCar extends Car{
    NormalCar() {
        super(new NormalDrive());
    }
}
