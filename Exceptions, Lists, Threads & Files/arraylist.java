ArrayList
      The Java API provides special classes to store and manipulate groups of objects.
      One such class is the ArrayList. 
      Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
      On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
      When objects are removed, the ArrayList may shrink in size. 
      Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.
      Create an ArrayList as you would any object.
import java.util.ArrayList;
//...
ArrayList colors = new ArrayList();

      You can optionally specify a capacity and type of objects the ArrayList will hold:
ArrayList<String> colors = new ArrayList<String>(10);

      The code above defines an ArrayList of Strings with 10 as its initial size.
      
      ArrayLists store objects. Thus, the type specified must be a class type. 
      You cannot pass, for example, int as the objects' type. 
      Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.
        
      1. Like Array, ArrayList also work based on an index. Each element stores in a particular position. 
      2. ArrayList can contain duplicate elements Because it stores each element at a particular position by use of the index. 
         So it doesn’t care whether the element is already present in ArrayList or not. 
      3. It maintains the order of insertion because each element is inserted on its index value. 
         For example: If you are adding any element in ArrayList in the First position (it means index value 0). 
         So, you can get it anywhere in the program by the use of index value 0, It doesn’t change automatically. 
      4. An ArrayList can contain any number of null values. In java, some collections are not allowed null like TreeSet. 
      5. By default, the ArrayList class is non synchronized. It means multiple threads can access it at same time. 
         We can make it synchronized by using the synchronized keyword or we can use CopyOnWriteArrayList for multithreading.
      
      https://javagoal.com/arraylist-in-java/

      to declare an ArrayList to hold 9 Integers.
ArrayList<Integer> ar = new ArrayList<Integer>(9);

      The ArrayList class provides a number of useful methods for manipulating its objects.
      The add() method adds new objects to the ArrayList. Conversely, the remove() method removes objects from the ArrayList.
      Example:
import java.util.ArrayList;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        
        System.out.println(colors);
    }
}

//output: [Red, Blue, Orange]

      Other useful methods include the following:
      - contains(): Returns true if the list contains the specified element
      - get(int index): Returns the element at the specified position in the list
      - size(): Returns the number of elements in the list
      - clear(): Removes all of the elements from the list

      Note: As with arrays, the indexing starts with 0.
        
        
      For loop through the list. Use the if statement to print the color Blue.
import java.util.ArrayList; 

  public class MyClass { 
    public static void main(String[ ] args) { 
      ArrayList colors = new ArrayList(); 
      colors.add("Red"); 
      colors.add("Blue"); 
      colors.add("Green"); 
      colors.add("Orange"); 
      colors.remove("Green"); 
      
      System.out.println(colors); 
      
      for (String s : colors){ 
        if (s == "Blue"){ 
          System.out.println(s); } } } }

  
      Arraylists are kind of like arrays, to where, like with an array, you hold references to several values. 
      But, arraylists aren't as immutable as arrays. 
      For example, if you have: int[] arr = new int[5, 2, 3, 4, 7]; 
      If you remove a value from that array, that space is filled with a null (in this case, since it's an int, the null is 0). 
      Therefore, it looks like this: [5, 2, 3, 0, 7] With an arraylist, it isn't like that. 
      The value are automatically shifted when you remove something. 
      Therefore, it's: [5, 2, 3, 7] Not to mention, you can add as many values to an Arraylist as you want. 
      For an array, you can only add as many values as you originally specified as the physical size when creating the array.
      
      https://www.hackerrank.com/challenges/java-list/problem
                                                                               
      What is the output of this code?
ArrayList<String> list = new ArrayList<String>();
list.add("A");
list.add("B");      //output: B
list.add("C");
System.out.println(list.get(1));

      Arrays start in 0, so 1 will be B
      Both arrays and collections, have zero-based index implementation
      




