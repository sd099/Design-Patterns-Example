package org.example.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private String duration;
    private Genre genre;
}
