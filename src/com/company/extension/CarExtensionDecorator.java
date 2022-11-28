package com.company.extension;

import com.company.*;

abstract class CarExtensionDecorator extends Car {
    public CarExtensionDecorator(MainBody mainBody, Brake brake, Gear gear, Engine engine) {
        super(mainBody, brake, gear, engine);
    }

}
