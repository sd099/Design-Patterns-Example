package org.example.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.example.parkingLot.parkingStrategy.IParkingStrategy;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    IParkingStrategy parkingStrategy;

    public ParkingSpotManager(IParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
        this.parkingSpotList = new ArrayList<>();

        for (int i=0;i<50;i++) {
            parkingSpotList.add(new TwoWheelerParkingSpot(i));
            parkingSpotList.add(new FourWheelerParkingSpot(i+50));
        }
    }

    public ParkingSpot bookParkingSpot(ParkingSpotType parkingSpotType, Vehicle vehicle) {
        ParkingSpot parkingSpot = getParkingSpot(parkingSpotType);
        return addVehicleIntoParkingSpot(parkingSpot, vehicle);
    }

    //get parking spot
    private ParkingSpot getParkingSpot(ParkingSpotType parkingSpotType) {
        ParkingSpot parkingSpot = parkingStrategy.getParkingSpot(parkingSpotList, parkingSpotType);
        if (Objects.isNull(parkingSpot)) {
            return null;
        }

        return parkingSpot;
    }

    //book a parking spot
    private ParkingSpot addVehicleIntoParkingSpot(ParkingSpot parkingSpot, Vehicle vehicle) {
        if (Objects.isNull(parkingSpot)) {
            return null;
        }

        for (ParkingSpot parkingSpot1 : parkingSpotList) {
            if (parkingSpot1.equals(parkingSpot)) {
                parkingSpot1.addVehicle(vehicle);
                return parkingSpot1;
            }
        }

        return null;
    }
}
