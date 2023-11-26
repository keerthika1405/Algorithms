// *
// **
// * *
// *  *
// *   *
// *  *
// * *
// **
// *

public class emptyrightpascaltriangle {
    public static void main(String[] args) {
             
        int n = 5;//row
         
        for(int i=1; i<=n; i++) {
            
              for(int j=1; j<=i; j++) {
                 
                if( j == 1 || j == i ) {
                   
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }     
            System.out.println();
        }

          for(int i=n-1; i>=1; i--) {

              for(int k=1; k<=i; k++) {
                 
                if( k == 1 || k== i || k==n ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }     
            System.out.println();
        }
    }
}
