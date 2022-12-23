package com.company.extension;

import com.company.factory.Car;

public abstract class CarExtensionDecorator extends Car {


    public CarExtensionDecorator(Car car) {
        super(car);
    }

    public abstract String getName();



}
