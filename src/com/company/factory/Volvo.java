package com.company.factory;


public class Volvo extends CarStore{





    @Override
    public Car createCar(String type) {
        if (type.equals("sedan")) {
            return new VolvoSedan("VolvoSedan",mainBody3,absBrakeSystem,gear6,fuelTypePetrol,
                    externalCombustionSystem,eightCylinderEngine,5000,8000);
        } else if (type.equals("electric")) {
            return new VolvoElectric("electric",mainBody,absBrakeSystem,automaticGear,
                    fuelTypeElectric,externalCombustionSystem,eightCylinderEngine,5000,6000);
        }  else return null;
    }
}
