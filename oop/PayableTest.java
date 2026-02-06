package oop;

/**
 * Exercise 5: Main class to test Payable interface implementation
 */
public class PayableTest {
    public static void main(String[] args) {
        // Create Employee and Contractor objects
        EmployeePayable employee = new EmployeePayable("John Smith", 1001, 5000.0);
        Contractor contractor = new Contractor("Jane Doe", 2001, 50.0, 80);

        // Demonstrate interface usage
        System.out.println("=== Demonstrating Interface Implementation ===");
        employee.generatePayslip();
        contractor.generatePayslip();

        // Using polymorphism with Payable array
        System.out.println("\n=== Using Polymorphism with Interface ===");
        Payable[] payables = {
                new EmployeePayable("Alice Johnson", 1002, 6000.0),
                new Contractor("Bob Williams", 2002, 55.0, 100)
        };

        for (Payable payable : payables) {
            payable.generatePayslip();
        }

        // Calculate total pay
        System.out.println("=== Calculating Total Pay ===");
        double totalPay = 0;
        for (Payable payable : payables) {
            totalPay += payable.calculatePay();
        }
        System.out.println("Total Pay for all payables: $" + totalPay);
    }
}
