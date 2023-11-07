package org.example.elevatorDesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // object init for demo
        Elevator elevator = new Elevator(Direction.UP, 0, new Display(null, 0), 1, new InternalButton());
        ElevatorController elevatorController = new ElevatorController(elevator, new LookSchedulingStrategy());
        ExternalButton externalButton = new ExternalButton(elevatorController);
        Floor floor = new Floor(List.of(externalButton));
        Building building = new Building();
        building.addFloor(floor);

        //demo
        //scheduling a request
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(3, Direction.UP);

        //scheduling a request
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(6, Direction.UP);

        //scheduling a request
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(2, Direction.DOWN);

        //scheduling a request
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(9, Direction.UP);

        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(10, Direction.UP);
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(9, Direction.DOWN);
        building.getFloorList().get(0).getExternalButtonList().get(0).pressButton(2, Direction.DOWN);


    }
}
