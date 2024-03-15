package org.example.lld.parkingLot;

import java.time.LocalDateTime;
import java.util.Objects;


public class EntryGate extends Gate{

    private ParkingSpotManager parkingSpotManager;

    public EntryGate(ParkingSpotManager parkingSpotManager) {
        super();
        this.parkingSpotManager = parkingSpotManager;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = parkingSpotManager.bookParkingSpot(vehicle.getParkingSpotType(), vehicle);
        if (!Objects.isNull(parkingSpot)) {
            return new Ticket(LocalDateTime.now(), vehicle, parkingSpot);
        }
        return null;
    }
}
