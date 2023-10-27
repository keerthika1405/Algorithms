public class numberselectionsort{
    public static void main(String[]args){
        int []arr={6,9,0,3,7};
        int m =arr.length;

        for(int i=0;i<m-1;i++){
          
            int minval=arr[i];
            int minidx=i;
         
            for(int j=i+1;j<m;j++)
            {
               if(arr[j]<minval) // lessthan for ascending order|Greaterthan for descending order
               {                           
                minval=arr[j];             
                minidx=j;
              
               }
            }       
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        for(int val:arr){
            System.out.print(""+val);
        }
    }
}