public class printincrease {
    public static void main (String[]args){
        printvalue(6);
   }
 public static void printvalue (int value){
    if(value==0){
        return ;
    }
    printvalue(value-1);
    System.out.println(value);
}
}
//space complexity is O(n)
//time complexity id O(n)