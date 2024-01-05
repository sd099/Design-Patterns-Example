package org.example.atm;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum NoteType {
    TWO_THOUSANDS(2000),
    FIVE_HUNDREDS(500),
    ONE_HUNDRED(100);

    int val;

    public Integer getNoteValue() {
        return this.val;
    }

}
