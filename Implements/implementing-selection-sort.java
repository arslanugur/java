Selection Sort in Java
      Selection sort is used to sort a list of elements. 
      During each iteration, 
      the algorithm is taking the smallest element and swaps it with the element
      in the corresponding position to the left.
      
      //Our method will take an array called arr as its parameter and sort it:
class SelectionSort {
    static void SelectionSort(int arr[]) {
        for(int k = 0; k < arr.length-1; k++) {
            int min_idx = k;
            for(int j = k+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            
            //swap
            int temp = arr[min_idx];
            arr[min_idx] = arr[k];
            arr[k] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64,25,12,22,11};
        SelectionSort(arr);
        
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");   
    }
}

//output: 11 12 22 25 64

      During each iteration the smallest element's index is found and swapped with the corresponding position.
      
      Selection sort technique has quadratic order of growth in best, average and worst cases.
      
      Another Implementation:
public class SelectionSort{
    
    private int[] numbers;
    
    public SelectionSort(int[] numbers){
        
        this.numbers = numbers;
    }
    
    //after the first swap the first number is sorted --> don't start at 0, start at given index
    //return index from smallest number
    public int getMin(int index){
        
        int min = numbers[index];
        
        for(int i = index; i < numbers.length; i++){
            if(min > numbers[i]){
                
                min = numbers[i];
                index = i;
                
            } 
       }
       
       return index;
    }
    
    public void sortArray(){
        
       for(int i = 0; i < numbers.length; i++){
           
           //get position from smallest num
           int min = getMin(i);
           
           //swap 
           //numbers[min] <--> numbers[i]
           int temp = numbers[min];
           numbers[min] = numbers[i];
           numbers[i] = temp;
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
            
            //num between -15 - +15
            numbers[i] = rand.nextInt(30) - 15;
        }
        
        SelectionSort selection = new SelectionSort(numbers);
        selection.printArray();
        selection.sortArray();
        selection.printArray();   
    }
}

      Another Implementation:
Another example
public class Program {
    static void selectionSort(int[] lst){
   int space=lst.length;
   for(int index=0;index<space;index++){
     int first=lst[index];
     for(int in=index;in<space;in++){
            if(lst[in]<first){
               int goAhead=lst[in];
               int position = in;
               lst[index]=goAhead;
               lst[position]=first;
               }
        }
   }
 for(int i = 0; i < lst.length; i++)
            System.out.print(lst[i]+" ");   
}
    public static void main(String[] args){
        int[] nums = {2,3,1,5,6};
        selectionSort(nums);
    }
}
//output: 1 2 3 5 6

      Another Implementation:
public class Program
{
    static int [] SelectionSort(int [] arr)
    
    {
    int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int min = i;
            
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
                
            }
            
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        int [] input = new int[]{5, 8, 3, 6, 2, 1, 4, 7};
        int [] results = SelectionSort(input);
        
        for(int x = 0; x < results.length - 1; x++)
        {
            System.out.print(results[x] + " ");
        }
    }
}

//output: 1 2 3 4 5 6 7




