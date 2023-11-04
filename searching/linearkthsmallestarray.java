
public class linearkthsmallestarray {
      public static void main(String[] args) {
            int[] arr = {3, 1, 4, 2};
            int k = 3;
            int result = findKthSmallest(arr, k);
            System.out.println("The " + k + "th smallest element is: " + result);
        }

        public static int findKthSmallest(int[] arr, int k) {
            if (k <= 0 || k > arr.length) {
                throw new IllegalArgumentException("Invalid value of k");
            }
    
            int smallest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
    
            for (int j = 1; j < k; j++) {// for kth find
                int currentSmallest = Integer.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > smallest && arr[i] < currentSmallest) {                       
                        currentSmallest = arr[i];
                    }
                }
                smallest = currentSmallest;            
            }
            return smallest;
        }
    }
