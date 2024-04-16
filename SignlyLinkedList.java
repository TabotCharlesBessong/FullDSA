
public class SignlyLinkedList {
  private ListNode head;

  private static class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void display() {
    ListNode current = head;
    while(current != null){
      System.out.println(current.data + " --->");
      current = current.next;
    }
  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public static void main(String[] args) {
    SignlyLinkedList sll1 = new SignlyLinkedList();
    sll1.insertFirst(1);
    sll1.insertFirst(2);
    sll1.insertFirst(3);
    sll1.insertFirst(4);
    sll1.display();
  }
}


