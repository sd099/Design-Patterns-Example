package org.example.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seat {
    private Integer seatId;
    private SeatStatus seatStatus;
    private SeatType seatType;
}
