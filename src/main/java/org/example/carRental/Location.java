package org.example.carRental;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Location {
    private List<Store> storeList;
    private String locationName;

    public Location(String locationName, List<Store> storeList) {
        this.locationName = locationName;
        this.storeList = storeList;
    }

    public void addStore(Store store) {
        storeList.add(store);
    }

    public boolean removeStore(Integer storeId) {
        for (Store store : storeList) {
            if (Objects.equals(store.getStoreId(), storeId)) {
                storeList.remove(store);
                return true;
            }
        }
        return false;

    }

    public Store findVehicle(String vehicleModel, LocalDateTime startDate, LocalDateTime endDate) {
        for (Store store : storeList) {
            if (store.findVehicle(vehicleModel, startDate, endDate)) {
                return store;
            }
        }
        return null;
    }
}
