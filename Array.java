
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

  public static void main(String[] args) {
    // Array Array = new Array();
    // Array.arrayDemo();
    int[] arr = {3,2,4,7,16,6,5,10,13,24,8};
    printArray(arr);
    printArray(removeEven(arr));
    printArray(removeOdd(arr));
    int[] rev = reverse(arr,0, arr.length - 1);
    printArray(rev);
  }
}