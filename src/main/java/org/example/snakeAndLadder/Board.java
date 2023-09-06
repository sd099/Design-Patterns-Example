package org.example.snakeAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import lombok.Data;

@Data
public class Board {
    private int[] board = new int[100];
    private List<JumpPoints> snakes = new ArrayList<>();
    private List<JumpPoints> ladders = new ArrayList<>();

    public void init () {

        Scanner scanner = new Scanner(System.in);
        int snakeNo, ladderNo;
        while(true) {
            System.out.println("Enter snake number between 5-9");
            int s = scanner.nextInt();
            if (isValidInput(s)) {
                snakeNo = s;
                break;
            }
        }

        while(true) {
            System.out.println("Enter ladder number between 5-9");
            int s = scanner.nextInt();
            if (isValidInput(s)) {
                ladderNo = s;
                break;
            }
        }

        while(snakeNo > 0) {
            int start = getRandomNoInRange(1,99);
            int end = getRandomNoInRange(1,99);

            if (start > end) {
                JumpPoints snake = new Snake(start, end);
                snakes.add(snake);
                snakeNo--;
            }
        }

        while(ladderNo > 0) {
            int start = getRandomNoInRange(1,99);
            int end = getRandomNoInRange(1,99);

            if (start < end) {
                JumpPoints ladder = new Ladder(start, end);
                ladders.add(ladder);
                ladderNo--;
            }
        }

        System.out.println("Board is ready");
    }

    private int getRandomNoInRange(int start, int end) {
        return new Random().nextInt((end-start) +1) + start;
    }

    private boolean isValidInput(int s) {
        if (s >= 5 && s <= 9) {
            return true;
        }
        return false;
    }
}
