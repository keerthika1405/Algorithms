
 public class linearfindminimumneightbourarray {

        public static void main(String[] args) {
            int[] arr = {8, 11, 100, 62, 15, 36};
            System.out.println("The minimum neighbor element is " + findMinimumNeighbor(arr));
        }
    
        public static int findMinimumNeighbor(int[] arr) {
            if (arr == null || arr.length < 3) {
                System.exit(-1); 
            }
    
            int minNeighbor = arr[1]; 
    
            for (int i = 1; i < arr.length - 1; i++) {
                int current = arr[i];
                int leftNeighbor = arr[i - 1];
                int rightNeighbor = arr[i + 1];
    
                
                if (current > leftNeighbor && current > rightNeighbor) { 
                    //greater for maximum and lesser for minimum 
                    minNeighbor = current;
                }
            }
    
            return minNeighbor;
        }
    }
    

