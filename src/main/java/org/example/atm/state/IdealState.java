package org.example.atm.state;

import org.example.atm.Atm;
import org.example.atm.Card;

public class IdealState implements IAtmState{

    public IdealState() {

    }

    public IdealState(Atm atm) {
        atm.setCurrentCard(null);
    }

    public void insertCard(Atm atm, Card card) {
        for (Card card1 : atm.getCardList()) {
            if (card1.getCardNo().equals(card.getCardNo())) {
                atm.setCurrentState(new PinVerificationState());
                atm.setCurrentCard(card1);
                System.out.println("Card Inserted");
                return;
            }
        }
        System.out.println("Invalid card");
    }
}
