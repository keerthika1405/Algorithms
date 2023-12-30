public class sumofnum{
    public static void main (String[]args){
      int n=5;
       System.out.println(sumofnumber(n));
    }
    public static int sumofnumber (int n){
        if(n==0){ 
            return n;
        }
        return n+sumofnumber(n-1);

     }
}
//space complexity is O(n)
//time complexity id O(n)