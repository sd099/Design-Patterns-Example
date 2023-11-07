package org.example.elevatorDesign;

import lombok.Getter;

@Getter
public class ExternalButton {
    private ElevatorController elevatorController;

    public ExternalButton(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    public void pressButton(int floorNo, Direction direction) {
        elevatorController.scheduleRequest(floorNo, direction);
    }
}
