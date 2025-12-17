
package oop;

public class Cynlinder {
  
  // defining variables
  static double pi = 3.14;
  double height;
  double radius;

  // the cynlinder class constructor
  public Cynlinder(double h, double r){
    height = h;
    radius = r;
  }

  /*
   * The method will take the radius and height of the cylinder and return us the
   * volume of the cylinder
   */
  public double getVolume(){
    double volume = pi * radius * radius * height;
    return volume;
  }

  // get surface area
  /*
   * The method will take the radius and height of the cylinder and return us the
   * surface aread of the cylinder
   */
  public double getSurfaceArea(){
    double surfaceArea = 2 * pi * radius * (radius + height);
    return surfaceArea;
  }

  // main method
  public static void main(String args[]){
    // create a Cynlinder object
    Cynlinder cynlinder = new Cynlinder(7.0, 3.0);

    // call methods to get volume and surface area
    double volume = cynlinder.getVolume();
    double surfaceArea = cynlinder.getSurfaceArea();

    // print the results
    System.out.println("Volume of the cynlinder: " + volume);
    System.out.println("Surface Area of the cynlinder: " + surfaceArea);
  }
}