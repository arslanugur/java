Merge Sort in Java
      Merge Sort is dividing the array in half over and over again until each piece is only one item long. 
      Then those items are put back together (merged) in sort-order.

      We will need a Merge function, to merge the two halves into a sorted data.
      
      //Let's implement the algorithm using recursion:
class MergeSort {
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;
     
        int L[] = new int [n1];
        int R[] = new int [n2];
     
        for(int i=0; i<n1; i++)
            L[i] = arr[l+i];
        for(int j=0; j<n2; j++)
            R[j] = arr[m+1+j];
     
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void MergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            MergeSort(arr, l, m);
            MergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
 
    public static void main(String args[]) {
        int arr[] = {10, 54, 63, 6, 420};
     
        MergeSort(arr, 0, arr.length-1);
     
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}  //output: 6 10 54 63 420

      /*
      We are taking the array, divide it into two parts and continue this process until each element becomes a single item. 
      Then we start to merge them back together in a sorted manner to get the result.
      
      Variable, field and method names start with lowercase in Java. 
      Also, array declaration with brackets after the name and not after the type is discouraged by convention. 
      Single letter variables don't easily explain their meaning. This code is very poorly legible.
      */

      Another Example using Py:
"""
# Algorithm name: Merge Sort(Pure Implementetion of Algorithm)
# Time complexity: O(n*log(n))
# Space complexity: O(n)
# Stable: True
# Inplace: False
"""


#enter your list here:
list = [19,11,22,24,14,7,20,25,21,1,4,17,26,2,9,23,15,14,3,5,8,6,0,30,18,10,12,13,16,27,29]
#if you want to reverse it then make the rEverse variable True
reverse = False

def merge(A, B):
    m=len(A)
    n=len(B)
    C = [0]*(m+n)
    k=i=j=0
    while i<m and j<n:
          if A[i]<=B[j]:
             C[k]=A[i]
             i+=1
             k+=1
          else:
             C[k]=B[j]
             j+=1
             k+=1
    while i<m:
          C[k]=A[i]
          i+=1
          k+=1
    while j<n:
          C[k]=B[j]
          j+=1
          k+=1
    return C
    
    
def mergesort(A):
    m=len(A)
    if m==1:
       return A
    n=m//2
    return merge(mergesort(A[0:n]), mergesort(A[n:m]))


print("Input Array:", list)

list = mergesort(list)
list = list[::-1] if reverse==True else list

print("Sorted Array:", end=' ')
print(list) if reverse == False else print(list[::-1])
print("\n\n# Algorithm name: Merge Sort\n# Language: Python\n#'Pure Implementetion of Algorithm'")




