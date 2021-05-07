Methods
      //Methods define behavior. 
      //A method is a collection of statements that are grouped together to perform an operation. 
      //System.out.println() is an example of a method.
      //You can define your own methods to perform your desired tasks.
      
      //Let's consider the following code:
class MyClass {

    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[ ] args) {
        sayHello();
    }

}

      //The code above declares a method called "sayHello", which prints a text, and then gets called in main.
      //To call a method, type its name and then follow the name with a set of parentheses.
      
Calling Methods
      //You can call a method as many times as necessary.
      //When a method runs, the code jumps down to where the method is defined, executes the code inside of it, 
      //then goes back and proceeds to the next line.

      //Example:
class MyClass {

    static void Callingx3() {
        System.out.println("Calling!");
    }

    public static void main(String[ ] args) {
        Callingx3();
        Callingx3();
        Callingx3();
    }

}
      //In cases like the one above, where the same thing is repeated over and over, you can achieve the same result using loops (while or for).
      

Method Parameters
      //You can also create a method that takes some data, called parameters, along with it when you call it. 
      //Write parameters within the method's parentheses.
      //For example, we can modify our sayHello() method to take and output a String parameter.
class MyClass {
  
    static void sayHey(String name) {
        System.out.println("Hey Hey, " + name);
    }

    public static void main(String[ ] args) {
        sayHey("Neil Young");
        sayHey("Young Neil");
    }

}

      //The method above takes a String called name as a parameter, which is used in the method's body. 
      //Then, when calling the method, we pass the parameter's value inside the parentheses.
      //Methods can take multiple, comma-separated parameters.
      
      //The advantages of using methods instead of simple statements include the following:
      //- code reuse: You can write a method once, and use it multiple times, without having to rewrite the code each time.
      //- parameters: Based on the parameters passed in, methods can perform various actions.


      //What output results from this code?
public static void main(String[ ] args) {
   doSomething(4);
}	 
static void doSomething(int x) {
   System.out.println(x*x); 
}       //output: 16



