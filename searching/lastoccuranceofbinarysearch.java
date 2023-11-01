import java.util.Arrays;

public class lastoccuranceofbinarysearch {

             public static void main(String[] args) {
            int[] array = {8, 2, 0, 8, 4, 5, 5,5, 9, 6};
            int key = 8;
          
            for(int i=0;i<array.length-1;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
 System.out.println(Arrays.toString(array));

            int lastIndex = binarySearch(array, key);
    
            if (lastIndex != -1) {
                System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
            } 
            else {
                System.out.println(key + " not found in the array.");
            }
        }
        public static int binarySearch(int[] arr,  int key) {
            int lastIndex = -1;
            int first = 0;
            int last = arr.length - 1;
          
            while (first <= last) {
                int mid =( first + last )/ 2;
                System.out.println(mid);
                
                if (arr[mid] == key) {
                     lastIndex = mid;
                     first = mid + 1;  
                }
                else if (arr[mid] < key) {
                    first = mid + 1;// search in left subarray
                } 
                else {
                    last = mid - 1;// search in right subarray
                }
             
            }
             return lastIndex; // Return the last occurrence index, -1 if the target is not found 
        }
    }
    

