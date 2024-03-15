package org.example.lld.elevatorDesign;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Elevator {
    private Direction direction;
    private int currentFloor;
    private Display display;
    private int elevatorId;
    private InternalButton internalButton;

    public void move(int floorNo) {

        if (floorNo > currentFloor) {
            direction = Direction.UP;
            display.setDirection(Direction.UP);
            for (int i=currentFloor; i<=floorNo; i++) {
                if (i==floorNo) {
                    System.out.println("lift is at floor no: " + i + ".Stopped");
                } else {
                    System.out.println("lift is at floor no: " + i);
                }
                currentFloor = i;
                display.setCurrentFloor(currentFloor);
            }
        } else {
            direction = Direction.DOWN;
            display.setDirection(Direction.DOWN);
            for (int i=currentFloor; i>=floorNo; i--) {
                if (i==floorNo) {
                    System.out.println("lift is at floor no: " + i + ".Stopped");
                } else {
                    System.out.println("lift is at floor no: " + i);
                }
                currentFloor = i;
                display.setCurrentFloor(currentFloor);
            }
        }
    }

}
