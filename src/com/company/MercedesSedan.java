package com.company;

import com.company.brake.ABSBrakeSystem;
import com.company.gear.AutomaticGear;

public class MercedesSedan extends Car{

    public MercedesSedan(){
        //decorator pattern
        description=" Mercedes Sedan ";

        //strategy pattern
        brake=new ABSBrakeSystem();
        gear=new AutomaticGear();

    }

    public void display(){
        System.out.println("mercedes sedan");
    }

    @Override
    public double cost() {
        return 20000;
    }
}
