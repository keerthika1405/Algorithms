

public class bubblesortstring {
    public static void main(String[] args) 
    {
        String inputString = "alpha";

        char[] charArray = inputString.toCharArray(); //change string to charArray

        bubble(charArray);//operation
    
        String sortedString = new String(charArray);// change charArray to string
        System.out.println( sortedString);
    }
    
        public static void bubble(char[] arr) {
            int n=arr.length;
              for(int i=0;i<n-1;i++){
        //here we perform a pass of bubble sort
            for(int j=i+1;j<n;j++){
                if(arr[i]>(arr[j]))   //compare operation(less than for desc || greater then for asc)
                {
                    char t1=arr[i];     //swap  operation
                    arr[i]=arr[j];
                    arr[j]=t1;
                }
            }
        }
}
}