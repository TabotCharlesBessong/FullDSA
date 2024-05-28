import java.util.Stack;

public class BinaryTree {

  private TreeNode root;

  private class TreeNode{
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data){
      this.data = data;
    }
  }

  public void recursivePreOrder(TreeNode root){
    if(root == null) return;
    System.out.println(root.data + " ");
    recursivePreOrder(root.left);
    recursivePreOrder(root.right);
  }

  public void iterativePreOrder() {
    if(root == null) return;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
      TreeNode temp = stack.pop();
      System.out.println(temp.data + " ");
      if(temp.right != null) stack.push(temp.right);
      if(temp.left != null) stack.push(temp.left);
    }
  }

  public void recursiveInOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    recursiveInOrder(root.left);
    System.out.print(root.data + " ");
    recursiveInOrder(root.right);
  }

  public void iterativeInOrder(){
    if(root == null) return;

    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;

    while(!stack.isEmpty() || temp != null){
      if(temp != null){
        stack.push(temp);
        temp = temp.left;
      }else{
        temp = stack.pop();
        System.out.print(temp.data + " ");
        temp = temp.right;
      }
    }
  }

  public void postOrder(TreeNode root){
    if(root == null) return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public void createBinaryTree(){
    TreeNode first = new TreeNode(1);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);
    TreeNode fifth = new TreeNode(5);
    TreeNode sixth = new TreeNode(6);
    TreeNode seventh = new TreeNode(7);

    root = first;
    first.left = second;
    first.right = third;
    second.left = fourth;
    second.right = fifth;
    third.left = sixth;
    third.right = seventh;
  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.createBinaryTree();
    // bt.recursivePreOrder(bt.root);
    // bt.iterativePreOrder();
    // bt.recursiveInOrder(bt.root);
    // bt.iterativeInOrder();
    bt.postOrder(bt.root);
  }
}
