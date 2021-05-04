Conditional Statements
//Decision Making
//    Conditional statements are used to perform different actions based on different conditions.
//    The if statement is one of the most frequently used conditional statements.
public class Program {
    public static void main(String[] args) {
        int x = 5;        // x = 5
        if(x < 42) {     // ( x == 5 )  Remember!
            System.out.println("Easy Piesy");
        }
    }
}


if...else Statements
//      An if statement can be followed by an optional else statement, which executes when the condition evaluates to false.
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
//      You can use one if-else statement inside another if or else statement.
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
//      Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.
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
//      Logical operators are used to combine multiple conditions.
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
//      The OR operator (||) checks if any one of the conditions is true.
//      The condition becomes true, if any one of the operands evaluates to true.
public class Program {
    public static void main(String[] args) {
        int age = 25;
        int money = 100;
        
        if (age > 18 || money > 500) {
            System.out.println("Welcome!");
        }
    }
}


//      The NOT !) logical operator is used to reverse the logical state of its operand. 
//      If a condition is true, the NOT logical operator will make it false.
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


        

The switch Statement
//        A switch statement tests a variable for equality against a list of values. 
//        Each value is called a case, and the variable being switched on is checked for each case.
switch (expression) {
   case value1 :
     //Statements
     break; //optional
   case value2 :
     //Statements
     break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}

//        - When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
//        - When a break statement is reached, the switch terminates, and the flow of control jumps to the next line after the switch statement.
//        - Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.

//        The example below tests day against a set of values and prints a corresponding message.
public class Program {
    public static void main(String[] args) {
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }           //Output: Wednesday
}


//        You can have any number of case statements within a switch. Each case is followed by the comparison value and a colon.
int x = 10;
switch (x) {
  case 10:
    System.out.println("A");
    break;
  case 20:
    System.out.println("B");
    break; 
}


The default Statement
//        A switch statement can have an optional default case.
//        The default case can be used for performing a task when none of the cases is matched.       
public class Program {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekday");
        }
    }     //Output: Weekday
}


//        No break is needed in the default case, as it is always the last statement in the switch.
int a = 11; int b = 12; int c = 40;
switch (a) {
 case 40:
   System.out.println(b);
   break;
 default:
   System.out.println(c);
}                       //Output: 40


The switch Expression
//        The switch expression allows multiple comma-separated values per case and returns a value for the whole switch-case block.
public class Program
{
    public static void main(String[] args) {

        int day = 2;
        String dayType  = switch(day) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
            };
        System.out.println(dayType);
    }
}         //Output: Working day
            
//        The switch expression makes the switch-case block much shorter and doesn't use a break statement.
//        Notice the -> shorthand after the cases.            

int price = switch (coffee) {
  case "Espresso", "Americano" -> 15;
  case "Latte", "Macchiato" -> 20;
  default -> 0;
}; 


