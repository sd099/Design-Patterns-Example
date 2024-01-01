package org.example.vendingMachine.states;

import org.example.vendingMachine.Product;
import org.example.vendingMachine.ProductStatus;
import org.example.vendingMachine.VendingMachine;
import java.util.Objects;

public class OrderDispenseState implements IState {

    @Override
    public void dispenseOrder(VendingMachine vendingMachine, Integer slotNo) {
        Product product = findProduct(vendingMachine, slotNo);
        if (Objects.isNull(product)) {
            return;
        }
        System.out.println("Product Dispensed");
        if (vendingMachine.getCurrentTxnAmount() > product.getItem().getPrice()) {
            System.out.println("Refunded amount: " + (vendingMachine.getCurrentTxnAmount() - product.getItem().getPrice()));
        }
        vendingMachine.setTotalAmount(vendingMachine.getTotalAmount() + product.getItem().getPrice());
        product.setItem(null);
        product.setProductStatus(ProductStatus.OUT_OF_ORDER);
        vendingMachine.setState(new IdleState(vendingMachine));
    }

    private Product findProduct(VendingMachine vendingMachine, Integer slotNo) {
        for (Product product : vendingMachine.getProducts()) {
            if (product.getSlotNo().equals(slotNo)) {
                return product;
            }
        }
        return null;
    }

}
