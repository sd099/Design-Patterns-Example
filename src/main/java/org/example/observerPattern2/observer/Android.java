package org.example.observerPattern2.observer;

import org.example.observerPattern2.observable.IInventory;

public class Android implements IDevice{

    IInventory inventory;
    String email;

    public Android(IInventory inventory, String email) {
        this.inventory = inventory;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("stock available. email sent to : " + email);
    }
}
