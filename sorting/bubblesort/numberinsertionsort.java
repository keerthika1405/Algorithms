public class numberinsertionsort
{
    public static void main(String[]args)
    {
        int []arr={5,3,9,10,2};
        int m=arr.length;

        for(int i=1;i<m;i++)
        {
            int key=arr[i];
             
            int j=i-1;
           
            while(j>=0 && arr[j]>key)//less_than for descending |geater_than for ascending
            {
                arr[j+1]=arr[j];
                j--;
                
            }

            arr[j+1]=key;
            
            // System.out.println("after"+key);
        }
        for(int val:arr){
            System.out.print(val+" ");
        
        
    }

}
}