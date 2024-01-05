package org.example.atm;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();

        atm.addNote(NoteType.TWO_THOUSANDS, 5);
        atm.addNote(NoteType.FIVE_HUNDREDS, 5);
        atm.addNote(NoteType.ONE_HUNDRED, 5);

        Card card = new Card(new BankAcc("12345", 10000), "54321", "1234");
        atm.addCard(card);

        atm.getCurrentState().insertCard(atm, card);
        atm.getCurrentState().verifyPin(atm, "1234");
        atm.getCurrentState().checkBalance(atm);

        atm.getCurrentState().insertCard(atm, card);
        atm.getCurrentState().verifyPin(atm, "1234");
        atm.getCurrentState().cashWithdrawal(atm, 5600);

        atm.getCurrentState().insertCard(atm, card);
        atm.getCurrentState().verifyPin(atm, "1234");
        atm.getCurrentState().checkBalance(atm);

        atm.getCurrentState().insertCard(atm, card);
        atm.getCurrentState().cancelTxn(atm);

    }
}
