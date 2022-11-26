package com.company.brake;

import com.company.Brake;

public class ASRBrakeSystem implements Brake {
    @Override
    public void brake() {
        System.out.println("This car has ASR brake system");
    }
}
