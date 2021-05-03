Decision Making
    Conditional statements are used to perform different actions based on different conditions.
    The if statement is one of the most frequently used conditional statements.

public class Program {
    public static void main(String[] args) {
        int x = 5;        // x = 5
        if(x < 42) {     // ( x == 5 )  Remember!
            System.out.println("Easy Piesy");
        }
    }
}


if...else Statements
      An if statement can be followed by an optional else statement, which executes when the condition evaluates to false.

public class Program {
    public static void main(String[] args) {
        int age = 30;
        if (age < 16) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome!");
        }
    }
}




int x = 10;  int y = 5;
if ( x > y ) {
  System.out.println(x);
} else {
   System.out.println(y);
}


Nested if Statements
      You can use one if-else statement inside another if or else statement.
      
public class Program {
    public static void main(String[] args) {
        int age = 25;
        if(age > 0) {
            if(age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
}




int x = 37;
if (x > 22) {
  if (x > 31) {
 System.out.println("it works!");
 }
}  


else if Statements
      Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.

public class Program {
    public static void main(String[] args) {
        int age = 25;
        if(age <= 0) {
            System.out.println("Error");
        } else if(age <= 16) {
            System.out.println("Too Young");
        } else if(age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
    }
}
 

Logical Operators
      Logical operators are used to combine multiple conditions.
    
public class Program {
    public static void main(String[] args) {
        int age = 22;
        int money = 800;
        
        if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome!");
            }
        }
    }
}


//Second way w Logical Operator: using the AND logical operator (&&) is a better way:
public class Program {
    public static void main(String[] args) {
        int age = 22;
        int money = 800;
        
        if (age > 18 && money > 500) {      //If both operands of the AND operator are true, then the condition becomes true. --Discrete Maths
            System.out.println("Welcome!");
        }
    }
}
        

The OR Operator
      The OR operator (||) checks if any one of the conditions is true.
      The condition becomes true, if any one of the operands evaluates to true.
        
public class Program {
    public static void main(String[] args) {
        int age = 25;
        int money = 100;
        
        if (age > 18 || money > 500) {
            System.out.println("Welcome!");
        }
    }
}

      The NOT !) logical operator is used to reverse the logical state of its operand. 
      If a condition is true, the NOT logical operator will make it false.

public class Program {
    public static void main(String[] args) {
        int age = 25;
        if(!(age > 18)) {      // !(age > 18) reads as "if age is NOT greater than 18".
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome");
        }
    }
}



int a = 11; int b = 12;
int c = 40;
if (a > 100 || b > 3) {     // OR...
  System.out.println(a); 
} else {
  System.out.println(c);
}
//Output: 11

        
        
        
