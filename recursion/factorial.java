public class factorial{
    public static void main (String[]args){
        int f=3;
        System.out.print(fact(f));
        }
        public static int fact (int f){
            if(f==0){
                return 1;
            }
            int factminusone=fact(f-1);
            return f*factminusone;
}
}

// First Call (f = 3):
// The function is called with f = 3.
// Since f is not equal to 0, the function proceeds to the next line.
// It calls itself with factminusone = fact(2).

// Second Call (f = 2):
// The function is called again with f = 2.
// As f is not equal to 0, the function proceeds to the next line.
// It calls itself with factminusone = fact(1).

// Third Call (f = 1):
// The function is called with f = 1.
// Since f is not equal to 0, the function proceeds to the next line.
// It calls itself with factminusone = fact(0).

// Fourth Call (f = 0):
// The function is called with f = 0.
// This time, the base case is satisfied (f == 0), so the function returns 1.

// Back to Third Call:
// The third call returns with factminusone = 1.
// The third call then calculates and returns f * factminusone = 1 * 1 = 1.

// Back to Second Call:
// The second call returns with factminusone = 1.
// The second call then calculates and returns f * factminusone = 2 * 1 = 2.

// Back to First Call:
// The first call returns with factminusone = 2.
// The first call then calculates and returns f * factminusone = 3 * 2 = 6.