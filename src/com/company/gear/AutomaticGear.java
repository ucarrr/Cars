package com.company.gear;
import com.company.Gear;

public class AutomaticGear extends Gear {

    @Override
    public void gear() {
        System.out.println("It has automatic gear");
    }

    @Override
    public String toString() {
        return "AutomaticGear{" +
                "clutch=" + clutch +
                '}';
    }
}
