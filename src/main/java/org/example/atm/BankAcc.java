package org.example.atm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAcc {
    private String accNo;
    private Integer balance;
}
