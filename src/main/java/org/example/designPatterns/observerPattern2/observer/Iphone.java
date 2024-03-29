package org.example.designPatterns.observerPattern2.observer;

import org.example.designPatterns.observerPattern2.observable.IInventory;

public class Iphone implements IDevice{
    IInventory inventory;
    String email;

    public Iphone(IInventory inventory, String email) {
        this.inventory = inventory;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("stock available. email sent to : " + email);
    }
}
