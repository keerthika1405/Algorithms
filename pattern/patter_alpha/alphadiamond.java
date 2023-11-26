//     A
//    ABC
//   ABCDE
//  ABCDEFG
// ABCDEFGHI
//  ABCDEFG
//   ABCDE
//    ABC
//     A

public class alphadiamond {
    public static void main(String[] args) {
    
        int n = 5;
         
        for(int i=1; i<=n; i++) {
             
            for(int j=1; j<=(n-i); j++) {
                 
                System.out.print(" ");
            }
             
            for(int k=1; k<=(2*i)-1; k++) {
                 
                System.out.print((char)(64+k));
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--) {//changes here
            
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
