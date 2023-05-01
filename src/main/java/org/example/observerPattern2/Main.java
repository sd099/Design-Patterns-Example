package org.example.observerPattern2;

import org.example.observerPattern2.observable.IInventory;
import org.example.observerPattern2.observable.IphoneInventory;
import org.example.observerPattern2.observer.Android;
import org.example.observerPattern2.observer.IDevice;
import org.example.observerPattern2.observer.Iphone;

public class Main {
    public static void main(String[] args) {

        IInventory iphoneInventory = new IphoneInventory();

        IDevice android = new Android(new IphoneInventory(), "android@gmail.com");
        IDevice iphone = new Iphone(new IphoneInventory(), "iphone@gmail.com");

        iphoneInventory.add(android);
        iphoneInventory.add(iphone);

        iphoneInventory.setData(50);
        iphoneInventory.setData(0);
        iphoneInventory.setData(-1);
        iphoneInventory.setData(100);

    }
}
