import java.util.*;

class CelsiustoFahrenheit
{
    public static void main(String[] args)
    {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius");
        temperature = in.nextInt();

        temperature = (temperature * 9 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }
}

/*
Output:
Enter temperature in Celsius
37
Temperature in Fahrenheit = 98.6
*/
  
  
