import java.util.*;

class SquareRootWithoutInbuiltFunction
{
    public static void main(String args[])
    {
        int number;
        double t, squareroot;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        number = sc.nextInt();

        //Logic to find square root of a number without sqrt function
        squareroot = number / 2;

        do
        {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);

        System.out.println("Square Root of a Number is : " + squareroot);
    }
}

/*
Output:
Enter a Number
9
Square Root of a Number is : 3.0
*/
  
  
