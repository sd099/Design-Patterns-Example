package org.example.designPatterns.observerPattern2.observable;

import org.example.designPatterns.observerPattern2.observer.IDevice;

import java.util.ArrayList;
import java.util.List;

public class IphoneInventory implements IInventory{
    List<IDevice> deviceList = new ArrayList<>();
    Integer stock = 0;
    @Override
    public void add(IDevice device) {
        deviceList.add(device);
    }

    @Override
    public void remove(IDevice device) {
        deviceList.remove(device);
    }

    @Override
    public void notifyObserver() {
        for (IDevice device : deviceList) {
            device.update();
        }
    }

    @Override
    public void setData(Integer stockCount) {
        this.stock = stockCount;
        if (stock > 0) {
            notifyObserver();
        }
    }
}
