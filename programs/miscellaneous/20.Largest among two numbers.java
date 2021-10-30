import java.util.*;

class LargestNumber
{
    public static void main(String args[])
    {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 >= num2)
        {
            System.out.println("\nLargest Number is : " + num1);
        }

        else
        {
            System.out.println("\nLargest Number is : " + num2);
        }
    }
}

/*
Output:
Enter two numbers : 3
5

Largest Number is : 5
*/
  
  
