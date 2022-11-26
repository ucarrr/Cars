package com.company;

public class Mercedes extends Car{
    private String model;
    private String seri;
    private int year;
    private String color;


    public Mercedes(MainBody mainBody, Brake brake, Gear gear, Engine engine, String model, String seri, int year, String color) {
        super(mainBody, brake, gear, engine);
        this.model = model;
        this.seri = seri;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
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
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                ", seri='" + seri + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
