package com.company;

import com.company.brake.ASRBrakeSystem;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;
import com.company.enginetypes.enginecylinderstype.FiveCylinderEngine;
import com.company.enginetypes.enginefueltype.Diesel;
import com.company.enginetypes.enginereacttype.InternalCombustionSystem;
import com.company.extension.CarExtensionDecorator;
import com.company.extension.Roof;
import com.company.gear.AutomaticGear;
import com.company.gear.Gear6;
import com.company.gear.ManuelGear;

public class Main {

    public static void main(String[] args) {
        //Mercedes S Serisi Model S 400 400 d
        /*MainBody mainBody = new MainBody(4, 4, "sedan", 5, "teyp", true, true);
        EngineFuelType engineDiesel = new Diesel();
        EnginesReactType internalCombustionSystem = new InternalCombustionSystem();
        EngineCylindersType fiveCylinderEngine = new FiveCylinderEngine();
        Engine engine = new Engine(200, 2925, engineDiesel, internalCombustionSystem, fiveCylinderEngine);
        Gear automaticGear=new AutomaticGear();
        Gear gear6=new Gear6();
        Brake brake=new ASRBrakeSystem();*/

        Car car1 = new ToyotaSedan();
        car1 = new Roof(car1);
        System.out.println(car1.getDescription() + " $ " + car1.cost());

        Car car2 = new MercedesSedan();
        car2 = new Roof(car2);
        System.out.println(car2.getDescription() + " $ " + car2.cost());



    /*    Car mercedesSedan=new Mercedes(mainBody,brake,automaticGear,engine,"S400","s",2022,
                 "Black",200000,"mercedes");*/


      /*  Car car1=new Roof(mercedesSedan.getMainBody(), mercedesSedan.getBrake(),mercedesSedan.getGear(),mercedesSedan.getEngine(),mercedesSedan);
        System.out.println(mercedesSedan);
        System.out.println(car1.description()+ car1.cost());
        System.out.println(mercedesSedan.cost());*/


        /*System.out.println( mercedesSedan.getEngine());
        System.out.println( mercedesSedan.getGear());
        mercedesSedan.getGear().gear();

        System.out.println(mercedesSedan.getMainBody().toString());
        System.out.println(mercedesSedan.toString());
        mercedesSedan.getEngine().getEngineFuelType().fuelType();
        mercedesSedan.getEngine().getEngineCylindersType().cylindersType();
        mercedesSedan.getEngine().getEnginesReactType().reactType();
        mercedesSedan.getBrake().brake();
*/



    }
}
