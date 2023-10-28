package org.example.parkingLot;

import lombok.Data;

import java.util.Objects;

@Data
public abstract class ParkingSpot {
    int spotNo ;
    Vehicle vehicle;
    ParkingSpotType parkingSpotType;

    ParkingSpot(int spotNo, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        this.spotNo = spotNo;
        this.vehicle = vehicle;
        this.parkingSpotType = parkingSpotType;
    }

    //add a vehicle
    public Boolean addVehicle(Vehicle vehicle) {
        if (Objects.isNull(vehicle)) {
            return false;
        }
        if (!Objects.isNull(this.vehicle)) {
            return false;
        }

        this.vehicle = vehicle;

        return true;
    }


    //remove a vehicle
    public Boolean removeVehicle() {
        if (Objects.isNull(this.vehicle)) {
            return false;
        }

        this.vehicle = null;
        return true;
    }
}
