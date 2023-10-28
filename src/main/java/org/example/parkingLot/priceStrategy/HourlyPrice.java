package org.example.parkingLot.priceStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.example.parkingLot.ParkingSpotType;
import org.example.parkingLot.Ticket;

public class HourlyPrice implements IPriceStrategy{

    private Map<ParkingSpotType, Integer> hourlyRates;

    public HourlyPrice() {
        hourlyRates = new HashMap<>();
        hourlyRates.put(ParkingSpotType.FOUR_WHEELER, 20);
        hourlyRates.put(ParkingSpotType.TWO_WHEELER, 10);
    }

    @Override
    public int calculatePrice(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime, exitTime);

        long hours = duration.toHours();
        if (duration.toSecondsPart() > 0) {
            hours++;
        }

        return (int) (hours * hourlyRates.get(ticket.getParkingSpot().getParkingSpotType()));
    }
}
