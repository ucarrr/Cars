package com.company;

public class MainBody {
    private final int numberOfWheels = 4;
    private final boolean seatBelt = true;
    private final boolean accelerator = true;
    private final boolean airbag = true;
    private int doorNumber;
    private int numberOfSeat;
    //private String bodyType; //sedan etc.
    private int gasTank;
    private String carStereo;
    private boolean Trunk; //Bagaj


    public MainBody(int doorNumber, int numberOfSeat,
                    int gasTank, String carStereo, boolean trunk) {
        this.doorNumber = doorNumber;
        this.numberOfSeat = numberOfSeat;
        this.gasTank = gasTank;
        this.carStereo = carStereo;
        Trunk = trunk;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public boolean isAccelerator() {
        return accelerator;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }


    public int getGasTank() {
        return gasTank;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }

    public String getCarStereo() {
        return carStereo;
    }

    public void setCarStereo(String carStereo) {
        this.carStereo = carStereo;
    }

    public boolean isTrunk() {
        return Trunk;
    }

    public void setTrunk(boolean trunk) {
        Trunk = trunk;
    }

    public boolean isAirbag() {
        return airbag;
    }




    @Override
    public String toString() {
        return "MainBody = " +
                "numberOfWheels = " + numberOfWheels +
                ", seatBelt = " + seatBelt +
                ", accelerator = " + accelerator +
                ", doorNumber = " + doorNumber +
                ", numberOfSeat = " + numberOfSeat +
                ", gasTank = " + gasTank + " lt " +
                ", carStereo = " + carStereo + '\'' +
                ", Trunk = " + Trunk +
                ", airbag = " + airbag;
    }
}
