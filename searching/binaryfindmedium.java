import java.util.Arrays;

public class binaryfindmedium {
   
    public static void main(String[] args) {
            int[] arr1 = {2};
            int[] arr2 ={1,4,8,3};
            double median = findMedianSortedArrays(arr1, arr2);
            System.out.println("Median of the two sorted arrays: " + median);
    }

        public static double findMedianSortedArrays(int[] arr1, int[] arr2) {

            if (arr1.length > arr2.length) {
                int[] temp = arr1;
                arr1 = arr2;
                arr2 = temp;
            }

            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
    
            int n1 = arr1.length;
            int n2 = arr2.length;

            int low = 0;
            int high = n1;
    
            while (low <= high) {

                int mid = (low + high) / 2;
                int x = (n1 + n2 + 1) / 2 - mid;
                   System.out.println(mid);
                   System.out.println(x);
    
                int maxX = (mid == 0) ? Integer.MIN_VALUE : arr1[mid - 1];
                int maxY = (x == n2) ? Integer.MAX_VALUE : arr2[x];
                   System.out.println("maxX"+maxX);
                   System.out.println("maxY"+maxY);

                int minY = (x == 0) ? Integer.MIN_VALUE : arr2[x - 1];
                int minX = (mid == n1) ? Integer.MAX_VALUE : arr1[mid];
                    System.out.println("minY"+minY);
                    System.out.println("minX"+minX);

                if (maxX <= maxY && minY <= minX) {
                    System.out.println("if");
                    if ((n1 + n2) % 2 == 0) {
                        return (Math.max(maxX, minY) + Math.min(minX, maxY));
                    }
                    else {
                          System.out.println("elsr"); 
                    }
                } 
                else if (maxX > maxY) {
                      System.out.println("elseif");
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            throw new IllegalArgumentException("Input arrays are not sorted.");
        }
    
        
    }
    
