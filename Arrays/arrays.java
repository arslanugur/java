Arrays
    /*An array is a collection of variables of the same type.
      When you need to store a list of values, such as numbers, 
      you can store them in an array, instead of declaring separate variables for each number.

      To declare an array, you need to define the type of the elements with square brackets.*/
      
      //to declare an array of integers:
int[ ] arr;

      //The name of the array is arr. The type of elements it will hold is int.

      //Now, you need to define the array's capacity, or the number of elements it will hold. To accomplish this, use the keyword new
int[ ] arr = new int[5];



      //The code above declares an array of 5 integers.
      //In an array, the elements are ordered and each has a specific and constant position, which is called an index.

      //To reference elements in an array, type the name of the array followed by the index position within a pair of square brackets.
      //Example:
arr[2] = 42;

      //This assigns a value of 42 to the element with 2 as its index.
      //Note that elements in the array are identified with zero-based index numbers, 
      //meaning that the first element's index is 0 rather than one. So, the maximum index of the array int[5] is 4.
  
      //In Java, an array starts counting from 0

Initializing Arrays
      //Java provides a shortcut for instantiating arrays of primitive types and strings.
      //If you already know what values to insert into the array, you can use an array literal.
      //Example of an array literal:
public class Program {
    public static void main(String[] args) {
        String[ ] myNames = { "A", "B", "C", "D"};
        System.out.println(myNames[2]);
    }
}   //output: 0

      //Place the values in a comma-separated list, enclosed in curly braces.
      //The code above automatically initializes an array containing 4 elements, and stores the provided values.
      //Sometimes you might see the square brackets placed after the array name, which also works, 
      //but the preferred way is to place the brackets after the array's data type.

      //What is the output of this code?
int tmp[ ] = {5, 8, 9, 3};
System.out.println(tmp[2]);   //output: 9



Array Length
      //You can access the length of an array (the number of elements it stores) via its length property.
      //Example:
public class Program {
    public static void main(String[] args) {
        int[ ] intArr = new int[5];
        System.out.println(intArr.length);
    }
}     //output: 5

      //to retrieve the number of elements in an array called "test".
      test.length


      //Now that we know how to set and get array elements, we can calculate the sum of all elements in an array by using loops.
      //The for loop is the most used loop when working with arrays, 
      //as we can use the length of the array to determine how many times to run the loop.
public class Program {
    public static void main(String[] args) {
        int [ ] myArr = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}     //output:58

      //In the code above, we declared a variable sum to store the result and assigned it 0.
      //Then we used a for loop to iterate through the array, and added each element's value to the variable.
      //The condition of the for loop is x<myArr.length, as the last element's index is myArr.length-1.
  

      //to calculate the sum of myArray's elements using the for loop, and print it to the screen. 
      //myArray is an array of doubles, containing 4 elements.
double sum = 0.0;
  for (int x = 0; x < 4; x++) {
   sum += myArray[x];       //sum += myArray[x] is like this : sum = sum + myArray[x] double is used to express Fractioned numbers
}

System.out.println(sum);

/*
1. Firstly, we have our values listed as floats. 
2. We needed to explicitly state that x = 0.0 
   so it can be in proper format with the floats (decimal). Without stating x = 0.0, 
   the variable would not be properly defined when it comes time for the "for" loop. 
3. The "for" loop states the following: x = 0 (we already knew this). 
   The condition of the loop says, "as long as 4 is greater than 0 (our x variable), 
   then we should continue to the next element in our array. 
4. The next line states in order to get the "sum" we need to add each element in the array, 
   one by one (remember because "for" loops will continue to cycle through the array as long as the loop allows it). 
5. Lastly, we print out the "sum".
*/     



Enhanced for Loop
            //The enhanced for loop (sometimes called a "for each" loop) is used to traverse elements in arrays.
            //The advantages are that it eliminates the possibility of bugs and makes the code easier to read.
public class Program {
    public static void main(String[] args) {
        int[ ] primes = {2, 3, 5, 7};
        
        for (int t: primes) {
            System.out.println(t); 
        }
    }
}
/*2
  3
  5
  7*/

            //The enhanced for loop declares a variable of a type compatible with the elements of the array being accessed. 
            //The variable will be available within the for block, and its value will be the same as the current array element.
            //So, on each iteration of the loop, the variable t will be equal to the corresponding element in the array.     

            //Notice the colon after the variable in the syntax.     
     

            //to use the enhanced for loop for an array called "arr":
int total = 0;

for(int x: arr) {
   total += x;
}


