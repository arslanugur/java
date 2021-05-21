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
class A  Thread {
   public void () {
      System.out.println("Hello");
   }
   public static void main(String[ ] args) {
   A object = new A();
   object. ();
   }
}

	We use start() method, because we need Threads to be executed for efficiency, 
	if we call run() it will not call Thread, it will be a Normal Method call.
		
		
		
		
		
