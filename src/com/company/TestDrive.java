package com.company;
import com.company.extension.CarPlay;
import com.company.factory.*;
import com.company.gear.AutomaticGear;

public class TestDrive {
    public static void main(String[] args) {
        CarStore volvo = new Volvo();
        CarStore mercedes = new Mercedes();
        CarStore toyota=new Toyota();

        Car mercedesHybrid = mercedes.orderCar("hybrid");
        System.out.println("Mehmet ordered a " + mercedesHybrid.getName() + "\n");


        mercedesHybrid.getGear().gear();



        System.out.println(mercedesHybrid.getMainBody().toString());
        System.out.println("");

        //strategy pattten
        System.out.println("Strategy pattern");
        mercedesHybrid.performGear();

        //runtime
        mercedesHybrid.setGear(new AutomaticGear());
        mercedesHybrid.performGear();


        Car volvoSedan = volvo.orderCar("sedan");
        System.out.println("Ahmet ordered a " + volvoSedan.getName() + "\n");
        volvoSedan.displayCar();

        System.out.println("Decoraator pattern");
        //Decoraator pattern
        volvoSedan = new CarPlay(volvoSedan);
        System.out.println(volvoSedan.getName() + " $ " + volvoSedan.cost());
        volvoSedan.getEngineCylindersType();
        System.out.println("");

       volvoSedan.displayCar();





      /*  Car car2 = new MercedesSedan();
        car2 = new Roof(car2);
        System.out.println(car2.getName() + " $ " + car2.cost());*/

    }
}
