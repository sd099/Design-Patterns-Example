package org.example.vendingMachine.states;

import org.example.vendingMachine.Coin;
import org.example.vendingMachine.VendingMachine;

public interface IState {
    default void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Not Allowed");
    }
    default void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Not Allowed");
    }
    default void coinInsertionDone(VendingMachine vendingMachine) {
        System.out.println("Not Allowed");
    }
    default void selectOrder(VendingMachine vendingMachine, Integer slotNo) {
        System.out.println("Not Allowed");
    }
    default void dispenseOrder(VendingMachine vendingMachine, Integer slotNo) {
        System.out.println("Not Allowed");
    }
    default void cancelOrder(VendingMachine vendingMachine) {
        System.out.println("Not Allowed");
    }
}
