package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.strategies.IDriveStrategy;

public abstract class Car {
    IDriveStrategy driveStrategy;

    Car(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
