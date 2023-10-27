public class numbermergesort {
     public static void main(String args[])
    {
        int arr[] = {1,60,34,67,23,0};

        
  
        numbermergesort obj = new numbermergesort();
        obj.sort(arr, 0, arr.length - 1);
    
         int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i]+" ");
        }
       
       
    }


    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
           
            // Sort first and second halves
            sort(arr, l, m);
              
            sort(arr, m + 1, r);
             
           merge(arr, l, m, r);    // Merge the sorted halves
        }
    }
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
       
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;//3
           
        int n2 = r - m;//3
            

        int L[] = new int[n1]; 
        int R[] = new int[n2];
  
       
        // for (int i = 0; i < n1; ++i){
                    
        //     L[i] = arr[l + i];
          
        // }
        // for (int j = 0; j < n2; ++j){
        //     R[j] = arr[m + 1 + j];
           
        // }
            

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;     
          }
            else {
                arr[k] = R[j];     
                j++;
            }
            k++;
        }
          
        while (i < n1) { 
              // Copy remaining elements of L[] if any
            
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) { // Copy remaining elements of R[] if any
            
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    
  
    // A utility function to print array of size n

 
   
} 
    

