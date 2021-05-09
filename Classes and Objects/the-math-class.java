The Math Class
      //The JDK defines a number of useful classes, one of them being the Math class, 
      //which provides predefined methods for mathematical operations.
      //You do not need to create an object of the Math class to use it. To access it, just type in Math. and the corresponding method.
      
      //Math.abs() returns the absolute value of its parameter.
public class Program {
    public static void main(String[] args) {
        int a = Math.abs(10); 
        System.out.println(a);
        
        int b = Math.abs(-20);
        System.out.println(b);
    }
}  //output: 10 20

      //Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double
public class Program {
    public static void main(String[] args) {
        double c = Math.ceil(7.342);
        System.out.println(c);
    }
}     //output: 8.0

      //Similarly, Math.floor() rounds a floating point value down to the nearest integer value.
public class Program {
    public static void main(String[] args) {
        double f = Math.floor(7.343);
        System.out.println(f);
    }
}       //output: 7.0


      //Math.max() returns the largest of its parameters.
public class Program {
    public static void main(String[] args) {
        int m = Math.max(10, 20);
        System.out.println(m);
    }
}     //output: 20

      //Conversely, Math.min() returns the smallest parameter.
public class Program {
    public static void main(String[] args) {
        int m = Math.min(10, 20);
        System.out.println(m);
    }
}     //output: 10


      //Math.pow() takes two parameters and returns the first parameter raised to the power of the second parameter.
public class Program {
    public static void main(String[] args) {
        double p = Math.pow(2, 3);
        System.out.println(p);
    }
}     //8.0


      //There are a number of other methods available in the Math class, 
      //including: sqrt() for square root, sin() for sine, cos() for cosine, and others.


      //What is the value of the following expression?
Math.abs(Math.min(-6, 3));  //output: 6      it's a function in a function. 
      //There are 2 things to do here: 
      //Firstly, solve Math.min(-6, 3) 
      //This means find the minimum of the two integer, which is -6. 
      //Secondly, solve Math.abs(-6), which is 6. 
      //Therefore the answer is 6.





      
