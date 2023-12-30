public class displayarray{
    public static void main (String[]args){
        int arr[]={10,20,30,40,50};
        printarray(arr,0);
    }
    public static void printarray (int[]arr,int i){
        if(i==arr.length){
            return;
        }
        //  printarray(arr,i+1);
        // System.out.println(arr[i]);   // output(50,40,30,20,10)
        // or
        // System.out.println(arr[i]);
        // printarray(arr,i+1);          //output(10,20,30,40,50)
    }
    }
