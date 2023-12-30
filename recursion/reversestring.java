public class reversestring {
  

        public static void main(String[] args) {
            String inputString = "program";
            
            String reversedString = reverseString(inputString);
            
            System.out.println("Reversed String: " + reversedString);
        }
        static String reverseString(String str) {
            if (str == null || str.length() <= 1) { // Base case: if the string is empty or has only one character
                return str;
            }
System.out.println(str.substring(1)+"  "+str.charAt(0));
            return reverseString(str.substring(1)) + str.charAt(0);
        }
}

// Recursive call

// rogram  p
// ogram  r
// gram  o
// ram  g
// am  r
// m  a
// (Base case reached)


// Backtracking
// ma+r      mar
// mar+g     marg
// marg+o    margo
// margo+r   margor
// margor+p  margorp




