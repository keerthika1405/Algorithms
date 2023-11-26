package pattern.pattern_star;

public class emptydownrightanddownmirrorright {
    public static void main(String[] args) {
             
        int n = 5;
         
        for(int i=n; i>=1; i--) {
             
            for(int j=1; j<=i; j++) {
                 if(j==1||j==i||i==n){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
             
            for(int k=1; k<=2*(n-i); k++) {
                
                System.out.print(" ");
            }
             
            for(int l=1; l<=i; l++) {
                 
                if(l==1||l==i||i==n){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
             
         
            System.out.println();
        }
    }
}
