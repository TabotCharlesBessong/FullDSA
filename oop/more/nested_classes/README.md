# Nested Classes in Java - OOP Concept

## Overview
Nested classes are classes defined within another class. Java supports different types of nested classes, each with specific use cases and behaviors.

## Types of Nested Classes

### 1. **Non-Static Inner Class (Member Inner Class)**
```java
class OuterClass {
    class LocalInnerClass {  // Non-static inner class
        // Can access outer class members (including private)
    }
}
```
- **Access**: Can access all members of outer class (including private)
- **Instantiation**: Requires outer class instance
- **Memory**: Holds reference to outer class instance

### 2. **Static Nested Class**
```java
class OuterClass {
    static class InnerClass {  // Static nested class
        // Cannot access non-static outer class members
    }
}
```
- **Access**: Cannot access non-static outer class members
- **Instantiation**: Can be instantiated without outer class instance
- **Memory**: No reference to outer class instance

## Key Differences

| Feature | Non-Static Inner | Static Nested |
|---------|------------------|---------------|
| Outer class access | Full access | Only static members |
| Instantiation | `new Outer().new Inner()` | `new Outer.Inner()` |
| Memory overhead | Higher (outer reference) | Lower |

## When to Use

- **Non-Static Inner**: When inner class needs access to outer class state
- **Static Nested**: For utility classes or when no outer class access needed

## Benefits
- **Encapsulation**: Logical grouping of related classes
- **Access Control**: Inner classes can access private members
- **Code Organization**: Keeps helper classes close to where they're used