import java.util.Scanner;

class CalculateMean
{

    public static void main(String[] args)
    {

        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);

        System.out.println("Enter the total number of terms whose mean you want to calculate");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + " numbers:");

        for (int x = 1; x <= counter; x++)
        {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }

        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
}

/*
Output:
Enter the total number of terms whose mean you want to calculate
3
Please enter 3 numbers:
11
7
5
The mean of the 3 numbers you entered is 7.0
*/

