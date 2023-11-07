package org.example.elevatorDesign;

public class InternalButton {
    public void pressButton(ElevatorController elevatorController, int floorNo) {
        if (floorNo > elevatorController.getElevator().getCurrentFloor()) {
            elevatorController.scheduleRequest(floorNo, Direction.UP);
        } else if (floorNo < elevatorController.getElevator().getCurrentFloor()) {
            elevatorController.scheduleRequest(floorNo, Direction.DOWN);
        } else {
            System.out.println("Invalid floor number");
        }
    }
}
