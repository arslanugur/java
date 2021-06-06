Linear Search in Java
      Linear Search is a simple search algorithm, which checks every element of the array for a match, 
      and returns the index of the matched element.
      The implementation is very simple - we just need one loop to go through the whole array and check for a match.
      
      Let's search for the value x in an array called arr:
class LinearSearch
{
    static int search(int[] arr, int x) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == x)
                return k;
        }
        return -1;
    }
  
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 42};
        System.out.print(search(arr, 42));
    }
} //output: 3


      We iterate through the array using a for loop and check for a match. 
      If the current element is equal to x, the index of that element is returned.
      
      -1 is returned if no match is found!!
      
      
      once you get the index of the element in the array 
      you can easilly call the actual content in the next line of code by asking for content of the element with that index.
      
      Another Example:
public class Program{
public static void main(String[] args) {
  
  int[] array={4,5,-2,8,24};
  int num=8;
  System.out.println(linearSearch(array,num));
  //prints index of a num, if num exists in array.
  //prints -1, if num does not exist in array
}

static int linearSearch(int[] arr,int target){
  for(int i=0;i<arr.length;i++){
    if(arr[i]==target) return i;
  }
  return -1;
}

} //output:3




