package org.example.vendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        //populate vending machine inventory
        vendingMachine.addItem(new Item("Coca Cola", 30), 101);
        vendingMachine.addItem(new Item("Sprite" , 60), 102);
        vendingMachine.addItem(new Item("Thumps up", 40), 103);
        vendingMachine.addItem(new Item("Pepsi", 30), 104);
        vendingMachine.addItem(new Item("Fanta", 30), 105);


        // ORDER 1 : successful order
        vendingMachine.getState().pressInsertCoinButton(vendingMachine);

        vendingMachine.getState().insertCoin(vendingMachine, Coin.TEN);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.FIVE);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.FIVE);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.TEN);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.TEN);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.TEN);

        vendingMachine.getState().coinInsertionDone(vendingMachine);

        vendingMachine.getState().selectOrder(vendingMachine, 101);

        vendingMachine.getState().dispenseOrder(vendingMachine, 101);


        // Order 2 : cancel order
        vendingMachine.getState().pressInsertCoinButton(vendingMachine);

        vendingMachine.getState().insertCoin(vendingMachine, Coin.TEN);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.FIVE);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.FIVE);

        vendingMachine.getState().cancelOrder(vendingMachine);
    }
}
