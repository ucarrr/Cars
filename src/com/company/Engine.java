package com.company;

import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;

public class Engine {
    private int enginePower=100; // 100hp default
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
}
