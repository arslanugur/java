Defining Attributes
      //A class has attributes and methods. The attributes are basically variables within a class.
      //Let's create a class called Vehicle, with its corresponding attributes and methods.
public class Vehicle {
  int maxSpeed;
  int wheels;
  String color;
  double fuelCapacity;  

  void horn() {
    System.out.println("Beep!");
  }  
}

      //maxSpeed, wheels, color and fuelCapacity are the attributes of our Vehicle class, and horn() is the only method.
      //You can define as many attributes and methods as necessary.
      
      //to define a class with these attributes: age of type integer, height as a double, and name as a string.
class Person {
  int age;
  double height;
  String name;
}


Creating Objects
      //Next, we can create multiple objects of our Vehicle class, and use the dot syntax to access their attributes and methods.
public class Vehicle {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;  
    
    void horn() {
        System.out.println("Beep!");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
    }
}   //output: Beep!


      //to create two objects from the class "People".
People obj1 = new People();
People obj2 = new People();

