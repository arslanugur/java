import java.util.*;

class RemoveZero
{
    public static void main(String args[])
    {
        int a, x, b;
        char z;
        String n, k = "", str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        str = sc.next();

        x = str.length();

        for (int i = 0; i < x; i++)
        {
            z = str.charAt(i);

            if (z == '0')
            {
            }
            else
                k += z;
        }

        System.out.println("Numbers without zero : " + k);
    }
}

/*
Output:
Enter a number
32010203012202020022022222321222112
Numbers without zero : 32123122222222222321222112
*/
  
  
