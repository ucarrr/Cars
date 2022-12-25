package com.company.extension;

import com.company.factory.Car;

public class ParkingAssistSystem extends CarExtensionDecorator {
    Car car;

    public ParkingAssistSystem(Car car) {
        super(car);
        this.car=car;
    }


    @Override
    public double cost() {
        return car.cost() + 999;
    }

    @Override
    public String getName() {
        return car.getName() + " Parking Assist System added";
    }
}
