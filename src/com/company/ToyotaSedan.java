package com.company;

public class ToyotaSedan extends Car{

    public ToyotaSedan(){
        description = " Toyota sedan ";
    }

    @Override
    public double cost() {
        return 16000;
    }
}
