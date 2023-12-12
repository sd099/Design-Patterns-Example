package org.example.carRental;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Store {
    private VehicleInventory vehicleInventory;
    private String address;
    private BookingManager bookingManager;
    private Integer storeId;

    public boolean findVehicle(String modelName, LocalDateTime startDate, LocalDateTime endDate) {
        for (Vehicle vehicle : vehicleInventory.getVehicleList()) {
            if (vehicle.getModelName().equals(modelName) && VehicleStatus.AVAILABLE.equals(vehicle.getCurrentStatus())) {
                for (Booking booking : bookingManager.getBookingList()) {
                    if (booking.getVehicleNo().equals(vehicle.getVehicleNo())
                            && !BookingStatus.CANCELLED.equals(booking.getStatus())
                            && invalidDateRange(startDate, endDate, booking)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private boolean invalidDateRange(LocalDateTime startDate, LocalDateTime endDate, Booking booking) {
        if ((startDate.getNano() < booking.getStartDate().getNano())
                && (endDate.getNano() < booking.getStartDate().getNano())) {
            return false;
        }
        if ((startDate.getNano() > booking.getEndDate().getNano())
                && (endDate.getNano() > booking.getEndDate().getNano())) {
            return false;
        }

        return true;
    }

    public void bookVehicle(String modelName, LocalDateTime startDate, LocalDateTime endDate) {
        for (Vehicle vehicle : vehicleInventory.getVehicleList()) {
            if (vehicle.getModelName().equals(modelName) && VehicleStatus.AVAILABLE.equals(vehicle.getCurrentStatus())) {
                bookingManager.addBooking(String.valueOf(LocalDateTime.now().getSecond()), startDate, endDate, vehicle);
            }
        }
    }


}
