package org.example.bookMyShow;

import lombok.Data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class SearchEngine {
    private List<Location> locations;
    private IPrintMovieStrategy printMovieDetails;

    public SearchEngine(List<Location> locations, IPrintMovieStrategy printMovieDetails) {
        this.locations = locations;
        this.printMovieDetails = printMovieDetails;
    }

    public Set<Theatre> searchMovieByName(String city, String movieName) {
        Set<Theatre> result = new HashSet<>();
        for (Location location : locations) {
            if (location.getAddress().getCity().equals(city)) {
                for (Theatre theatre : location.getTheatreList()) {
                    for (Audi audi : theatre.getAudiList()) {
                        for (Show show : audi.getShowList()) {
                            if (show.getMovie().getTitle().equals(movieName)) {
                                result.add(theatre);
                            }
                        }
                    }
                }
            }

        }
        printMovieDetails.printMovieDetails(result, movieName);
        return result;
    }
}
