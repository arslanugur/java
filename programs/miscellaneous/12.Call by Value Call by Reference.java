class Number
{
    int x;
}

class CallByValue
{
    public static void main(String[] args)
    {
        int y = 4;
        //call by value
        increase(y);
        //call by reference	
        Number n = new Number();
        n.x = 3;
        System.out.println("Value of x before  increment  " + n.x);
        increment(n);
        System.out.println("Value of x after  increment " + n.x);
    }

    private static void increase(int y)
    {
        System.out.println("pass by value and increment result : " + y++);
    }

    public static void increment(Number n)
    {
        n.x = n.x + 1;
    }
} 

/*
Output:
pass by value and increment result : 4
Value of x before  increment  3
Value of x after  increment 4
*/

