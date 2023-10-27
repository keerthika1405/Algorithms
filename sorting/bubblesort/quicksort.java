public class quicksort {
   
        public static void main(String[] args) {
            String[] arr = {"a", "o", "b", "g", "k"};
    
    
            Sort(arr, 0, arr.length - 1);
    
           for (String value : arr) {
                System.out.print(value + " ");
            }
        }
    
        public static void Sort(String[] arr, int low, int high) {
            if (low < high) {

                int pi = partition(arr, low, high);
                Sort(arr, low, pi - 1);
                Sort(arr, pi + 1, high);
            }
        }
    
        public static int partition(String[] arr, int low, int high) {

            String pivot = arr[high];
            int i = (low - 1);
    
            for (int j = low; j <= high - 1; j++) {
                if (arr[j].compareTo(pivot) < 0) {
                    i++;
                    // Swap arr[i] and arr[j]
                     
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Swap arr[i + 1] and arr[high] (or the pivot)
            
            String temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            return i + 1;
        }
    
    
    }
    

