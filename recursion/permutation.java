public class permutation {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations: " + permutation(input));
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
        
        else {
            return n * factorial(n - 1);
        }
    }

    static int permutation(String str) {
        int length = str.length();
        return factorial(length);
    }
}
// Permutations: 6


//==========================================================//

// public  class permutation {
//     public static void main(String[] args) {
//         String s = "abc";
//         printPermutation(s, "");
//     }

//     static void printPermutation(String str, String ans) {
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
           
//             char ch = str.charAt(i);
            
//             String ros = str.substring(0, i) + str.substring(i + 1);
           
//             printPermutation(ros, ans + ch);
//         }
//     }
// }



// abc
// acb
// bac
// bca
// cab
// cba


//==========================================================//



// public class permutation {
 
//         public static void main(String[] args) {
//             int n = 5;
//             int k = 3;
    
//             System.out.println("Permutation (n P k): " + permutation(n, k));
//         }
    
//         static int permutation(int n, int k) {
//             if (k == 0) {
//                 return 1;
//             } else {
//                 return n * permutation(n - 1, k - 1);
//             }
//         }
//     }
    
// Permutation (n P k): 60

