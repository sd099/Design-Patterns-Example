package org.example.bookMyShow;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        Location location = new Location(new Address("Noida","781001","Uttar Pradesh"));
        Theatre theatre = new Theatre(1, "PVR");
        List<SeatDetailDto> seatDetails = new ArrayList<>();
        seatDetails.add(new SeatDetailDto(SeatType.ECONOMY, 45));
        seatDetails.add(new SeatDetailDto(SeatType.DELUXE, 20));
        Audi audi = new Audi(1, seatDetails);
        Movie movie = new Movie("Avenger", "2hr", Genre.ACTION);
        Map<SeatType, Double> priceSeatTypeWise = new HashMap<>();
        priceSeatTypeWise.put(SeatType.DELUXE, 400D);
        priceSeatTypeWise.put(SeatType.ECONOMY, 300D);

        audi.addShow(movie, priceSeatTypeWise, LocalDateTime.of(2023, 1, 1, 0, 0, 0));
        theatre.addAudi(audi);
        location.addTheatre(theatre);
        bookMyShow.addLocation(location);

        Set<Theatre> theatreList = bookMyShow.getSearchEngine().searchMovieByName("Noida", "Avenger");

        Ticket ticket = bookMyShow.getBookingManager().bookTicket("Noida", 1,1,new ArrayList<>(Arrays.asList(1,2,3,4,5)), "Avenger", LocalDateTime.of(2023, 1, 1, 0, 0, 0));
        System.out.println(ticket);

        Ticket ticket1 = bookMyShow.getBookingManager().bookTicket("Noida", 1,1,new ArrayList<>(Arrays.asList(55,56)), "Avenger", LocalDateTime.of(2023, 1, 1, 0, 0, 0));
        System.out.println(ticket1);

    }
}
