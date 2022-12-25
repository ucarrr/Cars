package com.company.factory;

public class Mercedes extends CarStore {


    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new MercedesSedan("Mercedes Sedan", mainBody3, absBrakeSystem, gear6,
                    fuelTypePetrol,
                    externalCombustionSystem, eightCylinderEngine, 5000, 8000);
        } else if (type.equals("hybrid")) {
            return new MercedesHybrid("Mercedes Hybrid", mainBody3, absBrakeSystem, gear6,
                    fuelTypePetrol,
                    externalCombustionSystem, eightCylinderEngine, 4000, 7000);
        } else if (type.equals("roadster")) {
            return new MercedesRoadster("Mercedes Roadster", mainBody2, espBrakeSystem, gear5,
                    fuelTypeDiesel,
                    internalCombustionSystem, fiveCylinderEngine, 5000, 7000);
        } else if (type.equals("hatchback")) {
            return new MercedesHatchback("Mercedes Hatchback", mainBody4, espBrakeSystem, gear6,
                    fuelTypeDiesel,
                    externalCombustionSystem, eightCylinderEngine, 4000, 7000);
        }else if (type.equals("electric")) {
            return new MercedesElectric("Mercedes Electric", mainBody, absBrakeSystem,
                    automaticGear,
                    fuelTypeElectric, externalCombustionSystem, eightCylinderEngine, 5000, 6000);
        } else return null;
    }
}