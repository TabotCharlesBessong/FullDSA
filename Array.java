
public class Array {
  public static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int[] removeEven(int[] arr){
    int oddCount = 0;
    for (int i = 0; i < arr.length ; i++){
      if(arr[i] %2 != 0){
        oddCount++;
      }
    }
    int[] result = new int[oddCount];
    int idx = 0;
    for (int j = 0; j < arr.length; j++){
      if(arr[j] % 2 != 0) {
        result[idx] = arr[j];
        idx++;
      }
    }
    return result;
  }

  public static int[] removeOdd(int[] arr){
    int evenCount = 0;
    for (int i = 0; i < arr.length ; i++){
      if(arr[i] %2 == 0){
        evenCount++;
      }
    }
    int[] result = new int[evenCount];
    int idx = 0;
    for (int j = 0; j < arr.length; j++){
      if(arr[j] % 2 == 0) {
        result[idx] = arr[j];
        idx++;
      }
    }
    return result;
  }

  public static int[] reverse(int[] arr,int start, int end) {
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
  
  public void arrayDemo() {
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 4;
    numbers[2] = 9;
    numbers[3] = 16;
    numbers[4] = 25;
    printArray(numbers);
  }

  public static int findMinimum(int[] arr){
    int min = arr[0];
    for (int i = 1; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }

  public static int findMaximum(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sortedSquares(int[] arr){
    // Two pointer technique
    int n = arr.length;
    int i = 0;
    int j = n - 1;
    int[] result = new int[n];

    for (int k = n - 1; k>=0; k--){
      if(Math.abs(arr[i]) > Math.abs(arr[j])){
        result[k] = arr[i] * arr[i];
        i++;
      }else{
        result[k] = arr[j] * arr[j];
      }
    }

    return result;
  }
  
  public static void main(String[] args) {
    // Array Array = new Array();
    // Array.arrayDemo();
    int[] arr = {3,2,4,7,16,6,5,10,13,24,8};
    printArray(arr);
    printArray(removeEven(arr));
    printArray(removeOdd(arr));
    int[] rev = reverse(arr,0, arr.length - 1);
    printArray(rev);
    System.out.println("Minimum Value in an array");
    int minValue = findMinimum(arr);
    System.out.println(minValue);
    int maxValue = findMaximum(arr);
    System.out.println("Minimum Value in an array");
    System.out.println(maxValue);
    int[] sorted = sortedSquares(arr);
    System.out.println("Sorted array");
    printArray(sorted);
  }
}