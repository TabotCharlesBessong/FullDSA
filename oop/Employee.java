package oop;

/**
 * Exercise 3: Inheritance and Method Overriding
 * Base class Employee
 */
public class Employee {
    protected String name;
    protected int employeeId;
    protected double baseSalary;

    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // Method to be overridden in subclasses
    public double calculateSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
