package com.example.Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private String plate;

    public Vehicle() {
        this.brand = null;
        this.model = null;
        this.plate = null;
    }

    public Vehicle(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    public void getAll() {
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("plate: " + this.plate);
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
