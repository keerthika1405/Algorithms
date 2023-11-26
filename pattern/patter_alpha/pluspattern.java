
//   A  
//   B  
// ABCDE
//   E  
//   F  
public class pluspattern {
    public static void main(String[] args) {
        // size of plus, use odd number
        int size = 5;
        int alphaH = 65; // alphabet horizontal
        int alphaV = 65; // alphabet vertical
    
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
           
            if (i == size / 2) {                 // print only stars in middle row
              System.out.print((char)(alphaH+j));
            }
           
            else {                   // other than middle row, print alphabets only at index size/2
              if (j == size / 2) {
                System.out.print((char)(alphaV+i));
              } 
              else {
                System.out.print(" ");
              }
            }
          }

          if (i == size / 2) {
            alphaV++;
          }
          System.out.println();
        }
      }
}
