Matrix Transposition in Java
      The transpose of an m by n matrix is an n by m matrix. Transposition swaps the rows and the columns of a matrix.
      
      Let's define a transpose function, that will take a two-dimensional array and return it's transpose:
public class Matrix {

    static int[][] transpose(int a[][]) {
        int res[][] = new int[a[0].length][a.length];
        for(int k = 0; k < a.length; k++)
            for(int j = 0; j < a[0].length; j++)
                res[j][k] = a[k][j];
        
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
            {1, 2, 3, 4},
            {5, 6, 7, 8}};
    
        print(transpose(a));
    }
}
/*output: 1 5
          2 6
          3 7
          4 8 */
          
          
          

