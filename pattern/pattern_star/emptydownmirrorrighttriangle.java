*****
 *  *
  * *
   **
    *

public class emptydownmirrorrighttriangle {
    public static void main(String[] args) {
         
        int n = 5;//row
         
        for(int i=n; i>=1; i--) {
             
            for(int j=1; j<=(n-i); j++) {
                 
                System.out.print(" ");
            }
             
            for(int k=1; k<=i; k++) {
                 
                if( k == 1 || k == i || i==n ) {
                  
                    System.out.print("*");
                }else {
                   
                    System.out.print(" ");
                }
                 
            }
             
            // Line/Row change
            System.out.println();
        }
    }
}
