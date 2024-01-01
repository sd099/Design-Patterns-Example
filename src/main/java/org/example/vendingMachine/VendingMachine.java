package org.example.vendingMachine;

import lombok.Data;
import org.example.vendingMachine.states.IState;
import org.example.vendingMachine.states.IdleState;
import java.util.ArrayList;
import java.util.List;

@Data
public class VendingMachine {
    private IState state;
    private Integer totalAmount;
    private Integer currentTxnAmount;
    private List<Product> products;

    public VendingMachine(Integer productCapacity) {
        this.state = new IdleState();
        this.totalAmount = 0;
        this.currentTxnAmount = 0;
        this.products = new ArrayList<>();

        for (int i=1;i<=productCapacity;i++) {
            Product product = new Product();
            product.setProductStatus(ProductStatus.OUT_OF_ORDER);
            product.setSlotNo(i+100);
            this.products.add(product);
        }
    }

    public Boolean addItem(Item item, Integer slotNo) {
        for (Product product : products) {
            if (product.getSlotNo().equals(slotNo) && ProductStatus.OUT_OF_ORDER.equals(product.getProductStatus())) {
                product.setItem(item);
                product.setProductStatus(ProductStatus.AVAILABLE);
                return true;
            }
        }
        return false;
    }



}
