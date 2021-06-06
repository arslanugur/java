Underscores in Numeric Literals
      In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. 
      This feature enables, for example, to separate groups of digits in numeric literals, which can improve the readability of the code.
      
      For example:
public class Underscores {
    public static void main(String [] args) {
        int a = 1000000000;
        int b = 1_000_000_000;
        if (a == b)
            System.out.print("Billion!");
    }
}    //output: Billion!

      As you can see, the underscores do not alter the number.
      
      You can place underscores only between digits.
      Underscores cannot be placed:
        * at the beginning or end of a number.
        * where a string of digits is expected.
        * adjacent to a decimal point.
        * before an F or L suffix.


