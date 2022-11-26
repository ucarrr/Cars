package com.company;

public class Car {

    private MainBody mainBody;
    private Brake brake;
    private Gear gear;
    private Engine engine;

    public Car(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        this.mainBody = mainBody;
        this.brake = brake;
        this.gear = gear;
        this.engine = engine;
    }

    public MainBody getMainBody() {
        return mainBody;
    }

    public void setMainBody(MainBody mainBody) {
        this.mainBody = mainBody;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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
