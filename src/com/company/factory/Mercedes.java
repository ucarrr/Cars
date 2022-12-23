package com.company.factory;

public class Mercedes  extends CarStore {


    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new MercedesSedan("MercedesSedan",mainBody3,absBrakeSystem,gear6,fuelTypePetrol,
                    externalCombustionSystem,eightCylinderEngine,5000,8000);
        } else if (type.equals("hybrid")) {
            return new MercedesHybrid("MercedesHybrid",mainBody3,absBrakeSystem,gear6,fuelTypePetrol,
                    externalCombustionSystem,eightCylinderEngine,4000,7000);
        }else if (type.equals("roadster")) {
            return new MercedesRoadster("MercedesRoadster",mainBody2,espBrakeSystem,gear5,
                    fuelTypeDiesel,
                    internalCombustionSystem,fiveCylinderEngine,5000,7000);
        }else return null;
    }
}