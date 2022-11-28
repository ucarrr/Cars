package com.company.extension;
import com.company.*;


public class CarPlay extends CarExtensionDecorator{
    Car car;
    public CarPlay(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        super(mainBody, brake, gear, engine);
    }

    @Override
    public double cost() {
        return car.cost()+2000;
    }

    @Override
    public String description() {
        return car.description() + "Car Play added";
    }
}
