package org.example.lld.parkingLot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    private String vehicleNo;
    private ParkingSpotType parkingSpotType;
}
