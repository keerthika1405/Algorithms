
//bubblesort
//arranging in asc/decs order

//string type buble sort

import java.util.*;//util.* is package live  in "lib" directory under where your JRE is installed
public class bubble_sort{
    public static void main(String[]args){
        String []arr = {"zc","ac","ab","az"};
        String t1;
      
        // System.out.println(Arrays.toString(arr)); //before sort
        int n = arr.length; 
     
        for(int i=0;i<n-1;i++){
        //here we perform a pass of bubble sort
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])<0)   //compare operation(less than for desc || greater then for asc)
                {
                    t1=arr[i];     //swap  operation
                    arr[i]=arr[j];
                    arr[j]=t1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));    //after sort

//integer type bubble sort
        
       

    }
}