package oop;

/**
 * Exercise 5: Contractor class implementing Payable interface
 */
public class Contractor implements Payable {
    private String name;
    private int contractorId;
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, int contractorId, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.contractorId = contractorId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Contractor Payslip ===");
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: $" + calculatePay());
        System.out.println("---");
    }

    public String getName() {
        return name;
    }

    public int getContractorId() {
        return contractorId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
