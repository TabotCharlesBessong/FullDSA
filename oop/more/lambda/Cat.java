package more.lambda;

public class Cat implements Printable {

  public String name;
  public int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // @Override
  public void print() {
    System.out.println("Cat name: " + name + ", age: " + age);
  }

  // static void printCatInfo(Printable printable) {
  //   printable.print();
  // }
}
