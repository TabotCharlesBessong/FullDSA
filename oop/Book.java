package oop;

/**
 * Exercise 2: Constructor Overloading
 * Understand constructor overloading.
 */
public class Book {
  private String title;
  private String author;
  private String isbn;
  private double price;

  // Default constructor
  public Book() {
    this.title = "Unknown";
    this.author = "Unknown";
    this.isbn = "N/A";
    this.price = 0.0;
  }

  // Constructor with title & author
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isbn = "N/A";
    this.price = 0.0;
  }

  // Constructor with title, author, ISBN & price
  public Book(String title, String author, String isbn, double price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
  }

  // Display book details
  public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    System.out.println("Price: $" + price);
    System.out.println("---");
  }

  // Getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


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
