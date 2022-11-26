package com.company;

import com.company.brake.ASRBrakeSystem;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;
import com.company.enginetypes.enginecylinderstype.FiveCylinderEngine;
import com.company.enginetypes.enginefueltype.Diesel;
import com.company.enginetypes.enginereacttype.InternalCombustionSystem;
import com.company.gear.AutomaticGear;
import com.company.gear.Gear6;
import com.company.gear.ManuelGear;

public class Main {

    public static void main(String[] args) {
        //Mercedes S Serisi Model S 400 400 d
        MainBody mainBody = new MainBody(4, 4, "sedan", 5, "teyp", true, true);
        EngineFuelType engineDiesel = new Diesel();
        EnginesReactType internalCombustionSystem = new InternalCombustionSystem();
        EngineCylindersType fiveCylinderEngine = new FiveCylinderEngine();
        Engine engine = new Engine(200, 2925, engineDiesel, internalCombustionSystem, fiveCylinderEngine);
        Gear automaticGear=new AutomaticGear();
        Gear gear6=new Gear6();
        Brake brake=new ASRBrakeSystem();

        Car ssedan=new Mercedes(mainBody,brake,automaticGear,engine,"S400","s",2022,
                 "Black");


        System.out.println( ssedan.getEngine());
        System.out.println( ssedan.getGear());
        ssedan.getGear().gear();

        System.out.println(ssedan.getMainBody().toString());
        System.out.println(ssedan.toString());
        ssedan.getEngine().getEngineFuelType().fuelType();
        ssedan.getEngine().getEngineCylindersType().cylindersType();
        ssedan.getEngine().getEnginesReactType().reactType();
        ssedan.getBrake().brake();




    }
}
