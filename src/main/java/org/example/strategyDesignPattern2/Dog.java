package org.example.strategyDesignPattern2;

import org.example.strategyDesignPattern2.strategies.IDogEat;
import org.example.strategyDesignPattern2.strategies.IDogLook;

public abstract class Dog {
    String Bark;
    IDogEat iDogEat;
    IDogLook iDogLook;

    Dog(IDogLook iDogLook, IDogEat iDogEat) {
        this.iDogEat = iDogEat;
        this.iDogLook = iDogLook;
    }

    void bark() {
        System.out.println("this dog bark");
    }

    void look() {
        iDogLook.look();
    }

    void eat() {
        iDogEat.eat();
    }
}
