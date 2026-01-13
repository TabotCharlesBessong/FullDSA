package oop;

/**
 * Exercise 3: FullTimeEmployee subclass
 */
public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Type: Full-Time");
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("---");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
