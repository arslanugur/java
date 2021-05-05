Multidimensional Arrays
      //Multidimensional arrays are array that contain other arrays. The two-dimensional array is the most basic multidimensional array.
      //To create multidimensional arrays, place each array within its own set of square brackets.
      //Example of a two-dimensional array:
int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 


      //This declares an array with two arrays as its elements.
      //To access an element in the two-dimensional array, provide two indexes, one for the array, and another for the element inside that array.
      //The following example accesses the first element in the second array of sample.
public class Program {
    public static void main(String[] args) {
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
        int x = sample[1][0];
        System.out.println(x);
    }
}   //output: 4

      //The array's two indexes are called row index and column index.


      //What is the output of this code?
String array[ ][ ] =  { {"Hey", "Joe", "Bye"}, {"Joe", "MisterJones", "Hello"} }; 

   System.out.println(array[1][1]);   //output: MisterJones

      //[0] [0] = hey , [0] [1] = joe , [0] [2] = bye , [1] [0] = joe , [1] [1] = MisterJones , [1] [2] = hello

      //You can get and set a multidimensional array's elements using the same pair of square brackets.
public class Program {
    public static void main(String[] args) {
        int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
        myArr[0][2] = 42;
        int x = myArr[1][0];
        
        System.out.println(x);
    }
}     //output: 4

      //The above two-dimensional array contains three arrays. 
      //The first array has three elements, the second has a single element and the last of these has three elements.

      //In Java, you're not limited to just two-dimensional arrays. 
      //Arrays can be nested within arrays to as many levels as your program needs. 
      //All you need to declare an array with more than two dimensions, is to add as many sets of empty brackets as you need. 
      //However, these are harder to maintain.
      //Remember, that all array members must be of the same type.


      //What is the output of this code?
int array[ ][ ] =  {{3, 5, 8}, {7, 54, 1, 12, 4}}; 
System.out.println(array[0][2]);   //output: 8

      //What is the output of this code?
int arr[ ] = new int[3];
for (int i = 0; i < 3; i++) {
   arr[i] = i;
} 
int res = arr[0] + arr[2];
System.out.println(res);    //output: 2

      //What is the output of this code?		
int result = 0;
for (int i = 0; i < 5; i++) {
  if (i == 3) { 
     result += 10;
   } else {
     result += i;
   }	
}
System.out.println(result);

Solution:
assign value : result = 0 i = 0,1,2,3,4 
  operations : result += i i == 3, result += 10 
     explain : i = 0, result += 0         = 0  
               i = 1, result += 1   0 + 1 = 1  
               i = 2, result += 2   1 + 2 = 3  
               i = 3, result += 10  3 + 10= 13 
               i = 4, result += 4   13+ 4 = 17        //output : 17


      //to calculate the sum of all elements in the array "arr" using an enhanced for loop:
int res = 0;

for (int el : arr) {
  res += el;
}

res(result/total) is a integer variable declared at the beginning to store numbers. "result" are shortened to save memory and space.
el(element) is also declared inside the 'for' loop. 
then el gets its value from the elements of the array arr. 
  
Essentially it works like Total = 0 For each element in array{ Total=total+element } 
Thus total now contains the sum of all the elements in the array. 
An element is just a smaller part of something. 
Thus an array of 5 numbers has 5 elements. Also a for loop can be told to loop with many things. 
Using numbers as counters is only one of them. 
  
In this example we see that it's told to loop the number of times as there are elements in the array. 
This tells it what to start on (it assumes start of array) and how long to go on for and it assumes to increment. 
Such assumptions can be changed too assuming you know the correct syntax such as For (el:array, el--) 
it sums all the values of each element. 
So if the array is Int [] Arr = {0,1,2,3}; 
output is value of el = 1 
          value of el = 2 
          value of el = 3 
          
          value of res = 6 
          As a result 'el' means value of each index. 
      
      

