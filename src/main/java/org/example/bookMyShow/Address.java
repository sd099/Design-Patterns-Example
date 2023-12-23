package org.example.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String pinCode;
    private String state;
}
