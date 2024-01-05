package org.example.atm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private BankAcc bankAcc;
    private String cardNo;
    private String pin;
}
