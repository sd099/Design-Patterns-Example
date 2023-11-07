package org.example.elevatorDesign;

public interface ISchedulingStrategy {
    void scheduleRequest(Elevator elevator, int destinationFloor, Direction direction);
    void move(Elevator elevator);
}
