package org.example.elevatorDesign;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Display {
    private Direction direction;
    private int currentFloor;
}
