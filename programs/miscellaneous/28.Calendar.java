import java.util.*;
import java.text.*;
class CalendarTask
{
    public static void main(String args[]) throws Exception
    {
        printCalendar(2016, 2);
    }

    static void printCalendar(int year, int nCols)
    {
        if (nCols < 1 || nCols > 12)
            throw new IllegalArgumentException("Illegal column width.");

        Calendar date = new GregorianCalendar(year, 0, 1);

        int nRows = (int) Math.ceil(12.0 / nCols);
        int offs = date.get(Calendar.DAY_OF_WEEK) - 1;
        int w = nCols * 24;

        String[] monthNames = new DateFormatSymbols(Locale.US).getMonths();

        String[][] mons = new String[12][8];
        for (int m = 0; m < 12; m++)
        {
            String name = monthNames[m];
            int len = 11 + name.length() / 2;
            String format = MessageFormat.format("%{0}s%{1}s", len, 21 - len);

            mons[m][0] = String.format(format, name, "");
            mons[m][1] = " Su Mo Tu We Th Fr Sa";
            int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);

            for (int d = 1; d < 43; d++)
            {
                boolean isDay = d > offs && d <= offs + dim;
                String entry = isDay ? String.format(" %2s", d - offs) : "   ";
                if (d % 7 == 1)
                    mons[m][2 + (d - 1) / 7] = entry;

                else
                    mons[m][2 + (d - 1) / 7] += entry;
            }

            offs = (offs + dim) % 7;
            date.add(Calendar.MONTH, 1);
        }

        System.out.printf("%" + (w / 2 + 10) + "s%n", "[Snoopy Picture]");
        System.out.printf("%" + (w / 2 + 4) + "s%n%n", year);

        for (int r = 0; r < nRows; r++)
        {
            for (int i = 0; i < 8; i++)
            {
                for (int c = r * nCols; c < (r + 1) * nCols && c < 12; c++)
                {
                    System.out.printf("   %s", mons[c][i]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
Output:

		   [Snoopy Picture]
                        2016

          January                 February      
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
                    1  2        1  2  3  4  5  6
     3  4  5  6  7  8  9     7  8  9 10 11 12 13
    10 11 12 13 14 15 16    14 15 16 17 18 19 20
    17 18 19 20 21 22 23    21 22 23 24 25 26 27
    24 25 26 27 28 29 30    28 29               
    31                                          

           March                   April        
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
           1  2  3  4  5                    1  2
     6  7  8  9 10 11 12     3  4  5  6  7  8  9
    13 14 15 16 17 18 19    10 11 12 13 14 15 16
    20 21 22 23 24 25 26    17 18 19 20 21 22 23
    27 28 29 30 31          24 25 26 27 28 29 30
                                                

            May                     June        
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
     1  2  3  4  5  6  7              1  2  3  4
     8  9 10 11 12 13 14     5  6  7  8  9 10 11
    15 16 17 18 19 20 21    12 13 14 15 16 17 18
    22 23 24 25 26 27 28    19 20 21 22 23 24 25
    29 30 31                26 27 28 29 30      
                                                

            July                   August       
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
                    1  2        1  2  3  4  5  6
     3  4  5  6  7  8  9     7  8  9 10 11 12 13
    10 11 12 13 14 15 16    14 15 16 17 18 19 20
    17 18 19 20 21 22 23    21 22 23 24 25 26 27
    24 25 26 27 28 29 30    28 29 30 31         
    31                                          

         September                October       
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
                 1  2  3                       1
     4  5  6  7  8  9 10     2  3  4  5  6  7  8
    11 12 13 14 15 16 17     9 10 11 12 13 14 15
    18 19 20 21 22 23 24    16 17 18 19 20 21 22
    25 26 27 28 29 30       23 24 25 26 27 28 29
                            30 31               

          November                December      
    Su Mo Tu We Th Fr Sa    Su Mo Tu We Th Fr Sa
           1  2  3  4  5                 1  2  3
     6  7  8  9 10 11 12     4  5  6  7  8  9 10
    13 14 15 16 17 18 19    11 12 13 14 15 16 17
    20 21 22 23 24 25 26    18 19 20 21 22 23 24
    27 28 29 30             25 26 27 28 29 30 31
  */

