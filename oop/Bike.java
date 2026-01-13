package oop;

/**
 * Exercise 6: Bike subclass of Vehicle
 */
public class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, String model, boolean hasGear) {
        super(brand, model);
        this.hasGear = hasGear;
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine is starting... Brrr Brrr!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike");
        System.out.println("Has Gear: " + hasGear);
    }

    public boolean isHasGear() {
        return hasGear;
    }
}
