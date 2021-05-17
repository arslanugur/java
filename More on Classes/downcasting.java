Type Casting
      For classes, there are two types of casting.


Upcasting
      You can cast an instance of a subclass to its superclass.
      Consider the following example, assuming that Cat is a subclass of Animal.
Animal a = new Cat();

      Java automatically upcasted the Cat type variable to the Animal type.

Downcasting
      Casting an object of a superclass to its subclass is called downcasting.
      Example:
Animal a = new Cat();
((Cat)a).makeSound();

      This will try to cast the variable a to the Cat type and call its makeSound() method.
      Why is upcasting automatic, downcasting manual? Well, upcasting can never fail. 
      But if you have a group of different Animals and want to downcast them all to a Cat, 
      then there's a chance that some of these Animals are actually Dogs, so the process fails.
  
        
      What is the output of this code?
class A {
   public void print() {
      System.out.println("A");
   }
}
class B extends A {
   public void print() {
      System.out.println("B");
   }
   public static void main(String[ ] args) {
    A object = new B();
    B b = (B) object;
    b.print();
   }
}       //output: B





