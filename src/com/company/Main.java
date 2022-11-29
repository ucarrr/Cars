package com.company;

import com.company.brake.ASRBrakeSystem;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;
import com.company.enginetypes.enginecylinderstype.FiveCylinderEngine;
import com.company.enginetypes.enginefueltype.Diesel;
import com.company.enginetypes.enginereacttype.InternalCombustionSystem;
import com.company.extension.CarExtensionDecorator;
import com.company.extension.CarPlay;
import com.company.extension.Roof;
import com.company.gear.AutomaticGear;
import com.company.gear.Gear6;
import com.company.gear.ManuelGear;

public class Main {

    public static void main(String[] args) {

        //strategy pattten
        Car mercedesSedan=new MercedesSedan();
        mercedesSedan.performGear();
        //runtime
        mercedesSedan.setGear(new AutomaticGear());
        mercedesSedan.performGear();

        //decoraator pattern
        Car car1 = new ToyotaSedan();
        car1 = new CarPlay(car1);
        System.out.println(car1.getDescription() + " $ " + car1.cost());
        car1.getEngineCylindersType();

        Car car2 = new MercedesSedan();
        car2 = new Roof(car2);
        System.out.println(car2.getDescription() + " $ " + car2.cost());


    }
}
