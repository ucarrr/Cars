package com.company.factory;

public class Toyota extends CarStore {
    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new ToyotaSedan("Toyota Sedan",mainBody4,absBrakeSystem,gear6,fuelTypeDiesel,
                    externalCombustionSystem,eightCylinderEngine,5000,8000);
        } else if (type.equals("hatchback")) {
            return new ToyotaHatchback("Toyota Hatchback",mainBody4,espBrakeSystem,gear6,
                    fuelTypeDiesel,
                    externalCombustionSystem,eightCylinderEngine,5500,9000);
        }   else if (type.equals("hybrid")) {
            return new ToyotaHybrid("Toyota Hybrid", mainBody3, absBrakeSystem, gear6,
                    fuelTypePetrol,
                    externalCombustionSystem, eightCylinderEngine, 6000, 1000);
        } else if (type.equals("roadster")) {
            return new ToyotaRoadster("Toyota Roadster", mainBody2, espBrakeSystem, gear5,
                    fuelTypeDiesel,
                    internalCombustionSystem, fiveCylinderEngine, 6000, 5000);
        } else if (type.equals("electric")) {
            return new ToyotaElectric("Toyota Electric", mainBody, absBrakeSystem,
                    automaticGear,
                    fuelTypeElectric, externalCombustionSystem, eightCylinderEngine, 8000, 6000);
        }else return null;
    }
}
