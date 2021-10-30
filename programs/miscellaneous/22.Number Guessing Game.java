import java.util.*;
class GuessGame 
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        int numberoftries = 0;
        int numbertoguess = r.nextInt(50);
        boolean f = false;
        int guess;
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
            while(f == false)
            {
                System.out.println("Guess number between 1-50");
                guess = sc.nextInt();
                numberoftries++;
                if(guess > 1 && guess < 50)
                {
                    if(guess == numbertoguess)
                    {
                        f = true;
                    }
                    else if(guess > numbertoguess)
                    {
                        System.out.println("Guess is too high");
                    }
                    else if(guess < numbertoguess)
                    {
                        System.out.println("Guess is too low");
                    }
                }
                else
                {
                    throw new Exception();
                }
            }
        
            System.out.println("\nYou win");
            System.out.println("Number was : "+numbertoguess);
            System.out.println("Number of tries : "+numberoftries);
        }
         catch(Exception e)
        {
            System.out.println("Number is either numeric or out of range(1-50)");
        }
    } 
}

/*
Output:
Guess number between 1-50
10
Guess is too low
Guess number between 1-50
20
Guess is too high
Guess number between 1-50
18
Guess is too high
Guess number between 1-50
15

You win
Number was : 15
Number of tries : 4
*/

