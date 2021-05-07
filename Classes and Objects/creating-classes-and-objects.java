Creating Classes
      //In order to create your own custom objects, you must first create the corresponding classes. 
      //This is accomplished by right clicking on the src folder in Eclipse and selecting Create->New->Class. 
      //Give your class a name and click Finish to add the new class to your project:
  
      //As you can see, Eclipse has already added the initial code for the class.
      //Now lets create a simple method in our new class. Animal.java
public class Animal {
  void bark() {
    System.out.println("Woof-Woof");
  }
}

      //We declared a bark() method in our Animal class.
      
      //Now, in order to use the class and it's methods, we need to declare an object of that class.
      
      //to create a class with a single method called "test".
public class A {
  public void test() {
    System.out.println(''Hi'');
  }  
}



Creating Objects
      //Let's head over to our main and create a new object of our class. MyClass.java
public class Animal {
    void bark() {
        System.out.println("Woof-Woof");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Animal dog = new Animal();
        dog.bark();
    }
}       //output: Woof-Woof

      //Now, dog is an object of type Animal. Thus we can call its bark() method, using the name of the object and a dot.
      //The dot notation is used to access the object's attributes and methods.


      //to create an object of the A class in the B class and call its "test" method.
public class A {     //You're creating the class in the first line.
  public void test() {
    System.out.println("Hi");
  }	 
}
class B {
  public static void main(String args[ ]) {
    A obj = new A();     //Secondly, you're using your "Class A" to declare a new class A that you will need to used it late. 
    obj.test();
  }
}








