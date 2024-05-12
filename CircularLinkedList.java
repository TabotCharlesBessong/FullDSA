public class CircularLinkedList {

  private ListNode last;
  private int length;

  private class ListNode {
    private ListNode next;
    private int data;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularLinkedList() {
    last = null;
    length = 0;
  }

  public int length() {
    return length();
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void createCircularLinkedList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(5);
    ListNode third = new ListNode(10);
    ListNode fourth = new ListNode(15);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;

    last = fourth;
  }

  public void display() {
    if (last == null)
      return;
    ListNode first = last.next;
    while (first != last) {
      System.out.println(first.data + " --->");
      first = first.next;
    }
    System.out.println(first.data + " --->");
    System.out.println("----------");
  }

  public void insertFirst(int data) {
    ListNode temp = new ListNode(data);
    if (last == null) {
      last = temp;
      last.next = last;
    } else
      temp.next = last.next;
    last.next = temp;
    length++;
  }

  public void insertLast(int data) {
    ListNode temp = new ListNode(data);
    if (last == null) {
      last = temp;
      last.next = temp;
    }else{
      temp.next = last.next;
      last.next = temp;
      last = temp;
    }
  }

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();
    cll.createCircularLinkedList();
    cll.display();
    cll.insertFirst(0);
    cll.insertFirst(-2);
    cll.insertLast(20);
    cll.display();
  }
}
