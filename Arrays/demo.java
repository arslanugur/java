Reverse a String
      /*Write a program to take a string as input and output its reverse.
        The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

Sample Input:
hello there

Sample Output:
ereht olleh
    
      You can loop through the char array, starting from the end, using arr.length to get the size of the array.*/
      
import java.util.Scanner;
public class rs{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String text = a.nextLine();
    
		char[] arr = text.toCharArray();
        int l=arr.length;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[l-i-1]);
		}
		a.close();
	}
}      
      
      
