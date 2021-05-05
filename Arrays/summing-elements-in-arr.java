Summing Elements in Arrays
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
