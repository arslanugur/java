Creating Files
      Formatter, another useful class in the java.util package, is used to create content and write it to files.
      Example:Formatter, another useful class in the java.util package, is used to create content and write it to files.
      Example:
import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\sololearn\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}

      This creates an empty file at the specified path. If the file already exists, this will overwrite it.
      
      Again, you need to surround the code with a try/catch block, as the operation can fail.
      
      Formatter class is used to write content to files?
      
      To append to file instead of overwriting you could use FileWriter...
      see example in below:
import java.io.FileWriter; 
import java.util.Formatter; 

public class Program { 
    public static void main(String[] args) { 
  try{ 
    FileWriter fw = new FileWriter("test.txt",true); 
    Formatter f = new Formatter(fw); 
    f.format("%s : %s","1","Tiger"); 
    f.format("%s : %s","2","Cat"); 
    f.close(); 
    
    System.out.println("File saved"); 
  }catch(Exception e){ e.printStackTrace(); } } }
  
  
  
        why using formatter for creating new files whereas u can do it by just using createNewFile () method of Java.
        createNewFile will touch a file, but not write to it. 
        You can write to files without a Formatter, but when using a Formatter, the file will be created anyway.
  
  
Writing to Files
      Once the file is created, you can write content to it using the same Formatter object's format() method.
      Example:
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");
            f.close();

            File x = new File("test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}
//output:
1
John
Smith
2
Amy
Brown
//

      The format() method formats its parameters according to its first parameter.
      %s mean a string and get's replaced by the first parameter after the format. 
      The second %s get's replaced by the next one, and so on. 
      So, the format %s %s %s denotes three strings that are separated with spaces.
      Note: \r\n is the newline symbol in Windows.
      The code above creates a file with the following content:
1 John Smith 
2 Amy Brown

      Don't forget to close the file once you're finished writing to it!
      
      Should be: f.format("%s %s %s %n", "1","John", "Smith"); f.format("%s %s %s %n", "2","Amy", "Brown"); 
      Poor example provided. Shouldn't have the new line in the last name argument, that's just poor design. 
      %n in the format string argument will give you platform specific new line when using Formatter.

      Code to Append - Overwrite - Reading data:
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            File fl = new File("test.txt");
            if(!fl.exists()) {
                // add new file - Overwrite .
                Formatter f = new Formatter(fl);
                f.format("%s %s %s", "1","John", "Smith \r\n");
                f.format("%s %s %s", "2","Amy", "Brown");
                f.close();
            }

            // test Appending to existed file
            FileWriter fw = new FileWriter(fl);
            fw.append("\r\nNow we append this text to the Magic . :)\r\n");
            fw.close();
            // Reading
            File x = new File("test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}
//
Now
we
append
this
text
to
the
Magic
.
:)
//

       to write "Hi there" to the file.
Formatter f = new Formatter("a.txt");
f.format("%s", "Hi ");
f.format("%s", "there");
f.close();

