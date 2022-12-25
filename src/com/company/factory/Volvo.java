package com.company.factory;


public class Volvo extends CarStore {


    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new VolvoSedan("Volvo Sedan", mainBody3, absBrakeSystem, gear6, fuelTypePetrol,
                    externalCombustionSystem, eightCylinderEngine, 5000, 8000);
        } else if (type.equals("electric")) {
            return new VolvoElectric("Volvo Electric", mainBody, absBrakeSystem, automaticGear,
                    fuelTypeElectric, externalCombustionSystem, eightCylinderEngine, 5000, 6000);
        } else if (type.equals("hatchback")) {
            return new VolvoHatchback("Volvo Hatchback", mainBody4, espBrakeSystem, gear6,
                    fuelTypeDiesel,
                    externalCombustionSystem, eightCylinderEngine, 4000, 7000);
        } else if (type.equals("hybrid")) {
            return new VolvoHybrid("Volvo Hybrid", mainBody3, absBrakeSystem, gear6,
                    fuelTypePetrol,
                    externalCombustionSystem, eightCylinderEngine, 4000, 7000);
        } else if (type.equals("roadster")) {
            return new VolvoRoadster("Volvo Roadster", mainBody2, espBrakeSystem, gear5,
                    fuelTypeDiesel,
                    internalCombustionSystem, fiveCylinderEngine, 5000, 7000);
        } else return null;
    }
}
