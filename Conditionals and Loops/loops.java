while Loops
//        A loop statement allows to repeatedly execute a statement or group of statements.
//        A while loop statement repeatedly executes a target statement as long as a given condition is true.
public class Program {
    public static void main(String[] args) {
        int x = 3;
        while(x > 0) {
            System.out.println(x);
            x--;
        }
    }
}

/*Output:
3
2
1*/

//        The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. 
//	  Then it checks for the statement again and repeats.
//        Notice the statement x--. This decrements x each time the loop runs, and makes the loop stop when x reaches 0.
//        Without the statement, the loop would run forever.
int x = 12; 

While (x < 100){ 
    System.out.println("Java rocks!"); 
    x++; }            

        When the expression is tested and the result is false, the loop body is skipped and the first statement after the while loop is executed.
public class Program {
    public static void main(String[] args) {
        int x = 6;

        while( x < 10 )
        {
            System.out.println(x);
            x++;
        }
        System.out.println("Loop ended");
    }
}

/*Output: 6
	  7
	  8
	  9   
	  Loop ended*/

//        Notice that the last print method is out of the while scope.
            
//How many times will the following loop work?
int x = 0;
int y = 5;
while (x < y) {
  System.out.println("Hello");
  x++;	
}

//Output: It is from 0 to 4, while 5 will be the "break point" for the loop. 0 = 1 1 = 2 2 = 3 3 = 4 4 = 5 times*


For Loops
//        Another loop structure is the for loop. 
//        A for loop allows you to efficiently write a loop that needs to execute a specific number of times.
//Syntax:
for (initialization; condition; increment/decrement) {
   statement(s)
}

//        Initialization: Expression executes only once during the beginning of loop
//        Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
//        Increment/Decrement: Executes after each iteration of the loop.

//The following example prints the numbers 1 through 5.
 public class Program {
    public static void main(String[] args) {
        for(int x = 1; x <=5; x++) {
            System.out.println(x);
        }
    }
}   
/*output: 1
	  2
	  3
	  4
	  5*/

//        This initializes x to the value 1, and repeatedly prints the value of x, until the condition x<=5 becomes false. 
//        On each iteration, the statement x++ is executed, incrementing x by one.
//        Notice the semicolon (;) after initialization and condition in the syntax.



for (int i = 0; i < 10; i++) {
   System.out.println("Great!");
}

        You can have any type of condition and any type of increment statements in the for loop.
        The example below prints only the even values between 0 and 10:
public class Program {
    public static void main(String[] args) {
        for(int x=0; x<=10; x=x+2) {
            System.out.println(x);
        }
    }
}

        A for loop is best when the starting and ending numbers are known.

        How many times will the following loop run?
for (int i = 2; i < 10; i = i*i) {
   System.out.println(i);
}

        /* Output: 2
        Initially i is 2. Loop will run because it's satisfying the condition. After running once, i = i * i gets executed so i becomes 4. 
        4 satisfies the condition, so the loop runs the 2nd time. 
        Now i = i * i gets executed again, so i becomes 4 * 4 = 16 that DOESN'T satisfy the loop condition. 
        Hence the loop doesn't execute the 3rd time. */








    
