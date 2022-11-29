package com.company.extension;
import com.company.*;


public class CarPlay extends CarExtensionDecorator{
    Car car;

    public CarPlay(Car car){
        this.car=car;
    }

    @Override
    public double cost() {
        return car.cost() + 500;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+ " CarPlay added ";
    }
}
