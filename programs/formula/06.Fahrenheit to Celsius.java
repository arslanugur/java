import java.util.*;

class FahrenheitToCelsius
{

    public static void main(String[] args)
    {

        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        temperature = in.nextInt();

        temperature = (temperature - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + temperature);
    }
}

/*
Output:
Enter temperature in Fahrenheit : 33
Temperature in Celsius = 0.5555556
*/

  
