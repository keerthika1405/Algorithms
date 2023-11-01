import java.util.Arrays;


public class linearkthmissing {
    
    public static void main(String[] args) {
        int[] arr = {4, 7, 11, 10};
        int k = 2;
        System.out.println(k+" missing element is "+missingElement(arr, k)    );
    }

    public static int missingElement(int[] arr, int k) {
        Arrays.sort(arr);//sort

        int count = 0;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - prev - 1;

            if (count + diff >= k) {
                return prev + k - count;
            }
            count += diff;
            prev = arr[i];
        }

        // Handle case when kth missing element is beyond the last element in the array
        return prev + k - count;
    }
}

