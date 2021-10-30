class StaticExample
{
    static int st = 0;
    int ns = 0;

    StaticExample()
    {
        ns++;
        System.out.println(ns);
    }

    public static void main(String args[])
    {
        //Non-Static variables requires object to get accessed in Static method
        System.out.println("Counter with non-static variable:");

        StaticExample s = new StaticExample();
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        //Static variables can be accessed without reference(object) in Static method
        System.out.println("\nCounter with static variable:");

        for (int i = 0; i < 3; i++)
        {
            st++;
            System.out.println(st);

        }
    }
}

/*
Output:
Counter with non-static variable:
1
1
1

Counter with static variable:
1
2
3
*/
  
  
