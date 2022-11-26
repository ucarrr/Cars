package com.company;

import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;

public class Engine {
    private int enginePower = 100; // 100hp default
    private int engineCapacity;//2925 cc

    private EngineFuelType engineFuelType;
    private EnginesReactType enginesReactType;
    private EngineCylindersType engineCylindersType;

    public Engine(int enginePower, int engineCapacity, EngineFuelType engineFuelType,
                  EnginesReactType enginesReactType, EngineCylindersType engineCylindersType) {
        this.enginePower = enginePower;
        this.engineCapacity = engineCapacity;
        this.engineFuelType = engineFuelType;
        this.enginesReactType = enginesReactType;
        this.engineCylindersType = engineCylindersType;
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

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower + " hp " +
                ", engineCapacity=" + engineCapacity + " cc " +
                ", engineFuelType=" + engineFuelType +
                ", enginesReactType=" + enginesReactType +
                ", engineCylindersType=" + engineCylindersType +
                '}';
    }
}
