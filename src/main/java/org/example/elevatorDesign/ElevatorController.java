package org.example.elevatorDesign;

import lombok.Getter;

@Getter
public class ElevatorController {
    private Elevator elevator;
    private ISchedulingStrategy schedulingStrategy;

    public ElevatorController(Elevator elevator, ISchedulingStrategy schedulingStrategy) {
        this.elevator = elevator;
        this.schedulingStrategy = schedulingStrategy;
    }

    public void scheduleRequest(int floorNo, Direction direction) {
        schedulingStrategy.scheduleRequest(elevator, floorNo, direction);
        schedulingStrategy.move(elevator);
    }

}
