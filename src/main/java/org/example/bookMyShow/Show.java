package org.example.bookMyShow;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public class Show {
    private Movie movie;
    private List<Seat> seatList;
    private Map<SeatType, Double> priceSeatTypeWise;
    private LocalDateTime showTime;

    public Double bookSeat(int seatId) {
        for (Seat seat : seatList) {
            if (seat.getSeatId().equals(seatId)) {
                if(SeatStatus.AVAILABLE.equals(seat.getSeatStatus())) {
                    synchronized (Show.class) {
                        seat.setSeatStatus(SeatStatus.BOOKED);
                        return priceSeatTypeWise.get(seat.getSeatType());
                    }
                } else {
                    return null;
                }
            }
        }
        return null;
    }

}
