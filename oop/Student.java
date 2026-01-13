package oop;

/**
 * Exercise 1: Class Design and Encapsulation
 * Practice encapsulation using access modifiers.
 */
public class Student {
  // Private attributes
  private int id;
  private String name;
  private int age;
  private double gpa;

  // Constructor
  public Student(int id, String name, int age, double gpa) {
    this.id = id;
    this.name = name;
    setAge(age); // Use setter to apply validation
    setGpa(gpa); // Use setter to apply validation
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getGpa() {
    return gpa;
  }

  // Setters with validation
  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Invalid age: Age must be greater than 0. Setting to default value 1.");
      this.age = 1;
    }
  }

  public void setGpa(double gpa) {
    if (gpa >= 0 && gpa <= 4) {
      this.gpa = gpa;
    } else {
      System.out.println("Invalid GPA: GPA must be between 0 and 4. Setting to default value 0.0.");
      this.gpa = 0.0;
    }
  }

  // Display student information
  public void displayInfo() {
    System.out.println("Student ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
  }
}
