public class selectionsortstring {
    public static void main(String[] args) {
        String inputString = "alpha";

        char[] charArray = inputString.toCharArray(); //string to charArray

        selectionSort(charArray);//operation

        String sortedString = new String(charArray);//charArray to String
        System.out.println(sortedString);
    }
    public static void selectionSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minVal=arr[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minVal) {
                    minVal=arr[j];
                    minIndex = j;
                }
            }
            char temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}





