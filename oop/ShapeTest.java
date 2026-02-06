package oop;

/**
 * Exercise 4: Main class to test abstract Shape class and its subclasses
 */
public class ShapeTest {
    public static void main(String[] args) {
        // Create shape objects
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0);

        // Compute and display areas
        System.out.println("=== Computing and Displaying Areas ===");
        circle.displayArea();
        rectangle.displayArea();
        triangle.displayArea();

        // Using polymorphism with Shape array
        System.out.println("\n=== Using Polymorphism ===");
        Shape[] shapes = {
                new Circle(7.0),
                new Rectangle(5.0, 8.0),
                new Triangle(6.0, 9.0)
        };

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
