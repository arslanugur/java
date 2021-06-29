Matrix Multiplication in Java
    /*The result of an m by n matrix multiplied by an n by k matrix results in an m by k matrix. 
      Each element of that matrix is the dot product of each corresponding row of the first matrix 
      and the corresponding column of the second matrix.*/

      //Let's define a function mult, that will take the two arrays as arguments, and returns their multiplication:
public class Matrix {

    static int[][] mult(int a[][], int b[][]) {
        int rows = a.length;
        int cols = b[0].length;
        int size = b.length;
        int[][] res = new int[rows][cols];

        for(int k = 0; k < rows; k++) {
            for(int j = 0; j < cols; j++) {
                int ret = 0;
                for(int x = 0; x < size; x++) {
                    ret += a[k][x] * b[x][j];
                }
                res[k][j] = ret;
            }
        }
        return res;
    }
  
    static void print(int a[][]) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2},
            {0, 1},
            {1, 0}};
      
        int b[][]= {
            {1},
            {0}};
            
        print(mult(a, b));
    }
}
/*output: 
1
0
1
*/

      /*
      The code above iterates through the elements of the arrays 
      and calculates their corresponding dot products in the res array.

      Remember, to multiply two matrices, 
      the first one's number of columns must be equal to the second one's number of rows.
      
      This function could be improved by adding try... 
      Catch to avoid errors due to incoherence in matrices dimensions
      You better use a numeric library when you need you multiply matrices. 
      Many optimizations will be added. 
      https://en.m.wikipedia.org/wiki/List_of_numerical_libraries
      */
      
      
     
