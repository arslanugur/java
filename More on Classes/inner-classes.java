Inner Classes
    /*Java supports nesting classes; a class can be a member of another class.
      Creating an inner class is quite simple. Just write a class within a class. 
      Unlike a class, an inner class can be private. 
      Once you declare an inner class private, it cannot be accessed from an object outside the class.*/

      Example:
class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }
}      //output: 1 is thinking

      The class Robot has an inner class Brain. 
      The inner class can access all of the member variables and methods of its outer class, but it cannot be accessed from any outside class.
      
      
      the code to have an inner class Hand, which has a method called "shake" that prints "Hi".
public class Person {
class Hand {
    public void shake() {
    System.out.println("Hi"); }
}}

      logical process:
      1. Theres a general class called "Person". Which means that its a person with no details. 
      2. What "Person" does? He gives "hand", Now you make the inner class. Now, the inner class is a class that is ruled by another class. 
      In this case, your hand wont just move by itself right? 
      Theres a person that when he wills to move the hand it just moves. 
      That makes "hand" an inner class of "Person". 
      3. Now you make a method that returns nothing and can be accessed from other codes. In this case, "shake". 
      4. Now you describe what "shake" is supposed to do. 
      5. close the code! 
      
      
        
