package org.example.observerPattern2.observable;

import org.example.observerPattern2.observer.IDevice;

public interface IInventory {
    void add(IDevice device);
    void remove(IDevice device);
    void notifyObserver();
    void setData(Integer stockCount);
}
