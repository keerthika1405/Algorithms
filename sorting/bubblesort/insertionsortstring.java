public class insertionsortstring {
    public static void main(String[] args) 
{
    String inputString = "alpha";
    char[] charArray = inputString.toCharArray();

    insertionSort(charArray);

    String sortedString = new String(charArray);
    System.out.println( sortedString);
}

    public static void insertionSort(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            char key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
    }
}






