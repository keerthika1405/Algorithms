import java.util.Arrays;

public class mergesortsrtring {

    public static void main(String[] args) {
        String[] arr = {"a","c","b","e","d"};

        Sort(arr);
        System.out.println( Arrays.toString(arr)+" ");
    }

    public static void Sort(String[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = (arr.length) / 2;
        String[] l = new String[mid];
   
        String[] r = new String[arr.length - mid];
        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, arr.length - mid);
         

        
        Sort(l);
        Sort(r);
        merge(arr, l,mid , r);
    }

    public static void merge(String[] arr, String[] l,int m, String[] r) {
           
       int n1=l.length;
       int n2=r.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < n1  && j < n2 ) {

            if (l[i].compareTo(r[j]) <= 0) {
                arr[k] = l[i];
                i++;
            }
             else {               
                arr[k] = r[j];         
                j++;   
            }
            k++;
        }
          // Copy remaining elements of L[] if any
        while (i < n1) {
            
            arr[k] = l[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
             
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}