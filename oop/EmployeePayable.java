package oop;

/**
 * Exercise 5: Employee class implementing Payable interface
 */
public class EmployeePayable implements Payable {
    private String name;
    private int employeeId;
    private double monthlySalary;

    public EmployeePayable(String name, int employeeId, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Employee Payslip ===");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Total Pay: $" + calculatePay());
        System.out.println("---");
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
