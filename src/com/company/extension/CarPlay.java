package com.company.extension;

import com.company.factory.Car;


public class CarPlay extends CarExtensionDecorator {
    Car car;

    public CarPlay(Car car) {
        this.car = car;
        this.setMainBody(car.getMainBody());
    }

    @Override
    public double cost() {
        return car.cost() + 500;
    }

    @Override
    public String getName() {
        return car.getName() + " CarPlay added ";
    }
}
