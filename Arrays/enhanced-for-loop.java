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
