     // Arrays and Lists store elements as ordered collections, with each element given an integer index.
     // HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
     // The put, remove, and get methods are used to add, delete, and access values in the HashMap.
      
     // Hashmap in Java is almost like a combination of dictionaries and sets in Python. 
     // HashMap uses (key, value) pairs like dictionaries, and they can’t have duplicate values like sets.
     // Except the fact that Python don't need data Type to be specified.
      
     // Example:
import java.util.HashMap;

public class MyClass {
    public static void main(String[ ] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave")); 
    }
}     //output: 42

     // We have created a HashMap with Strings as its keys and Integers as its values.
      
     // Use the get method and the corresponding key to access the HashMap elements.

import java.util.HashMaps; 

public class MyClass{ 
    public static void main(String[]args) {
        HashMapsPoints=new HashMaps(); 
        points.put("Kenya",+254); 
        points.put("Tanzania",+255); 
        points.put("Somalia",+252); 
        points.put("India",+91); 
        points.put("Saudi Arabia",+996); 
        System.Out.println(points.get("Kenya"); }} //Output +254

      // You can use HashMap to list countries and their capitals. So by calling a country we will get its capital city.

      // What is the output of this code?
import java.util.HashMap;
class A {	
   public static void main(String[ ] args) {
   HashMap<String, String> m = new HashMap<String, String>();
   m.put("A", "First");
   m.put("B", "Second");
   m.put("C", "Third");
   System.out.println(m.get("B"));
   }
} //output: Second

      // Remember: ArrayList and LinkedList have constant index keys starting from 0. 
               // You can simply manipulate the key with HashMaps. Remember the get(int index) method. 
               // So you can set your own key for the index. 
               // You can set only 1 key per index !


      // A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
      // The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
      // If you try to get a value that is not present in your map, it returns the value of null.

      // null is a special type that represents the absence of a value.

import java.util.HashMap; 

public class MyClass { 
      public static void main(String[ ] args) { HashMap 
      points = new HashMap(); 
      points.put("Amy", 154); 
      points.put("Dave", 42); 
      points.put("Dave", 733); } }
      
      // Dave is the containskey which leads to the containsvalue, if we have duplicated key "dave" dave will only show the second value 733
      // because the first value 42 is overwrited 
      /* System.out.println(points.get("Dave")); 
      output 733 
      System.out.println(points.get("Rane")); 
      output null 
      because this key is not presented in the map */


      // MultiKey is a class for creating HashMaps with multiple keys
import java.util.*;
public class Program
{
    public static void main(String[] args) {
        HashMap <MultiKey, Object> map = new HashMap();
        map.put(new MultiKey(5, 'c', "Hi"), "It");
        map.put (new MultiKey(2, "$", "Hi"), "works!");
        System.out.println(map.get(new MultiKey  ('c', 5, "Hi")));
        System.out.println(map.get(new MultiKey("$", "Hi", 2)));
        
      //  System.out.println(new MultiKey("@!1", "32", "Hi"));
    }
}
import java.util.*;
public class MultiKey{
    
    private ArrayList<Object> keys = new ArrayList();
    
    public MultiKey(Object... keysX){
        for (Object o : keysX){
            keys.add (o);
        }
    }
    
     @Override
    public boolean equals(Object obj){
       if(this==obj || obj == null)return false;
       return true;
    }
    public int hashCode (){
        int h = 1;
        for (Object o : keys){
            h *= o.hashCode() + 4;
        }
        return h;
    }
    public String toString(){
        String s = "DoubleKey:";
        for(Object o : keys){
           if (keys.indexOf (o) == keys.size () - 1){
               s += o;
               break;
           }
           s += o + ", ";
        }
        return s;
    }
    public Object [] getKeys(){
        return keys.toArray ();
    }
    public void setKeys (Object... keys){
        this.keys.clear ();
        for (Object o : keys){
            this.keys.add (o);
        }
    }
}
//output: It Works!

      // to declare a HashMap, add two items, and print one of them.
HashMap<String, String> m = 
    new HashMap<String, String>();
m.put("A", "First");
m.put("B", "Second");
System.out.println(m.get("B"));


      // Keys can be defined as character:
import java.util.HashMap;

public class MyClass {
    public static void main(String[ ] args) {
        HashMap<Character, Integer> points = new HashMap<Character, Integer>();
        points.put('A', 154);
        points.put('D', 42);
        points.put('R', 733);
        System.out.println(points.get('D')); 
    }
}  //output: 42




