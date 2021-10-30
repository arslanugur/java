import java.math.*;
import java.io.*;

class BigIntegerDemo
{
    public static int f = 0;
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number to find its factorial : ");
        f = Integer.parseInt(br.readLine());
        BigInteger fact = fact(f);

        System.out.println("fact("+f+") = " + fact);
        System.out.println("fact("+f+").longValue() = " + fact.longValue());
        System.out.println("fact("+f+").intValue() = " + fact.intValue());

        int powerOfTwoCount = 0;

        BigInteger two = BigInteger.valueOf(2);

        while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO))
        {
            powerOfTwoCount++;
            fact = fact.divide(two);
        }
        
        System.out.println("fact("+f+") powers of two = " + powerOfTwoCount);
    }

    private static BigInteger fact(long n)
    {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

/*
Output:
Enter any number to find its factorial : 100
fact(100) = 93326215443944152681699238856266700490715968264381621468592963895217
59999322991560894146397615651828625369792082722375825118521091686400000000000000
0000000000
fact(100).longValue() = 0
fact(100).intValue() = 0
fact(100) powers of two = 97
*/
  
  
