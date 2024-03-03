package org.example.designPatterns.observerPattern1.observer;

public class MobileDisplay implements IDisplay{

    @Override
    public void update(Integer temp) {
        System.out.println("Temp in mobile display : " + temp);
    }
}
