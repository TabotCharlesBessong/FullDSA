# Lambda Expressions in Java - Advanced OOP Concept

## Overview
Lambda expressions provide a concise way to represent anonymous functions. They enable functional programming patterns in Java and are particularly useful with the Stream API and functional interfaces.

## Basic Syntax
```java
// Basic lambda syntax
(parameters) -> expression
(parameters) -> { statements; }
```

## Functional Interfaces
Lambda expressions work with **functional interfaces** - interfaces with exactly one abstract method.

### Custom Functional Interfaces
```java
@FunctionalInterface
public interface AreaCalculator {
    double calculateArea(double... dimensions);
}

// Usage with lambda
AreaCalculator rectangleArea = (dims) -> dims[0] * dims[1];
```

### Built-in Functional Interfaces

| Interface | Method | Purpose | Example |
|-----------|--------|---------|---------|
| `Function<T,R>` | `R apply(T t)` | Transform input to output | `radius -> π * r²` |
| `BiFunction<T,U,R>` | `R apply(T t, U u)` | Two inputs to output | `(l, w) -> l * w` |
| `Predicate<T>` | `boolean test(T t)` | Test condition | `area -> area > 50` |
| `Consumer<T>` | `void accept(T t)` | Process input (side effects) | `shape -> print(shape)` |
| `Supplier<T>` | `T get()` | Provide output | `() -> Math.random()` |

## Geometry Examples Walkthrough

### 1. Area Calculations
```java
// Rectangle area using lambda
AreaCalculator rectArea = (dims) -> dims[0] * dims[1];
rectangle.calculateAndDisplayArea(rectArea, 5.0, 3.0);

// Circle area with π calculation
AreaCalculator circleArea = (dims) -> Math.PI * dims[0] * dims[0];
```

### 2. Volume Calculations
```java
// Cube volume: side³
VolumeCalculator cubeVol = (dims) -> Math.pow(dims[0], 3);

// Sphere volume: (4/3)πr³
VolumeCalculator sphereVol = (dims) -> 
    (4.0/3.0) * Math.PI * Math.pow(dims[0], 3);
```

### 3. Complex Operations
```java
// Pythagorean theorem
GeometryOperation hypotenuse = (a, b) -> Math.sqrt(a*a + b*b);

// Distance formula
GeometryOperation distance = (x_diff, y_diff) -> 
    Math.sqrt(x_diff*x_diff + y_diff*y_diff);
```

## Method References
Shorthand for lambdas that call existing methods:

| Type | Syntax | Lambda Equivalent |
|------|---------|-------------------|
| Static method | `Math::sqrt` | `x -> Math.sqrt(x)` |
| Instance method | `System.out::println` | `x -> System.out.println(x)` |
| Constructor | `Shape::new` | `name -> new Shape(name)` |

## Stream API Integration
```java
List<Double> radii = Arrays.asList(1.0, 2.5, 3.0, 4.5);

// Calculate areas using streams and lambdas
List<Double> areas = radii.stream()
    .map(r -> Math.PI * r * r)  // Transform each radius to area
    .filter(area -> area > 10)  // Filter large areas
    .toList();
```

## Key Benefits

### 1. **Conciseness**
```java
// Before (Anonymous class)
AreaCalculator calc = new AreaCalculator() {
    public double calculateArea(double... dims) {
        return dims[0] * dims[1];
    }
};

// After (Lambda)
AreaCalculator calc = (dims) -> dims[0] * dims[1];
```

### 2. **Readability**
- Reduces boilerplate code
- Focuses on the logic, not the syntax
- Enables functional programming patterns

### 3. **Flexibility**
- Pass behavior as parameters
- Create function compositions
- Enable higher-order functions

## When to Use Lambdas

✅ **Good for:**
- Short, simple operations
- Stream API operations
- Event handling
- Callback functions

❌ **Avoid for:**
- Complex logic (use regular methods)
- When you need method overloading
- When debugging is critical (stack traces are less clear)

## Real-World Applications
- **Collections processing**: Filtering, mapping, reducing data
- **Event handling**: GUI event listeners
- **Parallel processing**: Stream parallel operations
- **API callbacks**: Asynchronous programming
- **Mathematical operations**: Custom calculators and transformations