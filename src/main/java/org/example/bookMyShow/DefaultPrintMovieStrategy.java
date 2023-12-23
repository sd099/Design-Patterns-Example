package org.example.bookMyShow;

import java.util.Set;

public class DefaultPrintMovieStrategy implements IPrintMovieStrategy{
    @Override
    public void printMovieDetails(Set<Theatre> theatreList, String movieName) {
        System.out.println("City  | Theatre Name  |  Audi  |  Start time");

        for (Theatre theatre : theatreList) {
            for (Audi audi : theatre.getAudiList()) {
                for (Show show : audi.getShowList()) {
                    if (show.getMovie().getTitle().equalsIgnoreCase(movieName)) {
                        System.out.print(theatre.getAddress().getCity());
                        System.out.print("  |  ");
                        System.out.print(theatre.getTheatreId());
                        System.out.print("  |  ");
                        System.out.print(audi.getAudiId());
                        System.out.print("  |  ");
                        System.out.print(show.getShowTime());
                        System.out.println("\n");
                    }
                }
            }
        }
    }
}
