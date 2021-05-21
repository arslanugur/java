      //What is the output of this code?
class A {
   private void print() {
     System.out.println(''a'');
   }
   private void print(String str) {
     System.out.println(''b'');
   }
   private void print(int x) {
     System.out.println(''c'');
   }		
   public static void main(String[ ] args) {	
     A object = new A();
     object.print(12);	
   }	
}     //output: c   
      
    /*Because the new object in the main method passes the number 12 which is an integer to A class. 
      Of all the print methods in class A, only one accepts an integer and that method prints C.*/

    /*Its called method overloading. 
      to use same method name for calling different set of code based on types and numbers(number of parameters) passed to method. 
      its a part of polymorphism in object oriented design.*/

    /*Overloading topic from earlier. 
      Because the parameter is an int type, it will look for int type to fit in the methods parameter.*/

    /*the new object.print delivers the integer 12 To the only method that accepts an integer argument. 
      print ( int x ) // output " c " Not The first print method, it does not take an argument. 
      print () // output " a " Not The second print method, it takes a string str argument. 
      print ( String Str ) outputs " b " So you have to make sure to break down and analyze every part of the code.*/ 



      ---
      //to define a new class Falcon, based on the superclass Bird.
class Falcon extends Bird {
}
    /*we are creating a class hence the keyword "class" should be used. 
      That class is inheriting its properties from a superclass bird hence we use "extends" keyword. 
      for more explanations check our previous lessons (polymorphism)*/

    /*This is about inheritance, super class and sub class.
      The Class Bird is the Super class (imagine it as the head of the family) 
      and we have the sub class that is the class falcon (one of the child of the family). 
      The sub class inherent from the super class, 
      it gains it's characteristics from the super class 
      (think of this as the child looking something like his father and his behaviour similar to his father) . 
      Hence the class falcon extends the class bird . 
      In python we use the keyword inherent but in Java , extends is the keyword for the same thing.*/

      ---
      Object variables store References
      
      ---
      Encapsulation is used for hiding the details of an object from the other parts of a program
      Encapsulation, using private methods that cause client to invoke said private methods 
                     so they don't access the interface containing data directly.

      Confused with abstraction and encapsulation? 
      encapsulation - "hiding data, members and other fields" from outside the class 
      by writing private before the class variables and methods. 
        
      abstraction - "hiding the implementation details of some methods" from outside the class 
      but provides a general view of those methods by providing interface of that class to the outside world.
        
      ---
      A class Car and its subclass BMW each have a method run(), 
      which was written by the developer as part of the class definition. 
      If CarObj refers to an object of type BMW, what will CarObj.run(); do?
      ---> The run() method defined in BMW will be called.
      The method run() of BMW class will override the method run() of superclass Car.
      Subclass overrides superclass
      
      Its polymorphism, so the method for the sub will be used. 
      If it was inheritance then the method for parent class using a super reference.
        
        
      ---
    /*Valentine, Holiday, and Birthday inherit from the class Card. 
      In order for the following code to be correct, what type must the reference variable card be?*/

      card = new Valentine( "A", 14 ) ;
      card.greeting();

      card = new Holiday( "B" ) ;
      card.greeting();

      card = new Birthday( "C", 12 ) ;
      card.greeting();  
        
    /*Card is the reference variable for the type/class Card and you are pointing the reference variable card 
        to the Valentine, Holiday, and Birthday objects. 
      Because Card is the superclass and Valentine, Holiday, and Birthday are subclasses, the answer is Card.
        
      This is Generalisation, where common data members and methods from multiple classes are combine together to form a single super class. 
      These classes are known as generalised super class. 
      For example, we can take moblie as super class and apple, samsung, htc,nokia are sub-classes. 
      As, mobile is super class and has some functionality like calling, messaging, songs, radio. 
      Now, first of all, we know that mobile has many above mentioned applications, 
      which are definitely going to be present in these sub-classes 
      but these sub-classes have some specific qualities as well that make them different from one another and 
      that's why these classes are known as specialised class 
      and the process of creating new classes from currently existing class is known as specialisation.*/
        
               
        
        
        
        
