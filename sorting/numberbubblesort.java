public class numberbubblesort {
    public static void main(String[]args){
        int []arr = {1,6,80,5,35,2};
        int t1;
    int n = arr.length;
    for(int  i : arr){
 System.out.print(i+" ");
      }
        //before sort
     for(int i=0;i<n-1;i++){
        //here we perform a pass of bubble sort
            for(int j=i+1;j<n;j++){
                if(arr[i]>(arr[j]))   //compare operation(less than for desc || greater then for asc)
                {
                    t1=arr[i];     //swap  operation
                    arr[i]=arr[j];
                    arr[j]=t1;
                }
            }
        }  System.out.println(); 
        for(int i : arr){
     System.out.print(i+" "); 
        }
      //after sort

//integer type bubble sort
    }
}

