import java.util.Stack;

public class ValidParenthesis {
  public static boolean iaValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[')
        stack.push(c);
      else {
        if (stack.isEmpty())
          return false;
        else {
          char top = stack.peek();
          if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))
            stack.pop();
          else
            return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args){
    // int[] nums = {4,2,8,1,6,5,9,7};
    String bracket = "({[[{({[]})}]]})";
    String bracket1 = "({[[{(]}}]]})";
    // int[] nextGreater = findNextGreaterElements(nums);
    System.out.println("The string is a valid parenthesis: " + bracket + " " + iaValid(bracket));
    System.out.println("The string is a valid parenthesis: " + bracket1 + " " + iaValid(bracket1));
  }
}
