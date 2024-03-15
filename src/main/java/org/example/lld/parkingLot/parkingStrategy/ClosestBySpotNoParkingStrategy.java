package org.example.lld.parkingLot.parkingStrategy;

import java.util.List;
import java.util.Objects;

import org.example.lld.parkingLot.ParkingSpot;
import org.example.lld.parkingLot.ParkingSpotType;

public class ClosestBySpotNoParkingStrategy implements IParkingStrategy{
    @Override
    public ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpotList, ParkingSpotType parkingSpotType) {
        for(ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getParkingSpotType().equals(parkingSpotType) && Objects.isNull(parkingSpot.getVehicle())) {
                return parkingSpot;
            }
        }
        return null;
    }

}
