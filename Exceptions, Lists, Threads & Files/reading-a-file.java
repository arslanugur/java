Reading a File
      Files are useful for storing and retrieving data, and there are a number of ways to read from a file.
      One of the simplest ways is to use the Scanner class from the java.util package.
      The constructor of the Scanner class can take a File object as input.
      To read the contents of a text file at the path "C:\\sololearn\\test.txt", 
      we would need to create a File object with the corresponding path and pass it to the Scanner object.
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {
}
   
      We surrounded the code with a try/catch block, because there's a chance that the file may not exist.
      
      3 ways to read files in Java by using : -Scanner -FileReader -BufferedReader 
      Never forget to: -use try/catch -never let the catch empty! (print msg at least) -close the file after reading/writing
      
      The code in this section will not work because: catch (FileNotFoundException e) 
      //Throws compilation error - cannot find symbol error catch (Exception e) //Compiles correctly
      
      
      
      
      The Scanner class inherits from the Iterator, so it behaves like one.
      We can use the Scanner object's next() method to read the file's contents. 
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {     
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}

      //When next() is called and there is no next, so to speak, a NoSuchElementException is thrown. 
      We can use hasNext() to check before calling, thus avoiding the exception. 
      In general sense, while (hasNext()) + next() also provides convenient way of iterating through
      
      
      The file's contents are output word by word, because the next() method returns each word separately.
      It is always good practice to close a file when finished working with it. 
      One way to do this is to use the Scanner's close() method.
      
      
      to read and print the content of the file a.txt, and then close it.
try {
   File f = new File("a.txt");
  Scanner sc = new Scanner(f);
  while (sc.hasNext()) {
      String a = sc.next();
      String b = sc.next();
      System.out.println(a + " " + b);
  } 
  sc.close();
} 
catch (Exception e) {
   System.out.println("Error");
}

      We don't need b. the only difference is that without b, it would take more iterations to read the entire file.
      The next() iteration will only take one word from the file and past it to A.
      
      
      
      
      
      
      

