package org.example.carRental;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Swift", "AS-01-2255", VehicleType.CAR, VehicleStatus.AVAILABLE);

        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.addVehicle(vehicle);

        Store store = new Store(vehicleInventory, "Delhi", new BookingManager(), 1);

        Location location = new Location("Delhi", List.of(store));

        Store store1 = location.findVehicle("Swift",
                LocalDateTime.of(2023,12,12,10,11,1),
                LocalDateTime.of(2023,12,13,10,11,1));

        store1.bookVehicle("Swift",
                LocalDateTime.of(2023,12,12,10,11,1),
                LocalDateTime.of(2023,12,13,10,11,1));

        store1.getBookingManager().cancelBooking(store1.getBookingManager().getBookingList().get(0).getBookingId());

        Store store2 = location.findVehicle("Swift",
                LocalDateTime.of(2023,12,12,10,11,1),
                LocalDateTime.of(2023,12,13,10,11,1));

        System.out.println("Checking...");


    }
}
