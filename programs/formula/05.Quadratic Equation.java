class QuadraticEquation
{

    public static void main(String[] args)
    {
        /*
	 * Suppose our Quadratic Equation to be solved is 2x2 + 6x + 4 = 0 .
	 * (Assuming that both roots are real valued)
	 * 
	 * General form of a Quadratic Equation is ax2 + bx + c = 0 where 'a' is
	 * not equal to 0
	 * 
	 * Hence a = 2, b = 6 and c = 4.
	 */

        int a = 2;
        int b = 6;
        int c = 4;

        // Finding out the roots
        double temp1 = Math.sqrt(b * b - 4 * a * c);

        double root1 = (-b + temp1) / (2 * a);
        double root2 = (-b - temp1) / (2 * a);

        System.out
                .println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are "
                                 + root1 + " and " + root2);

    }
}

/*
Output:
The roots of the Quadratic Equation "2x2 + 6x + 4 = 0" are -1.0 and -2.0
*/

