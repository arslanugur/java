      //When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. 
      //This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. 
      //It will be shared by all objects.

      //Example:
public class Counter {
  public static int COUNT=0;
  Counter() {
    COUNT++;
  }
}


      //The COUNT variable will be shared by all objects of that class.
      //Now, we can create objects of our Counter class in main, and access the static variable.
public class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }
}     //output: 2

      //The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the Counter class is created. 
      //In the code above, we created 2 objects.
      //You can also access the static variable using any object of that class, such as c1.COUNT.

      //It’s a common practice to use upper case when naming a static variable, although not mandatory.

      //to declare a static variable.
public static int x=0;
  

      //The same concept applies to static methods.
public class Vehicle {
  public static void horn() {
    System.out.println("Beep");
  }
}

      //Now, the horn method can be called without creating an object:
public class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Vehicle.horn();
    }
}     //output: Beep

      //Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.
      //Also, the main method must always be static.

      //What output results from this code?
class Person {
public static int pCount;	
public static void main(String[ ] args) {			
   Person.pCount = 1; 
   Person.pCount++;
   System.out.println(Person.pCount);		
  }
}     //output: 2


/*
One rule-of-thumb: use static only when it make sense to call a method, even if no object has been constructed yet. 
So in a class Car you might have a method double convertMilesToKm(double miles) which would be static. 
Why? Because even without a car, you might still want to know what 10 miles means in kilometres. 
You don't need a car to convert miles to kms, it's the same all the time, it's a fact that you can't change. 
But void setMilesPerGallon(double mpg) 
  //(which sets the fuel efficiency of one particular model) can't be static because not all cars have the same fuel efficiency, 
  //and therefore you need a car model (an object) before you can call the method.
Static members belong to the class instead of a specific instance. 
It means that only one instance of a static field exists even if you create a million instances of the class or you don't create any. 
It will be shared by all instances. 
Since static methods also do not belong to a specific instance, 
they can't refer to instance members (how would you know which instance Hello class you want to refer to?). 
Static members can only refer to static members. But instance members can access static members. 
One exception is that static members can access instance members through an object reference.
  
static allows you to call a method without having to instantiate the class in an object. 
YourClass.method(); instead of : YourClass f = new YourClass(); f.method(); 
It is the same with attributes, you can use it if it is static without having to instantiate the class in an object. 
YourClass.VAR; instead of : YourClass f = new YourClass(); f.VAR();  
*/  



******Static Vs Non Static****** 
// To access a NON-STATIC method, you would have to create a new object as follows: 
public class Vehicle { public static void horn() { 
//Non-Static method 
System.out.println("Beep"); } } public class MyClass { public static void main(String[ ] args) { Vehicle car = new Vehicle(); car.horn(); 

//OUTPUT; Beep 
// To access a STATIC method, you use class_name.(dot) method_name since the method belongs to the class. No object needs to be created. 
public class Vehicle { public static void horn() { 
//Static method 
System.out.println("Beep"); } } public class MyClass { public static void main(String[ ] args) { Vehicle.horn(); } } 
//OUTPUT; Beep
  
  
