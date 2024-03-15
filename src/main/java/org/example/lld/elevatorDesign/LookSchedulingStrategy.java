package org.example.lld.elevatorDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LookSchedulingStrategy implements ISchedulingStrategy{

    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private List<Integer> pending = new ArrayList<>();

    @Override
    public void scheduleRequest(Elevator elevator, int destinationFloor, Direction direction) {
        int currentFloor = elevator.getCurrentFloor();
        Direction currentDirection = elevator.getDirection();

        if (Direction.UP.equals(direction)) {
            if (Direction.UP.equals(currentDirection)) {
                if (destinationFloor > currentFloor) {
                    minHeap.add(destinationFloor);
                } else {
                    pending.add(destinationFloor);
                }
            } else {
                maxHeap.add(destinationFloor);
            }
        } else {
            if (Direction.DOWN.equals(currentDirection)) {
                if (destinationFloor < currentFloor) {
                    maxHeap.add(destinationFloor);
                } else {
                    pending.add(destinationFloor);
                }
            } else {
                minHeap.add(destinationFloor);
            }
        }
    }

    public void move(Elevator elevator) {
        Direction currentDirection = elevator.getDirection();

        if (Direction.UP.equals(currentDirection)) {
            if (minHeap.isEmpty()) {
                minHeap.addAll(pending);
                pending.clear();
                elevator.setDirection(Direction.DOWN);
                move(elevator);
            } else {
                elevator.move(minHeap.peek());
                minHeap.poll();
            }
        } else {
            if (maxHeap.isEmpty()) {
                maxHeap.addAll(pending);
                pending.clear();
                elevator.setDirection(Direction.UP);
                move(elevator);
            } else {
                elevator.move(maxHeap.peek());
                maxHeap.poll();
            }
        }

    }
}
