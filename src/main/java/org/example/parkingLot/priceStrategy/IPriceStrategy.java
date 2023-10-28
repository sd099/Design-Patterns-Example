package org.example.parkingLot.priceStrategy;

import org.example.parkingLot.Ticket;

public interface IPriceStrategy {
    int calculatePrice(Ticket ticket);

}
