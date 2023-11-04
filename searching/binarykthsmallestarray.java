import java.util.Arrays;
public class binarykthsmallestarray {

     public static void main(String[] args) {
        int[] arr = {3, 1, 4,2,9,7};
        int k = 4;
        Arrays.sort(arr); 
        int result = findKthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }

    public static int findKthSmallest(int[] arr, int k) {
        int low = arr[0];
        int high = arr[arr.length - 1];


        while (low <= high) {
            int mid = (low + high) / 2;
              System.out.println("mid "+mid);
            int count = countLessEqual(arr, mid); 
             

            if (count < k) {
                 high = mid - 1; //change low=mid+1  smallest kth element
            } 
            else {
             
                  low = mid + 1;//change high= mid-1 for 
            }
        }

        return low;
    }

    public static int countLessEqual(int[] arr, int mid) {
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >= mid) { //change lessethanequalto for smallest kth element

                count++;
                System.out.println("arr[i] "+ arr[i]);
                   System.out.println("count "+count);
            }
        }
       return count; 
    }
}
