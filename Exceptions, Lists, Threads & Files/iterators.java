Iterators
      An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
      Before you can access a collection through an iterator, you must obtain one. 
      Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. 
      By using this iterator object, you can access each element in the collection, one element at a time.

      The Iterator class provides the following methods:
      hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
      next(): Returns the next object and advances the iterator.
      remove(): Removes the last object that was returned by next from the collection.

      The Iterator class must be imported from the java.util package.
      Example:
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        Iterator<String> it = animals.iterator();
        String value = it.next();
        System.out.println(value);
    }
}     output: fox

      it.next() returns the first element in the list and then moves the iterator on to the next element.
      Each time you call it.next(), the iterator moves to the next element of the list.
      
      
      iterator and for loops are not much different. 
      if you implement "for" for complex objects (read collections), it inherently implements iterator only, 
      but the code becomes more readable and understandable by newbies also, 
      and yes, the lines of code (loc) increases. 
      these iterators and other functions/objects have been created in higher versions of Java just to make coding easier, 
      and may /not be having any change on performance.

      
      Here's polymorphic version: 
import java.util.Iterator; 
import java.util.LinkedList; 
import java.util.List; 

public class MyClass { 
    public static void main(String[ ] args) { 
    
    /* Create a new instance * of animals as LinkedList * 
    Use List on left hand * side so you can change * List implentation later * (e.g. to ArrayList) */ 
    
    List animals = new LinkedList<>(); 
    animals.add("fox"); 
    animals.add("cat"); 
    animals.add("dog"); 
    animals.add("rabbit"); 
    
    Iterator it = animals.iterator(); 
    while (it.hasNext()) { 
    System.out.println(it.next()); } } }
      
    
    What is the output of this code?
List<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
Iterator<Integer> it = list.iterator();
it.next();
System.out.println(it.next());


      Consider an iterator as an arrow that points to an object. 
      In the example shown, there are 3 objects: 10, 20 and 30. 
      So, when you declare the iterator, it would look something like this: ->10 20 30 It points to 10. 
      You advance to the next position using the next() method.(remember to surround it with if(it.hasNext()) , 
      otherwise an exception will be thrown when it reaches a null position). 
      In the code it is shown this: it.next(); 
      // returns 10 and points to 20 (10 ->20 30) 
      System.out.println(it.next()); 
      // returns 20 and points to 30 (10 20 ->30) 
      It will ONLY print the number 20 because it is passed by argument to the println method.
      
      
      The first it.next brings it to 10 Then it.next in the print statement brings it to 20. 
      Two times you call the method,so it result 20
      
      
      
      Typically, iterators are used in loops. At each iteration of the loop, you can access the corresponding list element.
      Example:
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);   
        }
    }
}
//output:
fox
cat
dog
rabbit
//

      Here, the while loop determines whether the iterator has additional elements, 
      prints the value of the element, and advances the iterator to the next.

      Also here the variable "value" is not necessary. 
      Following code do the same : 
      Iterator it = animals.iterator(); 
      while(it.hasNext()) { 
      System.out.println(it.next());
      
      
      it.hasNext method usually returns true or false based on the existence of another element.
      Therefore the while loop used is meant to verify the existence of another element,
      that is all its work.
      the rest is for the it.next() which advances itself to the next element automatically after it has been called.

      This is an implementation of iterator class using an interface 
      public interface Iterator { boolean hasNext(); String next(); } 
      private class Node{ String item; Node next; } 
      public Iteratoriterator(){return ( new ListIterator());} 
      private class ListIterator implements Iterator{ private Node courant= front; 
      public boolean hasNext(){return ( courant != null);} 
      public String next(){ String item = courant.item; 
      courant = courant.next; return(item); } }



      to iterate and print all of the items in the list of Integers.
Iterator <Integer> it = list.iterator();
while (it.hasNext()) {
  System.out.println(it.next());	
}
      Iterator is a class of type integer. We then create an empty () object of the class iterator. 
      We tell the program that while there is an answer available go ahead and print that next answer. 
      
      For those who still don't understand how iterations work, Here's an explanation to help you understand better. 
      First understand that classes and interfaces 
      like Iterator, Collections, ArrayList in themselves are Java made classes and interfaces (APIs) that 
      inherits or implements each other and are made public so they can be imported and used. 
      java Collections ArrayList, LinkedList implements the Iterator interface. 
      The Iterator contains the iterator() method. 
      Also it has the hasNext() method which is a boolean that checks if there is another data, 
      while next() method is what really does the work of moving to the next data. 
      hasNext() makes it safer to make a next() move and avoid exceptions. 
      All these are implemented by ArrayList and the likes so you can just freely use the functions. 
      Iterators are better when you need to make deletion while interating. 
      Iterator is also great to count the total number of words in a letter for instance. 
      
      Other ways... 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
import static java.lang.System.out;

public class MyClass {
    public static void main(String[] args) {
        // JDK10+
        //final var animals = new LinkedList<String>();
        
        // JDK6+
        final LinkedList<String> animals = new LinkedList<>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        /** Sort array before iterate */
        Collections.sort(animals);
        
        /** JDK5+ Iterate all collection */
        for (final Iterator<String> it = animals.iterator(); it.hasNext();) {
            out.println(it.next());
        }
        
        // or on JDK10+ Iterate all collection without the need of do class import
        for (final var it = animals.iterator(); it.hasNext();) {
            out.println(it.next());
        }
    }
}
//output:
cat
dog
fox
rabbit
cat
dog
fox
rabbit
//

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import static java.lang.System.out;

public class MyClass {
    public static void main(String[] args) {
        // JDK10+
        //final var animals = new LinkedList<String>();
        
        // JDK6+
        final LinkedList<String> animals = new LinkedList<>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        /** Sort array before iterate */
        Collections.sort(animals);
        
        /** JDK5+ Iterate all collection */
        for (final ListIterator<String> it = animals.listIterator(); it.hasNext();) {
            out.println(it.next());
        }
        
        // or on JDK10+ Iterate all collection without the need of do class import
        for (final var it = animals.listIterator(); it.hasNext();) {
            out.println(it.next());
        }
    }
}
//output:
cat
dog
fox
rabbit
cat
dog
fox
rabbit
//



import java.util.LinkedList;
import java.util.Collections;
import static java.lang.System.out;

public class MyClass {
    public static void main(String[] args) {
        // JDK10+
        //final var animals = new LinkedList<String>();
        
        // JDK6+
        final LinkedList<String> animals = new LinkedList<>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        /** Sort array before iterate */
        Collections.sort(animals);
        
        /** Iterate all collection */
        for (final String animal : animals) {
            out.println(animal);
        }
    }
}
//output:
cat
dog
fox
rabbit
//







      
      
