package org.example.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SeatDetailDto {
    private SeatType seatType;
    private Integer noOfSeat;
}
