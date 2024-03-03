package org.example.designPatterns.adaptorPattern;

import org.example.designPatterns.adaptorPattern.adaptee.WeightCalculator;
import org.example.designPatterns.adaptorPattern.adaptor.IWeightAdaptor;
import org.example.designPatterns.adaptorPattern.adaptor.WeightAdaptorKg;

public class Main {
    public static void main(String[] args) {
        IWeightAdaptor weightAdaptorKg = new WeightAdaptorKg(new WeightCalculator());
        weightAdaptorKg.calculate();
    }
}
