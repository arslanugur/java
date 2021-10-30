import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SquareRoot
{

    public static void main(String[] args) throws IOException
    {

        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number");

        //read a string entered by user
        String line = br.readLine();

        //Handle exception when a string does not contain a number
        try
        {
            //Convert a string into number
            number = Integer.parseInt(line);
        }
        catch (NumberFormatException exception)
        {

            System.out.println("Please enter a valid number");

        }
        //Find square root of a number
        double squareRoot = Math.sqrt(number);

        //print square root
        System.out.println("Square root of a number " + number + "=" + squareRoot);
    }
}

/*
Output:
Enter a number
100
Square root of a number 100=10.0
*/

  
