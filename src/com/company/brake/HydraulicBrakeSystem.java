package com.company.brake;

import com.company.Brake;

public class HydraulicBrakeSystem implements Brake {

    @Override
    public void brake() {
        System.out.println("This car has Hydraulic brake system");
    }
}
