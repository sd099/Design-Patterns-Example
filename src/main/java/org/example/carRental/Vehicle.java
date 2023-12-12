package org.example.carRental;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Vehicle {
    private String modelName;
    private String vehicleNo;
    private VehicleType vehicleType;
    private VehicleStatus currentStatus;

    public void changeVehicleStatus(VehicleStatus vehicleStatus) {
        this.currentStatus = vehicleStatus;
    }
}
