package com.company;

public class Mercedes extends Car {
    private String model;
    private String serial;
    private int year;
    private String color;
    private double cost;

    public Mercedes(MainBody mainBody, Brake brake, Gear gear, Engine engine, String model, String serial,
                    int year, String color, double cost, String description) {
        super(mainBody, brake, gear, engine);
        this.model = model;
        this.serial = serial;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.description = description;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                ", seri='" + serial + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
