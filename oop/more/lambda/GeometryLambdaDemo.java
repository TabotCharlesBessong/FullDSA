package more.lambda;

import java.util.*;
import java.util.function.*;

public class GeometryLambdaDemo {
    
    public static void main(String[] args) {
        demonstrateBasicLambdas();
        demonstrateAdvancedLambdas();
        demonstrateBuiltInFunctionalInterfaces();
        demonstrateMethodReferences();
    }
    
    // 1. Basic Lambda Demonstrations with Geometry
    public static void demonstrateBasicLambdas() {
        System.out.println("=== BASIC LAMBDA DEMONSTRATIONS ===\n");
        
        // Create shapes
        Shape rectangle = new Shape("Rectangle", "2D");
        Shape circle = new Shape("Circle", "2D");
        Shape cube = new Shape("Cube", "3D");
        Shape sphere = new Shape("Sphere", "3D");
        
        // Area calculations using lambdas
        System.out.println("--- Area Calculations ---");
        
        // Rectangle area: length * width
        rectangle.calculateAndDisplayArea((double... dims) -> dims[0] * dims[1], 5.0, 3.0);
        
        // Circle area: π * r²
        circle.calculateAndDisplayArea((double... dims) -> Math.PI * dims[0] * dims[0], 4.0);
        
        // Triangle area: 0.5 * base * height
        Shape triangle = new Shape("Triangle", "2D");
        triangle.calculateAndDisplayArea((double... dims) -> 0.5 * dims[0] * dims[1], 6.0, 8.0);
        
        // Volume calculations using lambdas
        System.out.println("\n--- Volume Calculations ---");
        
        // Cube volume: side³
        cube.calculateAndDisplayVolume((double... dims) -> Math.pow(dims[0], 3), 4.0);
        
        // Sphere volume: (4/3) * π * r³
        sphere.calculateAndDisplayVolume((double... dims) -> 
            (4.0/3.0) * Math.PI * Math.pow(dims[0], 3), 3.0);
        
        // Cylinder volume: π * r² * h
        Shape cylinder = new Shape("Cylinder", "3D");
        cylinder.calculateAndDisplayVolume((double... dims) -> 
            Math.PI * dims[0] * dims[0] * dims[1], 2.0, 5.0);
        
        System.out.println();
    }
    
    // 2. Advanced Lambda with Complex Operations
    public static void demonstrateAdvancedLambdas() {
        System.out.println("=== ADVANCED LAMBDA DEMONSTRATIONS ===\n");
        
        // Complex geometric operations using our functional interface
        System.out.println("--- Complex Geometric Operations ---");
        
        // Pythagorean theorem: c = √(a² + b²)
        Shape.processShape("Right Triangle Hypotenuse", 
            (a, b) -> Math.sqrt(a*a + b*b), 3.0, 4.0, "units");
        
        // Distance between two points: √((x2-x1)² + (y2-y1)²)
        Shape.processShape("Distance between points", 
            (x_diff, y_diff) -> Math.sqrt(x_diff*x_diff + y_diff*y_diff), 5.0, 12.0, "units");
        
        // Ellipse area: π * a * b (where a and b are semi-axes)
        Shape.processShape("Ellipse", 
            (semi_a, semi_b) -> Math.PI * semi_a * semi_b, 4.0, 3.0, "square units");
        
        // Surface area of rectangular prism: 2(lw + lh + wh)
        AreaCalculator rectangularPrismSurfaceArea = (double... dims) -> {
            double l = dims[0], w = dims[1], h = dims[2];
            return 2 * (l*w + l*h + w*h);
        };
        
        Shape prism = new Shape("Rectangular Prism Surface", "3D");
        prism.calculateAndDisplayArea(rectangularPrismSurfaceArea, 5.0, 3.0, 4.0);
        
        System.out.println();
    }
    
    // 3. Built-in Functional Interfaces
    public static void demonstrateBuiltInFunctionalInterfaces() {
        System.out.println("=== BUILT-IN FUNCTIONAL INTERFACES ===\n");
        
        // Function<T, R> - takes input, returns output
        Function<Double, Double> circleArea = radius -> Math.PI * radius * radius;
        Function<Double, Double> sphereVolume = radius -> (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        
        System.out.println("--- Function Interface Examples ---");
        System.out.printf("Circle (r=3) area: %.2f%n", circleArea.apply(3.0));
        System.out.printf("Sphere (r=3) volume: %.2f%n", sphereVolume.apply(3.0));
        
        // BiFunction<T, U, R> - takes two inputs, returns output
        BiFunction<Double, Double, Double> rectangleArea = (length, width) -> length * width;
        BiFunction<Double, Double, Double> triangleArea = (base, height) -> 0.5 * base * height;
        
        System.out.printf("Rectangle (5x3) area: %.2f%n", rectangleArea.apply(5.0, 3.0));
        System.out.printf("Triangle (6x8) area: %.2f%n", triangleArea.apply(6.0, 8.0));
        
        // Predicate<T> - takes input, returns boolean
        Predicate<Double> isLargeArea = area -> area > 50.0;
        Predicate<Double> isSmallRadius = radius -> radius < 2.0;
        
        System.out.println("\n--- Predicate Interface Examples ---");
        double testArea = rectangleArea.apply(8.0, 7.0);
        System.out.printf("Area %.2f is large: %b%n", testArea, isLargeArea.test(testArea));
        System.out.printf("Radius 1.5 is small: %b%n", isSmallRadius.test(1.5));
        
        // Consumer<T> - takes input, no return (side effects)
        Consumer<Shape> printShapeInfo = shape -> 
            System.out.printf("Shape: %s (%s)%n", shape.getName(), shape.getType());
        
        System.out.println("\n--- Consumer Interface Examples ---");
        List<Shape> shapes = Arrays.asList(
            new Shape("Square", "2D"),
            new Shape("Pyramid", "3D"),
            new Shape("Pentagon", "2D")
        );
        
        shapes.forEach(printShapeInfo);
        
        // Supplier<T> - no input, returns output
        Supplier<Double> randomRadius = () -> Math.random() * 10;
        Supplier<String> geometryFact = () -> "The sum of angles in any triangle is 180°";
        
        System.out.println("\n--- Supplier Interface Examples ---");
        System.out.printf("Random radius: %.2f%n", randomRadius.get());
        System.out.println("Geometry fact: " + geometryFact.get());
        
        System.out.println();
    }
    
    // 4. Method References
    public static void demonstrateMethodReferences() {
        System.out.println("=== METHOD REFERENCES ===\n");
        
        List<Double> radii = Arrays.asList(1.0, 2.5, 3.0, 4.5, 5.0);
        
        System.out.println("--- Static Method References ---");
        // Static method reference for calculations
        List<Double> areas = radii.stream()
            .map(GeometryLambdaDemo::calculateCircleArea)  // Method reference
            .toList();
            
        System.out.println("Radii: " + radii);
        System.out.println("Areas: " + areas);
        
        System.out.println("\n--- Instance Method References ---");
        // Instance method reference
        radii.forEach(System.out::println);  // Method reference to println
        
        System.out.println("\n--- Constructor References ---");
        // Constructor reference
        Function<String, Shape> shapeFactory = name -> new Shape(name, "2D");
        // Could also be written as: Shape::new (if constructor matches)
        
        List<String> shapeNames = Arrays.asList("Hexagon", "Octagon", "Decagon");
        List<Shape> geometricShapes = shapeNames.stream()
            .map(shapeFactory)
            .toList();
            
        geometricShapes.forEach(shape -> 
            System.out.printf("Created: %s%n", shape.getName()));
        
        System.out.println();
    }
    
    // Helper method for method reference demonstration
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}