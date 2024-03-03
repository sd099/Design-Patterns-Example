package org.example.designPatterns.strategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar();
        sportsCar.drive();

        Car normalCar = new NormalCar();
        normalCar.drive();
   }
}