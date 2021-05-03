int sum1 = 50 + 10; 
int sum2 = sum1 + 66; 
int sum3 = sum2 + sum2;

//

int x = 2; int y = 4;

int result = x + y;
    System.out.println(result);

//

int x = 15; int y = 4;
int result = x / y;
    System.out.println(result);    //output: 3

//You can use double to retrieve a value with a decimal point.

//Modulo
/**
The modulo (or remainder) math operation performs an integer division of one value by another, and returns the remainder of that division.
The operator for the modulo operation is the percentage (%) character.
*/
public class Program {
    public static void main(String[] args) {
        int value = 23;
        int res = value % 6;

        System.out.println(res);
    }
}
//Dividing 23 by 6 returns a quotient of 3, with a remainder of 5. Thus, the value of 5 is assigned to the res variable.


//Increment & Decrement
Increment Operators
/* An increment or decrement operator provides a more convenient and compact way 
to increase or decrease the value of a variable by one.
For example, the statement x=x+1; can be simplified to ++x; */

public class Program {
    public static void main(String[] args) {
        int test = 5;
        ++test;
        
        System.out.println(test);
    }
}

//Prefix & Postfix
//prefix
public class Program {
    public static void main(String[] args) {
        int x = 34;
        int y = ++x;   //y = 35

        System.out.println(y);
    }
}

//postfix
public class Program {
    public static void main(String[] args) {
        int x = 34;
        int y = x++;   //y = 34

        System.out.println(y);
    }
}


//Assignment Operators

public class Program {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        num2 += num1;   // num2 = num2 + num1
                       //  num2 is 12, num1 is 4
        System.out.println(num2);
    }
}public class Program {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        num2 += num1;
        
        System.out.println(num2);
    }
}



//String Concatenation
//The + (plus) operator between strings adds them together to make a new string. This process is called concatenation.
/* The char data type represents a single character. k is a char
//there must be a method called main



