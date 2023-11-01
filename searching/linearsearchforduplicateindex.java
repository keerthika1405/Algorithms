
    import java.util.List;
import java.util.ArrayList;
public class linearsearchforduplicateindex {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 7, 7, 7, 9, 11, 13, 15);
        int target = 7;

        List<Integer> indexes = findAllOccurrences(list, target);

        if (!indexes.isEmpty()) {
            System.out.println("Indexes of element " + target + ": " + indexes);
        } 
        else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }

    public static List<Integer> findAllOccurrences(List<Integer> list, int target) {
        
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}


