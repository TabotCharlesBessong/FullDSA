# FullDSA

## Algorithms and Data Structures

### Algorithms

An algorithm is a step-by-step procedure or a set of rules for solving a problem or accomplishing a task. It provides a systematic approach to problem-solving. Algorithms can be categorized into various types, including:

- **Sorting Algorithms**: These algorithms arrange a collection of elements in a specific order, such as numerical or lexicographical order. Examples include Bubble Sort, Quick Sort, and Merge Sort.

- **Searching Algorithms**: These algorithms find the presence or location of a specific element within a collection. Examples include Linear Search and Binary Search.

- **Graph Algorithms**: These algorithms operate on graph structures and solve problems related to graphs, such as finding the shortest path or detecting cycles. Examples include Breadth-First Search (BFS) and Depth-First Search (DFS).

- **Dynamic Programming Algorithms**: These algorithms break down complex problems into simpler overlapping subproblems and solve them recursively. They store the solutions to subproblems to avoid redundant computation. Examples include the Fibonacci sequence and the Knapsack problem.

### Data Structures

Data structures are containers or structures used to store and organize data efficiently. They provide mechanisms for accessing, inserting, and manipulating data. Here are explanations and examples of common data structures:

#### Linked List

A linked list is a linear data structure consisting of a sequence of nodes, where each node contains data and a reference (or link) to the next node. The last node points to null, indicating the end of the list. Linked lists have dynamic size and allow efficient insertion and deletion operations. They are used in scenarios where frequent modification of data is required, such as:

- Implementing stacks and queues.
- Managing memory allocation in operating systems.
- Representing sparse matrices.

Here's a simple Java code to demonstrate the creation of a linked list:

```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
```

#### Stack

A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. It allows adding and removing elements only from one end, called the top. Stacks are useful in scenarios such as:

- Function call management (method calls and returns).
- Undo/redo operations in text editors.
- Evaluating arithmetic expressions.

Here's a simple Java code to demonstrate the creation of a stack:

```java
import java.util.*;

class Stack {
    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty.");
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty.");
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
```

#### Graph

A graph is a non-linear data structure consisting of a set of nodes (vertices) connected by edges. Graphs are used to represent relationships between objects and solve various real-life problems, such as:

- Network routing and optimization.
- Social network analysis and recommendation systems.
- Web page ranking (PageRank algorithm).

Here's a simple Java code to demonstrate the creation of a graph using an adjacency list representation:

```java
import java.util.*;

class Graph {
    private int numVertices;
    private List<List<Integer>> adjList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
}
```

#### Tree

A tree is a hierarchical data structure consisting of nodes connected by edges. It is a specialized form of a graph with no cycles. Trees are commonly used in various applications, including:

- Representing hierarchical data like file systems and organization structures.
- Implementing search and indexing structures like binary search trees.
- Parsing expressions and constructing syntax trees.

Here's a simple Java code to demonstrate thecreation of a binary tree:

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }
}
```

#### Array

An array is a fixed-size collection of elements stored in contiguous memory locations. It provides direct access to its elements using an index. Arrays are widely used in various scenarios, such as:

- Storing and accessing a collection of elements of the same type.
- Implementing dynamic programming algorithms.
- Representing matrices and multi-dimensional data.

Here's a simple Java code to demonstrate the creation of an array:

```java
class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
    }
}
```

#### Heap

A heap is a complete binary tree where each node follows a specific ordering property. Depending on the ordering, heaps can be classified as min heaps or max heaps. Heaps are commonly used for:

- Priority queue implementation.
- Efficiently finding the kth largest or smallest element in an array.
- Implementing sorting algorithms like heapsort.

Java provides a built-in class `PriorityQueue` that implements a min heap. Here's a simple Java code to demonstrate the usage of a heap using `PriorityQueue`:

```java
import java.util.*;

class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
```

#### Queue

A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. It allows adding elements at one end (rear) and removing elements from the other end (front). Queues are used in various scenarios, including:

- Process scheduling in operating systems.
- Implementing breadth-first search (BFS) in graphs.
- Handling asynchronous tasks and message passing.

Java provides a built-in interface `Queue` with various implementations like `LinkedList` and `PriorityQueue`. Here's a simple Java code to demonstrate the usage of a queue using `LinkedList`:

```java
import java.util.*;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```