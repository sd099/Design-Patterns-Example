package org.example.bookMyShow;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Location {

    // we should use map instead of list for search optimization
    private List<Theatre> theatreList;
    private Address address;

    public Location(Address address) {
        this.theatreList = new ArrayList<>();
        this.address = address;
    }

    public void addTheatre(Theatre theatre) {
        theatre.setAddress(this.address);
        theatreList.add(theatre);
    }

    public void removeTheatre(Theatre theatre) {
        theatreList.remove(theatre);
    }
}
