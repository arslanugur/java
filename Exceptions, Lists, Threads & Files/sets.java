Sets
      A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
      One of the implementations of the Set is the HashSet class.
      Example:
import java.util.HashSet;

public class MyClass {
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }
}
//output: [A, B, C]

      You can use the size() method to get the number of elements in the HashSet.
      
      Examples:
import java.util.HashSet; 

public class MyClass { 
      public static void main(String[ ] args) { 
      HashSet set = new HashSet(); 
      set.add("d"); 
      set.add("D"); 
      set.add("a"); 
      set.add("B");  //'b' added after 'B' 
      set.add("A");  //'a' added before 'A' 
      set.add("b"); 
      System.out.println(set); } }
      
      //output contains alphabetic order of small, capital 
      //output: [a, A, B, b, d, D]
      
      
//TreeSet - Simple
import java.util.Set;
import java.util.TreeSet;

public class MyClass {
	public static void main(String[ ] args) {
		Set<String> set = new TreeSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
	}
}   //output: [A, B, C]


//TreeSet - Explained
import java.util.Set;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args) {
	   /*  instead of
		*  "TreeSet<String> alphabets
		*  = new TreeSet<>();"
		*  we use the interface "Set"
		*  on the left hand side
		*  so we can change
		*  our implementation of
		*  "Set" in the future.
		*/
		
	   /*  create a new instance
		*  of a TreeSet.
		*  Set is used instead of List 
		*  since the set of alphabets 
		*  contains no duplicates.
		*  TreeSet is used due to
		*  alphabetical ordering
		*/
		
	   Set<String> alphabets = new TreeSet<>();

	   // add letters to the TreeSet
	   alphabets.add("A");
	   alphabets.add("B");
	   alphabets.add("C");
	   
	   // print alphabets using forEach
	   alphabets
	   .forEach(System.out::println);
	}	
}
//output:
A
B
C
//

      1. HashSet can’t contain duplicate objects because it implements Set interface that enforces the rule, the object must be unique. 
      2. A HashSet doesn’t maintain any order of elements. 
         The order of objects does not depend on the insertion because each object inserted based on hashCode. 
         You can’t find the position of element in HashSet. 
      3. HashSet can contain only one null value. 
      4. HashSet is not synchronized. 
      5. HashSet internally uses HashMap and HashTable. We will discuss it in detail. 
      6. The initial default capacity of HashSet is 16, and the load factor is 0.75. 
      7. The iterator return by HashSet class is fail-fast. 
         It means we can’t modify HashSet after the creation of iterator. 
         If we try to modify it, It will throw ConcurrentModificationException. 
      8. HashSet increases the capacity itself when we insert elements like ArrayList. 
         
         For more details: https://javagoal.com/hashset-in-java/


      What is the output of this code?
import java.util.HashSet;
class A {
   public static void main(String[ ] args) {
   HashSet<String> set = new HashSet<String>();
   set.add("A");
   set.add("B");	
   set.add("C");
   System.out.println(set.size());
   }
}     //output: 3


      So unlike the index which starts at zero when counting here you start counting the sets from 1 e.g 
      >>set 1 is 1 >>set 2 is 2 >>set 3 is 3 they are asking you just to count them. 
      if you go back to the sets playground the output is Output:[A,B,C] right? 
      but if you edit System.out.printIn(set); to this System.out.printIn(set.size()); 
      exactly as it is in the question your out put will be Output:3 



LinkedHashSet
      The HashSet class does not automatically retain the order of the elements as they're added. 
      To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.

      What is hashing?
      A hash table stores information through a mechanism called hashing, 
      in which a key's informational content is used to determine a unique value called a hash code.
      
      So, basically, each element in the HashSet is associated with its unique hash code.
      
      You've learned about the various collection types that are available in Java, including Lists, Maps, and Sets. 
      The choice of which one to use is specific to the data you need to store and manipulate.

      It's also important to add that the importance of actually hashing an entry 
      allows elements of a HashMap to be accessed, inserted and deleted in constant time ( O(1) ). 
      This is because no search is required; 
      you can jump straight to the desired index and perform the action 
      (assuming the hash function doesn't return duplicate values for different entries - then it is slightly different).

      Both LinkedHashSet and HashSet are filled with unique elements. 
      But elements in HashSet don't have any order while elements of LinkedHashSet are put in the same order that you have added them.
      
      The idea is that it generates a number based on the data values, 
                  apply modulo the size of the reserved memory area and that number is used as an index to directly access the memory address. 
      That's also why order sametimes is not preserved in some collections. 
      There will be cases where different values generate the same memory address, 
      but they will be only a few of them and searching through such short list is not a big issue.
      
      Set contains only unique values
      HashSet does not retain order
         

