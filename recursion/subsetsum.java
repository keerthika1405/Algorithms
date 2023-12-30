import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int Sum = 9;
        // List<List<Integer>>: Represents a list of lists of integers, essentially a collection of subsets.
        List<List<Integer>> result = findSubsetsWithSum(arr, arr.length, Sum);

        if (!result.isEmpty()) {
            System.out.println("Subsets with the given sum:");
            for (List<Integer> subset : result) {
                System.out.println(subset);
            }
        } 
        else {
            System.out.println("No subset with the given sum exists.");
        }
    }

    static List<List<Integer>> findSubsetsWithSum(int[] set, int n, int Sum) {

        List<List<Integer>> result = new ArrayList<>();

        findSubsets(set, n, Sum, new ArrayList<>(), result);
       
        return result;
    }

    static void findSubsets(int[] set, int n, int Sum, List<Integer> currentSubset, List<List<Integer>> result) {
     
     

        if (Sum == 0) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        if (n == 0 && Sum != 0) {
            return;
        }//base case

        if (set[n - 1] > Sum) {
            findSubsets(set, n - 1, Sum, currentSubset, result);
            return;
        }

        findSubsets(set, n - 1, Sum, currentSubset, result); // Exclude the current element
        currentSubset.add(set[n - 1]);
       
      
        findSubsets(set, n - 1, Sum - set[n - 1], currentSubset, result); // Include the current element
        currentSubset.remove(currentSubset.size() - 1);
        
    }
}


// verify the image
// https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.simplilearn.com%2Ftutorials%2Fdata-structure-tutorial%2Fsubset-sum-problem&psig=AOvVaw08fl3WoZvtnRCHX01FPzV_&ust=1702379487043000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCPjby4Oqh4MDFQAAAAAdAAAAABAQ





// public class subsetsum {
//         public static void main(String[] args) {
//             int[] set = {3, 34, 4, 12, 5, 2};
//             int targetSum = 9;
    
//             if (isSubsetSum(set, set.length, targetSum)) {
//                 System.out.println("Subset with the given sum exists.");
//             } else {
//                 System.out.println("Subset with the given sum does not exist.");
//             }
//         }
    
//         static boolean isSubsetSum(int[] set, int n, int targetSum) {
//             // Base cases
//             if (targetSum == 0) {
//                 return true;
//             }
//             if (n == 0 && targetSum != 0) {
//                 return false;
//             }
    
//             // If the last element is greater than the sum, ignore it
//             if (set[n - 1] > targetSum) {
//                 return isSubsetSum(set, n - 1, targetSum);
//             }
    
//             // Check whether the sum can be obtained by either including or excluding the last element
//             return isSubsetSum(set, n - 1, targetSum) || isSubsetSum(set, n - 1, targetSum - set[n - 1]);
//         }
//     }
    

