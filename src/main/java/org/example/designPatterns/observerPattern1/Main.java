package org.example.designPatterns.observerPattern1;

import org.example.designPatterns.observerPattern1.observable.WeatherStation;
import org.example.designPatterns.observerPattern1.observer.IDisplay;
import org.example.designPatterns.observerPattern1.observer.TvDisplay;
import org.example.designPatterns.observerPattern1.observable.IWeatherStation;
import org.example.designPatterns.observerPattern1.observer.MobileDisplay;

public class Main {
    public static void main(String[] args) {

        IWeatherStation weatherStation = new WeatherStation();

        IDisplay tvDisplay = new TvDisplay();
        IDisplay mobileDisplay = new MobileDisplay();

        weatherStation.add(tvDisplay);
        weatherStation.add(mobileDisplay);

        weatherStation.setData(6);
        weatherStation.setData(10);
    }
}
