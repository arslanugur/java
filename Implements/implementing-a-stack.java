Stack in Java
      Let's implement a stack structure using a linked list.
      Remember, each node of a linked list stores the address of the next node.

      //To implement a stack, we first need to define the Node class:
class Node {
  int value;
  Node next;
    
  public Node(int value) {
    this.value = value;
  }
}

      //Each node holds a value and the next pointer.
      //Now, we can implement the Stack class with it's corresponding push, pop and print methods:
public class Stack {
    
    static class Node {
        int value;
        Node next;
    
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first = null;

    public void push(Node node) {
        node.next = first;
        first = node;
    }

    public void pop() {
        first = first.next;
    }
    
  public void print() {
      Node node = first;
    while(node != null) {
        System.out.println("|"+node.value+"|");
        node = node.next;
    }
  }

    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(new Node(1));
        s.push(new Node(2));
        s.push(new Node(4));
        s.push(new Node(8));

        s.print();
    }
}

      //I think the pop() should return a node.
      
      //Stack Example with and without inbuilt interface:
/*
STACK data structure
-All Method
-oop based
-dynamic approach
-easily understand
-stack with inbuilt interface method
-stack without inbuilt method
*/

//stack using user defined class and method
import java.util.Stack;
public class Node
{
   Node top,next;
   int data;
   public Node()
   {
       
   }
   public Node(int data)  
   {
       this.data=data;
   }
   
   public void push(int data)
   {
     Node n1=new Node(data);
     n1.next=top;
     top=n1;
     
   }
   public int peek()
   {
       return top.data;
   }
   public int pop()
   {
   if(top==null)
   {
       return -1;
   }
      int data=top.data;
      top=top.next;
      return data;
   }
   public boolean isempty()
   {
       return top==null;
   }
public static void main(String args[])
{
Node n1=new Node();
int i=1;

System.out.println("--------------------------------------");
    System.out.println("stack data structure using dynamic approach with class and object & user defined method\n");

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty


while(i<=10)
{
  n1.push(i);//insert data into stack in LIFO manner
  i++; 
  System.out.println("Stack push: "+n1.peek());
}


System.out.println("\nStack peek opr: "+n1.peek());
//return the top element from stack

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty

int data=0;
while((data=n1.pop())!=-1)
{
    System.out.println("Stack pop: "+data);
}

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty


System.out.println("--------------------------------------\n\n");



//stack using inbuilt java library

System.out.println("--------------------------------------");
    System.out.println("stack data structure using java inbuilt interface method");
        Stack s1=new Stack();
        System.out.println("is stack empty: "+s1.isEmpty());
     //  System.out.println(s1);
        i=0;
        while(i<=10)
        {
        s1.push(i);
        System.out.println("stack push: "+i);
        System.out.println(s1+"\n");
        i++; 
        }
        System.out.println("\nis stack empty: "+s1.isEmpty());
        System.out.println("\nTop of stack is: "+s1.peek());
        
        
        while(!(s1.isEmpty()))
        {
            System.out.println("Stack pop: "+s1.pop());
            System.out.println(s1+"\n");
        }
        
        System.out.println("is stack empty: "+s1.isEmpty());
        System.out.println("--------------------------------------");

System.out.println("\n\n\t\t\t\t\tThank you!!\n\t\t\t\t\tAsif Bilakhiya");

}
}


      //Stack Example:
public class Stack {
    
    static class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node first = null;
    
    public void push(Node node) {
        node.next = first;
        first = node;
    }
    
    public void pop() {
        first = first.next;
    }
    
    public void print() {
        Node node = first;
        while(node != null) {
            System.out.println("|"+node.value+"|");
            node = node.next;
        }
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        
        s.push(new Node(2));
        s.push(new Node(6));
        s.push(new Node(5));
        s.push(new Node(4));
        
        s.print();
    }
}



      //Stack User Input:
import java.util.Scanner;

public class Stack {
    
    static class Node {
        
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node first = null;
    
    public void push(Node node) {
        node.next = first;
        first = node;
    }
    
    public void pop() {
        first = first.next;
    }
    
    public void print() {
        Node node = first;
        while(node != null) {
            System.out.println("|"+node.value+"|");
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Stack s = new Stack();
        
        s.push(new Node(c.nextInt()));
        s.push(new Node(c.nextInt()));
        s.push(new Node(c.nextInt()));
        s.push(new Node(c.nextInt()));
        
        s.print();
    }
}
