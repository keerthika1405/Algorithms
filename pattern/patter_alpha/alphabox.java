
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE
public class alphabox {
    public static void main(String[]args){
        int  size = 5;
        int  count = 0;
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            System.out.print((char)(65+j));
            count++;
          }
          System.out.println();
        }
  }
}
