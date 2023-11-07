package org.example.elevatorDesign;

import lombok.Getter;

import java.util.List;

@Getter
public class Floor {
    private List<ExternalButton> externalButtonList;

    public Floor(List<ExternalButton> externalButtonList) {
        this.externalButtonList = externalButtonList;
    }
}
