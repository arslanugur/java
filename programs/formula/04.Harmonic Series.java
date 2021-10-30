import java.util.*;

class HarmonicSeries
{

    public static void main(String args[])
    {

        int num, i = 1;
        double rst = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        num = in.nextInt();

        while (i <= num)
        {

            System.out.print("1/" + i + " +");
            rst = rst + (double) 1 / i;

            i++;
        }

        System.out.println("\n\nSum of Harmonic Series is " + rst);
    }
}

/*
Output:
Enter the number for length of series
5
1/1 +1/2 +1/3 +1/4 +1/5 +

Sum of Harmonic Series is 2.283333333333333
*/

  
