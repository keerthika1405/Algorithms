public class firstindex{
    public static void main (String[]args){
        int arr[]={7,5,4,3,7,8,3,4,4};
        int x=4;
        System.out.print(array12(arr,x,0));
    }
    public static int array12 (int[]arr,int x,int i){
    if(i==arr.length){
        return -1 ;
    }

        if(arr[i]==x){
       
            return i;     
        } 
        else{
            int index=array12(arr,x,i+1);
            return index; 
        }
    }
}

