import java.util.Scanner;



class Tables {

	

	public static void main(String args[]) {

		

		int a, b, c, d;



		System.out

				.println("Enter range of numbers to print their multiplication table");

		Scanner in = new Scanner(System.in);



		a = in.nextInt();

		b = in.nextInt();



		for (c = a; c <= b; c++) {

			System.out.println("Multiplication table of " + c);



			for (d = 1; d <= 10; d++) {

				System.out.println(c + "*" + d + " = " + (c * d));

				

			}

		}

	}

}

/*
Output:
Enter range of numbers to print their multiplication table
5 7

Multiplication table of 5
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
5*6 = 30
5*7 = 35
5*8 = 40
5*9 = 45
5*10 = 50
  
Multiplication table of 6
6*1 = 6
6*2 = 12
6*3 = 18
6*4 = 24
6*5 = 30
6*6 = 36
6*7 = 42
6*8 = 48
6*9 = 54
6*10 = 60

Multiplication table of 7
7*1 = 7
7*2 = 14
7*3 = 21
7*4 = 28
7*5 = 35
7*6 = 42
7*7 = 49
7*8 = 56
7*9 = 63
7*10 = 70
*/

