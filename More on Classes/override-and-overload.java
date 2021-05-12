Method Overriding
      //A subclass can define a behavior that's specific to the subclass type, 
      //meaning that a subclass can implement a parent class method based on its requirement.
      //This feature is known as method overriding.

      //Example:
class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}       //Output: Meow      


      //In the code above, the Cat class overrides the makeSound() method of its superclass Animal.

/*
Rules for Method Overriding:
- Should have the same return type and arguments
- The access level cannot be more restrictive than the overridden method's access level (Example: If the superclass method is declared public, the overriding method in the sub class can be neither private nor protected)
- A method declared final or static cannot be overridden
- If a method cannot be inherited, it cannot be overridden
- Constructors cannot be overridden
*/

//Method overriding is also known as runtime polymorphism.

//Overridden methods should have the same return type and arguments as the parent method. --> TRUE


Method Overloading
      //When methods have the same name, but different parameters, it is known as method overloading.
      //This can be very useful when you need the same method functionality for different types of parameters.
      //The following example illustrates a method that returns the maximum of its two parameters.
int max(int a, int b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}

      //The method shown above will only work for parameters of type integer.
      //However, we might want to use it for doubles, as well. For that, you need to overload the max method:
class Program {
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {        
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}    //output: 17, 7.68

      //Now, our max method will also work with doubles.
      //An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.

      //Another name for method overloading is compile-time polymorphism.


      //What is the output of this code?
class A {
   public void doSomething() {
     System.out.println("A");
   }
   public void doSomething(String str) {
     System.out.println(str);
   }
}
class B {
   public static void main(String[ ] args) {
   A object = new A();
   object.doSomething("B");
   }
}       //output: B



/*At first I thought the answer was AB because main directs you 
to run through the first do() function which prints A and then you run through the second do(String str) which prints B. 
However, the answer is B because when the A object constructor is called it does not call the do() function that prints A. 
The only thing that happens in main is it calls the do(String str) function and passes it the string "B". So only B is printed. 
Don't know if that helps anyone - this was just my own problem that I figured out, 
basically when you make a constructor for an object it does not run all the void functions within that class.*/
  

