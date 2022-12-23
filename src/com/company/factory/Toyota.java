package com.company.factory;

public class Toyota extends CarStore {
    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new ToyotaSedan("ToyotaSedan",mainBody4,absBrakeSystem,gear6,fuelTypeDiesel,
                    externalCombustionSystem,eightCylinderEngine,5000,8000);
        } else if (type.equals("Hatchback")) {
            return new ToyotaHatchback("hatchback",mainBody4,espBrakeSystem,gear6,fuelTypeDiesel,
                    externalCombustionSystem,eightCylinderEngine,4000,7000);
        }  else return null;
    }
}
