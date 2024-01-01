package org.example.vendingMachine.states;

import org.example.vendingMachine.Product;
import org.example.vendingMachine.ProductStatus;
import org.example.vendingMachine.VendingMachine;
import java.util.Objects;

public class OrderSelectionState implements IState{

    @Override
    public void cancelOrder(VendingMachine vendingMachine) {
        System.out.println("Order cancelled");
        System.out.println("Refunded money. Amount: " + vendingMachine.getCurrentTxnAmount());
        vendingMachine.setState(new IdleState(vendingMachine));
    }

    @Override
    public void selectOrder(VendingMachine vendingMachine, Integer slotNo) {
        Product product = validateOrder(vendingMachine, slotNo);
        if (Objects.isNull(product)) {
            cancelOrder(vendingMachine);
            return;
        }
        vendingMachine.setState(new OrderDispenseState());
    }

    private Product validateOrder(VendingMachine vendingMachine, Integer slotNo) {
        for (Product product : vendingMachine.getProducts()) {
            if (product.getSlotNo().equals(slotNo) && ProductStatus.AVAILABLE.equals(product.getProductStatus())
                    && vendingMachine.getCurrentTxnAmount() >= product.getItem().getPrice()) {
                return product;
            }
        }
        return null;
    }
}
