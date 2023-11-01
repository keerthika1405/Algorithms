
import java.util.Arrays;
class quicksort {
 public static void main(String args[]) {

    int[] data = {11,20,31,54,56,97 };
    sort(data, 0, data.length - 1);
    System.out.println(Arrays.toString(data));
  }

  static void sort(int array[], int low, int high)
   {
    if (low < high) {
       
      int pi = partition(array, low, high);
      sort(array, low, pi - 1);   // recursive call on the left of pivot
      sort(array, pi + 1, high);   // recursive call on the right of pivot
    }
  }

  static int partition(int array[], int low, int high) {  
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) 
    {
      if (array[j] >= pivot) //greater for desc andv lesser for ascn
      {
     
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
  }
}
    

