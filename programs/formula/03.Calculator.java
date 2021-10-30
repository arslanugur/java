import java.util.Scanner;
import java.io.*;

class Calculator
{

    public static void main(String[] args)
    {

        int choice;
        int x = 0;
        int y = 0;
        int sum;

        PrintStream out;

        Scanner input;

        Calculator calc = new Calculator();

        try
        {
            out = new PrintStream("calclog.txt");

            do
            {
                System.out.println("Calculator Program");
                System.out.println("--------------------\n");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Mod");
                System.out.println("6. Power");
                System.out.println("99. End Program\n");
                System.out.println("Enter Choice: ");

                input = new Scanner(System.in);
                choice = input.nextInt();

                while ((choice < 1 || choice > 6) && choice != 99)
                {

                    System.out.println("Please enter 1, 2, 3, 4, 5, or 6: ");
                    choice = input.nextInt();

                }

                if (choice != 99)
                {

                    System.out.println("Please enter 2 numbers only: ");
                    x = input.nextInt();
                    y = input.nextInt();

                }

                switch (choice)
                {

                    case 1:

                        sum = calc.add(x, y);
                        System.out.printf("The sum is %d\n\n", sum);
                        out.println(x + "+" + y + "=" + sum);

                        break;

                    case 2:

                        sum = calc.sub(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "-" + y + "=" + sum);

                        break;

                    case 3:

                        sum = calc.multi(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "*" + y + "=" + sum);

                        break;

                    case 4:

                        try
                        {

                            sum = calc.div(x, y);
                            System.out.printf("The answer is %d\n\n", sum);
                            out.println(x + "/" + y + "=" + sum);

                        }
                        catch (Exception e)
                        {

                            System.out
                                    .println("\nError: Cannot Divide by zero\n\n");

                        }

                        break;

                    case 5:

                        sum = calc.mod(x, y);
                        System.out.printf("The mod is %d\n\n", sum);
                        out.println(x + "%" + y + "=" + sum);

                        break;

                    case 6:

                        sum = calc.pow(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "^" + y + "=" + sum);

                        break;
                }


            }

            while (choice != 99);
            input.close();
            System.out.println("Ending program...");

        }

        catch (Exception e)
        {
            System.out.println("ERROR: Some error occured");
            e.printStackTrace();
        }

    }

    public int add(int num1, int num2)
    {

        int sum;
        sum = num1 + num2;

        return sum;
    }

    public int sub(int num1, int num2)
    {

        int sum;
        sum = num1 - num2;

        return sum;
    }

    public int multi(int num1, int num2)
    {

        int sum;
        sum = num1 * num2;

        return sum;
    }

    public int div(int num1, int num2)
    {

        int sum;
        sum = num1 / num2;

        return sum;
    }

    public int mod(int num1, int num2)
    {

        int sum;
        sum = num1 % num2;

        return sum;
    }

    public int pow(int base, int exp)
    {

        int sum = 1;

        if (exp == 0)
        {
            sum = 1;
        }

        while (exp > 0)
        {
            sum = sum * base;
            exp--;

        }

        return sum;

    }

}

/*
Output:
Calculator Program
--------------------

1. Add
2. Subtract
3. Multiply
4. Divide
5. Mod
6. Power
99. End Program

Enter Choice: 
4
Please enter 2 numbers only: 
4
2
The answer is 2

Calculator Program
--------------------

1. Add
2. Subtract
3. Multiply
4. Divide
5. Mod
6. Power
99. End Program

Enter Choice: 
99
Ending program...  
*/


