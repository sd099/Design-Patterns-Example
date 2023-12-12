package org.example.carRental;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class VehicleInventory {
    List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }

    public void changeVehicleStatus(String vehicleNo, VehicleStatus vehicleStatus) {
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getVehicleNo(), vehicleNo)) {
                vehicle.changeVehicleStatus(vehicleStatus);
            }
        }
    }
}
