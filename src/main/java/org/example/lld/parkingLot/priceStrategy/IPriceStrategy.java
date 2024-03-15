package org.example.lld.parkingLot.priceStrategy;

import org.example.lld.parkingLot.Ticket;

public interface IPriceStrategy {
    int calculatePrice(Ticket ticket);

}
