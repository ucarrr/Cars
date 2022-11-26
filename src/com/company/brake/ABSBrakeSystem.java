package com.company.brake;

import com.company.Brake;

public class ABSBrakeSystem implements Brake {
    @Override
    public void brake() {
        System.out.println("This car has ABS brake system");
    }
}
