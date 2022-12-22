package com.company;

import com.company.factory.Car;
import com.company.factory.CarStore;
import com.company.factory.Mercedes;
import com.company.factory.Volvo;

public class TestDrive {
    public static void main(String[] args) {
        CarStore volvo = new Volvo();
        CarStore mercedes = new Mercedes();
        Car car = volvo.orderCar("sedan");
        System.out.println("Ethan ordered a " + car.getName() + "\n");
        car = mercedes.orderCar("hybrid");
        System.out.println("Joel ordered a " + car.getName() + "\n");
    }
}
