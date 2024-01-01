package org.example.vendingMachine;

import lombok.Data;

@Data
public class Product {
    private Integer slotNo;
    private ProductStatus productStatus;
    private Item item;
}
