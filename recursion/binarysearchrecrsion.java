public class binarysearchrecrsion {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int target = 6;
            int result = binarySearch(arr,target,0,arr.length);
            if (result != -1) {
                System.out.println("Element " + target + " found at index " + result);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }
        
        // Recursive binary search function
        static int binarySearch(int[] arr, int target, int low, int high) {
            if (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    return binarySearch(arr, target, low, mid - 1);
                }
                return binarySearch(arr, target, mid + 1, high);
            } 
            return -1;
        }  
}
// Initial Call:

// low = 0, high = 9, mid = 4 (middle index).
// Compare arr[4] (value 5) with the target (6).
// Since 5 < 6, the search continues in the right subarray.

// Second Call (right subarray):
// low = 5, high = 9, mid = 7 (middle index).
// Compare arr[7] (value 8) with the target (6).
// Since 8 > 6, the search continues in the left subarray.

// Third Call (left subarray):
// low = 5, high = 6, mid = 5 (middle index).
// Compare arr[5] (value 6) with the target (6).
// The target is found at index 5, so the function returns 5.

// The element 6 is found at index 5.
//  The sequence of recursive calls narrows down the search range until the target element is found.