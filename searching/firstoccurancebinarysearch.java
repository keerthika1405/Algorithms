
import java.util.Arrays;

public class firstoccurancebinarysearch {

      public static void main(String args[]) {
        int arr[] = {90, 80, 20, 90, 40, 50, 80, 30 };
        int key = 90;
        int last = arr.length - 1;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
}
System.out.println(Arrays.toString(arr));
        int result = binarySearch(arr, 0, last, key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: using binary search,  it will get  first left are right in  duplicate element  "  + result);
    }

    public static int  binarySearch(int arr[], int first, int last, int key) {

        if (first <= last) {
            int mid = (first + last) / 2;
            System.out.println(mid);
            if (arr[mid] == key) {
                  return mid;
            }      
            if (arr[mid] < key) {
                return binarySearch(arr, first, mid - 1, key);// search in left subarray
            } 
            else {
                return binarySearch(arr, mid + 1, last, key);// search in right subarray
            }
        }
  return -1;
    }
}
