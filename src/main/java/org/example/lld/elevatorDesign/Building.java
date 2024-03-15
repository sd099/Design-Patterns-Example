package org.example.lld.elevatorDesign;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Building {
    private List<Floor> floorList = new ArrayList<>();

    public void addFloor(Floor floor) {
        floorList.add(floor);
    }

    public void removeFloor(Floor floor) {
        floorList.remove(floor);
    }
}
