package more.nested_classes;

public class MainClass {
  public static void main (String[] args){
    OuterClass outer = new OuterClass();
    outer.heyThere();
    outer.demonstrateInnerClass();

    OuterClass.InnerClass inner = new OuterClass.InnerClass();
    inner.whatsUp();
  }
}
