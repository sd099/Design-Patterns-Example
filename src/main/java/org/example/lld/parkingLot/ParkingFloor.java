package org.example.lld.parkingLot;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import org.example.lld.parkingLot.parkingStrategy.ClosestBySpotNoParkingStrategy;
import org.example.lld.parkingLot.priceStrategy.HourlyPrice;

@Getter
public class ParkingFloor {
    private int floorNo;

    private ParkingSpotManager parkingSpotManager;

    private List<EntryGate> entryGates;

    private List<ExitGate> exitGates;

    public ParkingFloor(int floorNo) {
        entryGates = new ArrayList<>();
        exitGates = new ArrayList<>();
        this.floorNo = floorNo;
        this.parkingSpotManager = new ParkingSpotManager(new ClosestBySpotNoParkingStrategy());
        this.entryGates.add(new EntryGate(parkingSpotManager));
        this.exitGates.add(new ExitGate(new HourlyPrice()));
    }

}
