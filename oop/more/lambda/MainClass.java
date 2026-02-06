package more.lambda;

public class MainClass {
  public static void main(String[] args){
    Cat cat1 = new Cat("Whiskers", 3);
    Cat cat2 = new Cat("Mittens", 5);

    cat1.print();
    // cat2.print();

    printCatInfo(cat2);
  }

  static void printCatInfo(Printable printable) {
    printable.print();
  }
}
