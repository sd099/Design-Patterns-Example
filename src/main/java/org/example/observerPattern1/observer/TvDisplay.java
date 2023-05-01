package org.example.observerPattern1.observer;

import org.example.observerPattern1.observable.IWeatherStation;

public class TvDisplay implements IDisplay{

    @Override
    public void update(Integer temp) {
        System.out.println("Temp in tv display : " + temp);
    }
}
