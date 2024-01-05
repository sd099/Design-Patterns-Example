package org.example.atm.state;

import org.example.atm.Atm;
import org.example.atm.amountWithdrawalProcessor.AmountWithdrawalProcessor;
import org.example.atm.amountWithdrawalProcessor.FiveHundredAmountWithdrawalProcessor;
import org.example.atm.amountWithdrawalProcessor.OneHundredAmountWithdrawalProcessor;
import org.example.atm.amountWithdrawalProcessor.TwoThousandAmountWithdrawalProcessor;

public class OptionsState implements IAtmState{

    private AmountWithdrawalProcessor amountWithdrawalProcessor;

    public void cashWithdrawal(Atm atm, Integer amount) {
        if (atm.getCurrentCard().getBankAcc().getBalance() < amount) {
            System.out.println("Insufficient Balance");
        } else if (atm.getAvailableAmount() < amount) {
            System.out.println("Cash not available");
        } else {
            amountWithdrawalProcessor = new TwoThousandAmountWithdrawalProcessor(new FiveHundredAmountWithdrawalProcessor(new OneHundredAmountWithdrawalProcessor(null)));
            amountWithdrawalProcessor.withDraw(atm, amount);
            atm.getCurrentCard().getBankAcc().setBalance(atm.getCurrentCard().getBankAcc().getBalance() - amount);
            System.out.println("Collect your cash!! " + amount + "Rs");
        }
        atm.setCurrentState(new IdealState(atm));
    }

    public void checkBalance(Atm atm) {
        System.out.println("Current balance is: " + atm.getCurrentCard().getBankAcc().getBalance());
        atm.setCurrentState(new IdealState(atm));
    }

    public void cancelTxn(Atm atm) {
        System.out.println("Txn cancel");
        atm.setCurrentState(new IdealState(atm));
    }

}
