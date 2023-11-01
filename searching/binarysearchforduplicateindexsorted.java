import java.util.ArrayList;
import java.util.List;

public class binarysearchforduplicateindexsorted {
    
        public static void main(String[] args) {
            List<Integer> list = List.of(7, 3, 5, 9, 7, 7, 9, 11, 13, 15);
            int key = 7;

            List<Integer> mutableList = new ArrayList<>(list);
/* List.of() method. To resolve this, you can convert the List to a Mutable List, 
such as an ArrayList, before performing the sorting operation. */
            List<Integer> sortedList = bubbleSort(mutableList);
            System.out.println("Sorted List in Ascending Order: " + sortedList);
    
            List<Integer> indexes = search(sortedList, key);
            
            if (!indexes.isEmpty()) {
                System.out.println("Indexes of element " + key + ": " + indexes);
            } else {
                System.out.println("Element " + key + " not found in the list.");
            }
        }
    
        public static List<Integer> search(List<Integer> sortedList, int target) {
            int low = 0;
            int high = sortedList.size() - 1;
            
            List<Integer> indexes = new ArrayList<>();
    
            while (low <= high) {
                int mid = (low+high) / 2;
                int midValue = sortedList.get(mid);

                if (midValue == target) {
                    int lowIndex = mid - 1;
                    while (lowIndex >= 0 && sortedList.get(lowIndex) == target) {
                        indexes.add(lowIndex);
                        lowIndex--;
                    }
                    int highIndex = mid + 1;
                    while (highIndex < sortedList.size() && sortedList.get(highIndex) == target) {
                        indexes.add(highIndex);
                        highIndex++;
                    }
                    return indexes;

                } 
                else if (midValue < target) {
                    low = mid + 1; // Search in the high half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
            return indexes;
        }

          public static List<Integer> bubbleSort(List<Integer> list) {
            int n=list.size();
            boolean swapped;
            do {
                 swapped = false;
            for(int i=1;i<n;i++){
               
                    if(list.get(i-1) > list.get(i)){
    
                    int temp=list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;  
            } 
    }
    n--;
} while(swapped);

        return list;
}
    
    }
    
    