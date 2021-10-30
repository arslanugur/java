class CommandLineArgs 

{
    public static void main(String args[]) 
    {
        int a, b, c;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (a > b && a > c) {
            System.out.println("Largest Number is : " + a);
        } else if (b > c) {
            System.out.println("Largest Number is : " + b);
        } else {
            System.out.println("Largest Number is : " + c);
        }
    }
}

/*
Output:
java LargestNumber 2 5 7
Largest Number is : 7
*/

