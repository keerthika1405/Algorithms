public class fibonnacci {
    public static void main (String[]args){
         int len_fibo=10;
         System.out.println("fibonnaci series of "+len_fibo+" number is :");

         for(int i=0;i<len_fibo;i++){
              System.out.println(fibrecursion(i)+" ");
         }
}

public static int fibrecursion(int count){

    if(count==0){
        return 0;
    }
    if(count==1||count==2){
        return 1;
    }
    return fibrecursion(count-1)+fibrecursion(count-2);
}
}


// Iteration with i = 4:

// The program enters the loop with i set to 4.
// It calls fibRecursion(4).


// fibRecursion(4):
// Prints "count 4" (due to the debugging line).
// Because count is not 0, 1, or 2, it returns fibRecursion(3) + fibRecursion(2).

// fibRecursion(3):
// Prints "count 3".
// Calls fibRecursion(2) + fibRecursion(1).

// fibRecursion(2):
// Prints "count 2".
// Calls fibRecursion(1) + fibRecursion(0).

// fibRecursion(1):
// Prints "count 1".
// Returns 1.

// fibRecursion(0):
// Prints "count 0".
// Returns 0.

// Back to fibRecursion(2):
// Now has the results for fibRecursion(1) (which is 1) and fibRecursion(0) (which is 0).
// Returns 1 + 0 = 1.

// Back to fibRecursion(3):
// Now has the results for fibRecursion(2) (which is 1) and fibRecursion(1) (which is 1).
// Returns 1 + 1 = 2.

// Back to fibRecursion(4):
// Now has the results for fibRecursion(3) (which is 2) and fibRecursion(2) (which is 1).
// Returns 2 + 1 = 3.

