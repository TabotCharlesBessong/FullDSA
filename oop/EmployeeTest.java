package oop;

/**
 * Exercise 3: Main class to demonstrate inheritance and method overriding
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Create FullTimeEmployee objects
        FullTimeEmployee fullTime1 = new FullTimeEmployee("Alice Johnson", 101, 50000, 5000);
        FullTimeEmployee fullTime2 = new FullTimeEmployee("Bob Williams", 102, 60000, 6000);

        // Create PartTimeEmployee objects
        PartTimeEmployee partTime1 = new PartTimeEmployee("Charlie Brown", 201, 0, 20, 25.0);
        PartTimeEmployee partTime2 = new PartTimeEmployee("Diana Prince", 202, 0, 15, 30.0);

        // Demonstrate runtime polymorphism
        System.out.println("=== Demonstrating Runtime Polymorphism ===");
        Employee[] employees = {
                fullTime1,
                fullTime2,
                partTime1,
                partTime2
        };

        for (Employee emp : employees) {
            emp.displayInfo();
        }

        // Direct calls to show method overriding
        System.out.println("\n=== Direct Method Calls ===");
        System.out.println("Full-Time Employee Salary: $" + fullTime1.calculateSalary());
        System.out.println("Part-Time Employee Salary: $" + partTime1.calculateSalary());
    }
}
