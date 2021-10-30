import java.util.*;

class GCDExample
{
    public static void main(String args[])
    {

        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number to find GCD : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number to find GCD : ");
        int number2 = scanner.nextInt();

        System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));
    }

    //find GCD of two number using Euclid's method
    private static int findGCD(int number1, int number2)
    {
        //base case
        if (number2 == 0)
            return number1;

        return findGCD(number2, number1 % number2);
    }

}

/*
Output:
Enter first number to find GCD : 80
Enter second number to find GCD : 50
GCD of two numbers 80 and 50 is :10
*/

  
