package org.example.parkingLot.parkingStrategy;

import org.example.parkingLot.ParkingSpot;
import org.example.parkingLot.ParkingSpotType;

import java.util.List;

public interface IParkingStrategy {

    ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpotList, ParkingSpotType parkingSpotType);

}
