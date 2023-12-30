public class palindrome {
        public static void main(String[] args) {
            String testString1 = "level";
            String testString2 = "hello";
    
            System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
            System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
        }
       
        static boolean isPalindrome(String str) {
        
            if (str == null || str.length() <= 1) {
                return true;
            }
    
            if (str.charAt(0) != str.charAt(str.length() - 1)) {   // Check if the first and last characters are equal
                return false;
            }
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
    

    // level
    //  eve
    //   v

// First Call (inputString = "level"):
// isPalindrome("level") checks if the first and last characters ("l" and "l") are equal and makes a recursive call with the substring "eve".

// Second Call (inputString = "eve"):
// isPalindrome("eve") checks if the first and last characters ("e" and "e") are equal and makes a recursive call with the substring "v".

// Third Call (inputString = "v"):
// isPalindrome("v") is a base case where the string has only one character, and it returns true.




//========================================//




// public class palindrome {
//     public static void main(String[] args) {
//         String str = "madam"; 
//         String reverseStr = "";
        
//         int Len = str.length();

//         for (int i = (Len - 1); i >=0; --i) {
//           reverseStr = reverseStr + str.charAt(i);
//           System.out.println(reverseStr);
//         }

//         if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//           System.out.println(str + " is a Palindrome String.");
//         }
//         else {
//           System.out.println(str + " is not a Palindrome String.");
//         }
//       }  
// }
// m
// ma
// mad
// mada
// madam
// madam is a Palindrome String.