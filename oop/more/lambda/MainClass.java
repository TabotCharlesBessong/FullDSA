package more.lambda;

public class MainClass {
  public static void main(String[] args){
    System.out.println("=== BASIC LAMBDA EXAMPLE ===");
    Cat cat1 = new Cat("Whiskers", 3);
    Cat cat2 = new Cat("Mittens", 5);

    cat1.print();
    printCatInfo(cat2);
    
    // Lambda expression example
    Printable lambdaPrintable = () -> System.out.println("Hello from Lambda!");
    printCatInfo(lambdaPrintable);
    
    System.out.println("\n=== ADVANCED GEOMETRY LAMBDA DEMONSTRATIONS ===");
    
    // Run the comprehensive geometry lambda demo
    GeometryLambdaDemo.main(args);
  }

  static void printCatInfo(Printable printable) {
    printable.print();
  }
}
