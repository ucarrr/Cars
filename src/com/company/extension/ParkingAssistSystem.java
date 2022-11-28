package com.company.extension;

import com.company.Brake;
import com.company.Engine;
import com.company.Gear;
import com.company.MainBody;

public class ParkingAssistSystem extends CarExtensionDecorator{
    public ParkingAssistSystem(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        super(mainBody, brake, gear, engine);
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }
}
