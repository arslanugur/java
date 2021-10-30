import java.io.*;

class BinaryAddition
{
    public static void main(String s[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter number1: ");
        int num1 = Integer.parseInt(br.readLine());
        int num4 = num1;

        System.out.print("\nEnter number2: ");
        int num2 = Integer.parseInt(br.readLine());
        int num5 = num2;

        int k = 1;
        int dec1 = 0, dec2 = 0;

        while (num1 != 0)
        {
            dec1 = dec1 + (num1 % 10) * k;
            k = k * 2;
            num1 = num1 / 10;
        }

        k = 1;
        while (num2 != 0)
        {
            dec2 = dec2 + (num2 % 10) * k;
            k = k * 2;
            num2 = num2 / 10;
        }

        int num3 = dec1 + dec2;
        String str1 = Integer.toBinaryString(num3);

        System.out.print("\nAddition of " + num4 + " + " + num5 + " = " + str1);

        System.out.println();
    }
}

/*
Output:
Enter number1: 101
Enter number2: 110
Addition of 101 + 110 = 1011
*/
 
 
