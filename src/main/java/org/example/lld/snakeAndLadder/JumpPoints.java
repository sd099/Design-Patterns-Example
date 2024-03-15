package org.example.lld.snakeAndLadder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class JumpPoints {
    int start;
    int end;
}
