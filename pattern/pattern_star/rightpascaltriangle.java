// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *

public class rightpascaltriangle {
    public static void main(String[] args) {
             
        int n = 5;//row
         
        for(int i=1; i<=n; i++) {
            
              for(int k=1; k<=i; k++) {
                 
                System.out.print("*");
            }     
            System.out.println();
        }



          for(int i=n; i>=1; i--) {

            
              for(int k=1; k<=i; k++) {
                 
                System.out.print("*");
            }     
            System.out.println();
        }
    }
}
