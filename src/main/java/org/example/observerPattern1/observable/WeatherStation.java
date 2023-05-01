package org.example.observerPattern1.observable;

import org.example.observerPattern1.observer.IDisplay;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStation{

    public List<IDisplay> displayList = new ArrayList<>();
    public Integer temp = 0;

    @Override
    public void add(IDisplay display) {
        displayList.add(display);
    }

    @Override
    public void remove(IDisplay display) {
        displayList.remove(display);
    }

    @Override
    public void notifyObserver() {
        for (IDisplay display : displayList) {
            display.update(temp);
        }
    }

    @Override
    public Integer getData() {
        return temp;
    }

    @Override
    public void setData(Integer temp) {
        this.temp = temp;
        notifyObserver();
    }
}
