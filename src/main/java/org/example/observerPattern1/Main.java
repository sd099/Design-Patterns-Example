package org.example.observerPattern1;

import org.example.observerPattern1.observable.IWeatherStation;
import org.example.observerPattern1.observable.WeatherStation;
import org.example.observerPattern1.observer.IDisplay;
import org.example.observerPattern1.observer.MobileDisplay;
import org.example.observerPattern1.observer.TvDisplay;

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
