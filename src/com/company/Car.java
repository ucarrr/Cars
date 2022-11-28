package com.company;

public abstract class Car {

    private MainBody mainBody;
    private Brake brake;
    private Gear gear;
    private Engine engine;
    String description="Unknown description";

    public Car() {

    }

    public void performBrake(){
        brake.brake();
    }

    public void performGear(){
        gear.gear();
    }

    public void performEngineCylinders(){
        engine.getEngineCylindersType();
    }

    public void performEngineFuel(){
        engine.getEngineFuelType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "mainBody=" + mainBody +
                ", brake=" + brake +
                ", gear=" + gear +
                ", engine=" + engine +
                '}';
    }
}
