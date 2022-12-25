package com.company;

import com.company.brake.ABSBrakeSystem;
import com.company.brake.ASRBrakeSystem;
import com.company.brake.ESPBrakeSystem;
import com.company.brake.HydraulicBrakeSystem;
import com.company.enginetypes.enginecylinderstype.EightCylinderEngine;
import com.company.enginetypes.enginecylinderstype.FiveCylinderEngine;
import com.company.enginetypes.enginefueltype.Diesel;
import com.company.enginetypes.enginefueltype.Electric;
import com.company.enginetypes.enginefueltype.Petrol;
import com.company.enginetypes.enginereacttype.ExternalCombustionSystem;
import com.company.enginetypes.enginereacttype.InternalCombustionSystem;
import com.company.extension.CarPlay;
import com.company.extension.ParkingAssistSystem;
import com.company.extension.Roof;
import com.company.extension.Sensors;
import com.company.factory.*;


import com.company.gear.AutomaticGear;
import com.company.gear.Gear5;
import com.company.gear.Gear6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // CarStore carStore = new CarStore();

        // Choose a car brand
        CarStore brand = null;

        while (brand == null) {
            System.out.println("What car brand do you want to buy from?");
            System.out.println("1. Mercedes");
            System.out.println("2. Toyota");
            System.out.println("3. Volvo");
            int choice = scanner.nextInt();
            if (choice == 1) {
                brand = new Mercedes();
            } else if (choice == 2) {
                brand = new Toyota();
            } else if (choice == 3) {
                brand = new Volvo();
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
        }

        // Choose a car model
        Car car = null;
        while (car == null) {
            System.out.println("What car model do you want to buy?");
            System.out.println("1. Sedan");
            System.out.println("2. Hatchback");
            System.out.println("3. Electric");
            System.out.println("4. Hybrid");
            System.out.println("5. Roadster");
            int choice = scanner.nextInt();
            if (choice == 1) {
                car = brand.createCar("sedan");
                car.displayCar();
            } else if (choice == 2) {
                car = brand.createCar("hatchback");
                car.displayCar();
            } else if (choice == 3) {
                car = brand.createCar("electric");
                car.displayCar();
            } else if (choice == 4) {
                car = brand.createCar("hatchback");
                car.displayCar();
            } else if (choice == 5) {
                car = brand.createCar("electric");
                car.displayCar();
            } else {
                System.out.println("Please try again.");
                continue;
            }
        }

        System.out.println("\n\n");

        boolean arrangementbool = false;
        while (!arrangementbool) {
            System.out.println("Do you want to change the equipment of the car?");
            System.out.println("1. No I dont");
            System.out.println("2. Gear");
            System.out.println("3. Brake");
            System.out.println("4. Engine Types");
            int strategyChoice = scanner.nextInt();
            if (strategyChoice == 1) {
                arrangementbool = true;
            } else if (strategyChoice == 2) {
                int gearC = 0;
                System.out.print("Current Gear:");
                car.getGear().gear();
                boolean geatbool = false;
                while (geatbool == false) {
                    System.out.println("Choose which gear you want:");
                    System.out.println("1. No I dont");
                    System.out.println("2. Automatic Gear");
                    System.out.println("3. Gear5");
                    System.out.println("4. Gear6");
                    gearC = scanner.nextInt();
                    if (gearC == 1) {
                        geatbool = true;
                    } else if (gearC == 2) {
                        car.setGear(new AutomaticGear());
                        car.performGear();
                    } else if (gearC == 3) {
                        car.setGear(new Gear5());
                        car.performGear();
                    } else if (gearC == 4) {
                        car.setGear(new Gear6());
                        car.performGear();
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                    }
                }
            } else if (strategyChoice == 3) {

                int brakeC = 0;
                System.out.print("Current Brake:");
                car.getBrake().brake();
                boolean brakebool = false;
                while (brakebool == false) {
                    System.out.println("Choose which brake you want:");
                    System.out.println("1. No I dont");
                    System.out.println("2. ABS Brake System");
                    System.out.println("3. ASR Brake System");
                    System.out.println("4. ESP Brake System");
                    System.out.println("5. Hydraulic Brake System");
                    brakeC = scanner.nextInt();
                    if (brakeC == 1) {
                        brakebool = true;
                    } else if (brakeC == 2) {
                        car.setBrake(new ABSBrakeSystem());
                        car.performBrake();
                    } else if (brakeC == 3) {
                        car.setBrake(new ASRBrakeSystem());
                        car.performBrake();
                    } else if (brakeC == 4) {
                        car.setBrake(new ESPBrakeSystem());
                        car.performBrake();
                    } else if (brakeC == 5) {
                        car.setBrake(new HydraulicBrakeSystem());
                        car.performBrake();
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                    }
                }

            } else if (strategyChoice == 4) {

                int engineC = 0;
                System.out.println("Current Engine Types:");
                car.getEngineFuelType().fuelType();
                car.getEngineCylindersType().cylindersType();
                car.getEnginesReactType().reactType();
                boolean enginebool = false;
                while (enginebool == false) {
                    System.out.println("Choose which engine you want:");
                    System.out.println("1. No I dont");
                    System.out.println("2. Diesel System");
                    System.out.println("3. Electric System");
                    System.out.println("4. Petrol System");
                    System.out.println("5. Eight Cylinder Engine System");
                    System.out.println("6. Five Cylinder Engine System");
                    System.out.println("7. External Combustion System System");
                    System.out.println("8. Internal Combustion System System");
                    engineC = scanner.nextInt();
                    if (engineC == 1) {
                        enginebool = true;
                    } else if (engineC == 2) {
                        car.setEngineFuelType(new Diesel());
                        car.performEngineFuelType();
                    } else if (engineC == 3) {
                        car.setEngineFuelType(new Electric());
                        car.performEngineFuelType();
                    } else if (engineC == 4) {
                        car.setEngineFuelType(new Petrol());
                        car.performEngineFuelType();
                    } else if (engineC == 5) {
                        car.setEngineCylindersType(new EightCylinderEngine());
                        car.performEngineCylindersType();
                    } else if (engineC == 6) {
                        car.setEngineCylindersType(new FiveCylinderEngine());
                        car.performEngineCylindersType();
                    } else if (engineC == 7) {
                        car.setEnginesReactType(new ExternalCombustionSystem());
                        car.performEnginesReactType();
                    } else if (engineC == 8) {
                        car.setEnginesReactType(new InternalCombustionSystem());
                        car.performEnginesReactType();
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                    }
                }

            } else {
                System.out.println("Please try again.");
                continue;
            }
        }

        // Add optional features to the car
        boolean done = false;
        while (!done) {
            System.out.println(car.getName() + " Current Cost " + car.cost());
            System.out.println("What optional feature do you want to add to your " + car.getName() + "?");
            System.out.println("1. CarPlay");
            System.out.println("2. Parking Assist System");
            System.out.println("3. Roof panel");
            System.out.println("4. Sensors");
            System.out.println("5. Finish the order");
            int decoratorChoice = scanner.nextInt();
            if (decoratorChoice == 1) {
                car = new CarPlay(car);
            } else if (decoratorChoice == 2) {
                car = new ParkingAssistSystem(car);
            } else if (decoratorChoice == 3) {
                car = new Roof(car);
            } else if (decoratorChoice == 4) {
                car = new Sensors(car);
            } else if (decoratorChoice == 5) {
                done = true;
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
        }


        System.out.println("\n");
        car.displayCar();
        System.out.println("\n\n");
        // Calculate the total cost of the car
        System.out.println("Your final order is: " + car.getName());
        System.out.println("Total cost: $" + car.cost());


    }


}
