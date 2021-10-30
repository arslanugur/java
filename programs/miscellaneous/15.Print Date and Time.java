import java.util.*;

class PrintCurrentDateandTime
{
    public static void main(String args[])
    {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
    }
}

/*
Output:
Current date is  18/11/2015
Current time is  10 : 54 : 9
*/
  
  
