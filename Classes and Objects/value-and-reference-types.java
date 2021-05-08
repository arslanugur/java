Value Types
      //Value types are the basic types, and include byte, short, int, long, float, double, boolean, and char.
      //These data types store the values assigned to them in the corresponding memory locations.
      //So, when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.

      //Example:
public class MyClass {
    public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);       
    }

    static void addOneTo(int num) {
        num = num + 1;
    }
}         //output: 5

      //The method from the example above takes the value of its parameter, 
      //which is why the original variable is not affected and 5 remains as its value.

      //What is the output of this code?
public static void main(String[ ] args) {
   int x = 4;
   square(x);
   System.out.println(x);		
}
static void square(int x) {
   x = x*x;
}       //output: 4



Reference Types
      //A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
      //When you create an object using the constructor, you create a reference variable.

      //For example, consider having a Person class defined:
public class MyClass {
    public static void main(String[ ] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
  }
    
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}

public class Person {
    private String name;
    private int age;
    
    Person (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
}     //output: 21


      //The method celebrateBirthday takes a Person object as its parameter, and increments its attribute.
      //Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
      
      //Arrays and Strings are also reference data types.

      //What is the output of this code?
public static void main(String[ ] args) {
  Person p = new Person();
  p.setAge(25);
  change(p);
  System.out.println(p.getAge());
}
static void change(Person p) {
  p.setAge(10);
}             //output: 10



