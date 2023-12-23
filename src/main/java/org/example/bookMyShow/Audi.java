package org.example.bookMyShow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class Audi {
    private List<Show> showList;
    private Integer audiId;
    private List<SeatDetailDto> seatDetails;

    public Audi(Integer audiId, List<SeatDetailDto> seatDetails) {
        this.showList = new ArrayList<>();
        this.seatDetails = seatDetails;
        this.audiId = audiId;
    }

    public void addShow(Movie movie, Map<SeatType, Double> priceSeatTypeWise, LocalDateTime showTime) {

        List<Seat> seatList = new ArrayList<>();
        int j = 1;
        for (SeatDetailDto seatDetailDto : seatDetails) {
            for (int i=1; i<=seatDetailDto.getNoOfSeat(); i++) {
                seatList.add(new Seat(j,SeatStatus.AVAILABLE,seatDetailDto.getSeatType()));
                j++;
            }
        }

        Show show = new Show();
        show.setMovie(movie);
        show.setPriceSeatTypeWise(priceSeatTypeWise);
        show.setSeatList(seatList);
        show.setShowTime(showTime);

        showList.add(show);
    }

    public void removeShow(Show show) {
        showList.remove(show);
    }
}
