      Anonymous classes are a way to extend the existing classes on the fly.
      For example, consider having a class Machine:
class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

      When creating the Machine object, we can change the start method on the fly.
class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
}      //output: Wooooo


      After the constructor call, we have opened the curly braces and have overridden the start method's implementation on the fly.
      
      The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden.
        
      to override the start method of the Machine class.
Machine m = new Machine() {
@Override public void start() {
      System.out.println("Hi");
   }
}
        
      The modification is applicable only to the current object, and not the class itself. 
      So if we create another object of that class, the start method's implementation will be the one defined in the class.
class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        Machine m2 = new Machine();
        m2.start();
    }
}     //Starting...

      First you have to create an instance of the Machine class. So we need the ( new ) keyword. 
      Next to override on the fly we need the ellipse ( @ ) symbol to implement the override feature. And the name of the method where overriding is ( start )
      1.In this example we learnt about over-riding. There is no much explanation about anonymous class. 
      2. We don't need @override keyword to run this code. Will work without it.
        
        
      to print "Hello".
class A {
   public void print() {
   System.out.println("A");
   }		
}
class B {				
   public static void main(String[ ] args) {	
A object = new A() {
      @Override public void print() {
       System.out.println("Hello");
       }
    };
    object.print();
   }		
}

      We override class A. B object = new A is jused in superclass and subclass.
      The program is written bizarrely, but the "Class B" is actually a class made specifically to run the main method. 
      Since there is no B object, it simply exists to run the main method for an A object and override it.



        
        
        
