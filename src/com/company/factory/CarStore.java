package com.company.factory;

import com.company.Brake;
import com.company.Gear;
import com.company.MainBody;
import com.company.brake.ABSBrakeSystem;
import com.company.brake.ASRBrakeSystem;
import com.company.brake.ESPBrakeSystem;
import com.company.brake.HydraulicBrakeSystem;
import com.company.enginetypes.EngineCylindersType;
import com.company.enginetypes.EngineFuelType;
import com.company.enginetypes.EnginesReactType;
import com.company.enginetypes.enginecylinderstype.EightCylinderEngine;
import com.company.enginetypes.enginecylinderstype.FiveCylinderEngine;
import com.company.enginetypes.enginecylinderstype.SixCylinderEngine;
import com.company.enginetypes.enginefueltype.Diesel;
import com.company.enginetypes.enginefueltype.Electric;
import com.company.enginetypes.enginefueltype.Petrol;
import com.company.enginetypes.enginereacttype.ExternalCombustionSystem;
import com.company.enginetypes.enginereacttype.InternalCombustionSystem;
import com.company.gear.AutomaticGear;
import com.company.gear.Gear5;
import com.company.gear.Gear6;

public abstract class CarStore {

    MainBody mainBody=new MainBody(5,4,8,"android",true);
    MainBody mainBody2=new MainBody(3,2,7,"Digital",false);
    MainBody mainBody3=new MainBody(5,6,10,"Digital",true);
    MainBody mainBody4=new MainBody(5,6,10,"Digital",true);

    Brake absBrakeSystem= new ABSBrakeSystem();
    Brake espBrakeSystem=new ESPBrakeSystem();
    Brake asrBrakeSystem=new ASRBrakeSystem();
    Brake hydraulicBrakeSystem=new HydraulicBrakeSystem();

    Gear automaticGear= new AutomaticGear();
    Gear gear6=new Gear6();
    Gear gear5=new Gear5();

    EngineFuelType fuelTypeElectric=new Electric();
    EngineFuelType fuelTypePetrol=new Petrol();
    EngineFuelType fuelTypeDiesel=new Diesel();

    EngineCylindersType eightCylinderEngine=new EightCylinderEngine();
    EngineCylindersType fiveCylinderEngine=new FiveCylinderEngine();
    EngineCylindersType sixCylindersType=new SixCylinderEngine();


    EnginesReactType externalCombustionSystem=new ExternalCombustionSystem();
    EnginesReactType internalCombustionSystem =new InternalCombustionSystem();




    public Car orderCar(String type) {
        Car car;
        car = createCar(type);
        car.prepare();
        car.sale();
        return car;
    }

    public abstract Car createCar(String type);
}
