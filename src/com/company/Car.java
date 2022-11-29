package com.company;

import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;

public abstract class Car {

    //engine interface for strategy pattern
    private MainBody mainBody;
    Brake brake;
     Gear gear;

    private EngineFuelType engineFuelType;
    private EnginesReactType enginesReactType;
    private EngineCylindersType engineCylindersType;

    private int enginePower = 100; // 100hp default
    private int engineCapacity;//2925 cc

    //decorator pattern description part and cost part
    String description="Unknown description";
    public abstract double cost();

    //strategy pattern, this method for change interface method
    public void performBrake(){
        brake.brake();
    }
    public void performGear(){gear.gear();};
    public void performEngineFuelType(){
        engineFuelType.fuelType();
    }
    public void performEnginesReactType(){
        enginesReactType.reactType();
    }
    public void performEngineCylindersType(){
        engineCylindersType.cylindersType();
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

    public void setBrake(Brake b) {

        this.brake = b;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear g) {
        this.gear = g;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public EngineFuelType getEngineFuelType() {
        return engineFuelType;
    }

    public void setEngineFuelType(EngineFuelType engineFuelType) {
        this.engineFuelType = engineFuelType;
    }

    public EnginesReactType getEnginesReactType() {
        return enginesReactType;
    }

    public void setEnginesReactType(EnginesReactType enginesReactType) {
        this.enginesReactType = enginesReactType;
    }

    public EngineCylindersType getEngineCylindersType() {
        return engineCylindersType;
    }

    public void setEngineCylindersType(EngineCylindersType engineCylindersType) {
        this.engineCylindersType = engineCylindersType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
