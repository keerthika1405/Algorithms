

public class binaryfindmaximumneightbourarray{
      public static void main(String[] args)
    {
        int[] nums = {10, 9, 11, 100, 62, 15,36 };
        System.out.println("The peak element is " + findPeakElement(nums));
    }

   public static int findPeakElement(int[] nums)
    {
        if (nums == null || nums.length == 0) {
            System.exit(-1);
        }
        int index = findPeakElement(nums, 0, nums.length - 1);
        return nums[index];
    }

    public static int findPeakElement(int[] nums, int left, int right)
    {
        int mid = (left + right) / 2;

        if ((mid == 0 || nums[mid - 1] >= nums[mid]) && (mid == nums.length - 1 || nums[mid + 1] >= nums[mid])) {
            //greater for minimum and lesser for maximum 
            return mid;
        }
 
        if (mid - 1 >= 0 && nums[mid - 1] < nums[mid]) {
            //lesser for minimum and greater for maximum 
            return findPeakElement(nums, left, mid - 1);
        }
        else{
        return findPeakElement(nums, mid + 1, right);
        }   
    }
}
