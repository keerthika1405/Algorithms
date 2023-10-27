public class quicksortstring {
 
        public static void main(String[] args) {
            String inputString = "alpha";
    
            char[] charArray = inputString.toCharArray();//string to charArray

            Sort(charArray, 0, charArray.length - 1);//operation
    
            String sortedString = new String(charArray);//charArray to String
        
            System.out.println(sortedString);
        }
    
        public static void Sort(char[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
    
            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
            }
        }
    
        public static int partition(char[] arr, int low, int high) {

            char pivot = arr[high];
            int i = (low - 1);
    
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    
                    i++;
                    // Swap arr[i] and arr[j]
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Swap arr[i + 1] and arr[high] (or the pivot)
            char temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            return i + 1;
        }
    }
    

