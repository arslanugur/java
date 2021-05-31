Linked List in Java
      Each element(or node) in the linked list has data and a pointer to another data.
      The pointer stores the memory location of the next node.
      The last node of the list should point to nothing - it should be a null pointer.
      
      To create the Node class:
class LinkedList {
  class Node {
    int value;
    Node next;
    
    public Node(int value) {
      this.value = value;
    }
  }
}

      The node object contains a value field and a next pointer.


      Now we can create the corresponding LinkedList methods:
class LinkedList {
    
    static class Node {
        int value;
        Node next;
    
        public Node(int value) {
            this.value = value;
        }
    }

    Node first = null;

    public void addAtFront(Node node) {
        node.next = first;
        first = node;
    }
    
    public void addAtEnd(Node node) {
        if (first == null)
            first = node;
        else {
            Node ptr = first;
            while(ptr.next != null)
                ptr = ptr.next;
            ptr.next = node;
        }
    }
    
    public void removeFront() {
        first = first.next;
    }

    public void print() {
        Node ptr = first;
        while(ptr != null) {
            System.out.print(ptr.value+" -> ");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.addAtFront(new Node(1));
        L.addAtFront(new Node(2));
        L.addAtFront(new Node(4));
        L.addAtFront(new Node(8));
        L.addAtEnd(new Node(5));
        L.print();
    }
}
  //output: 8 -> 4 -> 2 -> 1 -> 5 ->
  
  
