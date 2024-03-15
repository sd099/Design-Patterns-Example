package org.example.lld.parkingLot;

import org.example.lld.parkingLot.priceStrategy.IPriceStrategy;

public class ExitGate extends Gate{
    IPriceStrategy priceStrategy;
    ParkingSpotManager parkingSpotManager;

    public ExitGate(IPriceStrategy priceStrategy) {
        super();
        this.priceStrategy = priceStrategy;
    }

    public int calculatePrice(Ticket ticket) {
        ticket.getParkingSpot().removeVehicle();
        return priceStrategy.calculatePrice(ticket);
    }
}
