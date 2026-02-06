package more.nested_classes;

public class OuterClass {
  int number = 6;

  public void heyThere() {
    System.out.println("Hello there");
  }

  class LocalInnerClass {
    String localInnerClassVariable = "I just wanted to say hi";

    public void printLocalInnerclassVariable() {
      System.out.println(localInnerClassVariable);
    }
  }

  LocalInnerClass localInnerClass = new LocalInnerClass();

  public void demonstrateInnerClass() {
    localInnerClass.printLocalInnerclassVariable();
  }

  public static class InnerClass {
    int innerNumber = 8;

    public void whatsUp() {
      System.out.println("Whats up from the inner class");
    }
  }
}
