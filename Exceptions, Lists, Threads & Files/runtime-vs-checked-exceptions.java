Types of Exceptions
      There are two exception types, checked and unchecked (also called runtime). 
      The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.
      
      As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException. This is an example of a checked exception. 
      Your code will not compile until you've handled the exception.
public class MyClass {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //some code
    }
  }
}

      We have seen examples of unchecked exceptions, which are checked at runtime, in previous lessons.
      Example (when attempting to divide by 0):
public class MyClass {
    public static void main(String[ ] args) {
        int value = 7;
        value = value / 0;
    }
}
/*output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at MyClass.main(MyClass.java:5)
*/  

      It is good to know the Types of Exceptions because they can help you debug your code faster.
        
      All runtime exceptions are unchecked exceptions.
      Unchecked exceptions:
      represent defects in the program(bugs), often invalid arguments passed to a non-private method.
      you don't need to establish a policy for them. 
      Checked exceptions:
      represent invalid conditions in areas 
      outside the immediate control of the program, often invalid user input, database problems, network, absent files.
      you must establish a policy for them by a try/catch block.  
      
      If not handled, which exception types prevent your program from compiling? --> Checked
      
      
        
        
        
