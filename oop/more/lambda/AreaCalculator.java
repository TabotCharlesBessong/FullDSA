package more.lambda;

@FunctionalInterface
public interface AreaCalculator {
    double calculateArea(double... dimensions);
}