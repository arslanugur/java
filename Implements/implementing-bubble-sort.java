Bubble Sort in Java
      Bubble sort is used to sort a list of elements, 
      by comparing two adjacent elements and swapping em, if they are not in order. 
      
      Code:
public class Program
{
  static void bubbleSort(int[] arr) {
    boolean swapped = true;
    for(int j=0; j<arr.length-i-1; j++) {
      if(arr[j] > arr[j+1]) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swapped = true;
      }
    }
    if(swapped == false)
      break;
  }
}
static void printArray(int[] arr) {
  for(int i=0; i<arr.length; i++) {
    System.out.print(arr[i] + " ");
  }
}
public static void main(String[] args) {
  int[] arr = {5, 2, 42, 6, 1, 3, 2};
  bubbleSort(arr);
  printArray(arr);
  }
}
 
//output: 1 2 2 3 5 6 42

      The boolean swapped is used to determine if swapping occurred during an iteration.
      If no swapping happened, then the array is sorted and we can break the loop.
        
        
        
        
