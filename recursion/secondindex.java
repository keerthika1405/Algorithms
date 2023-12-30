public class secondindex {
    public static void main (String[]args){

         int arr[]={1,2,3,4,5,1,1};
         int key=1;
        int i=0,count=0;

        for(i=0;i<arr.length;i++){
            if(arr[i]==key){
                count=count+1;
            }
            if(count==3){
                break;
            }
        }
        if(count==3){
            System.out.println("element is present at index:"+i);
        }
        else{
            System.out.println(-1);
        }
    } 
}
