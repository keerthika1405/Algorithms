import java.util.Arrays;

public class insertonsort {
    public static void main(String[] args) {
        String[] arr = {"e", "b", "d", "a", "c"};
 
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key)>0) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
         System.out.print(Arrays.toString(arr));
    }
   
}
