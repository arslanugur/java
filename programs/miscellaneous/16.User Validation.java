import java.io.*;

class Validation
{
    public static void main(String args[]) throws Exception
    {
        String username, password;
        String user1, pass1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Login Details");

        System.out.println("Enter username");
        username = br.readLine();

        System.out.println("Enter password");
        password = br.readLine();

        System.out.println("Enter details for validation");
        System.out.println();

        System.out.println("Enter username");
        user1 = br.readLine();

        System.out.println("Enter password");
        pass1 = br.readLine();

        if (user1.equals(username) && pass1.equals(password))
        {
            System.out.println("You are a valid user");
        }
        else
        {
            System.out.println("You are not a valid user");
        }
    }
}

/*
Output:
Enter Login Details
Enter username
SuperSaiyan 
Enter password
DragonBall
Enter details for validation

Enter username
Supersaiyan 
Enter password
DragonBall
You are not a valid user
*/

