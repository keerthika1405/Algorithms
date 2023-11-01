import java.util.Arrays;
public class selectionsort {
    
    public static void main(String[] args) {
        String[] arr = {"e", "b", "d", "a", "c"};
 
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++) {
             String minVal=arr[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(minVal) < 0) {
                    minVal=arr[j];
                    minIndex = j;
                }
            }
         
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}