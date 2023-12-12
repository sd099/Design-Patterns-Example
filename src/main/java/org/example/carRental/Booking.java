package org.example.carRental;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Booking {
    private String bookingId;
    private String vehicleNo;
    private BookingStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
}
