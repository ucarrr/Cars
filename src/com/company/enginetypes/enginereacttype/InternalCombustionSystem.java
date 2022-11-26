package com.company.enginetypes.enginereacttype;

import com.company.enginetypes.EnginesReactType;

//İçten Yanmalı Sistemli Motorlar
public class InternalCombustionSystem implements EnginesReactType {
    @Override
    public void reactType() {
        System.out.println("Engine is Internal Combustion System");
    }
}
