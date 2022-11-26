package com.company.brake;

import com.company.Brake;

public class ESPBrakeSystem implements Brake {
    @Override
    public void brake() {
        System.out.println("This car has ESP brake system");
    }
}
