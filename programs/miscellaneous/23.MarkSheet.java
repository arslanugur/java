import java.util.*;

class Marksheet
{
    public static void main(String[] args)
    {
        int marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        marks = sc.nextInt();

        if (marks >= 75 && marks <= 100)
        {
            System.out.println("Your grade is A");
        }

        else if (marks >= 60 && marks < 75)
        {
            System.out.println("Your grade is B");
        }

        else if (marks >= 50 && marks < 60)
        {
            System.out.println("Your grade is C");
        }

        else if (marks >= 40 && marks < 50)
        {
            System.out.println("Your grade is D");
        }

        else if (marks < 40)
        {
            System.out.println("Your grade is Fail");
        }
    }
}

/*
Output:
Enter your marks
67
Your grade is B
*/

