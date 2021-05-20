The equals() method
      
Comparing Objects
      Remember that when you create objects, the variables store references to the objects.
      So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
      
      Example:
class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
    }
}       //output: false

    /*Despite having two objects with the same name, the equality testing returns false, 
      because we have two different objects (two different references or memory locations).

      In order to get "True" in the output in this example, 
      use following lines Animal a1 = new Animal(Robby); Animal a2 = a1; System.out.println(a1 == a2); 
      You can see both the objects are same now via this command System.out.println(a1 + " " + a2);
      */


      //What is the output of this code?
class A {
 private int x;	
 public static void main(String[ ] args) {
   A a = new A();
   a.x = 5;
   A b = new A();
   b.x = 5;
   System.out.println(a == b);			
 }
}     //Output: false --> Because we create two objects and == operator check references not the object values

      //(a.x==b.x) TRUE, (a==b) FALSE
      //a==b means : object a == object b,
      //a.x == b.x would mean value of propert x is the same


equals()
      Each object has a predefined equals() method that is used for semantical equality testing.
      But, to make it work for our classes, we need to override it and check the conditions we need.
      There is a simple and fast way of generating the equals() method, other than writing it manually.
      Just right click in your class, go to Source->Generate hashCode() and equals()...
        
        
      //This will automatically create the necessary methods.
class Animal {
  String name;
  Animal(String n) {
    name = n;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Animal other = (Animal) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}


    /*The automatically generated hashCode() method is used to determine where to store the object internally. 
      Whenever you implement equals, you MUST also implement hashCode.*/
      
      //We can run the test again, using the equals method:
class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

class Program {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1.equals(a2));
    }
}     //output: true


    /*You can use the same menu to generate other useful methods, such as getters and setters for your class attributes.
      
        
      To clarify: "You MUST implement hashcode()" This is a bit missleading. 
      The HashCode is used to address an Object in a hash/set, 
      to find out where to store the Object and whether or not one is already created in the hash/set. 
      The rules: *If two Objects are equal, they must have the same hashcode. 
      *Although, they may not be equal if they have the same hashcode. 
      The hash/set will first check if any Objects have the same hashcode with the Object you are adding, 
      if they do then it will check to see if they are equal. 
      So, if you Override one of those methods, the other is necessary if you want to properly store your objects into a Hash/Set. 
      However, this course has not yet taught Hash/Sets. 
      Those come later on. The Animal class was not used when they explained the HashMap or Set. 
      Which I think may be an issue 
      because beginners aren't going to truly know why both methods are needed if the program works fine with just having equals().
        

      Benefits: 
      1) We now have an easy way to compare equality with any Class that you create. 
         Ex/ Lets say you're making an RPG game. 
         If the user already has the same Item in their inventory you must 'stack' them together. 
         So, if the player adds 1 item, and already has 2, he now has 3. 
         Instead of him having those 3 items separately, the items are now stacked together. 
         Lets also say that items may use the same class but can be different based on its stats. 
         For example DMG. Now, one way to go about doing this is to have an equals() method for each Items class. 
         If they are equal, then the user already has that item. 
         So, assuming the inventory is just an array: 
         Go through the array to try to see if the item you are adding is equal to anything already in the array. 
         If it is, add the number of those items he had. Otherwise, just add the item to the inventory. 
        
      2) equals() & hashcode() are also used for Hash Collections. 
         So, if you want to use Hash's for your own classes, you should create those methods.

      Actually "==" and "equals()" are two different things as one of them is operator and another one is method ,
      so they give different output i.e true or false But if you simply change the code like this - Animal a1 = new Animal(); 
      Animal a2= a1; System. out.println(a1==a2); Result = true
        
      Each object has a predefined equals() method that is used for semantical equality testing. 
      Sometimes a program may have invalid program logic that produces incorrect results when the instructions are executed. 
      The syntax of the source code may be valid, but the algorithm being employed is not. 
      A semantic error is also called a "logic error;"
      
      The "? : " used here is called "Conditional Operator" 
      and it is written as:-- variable x = (expression) ? value if true : value if false 
      The example given above is :-- result = prime * result + ((name == null) ? 0 : name.hashCode()); 
      This means that we check whether or not name is null(has no value). 
      If name is null, result = prime * result + 0 If name is not null, result = prime * result + name.hashCode()
        
      There is something worth mentioning: 
      1. The variety of hashcodes is limited by integer. 
      2. The variety of objects is not limited at all. 
      Which means: - if hashcodes are different, objects are different as a must
                   - if hashcodes are the same, that does not necessarily mean objects are different.*/  
                     
                     
      //to check whether the two objects of type A are semantically equal.
class A {
   private int x;
   public boolean equals(Object o) {    //boolean is the data type that returns true or false. Equals() is a method using the data type.
        return ((A)o).x == this.x;
   }	
   public static void main(String[ ] args)  {
    A a = new A();
    a.x = 9;
    A b = new A();
    b.x = 5;
    System.out.println(a. equals(b));
   }
}
        
    /*the equals() method returns a boolean value, 
      since you're checking for equality between two different objects, 
      there can only be two answers, either it's equal or not. Hence the true or false return.*/



