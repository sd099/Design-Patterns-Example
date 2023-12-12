package org.example.carRental;

import java.util.HashMap;
import java.util.Map;

public class PriceDayWise implements IPricingStrategy {

    private static Map<String, Double> pricingMapping = new HashMap<>();

    static {
        pricingMapping.put("Swift", 2000D);
    }

    public Double getPrice(int unit, String model) {
        Double price = pricingMapping.get(model);
        return unit * price;
    }
}
