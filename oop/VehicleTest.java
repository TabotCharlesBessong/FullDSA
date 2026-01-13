package oop;

/**
 * Exercise 6: Main class to demonstrate polymorphism with dynamic binding
 */
public class VehicleTest {
    public static void main(String[] args) {
        // Create vehicle objects
        Car car = new Car("Toyota", "Camry", 4);
        Bike bike = new Bike("Honda", "CBR600", true);
        Truck truck = new Truck("Ford", "F-150", 2.5);

        // Store objects in an array of Vehicle (demonstrating polymorphism)
        Vehicle[] vehicles = {
            car,
            bike,
            truck,
            new Car("BMW", "X5", 5),
            new Bike("Yamaha", "R1", true),
            new Truck("Chevrolet", "Silverado", 3.0)
        };

        System.out.println("=== Demonstrating Dynamic Method Dispatch ===");
        System.out.println("Each vehicle's startEngine() method is called:\n");

        // Demonstrate runtime polymorphism - dynamic method dispatch
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.startEngine();  // Dynamic binding - calls the appropriate overridden method
            System.out.println("---");
        }

        System.out.println("\n=== Individual Vehicle Details ===");
        car.displayInfo();
        car.startEngine();
        System.out.println();
        
        bike.displayInfo();
        bike.startEngine();
        System.out.println();
        
        truck.displayInfo();
        truck.startEngine();
    }
}
