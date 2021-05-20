Enums
    //An Enum is a special type used to define collections of constants.
      
    //Here is a simple Enum example:
enum Rank {
  SOLDIER,
  SERGEANT,
  CAPTAIN
}

    //Note that the values are comma-separated.
    //You can refer to the constants in the enum above with the dot syntax.
Rank a = Rank.SOLDIER;

    //Basically, Enums define variables that represent members of a fixed set.

    //A Java Enum is a special Java type used to define collections of constants. 
    //More precisely, a Java enum type is a special kind of Javaclass. An enum can contain constants, methods etc.  
    //Here is a simple Java enum example: 
public enum Level { HIGH, MEDIUM, LOW }

    //Enums are used to declare variables that represent members of a fixed set
    //Ranks are a fixed set. You will have more soldiers or more generals, 
    //but you will never have a new rank itself added or deleted.

    
    //After declaring an Enum, we can check for the corresponding values with, for example, a switch statement.
public class Program {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;
                
        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}    //output: Soldier says hi!

      
    //to create an Enum called "Color", with the values RED, BLUE, GREEN.
public enum Color  {
  RED, BLUE, GREEN;
}


    //You should always use Enums 
    //when a variable (especially a method parameter) can only take one out of a small set of possible values.
    //If you use Enums instead of integers (or String codes), 
    //you increase compile-time checking and avoid errors from passing in invalid constants, 
    //and you document which values are legal to use.
    
    //Some sample Enum uses include month names, days of the week, deck of cards, etc.


    //What is the output of this code?
enum Color  {
  RED, BLUE, GREEN;
}
class PrintColor {
   public static void main(String[ ] args) {
   Color color = Color.RED; 
   switch(color) {
   case BLUE:
     System.out.println("1");
   break;
   case GREEN:
     System.out.println("2");
   break;
   default:
     System.out.println("0");
   break;		 
   }
}
}   //output: 0

    //We have declared enum as RED, BLUE, GREEN Then the match for the Switch, 
    //which must be RED (declared in: Color color = Color.RED; As the switch didn't match RED (False), 
    //the default is printed.

    //There is a ';' after GREEN but in the first lesson of enums there is non in the enums itself for those who saw that too. 
    //I checked it. It works in both cases but I don't know why. 
    //If there is somebody who can explain this I would be grateful.


    
  
  
  
