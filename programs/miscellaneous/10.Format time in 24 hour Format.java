import java.text.SimpleDateFormat;
import java.util.Date;

class Main
{
    public static void main(String[] args)
    {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdf.format(date));

    }
}

//Output: hour in h format : 8

