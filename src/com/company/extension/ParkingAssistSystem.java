package com.company.extension;

import com.company.*;

public class ParkingAssistSystem extends CarExtensionDecorator{
    Car car;
    public ParkingAssistSystem(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        super(mainBody, brake, gear, engine);
    }

    @Override
    public double cost() {
        return car.cost() + 500;
    }

    @Override
    public String description() {
        return car.description() + "Parking assist system  added";
    }
}
