Wrapper Classes
Java provides wrapper classes for each of the primitive types, allowing to use them as objects.

Below is a list of the corresponding wrapper classes:
char - Character
byte - Byte
short - Short
long - Long
int - Integer
float - Float
double - Double
boolean - Boolean

      But why use wrappers instead of primitive types? These are useful when:
       - you need to pass it as an argument to a method. 
       - you work with data structures, such as ArrayLists and Vectors. 
         These store only reference types (objects) and not primitive types.
       - you need to convert values to and from other primitive types, strings, 
         or convert  between number systems (decimal, octal, hexadecimal, binary).

      Also, the wrapper classes have some useful constants and methods, which allow easy conversion and manipulation.

      For example, let's define an Integer object and convert it into some primitive types 
      and a String using the wrapper class's methods:
public class Wrappers {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String args[]) {
        Integer a = 42;

        print("byte value: " + a.byteValue());
        print("double value: " + a.doubleValue());
        print("long value : " + a.longValue());
        print("String: " + a.toString());
   }
}

      The wrapper classes have some useful static methods.
      
public class Wrappers { 
   public static void main(String args[]) {
      String s = "965";
      Integer a = Integer.valueOf(s);
      System.out.print(a);
   }
}

      The names of wrapper classes always begin with a capital letter.
      
      
      
      
      
      
