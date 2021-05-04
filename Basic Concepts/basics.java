//Every program in Java must have a class.
//Every Java program starts from the main method.
/*  To run our program, the main method must be identical to this signature */

class MyClass {
    public static void main(String[ ] args) {
        System.out.println("Hello World");
    }
}

/**
In Java, every line of code that can actually run needs to be inside a class.
In our example, we named the class MyClass. You will learn more about classes in the upcoming modules.

In Java, each application has an entry point, or a starting point, which is a method called main. 
Along with main, the keywords public and static will also be explained later.

- public: anyone can access it
- static: method can be run without creating an instance of the class containing the main method
- void: method doesn't return any value
- main: the name of the method

For example, the following code declares a method called test, which does not return anything and has no parameters:
void test()
void hello()

The method's parameters are declared inside the parentheses that follow the name of the method.
For main, it's an array of strings called args. 

The println method prints a line of text to the screen.
The System class and its out stream are used to access the println method.
  
In classes, methods, and other flow-control structures code is always enclosed in curly braces { }.
Do not use semicolons after method and class declarations that follow with the body defined using the curly braces.
In Java, each code statement must end with a semicolon.
*/

