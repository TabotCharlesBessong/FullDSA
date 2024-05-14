import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
  public static int[] findNextGreaterElements(int[] nums){
    int[] result = new int[nums.length];

    Arrays.fill(result,-1);

    Stack<Integer> stack = new Stack<>();

    for(int i = 0; i < nums.length; i++){
      while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
        int index = stack.pop();
        result[index] = nums[i];
      }
      stack.push(i);
    }

    return result;
  }

  public static void main(String[] args){
    int[] nums = {4,2,8,1,6,5,9,7};
    int[] nextGreater = findNextGreaterElements(nums);
    System.out.println("Next greater elements: " + Arrays.toString(nextGreater));
  }
}
