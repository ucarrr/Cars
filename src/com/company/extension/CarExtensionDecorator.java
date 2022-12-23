package com.company.extension;

import com.company.factory.Car;

public abstract class CarExtensionDecorator extends Car {

    public abstract String getName();

    public CarExtensionDecorator() {
    }
}
