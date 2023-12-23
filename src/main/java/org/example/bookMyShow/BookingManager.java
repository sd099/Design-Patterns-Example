package org.example.bookMyShow;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class BookingManager {
    private List<Location> locations;

    public BookingManager(List<Location> locations) {
        this.locations = locations;
    }

    public Ticket bookTicket(String city, Integer theatreId, Integer audiId, List<Integer> seatNos, String movieName, LocalDateTime showTime) {
        Location location = findLocationByCity(city);
        Theatre theatre = findTheatreById(theatreId, location);
        Audi audi = findAudiById(theatre, audiId);
        Show show = findShowByMovieAndShowTime(audi, movieName,showTime);

        Double price = 0D;

        for (Seat seat : show.getSeatList()) {
            if (seatNos.contains(seat.getSeatId())) {
                price = price + show.bookSeat(seat.getSeatId());
            }
        }

        Ticket ticket = new Ticket();
        ticket.setTime(showTime);
        ticket.setMovieName(movieName);
        ticket.setTheatreName(theatre.getTheatreName());
        ticket.setAudiId(audiId);
        ticket.setSeatNos(seatNos);
        ticket.setPrice(price);
        return ticket;
    }

    private Show findShowByMovieAndShowTime(Audi audi, String movieName, LocalDateTime showTime) {
        for (Show show : audi.getShowList()) {
            if (movieName.equalsIgnoreCase(show.getMovie().getTitle()) && showTime.isEqual(show.getShowTime())) {
                return show;
            }
        }
        return null;
    }

    private Audi findAudiById(Theatre theatre, Integer audiId) {
        for (Audi audi : theatre.getAudiList()) {
            if (audiId.equals(audi.getAudiId())) {
                return audi;
            }
        }
        return null;
    }

    private Location findLocationByCity(String city) {
        for (Location location : locations) {
            if (location.getAddress().getCity().equalsIgnoreCase(city)) {
                return location;
            }
        }
        return null;
    }

    private Theatre findTheatreById(Integer theatreId, Location location) {
        for (Theatre theatre : location.getTheatreList()) {
            if (theatreId.equals(theatre.getTheatreId())) {
                return theatre;
            }
        }
        return null;
    }
}
