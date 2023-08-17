package org.example.ticTacToe;

import lombok.Getter;

@Getter
public class Player {
    private String name;
    private String piece;

    public Player(String name, String piece) {
        this.name = name;
        this.piece = piece;
    }
}
