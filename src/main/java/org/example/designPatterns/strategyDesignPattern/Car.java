package org.example.designPatterns.strategyDesignPattern;

import org.example.designPatterns.strategyDesignPattern.strategies.IDriveStrategy;

public abstract class Car {
    IDriveStrategy driveStrategy;

    Car(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
