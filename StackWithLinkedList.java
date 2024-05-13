public class StackWithLinkedList {
  private ListNode top;
  private int length;

  private class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }

  public StackWithLinkedList(){
    top = null;
    length = 0;
  }
}
