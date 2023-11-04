
public class binarysearchrange {
        public static void main(String[] args) {
            int[] arr = {5, 7, 7, 8, 8,7, 10};
            int target = 7;
            int[] result = searchRange(arr, target);
            System.out.println("Range of target element: [" + result[0] + ", " + result[1] + "]");
        }

        public static int[] searchRange(int[] arr, int target) {
            int[] result = {-1, -1};
           
            int left = 0;                   // Find the first occurrence of the target
            int right = arr.length - 1;
             

            while (left <= right) {
                  System.out.println("left1 "+left);
                  System.out.println("right1 "+right);
                int mid = (left + right) / 2;
                System.out.println("mid1");
                if (arr[mid] == target) {
                    result[0] = mid;
                    right = mid - 1; 
                    
                } 
                else if (arr[mid] < target) {
                    left = mid + 1;
                }
                 else {
                    right = mid - 1;
                }
            }
    
            // Find the last occurrence of the target
            left = 0;
            right = arr.length - 1;
              System.out.println("left2 "+left);
                  System.out.println("right2 "+right);
            while (left <= right) {
                int mid = left + (right - left) / 2;
                System.out.println("mid2");

                if (arr[mid] == target) {
                    result[1] = mid;
                    left = mid + 1; // Continue searching on the right side
                } 
                else if (arr[mid] < target) {
                  right = mid - 1;
                }
                 else {
                   
                       left = mid + 1;
                }
            }
    
            return result;
        }
    
      
    }
    
