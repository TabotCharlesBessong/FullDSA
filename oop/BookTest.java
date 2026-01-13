package oop;

/**
 * Main class to test the Book class with constructor overloading
 */
public class BookTest {
  public static void main(String[] args) {
    // Test default constructor
    System.out.println("=== Default Constructor ===");
    Book book1 = new Book();
    book1.displayDetails();

    // Test constructor with title & author
    System.out.println("=== Constructor with Title & Author ===");
    Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    book2.displayDetails();

    // Test constructor with all parameters
    System.out.println("=== Constructor with All Parameters ===");
    Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4", 12.99);
    book3.displayDetails();

    Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", 15.50);
    book4.displayDetails();
  }
}
