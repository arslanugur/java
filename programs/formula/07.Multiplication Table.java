import java.util.Scanner;

class MultiplicationTable
{

    public static void main(String args[])
    {

        int n, c;
        System.out
                .println("Enter an integer to print it's multiplication table");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n + " is :-");

        for (c = 1; c <= 10; c++)
        {
            System.out.println(n + "*" + c + " = " + (n * c));
        }

    }
}

/*
Output:
Enter an integer to print it's multiplication table
5
Multiplication table of 5 is :-
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
5*6 = 30
5*7 = 35
5*8 = 40
5*9 = 45
5*10 = 50
*/

