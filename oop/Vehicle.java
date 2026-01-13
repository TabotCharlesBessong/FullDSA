package oop;

/**
 * Exercise 6: Polymorphism with Dynamic Binding
 * Superclass Vehicle
 */
public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to be overridden in subclasses
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
