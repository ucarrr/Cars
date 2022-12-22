package com.company.extension;

import com.company.factory.Car;

public class Sensors extends CarExtensionDecorator {
    Car car;

    @Override
    public double cost() {
        return car.cost() + 850;
    }

    @Override
    public String getName() {
        return car.getName() + "Sensors added";
    }
}
