import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class binarysearchforduplicateindexunsorted {

    public static void main(String[] args) {
        List<Integer> unsortedList = List.of(3, 1, 4, 2, 3, 4, 1, 5, 6, 3, 4);
        int target = 3;
        findAndPrintTargetIndices(unsortedList, target);
    }

    public static void findAndPrintTargetIndices(List<Integer> list, int target) {
        Map<Integer, List<Integer>> indexMap = new HashMap<>();

        // Build the index map using linear search
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (!indexMap.containsKey(num)) {
                indexMap.put(num, new ArrayList<>());
            }
            indexMap.get(num).add(i);
        }

        // Print all indices of the target value
        if (indexMap.containsKey(target)) {
            List<Integer> indices = indexMap.get(target);
            System.out.println("Indices of target value " + target + ": " + indices);
        } else {
            System.out.println("Target value " + target + " not found in the list.");
        }
    }
}


