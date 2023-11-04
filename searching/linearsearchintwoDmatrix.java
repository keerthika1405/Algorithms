
  public class linearsearchintwoDmatrix {
    public static void main(String[] args) {
            int[][] matrix = {
                {3, 1, 4},
                {7, 2, 9},
                {5, 6, 8}
            };
    
            int target = 9;
            boolean found = searchMatrix(matrix, target);
            System.out.println("Target element found: " + found);
        }

        public static boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
    
            int rows = matrix.length;
            int cols = matrix[0].length;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (matrix[row][col] == target) {
                        return true;
                    }
                }
            }
            return false; 
        }
    }
    
   

    //  public static void main(String[] args) {
    //     int[][] matrix = {
    //         {1, 3, 5, 7},
    //         {10, 11, 16, 20},
    //         {23, 30,40, 50}
    //     };//sorted

    //     int target = 23;
    //     boolean found = searchMatrix(matrix, target);
    //     System.out.println(target+"Target element found: " + found);
    // }

    // public static boolean searchMatrix(int[][] matrix, int target) {
    //     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return false;
    //     }

    //     int rows = matrix.length;
    //     int cols = matrix[0].length;
        
    //     int row = 0;
    //     int col = cols - 1;
     
    //     while (row < rows && col >= 0) {

    //         System.out.println(row);
    //         System.out.println(col);
    //         if (matrix[row][col] == target) { 
    //             return true;
    //         }
    //          else if (matrix[row][col] < target) {   
    //             row++;
    //         } else {      
    //             col--;
    //         }
    //     }
    //     return false; 
    // }