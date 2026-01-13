package oop;

/**
 * Exercise 6: Car subclass of Vehicle
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is starting... Vroom Vroom!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
