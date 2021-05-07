Getters and Setters
      //Getters and Setters are used to effectively protect your data, particularly when creating classes. 
      //For each variable, the get method returns its value, while the set method sets the value.

      //Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
      //Setters start with set, followed by the variable name, with the first letter of the variable name capitalized.

      //Example:
public class Vehicle {
  private String color;

  // Getter
  public String getColor() {
    return color;
  }

 // Setter
  public void setColor(String c) {
    this.color = c;
  }
}

      //The getter method returns the value of the attribute.
      //The setter method takes a parameter and assigns it to the attribute.
      
      //The keyword this is used to refer to the current object. Basically, this.color is the color attribute of the current object.

      //to define the set and get methods.
class A {
   private int x;			
   public int getX() {
      return x;
}
   public void setX(int x) {
      this.x = x;
   }
}

      /*
      There's a class called Student with an attribute called knowledge. 
      Since we'd rather not pick Student's brain directly to teach new things, we made sure knowledge is secure and private inside the skull. 
      In order to teach Student, there's a setter method called listen() that anyone can use. 
      Unfortunately, Student can only remember one lesson at a time. 
      This setter method is a void, because Student doesn't respond after being taught. What a shy type. 
      However, Student responds with knowledge after being asked to talk(), so this getter method is the same type as knowledge. 
      If Student is selfish and doesn't want to respond, then this getter can be void as well, but that's not nice. 
  
      class A { private int x; public int getX() { return x ; } 
      With the first part of the code we're using get, which is what most code does and while you most likely get this part right
      public void setX(int x) { this.x = x; } 
      The second part of this code is using set, since we're defining a parameter where is nothing, aka void, that will be returned. 
      Lets use a production line, 
      once the factory has SET the color for the cars to white that day, no cars, void, will come out red, green, blue. 
      If you use cruise control you SET your speed. You're car will not go a different speed other than what you specified, void.
      For those who don't understand the purpose of "void": 
      because Java needs to know what to expect, void is used when a class will return no value. 
      For example: public void example1() { a = a+b; } 
      this will return nothing, hence the void public int example2() { return 1+2; }
      this will return 3 */


      //Once our getter and setter have been defined, we can use it in our main
public class Vehicle {
    private String color;
    
    // Getter
    public String getColor() {
        return color;
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

class Program {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}       //output: red

      //Getters and setters allow us to have control over the values. 
      //You may, for example, validate the given value in the setter before actually setting the value.

      //Getters and setters are fundamental building blocks for encapsulation, which will be covered in the next module.
      //What would the name of the setter method for the class variable named "age" be? --> setAge
      
