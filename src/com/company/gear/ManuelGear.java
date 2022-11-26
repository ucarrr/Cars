package com.company.gear;
import com.company.Gear;

public class ManuelGear extends Gear {

    public ManuelGear(){
        clutch=true;
    }

    @Override
    public void gear() {
        System.out.println("It has manuel gear");
    }

    @Override
    public String toString() {
        return "ManuelGear{" +
                "clutch=" + clutch +
                '}';
    }
}
