
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

  public static int findSecondMax(int[] arr){
    int max = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length ; i++){
      if(arr[i] > max){
        max2 = max;
        max = arr[i];
      }else if(arr[i] > max2 && arr[i] != max) max2 = arr[i];
    }
    return max2;
  }

  public static int[] moveZero(int[] arr,int n){
    int j = 0;
    for (int i = 0; i < n; i++){
      if(arr[i] != 0 && arr[j] ==0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if(arr[j] != 0) j++;
    }
    return arr;
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

  public static int[] shrink(int[] arr, int capacity){
    int[] temp = new int[capacity];
    for(int i = 0; i < temp.length; i++) temp[i] = arr[i];
    arr = temp;
    return arr;
  }

  public static int[] grow(int[] arr, int capacity){
    int[] temp = new int[capacity];
    for(int i = 0; i < arr.length; i++) temp[i] = arr[i];
    arr = temp;
    return arr;
  }

  public static int missingNumber(int[] arr){
    int n = arr.length + 1;
    int sum = n * (n +1) / 2;
    for(int num: arr) sum = sum - num;
    return sum;
  }

  public static boolean palindrome(String word){
    char[] charArr = word.toCharArray();
    int start = 0;
    int end = word.length() - 1;
    while(start < end){
      if(charArr[start] != charArr[end]) return false;
      start++;
      end--;
    }
    return true;
  }
  
  public static void main(String[] args) {
    // Array Array = new Array();
    // Array.arrayDemo();
    int[] arr = {3,2,0,4,7,16,6,5,10,0,13,24,8};
    printArray(arr);
    printArray(removeEven(arr));
    printArray(removeOdd(arr));
    int[] rev = reverse(arr,0, arr.length - 1);
    printArray(rev);
    System.out.println("Minimum Value in an array");
    int minValue = findMinimum(arr);
    System.out.println(minValue);
    int maxValue = findMaximum(arr);
    System.out.println("Maximum Value in an array");
    System.out.println(maxValue);
    int maxValue2 = findSecondMax(arr);
    System.out.println("Second maximum Value in an array");
    System.out.println(maxValue2);
    // int[] sorted = sortedSquares(arr);
    // System.out.println("Sorted array");
    // printArray(sorted);
    int[] zeros = moveZero(arr, arr.length);
    printArray(zeros);
    System.out.println("Shrinked array");
    int[] resized = shrink(arr, 6);
    printArray(resized);
    System.out.println("Growned array");
    int[] grown = grow(arr, 24);
    printArray(grown);
    int[] testArr = {1,2,3,4,5,7,8,9};
    int missing = missingNumber(testArr);
    System.out.println("Missing value in an array");
    System.out.println(missing);
    String word = "madam";
    System.out.println(palindrome(word));
  }
}