package com.company.enginetypes.enginefueltype;

import com.company.enginetypes.EngineFuelType;

public class Diesel implements EngineFuelType {
    @Override
    public void fuelType() {
        System.out.println("Fuel is Diesel");
    }
}
