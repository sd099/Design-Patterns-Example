package org.example.lld.parkingLot.parkingStrategy;

import org.example.lld.parkingLot.ParkingSpot;
import org.example.lld.parkingLot.ParkingSpotType;

import java.util.List;

public interface IParkingStrategy {

    ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpotList, ParkingSpotType parkingSpotType);

}
