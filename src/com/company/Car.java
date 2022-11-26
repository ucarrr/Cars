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
}
