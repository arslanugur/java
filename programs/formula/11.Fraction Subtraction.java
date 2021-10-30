import java.util.*;

class FractionSubtraction
{
	public static void main(String args[])
	{
		float a,b,c,d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = scanner.nextFloat();
		System.out.print("Enter b : ");
		b = scanner.nextFloat();
		System.out.print("Enter c : ");
		c = scanner.nextFloat();
		System.out.print("Enter d : ");
		d = scanner.nextFloat();

		// fraction addition formula ((a*d)-(b*c))/(b*d)
		System.out.print("Fraction subtraction : [( "+a+" * "+d+" )-( "+b+" * "+c+" ) / ( "+b+" * "+d+" )] = "+(((a*d)-(b*c))/(b*d)));
	}
}

/*
Output:
Enter a : 1
Enter b : 2
Enter c : 3
Enter d : 4
Fraction subtraction : [( 1.0 * 4.0 )-( 2.0 * 3.0 ) / ( 2.0 * 4.0 )] = -0.25
*/

