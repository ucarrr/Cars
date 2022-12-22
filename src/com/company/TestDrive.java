package com.company;

import com.company.extension.CarPlay;
import com.company.factory.Car;
import com.company.factory.CarStore;
import com.company.factory.Mercedes;
import com.company.factory.Volvo;

public class TestDrive {
    public static void main(String[] args) {
        CarStore volvo = new Volvo();
        CarStore mercedes = new Mercedes();

        Car volvoSedan = volvo.orderCar("sedan");
        System.out.println("Ethan ordered a " + volvoSedan.getName() + "\n");
        volvoSedan = mercedes.orderCar("hybrid");
        System.out.println("Joel ordered a " + volvoSedan.getName() + "\n");


        System.out.println("Decoraator pattern");
        //decoraator pattern
        volvoSedan = new CarPlay(volvoSedan);
        System.out.println(volvoSedan.getName() + " $ " + volvoSedan.cost());
        volvoSedan.getEngineCylindersType();



      /*  Car car2 = new MercedesSedan();
        car2 = new Roof(car2);
        System.out.println(car2.getName() + " $ " + car2.cost());*/

    }
}
