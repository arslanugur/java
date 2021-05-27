Sorting Lists
      For the manipulation of data in different collection types, 
      the Java API provides a Collections class, which is included in the java.util package.
      One of the most popular Collections class methods is sort(), 
      which sorts the elements of your collection type. 
      The methods in the Collections class are static, so you don't need a Collections object to call them.
      Example:
import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        
        Collections.sort(animals);
       
        System.out.println(animals);
    }
}       //output: [cat, dog, snake, tiger]

      As you can see, the elements have been sorted alphabetically.
      
      The sorting of ArrayList objects totally depends on Comparable or Comparator. 
      In this post, we will see the sorting an ArrayList. 
      To sort an ArrayList we have two ways: 
      1. ArrayList.sort(Comparator c) Suppose we have an ArrayList that stores some String objects. 
         To sort the ArrayList, We need to provide the reference of the Comparator object. 
         If you are a beginner then read the Comparator interface first. 
         The sort(Comparator c) method, sorts the Strings alphabetically in ascending order). 
      2. Collections.sort(Comparator c)By use of Collections.sort(Comparator c) we can sort the ArrayList. 
         Suppose we have an ArrayList of String we can sort it by Collections.sort() method. 
      For more details: https://javagoal.com/java-sort-arraylist
      
      
      What is the output of this code?
List<String> list = new ArrayList<String>();
list.add("b");
list.add("a");
list.add("c");
Collections.sort(list);
System.out.println(list.get(0));     //output: a
      
      
      You can call the sort() methods on different types of Lists, such as Integers.
import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);
        
        Collections.sort(nums);
        System.out.println(nums);
    }
}     //output: [1, 3, 36, 40, 73]


      Other useful methods in the Collections class:
      max(Collection c): Returns the maximum element in c as determined by natural ordering.
      min(Collection c): Returns the minimum element in c as determined by natural ordering.
      reverse(List list): Reverses the sequence in list.
      shuffle(List list): Shuffles (i.e., randomizes) the elements in list.


import java.util.ArrayList; 
import java.util.Collections;

public class MyClass { 
    public static void main(String[ ] args) { 
        ArrayList animals = new ArrayList(); String max, min; 
        animals.add("tiger"); 
        animals.add("cat"); 
        animals.add("snake"); 
        animals.add("dog"); 
        animals.add("-56"); 
        animals.add("3.14"); 
        animals.add("0"); 
        
        Collections.sort(animals); 
        System.out.println("The sorted list is: " + animals); 
        max = Collections.max(animals); 
        min = Collections.min(animals); 
        Collections.reverse(animals); 
        System.out.println("The reversed list is: " + animals); 
        Collections.shuffle(animals); 
        System.out.println("The shuffled list is: " + animals); 
        System.out.println("The maximum from the list is: " + max); 
        System.out.println("The minimum from the list is: " + min); } }



      Notice that the reverse method returns the opposite sequence of numbers, 
      independently from their actual values 
      public class MyClass { 
        public static void main(String[ ] args) { 
            ArrayList nums = new ArrayList(); 
            nums.add(3); 
            nums.add(36); 
            nums.add(73); 
            nums.add(40); 
            nums.add(1); 
            
            Collections.reverse(nums); 
            System.out.println(nums); } } 
            
            //outprints: 1,40,73,36,3 and not 73,40,36,3,1
            
            
      to add three items to the list, sort it,  and print 2.
List<Integer> list = new ArrayList<Integer>();
list.add(4);
list.add(2);
list.add(1);
Collections.sort(list);
System.out.println(list.get(1));


      
      
      
      
