package org.example.bookMyShow;

import java.util.Set;

public interface IPrintMovieStrategy {
    void printMovieDetails(Set<Theatre> theatreList, String movieName);
}
