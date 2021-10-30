import java.io.*;

class LeapYear
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter year : ");
        //year we want to check
        int year = Integer.parseInt(br.readLine());

        //if year is divisible by 4, it is a leap year

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
    }
}

/*
Output:
Enter year : 2016
Year 2016 is a leap year
*/

