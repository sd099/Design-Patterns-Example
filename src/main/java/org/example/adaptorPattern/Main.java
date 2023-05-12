package org.example.adaptorPattern;

import org.example.adaptorPattern.adaptee.WeightCalculator;
import org.example.adaptorPattern.adaptor.IWeightAdaptor;
import org.example.adaptorPattern.adaptor.WeightAdaptorKg;

public class Main {
    public static void main(String[] args) {
        IWeightAdaptor weightAdaptorKg = new WeightAdaptorKg(new WeightCalculator());
        weightAdaptorKg.calculate();
    }
}
