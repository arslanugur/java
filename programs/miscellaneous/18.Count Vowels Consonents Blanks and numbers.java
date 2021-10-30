import java.io.*;

class VowelsConsonants
{
    public static void main(String[] args) throws Exception
    {
        String str;
        int vowels = 0, num = 0, blanks = 0, cons = 0;
        char ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String : ");
        str = br.readLine();

        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                vowels++;
            else if (Character.isDigit(ch))
                num++;
            else if (Character.isWhitespace(ch))
                blanks++;
            else
            {
                cons++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Numbers : " + num);
        System.out.println("Blanks : " + blanks);
        System.out.println("Consonants : " + cons);
    }
}
 

/*
Output:
Enter a String : 2 quick brown foxes jumped upon 4 lazy dogs
Vowels : 11
num : 2
Blanks : 8
Consonants : 22
*/
  
  
