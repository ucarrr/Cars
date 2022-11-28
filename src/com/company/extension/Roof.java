package com.company.extension;

import com.company.*;

public class Roof extends CarExtensionDecorator{
    Car car;

    public Roof(MainBody mainBody, Brake brake, Gear gear, Engine engine, Car car) {
        super(mainBody, brake, gear, engine);
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 1500;
    }

    @Override
    public String description() {
        return car.description() + " Roof panel added ";
    }
}
