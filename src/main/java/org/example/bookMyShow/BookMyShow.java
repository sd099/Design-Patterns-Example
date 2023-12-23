package org.example.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BookMyShow {
    private List<Location> locations;
    private SearchEngine searchEngine;
    private BookingManager bookingManager;

    public BookMyShow() {
        this.locations = new ArrayList<>();
        this.searchEngine = new SearchEngine(this.locations, new DefaultPrintMovieStrategy());
        this.bookingManager = new BookingManager(this.locations);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void removeLocation(Location location) {
        locations.remove(location);
    }
}
