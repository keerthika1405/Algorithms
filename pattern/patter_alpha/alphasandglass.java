ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI


public class alphasandglass {
    public static void main(String[] args) {
            
        int n = 5;//row
         
         for(int i=n; i>=1; i--) {
            
            for(int j=1; j<=(n-i); j++) {
               
              System.out.print(" ");
          }
           
           for(int k=1; k<=(2*i)-1; k++) {
               
            System.out.print((char)(64+k));
           }
          System.out.println();
      }

       for(int i=2; i<=n; i++) { 
            
            for(int j=1; j<=(n-i); j++) {
                 
                System.out.print(" ");
            }
             
            for(int k=1; k<=(2*i)-1; k++) {

                System.out.print((char)(64+k));
            }
            System.out.println();
        } 
    }
}
