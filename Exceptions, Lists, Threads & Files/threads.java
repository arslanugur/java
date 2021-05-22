Threads
      Java is a multi-threaded programming language. 
      This means that our program can make optimal use of available resources by running two or more components concurrently, 
      with each component handling a different task.
      You can subdivide specific operations within a single application into individual threads that all run in parallel.
      The following diagram shows the life-cycle of a thread.
        
      New Thread() ----> New --Start()--> Runnable() --run()-->
		    |				          |	
		   Dead    <---End of execution----    Running
		    |				          |
		    <-----   Waiting <----Sleep(), wait()---  

      	There are two ways to create a thread.
	1. Extend the Thread class
	Inherit from the Thread class, override its run() method, 
	and write the functionality of the thread in the run() method.
	Then you create a new object of your class and call it's start method to run the thread.
	
	Example: 
class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
}    //output: Hello

	As you can see, our Loader class extends the Thread class and overrides its run() method.

	When we create the obj object and call its start() method, 
	the run() method statements execute on a different thread.

	Every Java thread is prioritized to help the operating system determine the order in which to schedule threads. 
	The priorities range from 1 to 10, with each thread defaulting to priority 5. 
	You can set the thread priority with the setPriority() method.
	
	to run the method in a separate thread.
class A extends Thread {
   public void run() {
      System.out.println("Hello");
   }
   public static void main(String[ ] args) {
   A object = new A();
   object.start();
   }
}

	We use start() method, because we need Threads to be executed for efficiency, 
	if we call run() it will not call Thread, it will be a Normal Method call.
	
	Start() method made run()method work ,its about synchronization, multi-function java has inbuilt to make coding convenient
	object is the object that was been instantiated from class A, and a method call has been performed to start () method. 
	e.g.: object.start() The start() method made the run() statements execute.
		
	Just see the life-cycle diagram of thread in the lesson. 
	when you want to use a thread you must start it. then java execute next overrided methods like run(), sleep() or wait().
		
		
		
	The other way of creating Threads is implementing the Runnable interface.
	Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, 
	and start the Thread by calling the start() method.
	Example:
class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}  //output: Hello

	The Thread.sleep() method pauses a Thread for a specified period of time. For example, 
	calling Thread.sleep(1000); pauses the thread for one second. 
	Keep in mind that Thread.sleep() throws an InterruptedException, 
	so be sure to surround it with a try/catch block.
		
	It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. 
	However, implementing the Runnable interface is the preferred way to start a Thread, 
	because it enables you to extend from another class, as well.
	
	to implement the Runnable interface and run a new thread.
class A implements Runnable {
   public void run() {
   System.out.println("Bye");
   }
}
public class App {
 public static void main(String[ ] args) {
   Thread ob = new Thread(new A());
   ob.start();
   }
}


	Example:	
class hey extends Thread {
int i;
public void run(){
for(i=0;i<=20;i++){
    System.out.println("hey"+i);}
}
}
class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        hey poc = new hey();
        obj.start ();
        poc.start ();
        int i;
        for (i=0; i<=20 ;i++){
            System.out.println(i);
                              }
    }
}

/*output: 
0
...
20
hey0
Hello0
hey1
Hello1
hey2
Hello2
hey3
Hello3
hey4
Hello4
hey5
...
hey11
Hello5
hey12
Hello6
hey13
Hello7
hey14
Hello8
hey15
Hello9
hey16
Hello10
hey17
Hello11
hey18
hey19
Hello12
hey20
Hello13
...
Hello20 */
		
		
