package org.example.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String itemName;
    private Integer price;
}
