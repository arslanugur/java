Binary Search in Java
    /*Binary Search is searching the sorted array by repeatedly dividing the search interval in half. 
      We can use recursion to implement the algorithm. 
      During each iteration, we take the middle element, compare it with the searched value, 
      then take the corresponding half and repeat the process.*/
      
    //Our function will search for the value x in the array arr:
class LinearSearch {
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 23, 42, 77, 100};
        int x = 42;
        System.out.print(binarySearch(arr, 0, arr.length - 1, x));
    }
} // output: 3

      //We return -1, if the element is not found.
      
      //It's very important to mention that the array must be sorted before implementing the binary search on it.
            
      /*
      what is the result of mid if "lo = 0" and "hi = 7" (mid=(lo+hi)/2=??)
      In Java, as in many programming languages (not like in Python for example), 
      when you divide an integer 'int' by another 'int' the result is an 'int'. 
      Always it's rounded down. So in the question, mid = 7/2 = 3.
      */

      //It's faster than linear search. as it operates on O(logn) in worst case. much quicker than the recursive one.
      
      //Here's an implementation without using recursion:
public class BinarySearch
{
    public static int binarySearch(int[] arr, int x)
    {
        int n, lo, hi, mid;
        n = arr.length;
        lo = 0;
        hi = n - 1;
        
        /* searching - worst case complexity is 
           O(log n) */
        
        while (lo<hi) {
            mid = (lo + hi)/2;
            if (x == arr[mid])
                return mid;
            else if (x > arr[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}     //output: No output.


      //Another Example:
/*
Two examples where you can use binary search and how it works.
l = left
r = right
m = middle 
*/

import java.util.Random;
import java.util.Arrays;

public class Program
{
    //find a peak in an array
    //e.g. a b c d
    //b is a peak if b >= a && b >= c
    public static int getPeak(int[] arr, int l, int r){
    
        int m = (l + r) / 2;
        
        //if the value in the middle is smaller than its left neighbour: search on the left side
        if(m > 0 && arr[m] < arr[m - 1]){
            
            return getPeak(arr, l, m - 1);
        }
        
        //if the value in the middle is smaller than its right neighbour: search on the right side
        if(m < r && arr[m] < arr[m + 1]){
            
            return getPeak(arr, m + 1, r);
        }
        
        //peak is found 
        return arr[m];
    }
    
    //find index of value x in a sorted array
    public static int getIndex(int[] arr, int l, int r, int x){
        
        int m = (l + r) / 2;
        
        //x is in the middle of the array
        //return m
        if(arr[m] == x){
            
            return m;
        }
        
        //x is larger than the value in the middle: search on the right side
        if(m < r && arr[m] < x){
            
            return getIndex(arr, m + 1, r, x);
        }
        
        //x is smaller than the value in the middle: search on the left side
        if(m > 0 && arr[m] > x){
            
            return getIndex(arr, l, m - 1, x);
        }
        
        //x is not found
        return -1;
    }
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int n = rand.nextInt(16) + 1;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            
            arr[i] = rand.nextInt(21) - 10;
        }
               System.out.println(Arrays.toString(arr));
        System.out.println("peak: " + getPeak(arr, 0, n - 1));
        
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int num = 5;
        int index = getIndex(arr, 0, n - 1, num);
        
        System.out.print("index of number " + num + ": ");        
        if(index == -1){            
            System.out.print("not found");       
        }else{            
            System.out.print(index);
        }   
    }
}


      //Another Example combined with Bubble Sort (Sort and search in one place):
import java.util.Scanner;
class SortingAndSearching {
      /* for small list(s) i prefer bubble sort it is straight forward.
      --Here we just compare adjacend elements in a list and compare them if they are not in order */
    static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for(int i=0; i<arr.length-1; i++) {
            swapped = false;
    /* NB: array indexes starts from zero, so we will have arr.length - 1. */
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                //exchanging(swapping)
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
/**arr => array to be searched
   right=> rightMost index
   left=> leftMost index
   item=> the item that you searching for.
   
   hence, static int binarySearch(int arr[], int left, int right, int item) */
    static int binarySearch(int arr[], int left, int right, int item) {
        if (right >= left) {
        //dividing the array into two sections
            int mid = left + (right - left) / 2;
            if (arr[mid] == item)
                return mid;
/if the middle item is greater than the 'item' , then the middle item of the subArray to left is compared/
            if (arr[mid] > item)
                return binarySearch(arr, left, mid - 1, item);
            else
/if the middle item is less than the 'item' , then the middle item of the subArray to right is compared/
                return binarySearch(arr, mid + 1, right, item);
        }
        //when the item is not found.
        return -1;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
         
        int[] arr = {50, 30, 25, 75, 82, 28, 63, 70, 4, 43, 74, 35};
        //sorting the given array
        bubbleSort(arr);
        
        System.out.println("Enter a value from this list to find its index:");
        System.out.println(" {50, 30, 25, 75, 82, 28, 63, 70, 4, 43, 74, 35}; ");
        System.out.println();
        
        int item = sc.nextInt();
        //searching for the input value from the given list.
        System.out.print("The item : " +item+" ,is found at index: "+binarySearch(arr, 0, arr.length - 1, item)+" and at position : "+ (binarySearch(arr, 0, arr.length - 1, item) + 1)+" in the array." );
    }
}
        
     
