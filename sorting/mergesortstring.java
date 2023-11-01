//merge sort for string
public class mergesortstring {
      public static void main(String[] args) {
        String arr = "alpha";

        char[] charArray = arr.toCharArray(); //string to charArray

        Sort(charArray);//operation

        String sortedString = new String(charArray);//charArray to String
        System.out.println(sortedString);
    }

    public static void Sort(char[] charr) {
        if (charr.length <= 1) {
            return;
        }
        
        int mid = (charr.length) / 2;
     
        char[] l = new char[mid];
        char[] r = new char[charr.length - mid];
        System.arraycopy(charr, 0, l, 0, mid);
        System.arraycopy(charr, mid, r, 0, charr.length - mid);

        Sort(l);
        Sort(r);
        merge(charr, l, r);
    }

    public static void merge(char[] arr, char[] l, char[] r) {
        int n1=l.length;
        int n2=r.length;
         int i = 0;
         int j = 0;
         int k = 0;
         
         while (i < n1  && j < n2 ) {
 
             if (l[i]<r[j] ) {
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
