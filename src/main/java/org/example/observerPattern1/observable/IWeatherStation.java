package org.example.observerPattern1.observable;

import org.example.observerPattern1.observer.IDisplay;

public interface IWeatherStation {
    void add(IDisplay display);
    void remove(IDisplay display);
    void notifyObserver();
    void setData(Integer temp);
    Integer getData();
}
