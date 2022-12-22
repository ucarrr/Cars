package com.company.extension;

import com.company.factory.Car;

public class Roof extends CarExtensionDecorator {
    Car car;


    public Roof(Car car){
        this.car=car;
    }


    @Override
    public double cost() {
        return car.cost() + 1500;
    }

    @Override
    public String getName() {
        return car.getName() + "Roof panel added";
    }


}
