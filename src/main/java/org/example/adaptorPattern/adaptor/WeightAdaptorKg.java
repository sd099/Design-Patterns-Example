package org.example.adaptorPattern.adaptor;

import org.example.adaptorPattern.adaptee.WeightCalculator;

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
