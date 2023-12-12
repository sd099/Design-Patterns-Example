package org.example.carRental;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class BookingManager {
    private List<Booking> bookingList = new ArrayList<>();
    private IPricingStrategy pricingStrategy = new PriceDayWise();

    public void addBooking(String id, LocalDateTime startDate, LocalDateTime endDate, Vehicle vehicle) {
        int duration = endDate.getDayOfYear() - startDate.getDayOfYear();
        if (duration <= 0) {
            duration = 1;
        }
        Booking booking = new Booking(id, vehicle.getVehicleNo(), BookingStatus.BOOKING_CONFIRMED,
                startDate,endDate, pricingStrategy.getPrice(duration, vehicle.getModelName()));
        bookingList.add(booking);
    }

    public Boolean cancelBooking(String bookingId) {
        for (Booking booking : bookingList) {
            if (Objects.equals(booking.getBookingId(), bookingId)) {
                booking.setStatus(BookingStatus.CANCELLED);
                return true;
            }
        }
        return false;
    }
}
