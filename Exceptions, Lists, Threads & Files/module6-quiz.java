      to declare a function that takes two integers as arguments and prints their division. 
      Handle the possible exception.
void myFunc(int a, int b) {
 try{
    System.out.println(a / b);
  }
  catch(Exception e) {
     System.out.println("Error");
  }
}


      to define a function ''myFunc'', which throws an exception if its parameter is less than 0.
void myFunc(int arg)
 throws IllegalArgumentException
{
 if (arg < 0)
   throw new IllegalArgumentException();
}

      throws "IllegalArgumentException" Is a name, it means nothing to the compiler, 
      it could be named "Frank" and the compiler wouldn't care. 
      Because .this is just a name, there is no memory set aside for it. 
      So, to make "IllegalArgumentException" mean something to the compiler, 
      to set aside memory for the intended function you must write 
      "throw new IllegalArgumentException()" "new" and "()" is 
      what makes this a working fuction/method (if you program correctly) instead of just a name.

      
      How many lines of output will this code produce?
class B implements Runnable {
   public void run() {
     System.out.println("B");	
   }
}
class A extends Thread {
   public void run() {
    System.out.println("A");
    Thread t = new Thread(new B());
    t.start();
   }
public static void main(String[ ] args) {
   A object = new A();
   object.start();
   }
}
      First, read what's the first line of code inside the main() function. 
      It creates an object from A class, and then start() the object, which is refer to the A class. 
      Then, you should look at the inside of A class. There are few programs written to it. 
      First, you print the "A" (this is the first line in the output), 
      and then you have to refer to the B class (because it creates a thread that refer to the B class). 
      Inside the B class, it prints "B" (which is the second line in the output). 
      So, the output will be: A B
      
      The answer is 2, for the simple fact that the coder used the println method and not print. 
      What println does, is output something and create a new line in the console. 
      So whatever method gets called first, println prints something and wraps up with a new line. 

      Notice that within Class A, the run() method is defined to print "A", 
      AND then start a thread using Class B, whose run() method prints "B". 
      Hence we print 2 lines of code just by starting a thread defined in Class A.
      
      in the main method first, it will execute the run method in the class A. 
      for that it used the start method. 
      after then it will print the string "A" in the first line. 
      there is a thread object called t in class A 
      and it has passed runnable class B to its constructor 
      and start the thread by calling the start() method. 
      in that part, it will execute the run method in class B and print the String "B" in next line.
      
      Which two options allow you to create new threads?
      -extend the Thread class
      -implement Runnable
      
      
      
      What is the output of this code?
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < 6; i++) {
	list.add(i);
}
int x = 0;
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
	x+= it.next();	
}
System.out.println(x);
      
      i increases by one each time and continues to run as long as i is less than 6. 
      We are incrementing for i as below: when; i = 0 i = 1 i = 2 i = 3 i = 4 i = 5 
      The loop stops at 5 since 0 takes the first index when i < 6. 
      i is at zero since we start counting from 0 when dealing with array list. 
      As long as i <6, we add as below 
      since we're dealing with i++(means to increment by 1): 0+1+2+3+4+5 = 15 
      Output = 15
      
      Maths:
      The program is about adding number from 0 to 5. 
      From the Gauss formula n(n+2N-1)/2 Replace with values 6(6+(2*0)-1)/2 So the result is 15.
      
      
      What is the output of the following code?
int f=1, i=2;
while(++i<5)
   f*=i;
System.out.println(f);
      
      Answer is 12. 
      Here is why; f=1 i=2 
      first loop : f=1, i=3, f*i = 3 -- first loop i=3 because ++2 = 3 f=3 because 1*=3 = 3 
      second loop : f=3, i=4, f*i = 12 -- second loop i=4 because ++3=4 f=12 because 3*=4 = 12
      third loop stops because 5 < 5 is not true
      
      The difference here is between i++ (post incremental) and ++i (pre-incremental). 
      For a condition like (i++ < 5) where i = 2, 
      the condition will be evaluated as 2 < 5 then i is incremented to 3 (hence post), 
      whereas a condition like (++i < 5) where i =2, 
      i is incremented first to make i = 3 (hence pre) then the condition 3 < 5 is evaluated.
      1 * 3 * 4  = 12
      
      
      
      
      
      
      
