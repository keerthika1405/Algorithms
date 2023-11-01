import java.util.Arrays;

public class binarykthmissing {
    
        public static void main(String[]args) {
            int []arr={4,7,11,10};
            int k=4;

            Arrays.sort(arr);
            System.out.println(missingElement(arr,k));

        }
        public static int missingElement(int[] arr, int k) {
            
            int prev=arr[0];
            
            int first=0;
            int last=arr.length-1;
            
            while(first<=last)
            {
                int mid=(first +last)/2;
                System.out.println("mid"+mid);

                int diff =  arr[mid]-(prev+ mid);
                System.out.println("diff "+diff);

                if(diff < k){
                    first=mid+1;
                    System.out.println("si"+first);
                }
                else{
                    last=mid-1;
                    System.out.println("last"+last);
                }   
            }
            
            int lostCount=arr[last]-(prev+last);
            System.out.println("LC"+lostCount);

            int diff=k-lostCount;

            System.out.println("diff"+diff);
            return arr[last]+diff;
            
        }
    }
    

