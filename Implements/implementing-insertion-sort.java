Insertion Sort in Java
      Insertion sort is used to sort a list of elements, 
      by taking each element and inserting it in the corresponding position to the left.
      
      Example:
class InsertionSort {
    static void InsertionSort(int arr[]) {
        int j;
        for(int i=1; i<arr.length; i++) {
            j = i;
            while(j>0 && arr[j-1] > arr[j]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                
                j = j-1;
            }
        }
    }

    public static void main(String args[]) { 
        int arr[] = {5, 2, 42, 6, 1, 3, 2};
        InsertionSort(arr);
        
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
} // output: 1 2 2 3 5 6 42

      We go through each element of the array, starting from the second one. 
      For each element we swap it with its left neighbor, until it is in its corresponding position.
      
      Swapping until the correct position is not insertion sort, it's shuttle sort.

      For insertion sort, the number wanting to be sorted is stored in a temporary variable, 
      the correct index for the value is then found, 
      once found all values between the original index of the value in temp
      and the correct index for the value in temp are shifted one place to the right, 
      the value held in temp is then placed in the correct position.

      This sorting algorithm uses less assignments than the proposed solution (which is shuttle sort).
      As you don't swap (make 3 assignments for every position) for every place until the correct position.
      
      
      
      The program says to proceed while j > 0, but "j=j-1" makes j equal to ZERO at the first iteration! 
      So, the condition is satisfied at first, the "j=j-1" (which could be j--) is at the end of the iteration, 
      so it runs one time before j equals 0 at the first iteration.
      It compares the 2nd against the 1st, determines whether to swap, 
      then when j becomes Zero it causes u to leave the while loop that checks if you're at Zero. 
      The For loop then goes on to position 3, 
                        does the same to see whether you're at Zero or at a position where u need to swap, 
      then the For goes to the 4th, does the same, 
                      then the 5th, etc eventually to the nth. 
      while it's going, its checking the While condition, 
      so there could be because some For iterations where there are no swaps.



      
      Another Example:
public class InsertionSort{
    private int[] numbers;
    public InsertionSort(int[] numbers){
        
        this.numbers = numbers;
    }
    public void swapNumbers(int i){  
        //num[i] < num[i-1] --> swap it
        //do this until number[i] is not smaller then its left neighbor
        while(i > 0 && numbers[i] < numbers[i-1]){        
            int temp = numbers[i];
            numbers[i] = numbers[i-1];
            numbers[i-1] = temp;
            i--;
        }
    }
    
    public void sortArray(){
        
        //first element is sorted, start with the second element
        //compare each element with its left neighbors
        for(int i = 1; i < numbers.length; i++){
            swapNumbers(i);
        }
    }
    
    public void printArray(){
       for(int i = 0; i < numbers.length; i++){
           System.out.print(numbers[i] + " ");
       }       
       System.out.println();
    }
}

import java.util.Random;
public class Program
{
    public static void main(String[] args) {        
        Random rand = new Random();
        int[] numbers = new int[10];        
        for(int i = 0; i < 10; i++){            
            numbers[i] = rand.nextInt(30) - 15;
        }
        
        InsertionSort insertion = new InsertionSort(numbers);        
        insertion.printArray();
        insertion.sortArray();
        insertion.printArray();
        
    }
}
      
      I think that recursion will be a better way to a sorted insertion, O(n)
      
      Another Example:
public class InsertionSort{
static int[] insertionSort(int[] arr){
    //Take second element of array. Sort into the correct position on the left.
    //Repeat for all elements, placing them in the correct positions till array is sorted   
        for(int i = 1; i < arr.length; i++){
            int main = arr[i];
            //'main' is the element presently being inserted into correct position        
            for(int j = i - 1; j > -1; j--){
                if(main < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i--;
                }  
            }
        }          
        return arr;
    }
    
    
    
    static void print(int[] arr){
        //prints array
        for(int k = 0; k < arr.length; k++ ){
            System.out.print(arr[k] + " ");
            }
        System.out.println();
    }

    
    public static void main(String[] args){
        int[] myArr = {3, 7, 4, 2, 5, 1, 6, 10, 9, 8};
        System.out.print("Array Before Insertion Sort: " );
        print(myArr);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        insertionSort(myArr);
        System.out.print("Array After Insertion Sort: " );
        print(myArr);
    }
}

      Another Example (Insertion Sort Generic Method:
public class Java{
  
  static Integer[] array= {4,10,12,3,1,5};
  static String[] names= {"Ben","Eloise","John", "Jack", "Kate", "Elizabeth", "Aaron", "John"};
  
  static <T extends Comparable<T>> void insertionSort(T[] arr){
    
    T current;
    int position;
    for( int pointer=1;pointer<arr.length;
         pointer++ ){
      current= arr[pointer];
      
      position= pointer-1;
      while(position>=0     &&
       (arr[position].compareTo(current)>0)){
        
        arr[position+1]= arr[position];
        position--;
      }
      arr[position+1]= current;
    }  
  }
  
  
  public static void main(String[] args){
    
    insertionSort(array);
    for(int element: array)
      System.out.print(element+" ");
      
    System.out.println();
    
    insertionSort(names);
    for(String element: names)
      System.out.print(element+" ");
  }
}

/*
 Differences:
 
 Line 3:  Array is type of Integer (non primitive type).
 Line 4:  Added String array named: "names";
 Line 6:  Method is now generic.
 Line 8:  Current variable is type T.
 Line 15: Second While Loop condition is changed:
      
      (arr[position].compareTo(current)>0)
          We can't use relation operators when comparing two objects. 
          We call instance method compareTo(T obj).
          It returns 1 if the arr[position] is greater than current.
          4.compareTo(7) => returns -1
          4.compareTo(4) => returns 0
          4.compareTo(2) => returns 1
          
          Method compareTo() works little bit differently for Strings.
      
      
 Notes:

 Line 11: Current variable is necessary, 
          because in While Loop we could override element which index is equal to pointer.
          arr[pointer]==arr[position+1] in 0° While iteration.
 
 Line 14: Note that first condition is checking is the position greater or equal to zero 
          and THEN we are checking if the arr[position+1] is greater than current value. 
          If we change the order, or try to use & operator (instead of &&) we may get ArrayIndexOutOfBoundsException.

 Line 15: Change relation operator > into < to get array sorted in descending order.

 We use Insertion sort algorithm when:   
  - the array is relatively small;
  - it is almost sorted
  - we want to insert an element in already
    sorted array (Highscore board);
      
 Complexity: O(n²) 
 Stable
*/
      
      Another Example:
public class Java{
  static int[] array= {4,10,12,3,1,5};
  static void insertionSort(int[] arr){
    int current;
    int position;
    for( int pointer=1;pointer<arr.length;
         pointer++ ){
      current= arr[pointer];
      
      position= pointer-1;
      while( position>=0     &&
             arr[position]>current ){
        arr[position+1]= arr[position];
        position--;
      }
      arr[position+1]= current;
    }  
  }
  
  
  public static void main(String[] args){
    insertionSort(array);
    for(int element: array)
      System.out.print(element+" ");
  }
}


/*
 Notes:
 Line 11: Current variable is necessary, 
          because in While Loop we could override element which index is equal to pointer.
          arr[pointer]==arr[position+1] in 0° While iteration.
 
 Line 14: Note that first condition is checking is the position greater or equal to zero 
          and THEN we are checking if the arr[position+1] is greater than current value. 
          If we change the order, or try to use & operator (instead of &&) we may get ArrayIndexOutOfBoundsException.

 Line 15: Change relation operator > into < to get array sorted in descending order.

 We use Insertion sort algorithm when:
  - the array is relatively small;
  - it is almost sorted
  - we want to insert an element in already sorted array (Highscore board);
      
 Time Complexity: O(n²)
 Stable
*/
      
      
      
      Another Example:
public class Program
{
    static int[] InsertionSort(int [] arr)
    {
        int i = 0;
        
        for(int k = 1; k < arr.length; k++)
        {
        i = k;
            while(i > 0 && arr[i - 1] > arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                
                i--;
                
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] testCase = new int[]{5, 1, 7, 8, 4, 2, 9, 3, 6};
        
        int [] result = InsertionSort(testCase);
        for(int x = 0; x < result.length; x++)
        {
            System.out.print(result[x] + " ");
        }
    }
}
      
            
      
      
      
      
