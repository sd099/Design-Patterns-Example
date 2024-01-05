package org.example.atm.state;

import org.example.atm.Atm;

public class PinVerificationState implements  IAtmState{
    public void verifyPin(Atm atm, String pin) {
        if (atm.getCurrentCard().getPin().equals(pin)) {
            System.out.println("Pin Verified");
            atm.setCurrentState(new OptionsState());
            return;
        }
        System.out.println("Invalid Pin");
        cancelTxn(atm);
    }

    public void cancelTxn(Atm atm) {
        System.out.println("Txn cancel");
        atm.setCurrentState(new IdealState(atm));
    }
}
