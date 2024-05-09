
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

  public boolean find(int searchKey){
    if(head == null) return false;
    ListNode current = head;
    while (current != null){
      if(current.data == searchKey) return true;
      current = current.next;
    }
    return false;
  }

  public int getMiddleValue(){
    int value;
    if(head == null) return 0;
    ListNode slowPtr = head;
    ListNode fastPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }
    value = slowPtr.data;
    return value;
  }

  public int getNthValueFromEnd(int n){
    if (head == null) return 0;
    if(n <= 0) throw new IllegalArgumentException("Invalid value: n = "+ n);

    ListNode mainPtr = head;
    ListNode refPtr = head;
    int count = 0;

    while(count < n){
      if(refPtr == null) throw new IllegalArgumentException(n + "is greater than the number of nodes in the list");
      refPtr = refPtr.next;
      count++;
    }

    while (refPtr != null){
      refPtr = refPtr.next;
      mainPtr = mainPtr.next;
    }
    int value = mainPtr.data;
    return value;
  }

  public int getNthValueFromStart(int n) {
    if (head == null)
      return 0;
    if (n <= 0)
      throw new IllegalArgumentException("Invalid value: n = " + n);

    // ListNode mainPtr = head;
    ListNode refPtr = head;
    int count = 0;

    while (count < n) {
      if (refPtr == null)
        throw new IllegalArgumentException(n + "is greater than the number of nodes in the list");
      refPtr = refPtr.next;
      count++;
    }

    // while (refPtr != null) {
    //   refPtr = refPtr.next;
    //   mainPtr = mainPtr.next;
    // }
    int value = refPtr.data;
    return value;
  }

  public int reverse() {
    int value;
    if(head == null) return 0;
    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;

    while(current != null){
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    value = previous.data;
    return value;
  }

  public boolean containsLoop(){
    ListNode fastPtr = head;
    ListNode slowPtr = head;

    while(fastPtr != null && fastPtr.next != null){
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;

      if(fastPtr == slowPtr) return true;
    }
    return false;
  }

  public void createALoopInLinkedList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);
    ListNode sixth = new ListNode(6);
    ListNode seventh = new ListNode(7);
    ListNode eighth = new ListNode(8);

    head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    seventh.next = eighth;
    eighth.next = second;
  }

  // private ListNode getStartingNode(ListNode slowPtr) {
  //   ListNode temp = head;
  //   while (temp != slowPtr) {
  //     temp = temp.next;
  //     slowPtr = slowPtr.next;
  //   }
  //   return temp; // starting node of the loop
  // }

  public void removeLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;

    while (fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;

      if (fastPtr == slowPtr) {
        removeLoop();
        return;
      }
    }
  }

  public void removeDuplicates(){
    if(head == null) return;
    ListNode current = head;
    while(current != null && current.next != null){
      if(current.data == current.next.data) current.next = current.next.next;
      else current = current.next;
    }
  }

  public static void main(String[] args) {
    SignlyLinkedList sll1 = new SignlyLinkedList();
    SignlyLinkedList sll4 = new SignlyLinkedList();
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
    sll1.insert(4, 6);
    sll1.display();
    sll1.delete(4);
    System.out.println(sll1.find(6));
    System.out.println("Getting the middle element in the node list");
    System.out.println(sll1.getMiddleValue());
    sll1.insert(2, 8);
    sll1.insertLast(7);
    sll1.insertLast(9);
    System.out.println("Getting the middle element in the node list");
    System.out.println(sll1.getMiddleValue());
    System.out.println("Getting n'th value from start and end of a list");
    System.out.println(sll1.getNthValueFromStart(4));
    System.out.println(sll1.getNthValueFromEnd(3));
    sll1.insertLast(8);
    sll1.display();
    System.out.println("reversing a linked list");
    int reverse = sll1.reverse();
    System.out.println(reverse);


    SignlyLinkedList sll3 = new SignlyLinkedList();
    sll3.createALoopInLinkedList();
    // sll3.display();
    System.out.println(sll3.containsLoop());

    sll4.insertLast(0);
    sll4.insertLast(1);
    sll4.insertLast(2);
    sll4.insertLast(3);
    sll4.insertLast(3);
    sll4.insertLast(3);
    sll4.insertLast(4);

    sll4.display();
    sll4.removeDuplicates();
    sll4.display();
  }
}


