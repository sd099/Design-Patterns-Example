package org.example.strategyDesignPattern2;

public class Main {
    public static void main(String[] args) {
        Dog streetDog = new StreetDog();
        streetDog.bark();
        streetDog.look();
        streetDog.eat();

        Dog germanShepherd = new GermanShepherd();
        germanShepherd.bark();
        germanShepherd.look();
        germanShepherd.eat();

        Dog pitBull = new PitBull();
        pitBull.bark();
        pitBull.look();
        pitBull.eat();
    }
}
