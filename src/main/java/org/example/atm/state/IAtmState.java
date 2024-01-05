package org.example.atm.state;

import org.example.atm.Atm;
import org.example.atm.Card;

public interface IAtmState {
    default void insertCard(Atm atm, Card card) {
        System.out.println("Not Allowed");
    }

    default void verifyPin(Atm atm, String pin) {
        System.out.println("Not Allowed");
    }

    default void cashWithdrawal(Atm atm, Integer amount) {
        System.out.println("Not Allowed");
    }

    default void checkBalance(Atm atm) {
        System.out.println("Not Allowed");
    }

    default void cancelTxn(Atm atm) {
        System.out.println("Not Allowed");
    }

}
