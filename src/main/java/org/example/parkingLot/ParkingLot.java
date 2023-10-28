package org.example.parkingLot;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ParkingLot {
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloorList;
}
