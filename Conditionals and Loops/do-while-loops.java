do...while Loops
        //A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
public class Program {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while(x < 5);
    }
}
/*1
  2
  3
  4*/

        //Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.
        //Even with a false condition, the code will run once.
public class Program {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while(x < 0);
    }
}       //Output: 1

        //Notice that in do…while loops, the while is just the condition and doesn't have a body itself.


        //How is a do while loop different from a while loop?
        //A do while loop runs your code at least one time.


Loop Control Statements
        //The break and continue statements change the loop's execution flow.
        //The break statement terminates the loop and transfers execution to the statement immediately following the loop.
public class Program {
    public static void main(String[] args) {
        int x = 1;
        
        while(x > 0) {
            System.out.println(x);
            if(x == 4) {
                break;
            }
            x++;
        }
    }
}
/*
1
2
3
4*/

        //The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. 
        //In other words, it makes the loop skip to its next iteration.
public class Program {
    public static void main(String[] args) {
        for(int x=10; x<=40; x=x+10) {
            if(x == 30) {
                continue;
            }
            System.out.println(x);
        }
    }
}
/*10
  20
  40*/
  
        //As you can see, the above code skips the value of 30, as directed by the continue statement.


        //to print the values of the x variable 5 times.
int x = 1;
do {
 System.out.println(x);
 x++;
} 

while (x <= 5);




