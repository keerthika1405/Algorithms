
   public class lastoccuranceforlinearsearch {
        public static void main(String[] args) {
            int[] array = {2, 5, 8, 3, 7, 5, 1, 9, 5};
            int target = 5;
            int lastIndex = linearSearchLastOccurrence(array, target);
            
            if (lastIndex != -1) {
                System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
            } else {
                System.out.println(target + " not found in the array.");
            }
        }

        public static int linearSearchLastOccurrence(int[] arr, int target) {
            int lastIndex = -1; 
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    lastIndex = i; 
                }
            }
            return lastIndex;
        }
    
      
    }
    

