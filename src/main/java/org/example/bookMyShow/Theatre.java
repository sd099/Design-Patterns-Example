package org.example.bookMyShow;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Theatre {
    private List<Audi> audiList;
    private Address address;
    private Integer theatreId;
    private String theatreName;

    public Theatre(Integer theatreId, String theatreName) {
        this.audiList = new ArrayList<>();
        this.theatreId = theatreId;
        this.theatreName = theatreName;
    }

    public void addAudi(Audi audi) {
        audiList.add(audi);
    }

    public void removeAudi(Audi audi) {
        audiList.remove(audi);
    }

}
