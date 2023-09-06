package org.example.snakeAndLadder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    String name;
    int pos = 0;
}
