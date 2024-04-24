
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
    if(current == null){
      System.out.print("null");
      System.err.println();
    }
    while(current != null){
      System.out.println(current.data + " --->");
      current = current.next;
    }
    System.out.println("==============");
  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public int length() {
    if(head == null) return 0;
    int count = 0;
    ListNode current = head;
    while(current != null){
      count++;
      current = current.next;
    }
    return count;
  }

  public void insert(int position, int value){
    ListNode node = new ListNode(value);
    if(position ==1){
      node.next = head;
      head = node;
    }else{
      ListNode previous  = head;
      int count = 1;
      while (count < position - 1){
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = node;
      node.next = current;
    }
  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if(head == null){
      head = newNode;
      return;
    }
    ListNode current = head;
    while (current.next != null) current = current.next;
    current.next = newNode;
  }

  public ListNode deleteFirst() {
    if (head == null) return null;
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }

  public void delete(int position){
    if(position == 1) head = head.next;
    else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = current.next;
    }
  }

  public ListNode deleteLast() {
    if(head == null) return head;
    if(head.next == null){
      ListNode temp = head;
      head = head.next;
      return temp;
    }
    ListNode current = head;
    ListNode previous = null;

    while(current.next != null){
      previous = current;
      current = current.next;
    }
    previous.next = null;
    return current;
  }

  public static void main(String[] args) {
    SignlyLinkedList sll1 = new SignlyLinkedList();
    sll1.insertFirst(4);
    sll1.insertFirst(3);
    sll1.insertFirst(2);
    sll1.insertFirst(1);
    int len = sll1.length();
    System.out.println(len);
    sll1.display();
    sll1.insert(4, 5);
    sll1.display();
    sll1.insertLast(6);
    sll1.deleteLast();
    sll1.insertLast(0);
    sll1.display();
    sll1.deleteFirst();
    sll1.insertFirst(-2);
    sll1.display();
    sll1.delete(4);
    sll1.display();
  }
}


