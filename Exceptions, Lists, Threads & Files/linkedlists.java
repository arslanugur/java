LinkedList
      The LinkedList is very similar in syntax to the ArrayList.
      You can easily change an ArrayList to a LinkedList by changing the object type.
import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
    }
}     //output: [Red, Blue, Orange]

      You cannot specify an initial capacity for the LinkedList.
      
      Array size can be changed in Arraylist during runtime and each element is stored in sequence memory location. 
      Linked list is a data structure where size cannot be initialized and each node is linked to other node. 
      Node consists of data and address of next node. These are stored at random memory locations.  
        
      1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList compared to ArrayList(O(n)). 
      Hence if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice. 
      2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) 
      so If there are less add and remove operations and more search operations requirement, ArrayList would be your best bet.
        
      https://javagoal.com/java-linkedlist/
      
      to create a LinkedList, add "Hey", and print it.
LinkedList <String> list = 
      new LinkedList <String>();
list.add("Hey");
System.out.println(list.get(0));

      LinkedList "Hey" 0 You create a LinkedList with the type in it. 
      The new LinkedList has an undefined number of elements in it (). 
      You add a new String element called "Hey" to the list. 
      You get and then print out the list's index item #0 which is "Hey".
      
      don't forget the 'get()' method. 'get()' method function is to get the index of element which is started with 0.
      
      You need to create a new linked list initially, 
      therefore, you'd need to create: LinkedList name = new LinkedList(); 
      You don't need to type the date type again in the second angle brackets, however. 
      Ever since Java 7, you can just type something like this: LinkedList string = new LinkedList<>(); 
      Then you just add a new value by calling your linked list 
      and using the .add method. name.add(Put what you want to add into linked list here); 
      And, of course, if you want to retrieve the value, do the same as above, 
      but, instead, with the .get method to "get" a value. It's about the same principle as Arraylists.


LinkedList vs. ArrayList
      The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
      The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
      The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

      In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. 
      It's called a LinkedList because each element contains a link to the neighboring element.
      
      12 | node--->  99 | node--->  37 | node---> x
      
      You can use the enhanced for loop to iterate over its elements.
import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        
        for(String s: c) {
            System.out.println(s);
        }
    }
}
//output:
Red
Blue
Orange
//
      
      Summary:
      - Use an ArrayList when you need rapid access to your data.
      - Use a LinkedList when you need to make a large number of inserts and/or deletes.

      Search: ArrayList search operation is pretty fast compared to the LinkedList search operation. 
      get(int index) in ArrayList gives the performance of O(1) while LinkedList performance is O(n). 
      Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly 
      which makes it faster for searching an element in the list. 
      On the other side LinkedList implements doubly linked list which requires the traversal through all the elements for searching an element. 
      Deletion: LinkedList remove operation gives O(1) performance 
      while ArrayList gives variable performance: O(n) in worst case (while removing first element) 
      and O(1) in best case (While removing last element). 
      Conclusion: LinkedList element deletion is faster compared to ArrayList. 
      Reason: LinkedList’s each element maintains two pointers (addresses) which points to the both neighbor elements in the list. 
      Hence removal only requires change in the pointer location in the two neighbor nodes (elements) of the node which is

      
      In an ArrayList, deletion has a "ripple" effect, every element will be moved one by one, which can be really slow. 
      In a LinkedList, we don't use Indexes, so the ripple effect doesn't need to happen, and doesn't. 
      Each element knows which element comes after.
      
      
      For a program with large numbers of inserts and deletes, it is better to use the LinkedList
      
      1) AL can be initialized. LL can not. 
      2) AL is easy for insert and search. LL is good for data manipulation. 
      3) AL stores in indexed way. LL uses links to next element. Everything else same.
      
      Think about the arrayList like this: 0: “Lama” 1: “Panda” 2: “Cat” 3: “Dog” 
      And a linkedList like this: BEGINNING—> “Lama”—> “Panda”—> “Cat”—> “Dog”—>END 
      So let’s say both contain all animals in the world. (A lot!) 
      If we want to ‘access’ an certain animal, with the ArrayList we can just type the indexnumber of the animal and it pops up. 
      With the LinkedList, it would need to go through the entire list until the animal we want access to, is found. 
      But if we want to ‘delete’ an animal or add because it goes extinct or a new animal is found. 
      With the ArrayList, let’s say we want to delete index 1: “Panda”. 
      All the other animals after it, so number 2, 3 etc.. must all shift one place up. 
      So “Cat” on 2, must go to 1, and “Dog” on 3, must go to 2. Etc for all the other animals. 
      (This takes quite some cpu/ram power). 
      With the LinkedList, 
      it will just need to delete the (item/node) “Panda” and it will need to divert the link from the previous item “Lama” to “Cat”. 
      But no other shifting is needed!


