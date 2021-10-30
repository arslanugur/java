import java.io.*;

class BufferedReaderExample
{
    public static void main(String[] args) throws Exception
    {
        String str;
        int i;
        float f;
        double d;
        long l;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String");
        str = br.readLine();

        System.out.println("Enter Integer");
        i = Integer.parseInt(br.readLine());

        System.out.println("Enter float");
        f = Float.parseFloat(br.readLine());

        System.out.println("Enter double");
        d = Double.parseDouble(br.readLine());

        System.out.println("String : " + str);
        System.out.println("Integer : " + i);
        System.out.println("Float : " + f);
        System.out.println("Double : " + d);
    }
}

/*
Output:
Enter String
4
Enter Integer
4
Enter float
23.5
Enter double
22.4421312
String : 4
Integer : 4
Float : 23.5
Double : 22.4421312
*/

