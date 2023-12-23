package org.example.bookMyShow;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ticket {
    private String movieName;
    private String theatreName;
    private Integer audiId;
    private List<Integer> seatNos;
    private LocalDateTime time;
    private Double price;

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", theatreName='" + theatreName + '\'' +
                ", audiId=" + audiId +
                ", seatNos=" + seatNos +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}
