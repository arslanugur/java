class CommandLineExample
{
    // arugments entered in command line are 
    // passed in main(String args[]) method
    public static final void main(String args[])
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
    }
}

/*
Output:
E:freeitjava>java CommandLineExample Java Programming Hub Tutorial
args[0] -> Java
args[1] -> Programming
args[2] -> Hub
args[3] -> Tutorial
*/

