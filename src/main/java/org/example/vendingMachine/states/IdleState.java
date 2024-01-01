package org.example.vendingMachine.states;

import org.example.vendingMachine.VendingMachine;

public class IdleState implements IState {

    public IdleState() {}

    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setCurrentTxnAmount(0);
    }
    
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setState(new CoinInsertionState());
    }
}
