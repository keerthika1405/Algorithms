// ABCDE
// FGHIJ
// KLMNO
// PQRST
// UVWXY

public class alphabetpattern {
    public static void main(String[]args){
      int  size = 5;
      int  count = 0;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print((char)(65+count));
          count++;
        }
        System.out.println();
      }
}
}
