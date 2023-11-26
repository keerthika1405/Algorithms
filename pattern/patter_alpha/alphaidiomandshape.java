// ABCDEABCDE
// ABCD  ABCD
// ABC    ABC
// AB      AB
// A        A
// AB      AB
// ABC    ABC
// ABCD  ABCD
// ABCDEABCDE
public class alphaidiomandshape {
    public static void main(String[] args) {
             
        int n = 5;

        for(int i=n; i>=1; i--) {
                 
            for(int j=1; j<=i; j++) {
                 
                System.out.print((char)(64+j));
            }
             
            for(int k=1; k<=2*(n-i); k++) {
                
                System.out.print(" ");
            }
             
            for(int l=1; l<=i; l++) {
                 
                System.out.print((char)(64+l));
            }
             
         
            System.out.println();
        }
         
        for(int i=2; i<=n; i++) {
             
            for(int j=1; j<=i; j++) {
                 
                System.out.print((char)(64+j));
            }
             
            for(int k=1; k<=2*(n-i); k++) {
                
                System.out.print(" ");
            }
             
            for(int l=1; l<=i; l++) {
                 
                System.out.print((char)(64+l));
            }
             
         
            System.out.println();
        }

        
    }
}
