Limits of Datatypes
      The wrapper classes of the numeric datatypes allow to access the upper and lower bounds of the corresponding data type.
      The MIN_VALUE and MAX_VALUE constants are used for that.
      
      Let's print them out:
class DatatypesLimits {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String [] args) {
        print("\nbyte");
        print("Min : " + Byte.MIN_VALUE);
        print("Max : " + Byte.MAX_VALUE);
        print("\nshort");
        print("Min : " + Short.MIN_VALUE);
        print("Max : " + Short.MAX_VALUE);
        print("\nint");
        print("Min : " + Integer.MIN_VALUE);
        print("Max : " + Integer.MAX_VALUE);
        print("\nlong");
        print("Min : " + Long.MIN_VALUE);
        print("Max : " + Long.MAX_VALUE);
        print("\nfloat");
        print("Min : " + Float.MIN_VALUE);
        print("Max : " + Float.MAX_VALUE);
        print("\ndouble");
        print("Min : " + Double.MIN_VALUE);
        print("Max : " + Double.MAX_VALUE);
    }
}



Beyond the Limits
      Let's try to increment the maximum, and decrement the minimum values of the Integer class:
class BeyondTheLimits {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String [] args) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        print("int MAX   : " + b);
        print("int MIN-1 : " + (a - 1));
        print("int MIN   : " + a);
        print("int MAX+1 : " + (b + 1));
    }
}

      Decrementing the minimum value results in the maximum value. 
      Incrementing the maximum value results in the minimum value.
      
      
      
      
      
      
      
      
      
      
