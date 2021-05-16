Abstraction
      Data abstraction provides the outside world with only essential information, 
      in a process of representing essential features without including implementation details.
      A good real-world example is a book. When you hear the term book, 
      you don't know the exact specifics, such as the page count, the color, or the size, 
      but you understand the idea, or abstraction, of a book.
      The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

      In Java, abstraction is achieved using abstract classes and interfaces.
      An abstract class is defined using the abstract keyword.
      - If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
      - To use an abstract class, you have to inherit it from another class.
      - Any class that contains an abstract method should be defined as abstract.
      An abstract method is a method that is declared without an implementation 
      (without braces, and followed by a semicolon): abstract void walk();


      A class containing an abstract method is an abstract class. ---> true
  
  
Abstract Class
      For example, we can define our Animal class as abstract:
abstract class Animal {
  int legs = 0;
  abstract void makeSound();
}

      The makeSound method is also abstract, as it has no implementation in the superclass.
      We can inherit from the Animal class and define the makeSound() method for the subclass:
abstract class Animal {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

      Every Animal makes a sound, but each has a different way to do it. That's why we define an abstract class Animal, and leave the implementation of how they make sounds to the subclasses.
      This is used when there is no meaningful definition for the method in the superclass.
  
  
      to create an abstract class with an abstract method and inherit from it.
abstract class Animal {
  public int age;
  public  int printAge();
}
class Dog Animal {
  public  printAge() {
    return age;
  }	
}  
  
  
  
  
  
