package org.example.vendingMachine.states;

import org.example.vendingMachine.Coin;
import org.example.vendingMachine.VendingMachine;

public class CoinInsertionState implements IState{

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.setCurrentTxnAmount(vendingMachine.getCurrentTxnAmount() + coin.getValue());
        System.out.println("Inserted coin: "+ coin.getValue());
    }

    @Override
    public void cancelOrder(VendingMachine vendingMachine) {
        System.out.println("Order cancelled");
        System.out.println("Refunded money. Amount: " + vendingMachine.getCurrentTxnAmount());
        vendingMachine.setState(new IdleState(vendingMachine));
    }

    @Override
    public void coinInsertionDone(VendingMachine vendingMachine) {
        vendingMachine.setState(new OrderSelectionState());
    }
}
