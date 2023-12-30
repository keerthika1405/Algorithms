public class powerofnumloop {
        public static void main (String[]args){
            int b=2;
            int p=6;
            System.out.println("final out "+power(b,p));
        }
        public static int power (int b ,int p){
           int result=1;
           while(p>0){
            result *=b;
            p--;
             System.out.println(result);
           }
           return result;
        }
    }
// 2
// 4
// 8
// 16
// 32
// 64
// final out 64
