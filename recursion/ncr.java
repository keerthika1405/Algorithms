/*To calculate combinations, we will use the formula nCr = n! / r! * (n - r)!, 
where n represents the total number of items, 
and r represents the number of items being chosen at a time. */


//matrix 4x2 will give 6 combination

public class ncr {
      public static void main(String[] args)
       {
         int n =4 , r = 2;
         System.out.println(comb(n, r));
    }
    public static int comb(int n, int r){
        if(n<r){
            return 0;
          }
          if(r == 0){
              return 1;
          }
          if(r == 1){
              return n;
          }
          if(n == 1){
              return 1;
          }
          return comb(n-1,r-1)+comb(n-1,r);
        //   return comb(n, r - 1) * (n - r + 1) / r;
        //   return comb(n-1,r-1)+comb(n-1,r);//prefered
       }
      
     
}

// eg:
// (4x2)
// abcd=>
// you can give 2 pairs of  6 different(non repeate possible combination)  in 4 letter 
// ab
// ac
// ad
// bc
// bd
// cd