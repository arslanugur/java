import java.util.Scanner;

class GCDLCM
{
    public static void main(String args[])
    {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("GCD of two numbers is : " + gcd(x, y));
        System.out.println("LCM of two numbers is : " + lcm(x, y));
    }

    static int gcd(int x, int y)
    {
        int r = 0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number

        r = b;
        while (a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while (true)
        {
            if (a % x == 0 && a % y == 0)
            {
                return a;
            }
            ++a;
        }
    }
}

/*
Output:
Enter the two numbers:
6
3
GCD of two numbers is : 3
LCM of two numbers is : 6
*/

