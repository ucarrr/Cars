package com.company.extension;

import com.company.*;

public class Sensors extends CarExtensionDecorator{
    Car car;
    public Sensors(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        super(mainBody, brake, gear, engine);
    }

    @Override
    public double cost() {
        return car.cost() + 950;
    }

    @Override
    public String description() {
        return car.description() + "Sensors added";
    }
}
