throw
      The throw keyword allows you to manually generate exceptions from your methods. 
      Some of the numerous available exception types include the IndexOutOfBoundsException, 
                                    IllegalArgumentException, ArithmeticException, and so on.
      For example, we can throw an ArithmeticException in our method when the parameter is 0.
public class Program {

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }

}      

/*output:
Exception in thread "main" java.lang.ArithmeticException: Division by Zero
	at Program.div(Program.java:6)
	at Program.main(Program.java:13)*/

     The throws statement in the method definition defines the type of Exception(s) the method can throw.
     Next, the throw keyword throws the corresponding exception, along with a custom message.
     If we call the div method with the second parameter equal to 0, 
     it will throw an ArithmeticException with the message "Division by Zero".
      
     Multiple exceptions can be defined in the throws statement using a comma-separated list.
        
     Here throws throw keywords are not used same as try and catch... 
     When we write something illogical in our code like declaring an array of 2 elements 
     and asking the program to print element 5 which is not present. 
     Then the console window says error with exception array out of bounds ...something like that. 
     So, throws and throw keywords are used to throw messages by the user instead of compiler. 
     Like when we create classes 
     and when somebody uses our classes in a wrong way then the compiler shows error without any message .... 
     So throws throw keywords are used to say what the errors are to the programmers who r using our classes.

       
     to create a method that throws an IOException if the parameter is negative.
public void do(int x)
  throws IOException {
  if(x<0)
  {
  throw new IOException();
  }
}  
       
Exception Handling


A single try block can contain multiple catch blocks that handle different exceptions separately.
Example:
try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
}Exception Handling


      A single try block can contain multiple catch blocks that handle different exceptions separately.
      Example:
try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
}

      All catch blocks should be ordered from most specific to most general.
      Following the specific exceptions, 
      you can use the Exception type to handle all other exceptions as the last catch.

      How many catch blocks can a try/catch block contain?
      --As many as u need
      
      
      
      

        
