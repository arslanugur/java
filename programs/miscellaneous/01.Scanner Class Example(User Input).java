//Scanner Class is used to get input from user

import java.util.Scanner;

class ScannerClassExample
{
    public static void main(String args[])
    {
        int intNum;
        long longNum;
        float floatNum;
        double doubleNum;
        String line;
        String str;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter line  ");
        line = in.nextLine();
        System.out.print("Enter string  ");
        str = in.next();
        System.out.print("Enter integer ");
        intNum = in.nextInt();
        System.out.print("Enter long ");
        longNum = in.nextLong();
        System.out.print("Enter float ");
        floatNum = in.nextFloat();
        System.out.print("Enter double ");
        doubleNum = in.nextDouble();

        System.out.println("\nEntered details are as follows: ");

        System.out.println("Line: " + line);
        System.out.println("String: " + str);
        System.out.println("Integer: " + intNum);
        System.out.println("Long: " + longNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);
    }
} 

/*
Output:
Enter line  This is a line
Enter string  hello
Enter integer 23
Enter long 324234
Enter float 322.23
Enter double 42342.222

Entered details are as follows:
Line: This is a line
String: hello
Integer: 23
Long: 324234
Float: 322.23
Double: 42342.222
*/

  
