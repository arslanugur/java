Queue in Java
      Let's implement a queue structure using a linked list. 
      Remember, each node of a linked list stores the address of the next node.
      
      To implement a queue, we first need to define the Node class:
class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}

      Each node stores a value and a next pointer.
      
      Now, we can implement the Queue class with it's corresponding enqueue, dequeue and print methods:
public class Queue {
    
    static class Node {
        int value;
        Node next;
    
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node first = null;
    private Node last = null;

    public void enqueue(Node node) {
        if(last == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void dequeue() {
        first = first.next;
        if(first == null)
            last = null;
    }

    public void print() {
        Node node = first;
        while(node != null) {
            System.out.print(node.value+" ");
            node = node.next;
        }
    }
        
    public static void main(String[] args) {
        Queue q = new Queue();
    
        q.enqueue(new Node(1));
        q.enqueue(new Node(2));
        q.enqueue(new Node(4));
        q.enqueue(new Node(8));
        
        q.print();

    }
}
//output: 1 2 4 8

      this is one of the best approaches to play with nodes. Beside FIFO, the LIFO approach.
      
      The Queue interface defines two important methods for all classes that do implement the Queue interface -
      • add(E element): Inserts the specified element into the queue.
      • poll(): Retrieves and removes the head of the queue.
      
      Is it necessary  to add elements at the end?
      What if I add elements at the beginning and delete from the end ?  it's not a queue anymore?
      In queue data structure, 
      element can only be deleted at one end called Front using “dequeue” method 
      and added at the other end called rear using “enqueue” method, 
      so u can’t delete nor add at both side.


      Example code including the above two methods:
import java.util.LinkedList;
import java.util.Queue;

public class Program
{
    public static void main(String[] args) {
        Queue orders = new LinkedList();
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
        
        /**
         * Every time you call poll() it returns the first item in the Queue and removes it.
         */
        for(int i=0; i<3; i++) {
            System.out.println(orders.poll());
        }
    }
}
      
      When you call the dequeue method without adding data using enqueue method, it will produce an error. 
      dequeue method should look like this:
public void dequeue(){
    if (first == null){
         return;
    }
    first = first.next;
}
      
      to the main example, Why.. 
 else {
            last.next = node;
            last = node;
        }
      Then it will put the same value in the two last nodes, 
      but we want just the last node to be the value inserted.

      last is a pointer pointing to the last inserted element of our queue 
      and last element will be having two things( a value and a next).
      Now, we want to add another node...
      so, what we actually did is that we said...
      whomsoever the last pointer is pointing take that node and on its slot that reads next put address of new node.
      Now we need to move our last pointer to the newly added element as we all know
      that last pointer points to the last added element. 
      Thus we took the address of our new node (node) and put it in last
      and thus it is now pointing to our new node.and we are ready to another element.

      
      Queue made by Two stacks with portuese comments
public class Node{
    private int dado;
    private Node seg;

    protected Node(int dado, Node seg){
        this.dado = dado;
        this.seg = seg;
    }
    
    protected Node getSeg(){
        return seg;
    }
    
    protected void setSeg(Node seg){
        this.seg = seg;
    }
    
    protected int getDado(){
        return dado;
    }
    
    protected void setDado(int dado){
        this.dado = dado;
    }
}

public class Stack extends Node{
    private Node pilha;
    
    protected Stack(){
        super(0, null);
        pilha = new Node(0, null);
    }
    
    protected Stack(Stack p){
        super(0, null);
        pilha = p.getHeader();
    }
    
    private Node getHeader(){
        return pilha;
    }
    
    protected boolean isEmpty(){
        return (pilha == null || pilha.getSeg() == null);
    }
    
    protected void add(int value){
        pilha.setSeg(new Node(value, pilha.getSeg()));
    }
    
    protected void remove(){
        pilha.setSeg(pilha.getSeg().getSeg());
    }
    
    protected void esvaziar(){
        pilha.setSeg(null);
        
    }
    
    protected int getDado(){
        return pilha.getSeg().getDado();
    }
    
    protected Node getSeg(){
        return pilha.getSeg();
    }
    
    protected void setSeg(Node seg){
        pilha.setSeg(seg);
    }
    
    protected void print(){
        Node aux = pilha.getSeg();
        
        while(aux != null){
            System.out.print(aux.getDado() + " ");
            aux = aux.getSeg();
        }
    }
}

public class Queue extends Stack{
    private Stack p1 = new Stack();
    private Stack p2 = new Stack();
    
    private void enQueue(int value){        // custo 1
        p1.add(value);        // custo 1
    }
    
    private void swap(Stack p1, Stack p2){    // custo n de p1
        while(!p1.isEmpty()){    // custo relativo ao tamanho de p1
            p2.add(p1.getDado());        // custo 1
            p1.remove();        // custo 1
        }
    }
    
    private int deQueue(){        // custo 2n - 1
        swap(p1, p2);        // custo n
        int aux = p2.getDado();        // custo 1
        p2.remove();        // custo 1
        swap(p2, p1);    // custo n - 1
        
        return aux;        // custo 0
    }
    
    public static void main(String[] args){
        Queue f = new Queue();
        
        for(int i = 0; i < 3; i++){
            System.out.println("Enqueuing " + (i+1));
            f.enQueue(i+1);
        }
        
        System.out.println();
        
        for(int i = 0; i < 3; i++){
            System.out.println("Dequeuing " + f.deQueue());
        }
        
        f.esvaziar();
        System.gc();
    }
}
      
      
      
     
      
