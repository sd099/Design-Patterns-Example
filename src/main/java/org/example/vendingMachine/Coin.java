package org.example.vendingMachine;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10);

    int val;

    public Integer getValue() {
        return val;
    }
}
