package com.company.extension;

import com.company.*;

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
    public String getDescription() {
        return car.getDescription() + "Roof panel added";
    }


}
