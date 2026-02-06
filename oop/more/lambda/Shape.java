package more.lambda;

public class Shape {
    private String name;
    private String type; // 2D or 3D
    
    public Shape(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() { return name; }
    public String getType() { return type; }
    
    // Method that accepts lambda for area calculation
    public void calculateAndDisplayArea(AreaCalculator calculator, double... dimensions) {
        double area = calculator.calculateArea(dimensions);
        System.out.printf("%s Area: %.2f square units%n", name, area);
    }
    
    // Method that accepts lambda for volume calculation  
    public void calculateAndDisplayVolume(VolumeCalculator calculator, double... dimensions) {
        double volume = calculator.calculateVolume(dimensions);
        System.out.printf("%s Volume: %.2f cubic units%n", name, volume);
    }
    
    // Static method for processing shapes with operations
    public static void processShape(String shapeName, GeometryOperation operation, 
                                  double dim1, double dim2, String unit) {
        double result = operation.calculate(dim1, dim2);
        System.out.printf("%s calculation result: %.2f %s%n", shapeName, result, unit);
    }
}