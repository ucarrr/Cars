package com.company.enginetypes.enginereacttype;

import com.company.enginetypes.EnginesReactType;

//Dıştan Yanmalı Sistemli Motorlar
public class ExternalCombustionSystem implements EnginesReactType {
    @Override
    public void reactType() {
        System.out.println("Engine is External Combustion System");
    }
}
