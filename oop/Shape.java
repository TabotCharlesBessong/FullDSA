package oop;

/**
 * Exercise 4: Abstract Classes
 * Abstract class Shape with abstract method calculateArea()
 */
public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateArea();

    // Concrete method
    public void displayArea() {
        System.out.println(shapeName + " Area: " + calculateArea());
    }

    public String getShapeName() {
        return shapeName;
    }
}
