package org.example.carRental;

public interface IPricingStrategy {
    Double getPrice(int unit, String model);
}
