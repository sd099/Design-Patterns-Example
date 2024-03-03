package org.example.designPatterns.observerPattern1.observer;

public class TvDisplay implements IDisplay{

    @Override
    public void update(Integer temp) {
        System.out.println("Temp in tv display : " + temp);
    }
}
