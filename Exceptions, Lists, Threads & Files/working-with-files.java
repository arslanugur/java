Working with Files
      The java.io package includes a File class that allows you to work with files.
      To start, create a File object and specify the path of the file in the constructor.
import java.io.File;
...
File file = new File("C:\\data\\input-file.txt");

      With the exists() method, you can determine whether a file exists.
import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\sololearn\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}

      The code above prints a message stating whether or not the file exists at the specified path.
      
      The getName() method returns the name of the file.
      Note that we used double backslashes in the path, as one backslash should be escaped in the path String.

      If you are working on Linux, its even simpler :) File x = new File("/home/username/Desktop/a.txt");
      
      
      to determine whether the file exists.
class A {
   public static void main(String args[ ]) {
   File file = new File("a.txt");
   if(file.exists()) {
     System.out.println("Yes");
   }
  }
}






