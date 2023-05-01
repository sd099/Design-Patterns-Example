package org.example.strategyDesignPattern.strategies;

public class NormalDrive implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("inside normal drive");
    }
}
