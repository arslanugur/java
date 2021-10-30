import java.lang.*;
import java.util.Scanner;

class CalculateInterest
{
    public static void main(String[] args)
    {
        double p, n, r, si, ci;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        p = s.nextDouble();

        System.out.print("Enter the No.of years : ");
        n = s.nextDouble();

        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();

        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;

        System.out.println("\nAmount : " + p);
        System.out.println("No. of years : " + n);
        System.out.println("Rate of interest : " + r);
        System.out.println("Simple Interest : " + si);
        System.out.println("Compound Interest : " + ci);
    }
}

/*
Output:
Enter the amount : 5000
Enter the No.of years : 3
Enter the Rate of interest : 9

Amount : 5000.0
No. of years : 3.0
Rate of interest : 9.0
Simple Interest : 1350.0
Compound Interest : 1475.1450000000013
*/
  
  
  
