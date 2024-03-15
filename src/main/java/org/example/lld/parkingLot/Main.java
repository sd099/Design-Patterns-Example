package org.example.lld.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi");

        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        parkingFloorList.add(new ParkingFloor(0));

        ParkingLot parkingLot = new ParkingLot("SD Parking Lot", "xyz", parkingFloorList);

        Ticket ticket = parkingLot.getParkingFloorList().get(0).getEntryGates().get(0).generateTicket(new Vehicle("1234", ParkingSpotType.FOUR_WHEELER));

        System.out.println(ticket);

        Thread.sleep(5000);

        int parkingPrice = parkingLot.getParkingFloorList().get(0).getExitGates().get(0).calculatePrice(ticket);

        System.out.println(parkingPrice);


    }
}
