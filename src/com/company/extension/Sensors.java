package com.company.extension;

import com.company.*;

public class Sensors extends CarExtensionDecorator {
    Car car;

    @Override
    public double cost() {
        return car.cost() + 850;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "Sensors added";
    }
}
