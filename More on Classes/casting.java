Type Casting
      Assigning a value of one type to a variable of another type is known as Type Casting.

      To cast a value to a specific type, place the type in parentheses and position it in front of the value.
      Example:
public class Program {
    public static void main(String[] args) {
        int a = (int) 3.14;
        System.out.println(a);
    }
}  //output: 3

      The code above is casting the value 3.14 to an integer, with 3 as the resulting value.
      Another example:
public class Program {
    public static void main(String[] args) {
        double a = 42.571;
        int b = (int) a;
        System.out.println(b);
    }
}     //output: 42

      Java supports automatic type casting of integers to floating points, since there is no loss of precision.
      On the other hand, type casting is mandatory when assigning floating point values to integer variables.
      
      
      What is the output of this code?
public static void main(String[ ] args) {	
  double x = 1.5;
  double y = 2.65;
  sum((int)x, (int)y);
}
static void sum(int x, int y) {
   System.out.println(x + y);
}


first convert all double data become integer data. 
  then sum it value. double x = 1.5 double y = 2.65 become int x = 1 int y = 2 function = x + y output result = 3
  
  
  
  sum((int)x + (int)y) will extract and sum only the int values of 1.xx and 2.xx if sum (int) (x+y), would it sum and THEN extract the int 4?
  
  
  
  
  
whenever you assign a smaller data type variable to a larger data type variable, 
the conversion is always implicit 
and the other way round is either explicit (done by user) or implicit(done by compiler)with compiler warning shown. 
So if you have int i = 100; long l = i; 
// implicit conversion since size of long is 8 bytes and size of int is 4 bytes if you write i = l; 
the compiler may do the conversion for you 
and a good compiler will issue a warning "conversion from long to int" or something similar or user should write i =(int)l; 
// explicit conversion Remember in either case if the value of variable l falls with in the minimum and maximum value of int your program will work correctly otherwise it will not give you the desired results.






