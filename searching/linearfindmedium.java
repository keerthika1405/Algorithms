 import java.util.Arrays;
public class linearfindmedium {
   

    public static double findMedian(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); 
        if (n % 2 != 0) {
            return nums[n / 2];
        } 
        else {
            int mid1 = nums[n / 2];
            int mid2 = nums[n / 2 - 1];
            return (double) (mid1 + mid2) / 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9, 5};
        double median = findMedian(nums);
        System.out.println("Median: " + median);
    }
}


