Adding Matrices in Java
      Consider two matrices, which are represented by the two-dimensional arrays a and b.
      To add them together, 
      we need to iterate through all elements of the arrays, 
      add the corresponding elements and store the values in a res array.
      
      Example:
public class Matrix {

    static int[][] add(int a[][], int b[][]) {
        int res[][] = new int[a.length][a[0].length];
        for(int k = 0; k < a.length; k++)
            for(int j = 0; j < a[0].length; j++)
                res[k][j] = a[k][j] + b[k][j];
                
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
        {5, 6, 7, 8},
        {9, 10, 11, 12}};
        
        int b[][] = {
        {12, 11, 10, 9},
        {8, 7, 6, 5},
        {4, 3, 2, 1}};
    
        int res[][] = add(a, b);
        print(res);
    }
}    
/*output: 13 13 13 13
          13 13 13 13 */

      The method add takes two arrays, a, b as its arguments. 
      Two loops iterate through their elements and store the sum of a's and b's corresponding elements in the res array.
      
      Remember, to add matrices, their sizes need to be the same.
      
      Some libraries for matrix computation:
      - Apache Commons Math
      - COLT
      - JAMA
      
      
      Matrix Sum Example:
import java.util.Scanner;
public class MatrixAdd{
    int m, n;
    int[][] A;
    int[][] B;
    int[][] sum;
    
    MatrixAdd(int m, int n){
        this.m = m;
        this.n = n;
        A = new int[m][n];
        B = new int[m][n];
        sum = new int[m][n];
    }
    
    public void setMatrixA(Scanner scan){
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                A[row][col] = scan.nextInt();
            }
        }
    }
    
    public void setMatrixB(Scanner scan){
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                B[row][col] = scan.nextInt();
            }
        }
    }
    
    public void getMatrixSum(){
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                sum[row][col] = A[row][col] + B[row][col];
                System.out.print(sum[row][col] + " ");
            }
            System.out.println();
        }
    }
}
public class Matrix{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input m = ");
        int m = scan.nextInt();
        System.out.print("Input n = ");
        int n = scan.nextInt();
        
        MatrixAdd matrixAdd = new MatrixAdd(m, n);
        matrixAdd.setMatrixA(scan);
        matrixAdd.setMatrixB(scan);
        
        matrixAdd.getMatrixSum();
    }
}

      Condition total number of columns and rows should be equal in both matrices.
      
      The idea of the sizes of the matrices must be equal makes it so easy to understand the code 
      by comparing to the matrices multiplication where you could get confused



