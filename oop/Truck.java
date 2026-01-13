package oop;

/**
 * Exercise 6: Truck subclass of Vehicle
 */
public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, double loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine is starting... Rumble Rumble!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
