      //to define a method that does not return a value.
public void calc()
      //void is a keyword that is used when you don't want to return anything


      //Which access modifier explicitly says 
      //that a method or variable of an object can be accessed by code from outside of the class of that object?  --> public
"default" access in Java is "package-private", meaning that everything in the same package can access the attribute/method. 
So basically this should also be correct! Even "protected" (the missing level of accessibility) would the correct, 
even though it is not in the set of possible answers - it means "accessible from the same class and from all is subclasses", 
which is obviously more than "the same class".
  
      //to declare a method returning the greater of the two arguments.
public int max(int a, int b) {
  if (a > b) {
    return a; }
    return b;
}

      //to declare a method that takes one argument of type int.
public int myFunc(int x) {
  return x*10; 
} 

      //to create a method that returns the minimum of the two parameters.
public int minFunc(int n1, int n2 ) { 
  int min; 
  if (n1 > n2) 
    min = n2 ; 
  else 
    min = n1;
     return min; }


    //to create a class with a method called "myFunc" that takes no parameters, returns void, and prints "Hi" to the screen.
public class MyClass{
   public void myFunc() {
    System.out.println(''Hi'');
   }
}

