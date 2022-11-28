package com.company;

public class CarAssembly {
    private MainBody mainBody;
    private Brake brake;
    private Gear gear;
    private Engine engine;
    private Car car;

    public CarAssembly(MainBody mainBody, Brake brake, Gear gear, Engine engine, Car car) {
        this.mainBody = mainBody;
        this.brake = brake;
        this.gear = gear;
        this.engine = engine;
        this.car = car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
