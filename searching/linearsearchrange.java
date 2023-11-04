public class linearsearchrange {
     public static void main(String[] args) {
            int[] nums = {5, 7, 7, 8, 8, 8, 9, 8, 10};
            int target = 8;
            int[] result = searchRange(nums, target);
            System.out.println("Range of target element: [" + result[0] + ", " + result[1] + "]");
        }

  
        public static int[] searchRange(int[] nums, int target) {
            int firstOccurrence = -1;
            int lastOccurrence = -1;
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    if (firstOccurrence == -1) {
                        firstOccurrence = i;
                    }
                    lastOccurrence = i;
                }
            }
    
            int[] result = {firstOccurrence, lastOccurrence};
            return result;
        }
    }

