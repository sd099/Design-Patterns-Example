package org.example.lld.snakeAndLadder;

import lombok.Data;

@Data
public class Dice {
    public int roll() {
        return ((int) (Math.random() * 6) + 1);
    }
}
