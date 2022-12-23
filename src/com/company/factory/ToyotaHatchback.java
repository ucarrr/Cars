package com.company.factory;

import com.company.Brake;
import com.company.Gear;
import com.company.MainBody;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;

public class ToyotaHatchback extends Car{
    public ToyotaHatchback(String name, MainBody mainBody, Brake brake, Gear gear, EngineFuelType engineFuelType, EnginesReactType enginesReactType, EngineCylindersType engineCylindersType, int enginePower, int engineCapacity) {
        super(name, mainBody, brake, gear, engineFuelType, enginesReactType, engineCylindersType, enginePower, engineCapacity);
    }

    @Override
    public double cost() {
        return 15000;
    }
}
