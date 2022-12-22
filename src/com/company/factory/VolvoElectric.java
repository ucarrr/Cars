package com.company.factory;

import com.company.Brake;
import com.company.Gear;
import com.company.MainBody;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;

public class VolvoElectric extends Car {


    public VolvoElectric(String name, MainBody mainBody, Brake brake, Gear gear, EngineFuelType engineFuelType, EngineCylindersType engineCylindersType, int enginePower, int engineCapacity) {
        super(name, mainBody, brake, gear, engineFuelType, engineCylindersType, enginePower, engineCapacity);
    }

    @Override
    public double cost() {
        return 30000;
    }
}
