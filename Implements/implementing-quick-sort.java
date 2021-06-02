QuickSort in Java
      QuickSort picks an element as the pivot and partitions the given array around it.
      We will choose our pivot randomly.
      We will implement the QuickSort function recursively. 
      During each iteration our function will pick a random pivot and partition the array based on it:
import java.util.Random;
class Quick_Sort {
    static void QuickSort(int arr[], int left, int right) {
        int l = left;
        int r = right - 1;
        int size = right - left;
        if(size > 1) {
            Random rn = new Random();
            int pivot = arr[rn.nextInt(size) + l];
            while(l < r) {
                while(arr[r] > pivot && r > l) {
                    r--;
                }
                while(arr[l] < pivot && l <= r) {
                    l++;
                }
                if(l < r) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                }
            }
            QuickSort(arr, left, l);
            QuickSort(arr, r, right);
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {10, 54, 63, 6, 420, 11, 41, 32, 17, 22};
        QuickSort(arr, 0, arr.length);
        printArray(arr);
    }
}
//output: 6 10 11 17 22 32 41 54 63 420


      So, the QuickSort function is taking the array of elements, choosing a random pivot point, 
      creates two partitions based on that pivot and recursively call it till all elements become sorted.
      
      Another example:
import java.util.Random; //random sort

public class QuickSort{
    
    private int[] numbers;
    
    public QuickSort(int[] numbers){
        
        this.numbers = numbers;
    }
    
    //swap numbers[i] <-> numbers[j]
    private void swap(int i, int j){
        
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
    //choose a pivot
    //after this method: numbers <= pivot are on the left side, numbers > pivot are on the right side
    //pivotIndex somewhere in the list:
    //[ <= pivot ] pivot [ > pivot ]
    //pivotIndex = 0: pivot [> pivot]
    //pivotIndex = last: [<= pivot] pivot
    private int partition(int left, int right){
        
        //pivot = middle
        int pivot = (left + right) / 2;
        
        //swap it with the right index
        //pivot element is now on the 
        //right side of the array
        swap(pivot, right);
        
        int pivotIndex = left;
        for(int i = left; i < right; i++){
            
            if(numbers[i] <= numbers[right]){
                
                swap(pivotIndex, i);
                pivotIndex++;
            }
        }
        
        //swap pivot <-> right
        //pivot element is now on the 
        //position of the pivotIndex
        swap(pivotIndex, right);
        
        return pivotIndex;
    }
    
    public void sortArray(int left, int right){
        
        //partition is sorted
        if(left >= right){
            
            return;
        }
        
        //get index of the pivot
        int pivot = partition(left, right);
        
        //sort the left side 
        sortArray(left, pivot - 1);
        //sort the right side
        sortArray(pivot + 1, right);
    }
    
    public void printArray(){
        
       for(int i = 0; i < numbers.length; i++){
           
          System.out.print(numbers[i] + " ");
          
       }
       
       System.out.println();
    }

}

public class Program
{
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] numbers = new int[10];
        
        for(int i = 0; i < 10; i++){
            
            numbers[i] = rand.nextInt(30) - 15;
        }
        
        QuickSort quick = new QuickSort(numbers);
        
        quick.printArray();
        quick.sortArray(0, numbers.length - 1);
        quick.printArray();
    }
}
      
      
      Another example:
import java.util.Random;
public class Program
{   
   static Random ran=new Random();
    static void quickSort(int[]arr,int l,int r){
        if(l>=r)
          return;
        int p=ran.nextInt(r-l+1)+l;
        for(int i=l;i<=p;i++){
            while(arr[i]>arr[p]){
                int temp=arr[i];
                int j;
                for(j=i;j<p;j++){
                    arr[j]=arr[j+1];
                }
                arr[j]=temp;
                p=j-1;
            }
        }
        for(int i=p+1;i<=r;i++){
            if(arr[i]<=arr[p]){
                int temp=arr[i];
                int j;
                for(j=i;j>p;j--){
                    arr[j]=arr[j-1];
                }
                arr[j]=temp;
                p=j+1;
            }
        }
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }
    public static void main(String[] args) {
        int[]arr={16,14,12,10,8,6,4,2,15,13,11,9,7,5,3,1};
        quickSort(arr,0,arr.length-1);
        for(int q:arr)
         System.out.print(q+" ");
    }
}


