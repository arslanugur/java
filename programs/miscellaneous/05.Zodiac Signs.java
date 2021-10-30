import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.text.DateFormat;

class ZodiacSigns
{
    public static void main(String[] args)
    {
        System.out.println(df.format(calendar.getTime()));
        int day = 0;
        int month = 0;
        int year = 0;
        while (true)
        {
            // Read in a date
            System.out.print("Enter the year: ");
            year = readInt();
            while (true)
            {
                System.out.print("Enter the month number January is 1, December is 12: ");
                month = readInt();
                // Change month to zero-based and validate
                if (validMonth(--month))                                        
                    break;
            }

            while (true)
            {
                System.out.print("Enter the day in the month: ");
                day = readInt();
                if (validDay(day, month, year))
                    break;
            }

            // determine the sign
            calendar.set(year, month, day);
            // Match the year for the sign start dates
            for (int i = 0; i < signStartDates.length; ++i)
            {
                signStartDates[i].set(GregorianCalendar.YEAR, year);
            }

            for (int i = 0; i < signStartDates.length; ++i)
            {
                if (calendar.after(signStartDates[i]) && calendar.before(
                        signStartDates[(i + 1) % signStartDates.length]))
                {
                    System.out.println(df.format(calendar.getTime()) + " is in the sign of " + signs[i]);
                    break;
                }
            }

            // Try another date?
            System.out.println("Do you want to try another date(Enter Y or N)?");
            if (!yes())
            {
                break;
            }
        }
    }

    // Validate the month value
    private static boolean validMonth(int month)
    {
        if (month >= 0 && month <= 11)
            return true;
        else
            System.out.println("The month value must be from 1 to 12. Try again.");
        return false;
    }

    // Validate the day value for the month and year
    private static boolean validDay(int day, int month, int year)
    {
    /* A valid day must be:
                 - between 1 and 31
                 - less than 31 when the month is April, June, September, or November
                 - less than 29 when the month is February and it is not a leap year
                 - less than 30 when the month is February and it is a leap year
    */
        if (day < 0 || day > 31)
        {
            System.out.println("Day values must be between 1 and 31. Try again.");
            return false;
        }

        if (day > 30 && (month == 3 || month == 5 || month == 8 || month == 10))
        {
            System.out.println(
                    "Day values must be less than 31 when the month" + " is " + MONTH_NAMES[month] + ". Try again.");
            return false;
        }

        if (day > 28 && month == 1 && !calendar.isLeapYear(year))
        {
            System.out.println(year + " is not a leap year so day values must be less than 29. Try again.");
            return false;
        }

        if (day > 29 && month == 1 && calendar.isLeapYear(year))
        {
            return false;
        }

        return true;

    }

    // Reads an integer from the keyboard
    private static int readInt()
    {
        int value = 0;
        while (true)
        {
            try
            {
                value = Integer.parseInt(in.readLine().trim());
                return value;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Try again.");
            }
            catch (IOException e)
            {
                System.out.println("Error reading for the keyboard." + e.getMessage());
            }
        }
    }

    private static boolean yes()
    {
        String str = null;
        while (true)
        {
            try
            {
                str = in.readLine().trim();
            }
            catch (IOException e)
            {
                System.out.println("Error reading for the keyboard." + e.getMessage());
            }

            if (str.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (str.equalsIgnoreCase("N"))
            {
                break;
            }
            else
            {
                System.out.print("Invalid input. Try again. Enter Y or N: ");
            }
        }
        return false;
    }
    
    // Keyboard input
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Names for Zodiac signs and start dates. Remember - months start at zero.
    private static String[] signs = {"Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
    private static GregorianCalendar[] signStartDates = {
            new GregorianCalendar(2002, 0, 20),    // Aquarius start date
            new GregorianCalendar(2002, 1, 19),    // Pisces start date
            new GregorianCalendar(2002, 2, 21),    // Aries start date
            new GregorianCalendar(2002, 3, 20),    // Taurus start date
            new GregorianCalendar(2002, 4, 21),    // Gemini start date
            new GregorianCalendar(2002, 5, 21),    // Cancer start date
            new GregorianCalendar(2002, 6, 23),    // Leo start date
            new GregorianCalendar(2002, 7, 23),    // Virgo start date
            new GregorianCalendar(2002, 8, 23),    // Libra start date
            new GregorianCalendar(2002, 9, 23),    // Scorpio start date
            new GregorianCalendar(2002, 10, 22),   // Sagittarius start date
            new GregorianCalendar(2002, 11, 22),   // Capricorn start date
    };
    private static GregorianCalendar calendar = new GregorianCalendar();

    private static final String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // Date formatter for displaying dates
    private static DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

}

/*
Output:
8 September, 2014
Enter the year: 1993
Enter the month number January is 1, December is 12: 10
Enter the day in the month: 21
21 October, 1993 is in the sign of Libra
Do you want to try another date(Enter Y or N)?
n
*/

