import java.util.*;

class FractionAdding
{
    public static void main(String args[])
    {
        float a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = scanner.nextFloat();
        System.out.print("Enter b : ");
        b = scanner.nextFloat();
        System.out.print("Enter c : ");
        c = scanner.nextFloat();
        System.out.print("Enter d : ");
        d = scanner.nextFloat();

        // fraction addition formula ((a*d)+(b*c))/(b*d)
        System.out.print("Fraction Addition : [( " + a + " * " + d + " )+( " + b + " * " + c + " ) / ( " + b + " * " + d + " )] = " + (((a * d) + (b * c)) / (b * d)));
    }
}

/*
Output:
Enter a : 5
Enter b : 6
Enter c : 7
Enter d : 8
Fraction Addition : [( 5.0 * 8.0 )+( 6.0 * 7.0 ) / ( 6.0 * 8.0 )] = 1.7083334
*/
 
  
