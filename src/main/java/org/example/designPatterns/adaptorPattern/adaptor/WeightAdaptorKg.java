package org.example.designPatterns.adaptorPattern.adaptor;

import org.example.designPatterns.adaptorPattern.adaptee.WeightCalculator;

public class WeightAdaptorKg implements IWeightAdaptor{
    WeightCalculator weightCalculator;

    public WeightAdaptorKg(WeightCalculator weightCalculator) {
        this.weightCalculator = weightCalculator;
    }
    @Override
    public void calculate() {
        System.out.println(weightCalculator.calculate() / 2);
    }
}
