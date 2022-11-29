package com.company.extension;

import com.company.*;

public class ParkingAssistSystem extends CarExtensionDecorator {
    Car car;


    @Override
    public double cost() {
        return car.cost() + 999;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "Parking Assist System added";
    }
}
