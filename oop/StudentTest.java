package oop;

/**
 * Main class to test the Student class
 */
public class StudentTest {
  public static void main(String[] args) {
    // Create student objects
    Student student1 = new Student(1, "John Doe", 20, 3.5);
    Student student2 = new Student(2, "Jane Smith", 19, 3.8);

    System.out.println("=== Student 1 ===");
    student1.displayInfo();

    System.out.println("\n=== Student 2 ===");
    student2.displayInfo();

    // Test validation
    System.out.println("\n=== Testing Validation ===");
    Student student3 = new Student(3, "Bob Johnson", -5, 5.0); // Invalid age and GPA
    student3.displayInfo();

    // Test setters
    System.out.println("\n=== Testing Setters ===");
    student1.setAge(21);
    student1.setGpa(3.7);
    student1.displayInfo();

    // Test invalid setter values
    System.out.println("\n=== Testing Invalid Setter Values ===");
    student2.setAge(-10);
    student2.setGpa(4.5);
    student2.displayInfo();
  }
}
