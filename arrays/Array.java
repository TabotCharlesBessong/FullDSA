// package array;

// public class Array {
//   public static void main(String[] args) {
    // int[] numbers = new int[5];
    // numbers[0] = 1;
    // numbers[1] = 2;
    // numbers[2] = 3;
    // numbers[3] = 4;
    // numbers[4] = 5;
//   }
// }

package arrays;

public class Array {
  public void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public void arrayDemo() {
    int[] numbers = new int[5];
    printArray(numbers);
  }

  public static void main(String[] args) {
    Array Array = new Array();
    Array.arrayDemo();
  }
}